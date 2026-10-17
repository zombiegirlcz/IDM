package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation;

import afj.p;
import bgj.c;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbgj/c;", "Lyki/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanCancellationFlow extends ViewController<c> implements f {
    public final EsimMobilePlanCancellationFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public EsimMobilePlanCancellationFlow(EsimMobilePlanCancellationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationFlow f15205b;

            {
                this.f15205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow = this.f15205b;
                        return czi.c.d(0, 6, null, esimMobilePlanCancellationFlow, (b) esimMobilePlanCancellationFlow.N.getValue());
                    case 1:
                        EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow2 = this.f15205b;
                        phm.a aVar = (phm.a) e.j(esimMobilePlanCancellationFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData = esimMobilePlanCancellationFlow2.K;
                        esimMobilePlanCancellationFlowContract$InputData.getClass();
                        return new p(bVar, esimMobilePlanCancellationFlow2, esimMobilePlanCancellationFlowContract$InputData);
                    default:
                        return (b) ((p) this.f15205b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationFlow f15205b;

            {
                this.f15205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow = this.f15205b;
                        return czi.c.d(0, 6, null, esimMobilePlanCancellationFlow, (b) esimMobilePlanCancellationFlow.N.getValue());
                    case 1:
                        EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow2 = this.f15205b;
                        phm.a aVar = (phm.a) e.j(esimMobilePlanCancellationFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData = esimMobilePlanCancellationFlow2.K;
                        esimMobilePlanCancellationFlowContract$InputData.getClass();
                        return new p(bVar, esimMobilePlanCancellationFlow2, esimMobilePlanCancellationFlowContract$InputData);
                    default:
                        return (b) ((p) this.f15205b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: bgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationFlow f15205b;

            {
                this.f15205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow = this.f15205b;
                        return czi.c.d(0, 6, null, esimMobilePlanCancellationFlow, (b) esimMobilePlanCancellationFlow.N.getValue());
                    case 1:
                        EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow2 = this.f15205b;
                        phm.a aVar = (phm.a) e.j(esimMobilePlanCancellationFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData = esimMobilePlanCancellationFlow2.K;
                        esimMobilePlanCancellationFlowContract$InputData.getClass();
                        return new p(bVar, esimMobilePlanCancellationFlow2, esimMobilePlanCancellationFlowContract$InputData);
                    default:
                        return (b) ((p) this.f15205b.M.getValue()).d.get();
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
    public final pki.b R2() {
        return (bgj.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
