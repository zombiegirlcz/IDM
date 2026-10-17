package com.revolut.feature.travel.flights.models.domain.location;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/location/LocationSearchResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationSearchResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocationSearchResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93527c;
    public final f d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationSearchResult(parcel.readString(), parcel.readString(), parcel.readString(), f.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocationSearchResult[i];
        }
    }

    public LocationSearchResult(String id10, String name, String code, f type, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f93525a = id10;
        this.f93526b = name;
        this.f93527c = code;
        this.d = type;
        this.e = title;
        this.f = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocationSearchResult)) {
            return false;
        }
        LocationSearchResult locationSearchResult = (LocationSearchResult) obj2;
        return Intrinsics.f(this.f93525a, locationSearchResult.f93525a) && Intrinsics.f(this.f93526b, locationSearchResult.f93526b) && Intrinsics.f(this.f93527c, locationSearchResult.f93527c) && this.d == locationSearchResult.d && Intrinsics.f(this.e, locationSearchResult.e) && Intrinsics.f(this.f, locationSearchResult.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c((this.d.hashCode() + p.a.c(p.a.c(this.f93525a.hashCode() * 31, 31, this.f93526b), 31, this.f93527c)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93525a);
        dest.writeString(this.f93526b);
        dest.writeString(this.f93527c);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
