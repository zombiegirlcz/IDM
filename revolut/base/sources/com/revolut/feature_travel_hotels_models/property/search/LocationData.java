package com.revolut.feature_travel_hotels_models.property.search;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/search/LocationData;", "Landroid/os/Parcelable;", "Lcom/revolut/feature_travel_hotels_models/property/search/EmptyLocation;", "Lcom/revolut/feature_travel_hotels_models/property/search/LocationMapBoundaries;", "Lcom/revolut/feature_travel_hotels_models/property/search/LocationType;", "Lcom/revolut/feature_travel_hotels_models/property/search/PropertyType;", "Lcom/revolut/feature_travel_hotels_models/property/search/SimplifiedLocationType;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LocationData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98131a;

    public LocationData(String str) {
        this.f98131a = str;
    }

    /* JADX INFO: renamed from: getName, reason: from getter */
    public String getF98131a() {
        return this.f98131a;
    }
}
