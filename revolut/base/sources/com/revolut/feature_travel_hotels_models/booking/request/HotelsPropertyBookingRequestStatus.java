package com.revolut.feature_travel_hotels_models.booking.request;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tei.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/request/HotelsPropertyBookingRequestStatus;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "tei/b", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyBookingRequestStatus implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyBookingRequestStatus> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f97888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HotelsPropertyBookingTokenizedOrder f97889c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyBookingRequestStatus(parcel.readString(), b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : HotelsPropertyBookingTokenizedOrder.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyBookingRequestStatus[i];
        }
    }

    public HotelsPropertyBookingRequestStatus(String id10, b status, HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f97887a = id10;
        this.f97888b = status;
        this.f97889c = hotelsPropertyBookingTokenizedOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyBookingRequestStatus)) {
            return false;
        }
        HotelsPropertyBookingRequestStatus hotelsPropertyBookingRequestStatus = (HotelsPropertyBookingRequestStatus) obj2;
        return Intrinsics.f(this.f97887a, hotelsPropertyBookingRequestStatus.f97887a) && this.f97888b == hotelsPropertyBookingRequestStatus.f97888b && Intrinsics.f(this.f97889c, hotelsPropertyBookingRequestStatus.f97889c);
    }

    public final int hashCode() {
        int iHashCode = (this.f97888b.hashCode() + (this.f97887a.hashCode() * 31)) * 31;
        HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder = this.f97889c;
        return iHashCode + (hotelsPropertyBookingTokenizedOrder == null ? 0 : hotelsPropertyBookingTokenizedOrder.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97887a);
        dest.writeString(this.f97888b.name());
        HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder = this.f97889c;
        if (hotelsPropertyBookingTokenizedOrder == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyBookingTokenizedOrder.writeToParcel(dest, i);
        }
    }
}
