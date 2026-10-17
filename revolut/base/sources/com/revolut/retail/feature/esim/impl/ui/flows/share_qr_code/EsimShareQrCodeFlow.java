package com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code;

import a0.d;
import afj.v0;
import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.EsimShareQrCodeFlow;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/share_qr_code/EsimShareQrCodeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimShareQrCodeFlow extends ViewController<q> implements f {
    public final EsimShareQrCodeScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public EsimShareQrCodeFlow(EsimShareQrCodeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: rgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimShareQrCodeFlow f254201b;

            {
                this.f254201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimShareQrCodeFlow esimShareQrCodeFlow = this.f254201b;
                        phm.a aVar = (phm.a) e.j(esimShareQrCodeFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimShareQrCodeScreenContract$InputData esimShareQrCodeScreenContract$InputData = esimShareQrCodeFlow.K;
                        esimShareQrCodeScreenContract$InputData.getClass();
                        return new v0(bVar, esimShareQrCodeScreenContract$InputData);
                    case 1:
                        EsimShareQrCodeFlow esimShareQrCodeFlow2 = this.f254201b;
                        return c.d(0, 6, null, esimShareQrCodeFlow2, (b) esimShareQrCodeFlow2.N.getValue());
                    default:
                        return (b) ((v0) this.f254201b.L.getValue()).f4492b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: rgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimShareQrCodeFlow f254201b;

            {
                this.f254201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimShareQrCodeFlow esimShareQrCodeFlow = this.f254201b;
                        phm.a aVar = (phm.a) e.j(esimShareQrCodeFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimShareQrCodeScreenContract$InputData esimShareQrCodeScreenContract$InputData = esimShareQrCodeFlow.K;
                        esimShareQrCodeScreenContract$InputData.getClass();
                        return new v0(bVar, esimShareQrCodeScreenContract$InputData);
                    case 1:
                        EsimShareQrCodeFlow esimShareQrCodeFlow2 = this.f254201b;
                        return c.d(0, 6, null, esimShareQrCodeFlow2, (b) esimShareQrCodeFlow2.N.getValue());
                    default:
                        return (b) ((v0) this.f254201b.L.getValue()).f4492b.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: rgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimShareQrCodeFlow f254201b;

            {
                this.f254201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EsimShareQrCodeFlow esimShareQrCodeFlow = this.f254201b;
                        phm.a aVar = (phm.a) e.j(esimShareQrCodeFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimShareQrCodeScreenContract$InputData esimShareQrCodeScreenContract$InputData = esimShareQrCodeFlow.K;
                        esimShareQrCodeScreenContract$InputData.getClass();
                        return new v0(bVar, esimShareQrCodeScreenContract$InputData);
                    case 1:
                        EsimShareQrCodeFlow esimShareQrCodeFlow2 = this.f254201b;
                        return c.d(0, 6, null, esimShareQrCodeFlow2, (b) esimShareQrCodeFlow2.N.getValue());
                    default:
                        return (b) ((v0) this.f254201b.L.getValue()).f4492b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (rgj.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
