package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Workflow", "DropOff", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$Step$DropOff;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$Step$Workflow;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingWorkflowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$Step$DropOff;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$Step;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DropOff extends OnboardingWorkflowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DropOff f104241a = new DropOff();

        @NotNull
        public static final Parcelable.Creator<DropOff> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DropOff.f104241a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropOff[i];
            }
        }

        private DropOff() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$Step$Workflow;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$Step;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Workflow extends OnboardingWorkflowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Workflow f104242a = new Workflow();

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Workflow.f104242a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        private Workflow() {
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

    private OnboardingWorkflowContract$Step() {
    }
}
