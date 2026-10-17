package com.revolut.retail.feature.balance.picker.impl.balance_picker_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.impl.R$layout;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreen;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n1j.g;
import n1j.i;
import n1j.j;
import n1j.k;
import n1j.l;
import n1j.n;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg1j/b;", "Ldli/a;", "Ln1j/s;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BalancePickerScreen extends ViewController<g1j.b> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(BalancePickerScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/balance/picker/impl/databinding/ScreenBalancePickerBinding;", 0))};
    public final BalanceSelector$InputData K;
    public final i1j.a L;
    public final int M;
    public final Object N;
    public boolean O;
    public final Object P;
    public final h Q;
    public final ListSubheaderDelegate R;
    public final RowDelegate S;
    public final TextDelegate T;
    public final Object U;
    public final boolean V;

    public BalancePickerScreen(BalanceSelector$InputData inputData, i1j.a interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.K = inputData;
        this.L = interactor;
        this.M = R$layout.screen_balance_picker;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: n1j.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BalancePickerScreen f211385b;

            {
                this.f211385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BalancePickerScreen balancePickerScreen = this.f211385b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BalancePickerScreen.W;
                        return (o) ((g2j.e) balancePickerScreen.U.getValue()).f140087j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BalancePickerScreen.W;
                        BalancePickerScreen balancePickerScreen2 = this.f211385b;
                        return dli.f.a(balancePickerScreen2, balancePickerScreen2.k3(), zhm.d0.E0(((fd6.a) ((g2j.e) balancePickerScreen2.U.getValue()).f.get()).e, zhm.v.k(balancePickerScreen2.R, balancePickerScreen2.S, balancePickerScreen2.T, new RowLoadingDelegate(), new FullScreenStateDelegate())), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BalancePickerScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(balancePickerScreen.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        BalanceSelector$InputData balanceSelector$InputData = balancePickerScreen.K;
                        balanceSelector$InputData.getClass();
                        i1j.a aVar3 = balancePickerScreen.L;
                        aVar3.getClass();
                        return new g2j.e(fVar, balancePickerScreen, balanceSelector$InputData, aVar3);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: n1j.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BalancePickerScreen f211385b;

            {
                this.f211385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BalancePickerScreen balancePickerScreen = this.f211385b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BalancePickerScreen.W;
                        return (o) ((g2j.e) balancePickerScreen.U.getValue()).f140087j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BalancePickerScreen.W;
                        BalancePickerScreen balancePickerScreen2 = this.f211385b;
                        return dli.f.a(balancePickerScreen2, balancePickerScreen2.k3(), zhm.d0.E0(((fd6.a) ((g2j.e) balancePickerScreen2.U.getValue()).f.get()).e, zhm.v.k(balancePickerScreen2.R, balancePickerScreen2.S, balancePickerScreen2.T, new RowLoadingDelegate(), new FullScreenStateDelegate())), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BalancePickerScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(balancePickerScreen.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        BalanceSelector$InputData balanceSelector$InputData = balancePickerScreen.K;
                        balanceSelector$InputData.getClass();
                        i1j.a aVar3 = balancePickerScreen.L;
                        aVar3.getClass();
                        return new g2j.e(fVar, balancePickerScreen, balanceSelector$InputData, aVar3);
                }
            }
        });
        this.Q = s.t(this, g.f);
        this.R = new ListSubheaderDelegate();
        this.S = new RowDelegate(null, null, 7);
        this.T = new TextDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: n1j.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BalancePickerScreen f211385b;

            {
                this.f211385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BalancePickerScreen balancePickerScreen = this.f211385b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BalancePickerScreen.W;
                        return (o) ((g2j.e) balancePickerScreen.U.getValue()).f140087j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BalancePickerScreen.W;
                        BalancePickerScreen balancePickerScreen2 = this.f211385b;
                        return dli.f.a(balancePickerScreen2, balancePickerScreen2.k3(), zhm.d0.E0(((fd6.a) ((g2j.e) balancePickerScreen2.U.getValue()).f.get()).e, zhm.v.k(balancePickerScreen2.R, balancePickerScreen2.S, balancePickerScreen2.T, new RowLoadingDelegate(), new FullScreenStateDelegate())), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BalancePickerScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(balancePickerScreen.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        BalanceSelector$InputData balanceSelector$InputData = balancePickerScreen.K;
                        balanceSelector$InputData.getClass();
                        i1j.a aVar3 = balancePickerScreen.L;
                        aVar3.getClass();
                        return new g2j.e(fVar, balancePickerScreen, balanceSelector$InputData, aVar3);
                }
            }
        });
        this.V = true;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        Integer num;
        n1j.s uiState = (n1j.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        n nVar = uiState.f211402c;
        if (!this.O && (num = uiState.f211401b) != null) {
            int iIntValue = num.intValue();
            ScreenContentRecyclerView recyclerView = d3().f302449c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            recyclerView.addOnLayoutChangeListener(new l(this, iIntValue));
        }
        if (nVar.f211394a) {
            TwinVerticalButton twinVerticalButton = d3().e;
            twinVerticalButton.setVisibility(0);
            TwinVerticalButton.setDescription$default(twinVerticalButton, nVar.f211395b, null, null, 6, null);
            twinVerticalButton.setMainButtonEnabled(true);
            twinVerticalButton.setMainButtonVisible(true);
            twinVerticalButton.setGradientBackgroundEnabled(true);
            twinVerticalButton.setSecondaryButtonVisible(false);
        } else {
            TwinVerticalButton twinVerticalButton2 = d3().e;
            Intrinsics.checkNotNullExpressionValue(twinVerticalButton2, "twinVerticalButton");
            twinVerticalButton2.setVisibility(8);
        }
        u1j.b bVar = uiState.d;
        ArrayList arrayList = bVar != null ? bVar.f276413a : null;
        if (arrayList == null || arrayList.isEmpty()) {
            Tabs tabs = d3().d;
            Intrinsics.checkNotNullExpressionValue(tabs, "tabs");
            tabs.setVisibility(8);
        } else {
            Tabs tabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(tabs2, "tabs");
            tabs2.setVisibility(0);
            d3().d.setItems(arrayList, bVar.f276414b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g2j.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f302448b;
        BalanceSelector$InputData balanceSelector$InputData = this.K;
        Clause clause = balanceSelector$InputData.d;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        if (balanceSelector$InputData.i.contains(BalanceSelector$ExtraConfiguration.SearchEnabled.f99374a)) {
            navBarWithToolbar.K0(j4.NO_ANIMATION);
            navBarWithToolbar.setHint(new TextLocalisedClause(R$string.move_money_picker_search, null, null, 14));
        }
        d3().e.setCollapsible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, h30.l.y(d3().f302448b.f59410q, d3().f302448b.f59409p.f57336l, "merge(...)"), new n1j.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f302448b.f59409p.f57337m), new i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new j(this, null), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(this.T.d), new i(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o0()), new n1j.h(this, continuation, i), 3);
        d3().e.setMainButtonText(new TextLocalisedClause(R$string.currency_picker_cta_title, null, null, 14));
        ViewController.P2(this, rd0.e.b(d3().d.f58882b), new i(this, continuation, 2), 3);
    }

    public final x1j.a d3() {
        ViewBinding value = this.Q.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x1j.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n1j.o k3() {
        return (n1j.o) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
