package com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/order_tracking/impl/ui/bottom_sheet/delete_tracking/DeleteTrackingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeleteTrackingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeleteTrackingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84612b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeleteTrackingScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeleteTrackingScreenContract$InputData[i];
        }
    }

    public DeleteTrackingScreenContract$InputData(String orderId, String trackingId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.f84611a = orderId;
        this.f84612b = trackingId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeleteTrackingScreenContract$InputData)) {
            return false;
        }
        DeleteTrackingScreenContract$InputData deleteTrackingScreenContract$InputData = (DeleteTrackingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f84611a, deleteTrackingScreenContract$InputData.f84611a) && Intrinsics.f(this.f84612b, deleteTrackingScreenContract$InputData.f84612b);
    }

    public final int hashCode() {
        return this.f84612b.hashCode() + (this.f84611a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84611a);
        dest.writeString(this.f84612b);
    }
}
