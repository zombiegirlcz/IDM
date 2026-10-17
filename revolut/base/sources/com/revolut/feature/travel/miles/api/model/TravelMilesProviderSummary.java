package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import hfg.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesProviderSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesProviderSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesProviderSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94111c;
    public final t0 d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesProviderSummary(parcel.readString(), parcel.readString(), parcel.readString(), t0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesProviderSummary[i];
        }
    }

    public TravelMilesProviderSummary(String id10, String name, String logoUrl, t0 unit) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f94109a = id10;
        this.f94110b = name;
        this.f94111c = logoUrl;
        this.d = unit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesProviderSummary)) {
            return false;
        }
        TravelMilesProviderSummary travelMilesProviderSummary = (TravelMilesProviderSummary) obj2;
        return Intrinsics.f(this.f94109a, travelMilesProviderSummary.f94109a) && Intrinsics.f(this.f94110b, travelMilesProviderSummary.f94110b) && Intrinsics.f(this.f94111c, travelMilesProviderSummary.f94111c) && this.d == travelMilesProviderSummary.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f94109a.hashCode() * 31, 31, this.f94110b), 31, this.f94111c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94109a);
        dest.writeString(this.f94110b);
        dest.writeString(this.f94111c);
        dest.writeString(this.d.name());
    }
}
