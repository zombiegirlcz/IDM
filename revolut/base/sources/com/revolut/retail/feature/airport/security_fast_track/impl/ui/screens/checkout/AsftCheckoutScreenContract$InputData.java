package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/checkout/AsftCheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftCheckoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AsftCheckoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98804c;
    public final LocalDate d;
    public final AsftTimeSlot e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f98805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f98806h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            AsftTimeSlot asftTimeSlot = (AsftTimeSlot) parcel.readParcelable(AsftCheckoutScreenContract$InputData.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AsftTravellerDetailsScreenContract$DomainState$TravellerDetails.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AsftCheckoutScreenContract$InputData(string, string2, i, localDate, asftTimeSlot, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftCheckoutScreenContract$InputData[i];
        }
    }

    public AsftCheckoutScreenContract$InputData(String airportIataCode, String airportTerminalId, int i, LocalDate selectedFlightDate, AsftTimeSlot selectedTimeSlot, String prebookedSlotId, String str, List travellersDetails) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(airportTerminalId, "airportTerminalId");
        Intrinsics.checkNotNullParameter(selectedFlightDate, "selectedFlightDate");
        Intrinsics.checkNotNullParameter(selectedTimeSlot, "selectedTimeSlot");
        Intrinsics.checkNotNullParameter(prebookedSlotId, "prebookedSlotId");
        Intrinsics.checkNotNullParameter(travellersDetails, "travellersDetails");
        this.f98802a = airportIataCode;
        this.f98803b = airportTerminalId;
        this.f98804c = i;
        this.d = selectedFlightDate;
        this.e = selectedTimeSlot;
        this.f = prebookedSlotId;
        this.f98805g = str;
        this.f98806h = travellersDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftCheckoutScreenContract$InputData)) {
            return false;
        }
        AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData = (AsftCheckoutScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98802a, asftCheckoutScreenContract$InputData.f98802a) && Intrinsics.f(this.f98803b, asftCheckoutScreenContract$InputData.f98803b) && this.f98804c == asftCheckoutScreenContract$InputData.f98804c && Intrinsics.f(this.d, asftCheckoutScreenContract$InputData.d) && Intrinsics.f(this.e, asftCheckoutScreenContract$InputData.e) && Intrinsics.f(this.f, asftCheckoutScreenContract$InputData.f) && Intrinsics.f(this.f98805g, asftCheckoutScreenContract$InputData.f98805g) && Intrinsics.f(this.f98806h, asftCheckoutScreenContract$InputData.f98806h);
    }

    public final int hashCode() {
        int iC = p.a.c((this.e.hashCode() + y.a(j6.a.b(this.f98804c, p.a.c(this.f98802a.hashCode() * 31, 31, this.f98803b), 31), 31, this.d)) * 31, 31, this.f);
        String str = this.f98805g;
        return this.f98806h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98802a);
        dest.writeString(this.f98803b);
        dest.writeInt(this.f98804c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f98805g);
        Iterator itV = p.a.v(this.f98806h, dest);
        while (itV.hasNext()) {
            ((AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) itV.next()).writeToParcel(dest, i);
        }
    }
}
