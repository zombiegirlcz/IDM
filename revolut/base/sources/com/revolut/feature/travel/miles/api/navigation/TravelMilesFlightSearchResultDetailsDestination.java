package com.revolut.feature.travel.miles.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/navigation/TravelMilesFlightSearchResultDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightSearchResultDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightSearchResultDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94156c;
    public final Set d;
    public final TransitionAnimation e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new TravelMilesFlightSearchResultDetailsDestination(string, string2, string3, linkedHashSet, (TransitionAnimation) parcel.readParcelable(TravelMilesFlightSearchResultDetailsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightSearchResultDetailsDestination[i];
        }
    }

    public TravelMilesFlightSearchResultDetailsDestination(String flightId, String str, String str2, Set selectedCabinClasses, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(selectedCabinClasses, "selectedCabinClasses");
        this.f94154a = flightId;
        this.f94155b = str;
        this.f94156c = str2;
        this.d = selectedCabinClasses;
        this.e = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF94156c() {
        return this.f94156c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF94154a() {
        return this.f94154a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF94155b() {
        return this.f94155b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Set getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightSearchResultDetailsDestination)) {
            return false;
        }
        TravelMilesFlightSearchResultDetailsDestination travelMilesFlightSearchResultDetailsDestination = (TravelMilesFlightSearchResultDetailsDestination) obj2;
        return Intrinsics.f(this.f94154a, travelMilesFlightSearchResultDetailsDestination.f94154a) && Intrinsics.f(this.f94155b, travelMilesFlightSearchResultDetailsDestination.f94155b) && Intrinsics.f(this.f94156c, travelMilesFlightSearchResultDetailsDestination.f94156c) && Intrinsics.f(this.d, travelMilesFlightSearchResultDetailsDestination.d) && Intrinsics.f(this.e, travelMilesFlightSearchResultDetailsDestination.e);
    }

    public final int hashCode() {
        int iHashCode = this.f94154a.hashCode() * 31;
        String str = this.f94155b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94156c;
        int iF = p.a.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        TransitionAnimation transitionAnimation = this.e;
        return iF + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94154a);
        dest.writeString(this.f94155b);
        dest.writeString(this.f94156c);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeParcelable(this.e, i);
    }
}
