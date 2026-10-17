package com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import jm4.a3;
import jm4.l0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.t3;
import vc.s;
import zhm.v;
import zt4.c;
import zt4.d;
import zt4.e;
import zt4.f;
import zt4.g;
import zt4.i;
import zt4.k;
import zt4.l;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/boleto_details/CreditCardBoletoDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzt4/d;", "Ldli/a;", "Lzt4/i;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardBoletoDetailsScreen extends ViewController<d> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CreditCardBoletoDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardBoletoDetailsContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CreditCardBoletoDetailsScreen(CreditCardBoletoDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, k.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zt4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoDetailsScreen f325078b;

            {
                this.f325078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardBoletoDetailsScreen creditCardBoletoDetailsScreen = this.f325078b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoDetailsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardBoletoDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData = creditCardBoletoDetailsScreen.L;
                        creditCardBoletoDetailsContract$InputData.getClass();
                        return new l0(a3Var, creditCardBoletoDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoDetailsScreen.V;
                        return (e) ((l0) creditCardBoletoDetailsScreen.O.getValue()).f176181c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardBoletoDetailsScreen.V;
                        CreditCardBoletoDetailsScreen creditCardBoletoDetailsScreen2 = this.f325078b;
                        return dli.f.a(creditCardBoletoDetailsScreen2, (e) creditCardBoletoDetailsScreen2.P.getValue(), v.k((FullScreenStateDelegate) creditCardBoletoDetailsScreen2.Q.getValue(), (CellDetailsDelegate) creditCardBoletoDetailsScreen2.R.getValue(), (CellDetailsActionDelegate) creditCardBoletoDetailsScreen2.T.getValue(), (RowDelegate) creditCardBoletoDetailsScreen2.S.getValue(), new RowLoadingDelegate(), new CounterTextDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zt4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoDetailsScreen f325078b;

            {
                this.f325078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardBoletoDetailsScreen creditCardBoletoDetailsScreen = this.f325078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoDetailsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardBoletoDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData = creditCardBoletoDetailsScreen.L;
                        creditCardBoletoDetailsContract$InputData.getClass();
                        return new l0(a3Var, creditCardBoletoDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoDetailsScreen.V;
                        return (e) ((l0) creditCardBoletoDetailsScreen.O.getValue()).f176181c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardBoletoDetailsScreen.V;
                        CreditCardBoletoDetailsScreen creditCardBoletoDetailsScreen2 = this.f325078b;
                        return dli.f.a(creditCardBoletoDetailsScreen2, (e) creditCardBoletoDetailsScreen2.P.getValue(), v.k((FullScreenStateDelegate) creditCardBoletoDetailsScreen2.Q.getValue(), (CellDetailsDelegate) creditCardBoletoDetailsScreen2.R.getValue(), (CellDetailsActionDelegate) creditCardBoletoDetailsScreen2.T.getValue(), (RowDelegate) creditCardBoletoDetailsScreen2.S.getValue(), new RowLoadingDelegate(), new CounterTextDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new zr4.b(18));
        this.R = w.y0(new zr4.b(19));
        this.S = w.y0(new zr4.b(20));
        this.T = w.y0(new zr4.b(21));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: zt4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoDetailsScreen f325078b;

            {
                this.f325078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardBoletoDetailsScreen creditCardBoletoDetailsScreen = this.f325078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoDetailsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardBoletoDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData = creditCardBoletoDetailsScreen.L;
                        creditCardBoletoDetailsContract$InputData.getClass();
                        return new l0(a3Var, creditCardBoletoDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoDetailsScreen.V;
                        return (e) ((l0) creditCardBoletoDetailsScreen.O.getValue()).f176181c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardBoletoDetailsScreen.V;
                        CreditCardBoletoDetailsScreen creditCardBoletoDetailsScreen2 = this.f325078b;
                        return dli.f.a(creditCardBoletoDetailsScreen2, (e) creditCardBoletoDetailsScreen2.P.getValue(), v.k((FullScreenStateDelegate) creditCardBoletoDetailsScreen2.Q.getValue(), (CellDetailsDelegate) creditCardBoletoDetailsScreen2.R.getValue(), (CellDetailsActionDelegate) creditCardBoletoDetailsScreen2.T.getValue(), (RowDelegate) creditCardBoletoDetailsScreen2.S.getValue(), new RowLoadingDelegate(), new CounterTextDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        zt4.h hVar = uiState.f325076b;
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        if (hVar instanceof g) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            if (!(hVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar = (f) hVar;
            TextLocalisedClause textLocalisedClause = fVar.f325071a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(fVar.f325072b);
            navBarWithToolbar.setNavigationButtonImage(fVar.f325073c);
            navBarWithToolbar.l0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) ((e) this.P.getValue())).C2(c.f325070a);
        return true;
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
    public final xki.e R1() {
        return (l0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), rd0.e.b(((CellDetailsDelegate) this.R.getValue()).e), rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), rd0.e.b(((CellDetailsActionDelegate) this.T.getValue()).d)), new l(this, null, 0), 3);
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new z3f.b(this, null, 28), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
