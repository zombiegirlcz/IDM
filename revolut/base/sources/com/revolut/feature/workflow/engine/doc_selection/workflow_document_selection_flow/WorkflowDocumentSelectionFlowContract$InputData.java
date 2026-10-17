package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowDocumentSelectionFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WorkflowDocumentSelectionFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowDocumentSelectionConfiguration f96404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96405c;
    public final boolean d;
    public final AnalyticsProduct e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkflowDocumentSelectionFlowContract$InputData(parcel.readString(), WorkflowDocumentSelectionConfiguration.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(WorkflowDocumentSelectionFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowDocumentSelectionFlowContract$InputData[i];
        }
    }

    public WorkflowDocumentSelectionFlowContract$InputData(String stepId, WorkflowDocumentSelectionConfiguration configuration, String str, boolean z, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f96403a = stepId;
        this.f96404b = configuration;
        this.f96405c = str;
        this.d = z;
        this.e = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowDocumentSelectionFlowContract$InputData)) {
            return false;
        }
        WorkflowDocumentSelectionFlowContract$InputData workflowDocumentSelectionFlowContract$InputData = (WorkflowDocumentSelectionFlowContract$InputData) obj2;
        return Intrinsics.f(this.f96403a, workflowDocumentSelectionFlowContract$InputData.f96403a) && Intrinsics.f(this.f96404b, workflowDocumentSelectionFlowContract$InputData.f96404b) && Intrinsics.f(this.f96405c, workflowDocumentSelectionFlowContract$InputData.f96405c) && this.d == workflowDocumentSelectionFlowContract$InputData.d && Intrinsics.f(this.e, workflowDocumentSelectionFlowContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f96404b.hashCode() + (this.f96403a.hashCode() * 31)) * 31;
        String str = this.f96405c;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        AnalyticsProduct analyticsProduct = this.e;
        return iC + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96403a);
        this.f96404b.writeToParcel(dest, i);
        dest.writeString(this.f96405c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }
}
