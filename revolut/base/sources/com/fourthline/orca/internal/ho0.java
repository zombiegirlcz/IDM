package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final an0 f29364a;

    public ho0(an0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f29364a = flowConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d() {
        return 18;
    }

    public final uo a() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        return new uo(new DocumentScannerConfig(DocumentType.PROOF_OF_ADDRESS, true, z, false, null, null, null, null, 0L, false, 1016, defaultConstructorMarker), null, false, z, true, false, false, 0.8d, this.f29364a.getCameraX().getEnabled(), null, null, 1122, defaultConstructorMarker);
    }

    public final wd1 b(lp0 flowActionProvider, en0 uploadDataRequestsBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final im0 c() {
        return new im0();
    }

    public final hm0 b() {
        return new hm0();
    }

    public final a50 c(gm0 flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return new a50(flowCoordinator);
    }

    public final z40 b(gm0 scannerCoordinator) {
        Intrinsics.checkNotNullParameter(scannerCoordinator, "scannerCoordinator");
        return new z40(scannerCoordinator);
    }

    public final no b(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new no(false, imageServiceLocator);
    }

    public final wo a(gj documentFlowDataBundle) {
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        return new wo(documentFlowDataBundle.n(), DocumentType.PROOF_OF_ADDRESS);
    }

    public final wd1 a(lp0 flowActionProvider, en0 uploadDataRequestsBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final b50 a(gm0 scannerCoordinator) {
        Intrinsics.checkNotNullParameter(scannerCoordinator, "scannerCoordinator");
        return new b50(scannerCoordinator);
    }

    public final tm a(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new tm(true, new dl1(25), imageServiceLocator);
    }

    public final gm0 a(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        return new gm0(navigationChannel);
    }
}
