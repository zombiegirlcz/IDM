package com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.R$id;
import com.revolut.feature.topup_screen.impl.R$layout;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.IndiaTopupSelectCountryScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import n08.b;
import n0f.c;
import n0f.f;
import n0f.g;
import n0f.l;
import qve.o;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/india_topup_select_country/IndiaTopupSelectCountryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln0f/f;", "Ldli/a;", "Ln0f/l;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndiaTopupSelectCountryScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(IndiaTopupSelectCountryScreen.class, "binding", "getBinding()Lcom/revolut/feature/topup_screen/impl/databinding/ScreenMcySelectCountryBinding;", 0))};
    public final int K = R$layout.screen_mcy_select_country;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new b(6));
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, lve.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/topup_screen/impl/databinding/ScreenMcySelectCountryBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.mcySelectCountry_confirmButton;
            TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
            if (twinVerticalButton != null) {
                i = R$id.mcySelectCountry_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.mcySelectCountry_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new lve.b(twinVerticalButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public IndiaTopupSelectCountryScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: n0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaTopupSelectCountryScreen f211021b;

            {
                this.f211021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IndiaTopupSelectCountryScreen indiaTopupSelectCountryScreen = this.f211021b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaTopupSelectCountryScreen.Q;
                        return (g) ((o) indiaTopupSelectCountryScreen.O.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaTopupSelectCountryScreen.Q;
                        qji.b bVarU2 = indiaTopupSelectCountryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.di.SelectCountryScreenInjector");
                        qve.m mVar = (qve.m) bVarU2;
                        return new o(mVar.f249627c, mVar.d);
                    default:
                        KProperty[] kPropertyArr3 = IndiaTopupSelectCountryScreen.Q;
                        IndiaTopupSelectCountryScreen indiaTopupSelectCountryScreen2 = this.f211021b;
                        return dli.f.a(indiaTopupSelectCountryScreen2, (g) indiaTopupSelectCountryScreen2.N.getValue(), v.k((InputTextDelegate) indiaTopupSelectCountryScreen2.M.getValue(), new TextDelegate()), R$id.mcySelectCountry_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: n0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaTopupSelectCountryScreen f211021b;

            {
                this.f211021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IndiaTopupSelectCountryScreen indiaTopupSelectCountryScreen = this.f211021b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaTopupSelectCountryScreen.Q;
                        return (g) ((o) indiaTopupSelectCountryScreen.O.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaTopupSelectCountryScreen.Q;
                        qji.b bVarU2 = indiaTopupSelectCountryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.di.SelectCountryScreenInjector");
                        qve.m mVar = (qve.m) bVarU2;
                        return new o(mVar.f249627c, mVar.d);
                    default:
                        KProperty[] kPropertyArr3 = IndiaTopupSelectCountryScreen.Q;
                        IndiaTopupSelectCountryScreen indiaTopupSelectCountryScreen2 = this.f211021b;
                        return dli.f.a(indiaTopupSelectCountryScreen2, (g) indiaTopupSelectCountryScreen2.N.getValue(), v.k((InputTextDelegate) indiaTopupSelectCountryScreen2.M.getValue(), new TextDelegate()), R$id.mcySelectCountry_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: n0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaTopupSelectCountryScreen f211021b;

            {
                this.f211021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IndiaTopupSelectCountryScreen indiaTopupSelectCountryScreen = this.f211021b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaTopupSelectCountryScreen.Q;
                        return (g) ((o) indiaTopupSelectCountryScreen.O.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaTopupSelectCountryScreen.Q;
                        qji.b bVarU2 = indiaTopupSelectCountryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.di.SelectCountryScreenInjector");
                        qve.m mVar = (qve.m) bVarU2;
                        return new o(mVar.f249627c, mVar.d);
                    default:
                        KProperty[] kPropertyArr3 = IndiaTopupSelectCountryScreen.Q;
                        IndiaTopupSelectCountryScreen indiaTopupSelectCountryScreen2 = this.f211021b;
                        return dli.f.a(indiaTopupSelectCountryScreen2, (g) indiaTopupSelectCountryScreen2.N.getValue(), v.k((InputTextDelegate) indiaTopupSelectCountryScreen2.M.getValue(), new TextDelegate()), R$id.mcySelectCountry_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton mcySelectCountryConfirmButton = ((lve.b) value).f200364b;
        Intrinsics.checkNotNullExpressionValue(mcySelectCountryConfirmButton, "mcySelectCountryConfirmButton");
        mcySelectCountryConfirmButton.setMainButtonEnabled(uiState.f211029b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = Q;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.L;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton mcySelectCountryConfirmButton = ((lve.b) value).f200364b;
        Intrinsics.checkNotNullExpressionValue(mcySelectCountryConfirmButton, "mcySelectCountryConfirmButton");
        mcySelectCountryConfirmButton.setSecondaryButtonVisible(false);
        TwinVerticalButton.setDescription$default(mcySelectCountryConfirmButton, new TextLocalisedClause(R$string.topup_mcy_select_visit_country_footer, null, null, 14), null, null, 6, null);
        mcySelectCountryConfirmButton.setMainButtonText(new TextLocalisedClause(R$string.topup_mcy_select_visit_country_continue, null, null, 14));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        NavBarWithToolbar mcySelectCountryNavBarWithToolbar = ((lve.b) value2).f200365c;
        Intrinsics.checkNotNullExpressionValue(mcySelectCountryNavBarWithToolbar, "mcySelectCountryNavBarWithToolbar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_mcy_select_visit_country_title, null, null, 14);
        mcySelectCountryNavBarWithToolbar.setToolbarTitle(textLocalisedClause);
        mcySelectCountryNavBarWithToolbar.setTitle(textLocalisedClause, null);
        mcySelectCountryNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        mcySelectCountryNavBarWithToolbar.setSecondDescriptionVisible(true);
        mcySelectCountryNavBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        mcySelectCountryNavBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.topup_mcy_select_visit_country_subtitle, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = Q;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.L;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton mcySelectCountryConfirmButton = ((lve.b) value).f200364b;
        Intrinsics.checkNotNullExpressionValue(mcySelectCountryConfirmButton, "mcySelectCountryConfirmButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(mcySelectCountryConfirmButton.o0()), null, new n0f.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).f52575g.f121375b), null, new c(this, null), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        NavBarWithToolbar mcySelectCountryNavBarWithToolbar = ((lve.b) value2).f200365c;
        Intrinsics.checkNotNullExpressionValue(mcySelectCountryNavBarWithToolbar, "mcySelectCountryNavBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(mcySelectCountryNavBarWithToolbar.f59410q), null, new n0f.b(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
