package com.revolut.shared.feature.workflow.engine.api.workflow;

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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/workflow/engine/api/workflow/WorkflowControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WorkflowControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowConfiguration f105814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowFlowType f105815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105816c;
    public final i d;
    public final boolean e;
    public final AnalyticsContext f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WorkflowConfiguration workflowConfiguration = (WorkflowConfiguration) parcel.readParcelable(WorkflowControllerDescriptor$InputData.class.getClassLoader());
            WorkflowFlowType workflowFlowType = (WorkflowFlowType) parcel.readParcelable(WorkflowControllerDescriptor$InputData.class.getClassLoader());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            return new WorkflowControllerDescriptor$InputData((AnalyticsContext) parcel.readParcelable(WorkflowControllerDescriptor$InputData.class.getClassLoader()), workflowConfiguration, workflowFlowType, i.valueOf(parcel.readString()), z3, parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowControllerDescriptor$InputData[i];
        }
    }

    public WorkflowControllerDescriptor$InputData(AnalyticsContext analyticsContext, WorkflowConfiguration configuration, WorkflowFlowType flowType, i backgroundType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f105814a = configuration;
        this.f105815b = flowType;
        this.f105816c = z;
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
        if (!(obj2 instanceof WorkflowControllerDescriptor$InputData)) {
            return false;
        }
        WorkflowControllerDescriptor$InputData workflowControllerDescriptor$InputData = (WorkflowControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f105814a, workflowControllerDescriptor$InputData.f105814a) && Intrinsics.f(this.f105815b, workflowControllerDescriptor$InputData.f105815b) && this.f105816c == workflowControllerDescriptor$InputData.f105816c && this.d == workflowControllerDescriptor$InputData.d && this.e == workflowControllerDescriptor$InputData.e && Intrinsics.f(this.f, workflowControllerDescriptor$InputData.f);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + j6.a.c((this.f105815b.hashCode() + (this.f105814a.hashCode() * 31)) * 31, 31, this.f105816c)) * 31, 31, this.e);
        AnalyticsContext analyticsContext = this.f;
        return iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105814a, i);
        dest.writeParcelable(this.f105815b, i);
        dest.writeInt(this.f105816c ? 1 : 0);
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ WorkflowControllerDescriptor$InputData(WorkflowConfiguration.Workflow workflow, WorkflowFlowType workflowFlowType, i iVar, int i) {
        this(null, workflow, (i & 2) != 0 ? new WorkflowFlowType.Regular(0) : workflowFlowType, (i & 8) != 0 ? i.DEFAULT : iVar, false, false);
    }
}
