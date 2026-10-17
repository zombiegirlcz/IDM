package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow;

import aii.q;
import bt6.l;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gr6.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubFlow extends ViewController<q> implements f {
    public final TaxHubFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TaxHubFlow(TaxHubFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: e37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubFlow f122199b;

            {
                this.f122199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TaxHubFlow taxHubFlow = this.f122199b;
                        phm.a aVar = (phm.a) e.j(taxHubFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubFlowContract$InputData taxHubFlowContract$InputData = taxHubFlow.K;
                        taxHubFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) e.j(taxHubFlow.m2()).a().get(us6.q.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        p pVar = (p) ((us6.q) aVar4.b()).L0.get();
                        pVar.getClass();
                        return new l(bVar, taxHubFlowContract$InputData, pVar);
                    case 1:
                        return (b) ((l) this.f122199b.M.getValue()).e.get();
                    default:
                        TaxHubFlow taxHubFlow2 = this.f122199b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, taxHubFlow2, (b) taxHubFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: e37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubFlow f122199b;

            {
                this.f122199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TaxHubFlow taxHubFlow = this.f122199b;
                        phm.a aVar = (phm.a) e.j(taxHubFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubFlowContract$InputData taxHubFlowContract$InputData = taxHubFlow.K;
                        taxHubFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) e.j(taxHubFlow.m2()).a().get(us6.q.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        p pVar = (p) ((us6.q) aVar4.b()).L0.get();
                        pVar.getClass();
                        return new l(bVar, taxHubFlowContract$InputData, pVar);
                    case 1:
                        return (b) ((l) this.f122199b.M.getValue()).e.get();
                    default:
                        TaxHubFlow taxHubFlow2 = this.f122199b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, taxHubFlow2, (b) taxHubFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: e37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubFlow f122199b;

            {
                this.f122199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TaxHubFlow taxHubFlow = this.f122199b;
                        phm.a aVar = (phm.a) e.j(taxHubFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubFlowContract$InputData taxHubFlowContract$InputData = taxHubFlow.K;
                        taxHubFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) e.j(taxHubFlow.m2()).a().get(us6.q.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        p pVar = (p) ((us6.q) aVar4.b()).L0.get();
                        pVar.getClass();
                        return new l(bVar, taxHubFlowContract$InputData, pVar);
                    case 1:
                        return (b) ((l) this.f122199b.M.getValue()).e.get();
                    default:
                        TaxHubFlow taxHubFlow2 = this.f122199b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, taxHubFlow2, (b) taxHubFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e37.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
