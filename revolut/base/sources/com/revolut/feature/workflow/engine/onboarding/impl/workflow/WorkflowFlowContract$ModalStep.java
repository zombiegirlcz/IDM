package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AlreadyInReview", "WorkflowCompleted", "OneClickFeedback", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep$AlreadyInReview;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep$OneClickFeedback;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep$WorkflowCompleted;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WorkflowFlowContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep$AlreadyInReview;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlreadyInReview implements WorkflowFlowContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AlreadyInReview f96481a = new AlreadyInReview();

        @NotNull
        public static final Parcelable.Creator<AlreadyInReview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AlreadyInReview.f96481a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AlreadyInReview[i];
            }
        }

        private AlreadyInReview() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof AlreadyInReview);
        }

        public final int hashCode() {
            return -1076095340;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep$OneClickFeedback;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneClickFeedback implements WorkflowFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OneClickFeedback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96482a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneClickFeedback(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneClickFeedback[i];
            }
        }

        public OneClickFeedback(String referenceId) {
            Intrinsics.checkNotNullParameter(referenceId, "referenceId");
            this.f96482a = referenceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OneClickFeedback) && Intrinsics.f(this.f96482a, ((OneClickFeedback) obj2).f96482a);
        }

        public final int hashCode() {
            return this.f96482a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96482a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep$WorkflowCompleted;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WorkflowCompleted implements WorkflowFlowContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WorkflowCompleted f96483a = new WorkflowCompleted();

        @NotNull
        public static final Parcelable.Creator<WorkflowCompleted> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WorkflowCompleted.f96483a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WorkflowCompleted[i];
            }
        }

        private WorkflowCompleted() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof WorkflowCompleted);
        }

        public final int hashCode() {
            return -1942730037;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
