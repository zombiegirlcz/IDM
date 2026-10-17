package com.revolut.feature.apm.upi.impl.flow.pending_payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "PaymentId", "MandateDeeplink", "PendingAction", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData$MandateDeeplink;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData$PaymentId;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData$PendingAction;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UpiPendingPaymentFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData$MandateDeeplink;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MandateDeeplink implements UpiPendingPaymentFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<MandateDeeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62990a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MandateDeeplink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MandateDeeplink[i];
            }
        }

        public MandateDeeplink(String redirectLink) {
            Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
            this.f62990a = redirectLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MandateDeeplink) && Intrinsics.f(this.f62990a, ((MandateDeeplink) obj2).f62990a);
        }

        public final int hashCode() {
            return this.f62990a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62990a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData$PaymentId;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentId implements UpiPendingPaymentFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PaymentId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62992b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentId[i];
            }
        }

        public PaymentId(String pendingPaymentId, String type) {
            Intrinsics.checkNotNullParameter(pendingPaymentId, "pendingPaymentId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f62991a = pendingPaymentId;
            this.f62992b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentId)) {
                return false;
            }
            PaymentId paymentId = (PaymentId) obj2;
            return Intrinsics.f(this.f62991a, paymentId.f62991a) && Intrinsics.f(this.f62992b, paymentId.f62992b);
        }

        public final int hashCode() {
            return this.f62992b.hashCode() + (this.f62991a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62991a);
            dest.writeString(this.f62992b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData$PendingAction;", "Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingAction implements UpiPendingPaymentFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PendingAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationPendingAction f62993a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingAction((ApmPaymentAuthorisationPendingAction) parcel.readParcelable(PendingAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingAction[i];
            }
        }

        public PendingAction(ApmPaymentAuthorisationPendingAction paymentAuthorisationPendingAction) {
            Intrinsics.checkNotNullParameter(paymentAuthorisationPendingAction, "paymentAuthorisationPendingAction");
            this.f62993a = paymentAuthorisationPendingAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingAction) && Intrinsics.f(this.f62993a, ((PendingAction) obj2).f62993a);
        }

        public final int hashCode() {
            return this.f62993a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62993a, i);
        }
    }
}
