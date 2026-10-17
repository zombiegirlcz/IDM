package com.revolut.feature.junior_onboarding.impl.ui.creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_onboarding.api.model.OnboardingWorkflow;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Workflow", "JuniorIsaAccountsPicker", "JuniorPersonalDataCreation", "Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step$JuniorIsaAccountsPicker;", "Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step$JuniorPersonalDataCreation;", "Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step$Workflow;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorCreationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step$JuniorIsaAccountsPicker;", "Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JuniorIsaAccountsPicker implements JuniorCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JuniorIsaAccountsPicker f76988a = new JuniorIsaAccountsPicker();

        @NotNull
        public static final Parcelable.Creator<JuniorIsaAccountsPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JuniorIsaAccountsPicker.f76988a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorIsaAccountsPicker[i];
            }
        }

        private JuniorIsaAccountsPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step$JuniorPersonalDataCreation;", "Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JuniorPersonalDataCreation implements JuniorCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JuniorPersonalDataCreation f76989a = new JuniorPersonalDataCreation();

        @NotNull
        public static final Parcelable.Creator<JuniorPersonalDataCreation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JuniorPersonalDataCreation.f76989a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorPersonalDataCreation[i];
            }
        }

        private JuniorPersonalDataCreation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step$Workflow;", "Lcom/revolut/feature/junior_onboarding/impl/ui/creation/JuniorCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow implements JuniorCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OnboardingWorkflow f76990a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow((OnboardingWorkflow) parcel.readParcelable(Workflow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(OnboardingWorkflow flowDescriptor) {
            Intrinsics.checkNotNullParameter(flowDescriptor, "flowDescriptor");
            this.f76990a = flowDescriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Workflow) && Intrinsics.f(this.f76990a, ((Workflow) obj2).f76990a);
        }

        public final int hashCode() {
            return this.f76990a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76990a, i);
        }
    }
}
