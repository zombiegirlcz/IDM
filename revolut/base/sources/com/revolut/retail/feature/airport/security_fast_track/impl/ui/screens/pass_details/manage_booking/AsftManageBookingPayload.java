package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/manage_booking/AsftManageBookingPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftManageBookingPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftManageBookingPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98867c;
    public final OffsetDateTime d;
    public final AsftPassRefundBreakdown e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftManageBookingPayload(parcel.readString(), parcel.readString(), parcel.readString(), (OffsetDateTime) parcel.readSerializable(), (AsftPassRefundBreakdown) parcel.readParcelable(AsftManageBookingPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftManageBookingPayload[i];
        }
    }

    public AsftManageBookingPayload(String termsUrl, String passId, String airportDescription, OffsetDateTime offsetDateTime, AsftPassRefundBreakdown asftPassRefundBreakdown) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        Intrinsics.checkNotNullParameter(passId, "passId");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        this.f98865a = termsUrl;
        this.f98866b = passId;
        this.f98867c = airportDescription;
        this.d = offsetDateTime;
        this.e = asftPassRefundBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftManageBookingPayload)) {
            return false;
        }
        AsftManageBookingPayload asftManageBookingPayload = (AsftManageBookingPayload) obj2;
        return Intrinsics.f(this.f98865a, asftManageBookingPayload.f98865a) && Intrinsics.f(this.f98866b, asftManageBookingPayload.f98866b) && Intrinsics.f(this.f98867c, asftManageBookingPayload.f98867c) && Intrinsics.f(this.d, asftManageBookingPayload.d) && Intrinsics.f(this.e, asftManageBookingPayload.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f98865a.hashCode() * 31, 31, this.f98866b), 31, this.f98867c);
        OffsetDateTime offsetDateTime = this.d;
        int iHashCode = (iC + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        AsftPassRefundBreakdown asftPassRefundBreakdown = this.e;
        return iHashCode + (asftPassRefundBreakdown != null ? asftPassRefundBreakdown.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98865a);
        dest.writeString(this.f98866b);
        dest.writeString(this.f98867c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }
}
