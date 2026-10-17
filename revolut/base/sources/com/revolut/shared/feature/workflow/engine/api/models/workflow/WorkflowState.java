package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowState;", "Landroid/os/Parcelable;", "", "CREATED", "COMPLETED", "NOT_DEFINED", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowState implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WorkflowState[] $VALUES;
    public static final WorkflowState COMPLETED;
    public static final WorkflowState CREATED;

    @NotNull
    public static final Parcelable.Creator<WorkflowState> CREATOR;
    public static final WorkflowState NOT_DEFINED;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return WorkflowState.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowState[i];
        }
    }

    static {
        WorkflowState workflowState = new WorkflowState("CREATED", 0);
        CREATED = workflowState;
        WorkflowState workflowState2 = new WorkflowState("COMPLETED", 1);
        COMPLETED = workflowState2;
        WorkflowState workflowState3 = new WorkflowState("NOT_DEFINED", 2);
        NOT_DEFINED = workflowState3;
        WorkflowState[] workflowStateArr = {workflowState, workflowState2, workflowState3};
        $VALUES = workflowStateArr;
        $ENTRIES = s.n(workflowStateArr);
        CREATOR = new a();
    }

    public static WorkflowState valueOf(String str) {
        return (WorkflowState) Enum.valueOf(WorkflowState.class, str);
    }

    public static WorkflowState[] values() {
        return (WorkflowState[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
