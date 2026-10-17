package com.revolut.feature.joint.impl.ui.creation_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Creation", "Prompt", "PendingJointAccount", "Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step$Creation;", "Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step$PendingJointAccount;", "Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step$Prompt;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JointAccountCreationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step$Creation;", "Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Creation implements JointAccountCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Creation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f76528a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Creation((d0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Creation[i];
            }
        }

        public Creation(d0 d0Var) {
            this.f76528a = d0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Creation) && Intrinsics.f(this.f76528a, ((Creation) obj2).f76528a);
        }

        public final int hashCode() {
            d0 d0Var = this.f76528a;
            if (d0Var == null) {
                return 0;
            }
            return d0Var.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76528a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step$PendingJointAccount;", "Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step;", "<init>", "()V", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingJointAccount implements JointAccountCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingJointAccount f76529a = new PendingJointAccount();

        @NotNull
        public static final Parcelable.Creator<PendingJointAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PendingJointAccount.f76529a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingJointAccount[i];
            }
        }

        private PendingJointAccount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step$Prompt;", "Lcom/revolut/feature/joint/impl/ui/creation_flow/JointAccountCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt implements JointAccountCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f76530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f76531b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((Clause) parcel.readParcelable(Prompt.class.getClassLoader()), (Clause) parcel.readParcelable(Prompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(Clause title, Clause description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f76530a = title;
            this.f76531b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) obj2;
            return Intrinsics.f(this.f76530a, prompt.f76530a) && Intrinsics.f(this.f76531b, prompt.f76531b);
        }

        public final int hashCode() {
            return this.f76531b.hashCode() + (this.f76530a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76530a, i);
            dest.writeParcelable(this.f76531b, i);
        }
    }
}
