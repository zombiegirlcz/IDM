package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/cancel_booking/AsftCancelBookingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftCancelBookingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AsftCancelBookingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OffsetDateTime f98851c;
    public final AsftPassRefundBreakdown d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftCancelBookingScreenContract$InputData(parcel.readString(), parcel.readString(), (OffsetDateTime) parcel.readSerializable(), (AsftPassRefundBreakdown) parcel.readParcelable(AsftCancelBookingScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftCancelBookingScreenContract$InputData[i];
        }
    }

    public AsftCancelBookingScreenContract$InputData(String passId, String airportDescription, OffsetDateTime cancellationUntilDate, AsftPassRefundBreakdown refundBreakdown) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        Intrinsics.checkNotNullParameter(cancellationUntilDate, "cancellationUntilDate");
        Intrinsics.checkNotNullParameter(refundBreakdown, "refundBreakdown");
        this.f98849a = passId;
        this.f98850b = airportDescription;
        this.f98851c = cancellationUntilDate;
        this.d = refundBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftCancelBookingScreenContract$InputData)) {
            return false;
        }
        AsftCancelBookingScreenContract$InputData asftCancelBookingScreenContract$InputData = (AsftCancelBookingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98849a, asftCancelBookingScreenContract$InputData.f98849a) && Intrinsics.f(this.f98850b, asftCancelBookingScreenContract$InputData.f98850b) && Intrinsics.f(this.f98851c, asftCancelBookingScreenContract$InputData.f98851c) && Intrinsics.f(this.d, asftCancelBookingScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f98851c.hashCode() + p.a.c(this.f98849a.hashCode() * 31, 31, this.f98850b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98849a);
        dest.writeString(this.f98850b);
        dest.writeSerializable(this.f98851c);
        dest.writeParcelable(this.d, i);
    }
}
