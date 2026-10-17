package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import til.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WorkflowFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowFlowType f96478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowConfiguration f96479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96480c;
    public final i d;
    public final boolean e;
    public final AnalyticsContext f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WorkflowFlowType workflowFlowType = (WorkflowFlowType) parcel.readParcelable(WorkflowFlowContract$InputData.class.getClassLoader());
            WorkflowConfiguration workflowConfiguration = (WorkflowConfiguration) parcel.readParcelable(WorkflowFlowContract$InputData.class.getClassLoader());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            return new WorkflowFlowContract$InputData((AnalyticsContext) parcel.readParcelable(WorkflowFlowContract$InputData.class.getClassLoader()), workflowConfiguration, workflowFlowType, i.valueOf(parcel.readString()), z3, parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowFlowContract$InputData[i];
        }
    }

    public WorkflowFlowContract$InputData(AnalyticsContext analyticsContext, WorkflowConfiguration configuration, WorkflowFlowType flowType, i backgroundType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f96478a = flowType;
        this.f96479b = configuration;
        this.f96480c = z;
        this.d = backgroundType;
        this.e = z3;
        this.f = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowFlowContract$InputData)) {
            return false;
        }
        WorkflowFlowContract$InputData workflowFlowContract$InputData = (WorkflowFlowContract$InputData) obj2;
        return Intrinsics.f(this.f96478a, workflowFlowContract$InputData.f96478a) && Intrinsics.f(this.f96479b, workflowFlowContract$InputData.f96479b) && this.f96480c == workflowFlowContract$InputData.f96480c && this.d == workflowFlowContract$InputData.d && this.e == workflowFlowContract$InputData.e && Intrinsics.f(this.f, workflowFlowContract$InputData.f);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + j6.a.c((this.f96479b.hashCode() + (this.f96478a.hashCode() * 31)) * 31, 31, this.f96480c)) * 31, 31, this.e);
        AnalyticsContext analyticsContext = this.f;
        return iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96478a, i);
        dest.writeParcelable(this.f96479b, i);
        dest.writeInt(this.f96480c ? 1 : 0);
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ WorkflowFlowContract$InputData(WorkflowFlowType workflowFlowType, WorkflowConfiguration workflowConfiguration, boolean z, i iVar, int i) {
        this(null, workflowConfiguration, (i & 1) != 0 ? new WorkflowFlowType.Regular(0) : workflowFlowType, (i & 8) != 0 ? i.DEFAULT : iVar, z, false);
    }
}
