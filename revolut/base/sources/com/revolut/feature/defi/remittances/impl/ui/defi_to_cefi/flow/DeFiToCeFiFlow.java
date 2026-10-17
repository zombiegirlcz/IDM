package com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow;

import a0.d;
import aii.q;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow.DeFiToCeFiFlow;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow.DeFiToCeFiFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import g56.j;
import g56.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/defi_to_cefi/flow/DeFiToCeFiFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiToCeFiFlow extends ViewController<q> implements f {
    public final DeFiToCeFiFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public DeFiToCeFiFlow(DeFiToCeFiFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: l56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiToCeFiFlow f192184b;

            {
                this.f192184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DeFiToCeFiFlow deFiToCeFiFlow = this.f192184b;
                        phm.a aVar = (phm.a) e.j(deFiToCeFiFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        g56.d dVar = ((g56.d) ((l) aVar2.b())).f140644q;
                        DeFiToCeFiFlowContract$InputData deFiToCeFiFlowContract$InputData = deFiToCeFiFlow.K;
                        deFiToCeFiFlowContract$InputData.getClass();
                        return new j(dVar, deFiToCeFiFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f192184b.M.getValue()).d.get();
                    default:
                        DeFiToCeFiFlow deFiToCeFiFlow2 = this.f192184b;
                        return c.d(R$id.screen_transparent_container, 4, null, deFiToCeFiFlow2, (b) deFiToCeFiFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: l56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiToCeFiFlow f192184b;

            {
                this.f192184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DeFiToCeFiFlow deFiToCeFiFlow = this.f192184b;
                        phm.a aVar = (phm.a) e.j(deFiToCeFiFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        g56.d dVar = ((g56.d) ((l) aVar2.b())).f140644q;
                        DeFiToCeFiFlowContract$InputData deFiToCeFiFlowContract$InputData = deFiToCeFiFlow.K;
                        deFiToCeFiFlowContract$InputData.getClass();
                        return new j(dVar, deFiToCeFiFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f192184b.M.getValue()).d.get();
                    default:
                        DeFiToCeFiFlow deFiToCeFiFlow2 = this.f192184b;
                        return c.d(R$id.screen_transparent_container, 4, null, deFiToCeFiFlow2, (b) deFiToCeFiFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: l56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiToCeFiFlow f192184b;

            {
                this.f192184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DeFiToCeFiFlow deFiToCeFiFlow = this.f192184b;
                        phm.a aVar = (phm.a) e.j(deFiToCeFiFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        g56.d dVar = ((g56.d) ((l) aVar2.b())).f140644q;
                        DeFiToCeFiFlowContract$InputData deFiToCeFiFlowContract$InputData = deFiToCeFiFlow.K;
                        deFiToCeFiFlowContract$InputData.getClass();
                        return new j(dVar, deFiToCeFiFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f192184b.M.getValue()).d.get();
                    default:
                        DeFiToCeFiFlow deFiToCeFiFlow2 = this.f192184b;
                        return c.d(R$id.screen_transparent_container, 4, null, deFiToCeFiFlow2, (b) deFiToCeFiFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (l56.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
