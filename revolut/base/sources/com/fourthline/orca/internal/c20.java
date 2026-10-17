package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c20 {
    public final q01 a(o80 navigationChannel, j11 selfieIntroCoordinator, g20 inFlowSelfieScannerCoordinator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(selfieIntroCoordinator, "selfieIntroCoordinator");
        Intrinsics.checkNotNullParameter(inFlowSelfieScannerCoordinator, "inFlowSelfieScannerCoordinator");
        return new q01(navigationChannel, selfieIntroCoordinator, inFlowSelfieScannerCoordinator);
    }

    public final wd1 a(m01 flowActionProvider, d11 uploadRequestsBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadRequestsBuilder, "uploadRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final d11 a(Function0 workflowIdProvider, r01 dataBundle) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        return new d11(workflowIdProvider, dataBundle);
    }
}
