package com.wshon.northkinghelper.bean;

import android.annotation.SuppressLint;
import android.os.Parcel;

import com.amap.api.maps2d.model.LatLng;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;

/**
 * Created by su on 2018/3/15.
 */

@SuppressLint("ParcelCreator")
public class LocationSearchSuggestions implements SearchSuggestion {

    private String title;
    private String body;
    private LatLng latLng;

    public LocationSearchSuggestions(String title, String body, LatLng latLng) {
        this.title = title;
        this.body = body;
        this.latLng = latLng;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(body);
        dest.writeValue(latLng);
    }
}
