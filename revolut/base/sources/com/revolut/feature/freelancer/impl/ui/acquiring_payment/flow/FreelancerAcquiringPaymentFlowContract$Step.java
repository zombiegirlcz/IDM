package com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_payment/flow/FreelancerAcquiringPaymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PaymentList", "PaymentDetails", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/flow/FreelancerAcquiringPaymentFlowContract$Step$PaymentDetails;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/flow/FreelancerAcquiringPaymentFlowContract$Step$PaymentList;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAcquiringPaymentFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/flow/FreelancerAcquiringPaymentFlowContract$Step$PaymentDetails;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/flow/FreelancerAcquiringPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentDetails implements FreelancerAcquiringPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73728a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentDetails(((AcquiringPayment$Id) parcel.readParcelable(PaymentDetails.class.getClassLoader())).f73363a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentDetails[i];
            }
        }

        public PaymentDetails(String paymentId) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f73728a = paymentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentDetails) && Intrinsics.f(this.f73728a, ((PaymentDetails) obj2).f73728a);
        }

        public final int hashCode() {
            return this.f73728a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new AcquiringPayment$Id(this.f73728a), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/flow/FreelancerAcquiringPaymentFlowContract$Step$PaymentList;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/flow/FreelancerAcquiringPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentList implements FreelancerAcquiringPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AcquiringPaymentsQuery f73729a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentList((AcquiringPaymentsQuery) parcel.readParcelable(PaymentList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentList[i];
            }
        }

        public PaymentList(AcquiringPaymentsQuery query) {
            Intrinsics.checkNotNullParameter(query, "query");
            this.f73729a = query;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentList) && Intrinsics.f(this.f73729a, ((PaymentList) obj2).f73729a);
        }

        public final int hashCode() {
            return this.f73729a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73729a, i);
        }
    }
}
