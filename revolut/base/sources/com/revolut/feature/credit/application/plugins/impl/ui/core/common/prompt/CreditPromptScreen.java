package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerLinearLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.b8;
import dw3.c8;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njj.l;
import q97.b1;
import r74.c;
import r74.f;
import r74.g;
import r74.i;
import r74.m;
import r74.n;
import r74.p;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yhm.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/CreditPromptScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/a;", "Ldli/a;", "Lr74/p;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class CreditPromptScreen extends PluginScreenController<a> implements dli.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f67328a0 = {o0.f186429a.j(new h0(CreditPromptScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditPromptBinding;", 0))};
    public final CreditPromptScreenContract$InputData L;
    public final int M;
    public AnalyticsContext N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final PromptMarketingContentDelegate R;
    public final PromptMarketingContentLoadingDelegate S;
    public final LightPromptDelegate T;
    public final FullScreenStateDelegate U;
    public final NotificationCentreItemDelegate V;
    public final PlainTextDelegate W;
    public final RowDelegate X;
    public final Object Y;
    public final Object Z;

    public CreditPromptScreen(CreditPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_prompt;
        this.N = inputData.f67331c;
        this.O = s.t(this, c.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: r74.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPromptScreen f251985b;

            {
                this.f251985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditPromptScreen creditPromptScreen = this.f251985b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditPromptScreen.f67328a0;
                        qji.b bVarU2 = creditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(creditPromptScreen)).b(creditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditPromptScreen.f67328a0;
                        return ((c8) creditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(creditPromptScreen.R, creditPromptScreen.S, creditPromptScreen.T, creditPromptScreen.V, creditPromptScreen.W, creditPromptScreen.U, creditPromptScreen.X, new FooterTextDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = CreditPromptScreen.f67328a0;
                        CreditPromptScreen creditPromptScreen2 = this.f251985b;
                        return dli.f.a(creditPromptScreen2, creditPromptScreen2.d(), (List) creditPromptScreen2.Y.getValue(), R$id.screenCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: r74.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPromptScreen f251985b;

            {
                this.f251985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditPromptScreen creditPromptScreen = this.f251985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditPromptScreen.f67328a0;
                        qji.b bVarU2 = creditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(creditPromptScreen)).b(creditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditPromptScreen.f67328a0;
                        return ((c8) creditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(creditPromptScreen.R, creditPromptScreen.S, creditPromptScreen.T, creditPromptScreen.V, creditPromptScreen.W, creditPromptScreen.U, creditPromptScreen.X, new FooterTextDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = CreditPromptScreen.f67328a0;
                        CreditPromptScreen creditPromptScreen2 = this.f251985b;
                        return dli.f.a(creditPromptScreen2, creditPromptScreen2.d(), (List) creditPromptScreen2.Y.getValue(), R$id.screenCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new PromptMarketingContentDelegate();
        this.S = new PromptMarketingContentLoadingDelegate();
        this.T = new LightPromptDelegate(null);
        this.U = new FullScreenStateDelegate();
        this.V = new NotificationCentreItemDelegate();
        this.W = new PlainTextDelegate();
        this.X = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: r74.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPromptScreen f251985b;

            {
                this.f251985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditPromptScreen creditPromptScreen = this.f251985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditPromptScreen.f67328a0;
                        qji.b bVarU2 = creditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(creditPromptScreen)).b(creditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditPromptScreen.f67328a0;
                        return ((c8) creditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(creditPromptScreen.R, creditPromptScreen.S, creditPromptScreen.T, creditPromptScreen.V, creditPromptScreen.W, creditPromptScreen.U, creditPromptScreen.X, new FooterTextDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = CreditPromptScreen.f67328a0;
                        CreditPromptScreen creditPromptScreen2 = this.f251985b;
                        return dli.f.a(creditPromptScreen2, creditPromptScreen2.d(), (List) creditPromptScreen2.Y.getValue(), R$id.screenCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: r74.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPromptScreen f251985b;

            {
                this.f251985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditPromptScreen creditPromptScreen = this.f251985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditPromptScreen.f67328a0;
                        qji.b bVarU2 = creditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(creditPromptScreen)).b(creditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditPromptScreen.f67328a0;
                        return ((c8) creditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(creditPromptScreen.R, creditPromptScreen.S, creditPromptScreen.T, creditPromptScreen.V, creditPromptScreen.W, creditPromptScreen.U, creditPromptScreen.X, new FooterTextDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = CreditPromptScreen.f67328a0;
                        CreditPromptScreen creditPromptScreen2 = this.f251985b;
                        return dli.f.a(creditPromptScreen2, creditPromptScreen2.d(), (List) creditPromptScreen2.Y.getValue(), R$id.screenCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (!(uiState instanceof m)) {
            if (uiState instanceof n) {
                n nVar = (n) uiState;
                g3().setNavigationButtonImage(nVar.f252000c);
                g3().setVisibility(nVar.f251999b ? 0 : 8);
                LegacyContentContainerLinearLayout screenCreditPromptLayoutButtons = d3().f10693c;
                Intrinsics.checkNotNullExpressionValue(screenCreditPromptLayoutButtons, "screenCreditPromptLayoutButtons");
                screenCreditPromptLayoutButtons.setVisibility(8);
                return;
            }
            if (!(uiState instanceof r74.o)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("UI state ", o0.f186429a.b(uiState.getClass()).m(), " is not supported by CreditPromptScreen, please use MediaHeaderCreditPromptScreen"));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        m mVar = (m) uiState;
        Clause clause = mVar.d;
        TextLocalisedClause textLocalisedClause = mVar.f251993a;
        NavBarWithToolbar navBarWithToolbarG3 = g3();
        navBarWithToolbarG3.setVisibility(0);
        Clause clause2 = mVar.f251995c;
        navBarWithToolbarG3.setToolbarTitle(textLocalisedClause);
        navBarWithToolbarG3.setTitle(textLocalisedClause, null);
        Clause clause3 = mVar.f251994b;
        navBarWithToolbarG3.setDescriptionText(clause3);
        navBarWithToolbarG3.setDescriptionVisible(clause3 != null);
        navBarWithToolbarG3.setSecondDescriptionText(clause2);
        navBarWithToolbarG3.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbarG3.setNavigationButtonImage(mVar.f251997h);
        LegacyContentContainerLinearLayout screenCreditPromptLayoutButtons2 = d3().f10693c;
        Intrinsics.checkNotNullExpressionValue(screenCreditPromptLayoutButtons2, "screenCreditPromptLayoutButtons");
        screenCreditPromptLayoutButtons2.setVisibility(0);
        LargeActionButton largeActionButtonF3 = f3();
        Clause clause4 = mVar.f;
        largeActionButtonF3.setVisibility(clause != null ? 0 : 8);
        f3().setText(clause);
        LargeActionButton.ButtonStyle buttonStyle = mVar.e;
        if (buttonStyle != null) {
            f3().o(buttonStyle);
        }
        h3().setVisibility(clause4 != null ? 0 : 8);
        h3().setText(clause4);
        LargeActionButton.ButtonStyle buttonStyle2 = mVar.f251996g;
        if (buttonStyle2 != null) {
            h3().o(buttonStyle2);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) d()).C2(a.C0471a.f67333a);
        return true;
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c8) this.P.getValue();
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        g3().setVisibility(8);
        f3().setVisibility(8);
        h3().setVisibility(8);
        g3().setHeaderTitleMode(j0.MULTILINE);
        f3().setLoadingButtonTag("PRIMARY_BUTTON");
        h3().setLoadingButtonTag("SECONDARY_BUTTON");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.R;
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(rd0.e.b(promptMarketingContentDelegate.f53079c), rd0.e.b(this.S.p()), rd0.e.b(g3().f59410q)), new g(this, null, 0), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(promptMarketingContentDelegate.f.f121375b), rd0.e.b(f3().o)), new g(this, null, 1), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), rd0.e.b(h3().o)), new g(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52371h.f121375b), new r74.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(g3().x0()), new f(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.e), new i(this, null), 3);
        ViewController.P2(this, new l(new b1(rd0.e.b(this.V.f52865c), 27), 25), new f(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.W.d.f121375b), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.X.f53226s), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.d), new f(this, continuation, 2), 3);
    }

    public final aw3.i d3() {
        ViewBinding value = this.O.getValue(this, f67328a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r74.l d() {
        return (r74.l) this.Q.getValue();
    }

    public final LargeActionButton f3() {
        LargeActionButton screenCreditPromptFirstButton = d3().f10692b;
        Intrinsics.checkNotNullExpressionValue(screenCreditPromptFirstButton, "screenCreditPromptFirstButton");
        return screenCreditPromptFirstButton;
    }

    public final NavBarWithToolbar g3() {
        NavBarWithToolbar screenCreditPromptNavBarWithToolbar = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenCreditPromptNavBarWithToolbar, "screenCreditPromptNavBarWithToolbar");
        return screenCreditPromptNavBarWithToolbar;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    public final LargeActionButton h3() {
        LargeActionButton screenCreditPromptSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenCreditPromptSecondButton, "screenCreditPromptSecondButton");
        return screenCreditPromptSecondButton;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }
}
