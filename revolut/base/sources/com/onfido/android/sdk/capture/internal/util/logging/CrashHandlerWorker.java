package com.onfido.android.sdk.capture.internal.util.logging;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.api.client.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/CrashHandlerWorker;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "flowTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "getFlowTracker$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "setFlowTracker$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;)V", "json", "Lkotlinx/serialization/json/Json;", "remoteLoggerTree", "Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree;", "getRemoteLoggerTree$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree;", "setRemoteLoggerTree$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashHandlerWorker extends Worker {
    public FlowTracker flowTracker;

    @NotNull
    private final Json json;
    public RemoteLoggerTree remoteLoggerTree;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashHandlerWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.json = e.f50133a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    @Override // androidx.work.Worker
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.work.ListenableWorker.Result doWork() {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.util.logging.CrashHandlerWorker.doWork():androidx.work.ListenableWorker$Result");
    }

    @NotNull
    public final FlowTracker getFlowTracker$onfido_capture_sdk_core_release() {
        FlowTracker flowTracker = this.flowTracker;
        if (flowTracker != null) {
            return flowTracker;
        }
        Intrinsics.r("flowTracker");
        throw null;
    }

    @NotNull
    public final RemoteLoggerTree getRemoteLoggerTree$onfido_capture_sdk_core_release() {
        RemoteLoggerTree remoteLoggerTree = this.remoteLoggerTree;
        if (remoteLoggerTree != null) {
            return remoteLoggerTree;
        }
        Intrinsics.r("remoteLoggerTree");
        throw null;
    }

    public final void setFlowTracker$onfido_capture_sdk_core_release(@NotNull FlowTracker flowTracker) {
        Intrinsics.checkNotNullParameter(flowTracker, "<set-?>");
        this.flowTracker = flowTracker;
    }

    public final void setRemoteLoggerTree$onfido_capture_sdk_core_release(@NotNull RemoteLoggerTree remoteLoggerTree) {
        Intrinsics.checkNotNullParameter(remoteLoggerTree, "<set-?>");
        this.remoteLoggerTree = remoteLoggerTree;
    }
}
