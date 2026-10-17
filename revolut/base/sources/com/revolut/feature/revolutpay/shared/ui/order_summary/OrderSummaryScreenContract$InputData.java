package com.revolut.feature.revolutpay.shared.ui.order_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/shared/ui/order_summary/OrderSummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderSummaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderSummaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitBillPaymentParams f84717b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderSummaryScreenContract$InputData(parcel.readString(), (SplitBillPaymentParams) parcel.readParcelable(OrderSummaryScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderSummaryScreenContract$InputData[i];
        }
    }

    public OrderSummaryScreenContract$InputData(String orderToken, SplitBillPaymentParams splitBillPaymentParams) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        this.f84716a = orderToken;
        this.f84717b = splitBillPaymentParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderSummaryScreenContract$InputData)) {
            return false;
        }
        OrderSummaryScreenContract$InputData orderSummaryScreenContract$InputData = (OrderSummaryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f84716a, orderSummaryScreenContract$InputData.f84716a) && Intrinsics.f(this.f84717b, orderSummaryScreenContract$InputData.f84717b);
    }

    public final int hashCode() {
        int iHashCode = this.f84716a.hashCode() * 31;
        SplitBillPaymentParams splitBillPaymentParams = this.f84717b;
        return iHashCode + (splitBillPaymentParams == null ? 0 : splitBillPaymentParams.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84716a);
        dest.writeParcelable(this.f84717b, i);
    }
}
