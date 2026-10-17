package com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow;

import aii.q;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlow;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import k4i.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s4i.c;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/breakdown/kompot/flow/BreakdownFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BreakdownFlow extends ViewController<q> implements f {
    public final BreakdownFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BreakdownFlow(BreakdownFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: s4i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BreakdownFlow f259879b;

            {
                this.f259879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BreakdownFlow breakdownFlow = this.f259879b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, breakdownFlow, (c) breakdownFlow.N.getValue());
                    case 1:
                        return (c) ((k4i.b) this.f259879b.O.getValue()).e.get();
                    default:
                        BreakdownFlow breakdownFlow2 = this.f259879b;
                        phm.a aVar = (phm.a) ue0.e.j(breakdownFlow2.m2()).a().get(k4i.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k4i.c.class, " is not found"));
                        }
                        k4i.c cVar = ((k4i.c) aVar2.b()).k;
                        BreakdownFlowContract$InputData breakdownFlowContract$InputData = breakdownFlow2.K;
                        breakdownFlowContract$InputData.getClass();
                        return new k4i.b(cVar, breakdownFlow2, breakdownFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: s4i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BreakdownFlow f259879b;

            {
                this.f259879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BreakdownFlow breakdownFlow = this.f259879b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, breakdownFlow, (c) breakdownFlow.N.getValue());
                    case 1:
                        return (c) ((k4i.b) this.f259879b.O.getValue()).e.get();
                    default:
                        BreakdownFlow breakdownFlow2 = this.f259879b;
                        phm.a aVar = (phm.a) ue0.e.j(breakdownFlow2.m2()).a().get(k4i.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k4i.c.class, " is not found"));
                        }
                        k4i.c cVar = ((k4i.c) aVar2.b()).k;
                        BreakdownFlowContract$InputData breakdownFlowContract$InputData = breakdownFlow2.K;
                        breakdownFlowContract$InputData.getClass();
                        return new k4i.b(cVar, breakdownFlow2, breakdownFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: s4i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BreakdownFlow f259879b;

            {
                this.f259879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BreakdownFlow breakdownFlow = this.f259879b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, breakdownFlow, (c) breakdownFlow.N.getValue());
                    case 1:
                        return (c) ((k4i.b) this.f259879b.O.getValue()).e.get();
                    default:
                        BreakdownFlow breakdownFlow2 = this.f259879b;
                        phm.a aVar = (phm.a) ue0.e.j(breakdownFlow2.m2()).a().get(k4i.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k4i.c.class, " is not found"));
                        }
                        k4i.c cVar = ((k4i.c) aVar2.b()).k;
                        BreakdownFlowContract$InputData breakdownFlowContract$InputData = breakdownFlow2.K;
                        breakdownFlowContract$InputData.getClass();
                        return new k4i.b(cVar, breakdownFlow2, breakdownFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
