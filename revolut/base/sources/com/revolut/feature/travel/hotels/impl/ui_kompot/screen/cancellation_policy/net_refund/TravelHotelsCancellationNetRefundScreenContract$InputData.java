package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ubg.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/net_refund/TravelHotelsCancellationNetRefundScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsCancellationNetRefundScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsCancellationNetRefundScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationRefund f93890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93891b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsCancellationNetRefundScreenContract$InputData((CancellationRefund) parcel.readParcelable(TravelHotelsCancellationNetRefundScreenContract$InputData.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsCancellationNetRefundScreenContract$InputData[i];
        }
    }

    public TravelHotelsCancellationNetRefundScreenContract$InputData(CancellationRefund cancellationRefund, d type) {
        Intrinsics.checkNotNullParameter(cancellationRefund, "cancellationRefund");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f93890a = cancellationRefund;
        this.f93891b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsCancellationNetRefundScreenContract$InputData)) {
            return false;
        }
        TravelHotelsCancellationNetRefundScreenContract$InputData travelHotelsCancellationNetRefundScreenContract$InputData = (TravelHotelsCancellationNetRefundScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93890a, travelHotelsCancellationNetRefundScreenContract$InputData.f93890a) && this.f93891b == travelHotelsCancellationNetRefundScreenContract$InputData.f93891b;
    }

    public final int hashCode() {
        return this.f93891b.hashCode() + (this.f93890a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93890a, i);
        dest.writeString(this.f93891b.name());
    }
}
