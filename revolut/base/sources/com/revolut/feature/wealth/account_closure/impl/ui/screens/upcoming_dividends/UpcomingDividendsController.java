package com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends.UpcomingDividendsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;
import zt4.l;
import ztg.m;
import zug.b;
import zug.d;
import zug.e;
import zug.g;
import zug.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/upcoming_dividends/UpcomingDividendsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzug/e;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpcomingDividendsController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(UpcomingDividendsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final FixedTabsDelegate L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;

    public UpcomingDividendsController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, g.f);
        this.L = new FixedTabsDelegate();
        this.M = new FullScreenStateDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: zug.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpcomingDividendsController f325460b;

            {
                this.f325460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = UpcomingDividendsController.R;
                        return (i) ((m) this.f325460b.O.getValue()).f325147b.get();
                    default:
                        KProperty[] kPropertyArr2 = UpcomingDividendsController.R;
                        UpcomingDividendsController upcomingDividendsController = this.f325460b;
                        return dli.f.a(upcomingDividendsController, (i) upcomingDividendsController.N.getValue(), v.k(upcomingDividendsController.L, upcomingDividendsController.M), 0, null, null, null, 60);
                }
            }
        });
        this.O = w.y0(new zk7.a(this, inputData, 18));
        this.P = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zug.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpcomingDividendsController f325460b;

            {
                this.f325460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpcomingDividendsController.R;
                        return (i) ((m) this.f325460b.O.getValue()).f325147b.get();
                    default:
                        KProperty[] kPropertyArr2 = UpcomingDividendsController.R;
                        UpcomingDividendsController upcomingDividendsController = this.f325460b;
                        return dli.f.a(upcomingDividendsController, (i) upcomingDividendsController.N.getValue(), v.k(upcomingDividendsController.L, upcomingDividendsController.M), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        d dVar = uiState.f325458b;
        TextLocalisedClause textLocalisedClause = dVar.f325455a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(dVar.f325456b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitleAutoSize(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new zub.b(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52339c.f121375b), new l(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new zug.h(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
