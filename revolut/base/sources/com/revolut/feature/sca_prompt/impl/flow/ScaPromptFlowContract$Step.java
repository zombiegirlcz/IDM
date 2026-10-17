package com.revolut.feature.sca_prompt.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ScaPrompt", "AreYouSureDialog", "WarningDialog", "LearnMore", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$AreYouSureDialog;", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$LearnMore;", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$ScaPrompt;", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$WarningDialog;", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScaPromptFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$AreYouSureDialog;", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step;", "<init>", "()V", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AreYouSureDialog implements ScaPromptFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AreYouSureDialog f85340a = new AreYouSureDialog();

        @NotNull
        public static final Parcelable.Creator<AreYouSureDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AreYouSureDialog.f85340a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AreYouSureDialog[i];
            }
        }

        private AreYouSureDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$LearnMore;", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step;", "<init>", "()V", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LearnMore implements ScaPromptFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LearnMore f85341a = new LearnMore();

        @NotNull
        public static final Parcelable.Creator<LearnMore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LearnMore.f85341a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMore[i];
            }
        }

        private LearnMore() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$ScaPrompt;", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScaPrompt implements ScaPromptFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ScaPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f85342a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScaPrompt((Clause) parcel.readParcelable(ScaPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScaPrompt[i];
            }
        }

        public ScaPrompt(Clause clause) {
            this.f85342a = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ScaPrompt) && Intrinsics.f(this.f85342a, ((ScaPrompt) obj2).f85342a);
        }

        public final int hashCode() {
            Clause clause = this.f85342a;
            if (clause == null) {
                return 0;
            }
            return clause.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85342a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step$WarningDialog;", "Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlowContract$Step;", "<init>", "()V", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WarningDialog implements ScaPromptFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WarningDialog f85343a = new WarningDialog();

        @NotNull
        public static final Parcelable.Creator<WarningDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WarningDialog.f85343a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WarningDialog[i];
            }
        }

        private WarningDialog() {
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
