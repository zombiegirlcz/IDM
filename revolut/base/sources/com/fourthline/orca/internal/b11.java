package com.fourthline.orca.internal;

import com.fourthline.core.VideoRecording;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerResult;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b11 implements a11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n01 f26958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r01 f26959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ef f26960c;
    private final sg0 d;
    private final oy0 e;
    private final SelfieScannerConfig f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SelfieScannerResult f26961g;

    public b11(n01 flowConfig, r01 selfieFlowDataBundle, ef deviceDataBundle, sg0 analyticsTracker, boolean z) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(selfieFlowDataBundle, "selfieFlowDataBundle");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        this.f26958a = flowConfig;
        this.f26959b = selfieFlowDataBundle;
        this.f26960c = deviceDataBundle;
        this.d = analyticsTracker;
        this.e = flowConfig.getRandomnessConfig();
        this.f = o01.a(flowConfig, z);
    }

    @Override // com.fourthline.orca.internal.i21
    public SelfieScannerResult a() {
        return this.f26961g;
    }

    @Override // com.fourthline.orca.internal.i21
    public oy0 b() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.i21
    public SelfieScannerConfig c() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.i21
    public void a(SelfieScannerResult selfieScannerResult) {
        URI url2;
        this.f26961g = selfieScannerResult;
        if (selfieScannerResult != null) {
            c01.a(this.f26959b.b(), selfieScannerResult);
            this.f26960c.b(selfieScannerResult.getMetadata().getMotionData());
            h9.d.a(this.d, this.f26960c.l(), "selfie");
            r01 r01Var = this.f26959b;
            VideoRecording videoRecording = selfieScannerResult.getVideoRecording();
            r01Var.a((videoRecording == null || (url2 = videoRecording.getUrl()) == null) ? null : uc1.a(url2));
        }
    }
}
