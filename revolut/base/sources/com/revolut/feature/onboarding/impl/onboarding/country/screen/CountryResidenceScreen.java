package com.revolut.feature.onboarding.impl.onboarding.country.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.d;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import java.util.List;
import kji.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import q50.w;
import qa9.e;
import qa9.l;
import qa9.n;
import ta9.i;
import tki.b;
import tki.c;
import tx0.j0;
import vc.s;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/screen/CountryResidenceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqa9/l;", "Ltki/c;", "Lqa9/n;", "Lno/m;", "Lkji/f;", "Lin0/g;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountryResidenceScreen extends ViewController<l> implements c, m, f, g {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CountryResidenceScreen.class, "binding", "getBinding()Lcom/revolut/feature/onboarding/impl/databinding/ScreenCountryBinding;", 0))};
    public final CountryResidenceScreenContract$InputData K;
    public final h L;
    public final Lazy M;
    public final Lazy N;
    public final Lazy O;
    public final Lazy P;
    public final Lazy Q;
    public final Object R;
    public final Object S;
    public final int T;
    public final boolean U;
    public final Object V;

    public CountryResidenceScreen(CountryResidenceScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, qa9.f.f);
        this.M = j.b(new w(20));
        this.N = j.b(new w(21));
        this.O = j.b(new w(22));
        this.P = j.b(new w(23));
        this.Q = j.b(new e(this, 1));
        this.R = te0.w.y0(new e(this, 2));
        this.S = te0.w.y0(new e(this, 3));
        this.T = R$layout.screen_country;
        this.U = true;
        this.V = te0.w.y0(new e(this, 4));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f213607c;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TextLocalisedClause textLocalisedClause = uiState.f243995b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f243996c);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        d3().f213606b.setModel(new aw0.e(false, uiState.d, null, new n6(uiState.e, LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f, null, null, 988), new d(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, 37));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return (AnalyticsProduct) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r4 = this.V;
        ((b) ((tki.a) r4.getValue())).f271959b.h().setTag(R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        ((b) ((tki.a) r4.getValue())).f271959b.h().addOnScrollListener(new qa9.q(new e(this, 0)));
        Integer numA = this.K.d.a();
        if (numA != null) {
            d3().f213607c.setNavigationButtonIcon(Integer.valueOf(numA.intValue()));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ActionFooterView actionFooterView = d3().f213606b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(actionFooterView.f), new qa9.g(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.e), new qa9.j(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f58956h), new qa9.g(this, continuation, 2), 3);
        Lazy lazy = this.M;
        ViewController.P2(this, h30.l.y(((InputTextDelegate) lazy.getValue()).f52575g.f121375b, ((InputTextDelegate) lazy.getValue()).i.f121375b, "merge(...)"), new qa9.i(this, null), 3);
        ViewController.P2(this, h30.l.y(((ListCellDelegate) this.N.getValue()).d, ((TextDelegate) this.O.getValue()).d, "merge(...)"), new qa9.j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) this.P.getValue()).f52518c), new qa9.h(this, null), 3);
        if (this.K.d.b()) {
            ViewController.P2(this, rd0.e.b(d3().f213607c.f59410q), new qa9.g(this, continuation, 0), 3);
        }
    }

    public final n99.a d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n99.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qa9.m d() {
        return (qa9.m) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
