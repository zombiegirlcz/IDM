package com.revolut.camerakit.revolut.ui.barcodeqr;

import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlow;
import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import px.c;
import qji.b;
import te0.w;
import wx.g;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcodeqr/BarcodeQrReaderFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwx/g;", "Lyki/f;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarcodeQrReaderFlow extends ViewController<g> implements f {
    public final BarcodeQrReaderFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BarcodeQrReaderFlow(BarcodeQrReaderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wx.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeQrReaderFlow f300702b;

            {
                this.f300702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BarcodeQrReaderFlow barcodeQrReaderFlow = this.f300702b;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeQrReaderFlow.m2()).a().get(px.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", px.g.class, " is not found"));
                        }
                        px.g gVar = ((px.g) aVar2.b()).f240531h;
                        BarcodeQrReaderFlowContract$InputData barcodeQrReaderFlowContract$InputData = barcodeQrReaderFlow.K;
                        barcodeQrReaderFlowContract$InputData.getClass();
                        return new px.c(gVar, barcodeQrReaderFlowContract$InputData);
                    case 1:
                        return (b) ((px.c) this.f300702b.M.getValue()).d.get();
                    default:
                        BarcodeQrReaderFlow barcodeQrReaderFlow2 = this.f300702b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, barcodeQrReaderFlow2, (b) barcodeQrReaderFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wx.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeQrReaderFlow f300702b;

            {
                this.f300702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BarcodeQrReaderFlow barcodeQrReaderFlow = this.f300702b;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeQrReaderFlow.m2()).a().get(px.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", px.g.class, " is not found"));
                        }
                        px.g gVar = ((px.g) aVar2.b()).f240531h;
                        BarcodeQrReaderFlowContract$InputData barcodeQrReaderFlowContract$InputData = barcodeQrReaderFlow.K;
                        barcodeQrReaderFlowContract$InputData.getClass();
                        return new px.c(gVar, barcodeQrReaderFlowContract$InputData);
                    case 1:
                        return (b) ((px.c) this.f300702b.M.getValue()).d.get();
                    default:
                        BarcodeQrReaderFlow barcodeQrReaderFlow2 = this.f300702b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, barcodeQrReaderFlow2, (b) barcodeQrReaderFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: wx.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeQrReaderFlow f300702b;

            {
                this.f300702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BarcodeQrReaderFlow barcodeQrReaderFlow = this.f300702b;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeQrReaderFlow.m2()).a().get(px.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", px.g.class, " is not found"));
                        }
                        px.g gVar = ((px.g) aVar2.b()).f240531h;
                        BarcodeQrReaderFlowContract$InputData barcodeQrReaderFlowContract$InputData = barcodeQrReaderFlow.K;
                        barcodeQrReaderFlowContract$InputData.getClass();
                        return new px.c(gVar, barcodeQrReaderFlowContract$InputData);
                    case 1:
                        return (b) ((px.c) this.f300702b.M.getValue()).d.get();
                    default:
                        BarcodeQrReaderFlow barcodeQrReaderFlow2 = this.f300702b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, barcodeQrReaderFlow2, (b) barcodeQrReaderFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wx.b) this.N.getValue();
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
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
