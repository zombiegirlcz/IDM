package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow;

import aii.q;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dod.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ppd.l;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsDashboardFlow extends ViewController<q> implements f {
    public final AnalyticsDashboardFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public AnalyticsDashboardFlow(AnalyticsDashboardFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dod.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDashboardFlow f116530b;

            {
                this.f116530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (m) ((ppd.l) this.f116530b.O.getValue()).f.get();
                    case 1:
                        int i2 = R$id.screen_transparent_container;
                        AnalyticsDashboardFlow analyticsDashboardFlow = this.f116530b;
                        return czi.c.d(i2, 4, null, analyticsDashboardFlow, (m) analyticsDashboardFlow.L.getValue());
                    default:
                        AnalyticsDashboardFlow analyticsDashboardFlow2 = this.f116530b;
                        phm.a aVar = (phm.a) ue0.e.j(analyticsDashboardFlow2.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        AnalyticsDashboardFlowContract$InputData analyticsDashboardFlowContract$InputData = analyticsDashboardFlow2.K;
                        analyticsDashboardFlowContract$InputData.getClass();
                        return new ppd.l(nVar, analyticsDashboardFlowContract$InputData);
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: dod.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDashboardFlow f116530b;

            {
                this.f116530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (m) ((ppd.l) this.f116530b.O.getValue()).f.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        AnalyticsDashboardFlow analyticsDashboardFlow = this.f116530b;
                        return czi.c.d(i22, 4, null, analyticsDashboardFlow, (m) analyticsDashboardFlow.L.getValue());
                    default:
                        AnalyticsDashboardFlow analyticsDashboardFlow2 = this.f116530b;
                        phm.a aVar = (phm.a) ue0.e.j(analyticsDashboardFlow2.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        AnalyticsDashboardFlowContract$InputData analyticsDashboardFlowContract$InputData = analyticsDashboardFlow2.K;
                        analyticsDashboardFlowContract$InputData.getClass();
                        return new ppd.l(nVar, analyticsDashboardFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: dod.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsDashboardFlow f116530b;

            {
                this.f116530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (m) ((ppd.l) this.f116530b.O.getValue()).f.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        AnalyticsDashboardFlow analyticsDashboardFlow = this.f116530b;
                        return czi.c.d(i22, 4, null, analyticsDashboardFlow, (m) analyticsDashboardFlow.L.getValue());
                    default:
                        AnalyticsDashboardFlow analyticsDashboardFlow2 = this.f116530b;
                        phm.a aVar = (phm.a) ue0.e.j(analyticsDashboardFlow2.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        AnalyticsDashboardFlowContract$InputData analyticsDashboardFlowContract$InputData = analyticsDashboardFlow2.K;
                        analyticsDashboardFlowContract$InputData.getClass();
                        return new ppd.l(nVar, analyticsDashboardFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (m) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
