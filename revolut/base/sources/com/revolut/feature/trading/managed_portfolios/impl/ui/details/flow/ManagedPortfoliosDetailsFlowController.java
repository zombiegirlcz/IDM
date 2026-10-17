package com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow;

import aii.q;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import w5f.m;
import w5f.o;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/flow/ManagedPortfoliosDetailsFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfoliosDetailsFlowController extends ViewController<q> implements f {
    public final ManagedPortfoliosDetailsFlowControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ManagedPortfoliosDetailsFlowController(ManagedPortfoliosDetailsFlowControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: s6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosDetailsFlowController f260337b;

            {
                this.f260337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ManagedPortfoliosDetailsFlowController managedPortfoliosDetailsFlowController = this.f260337b;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfoliosDetailsFlowController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfoliosDetailsFlowControllerContract$InputData managedPortfoliosDetailsFlowControllerContract$InputData = managedPortfoliosDetailsFlowController.K;
                        managedPortfoliosDetailsFlowControllerContract$InputData.getClass();
                        return new o(mVar, managedPortfoliosDetailsFlowControllerContract$InputData);
                    case 1:
                        return (b) ((o) this.f260337b.L.getValue()).f295210b.get();
                    default:
                        ManagedPortfoliosDetailsFlowController managedPortfoliosDetailsFlowController2 = this.f260337b;
                        return czi.c.d(0, 6, null, managedPortfoliosDetailsFlowController2, (b) managedPortfoliosDetailsFlowController2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: s6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosDetailsFlowController f260337b;

            {
                this.f260337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ManagedPortfoliosDetailsFlowController managedPortfoliosDetailsFlowController = this.f260337b;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfoliosDetailsFlowController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfoliosDetailsFlowControllerContract$InputData managedPortfoliosDetailsFlowControllerContract$InputData = managedPortfoliosDetailsFlowController.K;
                        managedPortfoliosDetailsFlowControllerContract$InputData.getClass();
                        return new o(mVar, managedPortfoliosDetailsFlowControllerContract$InputData);
                    case 1:
                        return (b) ((o) this.f260337b.L.getValue()).f295210b.get();
                    default:
                        ManagedPortfoliosDetailsFlowController managedPortfoliosDetailsFlowController2 = this.f260337b;
                        return czi.c.d(0, 6, null, managedPortfoliosDetailsFlowController2, (b) managedPortfoliosDetailsFlowController2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: s6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosDetailsFlowController f260337b;

            {
                this.f260337b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ManagedPortfoliosDetailsFlowController managedPortfoliosDetailsFlowController = this.f260337b;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfoliosDetailsFlowController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfoliosDetailsFlowControllerContract$InputData managedPortfoliosDetailsFlowControllerContract$InputData = managedPortfoliosDetailsFlowController.K;
                        managedPortfoliosDetailsFlowControllerContract$InputData.getClass();
                        return new o(mVar, managedPortfoliosDetailsFlowControllerContract$InputData);
                    case 1:
                        return (b) ((o) this.f260337b.L.getValue()).f295210b.get();
                    default:
                        ManagedPortfoliosDetailsFlowController managedPortfoliosDetailsFlowController2 = this.f260337b;
                        return czi.c.d(0, 6, null, managedPortfoliosDetailsFlowController2, (b) managedPortfoliosDetailsFlowController2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (s6f.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
