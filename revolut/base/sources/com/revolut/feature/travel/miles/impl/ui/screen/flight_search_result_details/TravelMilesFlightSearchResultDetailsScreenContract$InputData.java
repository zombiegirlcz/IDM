package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightSearchResultDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightSearchResultDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94296c;
    public final Set d;

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
            return new TravelMilesFlightSearchResultDetailsScreenContract$InputData(string, string2, linkedHashSet, string3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightSearchResultDetailsScreenContract$InputData[i];
        }
    }

    public TravelMilesFlightSearchResultDetailsScreenContract$InputData(String flightId, String str, Set selectedCabinClasses, String str2) {
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(selectedCabinClasses, "selectedCabinClasses");
        this.f94294a = flightId;
        this.f94295b = str;
        this.f94296c = str2;
        this.d = selectedCabinClasses;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightSearchResultDetailsScreenContract$InputData)) {
            return false;
        }
        TravelMilesFlightSearchResultDetailsScreenContract$InputData travelMilesFlightSearchResultDetailsScreenContract$InputData = (TravelMilesFlightSearchResultDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94294a, travelMilesFlightSearchResultDetailsScreenContract$InputData.f94294a) && Intrinsics.f(this.f94295b, travelMilesFlightSearchResultDetailsScreenContract$InputData.f94295b) && Intrinsics.f(this.f94296c, travelMilesFlightSearchResultDetailsScreenContract$InputData.f94296c) && Intrinsics.f(this.d, travelMilesFlightSearchResultDetailsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f94294a.hashCode() * 31;
        String str = this.f94295b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94296c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94294a);
        dest.writeString(this.f94295b);
        dest.writeString(this.f94296c);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
