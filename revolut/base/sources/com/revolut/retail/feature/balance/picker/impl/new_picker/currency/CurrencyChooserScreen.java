package com.revolut.retail.feature.balance.picker.impl.new_picker.currency;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import com.revolut.retail.feature.balance.picker.impl.R$id;
import com.revolut.retail.feature.balance.picker.impl.R$layout;
import com.revolut.retail.feature.balance.picker.impl.new_picker.currency.CurrencyChooserScreen;
import dze.n;
import e0b.c;
import e18.i;
import e2j.b;
import e2j.d;
import e2j.g;
import ho.h0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l1j.a;
import mx0.c7;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/new_picker/currency/CurrencyChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll1j/a;", "Ldli/a;", "Le2j/h;", "Lho/h0;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CurrencyChooserScreen extends ViewController<a> implements dli.a, h0 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new kotlin.jvm.internal.h0(CurrencyChooserScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/balance/picker/impl/databinding/ScreenCurrencyChooserBinding;", 0))};
    public final CurrencyChooserInputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CurrencyChooserScreen(CurrencyChooserInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_currency_chooser;
        this.M = s.t(this, b.f);
        this.N = w.y0(new i(2));
        this.O = w.y0(new i(3));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: e2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChooserScreen f122117b;

            {
                this.f122117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CurrencyChooserScreen currencyChooserScreen = this.f122117b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChooserScreen.T;
                        return (g) ((g2j.i) currencyChooserScreen.S.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChooserScreen.T;
                        CurrencyChooserScreen currencyChooserScreen2 = this.f122117b;
                        return dli.f.a(currencyChooserScreen2, currencyChooserScreen2.R2(), v.k((AccountCellItemDelegate) currencyChooserScreen2.N.getValue(), (FullScreenStateDelegate) currencyChooserScreen2.O.getValue(), new RowLoadingDelegate()), R$id.currencyChooser_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChooserScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChooserScreen.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        CurrencyChooserInputData currencyChooserInputData = currencyChooserScreen.K;
                        currencyChooserInputData.getClass();
                        return new g2j.i(fVar, currencyChooserScreen, currencyChooserInputData);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: e2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChooserScreen f122117b;

            {
                this.f122117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CurrencyChooserScreen currencyChooserScreen = this.f122117b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChooserScreen.T;
                        return (g) ((g2j.i) currencyChooserScreen.S.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChooserScreen.T;
                        CurrencyChooserScreen currencyChooserScreen2 = this.f122117b;
                        return dli.f.a(currencyChooserScreen2, currencyChooserScreen2.R2(), v.k((AccountCellItemDelegate) currencyChooserScreen2.N.getValue(), (FullScreenStateDelegate) currencyChooserScreen2.O.getValue(), new RowLoadingDelegate()), R$id.currencyChooser_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChooserScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChooserScreen.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        CurrencyChooserInputData currencyChooserInputData = currencyChooserScreen.K;
                        currencyChooserInputData.getClass();
                        return new g2j.i(fVar, currencyChooserScreen, currencyChooserInputData);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: e2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurrencyChooserScreen f122117b;

            {
                this.f122117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CurrencyChooserScreen currencyChooserScreen = this.f122117b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CurrencyChooserScreen.T;
                        return (g) ((g2j.i) currencyChooserScreen.S.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CurrencyChooserScreen.T;
                        CurrencyChooserScreen currencyChooserScreen2 = this.f122117b;
                        return dli.f.a(currencyChooserScreen2, currencyChooserScreen2.R2(), v.k((AccountCellItemDelegate) currencyChooserScreen2.N.getValue(), (FullScreenStateDelegate) currencyChooserScreen2.O.getValue(), new RowLoadingDelegate()), R$id.currencyChooser_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CurrencyChooserScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(currencyChooserScreen.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        CurrencyChooserInputData currencyChooserInputData = currencyChooserScreen.K;
                        currencyChooserInputData.getClass();
                        return new g2j.i(fVar, currencyChooserScreen, currencyChooserInputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e2j.h uiState = (e2j.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f302452c;
        TextLocalisedClause textLocalisedClause = uiState.f122125c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        boolean z = uiState.f122124b;
        navBarWithToolbar.setSearchButtonActive(z);
        if (!z || this.P) {
            return;
        }
        this.P = true;
        d3().f302452c.K0(j4.NO_ANIMATION);
        d3().f302452c.E0();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((e2j.o) R2()).C2(a.C1086a.f191546a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g2j.i) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f302452c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.balance_picker_search_hint, null, null, 14));
        Clause clause = this.K.f99486g;
        if (clause != null) {
            FooterTextView currencyChooserFooterView = d3().f302451b;
            Intrinsics.checkNotNullExpressionValue(currencyChooserFooterView, "currencyChooserFooterView");
            currencyChooserFooterView.setVisibility(0);
            d3().f302451b.setContent(new c7(clause, true, null, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f302452c.f59410q), new n(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(d3().f302452c.f59409p.f57337m), new c(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(((AccountCellItemDelegate) this.N.getValue()).f51551c.f53218h), new e2j.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new d(this, null), 3);
    }

    public final x1j.b d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x1j.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
