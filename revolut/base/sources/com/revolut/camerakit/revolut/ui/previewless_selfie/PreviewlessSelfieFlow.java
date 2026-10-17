package com.revolut.camerakit.revolut.ui.previewless_selfie;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.revolut.ui.R$id;
import com.revolut.camerakit.revolut.ui.R$layout;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlow;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import iz.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import px.g;
import px.h;
import qji.b;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/previewless_selfie/PreviewlessSelfieFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liz/e;", "Lyki/f;", "Lno/d1;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PreviewlessSelfieFlow extends ViewController<e> implements f, d1 {
    public final PreviewlessSelfieFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PreviewlessSelfieFlow(PreviewlessSelfieFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_previewless_selfie;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: iz.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreviewlessSelfieFlow f169802b;

            {
                this.f169802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PreviewlessSelfieFlow previewlessSelfieFlow = this.f169802b;
                        g gVar = px.b.d(previewlessSelfieFlow.m2()).f240531h;
                        PreviewlessSelfieFlowContract$InputData previewlessSelfieFlowContract$InputData = previewlessSelfieFlow.K;
                        previewlessSelfieFlowContract$InputData.getClass();
                        CameraCaptureSettings cameraCaptureSettings = previewlessSelfieFlowContract$InputData.f50813a;
                        cameraCaptureSettings.getClass();
                        return new h(gVar, previewlessSelfieFlow, cameraCaptureSettings, previewlessSelfieFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f169802b.M.getValue()).z.get();
                    default:
                        PreviewlessSelfieFlow previewlessSelfieFlow2 = this.f169802b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, previewlessSelfieFlow2, (b) previewlessSelfieFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: iz.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreviewlessSelfieFlow f169802b;

            {
                this.f169802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PreviewlessSelfieFlow previewlessSelfieFlow = this.f169802b;
                        g gVar = px.b.d(previewlessSelfieFlow.m2()).f240531h;
                        PreviewlessSelfieFlowContract$InputData previewlessSelfieFlowContract$InputData = previewlessSelfieFlow.K;
                        previewlessSelfieFlowContract$InputData.getClass();
                        CameraCaptureSettings cameraCaptureSettings = previewlessSelfieFlowContract$InputData.f50813a;
                        cameraCaptureSettings.getClass();
                        return new h(gVar, previewlessSelfieFlow, cameraCaptureSettings, previewlessSelfieFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f169802b.M.getValue()).z.get();
                    default:
                        PreviewlessSelfieFlow previewlessSelfieFlow2 = this.f169802b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, previewlessSelfieFlow2, (b) previewlessSelfieFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: iz.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreviewlessSelfieFlow f169802b;

            {
                this.f169802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PreviewlessSelfieFlow previewlessSelfieFlow = this.f169802b;
                        g gVar = px.b.d(previewlessSelfieFlow.m2()).f240531h;
                        PreviewlessSelfieFlowContract$InputData previewlessSelfieFlowContract$InputData = previewlessSelfieFlow.K;
                        previewlessSelfieFlowContract$InputData.getClass();
                        CameraCaptureSettings cameraCaptureSettings = previewlessSelfieFlowContract$InputData.f50813a;
                        cameraCaptureSettings.getClass();
                        return new h(gVar, previewlessSelfieFlow, cameraCaptureSettings, previewlessSelfieFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f169802b.M.getValue()).z.get();
                    default:
                        PreviewlessSelfieFlow previewlessSelfieFlow2 = this.f169802b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, previewlessSelfieFlow2, (b) previewlessSelfieFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (iz.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
