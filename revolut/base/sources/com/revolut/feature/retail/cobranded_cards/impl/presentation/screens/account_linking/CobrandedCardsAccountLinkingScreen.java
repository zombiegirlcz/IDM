package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.e0;
import b6b.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking.CobrandedCardsAccountLinkingScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import u6b.h;
import u6b.i;
import u6b.j;
import vc.s;
import w01.k;
import x6b.b;
import x6b.c;
import x6b.d;
import x6b.e;
import x6b.f;
import x6b.g;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/account_linking/CobrandedCardsAccountLinkingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu6b/h;", "Ldli/a;", "Lu6b/j;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsAccountLinkingScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CobrandedCardsAccountLinkingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_two_buttons;
    public final ao.h L = s.t(this, a.f);
    public final Object M = w.y0(new ty.a(28));
    public final Object N = w.y0(new ty.a(29));
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, x.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return x.a(p0);
        }
    }

    public CobrandedCardsAccountLinkingScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: u6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAccountLinkingScreen f277526b;

            {
                this.f277526b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen = this.f277526b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAccountLinkingScreen.R;
                        CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen2 = this.f277526b;
                        return dli.f.a(cobrandedCardsAccountLinkingScreen2, cobrandedCardsAccountLinkingScreen2.d(), v.k((InputTextDelegate) cobrandedCardsAccountLinkingScreen2.M.getValue(), (FullScreenStateDelegate) cobrandedCardsAccountLinkingScreen2.N.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAccountLinkingScreen.R;
                        qji.b bVarU2 = cobrandedCardsAccountLinkingScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking.di.CobrandedCardsAccountLinkingScreenInjector");
                        }
                        o oVar = ((b6b.j) bVarU2).f12622a;
                        b6b.k kVar = new b6b.k();
                        int i6 = 29;
                        kVar.f12628a = e4m.b.b(new ak5.f(oVar, kVar, i5, i6));
                        kVar.f12629b = e4m.b.b(new ak5.f(oVar, kVar, i3, i6));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAccountLinkingScreen.R;
                        return (i) ((b6b.k) cobrandedCardsAccountLinkingScreen.P.getValue()).f12629b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: u6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAccountLinkingScreen f277526b;

            {
                this.f277526b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen = this.f277526b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAccountLinkingScreen.R;
                        CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen2 = this.f277526b;
                        return dli.f.a(cobrandedCardsAccountLinkingScreen2, cobrandedCardsAccountLinkingScreen2.d(), v.k((InputTextDelegate) cobrandedCardsAccountLinkingScreen2.M.getValue(), (FullScreenStateDelegate) cobrandedCardsAccountLinkingScreen2.N.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAccountLinkingScreen.R;
                        qji.b bVarU2 = cobrandedCardsAccountLinkingScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking.di.CobrandedCardsAccountLinkingScreenInjector");
                        }
                        o oVar = ((b6b.j) bVarU2).f12622a;
                        b6b.k kVar = new b6b.k();
                        int i6 = 29;
                        kVar.f12628a = e4m.b.b(new ak5.f(oVar, kVar, i5, i6));
                        kVar.f12629b = e4m.b.b(new ak5.f(oVar, kVar, i3, i6));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAccountLinkingScreen.R;
                        return (i) ((b6b.k) cobrandedCardsAccountLinkingScreen.P.getValue()).f12629b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: u6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAccountLinkingScreen f277526b;

            {
                this.f277526b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen = this.f277526b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAccountLinkingScreen.R;
                        CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen2 = this.f277526b;
                        return dli.f.a(cobrandedCardsAccountLinkingScreen2, cobrandedCardsAccountLinkingScreen2.d(), v.k((InputTextDelegate) cobrandedCardsAccountLinkingScreen2.M.getValue(), (FullScreenStateDelegate) cobrandedCardsAccountLinkingScreen2.N.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAccountLinkingScreen.R;
                        qji.b bVarU2 = cobrandedCardsAccountLinkingScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking.di.CobrandedCardsAccountLinkingScreenInjector");
                        }
                        o oVar = ((b6b.j) bVarU2).f12622a;
                        b6b.k kVar = new b6b.k();
                        int i6 = 29;
                        kVar.f12628a = e4m.b.b(new ak5.f(oVar, kVar, i5, i6));
                        kVar.f12629b = e4m.b.b(new ak5.f(oVar, kVar, i32, i6));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAccountLinkingScreen.R;
                        return (i) ((b6b.k) cobrandedCardsAccountLinkingScreen.P.getValue()).f12629b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        TextLocalisedClause textLocalisedClause = uiState.f277532a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        x6b.h hVar = uiState.f277533b;
        NavBarWithToolbar navBarWithToolbar2 = d3().f174574c;
        if (hVar instanceof e) {
            navBarWithToolbar2.l0();
        } else if (hVar instanceof f) {
            navBarWithToolbar2.I0(t3.TWO_LINES, false);
        } else {
            if (!(hVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar2.l0();
            g gVar = (g) hVar;
            Clause clause = gVar.f303060a;
            navBarWithToolbar2.setSecondDescriptionText(clause);
            navBarWithToolbar2.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar2.setSecondDescriptionTextStyle(e0.CAPTION);
            Image image = gVar.f303061b;
            if (image != null) {
                navBarWithToolbar2.setEndImage(new yy0.j(image));
            }
        }
        d dVar = uiState.f277534c;
        if (dVar instanceof b) {
            LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
            k.a(screenRecyclerNavbarTwoButtonsFirstButton);
            LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
            k.a(screenRecyclerNavbarTwoButtonsSecondButton);
            return;
        }
        if (dVar instanceof x6b.a) {
            LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton2 = d3().f174573b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton2, "screenRecyclerNavbarTwoButtonsFirstButton");
            k.a(screenRecyclerNavbarTwoButtonsFirstButton2);
            LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton2 = d3().e;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton2, "screenRecyclerNavbarTwoButtonsSecondButton");
            k.a(screenRecyclerNavbarTwoButtonsSecondButton2);
            return;
        }
        if (!(dVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        LargeActionButton largeActionButton = d3().f174573b;
        k.d(largeActionButton);
        c cVar = (c) dVar;
        Clause clause2 = cVar.f303057c;
        largeActionButton.setText(cVar.f303055a);
        largeActionButton.setEnabled(cVar.f303056b);
        LargeActionButton largeActionButton2 = d3().e;
        k.e(largeActionButton2, clause2 != null);
        largeActionButton2.setText(clause2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b6b.k) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        t3 t3Var = t3.TWO_LINES;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.I0(t3Var, false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174573b.o(LargeActionButton.ButtonStyle.e);
        d3().e.o(LargeActionButton.ButtonStyle.o);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new u6b.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new u6b.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b), null, new u6b.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new u6b.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new u6b.b(this, continuation, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
