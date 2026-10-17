package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowFlowDestination extends InternalDestination<IOData$EmptyInput> {

    @NotNull
    public static final Parcelable.Creator<WorkflowFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowConfiguration f96490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96491c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkflowFlowDestination((WorkflowConfiguration) parcel.readParcelable(WorkflowFlowDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowFlowDestination(WorkflowConfiguration configuration, boolean z) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f96490b = configuration;
        this.f96491c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowFlowDestination)) {
            return false;
        }
        WorkflowFlowDestination workflowFlowDestination = (WorkflowFlowDestination) obj2;
        return Intrinsics.f(this.f96490b, workflowFlowDestination.f96490b) && this.f96491c == workflowFlowDestination.f96491c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96491c) + (this.f96490b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96490b, i);
        dest.writeInt(this.f96491c ? 1 : 0);
    }
}
