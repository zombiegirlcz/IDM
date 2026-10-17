package com.revolut.feature.pockets.impl.details_v2.pocket_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalSmallButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.tracking.v3.AccountDetailsContext;
import dli.c;
import h30.l;
import hea.e;
import hea.g;
import hea.i;
import hea.j;
import hea.m;
import hea.n;
import hea.p;
import ihm.f;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhea/q;", "Lno/k;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PocketDetailsScreen extends ViewController<q> implements dli.a, k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f80841e0 = {o0.f186429a.j(new h0(PocketDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PocketDetailsScreenContract$InputData K;
    public AnalyticsContext L;
    public final h M;
    public final int N;
    public final ActionWidgetDelegate O;
    public final PlainTextWarningDelegate P;
    public final f Q;
    public final ScrollerDelegate R;
    public final TextDelegate S;
    public final RowDelegate T;
    public final LargeActionButtonDelegate U;
    public final SmallActionButtonDelegate V;
    public final TwinHorizontalSmallButtonDelegate W;
    public final TwinHorizontalButtonDelegate X;
    public final CellDetailsAccountDelegate Y;
    public final FixedTabsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f80842a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f80843b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f80844d0;

    public PocketDetailsScreen(PocketDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        AccountDetailsContext.a aVarNewBuilder = AccountDetailsContext.newBuilder();
        aVarNewBuilder.h(inputData.f80845a.f163147c);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.L = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        this.M = s.t(this, hea.f.f);
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.O = actionWidgetDelegate;
        this.P = new PlainTextWarningDelegate();
        this.Q = v0.a.d("create(...)");
        this.R = new ScrollerDelegate(v.k(heroBannerDelegate, actionWidgetDelegate), false);
        this.S = new TextDelegate();
        this.T = new RowDelegate(null, null, 7);
        this.U = new LargeActionButtonDelegate();
        this.V = new SmallActionButtonDelegate();
        this.W = new TwinHorizontalSmallButtonDelegate();
        this.X = new TwinHorizontalButtonDelegate();
        this.Y = new CellDetailsAccountDelegate();
        this.Z = new FixedTabsDelegate();
        this.f80842a0 = new FullScreenStateDelegate();
        this.f80843b0 = w.y0(new e(this, 0));
        this.c0 = w.y0(new e(this, 1));
        this.f80844d0 = w.y0(new e(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        hea.q uiState = (hea.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause clause = uiState.f151658b;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, clause, uiState.f151659c, null, 4, null);
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setNavBarDescriptionModel(uiState.d);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(this.K.f80849h != null ? 0 : 8);
        if (largeActionButton.getVisibility() == 0) {
            l.A(R.string.button_action_done, null, null, 14, largeActionButton);
            largeActionButton.o(LargeActionButton.ButtonStyle.e);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (iea.a) this.c0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((oda.k) ((iea.a) this.c0.getValue())).f224371g.get()).d(v.k(this.T, this.X, this.U));
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setLoadingButtonTag("GOTO_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.p0()), new exe.k(2, d(), p.class, "onDescriptionClauseClick", "onDescriptionClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 22), 3);
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.q0.f), new hea.l(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new hea.l(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new hea.l(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((j60.a) ((oda.k) ((iea.a) this.c0.getValue())).f224371g.get()).C()), new hea.h(this, continuation, 7), 3);
        RowDelegate rowDelegate = this.T;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new hea.h(this, continuation, 8), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new hea.h(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(this.U.d.f121375b), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.f53336c.f121375b), new g(2, 4, p.class, d(), "onSmallActionButtonClicked", "onSmallActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/SmallActionButtonDelegate$Model;)V"), 3);
        TwinHorizontalSmallButtonDelegate twinHorizontalSmallButtonDelegate = this.W;
        ViewController.P2(this, rd0.e.b(twinHorizontalSmallButtonDelegate.f53573c.f121375b), new hea.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalSmallButtonDelegate.d.f121375b), new hea.h(this, continuation, 1), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.X;
        int i = 2;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new hea.h(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new hea.h(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.Y.d), new hea.h(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.Z.f52339c.f121375b), new hea.h(this, continuation, 5), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.f80842a0;
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.d), new hea.h(this, continuation, 6), 3);
        PlainTextWarningDelegate plainTextWarningDelegate = this.P;
        int i2 = 4;
        ViewController.P2(this, rd0.e.b(plainTextWarningDelegate.d.f121375b), new exe.k(i, d(), p.class, "onBannerActionClicked", "onBannerActionClicked(Lcom/revolut/core/ui_kit/delegates/PlainTextWarningDelegate$ActionClickData;)V", i2, 21), 3);
        ViewController.P2(this, rd0.e.b(plainTextWarningDelegate.s()), new exe.k(i, d(), p.class, "onBannerHighlightClicked", "onBannerHighlightClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i2, 23), 3);
        ViewController.P2(this, rd0.e.b(this.O.f51589c.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new hea.k(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, f80841e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.f80844d0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.f80843b0.getValue();
    }
}
