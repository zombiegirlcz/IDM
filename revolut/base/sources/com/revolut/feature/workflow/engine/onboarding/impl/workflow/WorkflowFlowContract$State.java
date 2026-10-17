package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import ril.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<WorkflowFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowFlowContract$Workflow f96484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f96485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96486c;
    public final Set d;
    public final Set e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f96487g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WorkflowFlowContract$Workflow workflowFlowContract$WorkflowCreateFromParcel = WorkflowFlowContract$Workflow.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            int iA = 0;
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashSet.add(b.valueOf(parcel.readString()));
            }
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
            int iA2 = 0;
            while (iA2 != i5) {
                iA2 = o.a(parcel, linkedHashSet2, iA2, i);
            }
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i6);
            while (iA != i6) {
                iA = o.a(parcel, linkedHashSet3, iA, i);
            }
            return new WorkflowFlowContract$State(workflowFlowContract$WorkflowCreateFromParcel, linkedHashSet, z, linkedHashSet2, linkedHashSet3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowFlowContract$State[i];
        }
    }

    public WorkflowFlowContract$State(WorkflowFlowContract$Workflow workflow, Set skippedSteps, boolean z, Set finishedNestedWorkflows, Set emptyFormSteps, String str, String languageTag) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(skippedSteps, "skippedSteps");
        Intrinsics.checkNotNullParameter(finishedNestedWorkflows, "finishedNestedWorkflows");
        Intrinsics.checkNotNullParameter(emptyFormSteps, "emptyFormSteps");
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        this.f96484a = workflow;
        this.f96485b = skippedSteps;
        this.f96486c = z;
        this.d = finishedNestedWorkflows;
        this.e = emptyFormSteps;
        this.f = str;
        this.f96487g = languageTag;
    }

    public static WorkflowFlowContract$State a(WorkflowFlowContract$State workflowFlowContract$State, WorkflowFlowContract$Workflow workflowFlowContract$Workflow, Set set, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, String str, int i) {
        if ((i & 1) != 0) {
            workflowFlowContract$Workflow = workflowFlowContract$State.f96484a;
        }
        WorkflowFlowContract$Workflow workflow = workflowFlowContract$Workflow;
        if ((i & 2) != 0) {
            set = workflowFlowContract$State.f96485b;
        }
        Set skippedSteps = set;
        boolean z = (i & 4) != 0 ? workflowFlowContract$State.f96486c : true;
        Set set2 = linkedHashSet;
        if ((i & 8) != 0) {
            set2 = workflowFlowContract$State.d;
        }
        Set finishedNestedWorkflows = set2;
        Set set3 = linkedHashSet2;
        if ((i & 16) != 0) {
            set3 = workflowFlowContract$State.e;
        }
        Set emptyFormSteps = set3;
        String str2 = (i & 32) != 0 ? workflowFlowContract$State.f : null;
        if ((i & 64) != 0) {
            str = workflowFlowContract$State.f96487g;
        }
        String languageTag = str;
        workflowFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(skippedSteps, "skippedSteps");
        Intrinsics.checkNotNullParameter(finishedNestedWorkflows, "finishedNestedWorkflows");
        Intrinsics.checkNotNullParameter(emptyFormSteps, "emptyFormSteps");
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        return new WorkflowFlowContract$State(workflow, skippedSteps, z, finishedNestedWorkflows, emptyFormSteps, str2, languageTag);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowFlowContract$State)) {
            return false;
        }
        WorkflowFlowContract$State workflowFlowContract$State = (WorkflowFlowContract$State) obj2;
        return Intrinsics.f(this.f96484a, workflowFlowContract$State.f96484a) && Intrinsics.f(this.f96485b, workflowFlowContract$State.f96485b) && this.f96486c == workflowFlowContract$State.f96486c && Intrinsics.f(this.d, workflowFlowContract$State.d) && Intrinsics.f(this.e, workflowFlowContract$State.e) && Intrinsics.f(this.f, workflowFlowContract$State.f) && Intrinsics.f(this.f96487g, workflowFlowContract$State.f96487g);
    }

    public final int hashCode() {
        int iF = p.a.f(p.a.f(j6.a.c(p.a.f(this.f96484a.hashCode() * 31, 31, this.f96485b), 31, this.f96486c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.f96487g.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96484a.writeToParcel(dest, i);
        Iterator itV = n.v(this.f96485b, dest);
        while (itV.hasNext()) {
            dest.writeString(((b) itV.next()).name());
        }
        dest.writeInt(this.f96486c ? 1 : 0);
        Iterator itV2 = n.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = n.v(this.e, dest);
        while (itV3.hasNext()) {
            dest.writeString((String) itV3.next());
        }
        dest.writeString(this.f);
        dest.writeString(this.f96487g);
    }
}
