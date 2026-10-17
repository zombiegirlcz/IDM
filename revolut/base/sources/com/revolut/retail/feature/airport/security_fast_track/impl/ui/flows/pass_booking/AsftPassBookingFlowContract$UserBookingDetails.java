package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$UserBookingDetails", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftPassBookingFlowContract$UserBookingDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftPassBookingFlowContract$UserBookingDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f98788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsftTimeSlot f98789c;
    public final String d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            AsftTimeSlot asftTimeSlot = (AsftTimeSlot) parcel.readParcelable(AsftPassBookingFlowContract$UserBookingDetails.class.getClassLoader());
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AsftTravellerDetailsScreenContract$DomainState$TravellerDetails.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AsftPassBookingFlowContract$UserBookingDetails(i, localDate, asftTimeSlot, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftPassBookingFlowContract$UserBookingDetails[i];
        }
    }

    public AsftPassBookingFlowContract$UserBookingDetails(int i, LocalDate selectedFlightDate, AsftTimeSlot selectedTimeSlot, String str, List travellersDetails) {
        Intrinsics.checkNotNullParameter(selectedFlightDate, "selectedFlightDate");
        Intrinsics.checkNotNullParameter(selectedTimeSlot, "selectedTimeSlot");
        Intrinsics.checkNotNullParameter(travellersDetails, "travellersDetails");
        this.f98787a = i;
        this.f98788b = selectedFlightDate;
        this.f98789c = selectedTimeSlot;
        this.d = str;
        this.e = travellersDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftPassBookingFlowContract$UserBookingDetails)) {
            return false;
        }
        AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails = (AsftPassBookingFlowContract$UserBookingDetails) obj2;
        return this.f98787a == asftPassBookingFlowContract$UserBookingDetails.f98787a && Intrinsics.f(this.f98788b, asftPassBookingFlowContract$UserBookingDetails.f98788b) && Intrinsics.f(this.f98789c, asftPassBookingFlowContract$UserBookingDetails.f98789c) && Intrinsics.f(this.d, asftPassBookingFlowContract$UserBookingDetails.d) && Intrinsics.f(this.e, asftPassBookingFlowContract$UserBookingDetails.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f98789c.hashCode() + y.a(Integer.hashCode(this.f98787a) * 31, 31, this.f98788b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98787a);
        dest.writeSerializable(this.f98788b);
        dest.writeParcelable(this.f98789c, i);
        dest.writeString(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) itV.next()).writeToParcel(dest, i);
        }
    }
}
