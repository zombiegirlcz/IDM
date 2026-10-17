package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import aii.q;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ppd.n;
import ppd.u0;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/flow/TotalWealthFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TotalWealthFlow extends ViewController<q> implements yki.f {
    public final TotalWealthFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public TotalWealthFlow(TotalWealthFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yrd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthFlow f316270b;

            {
                this.f316270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (e) ((u0) this.f316270b.O.getValue()).d.get();
                    case 1:
                        int i2 = R$id.screen_transparent_container;
                        TotalWealthFlow totalWealthFlow = this.f316270b;
                        return czi.c.d(i2, 4, null, totalWealthFlow, (e) totalWealthFlow.L.getValue());
                    default:
                        TotalWealthFlow totalWealthFlow2 = this.f316270b;
                        phm.a aVar = (phm.a) ue0.e.j(totalWealthFlow2.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).L0;
                        TotalWealthFlowContract$InputData totalWealthFlowContract$InputData = totalWealthFlow2.K;
                        totalWealthFlowContract$InputData.getClass();
                        return new u0(nVar, totalWealthFlowContract$InputData);
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yrd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthFlow f316270b;

            {
                this.f316270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (e) ((u0) this.f316270b.O.getValue()).d.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        TotalWealthFlow totalWealthFlow = this.f316270b;
                        return czi.c.d(i22, 4, null, totalWealthFlow, (e) totalWealthFlow.L.getValue());
                    default:
                        TotalWealthFlow totalWealthFlow2 = this.f316270b;
                        phm.a aVar = (phm.a) ue0.e.j(totalWealthFlow2.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).L0;
                        TotalWealthFlowContract$InputData totalWealthFlowContract$InputData = totalWealthFlow2.K;
                        totalWealthFlowContract$InputData.getClass();
                        return new u0(nVar, totalWealthFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yrd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthFlow f316270b;

            {
                this.f316270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (e) ((u0) this.f316270b.O.getValue()).d.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        TotalWealthFlow totalWealthFlow = this.f316270b;
                        return czi.c.d(i22, 4, null, totalWealthFlow, (e) totalWealthFlow.L.getValue());
                    default:
                        TotalWealthFlow totalWealthFlow2 = this.f316270b;
                        phm.a aVar = (phm.a) ue0.e.j(totalWealthFlow2.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).L0;
                        TotalWealthFlowContract$InputData totalWealthFlowContract$InputData = totalWealthFlow2.K;
                        totalWealthFlowContract$InputData.getClass();
                        return new u0(nVar, totalWealthFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (u0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yrd.e) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
