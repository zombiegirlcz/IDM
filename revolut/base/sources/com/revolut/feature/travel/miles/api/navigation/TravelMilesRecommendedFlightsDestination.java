package com.revolut.feature.travel.miles.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/navigation/TravelMilesRecommendedFlightsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesRecommendedFlightsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelMilesRecommendedFlightsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94159c;
    public final String d;
    public final TransitionAnimation e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesRecommendedFlightsDestination(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TransitionAnimation) parcel.readParcelable(TravelMilesRecommendedFlightsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesRecommendedFlightsDestination[i];
        }
    }

    public TravelMilesRecommendedFlightsDestination(String departureIataCode, String arrivalIataCode, String provider, String str, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
        Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f94157a = departureIataCode;
        this.f94158b = arrivalIataCode;
        this.f94159c = provider;
        this.d = str;
        this.e = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF94158b() {
        return this.f94158b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF94157a() {
        return this.f94157a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF94159c() {
        return this.f94159c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesRecommendedFlightsDestination)) {
            return false;
        }
        TravelMilesRecommendedFlightsDestination travelMilesRecommendedFlightsDestination = (TravelMilesRecommendedFlightsDestination) obj2;
        return Intrinsics.f(this.f94157a, travelMilesRecommendedFlightsDestination.f94157a) && Intrinsics.f(this.f94158b, travelMilesRecommendedFlightsDestination.f94158b) && Intrinsics.f(this.f94159c, travelMilesRecommendedFlightsDestination.f94159c) && Intrinsics.f(this.d, travelMilesRecommendedFlightsDestination.d) && Intrinsics.f(this.e, travelMilesRecommendedFlightsDestination.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f94157a.hashCode() * 31, 31, this.f94158b), 31, this.f94159c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        TransitionAnimation transitionAnimation = this.e;
        return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94157a);
        dest.writeString(this.f94158b);
        dest.writeString(this.f94159c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
