package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "RefundDataPlanSubscription", "CancelMobilePlan", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreenContract$InputData$CancelMobilePlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreenContract$InputData$RefundDataPlanSubscription;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimRefundReasonScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreenContract$InputData$CancelMobilePlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelMobilePlan implements EsimRefundReasonScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CancelMobilePlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101461a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelMobilePlan(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelMobilePlan[i];
            }
        }

        public CancelMobilePlan(String mobilePlanSubscriptionId) {
            Intrinsics.checkNotNullParameter(mobilePlanSubscriptionId, "mobilePlanSubscriptionId");
            this.f101461a = mobilePlanSubscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelMobilePlan) && Intrinsics.f(this.f101461a, ((CancelMobilePlan) obj2).f101461a);
        }

        public final int hashCode() {
            return this.f101461a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101461a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreenContract$InputData$RefundDataPlanSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefundDataPlanSubscription implements EsimRefundReasonScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RefundDataPlanSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimRefundFlowContract$EsimSubscriptionsToRefund f101462a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RefundDataPlanSubscription((EsimRefundFlowContract$EsimSubscriptionsToRefund) parcel.readParcelable(RefundDataPlanSubscription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundDataPlanSubscription[i];
            }
        }

        public RefundDataPlanSubscription(EsimRefundFlowContract$EsimSubscriptionsToRefund subscriptionsToRefund) {
            Intrinsics.checkNotNullParameter(subscriptionsToRefund, "subscriptionsToRefund");
            this.f101462a = subscriptionsToRefund;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefundDataPlanSubscription) && Intrinsics.f(this.f101462a, ((RefundDataPlanSubscription) obj2).f101462a);
        }

        public final int hashCode() {
            return this.f101462a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101462a, i);
        }
    }
}
