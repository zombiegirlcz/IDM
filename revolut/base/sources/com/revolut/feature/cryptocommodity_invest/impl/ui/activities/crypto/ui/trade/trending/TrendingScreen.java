package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.TrendingScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ix5.i;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.d;
import pki.b;
import rwg.e0;
import rx5.c;
import rx5.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trending/TrendingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lrx5/c;", "<init>", "()V", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrendingScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TrendingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object O;
    public final Object M = w.y0(new e0(2));
    public final Object N = w.y0(new e0(3));
    public final h P = s.t(this, a.f);
    public final int Q = R$layout.screen_recycler_navbar;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TrendingScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: rx5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrendingScreen f258031b;

            {
                this.f258031b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrendingScreen trendingScreen = this.f258031b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TrendingScreen.R;
                        qji.b bVarU2 = trendingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.di.TrendingScreenInjector");
                        ix5.e eVar = (ix5.e) bVarU2;
                        return new ix5.i(eVar.f169360b, eVar.f169361c);
                    case 1:
                        KProperty[] kPropertyArr2 = TrendingScreen.R;
                        return (b) ((ix5.i) trendingScreen.K.getValue()).f169378c.get();
                    default:
                        KProperty[] kPropertyArr3 = TrendingScreen.R;
                        TrendingScreen trendingScreen2 = this.f258031b;
                        return dli.f.a(trendingScreen2, (b) trendingScreen2.L.getValue(), v.k((ListSubheaderDelegate) trendingScreen2.M.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) trendingScreen2.N.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: rx5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrendingScreen f258031b;

            {
                this.f258031b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrendingScreen trendingScreen = this.f258031b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrendingScreen.R;
                        qji.b bVarU2 = trendingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.di.TrendingScreenInjector");
                        ix5.e eVar = (ix5.e) bVarU2;
                        return new ix5.i(eVar.f169360b, eVar.f169361c);
                    case 1:
                        KProperty[] kPropertyArr2 = TrendingScreen.R;
                        return (b) ((ix5.i) trendingScreen.K.getValue()).f169378c.get();
                    default:
                        KProperty[] kPropertyArr3 = TrendingScreen.R;
                        TrendingScreen trendingScreen2 = this.f258031b;
                        return dli.f.a(trendingScreen2, (b) trendingScreen2.L.getValue(), v.k((ListSubheaderDelegate) trendingScreen2.M.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) trendingScreen2.N.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: rx5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrendingScreen f258031b;

            {
                this.f258031b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TrendingScreen trendingScreen = this.f258031b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrendingScreen.R;
                        qji.b bVarU2 = trendingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.di.TrendingScreenInjector");
                        ix5.e eVar = (ix5.e) bVarU2;
                        return new ix5.i(eVar.f169360b, eVar.f169361c);
                    case 1:
                        KProperty[] kPropertyArr2 = TrendingScreen.R;
                        return (b) ((ix5.i) trendingScreen.K.getValue()).f169378c.get();
                    default:
                        KProperty[] kPropertyArr3 = TrendingScreen.R;
                        TrendingScreen trendingScreen2 = this.f258031b;
                        return dli.f.a(trendingScreen2, (b) trendingScreen2.L.getValue(), v.k((ListSubheaderDelegate) trendingScreen2.M.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) trendingScreen2.N.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174539b.setFilters(u.c(new ActionsView.Item("TIMEFRAME_ACTION_LIST_ID", d.SEMIBLACK, false, null, null, uiState.f258028a, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (rx5.b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_trade_trending_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_trade_trending_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.crypto_trade_trending_subtitle, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new rlh.c(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new rx5.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
