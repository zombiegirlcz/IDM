package com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/subaccount/prompt/flow/FreelancerCreateSubaccountPromptFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Onboarding", "Prompt", "Lcom/revolut/feature/freelancer/impl/ui/subaccount/prompt/flow/FreelancerCreateSubaccountPromptFlowContract$Step$Onboarding;", "Lcom/revolut/feature/freelancer/impl/ui/subaccount/prompt/flow/FreelancerCreateSubaccountPromptFlowContract$Step$Prompt;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerCreateSubaccountPromptFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/subaccount/prompt/flow/FreelancerCreateSubaccountPromptFlowContract$Step$Onboarding;", "Lcom/revolut/feature/freelancer/impl/ui/subaccount/prompt/flow/FreelancerCreateSubaccountPromptFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Onboarding implements FreelancerCreateSubaccountPromptFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Onboarding f74229a = new Onboarding();

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Onboarding.f74229a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        private Onboarding() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/subaccount/prompt/flow/FreelancerCreateSubaccountPromptFlowContract$Step$Prompt;", "Lcom/revolut/feature/freelancer/impl/ui/subaccount/prompt/flow/FreelancerCreateSubaccountPromptFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Prompt implements FreelancerCreateSubaccountPromptFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Prompt f74230a = new Prompt();

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Prompt.f74230a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        private Prompt() {
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
