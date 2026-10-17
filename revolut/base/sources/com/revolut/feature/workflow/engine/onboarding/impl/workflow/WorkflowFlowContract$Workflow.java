package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$Workflow", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowFlowContract$Workflow implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WorkflowFlowContract$Workflow> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowState f96489b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(WorkflowFlowContract$Workflow.class, parcel, arrayList, iE, 1);
            }
            return new WorkflowFlowContract$Workflow(arrayList, (WorkflowState) parcel.readParcelable(WorkflowFlowContract$Workflow.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowFlowContract$Workflow[i];
        }
    }

    public WorkflowFlowContract$Workflow(List steps, WorkflowState workflowState) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(workflowState, "workflowState");
        this.f96488a = steps;
        this.f96489b = workflowState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowFlowContract$Workflow)) {
            return false;
        }
        WorkflowFlowContract$Workflow workflowFlowContract$Workflow = (WorkflowFlowContract$Workflow) obj2;
        return Intrinsics.f(this.f96488a, workflowFlowContract$Workflow.f96488a) && this.f96489b == workflowFlowContract$Workflow.f96489b;
    }

    public final int hashCode() {
        return this.f96489b.hashCode() + (this.f96488a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f96488a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f96489b, i);
    }
}
