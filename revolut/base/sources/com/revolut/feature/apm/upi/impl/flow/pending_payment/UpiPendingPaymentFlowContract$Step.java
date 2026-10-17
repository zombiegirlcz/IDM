package com.revolut.feature.apm.upi.impl.flow.pending_payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ConfirmationScreen", "SubscriptionConfirmationScreen", "ConfirmedScreen", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step$ConfirmationScreen;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step$ConfirmedScreen;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step$SubscriptionConfirmationScreen;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UpiPendingPaymentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step$ConfirmationScreen;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationScreen extends UpiPendingPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmationScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConfirmationScreenContract$InputData f62994a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmationScreen(ConfirmationScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationScreen[i];
            }
        }

        public ConfirmationScreen(ConfirmationScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f62994a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmationScreen) && Intrinsics.f(this.f62994a, ((ConfirmationScreen) obj2).f62994a);
        }

        public final int hashCode() {
            return this.f62994a.f63013a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62994a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step$ConfirmedScreen;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmedScreen extends UpiPendingPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmedScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62995a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmedScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmedScreen[i];
            }
        }

        public ConfirmedScreen(String merchantName) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f62995a = merchantName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmedScreen) && Intrinsics.f(this.f62995a, ((ConfirmedScreen) obj2).f62995a);
        }

        public final int hashCode() {
            return this.f62995a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62995a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step$SubscriptionConfirmationScreen;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionConfirmationScreen extends UpiPendingPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SubscriptionConfirmationScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationPendingAction f62996a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionConfirmationScreen((ApmPaymentAuthorisationPendingAction) parcel.readParcelable(SubscriptionConfirmationScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionConfirmationScreen[i];
            }
        }

        public SubscriptionConfirmationScreen(ApmPaymentAuthorisationPendingAction paymentAuthorisationPendingAction) {
            Intrinsics.checkNotNullParameter(paymentAuthorisationPendingAction, "paymentAuthorisationPendingAction");
            this.f62996a = paymentAuthorisationPendingAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SubscriptionConfirmationScreen) && Intrinsics.f(this.f62996a, ((SubscriptionConfirmationScreen) obj2).f62996a);
        }

        public final int hashCode() {
            return this.f62996a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62996a, i);
        }
    }

    private UpiPendingPaymentFlowContract$Step() {
    }
}
