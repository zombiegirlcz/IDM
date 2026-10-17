package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.CreditCardOfferSelectDueDayScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.CreditCardOfferSelectDueDayScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.e1;
import dw3.f1;
import i5b.d;
import i84.b;
import i84.f;
import i84.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/due_day/CreditCardOfferSelectDueDayScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laii/q;", "Ldli/a;", "Li84/g;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardOfferSelectDueDayScreen extends PluginScreenController<q> implements a, c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditCardOfferSelectDueDayScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CreditCardOfferSelectDueDayScreenContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CreditCardOfferSelectDueDayScreen(CreditCardOfferSelectDueDayScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, b.f);
        this.O = w.y0(new i83.b(2));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: i84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardOfferSelectDueDayScreen f159433b;

            {
                this.f159433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardOfferSelectDueDayScreen creditCardOfferSelectDueDayScreen = this.f159433b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardOfferSelectDueDayScreen.S;
                        qji.b bVarU2 = creditCardOfferSelectDueDayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.di.CreditCardSelectDueDayScreenInjector");
                        e1 e1Var = (e1) ((h84.a) bVarU2);
                        c1 c1Var = e1Var.f118609c;
                        e1 e1Var2 = e1Var.d;
                        CreditCardOfferSelectDueDayScreenContract$InputData creditCardOfferSelectDueDayScreenContract$InputData = creditCardOfferSelectDueDayScreen.L;
                        creditCardOfferSelectDueDayScreenContract$InputData.getClass();
                        return new f1(c1Var, e1Var2, creditCardOfferSelectDueDayScreen, creditCardOfferSelectDueDayScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardOfferSelectDueDayScreen.S;
                        return (f) ((f1) creditCardOfferSelectDueDayScreen.P.getValue()).f118705j.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardOfferSelectDueDayScreen.S;
                        CreditCardOfferSelectDueDayScreen creditCardOfferSelectDueDayScreen2 = this.f159433b;
                        return dli.f.a(creditCardOfferSelectDueDayScreen2, creditCardOfferSelectDueDayScreen2.d(), d0.E0(((f1) creditCardOfferSelectDueDayScreen2.P.getValue()).c().Q(), u.c((GridSingleChoiceDelegate) creditCardOfferSelectDueDayScreen2.O.getValue())), creditCardOfferSelectDueDayScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: i84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardOfferSelectDueDayScreen f159433b;

            {
                this.f159433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardOfferSelectDueDayScreen creditCardOfferSelectDueDayScreen = this.f159433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardOfferSelectDueDayScreen.S;
                        qji.b bVarU2 = creditCardOfferSelectDueDayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.di.CreditCardSelectDueDayScreenInjector");
                        e1 e1Var = (e1) ((h84.a) bVarU2);
                        c1 c1Var = e1Var.f118609c;
                        e1 e1Var2 = e1Var.d;
                        CreditCardOfferSelectDueDayScreenContract$InputData creditCardOfferSelectDueDayScreenContract$InputData = creditCardOfferSelectDueDayScreen.L;
                        creditCardOfferSelectDueDayScreenContract$InputData.getClass();
                        return new f1(c1Var, e1Var2, creditCardOfferSelectDueDayScreen, creditCardOfferSelectDueDayScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardOfferSelectDueDayScreen.S;
                        return (f) ((f1) creditCardOfferSelectDueDayScreen.P.getValue()).f118705j.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardOfferSelectDueDayScreen.S;
                        CreditCardOfferSelectDueDayScreen creditCardOfferSelectDueDayScreen2 = this.f159433b;
                        return dli.f.a(creditCardOfferSelectDueDayScreen2, creditCardOfferSelectDueDayScreen2.d(), d0.E0(((f1) creditCardOfferSelectDueDayScreen2.P.getValue()).c().Q(), u.c((GridSingleChoiceDelegate) creditCardOfferSelectDueDayScreen2.O.getValue())), creditCardOfferSelectDueDayScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: i84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardOfferSelectDueDayScreen f159433b;

            {
                this.f159433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardOfferSelectDueDayScreen creditCardOfferSelectDueDayScreen = this.f159433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardOfferSelectDueDayScreen.S;
                        qji.b bVarU2 = creditCardOfferSelectDueDayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.di.CreditCardSelectDueDayScreenInjector");
                        e1 e1Var = (e1) ((h84.a) bVarU2);
                        c1 c1Var = e1Var.f118609c;
                        e1 e1Var2 = e1Var.d;
                        CreditCardOfferSelectDueDayScreenContract$InputData creditCardOfferSelectDueDayScreenContract$InputData = creditCardOfferSelectDueDayScreen.L;
                        creditCardOfferSelectDueDayScreenContract$InputData.getClass();
                        return new f1(c1Var, e1Var2, creditCardOfferSelectDueDayScreen, creditCardOfferSelectDueDayScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardOfferSelectDueDayScreen.S;
                        return (f) ((f1) creditCardOfferSelectDueDayScreen.P.getValue()).f118705j.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardOfferSelectDueDayScreen.S;
                        CreditCardOfferSelectDueDayScreen creditCardOfferSelectDueDayScreen2 = this.f159433b;
                        return dli.f.a(creditCardOfferSelectDueDayScreen2, creditCardOfferSelectDueDayScreen2.d(), d0.E0(((f1) creditCardOfferSelectDueDayScreen2.P.getValue()).c().Q(), u.c((GridSingleChoiceDelegate) creditCardOfferSelectDueDayScreen2.O.getValue())), creditCardOfferSelectDueDayScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f159436a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f159436a);
        navBarWithToolbar.setSecondDescriptionText(uiState.f159437b);
        d3().f174564b.setText(uiState.f159438c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f1) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new d(rd0.e.b(((GridSingleChoiceDelegate) this.O.getValue()).f52390g.f121375b), 9), new hy2.e(this, null, 15), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new i84.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new i84.d(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF78873d0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
