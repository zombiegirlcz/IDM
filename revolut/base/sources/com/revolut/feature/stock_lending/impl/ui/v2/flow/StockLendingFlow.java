package com.revolut.feature.stock_lending.impl.ui.v2.flow;

import a0.d;
import aii.q;
import com.revolut.feature.stock_lending.impl.ui.v2.flow.StockLendingFlow;
import com.revolut.feature.stock_lending.impl.ui.v2.flow.StockLendingFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/ui/v2/flow/StockLendingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockLendingFlow extends ViewController<q> implements f {
    public final StockLendingFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public StockLendingFlow(StockLendingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: l1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingFlow f191530b;

            {
                this.f191530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        StockLendingFlow stockLendingFlow = this.f191530b;
                        return c.d(0, 6, null, stockLendingFlow, (b) stockLendingFlow.N.getValue());
                    case 1:
                        StockLendingFlow stockLendingFlow2 = this.f191530b;
                        phm.a aVar = (phm.a) e.j(stockLendingFlow2.m2()).a().get(u0e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", u0e.a.class, " is not found"));
                        }
                        a1e.b bVar = ((a1e.b) aVar2.b()).f595l;
                        StockLendingFlowContract$InputData stockLendingFlowContract$InputData = stockLendingFlow2.K;
                        stockLendingFlowContract$InputData.getClass();
                        return new a1e.e(bVar, stockLendingFlowContract$InputData);
                    default:
                        return (b) ((a1e.e) this.f191530b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: l1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingFlow f191530b;

            {
                this.f191530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        StockLendingFlow stockLendingFlow = this.f191530b;
                        return c.d(0, 6, null, stockLendingFlow, (b) stockLendingFlow.N.getValue());
                    case 1:
                        StockLendingFlow stockLendingFlow2 = this.f191530b;
                        phm.a aVar = (phm.a) e.j(stockLendingFlow2.m2()).a().get(u0e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", u0e.a.class, " is not found"));
                        }
                        a1e.b bVar = ((a1e.b) aVar2.b()).f595l;
                        StockLendingFlowContract$InputData stockLendingFlowContract$InputData = stockLendingFlow2.K;
                        stockLendingFlowContract$InputData.getClass();
                        return new a1e.e(bVar, stockLendingFlowContract$InputData);
                    default:
                        return (b) ((a1e.e) this.f191530b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: l1e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockLendingFlow f191530b;

            {
                this.f191530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        StockLendingFlow stockLendingFlow = this.f191530b;
                        return c.d(0, 6, null, stockLendingFlow, (b) stockLendingFlow.N.getValue());
                    case 1:
                        StockLendingFlow stockLendingFlow2 = this.f191530b;
                        phm.a aVar = (phm.a) e.j(stockLendingFlow2.m2()).a().get(u0e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", u0e.a.class, " is not found"));
                        }
                        a1e.b bVar = ((a1e.b) aVar2.b()).f595l;
                        StockLendingFlowContract$InputData stockLendingFlowContract$InputData = stockLendingFlow2.K;
                        stockLendingFlowContract$InputData.getClass();
                        return new a1e.e(bVar, stockLendingFlowContract$InputData);
                    default:
                        return (b) ((a1e.e) this.f191530b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a1e.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (a1e.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l1e.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
