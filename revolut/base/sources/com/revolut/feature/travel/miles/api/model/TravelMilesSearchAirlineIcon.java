package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAirlineIcon;", "Landroid/os/Parcelable;", "<init>", "()V", "Remote", "Local", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAirlineIcon$Local;", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAirlineIcon$Remote;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesSearchAirlineIcon implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAirlineIcon$Local;", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAirlineIcon;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local extends TravelMilesSearchAirlineIcon {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94123a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f94123a = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Local) && Intrinsics.f(this.f94123a, ((Local) obj2).f94123a);
        }

        public final int hashCode() {
            return this.f94123a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94123a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAirlineIcon$Remote;", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchAirlineIcon;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remote extends TravelMilesSearchAirlineIcon {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94124a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remote[i];
            }
        }

        public Remote(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f94124a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Remote) && Intrinsics.f(this.f94124a, ((Remote) obj2).f94124a);
        }

        public final int hashCode() {
            return this.f94124a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94124a);
        }
    }

    private TravelMilesSearchAirlineIcon() {
    }
}
