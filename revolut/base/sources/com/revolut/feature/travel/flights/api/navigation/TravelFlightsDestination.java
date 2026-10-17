package com.revolut.feature.travel.flights.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/api/navigation/TravelFlightsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f93208c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsDestination(parcel.readString(), parcel.readString(), (TransitionAnimation) parcel.readParcelable(TravelFlightsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsDestination[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TravelFlightsDestination() {
        String str = null;
        this(str, str, 7);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF93600a() {
        return this.f93208c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsDestination)) {
            return false;
        }
        TravelFlightsDestination travelFlightsDestination = (TravelFlightsDestination) obj2;
        return Intrinsics.f(this.f93206a, travelFlightsDestination.f93206a) && Intrinsics.f(this.f93207b, travelFlightsDestination.f93207b) && Intrinsics.f(this.f93208c, travelFlightsDestination.f93208c);
    }

    public final int hashCode() {
        String str = this.f93206a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93207b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TransitionAnimation transitionAnimation = this.f93208c;
        return iHashCode2 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93206a);
        dest.writeString(this.f93207b);
        dest.writeParcelable(this.f93208c, i);
    }

    public TravelFlightsDestination(String str, String str2, TransitionAnimation transitionAnimation) {
        this.f93206a = str;
        this.f93207b = str2;
        this.f93208c = transitionAnimation;
    }

    public /* synthetic */ TravelFlightsDestination(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (TransitionAnimation) null);
    }
}
