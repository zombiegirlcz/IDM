package com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/flow/OnboardingContactSyncFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PermissionStep", "NotifyStep", "Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/flow/OnboardingContactSyncFlowContract$Step$NotifyStep;", "Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/flow/OnboardingContactSyncFlowContract$Step$PermissionStep;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingContactSyncFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/flow/OnboardingContactSyncFlowContract$Step$NotifyStep;", "Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/flow/OnboardingContactSyncFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotifyStep extends OnboardingContactSyncFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NotifyStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f80106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f80108c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotifyStep(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotifyStep[i];
            }
        }

        public NotifyStep(Integer num, boolean z, boolean z3) {
            this.f80106a = num;
            this.f80107b = z;
            this.f80108c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NotifyStep)) {
                return false;
            }
            NotifyStep notifyStep = (NotifyStep) obj2;
            return Intrinsics.f(this.f80106a, notifyStep.f80106a) && this.f80107b == notifyStep.f80107b && this.f80108c == notifyStep.f80108c;
        }

        public final int hashCode() {
            Integer num = this.f80106a;
            return Boolean.hashCode(this.f80108c) + j6.a.c((num == null ? 0 : num.hashCode()) * 31, 31, this.f80107b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f80106a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeInt(this.f80107b ? 1 : 0);
            dest.writeInt(this.f80108c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/flow/OnboardingContactSyncFlowContract$Step$PermissionStep;", "Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/flow/OnboardingContactSyncFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PermissionStep extends OnboardingContactSyncFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PermissionStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f80109a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionStep(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PermissionStep[i];
            }
        }

        public PermissionStep(boolean z) {
            this.f80109a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PermissionStep) && this.f80109a == ((PermissionStep) obj2).f80109a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f80109a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f80109a ? 1 : 0);
        }
    }

    private OnboardingContactSyncFlowContract$Step() {
    }
}
