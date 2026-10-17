package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.e0;
import b6b.i;
import b6b.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.CobrandedCardsAccountCreationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
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
import mx0.c7;
import s6b.h;
import s6b.j;
import te0.w;
import tx0.t3;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/account_creation/CobrandedCardsAccountCreationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls6b/h;", "Ldli/a;", "Ls6b/j;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsAccountCreationScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CobrandedCardsAccountCreationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_footer_nextbutton;
    public final ao.h L = s.t(this, a.f);
    public final Object M = w.y0(new s1g.a(18));
    public final Object N = w.y0(new s1g.a(19));
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.s.a(p0);
        }
    }

    public CobrandedCardsAccountCreationScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: s6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAccountCreationScreen f260193b;

            {
                this.f260193b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen = this.f260193b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAccountCreationScreen.R;
                        CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen2 = this.f260193b;
                        return dli.f.a(cobrandedCardsAccountCreationScreen2, cobrandedCardsAccountCreationScreen2.R2(), v.k((InputTextDelegate) cobrandedCardsAccountCreationScreen2.M.getValue(), (FullScreenStateDelegate) cobrandedCardsAccountCreationScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAccountCreationScreen.R;
                        qji.b bVarU2 = cobrandedCardsAccountCreationScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.di.CobrandedCardsAccountCreationScreenInjector");
                        }
                        o oVar = ((b6b.j) bVarU2).f12622a;
                        b6b.i iVar = new b6b.i();
                        int i6 = 28;
                        iVar.f12617a = e4m.b.b(new ak5.f(oVar, iVar, i5, i6));
                        iVar.f12618b = e4m.b.b(new ak5.f(oVar, iVar, i3, i6));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAccountCreationScreen.R;
                        return (i) ((b6b.i) cobrandedCardsAccountCreationScreen.P.getValue()).f12618b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: s6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAccountCreationScreen f260193b;

            {
                this.f260193b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen = this.f260193b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAccountCreationScreen.R;
                        CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen2 = this.f260193b;
                        return dli.f.a(cobrandedCardsAccountCreationScreen2, cobrandedCardsAccountCreationScreen2.R2(), v.k((InputTextDelegate) cobrandedCardsAccountCreationScreen2.M.getValue(), (FullScreenStateDelegate) cobrandedCardsAccountCreationScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAccountCreationScreen.R;
                        qji.b bVarU2 = cobrandedCardsAccountCreationScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.di.CobrandedCardsAccountCreationScreenInjector");
                        }
                        o oVar = ((b6b.j) bVarU2).f12622a;
                        b6b.i iVar = new b6b.i();
                        int i6 = 28;
                        iVar.f12617a = e4m.b.b(new ak5.f(oVar, iVar, i5, i6));
                        iVar.f12618b = e4m.b.b(new ak5.f(oVar, iVar, i3, i6));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAccountCreationScreen.R;
                        return (i) ((b6b.i) cobrandedCardsAccountCreationScreen.P.getValue()).f12618b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: s6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAccountCreationScreen f260193b;

            {
                this.f260193b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen = this.f260193b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAccountCreationScreen.R;
                        CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen2 = this.f260193b;
                        return dli.f.a(cobrandedCardsAccountCreationScreen2, cobrandedCardsAccountCreationScreen2.R2(), v.k((InputTextDelegate) cobrandedCardsAccountCreationScreen2.M.getValue(), (FullScreenStateDelegate) cobrandedCardsAccountCreationScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAccountCreationScreen.R;
                        qji.b bVarU2 = cobrandedCardsAccountCreationScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.di.CobrandedCardsAccountCreationScreenInjector");
                        }
                        o oVar = ((b6b.j) bVarU2).f12622a;
                        b6b.i iVar = new b6b.i();
                        int i6 = 28;
                        iVar.f12617a = e4m.b.b(new ak5.f(oVar, iVar, i5, i6));
                        iVar.f12618b = e4m.b.b(new ak5.f(oVar, iVar, i32, i6));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAccountCreationScreen.R;
                        return (i) ((b6b.i) cobrandedCardsAccountCreationScreen.P.getValue()).f12618b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = uiState.f260201a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        x6b.h hVar = uiState.f260202b;
        NavBarWithToolbar navBarWithToolbar2 = d3().e;
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
        d dVar = uiState.f260203c;
        LargeActionButton largeActionButton = d3().f174557b;
        if ((dVar instanceof b) || (dVar instanceof x6b.a)) {
            k.a(largeActionButton);
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            k.d(largeActionButton);
            c cVar = (c) dVar;
            largeActionButton.setText(cVar.f303055a);
            largeActionButton.setEnabled(cVar.f303056b);
        }
        Clause clause2 = uiState.d;
        FooterTextView footerTextView = d3().f174558c;
        k.e(footerTextView, clause2 != null);
        if (clause2 != null) {
            footerTextView.setContent(new c7(clause2, false, null, 6));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        t3 t3Var = t3.TWO_LINES;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.I0(t3Var, false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new s6b.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new s6b.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b), null, new s6b.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new s6b.d(this, continuation, 1), 3);
        ViewController.P2(this, new ryj.w(rd0.e.b(d3().f174558c.f58608l), 12), new s56.i(this, continuation, 4), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final s6b.i R2() {
        return (s6b.i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
