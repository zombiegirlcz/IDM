package com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.ManagedPortfolioDetailsActionsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.ManagedPortfolioDetailsActionsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import eq8.g;
import f7f.d;
import f7f.e;
import f7f.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import w5f.m;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/portfolio_actions/ManagedPortfolioDetailsActionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf7f/d;", "Ldli/a;", "Lf7f/e;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioDetailsActionsScreen extends ViewController<d> implements a {
    public final ManagedPortfolioDetailsActionsScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final Object P;

    public ManagedPortfolioDetailsActionsScreen(ManagedPortfolioDetailsActionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_prompt;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: f7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioDetailsActionsScreen f132601b;

            {
                this.f132601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ManagedPortfolioDetailsActionsScreen managedPortfolioDetailsActionsScreen = this.f132601b;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioDetailsActionsScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioDetailsActionsScreenContract$InputData managedPortfolioDetailsActionsScreenContract$InputData = managedPortfolioDetailsActionsScreen.K;
                        managedPortfolioDetailsActionsScreenContract$InputData.getClass();
                        return new w5f.d(mVar, managedPortfolioDetailsActionsScreenContract$InputData);
                    case 1:
                        return (f) ((w5f.d) this.f132601b.M.getValue()).f295129b.get();
                    default:
                        ManagedPortfolioDetailsActionsScreen managedPortfolioDetailsActionsScreen2 = this.f132601b;
                        return dli.f.a(managedPortfolioDetailsActionsScreen2, (f) managedPortfolioDetailsActionsScreen2.N.getValue(), u.c(managedPortfolioDetailsActionsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: f7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioDetailsActionsScreen f132601b;

            {
                this.f132601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ManagedPortfolioDetailsActionsScreen managedPortfolioDetailsActionsScreen = this.f132601b;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioDetailsActionsScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioDetailsActionsScreenContract$InputData managedPortfolioDetailsActionsScreenContract$InputData = managedPortfolioDetailsActionsScreen.K;
                        managedPortfolioDetailsActionsScreenContract$InputData.getClass();
                        return new w5f.d(mVar, managedPortfolioDetailsActionsScreenContract$InputData);
                    case 1:
                        return (f) ((w5f.d) this.f132601b.M.getValue()).f295129b.get();
                    default:
                        ManagedPortfolioDetailsActionsScreen managedPortfolioDetailsActionsScreen2 = this.f132601b;
                        return dli.f.a(managedPortfolioDetailsActionsScreen2, (f) managedPortfolioDetailsActionsScreen2.N.getValue(), u.c(managedPortfolioDetailsActionsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: f7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioDetailsActionsScreen f132601b;

            {
                this.f132601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ManagedPortfolioDetailsActionsScreen managedPortfolioDetailsActionsScreen = this.f132601b;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioDetailsActionsScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioDetailsActionsScreenContract$InputData managedPortfolioDetailsActionsScreenContract$InputData = managedPortfolioDetailsActionsScreen.K;
                        managedPortfolioDetailsActionsScreenContract$InputData.getClass();
                        return new w5f.d(mVar, managedPortfolioDetailsActionsScreenContract$InputData);
                    case 1:
                        return (f) ((w5f.d) this.f132601b.M.getValue()).f295129b.get();
                    default:
                        ManagedPortfolioDetailsActionsScreen managedPortfolioDetailsActionsScreen2 = this.f132601b;
                        return dli.f.a(managedPortfolioDetailsActionsScreen2, (f) managedPortfolioDetailsActionsScreen2.N.getValue(), u.c(managedPortfolioDetailsActionsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w5f.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new g(rd0.e.b(this.O.f53218h), 17), new ew1.d(this, null, 28), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
