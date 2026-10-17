package com.revolut.feature.credit.card.impl.ui.topup;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SliderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import ep4.b;
import jm4.y2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kw4.c;
import kw4.d;
import kw4.j;
import kw4.k;
import kw4.l;
import kw4.n;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/topup/CreditCardTopupScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkw4/j;", "Ldli/a;", "Lkw4/n;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardTopupScreen extends ViewController<j> implements a, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CreditCardTopupScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final LargeActionButtonDelegate W;

    public CreditCardTopupScreen(CreditCardTopupScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new kpl.b(this, inputData, 6));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: kw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTopupScreen f190212b;

            {
                this.f190212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardTopupScreen creditCardTopupScreen = this.f190212b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                        CreditCardTopupScreen creditCardTopupScreen2 = this.f190212b;
                        return dli.f.a(creditCardTopupScreen2, creditCardTopupScreen2.k3(), zhm.v.k((AmountEditDelegate) creditCardTopupScreen2.S.getValue(), (SliderDelegate) creditCardTopupScreen2.T.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) creditCardTopupScreen2.U.getValue(), new CellDetailsBadgeDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardTopupScreen2.V.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTopupScreen.X;
                        return (k) ((y2) creditCardTopupScreen.M.getValue()).f176455m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTopupScreen.X;
                        return (j60.a) ((y2) creditCardTopupScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTopupScreen.X;
                        qd0.b bVarN = ((y2) creditCardTopupScreen.M.getValue()).f176449b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTopupScreen.X;
                        return new AmountEditDelegate(new kj4.c(creditCardTopupScreen, 21));
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: kw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTopupScreen f190212b;

            {
                this.f190212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardTopupScreen creditCardTopupScreen = this.f190212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                        CreditCardTopupScreen creditCardTopupScreen2 = this.f190212b;
                        return dli.f.a(creditCardTopupScreen2, creditCardTopupScreen2.k3(), zhm.v.k((AmountEditDelegate) creditCardTopupScreen2.S.getValue(), (SliderDelegate) creditCardTopupScreen2.T.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) creditCardTopupScreen2.U.getValue(), new CellDetailsBadgeDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardTopupScreen2.V.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTopupScreen.X;
                        return (k) ((y2) creditCardTopupScreen.M.getValue()).f176455m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTopupScreen.X;
                        return (j60.a) ((y2) creditCardTopupScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTopupScreen.X;
                        qd0.b bVarN = ((y2) creditCardTopupScreen.M.getValue()).f176449b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTopupScreen.X;
                        return new AmountEditDelegate(new kj4.c(creditCardTopupScreen, 21));
                }
            }
        });
        this.P = s.t(this, c.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: kw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTopupScreen f190212b;

            {
                this.f190212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardTopupScreen creditCardTopupScreen = this.f190212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                        CreditCardTopupScreen creditCardTopupScreen2 = this.f190212b;
                        return dli.f.a(creditCardTopupScreen2, creditCardTopupScreen2.k3(), zhm.v.k((AmountEditDelegate) creditCardTopupScreen2.S.getValue(), (SliderDelegate) creditCardTopupScreen2.T.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) creditCardTopupScreen2.U.getValue(), new CellDetailsBadgeDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardTopupScreen2.V.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTopupScreen.X;
                        return (k) ((y2) creditCardTopupScreen.M.getValue()).f176455m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTopupScreen.X;
                        return (j60.a) ((y2) creditCardTopupScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTopupScreen.X;
                        qd0.b bVarN = ((y2) creditCardTopupScreen.M.getValue()).f176449b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTopupScreen.X;
                        return new AmountEditDelegate(new kj4.c(creditCardTopupScreen, 21));
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: kw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTopupScreen f190212b;

            {
                this.f190212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardTopupScreen creditCardTopupScreen = this.f190212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                        CreditCardTopupScreen creditCardTopupScreen2 = this.f190212b;
                        return dli.f.a(creditCardTopupScreen2, creditCardTopupScreen2.k3(), zhm.v.k((AmountEditDelegate) creditCardTopupScreen2.S.getValue(), (SliderDelegate) creditCardTopupScreen2.T.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) creditCardTopupScreen2.U.getValue(), new CellDetailsBadgeDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardTopupScreen2.V.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTopupScreen.X;
                        return (k) ((y2) creditCardTopupScreen.M.getValue()).f176455m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTopupScreen.X;
                        return (j60.a) ((y2) creditCardTopupScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTopupScreen.X;
                        qd0.b bVarN = ((y2) creditCardTopupScreen.M.getValue()).f176449b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTopupScreen.X;
                        return new AmountEditDelegate(new kj4.c(creditCardTopupScreen, 21));
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: kw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTopupScreen f190212b;

            {
                this.f190212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardTopupScreen creditCardTopupScreen = this.f190212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                        CreditCardTopupScreen creditCardTopupScreen2 = this.f190212b;
                        return dli.f.a(creditCardTopupScreen2, creditCardTopupScreen2.k3(), zhm.v.k((AmountEditDelegate) creditCardTopupScreen2.S.getValue(), (SliderDelegate) creditCardTopupScreen2.T.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) creditCardTopupScreen2.U.getValue(), new CellDetailsBadgeDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardTopupScreen2.V.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTopupScreen.X;
                        return (k) ((y2) creditCardTopupScreen.M.getValue()).f176455m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTopupScreen.X;
                        return (j60.a) ((y2) creditCardTopupScreen.M.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTopupScreen.X;
                        qd0.b bVarN = ((y2) creditCardTopupScreen.M.getValue()).f176449b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTopupScreen.X;
                        return new AmountEditDelegate(new kj4.c(creditCardTopupScreen, 21));
                }
            }
        });
        this.T = w.y0(new kw4.b(0));
        this.U = w.y0(new kw4.b(1));
        this.V = w.y0(new kw4.b(2));
        this.W = new LargeActionButtonDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        kw4.m mVar = uiState.f190237a;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(mVar.d);
        navBarWithToolbar.setTitle(mVar.f190234a, null);
        navBarWithToolbar.setToolbarTitle(mVar.f190236c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(mVar.f190235b);
        navBarWithToolbar.setTitleClickable(false);
        navBarWithToolbar.setMenuItems(mVar.e);
        l lVar = uiState.f190239c;
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(lVar.f190233b);
        largeActionButton.setVisibility(0);
        largeActionButton.setText(lVar.f190232a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y2) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.Q.getValue()).d(u.c(this.W));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new kw4.e(this, continuation, i), 3);
        int i2 = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, i2), 3);
        vkm.d dVarB = rd0.e.b(this.W.d.f121375b);
        ?? r06 = this.T;
        vkm.d dVarB2 = rd0.e.b(((SliderDelegate) r06.getValue()).d);
        vkm.d dVarB3 = rd0.e.b(((CellDetailsActionDelegate) this.U.getValue()).d);
        r map = ((SliderDelegate) r06.getValue()).f53335c.map(new ksb.a(new kvg.j(7), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(dVarB, dVarB2, dVarB3, rd0.e.b(map), rd0.e.b(((FullScreenStateDelegate) this.V.getValue()).f52371h.f121375b)), null, new kw4.e(this, continuation, i2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
