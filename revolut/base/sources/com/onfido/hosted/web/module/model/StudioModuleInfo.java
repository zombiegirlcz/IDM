package com.onfido.hosted.web.module.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/onfido/hosted/web/module/model/StudioModuleInfo;", "Landroid/os/Parcelable;", "workflowRunId", "", "taskId", "taskDefId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskDefId", "()Ljava/lang/String;", "getTaskId", "getWorkflowRunId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StudioModuleInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StudioModuleInfo> CREATOR = new Creator();

    @NotNull
    private final String taskDefId;

    @NotNull
    private final String taskId;

    @NotNull
    private final String workflowRunId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StudioModuleInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StudioModuleInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StudioModuleInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StudioModuleInfo[] newArray(int i) {
            return new StudioModuleInfo[i];
        }
    }

    public StudioModuleInfo(@NotNull String workflowRunId, @NotNull String taskId, @NotNull String taskDefId) {
        Intrinsics.checkNotNullParameter(workflowRunId, "workflowRunId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        this.workflowRunId = workflowRunId;
        this.taskId = taskId;
        this.taskDefId = taskDefId;
    }

    public static /* synthetic */ StudioModuleInfo copy$default(StudioModuleInfo studioModuleInfo, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = studioModuleInfo.workflowRunId;
        }
        if ((i & 2) != 0) {
            str2 = studioModuleInfo.taskId;
        }
        if ((i & 4) != 0) {
            str3 = studioModuleInfo.taskDefId;
        }
        return studioModuleInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWorkflowRunId() {
        return this.workflowRunId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTaskDefId() {
        return this.taskDefId;
    }

    @NotNull
    public final StudioModuleInfo copy(@NotNull String workflowRunId, @NotNull String taskId, @NotNull String taskDefId) {
        Intrinsics.checkNotNullParameter(workflowRunId, "workflowRunId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        return new StudioModuleInfo(workflowRunId, taskId, taskDefId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StudioModuleInfo)) {
            return false;
        }
        StudioModuleInfo studioModuleInfo = (StudioModuleInfo) other;
        return Intrinsics.f(this.workflowRunId, studioModuleInfo.workflowRunId) && Intrinsics.f(this.taskId, studioModuleInfo.taskId) && Intrinsics.f(this.taskDefId, studioModuleInfo.taskDefId);
    }

    @NotNull
    public final String getTaskDefId() {
        return this.taskDefId;
    }

    @NotNull
    public final String getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final String getWorkflowRunId() {
        return this.workflowRunId;
    }

    public int hashCode() {
        return this.taskDefId.hashCode() + a.c(this.workflowRunId.hashCode() * 31, 31, this.taskId);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("StudioModuleInfo(workflowRunId=");
        sb6.append(this.workflowRunId);
        sb6.append(", taskId=");
        sb6.append(this.taskId);
        sb6.append(", taskDefId=");
        return j6.a.u(sb6, this.taskDefId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.workflowRunId);
        parcel.writeString(this.taskId);
        parcel.writeString(this.taskDefId);
    }
}
