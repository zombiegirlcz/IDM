package com.revolut.sso.impl.ui.country_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreen;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreenContract$InputData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.j0;
import ljl.p;
import ljl.q0;
import nfj.j2;
import nml.d;
import nml.h;
import nml.i;
import nml.k;
import nml.l;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/country_selection/CountrySelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnml/h;", "Ltki/c;", "Lnml/l;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountrySelectionScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CountrySelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final CountrySelectionScreenContract$InputData K;
    public final ao.h L;
    public final Lazy M;
    public final Lazy N;
    public final Lazy O;
    public final Lazy P;
    public final Object Q;
    public final int R;
    public final Object S;
    public final Object T;

    public CountrySelectionScreen(CountrySelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, nml.b.f);
        this.M = j.b(new nme.c(8));
        this.N = j.b(new nme.c(9));
        this.O = j.b(new nme.c(10));
        this.P = j.b(new nme.c(11));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: nml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountrySelectionScreen f217374b;

            {
                this.f217374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CountrySelectionScreen countrySelectionScreen = this.f217374b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CountrySelectionScreen.U;
                        qji.b bVarU2 = countrySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.country_selection.di.CountrySelectionScreenInjector");
                        j0 j0Var = (j0) bVarU2;
                        q0 q0Var = j0Var.f195999c;
                        j0 j0Var2 = j0Var.d;
                        CountrySelectionScreenContract$InputData countrySelectionScreenContract$InputData = countrySelectionScreen.K;
                        countrySelectionScreenContract$InputData.getClass();
                        return new p(q0Var, j0Var2, countrySelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CountrySelectionScreen.U;
                        return (i) ((p) countrySelectionScreen.Q.getValue()).f196049c.get();
                    default:
                        KProperty[] kPropertyArr3 = CountrySelectionScreen.U;
                        CountrySelectionScreen countrySelectionScreen2 = this.f217374b;
                        return tki.g.a(countrySelectionScreen2, countrySelectionScreen2.d(), v.k((InputChecklistDelegate) countrySelectionScreen2.P.getValue(), (InputTextDelegate) countrySelectionScreen2.M.getValue(), (ListCellDelegate) countrySelectionScreen2.N.getValue(), new ListSubheaderDelegate(), (TextDelegate) countrySelectionScreen2.O.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: nml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountrySelectionScreen f217374b;

            {
                this.f217374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CountrySelectionScreen countrySelectionScreen = this.f217374b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CountrySelectionScreen.U;
                        qji.b bVarU2 = countrySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.country_selection.di.CountrySelectionScreenInjector");
                        j0 j0Var = (j0) bVarU2;
                        q0 q0Var = j0Var.f195999c;
                        j0 j0Var2 = j0Var.d;
                        CountrySelectionScreenContract$InputData countrySelectionScreenContract$InputData = countrySelectionScreen.K;
                        countrySelectionScreenContract$InputData.getClass();
                        return new p(q0Var, j0Var2, countrySelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CountrySelectionScreen.U;
                        return (i) ((p) countrySelectionScreen.Q.getValue()).f196049c.get();
                    default:
                        KProperty[] kPropertyArr3 = CountrySelectionScreen.U;
                        CountrySelectionScreen countrySelectionScreen2 = this.f217374b;
                        return tki.g.a(countrySelectionScreen2, countrySelectionScreen2.d(), v.k((InputChecklistDelegate) countrySelectionScreen2.P.getValue(), (InputTextDelegate) countrySelectionScreen2.M.getValue(), (ListCellDelegate) countrySelectionScreen2.N.getValue(), new ListSubheaderDelegate(), (TextDelegate) countrySelectionScreen2.O.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: nml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountrySelectionScreen f217374b;

            {
                this.f217374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CountrySelectionScreen countrySelectionScreen = this.f217374b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CountrySelectionScreen.U;
                        qji.b bVarU2 = countrySelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.country_selection.di.CountrySelectionScreenInjector");
                        j0 j0Var = (j0) bVarU2;
                        q0 q0Var = j0Var.f195999c;
                        j0 j0Var2 = j0Var.d;
                        CountrySelectionScreenContract$InputData countrySelectionScreenContract$InputData = countrySelectionScreen.K;
                        countrySelectionScreenContract$InputData.getClass();
                        return new p(q0Var, j0Var2, countrySelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CountrySelectionScreen.U;
                        return (i) ((p) countrySelectionScreen.Q.getValue()).f196049c.get();
                    default:
                        KProperty[] kPropertyArr3 = CountrySelectionScreen.U;
                        CountrySelectionScreen countrySelectionScreen2 = this.f217374b;
                        return tki.g.a(countrySelectionScreen2, countrySelectionScreen2.d(), v.k((InputChecklistDelegate) countrySelectionScreen2.P.getValue(), (InputTextDelegate) countrySelectionScreen2.M.getValue(), (ListCellDelegate) countrySelectionScreen2.N.getValue(), new ListSubheaderDelegate(), (TextDelegate) countrySelectionScreen2.O.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        k kVar = uiState.f217387b;
        TextLocalisedClause textLocalisedClause = kVar.f217384a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(kVar.f217385b);
        navBarWithToolbar.setHeaderTitleMode(tx0.j0.MULTILINE);
        TwinVerticalButton twinVerticalButton = d3().d;
        TwinVerticalButton.setDescription$default(twinVerticalButton, uiState.f217388c, null, null, 6, null);
        nml.j jVar = uiState.d;
        twinVerticalButton.setMainButtonText(jVar.f217382a);
        twinVerticalButton.setMainButtonEnabled(jVar.f217383b);
        twinVerticalButton.setSecondaryButtonVisible(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        ((tki.b) ((tki.a) this.T.getValue())).f271959b.h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinVerticalButton twinVerticalButton = d3().d;
        ViewController.P2(this, rd0.e.b(twinVerticalButton.o0()), new j2(this, null, 15), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.f59017j), new nml.c(this, null, 0), 3);
        Lazy lazy = this.M;
        ViewController.P2(this, h30.l.y(((InputTextDelegate) lazy.getValue()).f52575g.f121375b, ((InputTextDelegate) lazy.getValue()).i.f121375b, "merge(...)"), new d(this, null), 3);
        ViewController.P2(this, h30.l.y(((ListCellDelegate) this.N.getValue()).d, ((TextDelegate) this.O.getValue()).d, "merge(...)"), new nml.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) this.P.getValue()).f52518c), new nml.e(this, null), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
