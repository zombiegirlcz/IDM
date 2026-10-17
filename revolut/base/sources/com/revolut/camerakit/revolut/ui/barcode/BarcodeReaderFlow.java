package com.revolut.camerakit.revolut.ui.barcode;

import android.content.Intent;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlow;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import px.g;
import qji.b;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/camerakit/revolut/ui/barcode/BarcodeReaderFlowContract$OutputData;", "Luki/c;", "Lno/d1;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarcodeReaderFlow extends ViewController<BarcodeReaderFlowContract$OutputData> implements c, d1 {
    public final BarcodeReaderFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BarcodeReaderFlow(BarcodeReaderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: tx.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeReaderFlow f275074b;

            {
                this.f275074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BarcodeReaderFlow barcodeReaderFlow = this.f275074b;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeReaderFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f240531h;
                        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = barcodeReaderFlow.K;
                        barcodeReaderFlowContract$InputData.getClass();
                        return new px.e(gVar, barcodeReaderFlowContract$InputData);
                    case 1:
                        return (e) ((px.e) this.f275074b.M.getValue()).f240513b.get();
                    default:
                        BarcodeReaderFlow barcodeReaderFlow2 = this.f275074b;
                        return czi.c.a(R$id.screen_transparent_container, (e) barcodeReaderFlow2.N.getValue(), barcodeReaderFlow2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: tx.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeReaderFlow f275074b;

            {
                this.f275074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BarcodeReaderFlow barcodeReaderFlow = this.f275074b;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeReaderFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f240531h;
                        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = barcodeReaderFlow.K;
                        barcodeReaderFlowContract$InputData.getClass();
                        return new px.e(gVar, barcodeReaderFlowContract$InputData);
                    case 1:
                        return (e) ((px.e) this.f275074b.M.getValue()).f240513b.get();
                    default:
                        BarcodeReaderFlow barcodeReaderFlow2 = this.f275074b;
                        return czi.c.a(R$id.screen_transparent_container, (e) barcodeReaderFlow2.N.getValue(), barcodeReaderFlow2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: tx.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarcodeReaderFlow f275074b;

            {
                this.f275074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BarcodeReaderFlow barcodeReaderFlow = this.f275074b;
                        phm.a aVar = (phm.a) ue0.e.j(barcodeReaderFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f240531h;
                        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = barcodeReaderFlow.K;
                        barcodeReaderFlowContract$InputData.getClass();
                        return new px.e(gVar, barcodeReaderFlowContract$InputData);
                    case 1:
                        return (e) ((px.e) this.f275074b.M.getValue()).f240513b.get();
                    default:
                        BarcodeReaderFlow barcodeReaderFlow2 = this.f275074b;
                        return czi.c.a(R$id.screen_transparent_container, (e) barcodeReaderFlow2.N.getValue(), barcodeReaderFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (px.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (px.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tx.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        a aVar = (a) ((tx.e) this.N.getValue());
        aVar.getClass();
        if (i == 1245) {
            BarcodeReaderFlowContract$OutputData barcodeReaderFlowContract$OutputData = null;
            if (i2 == -1 && intent != null) {
                barcodeReaderFlowContract$OutputData = (BarcodeReaderFlowContract$OutputData) intent.getParcelableExtra("RESULT_DATA");
            }
            if (barcodeReaderFlowContract$OutputData != null) {
                aVar.C2(barcodeReaderFlowContract$OutputData);
            } else {
                aVar.B2();
            }
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
