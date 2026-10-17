package com.revolut.feature.joint.impl.ui.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Prompt", "InviteFlow", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step$InviteFlow;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step$Prompt;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JointDeeplinkFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step$Prompt;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt extends JointDeeplinkFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JointDeeplinkFlowContract$PromptConfig f76545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f76546b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((JointDeeplinkFlowContract$PromptConfig) parcel.readParcelable(Prompt.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(JointDeeplinkFlowContract$PromptConfig config, boolean z) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f76545a = config;
            this.f76546b = z;
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
            return Intrinsics.f(this.f76545a, prompt.f76545a) && this.f76546b == prompt.f76546b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76546b) + (this.f76545a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76545a, i);
            dest.writeInt(this.f76546b ? 1 : 0);
        }
    }

    private JointDeeplinkFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step$InviteFlow;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteFlow extends JointDeeplinkFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InviteFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f76544a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteFlow((d0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteFlow[i];
            }
        }

        public InviteFlow(d0 d0Var) {
            this.f76544a = d0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InviteFlow) && Intrinsics.f(this.f76544a, ((InviteFlow) obj2).f76544a);
        }

        public final int hashCode() {
            d0 d0Var = this.f76544a;
            if (d0Var == null) {
                return 0;
            }
            return d0Var.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76544a);
        }

        public InviteFlow() {
            this(null);
        }
    }
}
