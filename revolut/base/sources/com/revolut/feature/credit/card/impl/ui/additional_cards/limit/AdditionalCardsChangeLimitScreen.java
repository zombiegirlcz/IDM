package com.revolut.feature.credit.card.impl.ui.additional_cards.limit;

import aii.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.R$id;
import com.revolut.feature.credit.card.impl.R$layout;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jm4.a3;
import jm4.y;
import k50.b2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nn7.d;
import np4.b;
import np4.c;
import np4.f;
import np4.g;
import te0.w;
import vc.s;
import vkm.z1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/limit/AdditionalCardsChangeLimitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Ldli/a;", "Lnp4/g;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalCardsChangeLimitScreen extends ViewController<r> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AdditionalCardsChangeLimitScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/card/impl/databinding/ScreenAdditionalCreditCardChangeLimitBinding;", 0))};
    public final AdditionalCardsChangeLimitScreenContract$InputData K;
    public final boolean L;
    public final Object M;
    public final h N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final z1 R;
    public final Object S;
    public final Object T;
    public final Object U;

    public AdditionalCardsChangeLimitScreen(AdditionalCardsChangeLimitScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: np4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsChangeLimitScreen f218129b;

            {
                this.f218129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = this.f218129b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsChangeLimitScreen.V;
                        qji.b bVarU2 = additionalCardsChangeLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.limit.di.AdditionalCardsChangeLimitScreenContractInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = additionalCardsChangeLimitScreen.K;
                        additionalCardsChangeLimitScreenContract$InputData.getClass();
                        return new y(a3Var, wVar2, additionalCardsChangeLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsChangeLimitScreen.V;
                        return (f) ((y) additionalCardsChangeLimitScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AdditionalCardsChangeLimitScreen.V;
                        qd0.b bVarN = ((y) additionalCardsChangeLimitScreen.M.getValue()).f176441b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AdditionalCardsChangeLimitScreen.V;
                        return new nk4.o(additionalCardsChangeLimitScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) additionalCardsChangeLimitScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AdditionalCardsChangeLimitScreen.V;
                        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen2 = this.f218129b;
                        return dli.f.a(additionalCardsChangeLimitScreen2, additionalCardsChangeLimitScreen2.k3(), v.k((CenteredAmountDelegate) additionalCardsChangeLimitScreen2.T.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenAdditionalCreditCardChangeLimit_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = R$layout.screen_additional_credit_card_change_limit;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: np4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsChangeLimitScreen f218129b;

            {
                this.f218129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = this.f218129b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsChangeLimitScreen.V;
                        qji.b bVarU2 = additionalCardsChangeLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.limit.di.AdditionalCardsChangeLimitScreenContractInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = additionalCardsChangeLimitScreen.K;
                        additionalCardsChangeLimitScreenContract$InputData.getClass();
                        return new y(a3Var, wVar2, additionalCardsChangeLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsChangeLimitScreen.V;
                        return (f) ((y) additionalCardsChangeLimitScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AdditionalCardsChangeLimitScreen.V;
                        qd0.b bVarN = ((y) additionalCardsChangeLimitScreen.M.getValue()).f176441b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AdditionalCardsChangeLimitScreen.V;
                        return new nk4.o(additionalCardsChangeLimitScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) additionalCardsChangeLimitScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AdditionalCardsChangeLimitScreen.V;
                        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen2 = this.f218129b;
                        return dli.f.a(additionalCardsChangeLimitScreen2, additionalCardsChangeLimitScreen2.k3(), v.k((CenteredAmountDelegate) additionalCardsChangeLimitScreen2.T.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenAdditionalCreditCardChangeLimit_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: np4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsChangeLimitScreen f218129b;

            {
                this.f218129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = this.f218129b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsChangeLimitScreen.V;
                        qji.b bVarU2 = additionalCardsChangeLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.limit.di.AdditionalCardsChangeLimitScreenContractInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = additionalCardsChangeLimitScreen.K;
                        additionalCardsChangeLimitScreenContract$InputData.getClass();
                        return new y(a3Var, wVar2, additionalCardsChangeLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsChangeLimitScreen.V;
                        return (f) ((y) additionalCardsChangeLimitScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AdditionalCardsChangeLimitScreen.V;
                        qd0.b bVarN = ((y) additionalCardsChangeLimitScreen.M.getValue()).f176441b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AdditionalCardsChangeLimitScreen.V;
                        return new nk4.o(additionalCardsChangeLimitScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) additionalCardsChangeLimitScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AdditionalCardsChangeLimitScreen.V;
                        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen2 = this.f218129b;
                        return dli.f.a(additionalCardsChangeLimitScreen2, additionalCardsChangeLimitScreen2.k3(), v.k((CenteredAmountDelegate) additionalCardsChangeLimitScreen2.T.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenAdditionalCreditCardChangeLimit_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = ta6.a.a(0);
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: np4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsChangeLimitScreen f218129b;

            {
                this.f218129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = this.f218129b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsChangeLimitScreen.V;
                        qji.b bVarU2 = additionalCardsChangeLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.limit.di.AdditionalCardsChangeLimitScreenContractInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = additionalCardsChangeLimitScreen.K;
                        additionalCardsChangeLimitScreenContract$InputData.getClass();
                        return new y(a3Var, wVar2, additionalCardsChangeLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsChangeLimitScreen.V;
                        return (f) ((y) additionalCardsChangeLimitScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AdditionalCardsChangeLimitScreen.V;
                        qd0.b bVarN = ((y) additionalCardsChangeLimitScreen.M.getValue()).f176441b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AdditionalCardsChangeLimitScreen.V;
                        return new nk4.o(additionalCardsChangeLimitScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) additionalCardsChangeLimitScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AdditionalCardsChangeLimitScreen.V;
                        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen2 = this.f218129b;
                        return dli.f.a(additionalCardsChangeLimitScreen2, additionalCardsChangeLimitScreen2.k3(), v.k((CenteredAmountDelegate) additionalCardsChangeLimitScreen2.T.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenAdditionalCreditCardChangeLimit_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: np4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsChangeLimitScreen f218129b;

            {
                this.f218129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = this.f218129b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsChangeLimitScreen.V;
                        qji.b bVarU2 = additionalCardsChangeLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.limit.di.AdditionalCardsChangeLimitScreenContractInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = additionalCardsChangeLimitScreen.K;
                        additionalCardsChangeLimitScreenContract$InputData.getClass();
                        return new y(a3Var, wVar2, additionalCardsChangeLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsChangeLimitScreen.V;
                        return (f) ((y) additionalCardsChangeLimitScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AdditionalCardsChangeLimitScreen.V;
                        qd0.b bVarN = ((y) additionalCardsChangeLimitScreen.M.getValue()).f176441b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AdditionalCardsChangeLimitScreen.V;
                        return new nk4.o(additionalCardsChangeLimitScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) additionalCardsChangeLimitScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AdditionalCardsChangeLimitScreen.V;
                        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen2 = this.f218129b;
                        return dli.f.a(additionalCardsChangeLimitScreen2, additionalCardsChangeLimitScreen2.k3(), v.k((CenteredAmountDelegate) additionalCardsChangeLimitScreen2.T.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenAdditionalCreditCardChangeLimit_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i21 = 5;
        this.U = w.y0(new Function0(this) { // from class: np4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsChangeLimitScreen f218129b;

            {
                this.f218129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = this.f218129b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsChangeLimitScreen.V;
                        qji.b bVarU2 = additionalCardsChangeLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.limit.di.AdditionalCardsChangeLimitScreenContractInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = additionalCardsChangeLimitScreen.K;
                        additionalCardsChangeLimitScreenContract$InputData.getClass();
                        return new y(a3Var, wVar2, additionalCardsChangeLimitScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsChangeLimitScreen.V;
                        return (f) ((y) additionalCardsChangeLimitScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AdditionalCardsChangeLimitScreen.V;
                        qd0.b bVarN = ((y) additionalCardsChangeLimitScreen.M.getValue()).f176441b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AdditionalCardsChangeLimitScreen.V;
                        return new nk4.o(additionalCardsChangeLimitScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) additionalCardsChangeLimitScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AdditionalCardsChangeLimitScreen.V;
                        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen2 = this.f218129b;
                        return dli.f.a(additionalCardsChangeLimitScreen2, additionalCardsChangeLimitScreen2.k3(), v.k((CenteredAmountDelegate) additionalCardsChangeLimitScreen2.T.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenAdditionalCreditCardChangeLimit_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f162298c;
        TextLocalisedClause textLocalisedClause = uiState.f218133b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(uiState.f218134c);
        NavBarMenuItem navBarMenuItem = uiState.d;
        if (navBarMenuItem != null) {
            d3().f162298c.setMenuItems(u.c(navBarMenuItem));
        }
        e eVar = uiState.f218132a;
        ActionFooterView actionFooterView = d3().f162297b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenAdditionalCreditCa…angeLimitActionFooterView");
        actionFooterView.setModel(eVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f162298c;
        navBarWithToolbar.clearAnimation();
        navBarWithToolbar.setAlwaysExpanded(false);
        navBarWithToolbar.j0(true);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f162297b.f), new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162298c.f59410q), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162298c.o.f57403b), null, new d(this, continuation, 8), 3);
        ViewController.P2(this, this.R, new b2(2, k3(), f.class, "onAmountChanged", "onAmountChanged(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 3);
    }

    public final im4.a d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (im4.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
