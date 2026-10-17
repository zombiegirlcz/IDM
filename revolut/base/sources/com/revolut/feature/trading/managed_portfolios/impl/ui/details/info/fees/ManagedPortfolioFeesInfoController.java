package com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.fees;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.fees.ManagedPortfolioFeesInfoController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.fees.ManagedPortfolioFeesInfoControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u4e.i;
import u6f.b;
import u6f.c;
import u6f.f;
import vc.s;
import w5f.g;
import w5f.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/info/fees/ManagedPortfolioFeesInfoController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lu6f/f;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioFeesInfoController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ManagedPortfolioFeesInfoController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ManagedPortfolioFeesInfoControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final PlainTextDelegate O;
    public final Object P;
    public final h Q;

    public ManagedPortfolioFeesInfoController(ManagedPortfolioFeesInfoControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: u6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioFeesInfoController f277586b;

            {
                this.f277586b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManagedPortfolioFeesInfoController managedPortfolioFeesInfoController = this.f277586b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioFeesInfoController.R;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioFeesInfoController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioFeesInfoControllerContract$InputData managedPortfolioFeesInfoControllerContract$InputData = managedPortfolioFeesInfoController.K;
                        managedPortfolioFeesInfoControllerContract$InputData.getClass();
                        return new w5f.g(mVar, managedPortfolioFeesInfoControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioFeesInfoController.R;
                        return (e) ((w5f.g) managedPortfolioFeesInfoController.M.getValue()).f295176b.get();
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioFeesInfoController.R;
                        ManagedPortfolioFeesInfoController managedPortfolioFeesInfoController2 = this.f277586b;
                        return dli.f.a(managedPortfolioFeesInfoController2, (e) managedPortfolioFeesInfoController2.N.getValue(), v.k(managedPortfolioFeesInfoController2.O, new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: u6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioFeesInfoController f277586b;

            {
                this.f277586b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManagedPortfolioFeesInfoController managedPortfolioFeesInfoController = this.f277586b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioFeesInfoController.R;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioFeesInfoController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioFeesInfoControllerContract$InputData managedPortfolioFeesInfoControllerContract$InputData = managedPortfolioFeesInfoController.K;
                        managedPortfolioFeesInfoControllerContract$InputData.getClass();
                        return new w5f.g(mVar, managedPortfolioFeesInfoControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioFeesInfoController.R;
                        return (e) ((w5f.g) managedPortfolioFeesInfoController.M.getValue()).f295176b.get();
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioFeesInfoController.R;
                        ManagedPortfolioFeesInfoController managedPortfolioFeesInfoController2 = this.f277586b;
                        return dli.f.a(managedPortfolioFeesInfoController2, (e) managedPortfolioFeesInfoController2.N.getValue(), v.k(managedPortfolioFeesInfoController2.O, new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
        this.O = new PlainTextDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: u6f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioFeesInfoController f277586b;

            {
                this.f277586b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManagedPortfolioFeesInfoController managedPortfolioFeesInfoController = this.f277586b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioFeesInfoController.R;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioFeesInfoController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        ManagedPortfolioFeesInfoControllerContract$InputData managedPortfolioFeesInfoControllerContract$InputData = managedPortfolioFeesInfoController.K;
                        managedPortfolioFeesInfoControllerContract$InputData.getClass();
                        return new w5f.g(mVar, managedPortfolioFeesInfoControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioFeesInfoController.R;
                        return (e) ((w5f.g) managedPortfolioFeesInfoController.M.getValue()).f295176b.get();
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioFeesInfoController.R;
                        ManagedPortfolioFeesInfoController managedPortfolioFeesInfoController2 = this.f277586b;
                        return dli.f.a(managedPortfolioFeesInfoController2, (e) managedPortfolioFeesInfoController2.N.getValue(), v.k(managedPortfolioFeesInfoController2.O, new RowDelegate(null, null, 7)), 0, null, null, null, 60);
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f277589a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (u6f.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, continuation, 0), 3);
        r rVarFilter = this.O.d.f121375b.filter(new u3a.q(new i(18), 10));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new c(this, continuation, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
