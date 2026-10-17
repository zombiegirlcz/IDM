package com.revolut.feature.freelancer.impl.ui.acquiring_payment.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_payment/list/FreelancerAcquiringPaymentListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PaymentFilters", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/list/FreelancerAcquiringPaymentListScreenContract$ModalStep$PaymentFilters;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAcquiringPaymentListScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/list/FreelancerAcquiringPaymentListScreenContract$ModalStep$PaymentFilters;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/list/FreelancerAcquiringPaymentListScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentFilters implements FreelancerAcquiringPaymentListScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PaymentFilters> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AcquiringPaymentFilter f73731a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentFilters((AcquiringPaymentFilter) parcel.readParcelable(PaymentFilters.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentFilters[i];
            }
        }

        public PaymentFilters(AcquiringPaymentFilter acquiringPaymentFilter) {
            this.f73731a = acquiringPaymentFilter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentFilters) && Intrinsics.f(this.f73731a, ((PaymentFilters) obj2).f73731a);
        }

        public final int hashCode() {
            AcquiringPaymentFilter acquiringPaymentFilter = this.f73731a;
            if (acquiringPaymentFilter == null) {
                return 0;
            }
            return acquiringPaymentFilter.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73731a, i);
        }
    }
}
