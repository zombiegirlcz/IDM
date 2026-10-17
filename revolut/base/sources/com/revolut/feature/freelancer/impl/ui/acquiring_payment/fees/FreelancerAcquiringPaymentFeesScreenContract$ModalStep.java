package com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ExchangeFees", "ProcessingFees", "PromotionFees", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep$ExchangeFees;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep$ProcessingFees;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep$PromotionFees;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAcquiringPaymentFeesScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep$ExchangeFees;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExchangeFees implements FreelancerAcquiringPaymentFeesScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExchangeFees f73714a = new ExchangeFees();

        @NotNull
        public static final Parcelable.Creator<ExchangeFees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExchangeFees.f73714a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeFees[i];
            }
        }

        private ExchangeFees() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep$ProcessingFees;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProcessingFees implements FreelancerAcquiringPaymentFeesScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProcessingFees f73715a = new ProcessingFees();

        @NotNull
        public static final Parcelable.Creator<ProcessingFees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProcessingFees.f73715a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProcessingFees[i];
            }
        }

        private ProcessingFees() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep$PromotionFees;", "Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/fees/FreelancerAcquiringPaymentFeesScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PromotionFees implements FreelancerAcquiringPaymentFeesScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PromotionFees f73716a = new PromotionFees();

        @NotNull
        public static final Parcelable.Creator<PromotionFees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PromotionFees.f73716a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromotionFees[i];
            }
        }

        private PromotionFees() {
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
}
