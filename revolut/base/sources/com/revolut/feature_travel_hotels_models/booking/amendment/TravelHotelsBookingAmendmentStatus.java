package com.revolut.feature_travel_hotels_models.booking.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingTokenizedOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qei.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentStatus;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "qei/m", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsBookingAmendmentStatus implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsBookingAmendmentStatus> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f97875c;
    public final HotelsPropertyBookingTokenizedOrder d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsBookingAmendmentStatus(parcel.readString(), parcel.readString(), m.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : HotelsPropertyBookingTokenizedOrder.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsBookingAmendmentStatus[i];
        }
    }

    public TravelHotelsBookingAmendmentStatus(String id10, String bookingId, m status, HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f97873a = id10;
        this.f97874b = bookingId;
        this.f97875c = status;
        this.d = hotelsPropertyBookingTokenizedOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsBookingAmendmentStatus)) {
            return false;
        }
        TravelHotelsBookingAmendmentStatus travelHotelsBookingAmendmentStatus = (TravelHotelsBookingAmendmentStatus) obj2;
        return Intrinsics.f(this.f97873a, travelHotelsBookingAmendmentStatus.f97873a) && Intrinsics.f(this.f97874b, travelHotelsBookingAmendmentStatus.f97874b) && this.f97875c == travelHotelsBookingAmendmentStatus.f97875c && Intrinsics.f(this.d, travelHotelsBookingAmendmentStatus.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f97875c.hashCode() + p.a.c(this.f97873a.hashCode() * 31, 31, this.f97874b)) * 31;
        HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder = this.d;
        return iHashCode + (hotelsPropertyBookingTokenizedOrder == null ? 0 : hotelsPropertyBookingTokenizedOrder.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97873a);
        dest.writeString(this.f97874b);
        dest.writeString(this.f97875c.name());
        HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder = this.d;
        if (hotelsPropertyBookingTokenizedOrder == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyBookingTokenizedOrder.writeToParcel(dest, i);
        }
    }
}
