package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights;

import a0.d;
import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.InsightsFlow;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.InsightsFlowContract$InputData;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import prk.g0;
import prk.n0;
import prk.x;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsightsFlow extends ViewController<q> implements f {
    public final InsightsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public InsightsFlow(InsightsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsFlow f249168b;

            {
                this.f249168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InsightsFlow insightsFlow = this.f249168b;
                        return c.d(0, 6, null, insightsFlow, (b) insightsFlow.N.getValue());
                    case 1:
                        InsightsFlow insightsFlow2 = this.f249168b;
                        phm.a aVar = (phm.a) e.j(insightsFlow2.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        InsightsFlowContract$InputData insightsFlowContract$InputData = insightsFlow2.K;
                        insightsFlowContract$InputData.getClass();
                        return new x(g0Var, insightsFlowContract$InputData);
                    default:
                        return (b) ((x) this.f249168b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: qtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsFlow f249168b;

            {
                this.f249168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InsightsFlow insightsFlow = this.f249168b;
                        return c.d(0, 6, null, insightsFlow, (b) insightsFlow.N.getValue());
                    case 1:
                        InsightsFlow insightsFlow2 = this.f249168b;
                        phm.a aVar = (phm.a) e.j(insightsFlow2.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        InsightsFlowContract$InputData insightsFlowContract$InputData = insightsFlow2.K;
                        insightsFlowContract$InputData.getClass();
                        return new x(g0Var, insightsFlowContract$InputData);
                    default:
                        return (b) ((x) this.f249168b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: qtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsFlow f249168b;

            {
                this.f249168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InsightsFlow insightsFlow = this.f249168b;
                        return c.d(0, 6, null, insightsFlow, (b) insightsFlow.N.getValue());
                    case 1:
                        InsightsFlow insightsFlow2 = this.f249168b;
                        phm.a aVar = (phm.a) e.j(insightsFlow2.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        InsightsFlowContract$InputData insightsFlowContract$InputData = insightsFlow2.K;
                        insightsFlowContract$InputData.getClass();
                        return new x(g0Var, insightsFlowContract$InputData);
                    default:
                        return (b) ((x) this.f249168b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (qtk.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
