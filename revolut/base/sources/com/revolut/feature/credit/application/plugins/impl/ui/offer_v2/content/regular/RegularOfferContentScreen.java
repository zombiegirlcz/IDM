package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.k;
import bx4.c;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.RegularOfferContentScreen;
import com.revolut.feature.credit.core.R$string;
import dli.a;
import dw3.a9;
import dw3.b9;
import hx7.e;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import pf4.n;
import pf4.o;
import pf4.p;
import pf4.t;
import rr0.f;
import sf4.b;
import sf4.d;
import sf4.g;
import te0.w;
import tx0.j0;
import vc.s;
import yhm.m;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/content/regular/RegularOfferContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lpf4/n;", "Ldli/a;", "Lpf4/u;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RegularOfferContentScreen extends PluginScreenController<n> implements a, c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RegularOfferContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final OfferContentScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public f S;

    public RegularOfferContentScreen(OfferContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegularOfferContentScreen f262346b;

            {
                this.f262346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RegularOfferContentScreen regularOfferContentScreen = this.f262346b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RegularOfferContentScreen.T;
                        qji.b bVarU2 = regularOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.di.RegularOfferContentScreenInjector");
                        a9 a9Var = (a9) ((tf4.a) bVarU2).A().mo3808a(regularOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = regularOfferContentScreen.L;
                        switch (a9Var.f118298a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                a9Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                a9Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (b9) a9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = RegularOfferContentScreen.T;
                        b9 b9Var = (b9) regularOfferContentScreen.N.getValue();
                        switch (b9Var.f118396a) {
                            case 0:
                                return (o) b9Var.k.get();
                            default:
                                return (o) b9Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RegularOfferContentScreen.T;
                        RegularOfferContentScreen regularOfferContentScreen2 = this.f262346b;
                        return dli.f.a(regularOfferContentScreen2, regularOfferContentScreen2.d(), d0.E0(u.c(regularOfferContentScreen2.R), ((b9) regularOfferContentScreen2.N.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: sf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegularOfferContentScreen f262346b;

            {
                this.f262346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RegularOfferContentScreen regularOfferContentScreen = this.f262346b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RegularOfferContentScreen.T;
                        qji.b bVarU2 = regularOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.di.RegularOfferContentScreenInjector");
                        a9 a9Var = (a9) ((tf4.a) bVarU2).A().mo3808a(regularOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = regularOfferContentScreen.L;
                        switch (a9Var.f118298a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                a9Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                a9Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (b9) a9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = RegularOfferContentScreen.T;
                        b9 b9Var = (b9) regularOfferContentScreen.N.getValue();
                        switch (b9Var.f118396a) {
                            case 0:
                                return (o) b9Var.k.get();
                            default:
                                return (o) b9Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RegularOfferContentScreen.T;
                        RegularOfferContentScreen regularOfferContentScreen2 = this.f262346b;
                        return dli.f.a(regularOfferContentScreen2, regularOfferContentScreen2.d(), d0.E0(u.c(regularOfferContentScreen2.R), ((b9) regularOfferContentScreen2.N.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, sf4.c.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: sf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegularOfferContentScreen f262346b;

            {
                this.f262346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RegularOfferContentScreen regularOfferContentScreen = this.f262346b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RegularOfferContentScreen.T;
                        qji.b bVarU2 = regularOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.di.RegularOfferContentScreenInjector");
                        a9 a9Var = (a9) ((tf4.a) bVarU2).A().mo3808a(regularOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = regularOfferContentScreen.L;
                        switch (a9Var.f118298a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                a9Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                a9Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (b9) a9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = RegularOfferContentScreen.T;
                        b9 b9Var = (b9) regularOfferContentScreen.N.getValue();
                        switch (b9Var.f118396a) {
                            case 0:
                                return (o) b9Var.k.get();
                            default:
                                return (o) b9Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = RegularOfferContentScreen.T;
                        RegularOfferContentScreen regularOfferContentScreen2 = this.f262346b;
                        return dli.f.a(regularOfferContentScreen2, regularOfferContentScreen2.d(), d0.E0(u.c(regularOfferContentScreen2.R), ((b9) regularOfferContentScreen2.N.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new FullScreenStateDelegate();
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) throws Throwable {
        Object objA;
        pf4.u uiState = (pf4.u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        try {
            m.Companion companion = m.INSTANCE;
            t tVar = uiState.f235463b;
            Intrinsics.i(tVar, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract.UIState.HeaderContent.Regular");
            p pVar = (p) tVar;
            Clause clause = pVar.f;
            Clause clause2 = pVar.d;
            TextLocalisedClause textLocalisedClause = pVar.f235451b;
            NavBarWithToolbar navBarWithToolbarE3 = e3();
            navBarWithToolbarE3.setNavigationButtonImage(pVar.f235450a);
            navBarWithToolbarE3.setTitle(textLocalisedClause, null);
            navBarWithToolbarE3.setToolbarTitle(textLocalisedClause);
            navBarWithToolbarE3.setDescriptionText(clause2);
            navBarWithToolbarE3.setDescriptionVisible(clause2 != null);
            navBarWithToolbarE3.setDescriptionImage(pVar.e, (ProgressStyle) null, false);
            navBarWithToolbarE3.setSecondDescriptionText(clause);
            navBarWithToolbarE3.setSecondDescriptionVisible(clause != null);
            TagViewData tagViewData = pVar.f235452c;
            if (tagViewData != null) {
                navBarWithToolbarE3.setMenuTagContent(tagViewData);
            }
            navBarWithToolbarE3.setMenuItems(pVar.f235453g);
            objA = Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton = ((k) value).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        boolean z = uiState.f;
        boolean z3 = uiState.f235464c;
        creditApplicationTwinVerticalButton.setMainButtonVisible(z);
        Clause clause3 = uiState.d;
        creditApplicationTwinVerticalButton.setFabEnabled(clause3 != null);
        creditApplicationTwinVerticalButton.setMainButtonText(clause3);
        int i = b.f262347a[this.L.f.ordinal()];
        if (i == 1) {
            f fVar = this.S;
            if (fVar != null) {
                fVar.b(z3);
                return;
            } else {
                Intrinsics.r("mainButtonLoadingController");
                throw null;
            }
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        f fVar2 = this.S;
        if (fVar2 != null) {
            fVar2.c(z3);
        } else {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        o.g0(d());
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b9) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        e3().setHeaderTitleMode(j0.MULTILINE_LARGE);
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton = ((k) value).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        creditApplicationTwinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.credit_application_quick_scroll_action, null, null, 14), LDSFile.EF_DG4_TAG));
        creditApplicationTwinVerticalButton.setMainButtonVisible(false);
        creditApplicationTwinVerticalButton.setSecondaryButtonVisible(false);
        creditApplicationTwinVerticalButton.setCollapsible(true);
        this.S = creditApplicationTwinVerticalButton.l0();
        ((dli.c) this.Q.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f59410q), null, new sf4.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().x0()), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().o.f57403b), null, new g(this, continuation, 1), 3);
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton = ((k) value).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditApplicationTwinVerticalButton.o0()), null, new sf4.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditApplicationTwinVerticalButton.m0()), null, new sf4.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final o d() {
        return (o) this.O.getValue();
    }

    public final NavBarWithToolbar e3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = ((k) value).f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        return creditApplicationNavBarWithToolbar;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
