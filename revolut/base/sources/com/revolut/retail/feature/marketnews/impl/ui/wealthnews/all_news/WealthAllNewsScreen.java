package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsScreen;
import com.revolut.retail.wealth.resources.R$string;
import g1k.f;
import g1k.n;
import g1k.t;
import g1k.u;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l0k.d;
import tki.c;
import vc.s;
import xki.e;
import yp0.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/all_news/WealthAllNewsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lg1k/f;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthAllNewsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(WealthAllNewsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final WealthAllNewsContract$InputData K;
    public final Lazy L;
    public final Lazy M;
    public final int N;
    public final h O;
    public final NewsDelegate P;
    public final ListSubheaderDelegate Q;
    public final FullScreenStateDelegate R;
    public final TextDelegate S;
    public final Lazy T;
    public final j U;

    public WealthAllNewsScreen(WealthAllNewsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = yhm.j.b(new Function0(this) { // from class: g1k.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAllNewsScreen f139705b;

            {
                this.f139705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthAllNewsScreen wealthAllNewsScreen = this.f139705b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthAllNewsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthAllNewsScreen.m2()).a().get(l0k.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
                        }
                        l0k.c cVar = ((l0k.c) aVar2.b()).o;
                        WealthAllNewsContract$InputData wealthAllNewsContract$InputData = wealthAllNewsScreen.K;
                        avk.j jVar = wealthAllNewsScreen.U;
                        wealthAllNewsContract$InputData.getClass();
                        jVar.getClass();
                        return new l0k.d(cVar, wealthAllNewsContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = WealthAllNewsScreen.V;
                        return (c) ((l0k.d) wealthAllNewsScreen.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = WealthAllNewsScreen.V;
                        WealthAllNewsScreen wealthAllNewsScreen2 = this.f139705b;
                        return tki.g.a(wealthAllNewsScreen2, wealthAllNewsScreen2.R2(), zhm.v.k(wealthAllNewsScreen2.P, wealthAllNewsScreen2.Q, wealthAllNewsScreen2.R, wealthAllNewsScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.M = yhm.j.b(new Function0(this) { // from class: g1k.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAllNewsScreen f139705b;

            {
                this.f139705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthAllNewsScreen wealthAllNewsScreen = this.f139705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthAllNewsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthAllNewsScreen.m2()).a().get(l0k.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
                        }
                        l0k.c cVar = ((l0k.c) aVar2.b()).o;
                        WealthAllNewsContract$InputData wealthAllNewsContract$InputData = wealthAllNewsScreen.K;
                        avk.j jVar = wealthAllNewsScreen.U;
                        wealthAllNewsContract$InputData.getClass();
                        jVar.getClass();
                        return new l0k.d(cVar, wealthAllNewsContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = WealthAllNewsScreen.V;
                        return (c) ((l0k.d) wealthAllNewsScreen.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = WealthAllNewsScreen.V;
                        WealthAllNewsScreen wealthAllNewsScreen2 = this.f139705b;
                        return tki.g.a(wealthAllNewsScreen2, wealthAllNewsScreen2.R2(), zhm.v.k(wealthAllNewsScreen2.P, wealthAllNewsScreen2.Q, wealthAllNewsScreen2.R, wealthAllNewsScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, n.f);
        this.P = new NewsDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new TextDelegate();
        final int i3 = 2;
        this.T = yhm.j.b(new Function0(this) { // from class: g1k.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAllNewsScreen f139705b;

            {
                this.f139705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WealthAllNewsScreen wealthAllNewsScreen = this.f139705b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthAllNewsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthAllNewsScreen.m2()).a().get(l0k.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
                        }
                        l0k.c cVar = ((l0k.c) aVar2.b()).o;
                        WealthAllNewsContract$InputData wealthAllNewsContract$InputData = wealthAllNewsScreen.K;
                        avk.j jVar = wealthAllNewsScreen.U;
                        wealthAllNewsContract$InputData.getClass();
                        jVar.getClass();
                        return new l0k.d(cVar, wealthAllNewsContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = WealthAllNewsScreen.V;
                        return (c) ((l0k.d) wealthAllNewsScreen.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = WealthAllNewsScreen.V;
                        WealthAllNewsScreen wealthAllNewsScreen2 = this.f139705b;
                        return tki.g.a(wealthAllNewsScreen2, wealthAllNewsScreen2.R2(), zhm.v.k(wealthAllNewsScreen2.P, wealthAllNewsScreen2.Q, wealthAllNewsScreen2.R, wealthAllNewsScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        this.U = new j(this, 8);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f139692a);
        d3().f174539b.setFilters(uiState.f139693b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.invest_smart_notifications_news_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.a(recyclerView, 25, true, new g1.b(this, 13));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new g1k.s(this, null, 0), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(d3().f174539b.s0()), 14), new t(this, continuation, 0), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(d3().f174539b.o.f57403b), 12), new g1k.s(this, null, 1), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(this.P.p()), 15), new t(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new fo6.d(rd0.e.b(this.R.f52371h.f121375b), 13), null, new u(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g1k.c R2() {
        return (g1k.c) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
