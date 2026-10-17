package com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell;

import a84.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f2;
import au0.s0;
import au0.u0;
import au0.v0;
import aw0.s8;
import aw3.g;
import bx4.c;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.OfferUpsellScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dw3.c1;
import dw3.n4;
import dw3.p4;
import ff4.b0;
import ff4.q;
import ff4.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/content/upsell/OfferUpsellScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lff4/q;", "Ldli/a;", "Lff4/s;", "Lbx4/c;", "La84/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OfferUpsellScreen extends PluginScreenController<q> implements a, c, b {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(OfferUpsellScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditOfferWithBigTileBinding;", 0))};
    public final OfferContentScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public f T;

    public OfferUpsellScreen(OfferContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_offer_with_big_tile;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferUpsellScreen f173650b;

            {
                this.f173650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OfferUpsellScreen offerUpsellScreen = this.f173650b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OfferUpsellScreen.U;
                        qji.b bVarU2 = offerUpsellScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.di.OfferUpsellScreenComponentInjector");
                        n4 n4Var = (n4) bVarU2;
                        c1 c1Var = n4Var.f119339c;
                        n4 n4Var2 = n4Var.d;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerUpsellScreen.L;
                        offerContentScreenContract$InputData.getClass();
                        return new p4(c1Var, n4Var2, offerUpsellScreen, offerContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferUpsellScreen.U;
                        return (r) ((p4) offerUpsellScreen.N.getValue()).f119510r.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferUpsellScreen.U;
                        return ((p4) offerUpsellScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = OfferUpsellScreen.U;
                        OfferUpsellScreen offerUpsellScreen2 = this.f173650b;
                        return dli.f.a(offerUpsellScreen2, offerUpsellScreen2.R2(), d0.E0(u.c(offerUpsellScreen2.S), ((p4) offerUpsellScreen2.N.getValue()).c().Q()), R$id.creditOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferUpsellScreen f173650b;

            {
                this.f173650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OfferUpsellScreen offerUpsellScreen = this.f173650b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferUpsellScreen.U;
                        qji.b bVarU2 = offerUpsellScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.di.OfferUpsellScreenComponentInjector");
                        n4 n4Var = (n4) bVarU2;
                        c1 c1Var = n4Var.f119339c;
                        n4 n4Var2 = n4Var.d;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerUpsellScreen.L;
                        offerContentScreenContract$InputData.getClass();
                        return new p4(c1Var, n4Var2, offerUpsellScreen, offerContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferUpsellScreen.U;
                        return (r) ((p4) offerUpsellScreen.N.getValue()).f119510r.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferUpsellScreen.U;
                        return ((p4) offerUpsellScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = OfferUpsellScreen.U;
                        OfferUpsellScreen offerUpsellScreen2 = this.f173650b;
                        return dli.f.a(offerUpsellScreen2, offerUpsellScreen2.R2(), d0.E0(u.c(offerUpsellScreen2.S), ((p4) offerUpsellScreen2.N.getValue()).c().Q()), R$id.creditOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, jf4.b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferUpsellScreen f173650b;

            {
                this.f173650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OfferUpsellScreen offerUpsellScreen = this.f173650b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferUpsellScreen.U;
                        qji.b bVarU2 = offerUpsellScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.di.OfferUpsellScreenComponentInjector");
                        n4 n4Var = (n4) bVarU2;
                        c1 c1Var = n4Var.f119339c;
                        n4 n4Var2 = n4Var.d;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerUpsellScreen.L;
                        offerContentScreenContract$InputData.getClass();
                        return new p4(c1Var, n4Var2, offerUpsellScreen, offerContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferUpsellScreen.U;
                        return (r) ((p4) offerUpsellScreen.N.getValue()).f119510r.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferUpsellScreen.U;
                        return ((p4) offerUpsellScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = OfferUpsellScreen.U;
                        OfferUpsellScreen offerUpsellScreen2 = this.f173650b;
                        return dli.f.a(offerUpsellScreen2, offerUpsellScreen2.R2(), d0.E0(u.c(offerUpsellScreen2.S), ((p4) offerUpsellScreen2.N.getValue()).c().Q()), R$id.creditOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: jf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferUpsellScreen f173650b;

            {
                this.f173650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                OfferUpsellScreen offerUpsellScreen = this.f173650b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferUpsellScreen.U;
                        qji.b bVarU2 = offerUpsellScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.di.OfferUpsellScreenComponentInjector");
                        n4 n4Var = (n4) bVarU2;
                        c1 c1Var = n4Var.f119339c;
                        n4 n4Var2 = n4Var.d;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerUpsellScreen.L;
                        offerContentScreenContract$InputData.getClass();
                        return new p4(c1Var, n4Var2, offerUpsellScreen, offerContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferUpsellScreen.U;
                        return (r) ((p4) offerUpsellScreen.N.getValue()).f119510r.get();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferUpsellScreen.U;
                        return ((p4) offerUpsellScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = OfferUpsellScreen.U;
                        OfferUpsellScreen offerUpsellScreen2 = this.f173650b;
                        return dli.f.a(offerUpsellScreen2, offerUpsellScreen2.R2(), d0.E0(u.c(offerUpsellScreen2.S), ((p4) offerUpsellScreen2.N.getValue()).c().Q()), R$id.creditOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = new FullScreenStateDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ff4.s uiState = (ff4.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a84.a aVar = (a84.a) this.Q.getValue();
        boolean z = uiState.k;
        aVar.Q(z, z);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        f3().setTitle(uiState.f134740b);
        f3().setDescription(uiState.f134741c);
        f3().setPages(u.c(new u0(new NavBarWithContainerBackground.ImageBackground(uiState.d, s8.MULTICOLOR, (Color.SolidRes) null, 12), null, null, null)), f2.LINE_INDICATOR, v0.NONE);
        f3().setToolbarTagView(uiState.e);
        TwinVerticalButton twinVerticalButtonE = E();
        Clause clause = uiState.i;
        twinVerticalButtonE.setFabEnabled(clause != null);
        twinVerticalButtonE.setMainButtonText(clause);
        f fVar = this.T;
        if (fVar != null) {
            fVar.b(uiState.f134744j);
        } else {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
    }

    @Override // a84.b
    public final TwinVerticalButton E() {
        TwinVerticalButton creditOfferTwinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditOfferTwinVerticalButton, "creditOfferTwinVerticalButton");
        return creditOfferTwinVerticalButton;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b0) R2()).J2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p4) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f3().setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        f3().setLayoutType(s0.CENTERED_HORIZONTALLY);
        this.T = E().l0();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59357t), null, new j2c.b(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new jf4.c(this, null), 3);
    }

    public final g d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.O.getValue();
    }

    @Override // a84.b
    public final void f1() {
        ((b0) R2()).I2();
    }

    public final NavBarWithBigTile f3() {
        NavBarWithBigTile creditOfferNavBarWithBigTile = d3().f10686b;
        Intrinsics.checkNotNullExpressionValue(creditOfferNavBarWithBigTile, "creditOfferNavBarWithBigTile");
        return creditOfferNavBarWithBigTile;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    @Override // a84.b
    public final RecyclerView h() {
        ScreenContentRecyclerView creditOfferRecyclerView = d3().f10687c;
        Intrinsics.checkNotNullExpressionValue(creditOfferRecyclerView, "creditOfferRecyclerView");
        return creditOfferRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // a84.b
    public final void o1() {
        f3().setExpanded(false, true);
    }
}
