package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ActivationLocal", "DenyConfirmation", "TermAndConditionsDetails", "Workflow", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$ActivationLocal;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$DenyConfirmation;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$TermAndConditionsDetails;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountActivationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$ActivationLocal;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActivationLocal implements AccountActivationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActivationLocal f76637a = new ActivationLocal();

        @NotNull
        public static final Parcelable.Creator<ActivationLocal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActivationLocal.f76637a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivationLocal[i];
            }
        }

        private ActivationLocal() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$DenyConfirmation;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DenyConfirmation implements AccountActivationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DenyConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f76638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f76639b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DenyConfirmation((Clause) parcel.readParcelable(DenyConfirmation.class.getClassLoader()), (Clause) parcel.readParcelable(DenyConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DenyConfirmation[i];
            }
        }

        public DenyConfirmation(Clause message, Clause actionLabel) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            this.f76638a = message;
            this.f76639b = actionLabel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DenyConfirmation)) {
                return false;
            }
            DenyConfirmation denyConfirmation = (DenyConfirmation) obj2;
            return Intrinsics.f(this.f76638a, denyConfirmation.f76638a) && Intrinsics.f(this.f76639b, denyConfirmation.f76639b);
        }

        public final int hashCode() {
            return this.f76639b.hashCode() + (this.f76638a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76638a, i);
            dest.writeParcelable(this.f76639b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$TermAndConditionsDetails;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TermAndConditionsDetails implements AccountActivationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermAndConditionsDetails f76640a = new TermAndConditionsDetails();

        @NotNull
        public static final Parcelable.Creator<TermAndConditionsDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TermAndConditionsDetails.f76640a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermAndConditionsDetails[i];
            }
        }

        private TermAndConditionsDetails() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step;", "Activation", "PostActivation", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow$Activation;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow$PostActivation;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Workflow extends AccountActivationFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow$Activation;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Activation implements Workflow {

            @NotNull
            public static final Parcelable.Creator<Activation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f76641a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Activation(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Activation[i];
                }
            }

            public Activation(String workflowId) {
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                this.f76641a = workflowId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Activation) && Intrinsics.f(this.f76641a, ((Activation) obj2).f76641a);
            }

            @Override // com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step.Workflow
            /* JADX INFO: renamed from: g3, reason: from getter */
            public final String getF76642a() {
                return this.f76641a;
            }

            public final int hashCode() {
                return this.f76641a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f76641a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow$PostActivation;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step$Workflow;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PostActivation implements Workflow {

            @NotNull
            public static final Parcelable.Creator<PostActivation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f76642a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PostActivation(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PostActivation[i];
                }
            }

            public PostActivation(String workflowId) {
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                this.f76642a = workflowId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PostActivation) && Intrinsics.f(this.f76642a, ((PostActivation) obj2).f76642a);
            }

            @Override // com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step.Workflow
            /* JADX INFO: renamed from: g3, reason: from getter */
            public final String getF76642a() {
                return this.f76642a;
            }

            public final int hashCode() {
                return this.f76642a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f76642a);
            }
        }

        /* JADX INFO: renamed from: g3 */
        String getF76642a();
    }
}
