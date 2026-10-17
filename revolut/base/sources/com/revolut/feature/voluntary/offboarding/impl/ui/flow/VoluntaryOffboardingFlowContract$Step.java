package com.revolut.feature.voluntary.offboarding.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Loading", "HeyWaitPromptStep", "RewardsUnavailableStep", "PremiumBenefitsStep", "RemoveObstaclesStep", "ProtectDataStep", "ConfirmDecisionStep", "ApologyStep", "AccountNotClosing", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$AccountNotClosing;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$ApologyStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$ConfirmDecisionStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$HeyWaitPromptStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$Loading;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$PremiumBenefitsStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$ProtectDataStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$RemoveObstaclesStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$RewardsUnavailableStep;", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VoluntaryOffboardingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$AccountNotClosing;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountNotClosing extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountNotClosing f94829a = new AccountNotClosing();

        @NotNull
        public static final Parcelable.Creator<AccountNotClosing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountNotClosing.f94829a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountNotClosing[i];
            }
        }

        private AccountNotClosing() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$ApologyStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApologyStep extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApologyStep f94830a = new ApologyStep();

        @NotNull
        public static final Parcelable.Creator<ApologyStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApologyStep.f94830a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApologyStep[i];
            }
        }

        private ApologyStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$ConfirmDecisionStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmDecisionStep extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmDecisionStep f94831a = new ConfirmDecisionStep();

        @NotNull
        public static final Parcelable.Creator<ConfirmDecisionStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmDecisionStep.f94831a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmDecisionStep[i];
            }
        }

        private ConfirmDecisionStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$HeyWaitPromptStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HeyWaitPromptStep extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HeyWaitPromptStep f94832a = new HeyWaitPromptStep();

        @NotNull
        public static final Parcelable.Creator<HeyWaitPromptStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HeyWaitPromptStep.f94832a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HeyWaitPromptStep[i];
            }
        }

        private HeyWaitPromptStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$Loading;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f94833a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f94833a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$PremiumBenefitsStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PremiumBenefitsStep extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PremiumBenefitsStep f94834a = new PremiumBenefitsStep();

        @NotNull
        public static final Parcelable.Creator<PremiumBenefitsStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PremiumBenefitsStep.f94834a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PremiumBenefitsStep[i];
            }
        }

        private PremiumBenefitsStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$ProtectDataStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProtectDataStep extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProtectDataStep f94835a = new ProtectDataStep();

        @NotNull
        public static final Parcelable.Creator<ProtectDataStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProtectDataStep.f94835a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProtectDataStep[i];
            }
        }

        private ProtectDataStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$RemoveObstaclesStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoveObstaclesStep extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemoveObstaclesStep f94836a = new RemoveObstaclesStep();

        @NotNull
        public static final Parcelable.Creator<RemoveObstaclesStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RemoveObstaclesStep.f94836a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveObstaclesStep[i];
            }
        }

        private RemoveObstaclesStep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step$RewardsUnavailableStep;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RewardsUnavailableStep extends VoluntaryOffboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RewardsUnavailableStep f94837a = new RewardsUnavailableStep();

        @NotNull
        public static final Parcelable.Creator<RewardsUnavailableStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RewardsUnavailableStep.f94837a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsUnavailableStep[i];
            }
        }

        private RewardsUnavailableStep() {
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

    private VoluntaryOffboardingFlowContract$Step() {
    }
}
