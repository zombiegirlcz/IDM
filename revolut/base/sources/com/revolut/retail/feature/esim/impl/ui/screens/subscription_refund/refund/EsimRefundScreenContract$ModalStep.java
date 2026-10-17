package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundIneligibilityDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "HowRefundsCalculated", "RefundPending", "NonEligibleForRefund", "RefundSummary", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$HowRefundsCalculated;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$NonEligibleForRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$RefundPending;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$RefundSummary;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimRefundScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$HowRefundsCalculated;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HowRefundsCalculated implements EsimRefundScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HowRefundsCalculated f101446a = new HowRefundsCalculated();

        @NotNull
        public static final Parcelable.Creator<HowRefundsCalculated> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HowRefundsCalculated.f101446a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HowRefundsCalculated[i];
            }
        }

        private HowRefundsCalculated() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$NonEligibleForRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonEligibleForRefund implements EsimRefundScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NonEligibleForRefund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionRefundIneligibilityDetails f101447a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NonEligibleForRefund((EsimSubscriptionRefundIneligibilityDetails) parcel.readParcelable(NonEligibleForRefund.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NonEligibleForRefund[i];
            }
        }

        public NonEligibleForRefund(EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails) {
            this.f101447a = esimSubscriptionRefundIneligibilityDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NonEligibleForRefund) && Intrinsics.f(this.f101447a, ((NonEligibleForRefund) obj2).f101447a);
        }

        public final int hashCode() {
            EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails = this.f101447a;
            if (esimSubscriptionRefundIneligibilityDetails == null) {
                return 0;
            }
            return esimSubscriptionRefundIneligibilityDetails.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101447a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$RefundPending;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RefundPending implements EsimRefundScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RefundPending f101448a = new RefundPending();

        @NotNull
        public static final Parcelable.Creator<RefundPending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RefundPending.f101448a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundPending[i];
            }
        }

        private RefundPending() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep$RefundSummary;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefundSummary implements EsimRefundScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RefundSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimRefundScreenContract$RefundInfo f101449a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RefundSummary(EsimRefundScreenContract$RefundInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundSummary[i];
            }
        }

        public RefundSummary(EsimRefundScreenContract$RefundInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f101449a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefundSummary) && Intrinsics.f(this.f101449a, ((RefundSummary) obj2).f101449a);
        }

        public final int hashCode() {
            return this.f101449a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101449a.writeToParcel(dest, i);
        }
    }
}
