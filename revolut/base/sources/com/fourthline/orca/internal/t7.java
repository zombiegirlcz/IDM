package com.fourthline.orca.internal;

import com.fourthline.core.VideoRecording;
import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.workflow.BiometricsComponentResult;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.vision.selfie.SelfieScannerResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class t7 {
    public Object a(Object obj2) {
        Throwable unexpected;
        Throwable thA = yhm.m.a(obj2);
        if (thA == null) {
            SelfieScannerResult selfieScannerResult = (SelfieScannerResult) obj2;
            WorkflowResults.IDV.Selfie selfie = new WorkflowResults.IDV.Selfie(selfieScannerResult.getImage().getFull(), selfieScannerResult.getMetadata().getLocation(), Long.valueOf(selfieScannerResult.getMetadata().getTimestamp().getTime()));
            VideoRecording videoRecording = selfieScannerResult.getVideoRecording();
            return new BiometricsComponentResult(selfie, videoRecording != null ? new WorkflowResults.IDV.SelfieVideo(videoRecording) : null);
        }
        if (thA instanceof ui0.a) {
            unexpected = WorkflowError.Canceled.INSTANCE;
        } else {
            String message = thA.getMessage();
            if (message == null) {
                message = thA instanceof kh0 ? ((kh0) thA).getAlias() : thA.getClass().getSimpleName();
            }
            Intrinsics.h(message);
            unexpected = new WorkflowError.Unexpected(message);
        }
        return yhm.o.a(unexpected);
    }
}
