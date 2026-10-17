package com.revolut.feature.credit.card.impl.ui.collateral_move_money;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.R$id;
import com.revolut.feature.credit.card.impl.R$layout;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import jm4.e0;
import k50.b2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mq4.c;
import mq4.d;
import mq4.f;
import mq4.i;
import mq4.j;
import no.m;
import te0.w;
import vc.s;
import vkm.z1;
import zhm.u;
import zhm.v;
import zl4.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/collateral_move_money/CollateralMoveMoneyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzl4/e;", "Ldli/a;", "Lmq4/j;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollateralMoveMoneyScreen extends ViewController<e> implements a, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CollateralMoveMoneyScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/card/impl/databinding/ScreenSecuredCreditCardAddMoneyBinding;", 0))};
    public final /* synthetic */ b K;
    public final boolean L;
    public final Object M;
    public final h N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final z1 S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public CollateralMoveMoneyScreen(CollateralMoveMoneyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = true;
        this.M = w.y0(new mhd.b(this, inputData, 12));
        this.N = s.t(this, c.f);
        this.O = R$layout.screen_secured_credit_card_add_money;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: mq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollateralMoveMoneyScreen f207855b;

            {
                this.f207855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = this.f207855b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                        return (i) ((e0) collateralMoveMoneyScreen.M.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CollateralMoveMoneyScreen.X;
                        qd0.b bVarN = ((e0) collateralMoveMoneyScreen.M.getValue()).f176045b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CollateralMoveMoneyScreen.X;
                        return (j60.a) ((e0) collateralMoveMoneyScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CollateralMoveMoneyScreen.X;
                        return new mnl.g(collateralMoveMoneyScreen, 8);
                    case 4:
                        return new CenteredAmountDelegate((Function2) collateralMoveMoneyScreen.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CollateralMoveMoneyScreen.X;
                        CollateralMoveMoneyScreen collateralMoveMoneyScreen2 = this.f207855b;
                        return dli.f.a(collateralMoveMoneyScreen2, collateralMoveMoneyScreen2.d(), zhm.v.k((CenteredAmountDelegate) collateralMoveMoneyScreen2.U.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenSecuredCreditCardAddMoney_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: mq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollateralMoveMoneyScreen f207855b;

            {
                this.f207855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = this.f207855b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                        return (i) ((e0) collateralMoveMoneyScreen.M.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CollateralMoveMoneyScreen.X;
                        qd0.b bVarN = ((e0) collateralMoveMoneyScreen.M.getValue()).f176045b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CollateralMoveMoneyScreen.X;
                        return (j60.a) ((e0) collateralMoveMoneyScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CollateralMoveMoneyScreen.X;
                        return new mnl.g(collateralMoveMoneyScreen, 8);
                    case 4:
                        return new CenteredAmountDelegate((Function2) collateralMoveMoneyScreen.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CollateralMoveMoneyScreen.X;
                        CollateralMoveMoneyScreen collateralMoveMoneyScreen2 = this.f207855b;
                        return dli.f.a(collateralMoveMoneyScreen2, collateralMoveMoneyScreen2.d(), zhm.v.k((CenteredAmountDelegate) collateralMoveMoneyScreen2.U.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenSecuredCreditCardAddMoney_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: mq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollateralMoveMoneyScreen f207855b;

            {
                this.f207855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = this.f207855b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                        return (i) ((e0) collateralMoveMoneyScreen.M.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CollateralMoveMoneyScreen.X;
                        qd0.b bVarN = ((e0) collateralMoveMoneyScreen.M.getValue()).f176045b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CollateralMoveMoneyScreen.X;
                        return (j60.a) ((e0) collateralMoveMoneyScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CollateralMoveMoneyScreen.X;
                        return new mnl.g(collateralMoveMoneyScreen, 8);
                    case 4:
                        return new CenteredAmountDelegate((Function2) collateralMoveMoneyScreen.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CollateralMoveMoneyScreen.X;
                        CollateralMoveMoneyScreen collateralMoveMoneyScreen2 = this.f207855b;
                        return dli.f.a(collateralMoveMoneyScreen2, collateralMoveMoneyScreen2.d(), zhm.v.k((CenteredAmountDelegate) collateralMoveMoneyScreen2.U.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenSecuredCreditCardAddMoney_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = ta6.a.a(0);
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: mq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollateralMoveMoneyScreen f207855b;

            {
                this.f207855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = this.f207855b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                        return (i) ((e0) collateralMoveMoneyScreen.M.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CollateralMoveMoneyScreen.X;
                        qd0.b bVarN = ((e0) collateralMoveMoneyScreen.M.getValue()).f176045b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CollateralMoveMoneyScreen.X;
                        return (j60.a) ((e0) collateralMoveMoneyScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CollateralMoveMoneyScreen.X;
                        return new mnl.g(collateralMoveMoneyScreen, 8);
                    case 4:
                        return new CenteredAmountDelegate((Function2) collateralMoveMoneyScreen.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CollateralMoveMoneyScreen.X;
                        CollateralMoveMoneyScreen collateralMoveMoneyScreen2 = this.f207855b;
                        return dli.f.a(collateralMoveMoneyScreen2, collateralMoveMoneyScreen2.d(), zhm.v.k((CenteredAmountDelegate) collateralMoveMoneyScreen2.U.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenSecuredCreditCardAddMoney_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: mq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollateralMoveMoneyScreen f207855b;

            {
                this.f207855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = this.f207855b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                        return (i) ((e0) collateralMoveMoneyScreen.M.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CollateralMoveMoneyScreen.X;
                        qd0.b bVarN = ((e0) collateralMoveMoneyScreen.M.getValue()).f176045b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CollateralMoveMoneyScreen.X;
                        return (j60.a) ((e0) collateralMoveMoneyScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CollateralMoveMoneyScreen.X;
                        return new mnl.g(collateralMoveMoneyScreen, 8);
                    case 4:
                        return new CenteredAmountDelegate((Function2) collateralMoveMoneyScreen.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CollateralMoveMoneyScreen.X;
                        CollateralMoveMoneyScreen collateralMoveMoneyScreen2 = this.f207855b;
                        return dli.f.a(collateralMoveMoneyScreen2, collateralMoveMoneyScreen2.d(), zhm.v.k((CenteredAmountDelegate) collateralMoveMoneyScreen2.U.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenSecuredCreditCardAddMoney_recyclerView, null, null, null, 56);
                }
            }
        });
        this.V = w.y0(new mq4.b(0));
        final int i21 = 5;
        this.W = w.y0(new Function0(this) { // from class: mq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CollateralMoveMoneyScreen f207855b;

            {
                this.f207855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = this.f207855b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                        return (i) ((e0) collateralMoveMoneyScreen.M.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CollateralMoveMoneyScreen.X;
                        qd0.b bVarN = ((e0) collateralMoveMoneyScreen.M.getValue()).f176045b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CollateralMoveMoneyScreen.X;
                        return (j60.a) ((e0) collateralMoveMoneyScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CollateralMoveMoneyScreen.X;
                        return new mnl.g(collateralMoveMoneyScreen, 8);
                    case 4:
                        return new CenteredAmountDelegate((Function2) collateralMoveMoneyScreen.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CollateralMoveMoneyScreen.X;
                        CollateralMoveMoneyScreen collateralMoveMoneyScreen2 = this.f207855b;
                        return dli.f.a(collateralMoveMoneyScreen2, collateralMoveMoneyScreen2.d(), zhm.v.k((CenteredAmountDelegate) collateralMoveMoneyScreen2.U.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenSecuredCreditCardAddMoney_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f162309c;
        Clause clause = uiState.f207864b;
        TextLocalisedClause textLocalisedClause = uiState.f207865c;
        if (clause != null) {
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClause, clause, null, 4, null);
        } else {
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
        }
        navBarWithToolbar.setNavigationButtonImage(uiState.d);
        NavBarMenuItem navBarMenuItem = uiState.e;
        if (navBarMenuItem != null) {
            d3().f162309c.setMenuItems(u.c(navBarMenuItem));
        }
        aw0.e eVar = uiState.f207863a;
        ActionFooterView screenSecuredCreditCardAddMoneyActionFooterView = d3().f162308b;
        Intrinsics.checkNotNullExpressionValue(screenSecuredCreditCardAddMoneyActionFooterView, "screenSecuredCreditCardAddMoneyActionFooterView");
        screenSecuredCreditCardAddMoneyActionFooterView.setModel(eVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.R.getValue()).d(v.k((LargeActionButtonDelegate) this.V.getValue(), new RowDelegate(null, null, 7), new PlainTextDelegate(), new CellDetailsDelegate()));
        NavBarWithToolbar navBarWithToolbar = d3().f162309c;
        navBarWithToolbar.clearAnimation();
        navBarWithToolbar.setAlwaysExpanded(false);
        navBarWithToolbar.j0(true);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f162308b.f), new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162308b.e), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162309c.f59410q), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.U.getValue()).f.f121375b), null, new mq4.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.V.getValue()).d.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162309c.o.f57403b), null, new mkk.q(this, continuation, 9), 3);
        ViewController.P2(this, this.S, new b2(2, d(), i.class, "onAmountChanged", "onAmountChanged(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), 3);
    }

    public final im4.e d3() {
        ViewBinding value = this.N.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (im4.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
