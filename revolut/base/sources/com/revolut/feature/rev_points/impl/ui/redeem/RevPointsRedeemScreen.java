package com.revolut.feature.rev_points.impl.ui.redeem;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import buf.u;
import c0c.g;
import c0c.i;
import c0c.j;
import c0c.l;
import c0c.m;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import d0c.c;
import dli.a;
import ihm.f;
import koi.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/redeem/RevPointsRedeemScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lc0c/m;", "Lno/k;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsRedeemScreen extends ViewController<q> implements a, k {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(RevPointsRedeemScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsRedeemBinding;", 0))};
    public final int K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public final VoucherSmallTileDelegate N;
    public final ActionWidgetDelegate O;
    public final ScrollerDelegate P;
    public final h Q;
    public final Object R;
    public AnalyticsContext S;
    public final f T;
    public final ao.h U;
    public final Object V;
    public final Object W;

    public RevPointsRedeemScreen(RevPointsRedeemScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_rev_points_redeem;
        this.L = new FullScreenStateDelegate();
        this.M = new RowDelegate(null, null, 7);
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.N = voucherSmallTileDelegate;
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.O = actionWidgetDelegate;
        final int i = 0;
        final int i2 = 1;
        this.P = new ScrollerDelegate(v.k(actionWidgetDelegate, voucherSmallTileDelegate, new VoucherSmallLoadingDelegate()), false);
        this.Q = new h(null, false, true, 3);
        this.R = w.y0(new Function0(this) { // from class: c0c.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsRedeemScreen f20207b;

            {
                this.f20207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsRedeemScreen.X;
                        RevPointsRedeemScreen revPointsRedeemScreen = this.f20207b;
                        return dli.f.a(revPointsRedeemScreen, revPointsRedeemScreen.d(), d0.E0(((fd6.a) ((zxb.t) ((d0c.c) revPointsRedeemScreen.V.getValue())).d.get()).e, v.k(revPointsRedeemScreen.L, revPointsRedeemScreen.M, revPointsRedeemScreen.P, revPointsRedeemScreen.O, new RowLoadingDelegate(), new ListSubheaderDelegate())), R$id.revPointsRedeemScreen_recyclerView, null, revPointsRedeemScreen.Q, null, 40);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsRedeemScreen.X;
                        return (l) ((zxb.t) ((d0c.c) this.f20207b.V.getValue())).T.get();
                }
            }
        });
        this.T = v0.a.d("create(...)");
        this.U = s.t(this, c0c.f.f);
        this.V = w.y0(new u(this, inputData, 16));
        this.W = w.y0(new Function0(this) { // from class: c0c.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsRedeemScreen f20207b;

            {
                this.f20207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsRedeemScreen.X;
                        RevPointsRedeemScreen revPointsRedeemScreen = this.f20207b;
                        return dli.f.a(revPointsRedeemScreen, revPointsRedeemScreen.d(), d0.E0(((fd6.a) ((zxb.t) ((d0c.c) revPointsRedeemScreen.V.getValue())).d.get()).e, v.k(revPointsRedeemScreen.L, revPointsRedeemScreen.M, revPointsRedeemScreen.P, revPointsRedeemScreen.O, new RowLoadingDelegate(), new ListSubheaderDelegate())), R$id.revPointsRedeemScreen_recyclerView, null, revPointsRedeemScreen.Q, null, 40);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsRedeemScreen.X;
                        return (l) ((zxb.t) ((d0c.c) this.f20207b.V.getValue())).T.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f300832b.setMenuItems(uiState.f20213a);
        this.S = uiState.f20214b;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.S = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.V.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getS() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void W() {
        super.W();
        ((c0c.s) d()).z.a();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300832b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.rev_points_redeem_hub_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_points_redeem_hub_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f300832b.f59410q), new brc.h(this, continuation, 20), 3);
        ViewController.P2(this, rd0.e.b(d3().f300832b.o.f57403b), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new c0c.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53608c), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.i), new g(this, continuation, 1), 3);
    }

    public final wxb.j d3() {
        ViewBinding value = this.U.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxb.j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
