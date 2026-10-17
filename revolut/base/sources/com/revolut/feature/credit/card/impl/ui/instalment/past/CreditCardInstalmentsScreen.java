package com.revolut.feature.credit.card.impl.ui.instalment.past;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import hl7.ma;
import hs4.i;
import hs4.j;
import hs4.k;
import jm4.a3;
import jm4.j1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/past/CreditCardInstalmentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhs4/i;", "Ldli/a;", "Lhs4/k;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardInstalmentsScreen extends ViewController<i> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CreditCardInstalmentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardInstalmentsScreenContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CreditCardInstalmentsScreen(CreditCardInstalmentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, hs4.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentsScreen f154984b;

            {
                this.f154984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardInstalmentsScreen creditCardInstalmentsScreen = this.f154984b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardInstalmentsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardInstalmentsScreenContract$InputData creditCardInstalmentsScreenContract$InputData = creditCardInstalmentsScreen.L;
                        creditCardInstalmentsScreenContract$InputData.getClass();
                        return new j1(a3Var, creditCardInstalmentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentsScreen.T;
                        return (o) ((j1) creditCardInstalmentsScreen.O.getValue()).f176151c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentsScreen.T;
                        CreditCardInstalmentsScreen creditCardInstalmentsScreen2 = this.f154984b;
                        return dli.f.a(creditCardInstalmentsScreen2, (o) creditCardInstalmentsScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) creditCardInstalmentsScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardInstalmentsScreen2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: hs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentsScreen f154984b;

            {
                this.f154984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardInstalmentsScreen creditCardInstalmentsScreen = this.f154984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardInstalmentsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardInstalmentsScreenContract$InputData creditCardInstalmentsScreenContract$InputData = creditCardInstalmentsScreen.L;
                        creditCardInstalmentsScreenContract$InputData.getClass();
                        return new j1(a3Var, creditCardInstalmentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentsScreen.T;
                        return (o) ((j1) creditCardInstalmentsScreen.O.getValue()).f176151c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentsScreen.T;
                        CreditCardInstalmentsScreen creditCardInstalmentsScreen2 = this.f154984b;
                        return dli.f.a(creditCardInstalmentsScreen2, (o) creditCardInstalmentsScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) creditCardInstalmentsScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardInstalmentsScreen2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new ma(20));
        this.R = w.y0(new ma(21));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: hs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentsScreen f154984b;

            {
                this.f154984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardInstalmentsScreen creditCardInstalmentsScreen = this.f154984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardInstalmentsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardInstalmentsScreenContract$InputData creditCardInstalmentsScreenContract$InputData = creditCardInstalmentsScreen.L;
                        creditCardInstalmentsScreenContract$InputData.getClass();
                        return new j1(a3Var, creditCardInstalmentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentsScreen.T;
                        return (o) ((j1) creditCardInstalmentsScreen.O.getValue()).f176151c.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentsScreen.T;
                        CreditCardInstalmentsScreen creditCardInstalmentsScreen2 = this.f154984b;
                        return dli.f.a(creditCardInstalmentsScreen2, (o) creditCardInstalmentsScreen2.P.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) creditCardInstalmentsScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardInstalmentsScreen2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        j jVar = uiState.f154995b;
        TextLocalisedClause textLocalisedClause = jVar.f154992a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(jVar.f154993b);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
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
        return (j1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (hs4.o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h);
        ?? r06 = this.R;
        d dVarB2 = rd0.e.b(((FullScreenStateDelegate) r06.getValue()).f52371h.f121375b);
        d dVarB3 = rd0.e.b(((FullScreenStateDelegate) r06.getValue()).f.f121375b);
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, vkm.q.J(dVarB, dVarB2, dVarB3, new h23.b(rd0.e.b(((jii.m) value).f174539b.f59410q), 29)), new hp2.d(this, null, 4), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
