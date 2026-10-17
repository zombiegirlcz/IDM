package com.revolut.feature.apm.breb.impl.ui.qr_request;

import a0.d;
import aii.q;
import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlow;
import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nv1.g;
import nv1.p;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/qr_request/BrebQrRequestFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebQrRequestFlow extends ViewController<q> implements f {
    public final BrebQrRequestFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BrebQrRequestFlow(BrebQrRequestFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestFlow f178919b;

            {
                this.f178919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BrebQrRequestFlow brebQrRequestFlow = this.f178919b;
                        phm.a aVar = (phm.a) e.j(brebQrRequestFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f219407r;
                        BrebQrRequestFlowContract$InputData brebQrRequestFlowContract$InputData = brebQrRequestFlow.K;
                        brebQrRequestFlowContract$InputData.getClass();
                        return new p(gVar, brebQrRequestFlowContract$InputData);
                    case 1:
                        return (b) ((p) this.f178919b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        BrebQrRequestFlow brebQrRequestFlow2 = this.f178919b;
                        return czi.c.d(i2, 4, null, brebQrRequestFlow2, (b) brebQrRequestFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: jw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestFlow f178919b;

            {
                this.f178919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BrebQrRequestFlow brebQrRequestFlow = this.f178919b;
                        phm.a aVar = (phm.a) e.j(brebQrRequestFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f219407r;
                        BrebQrRequestFlowContract$InputData brebQrRequestFlowContract$InputData = brebQrRequestFlow.K;
                        brebQrRequestFlowContract$InputData.getClass();
                        return new p(gVar, brebQrRequestFlowContract$InputData);
                    case 1:
                        return (b) ((p) this.f178919b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BrebQrRequestFlow brebQrRequestFlow2 = this.f178919b;
                        return czi.c.d(i22, 4, null, brebQrRequestFlow2, (b) brebQrRequestFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: jw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestFlow f178919b;

            {
                this.f178919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BrebQrRequestFlow brebQrRequestFlow = this.f178919b;
                        phm.a aVar = (phm.a) e.j(brebQrRequestFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f219407r;
                        BrebQrRequestFlowContract$InputData brebQrRequestFlowContract$InputData = brebQrRequestFlow.K;
                        brebQrRequestFlowContract$InputData.getClass();
                        return new p(gVar, brebQrRequestFlowContract$InputData);
                    case 1:
                        return (b) ((p) this.f178919b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BrebQrRequestFlow brebQrRequestFlow2 = this.f178919b;
                        return czi.c.d(i22, 4, null, brebQrRequestFlow2, (b) brebQrRequestFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (jw1.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
