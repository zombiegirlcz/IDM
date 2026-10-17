package com.revolut.retail.feature.esim.impl.ui.flows.post_checkout;

import a0.d;
import afj.s0;
import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimPostCheckoutFlow extends ViewController<q> implements f {
    public final EsimPostCheckoutFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public EsimPostCheckoutFlow(EsimPostCheckoutFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ogj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPostCheckoutFlow f225160b;

            {
                this.f225160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimPostCheckoutFlow esimPostCheckoutFlow = this.f225160b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimPostCheckoutFlow, (b) esimPostCheckoutFlow.O.getValue());
                    case 1:
                        EsimPostCheckoutFlow esimPostCheckoutFlow2 = this.f225160b;
                        phm.a aVar = (phm.a) e.j(esimPostCheckoutFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimPostCheckoutFlowContract$InputData esimPostCheckoutFlowContract$InputData = esimPostCheckoutFlow2.K;
                        esimPostCheckoutFlowContract$InputData.getClass();
                        return new s0(bVar, esimPostCheckoutFlowContract$InputData);
                    default:
                        return (b) ((s0) this.f225160b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ogj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPostCheckoutFlow f225160b;

            {
                this.f225160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimPostCheckoutFlow esimPostCheckoutFlow = this.f225160b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimPostCheckoutFlow, (b) esimPostCheckoutFlow.O.getValue());
                    case 1:
                        EsimPostCheckoutFlow esimPostCheckoutFlow2 = this.f225160b;
                        phm.a aVar = (phm.a) e.j(esimPostCheckoutFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimPostCheckoutFlowContract$InputData esimPostCheckoutFlowContract$InputData = esimPostCheckoutFlow2.K;
                        esimPostCheckoutFlowContract$InputData.getClass();
                        return new s0(bVar, esimPostCheckoutFlowContract$InputData);
                    default:
                        return (b) ((s0) this.f225160b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ogj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPostCheckoutFlow f225160b;

            {
                this.f225160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EsimPostCheckoutFlow esimPostCheckoutFlow = this.f225160b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimPostCheckoutFlow, (b) esimPostCheckoutFlow.O.getValue());
                    case 1:
                        EsimPostCheckoutFlow esimPostCheckoutFlow2 = this.f225160b;
                        phm.a aVar = (phm.a) e.j(esimPostCheckoutFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimPostCheckoutFlowContract$InputData esimPostCheckoutFlowContract$InputData = esimPostCheckoutFlow2.K;
                        esimPostCheckoutFlowContract$InputData.getClass();
                        return new s0(bVar, esimPostCheckoutFlowContract$InputData);
                    default:
                        return (b) ((s0) this.f225160b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (s0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ogj.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
