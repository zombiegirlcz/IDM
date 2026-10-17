package com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m18.f;
import tki.c;
import vc.s;
import wuk.g;
import x18.k;
import x18.l;
import x18.m;
import x18.n;
import x18.o;
import x18.p;
import x18.v;
import xki.e;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lx18/v;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartFeedScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(SmartFeedScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SmartFeedScreenContract$InputData K;
    public final Lazy L;
    public final Lazy M;
    public final int N;
    public final h O;
    public final NewsDelegate P;
    public final ListSubheaderDelegate Q;
    public final FullScreenStateDelegate R;
    public final TextDelegate S;
    public final Lazy T;
    public final o U;
    public final g V;

    public SmartFeedScreen(SmartFeedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: x18.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SmartFeedScreen f302336b;

            {
                this.f302336b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SmartFeedScreen smartFeedScreen = this.f302336b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SmartFeedScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(smartFeedScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        SmartFeedScreenContract$InputData smartFeedScreenContract$InputData = smartFeedScreen.K;
                        o oVar = smartFeedScreen.U;
                        wuk.g gVar = smartFeedScreen.V;
                        smartFeedScreenContract$InputData.getClass();
                        oVar.getClass();
                        gVar.getClass();
                        return new m18.f(eVar, smartFeedScreenContract$InputData, oVar, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = SmartFeedScreen.W;
                        return (p) ((m18.f) smartFeedScreen.L.getValue()).f201283j.get();
                    default:
                        KProperty[] kPropertyArr3 = SmartFeedScreen.W;
                        SmartFeedScreen smartFeedScreen2 = this.f302336b;
                        return tki.g.a(smartFeedScreen2, smartFeedScreen2.d(), zhm.v.k(smartFeedScreen2.P, smartFeedScreen2.Q, smartFeedScreen2.R, smartFeedScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = j.b(new Function0(this) { // from class: x18.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SmartFeedScreen f302336b;

            {
                this.f302336b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SmartFeedScreen smartFeedScreen = this.f302336b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SmartFeedScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(smartFeedScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        SmartFeedScreenContract$InputData smartFeedScreenContract$InputData = smartFeedScreen.K;
                        o oVar = smartFeedScreen.U;
                        wuk.g gVar = smartFeedScreen.V;
                        smartFeedScreenContract$InputData.getClass();
                        oVar.getClass();
                        gVar.getClass();
                        return new m18.f(eVar, smartFeedScreenContract$InputData, oVar, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = SmartFeedScreen.W;
                        return (p) ((m18.f) smartFeedScreen.L.getValue()).f201283j.get();
                    default:
                        KProperty[] kPropertyArr3 = SmartFeedScreen.W;
                        SmartFeedScreen smartFeedScreen2 = this.f302336b;
                        return tki.g.a(smartFeedScreen2, smartFeedScreen2.d(), zhm.v.k(smartFeedScreen2.P, smartFeedScreen2.Q, smartFeedScreen2.R, smartFeedScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, x18.h.f);
        this.P = new NewsDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new TextDelegate();
        final int i3 = 2;
        this.T = j.b(new Function0(this) { // from class: x18.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SmartFeedScreen f302336b;

            {
                this.f302336b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SmartFeedScreen smartFeedScreen = this.f302336b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SmartFeedScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(smartFeedScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        SmartFeedScreenContract$InputData smartFeedScreenContract$InputData = smartFeedScreen.K;
                        o oVar = smartFeedScreen.U;
                        wuk.g gVar = smartFeedScreen.V;
                        smartFeedScreenContract$InputData.getClass();
                        oVar.getClass();
                        gVar.getClass();
                        return new m18.f(eVar, smartFeedScreenContract$InputData, oVar, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = SmartFeedScreen.W;
                        return (p) ((m18.f) smartFeedScreen.L.getValue()).f201283j.get();
                    default:
                        KProperty[] kPropertyArr3 = SmartFeedScreen.W;
                        SmartFeedScreen smartFeedScreen2 = this.f302336b;
                        return tki.g.a(smartFeedScreen2, smartFeedScreen2.d(), zhm.v.k(smartFeedScreen2.P, smartFeedScreen2.Q, smartFeedScreen2.R, smartFeedScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.U = new o(this);
        this.V = new g(this, 1);
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f302345a);
        d3().f174539b.setFilters(uiState.f302346b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.invest_smart_notifications_feed_home_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new x18.j(this, null, 0), 3);
        ViewController.P2(this, new wvl.b(rd0.e.b(d3().f174539b.o.f57403b), 13), new x18.j(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52707c), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new l(this, null), 3);
        NewsDelegate newsDelegate = this.P;
        ViewController.P2(this, rd0.e.b(newsDelegate.p()), new m(this, null), 3);
        ViewController.P2(this, kii.e.t(newsDelegate.f, "hide(...)"), new wuh.q(this, (Continuation) null, 22), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new n(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.M.getValue();
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
