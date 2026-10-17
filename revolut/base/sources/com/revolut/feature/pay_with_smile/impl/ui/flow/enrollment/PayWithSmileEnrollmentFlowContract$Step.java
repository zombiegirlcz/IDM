package com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pay_with_smile.api.domain.model.PaymentConfirmationChallenge;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Processing", "AcceptConsent", "CreatePasscode", "FeatureUnavailable", "FallbackConfirmation", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$AcceptConsent;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$CreatePasscode;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$FallbackConfirmation;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$FeatureUnavailable;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$Processing;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PayWithSmileEnrollmentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$AcceptConsent;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step;", "<init>", "()V", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AcceptConsent extends PayWithSmileEnrollmentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AcceptConsent f78972a = new AcceptConsent();

        @NotNull
        public static final Parcelable.Creator<AcceptConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AcceptConsent.f78972a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptConsent[i];
            }
        }

        private AcceptConsent() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$CreatePasscode;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step;", "<init>", "()V", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreatePasscode extends PayWithSmileEnrollmentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreatePasscode f78973a = new CreatePasscode();

        @NotNull
        public static final Parcelable.Creator<CreatePasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreatePasscode.f78973a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePasscode[i];
            }
        }

        private CreatePasscode() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$FallbackConfirmation;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FallbackConfirmation extends PayWithSmileEnrollmentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FallbackConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentConfirmationChallenge f78974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PayWithSmileEnrollmentFlowContract$FlowContext f78975b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FallbackConfirmation((PaymentConfirmationChallenge) parcel.readParcelable(FallbackConfirmation.class.getClassLoader()), (PayWithSmileEnrollmentFlowContract$FlowContext) parcel.readParcelable(FallbackConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FallbackConfirmation[i];
            }
        }

        public FallbackConfirmation(PaymentConfirmationChallenge challenge, PayWithSmileEnrollmentFlowContract$FlowContext context) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f78974a = challenge;
            this.f78975b = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FallbackConfirmation)) {
                return false;
            }
            FallbackConfirmation fallbackConfirmation = (FallbackConfirmation) obj2;
            return Intrinsics.f(this.f78974a, fallbackConfirmation.f78974a) && Intrinsics.f(this.f78975b, fallbackConfirmation.f78975b);
        }

        public final int hashCode() {
            return this.f78975b.hashCode() + (this.f78974a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78974a, i);
            dest.writeParcelable(this.f78975b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$FeatureUnavailable;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step;", "<init>", "()V", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeatureUnavailable extends PayWithSmileEnrollmentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FeatureUnavailable f78976a = new FeatureUnavailable();

        @NotNull
        public static final Parcelable.Creator<FeatureUnavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeatureUnavailable.f78976a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeatureUnavailable[i];
            }
        }

        private FeatureUnavailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step$Processing;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$Step;", "<init>", "()V", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Processing extends PayWithSmileEnrollmentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Processing f78977a = new Processing();

        @NotNull
        public static final Parcelable.Creator<Processing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Processing.f78977a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Processing[i];
            }
        }

        private Processing() {
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

    private PayWithSmileEnrollmentFlowContract$Step() {
    }
}
