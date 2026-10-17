package com.revolut.retail.feature.esim.impl.ui.flows.refund;

import afj.t0;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pgj.d;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpgj/d;", "Lyki/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimRefundFlow extends ViewController<d> implements f {
    public final EsimRefundFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public EsimRefundFlow(EsimRefundFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundFlow f235974b;

            {
                this.f235974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimRefundFlow esimRefundFlow = this.f235974b;
                        phm.a aVar = (phm.a) ue0.e.j(esimRefundFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimRefundFlowContract$InputData esimRefundFlowContract$InputData = esimRefundFlow.K;
                        esimRefundFlowContract$InputData.getClass();
                        return new t0(bVar, esimRefundFlow, esimRefundFlowContract$InputData);
                    case 1:
                        EsimRefundFlow esimRefundFlow2 = this.f235974b;
                        return czi.c.d(0, 6, null, esimRefundFlow2, (b) esimRefundFlow2.N.getValue());
                    default:
                        return (b) ((t0) this.f235974b.L.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: pgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundFlow f235974b;

            {
                this.f235974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimRefundFlow esimRefundFlow = this.f235974b;
                        phm.a aVar = (phm.a) ue0.e.j(esimRefundFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimRefundFlowContract$InputData esimRefundFlowContract$InputData = esimRefundFlow.K;
                        esimRefundFlowContract$InputData.getClass();
                        return new t0(bVar, esimRefundFlow, esimRefundFlowContract$InputData);
                    case 1:
                        EsimRefundFlow esimRefundFlow2 = this.f235974b;
                        return czi.c.d(0, 6, null, esimRefundFlow2, (b) esimRefundFlow2.N.getValue());
                    default:
                        return (b) ((t0) this.f235974b.L.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: pgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundFlow f235974b;

            {
                this.f235974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EsimRefundFlow esimRefundFlow = this.f235974b;
                        phm.a aVar = (phm.a) ue0.e.j(esimRefundFlow.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimRefundFlowContract$InputData esimRefundFlowContract$InputData = esimRefundFlow.K;
                        esimRefundFlowContract$InputData.getClass();
                        return new t0(bVar, esimRefundFlow, esimRefundFlowContract$InputData);
                    case 1:
                        EsimRefundFlow esimRefundFlow2 = this.f235974b;
                        return czi.c.d(0, 6, null, esimRefundFlow2, (b) esimRefundFlow2.N.getValue());
                    default:
                        return (b) ((t0) this.f235974b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (t0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (pgj.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
