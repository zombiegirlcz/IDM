package com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.OfferTopItemContentScreen;
import df4.i;
import dli.a;
import dw3.c1;
import dw3.n4;
import dw3.o4;
import ff4.b0;
import ff4.j;
import ff4.k;
import ff4.q;
import ff4.r;
import ghk.a0;
import hf4.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import tx0.x1;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/content/topItem/OfferTopItemContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lff4/q;", "Ldli/a;", "Lff4/s;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OfferTopItemContentScreen extends PluginScreenController<q> implements a, c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(OfferTopItemContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditCardOfferBinding;", 0))};
    public final OfferContentScreenContract$InputData L;
    public final i M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public f T;

    public OfferTopItemContentScreen(OfferContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = new i();
        this.N = R$layout.screen_credit_card_offer;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferTopItemContentScreen f151747b;

            {
                this.f151747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OfferTopItemContentScreen offerTopItemContentScreen = this.f151747b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OfferTopItemContentScreen.U;
                        qji.b bVarU2 = offerTopItemContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.di.OfferTopItemScreenComponentInjector");
                        n4 n4Var = (n4) bVarU2;
                        c1 c1Var = n4Var.f119339c;
                        n4 n4Var2 = n4Var.d;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerTopItemContentScreen.L;
                        offerContentScreenContract$InputData.getClass();
                        return new o4(c1Var, n4Var2, offerTopItemContentScreen, offerContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferTopItemContentScreen.U;
                        return (r) ((o4) offerTopItemContentScreen.O.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = OfferTopItemContentScreen.U;
                        OfferTopItemContentScreen offerTopItemContentScreen2 = this.f151747b;
                        return dli.f.a(offerTopItemContentScreen2, offerTopItemContentScreen2.R2(), d0.E0(u.c(offerTopItemContentScreen2.S), ((o4) offerTopItemContentScreen2.O.getValue()).c().Q()), R$id.creditCardOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: hf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferTopItemContentScreen f151747b;

            {
                this.f151747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OfferTopItemContentScreen offerTopItemContentScreen = this.f151747b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferTopItemContentScreen.U;
                        qji.b bVarU2 = offerTopItemContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.di.OfferTopItemScreenComponentInjector");
                        n4 n4Var = (n4) bVarU2;
                        c1 c1Var = n4Var.f119339c;
                        n4 n4Var2 = n4Var.d;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerTopItemContentScreen.L;
                        offerContentScreenContract$InputData.getClass();
                        return new o4(c1Var, n4Var2, offerTopItemContentScreen, offerContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferTopItemContentScreen.U;
                        return (r) ((o4) offerTopItemContentScreen.O.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = OfferTopItemContentScreen.U;
                        OfferTopItemContentScreen offerTopItemContentScreen2 = this.f151747b;
                        return dli.f.a(offerTopItemContentScreen2, offerTopItemContentScreen2.R2(), d0.E0(u.c(offerTopItemContentScreen2.S), ((o4) offerTopItemContentScreen2.O.getValue()).c().Q()), R$id.creditCardOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: hf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferTopItemContentScreen f151747b;

            {
                this.f151747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OfferTopItemContentScreen offerTopItemContentScreen = this.f151747b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferTopItemContentScreen.U;
                        qji.b bVarU2 = offerTopItemContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.di.OfferTopItemScreenComponentInjector");
                        n4 n4Var = (n4) bVarU2;
                        c1 c1Var = n4Var.f119339c;
                        n4 n4Var2 = n4Var.d;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerTopItemContentScreen.L;
                        offerContentScreenContract$InputData.getClass();
                        return new o4(c1Var, n4Var2, offerTopItemContentScreen, offerContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferTopItemContentScreen.U;
                        return (r) ((o4) offerTopItemContentScreen.O.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr3 = OfferTopItemContentScreen.U;
                        OfferTopItemContentScreen offerTopItemContentScreen2 = this.f151747b;
                        return dli.f.a(offerTopItemContentScreen2, offerTopItemContentScreen2.R2(), d0.E0(u.c(offerTopItemContentScreen2.S), ((o4) offerTopItemContentScreen2.O.getValue()).c().Q()), R$id.creditCardOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = new FullScreenStateDelegate();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ff4.s uiState = (ff4.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton creditCardOfferLargeActionButton = d3().f10680b;
        Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButton, "creditCardOfferLargeActionButton");
        creditCardOfferLargeActionButton.setText(uiState.i);
        f fVar = this.T;
        if (fVar == null) {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
        fVar.b(uiState.f134744j);
        k kVar = uiState.f134745l;
        k kVar2 = kVar != null ? kVar : null;
        j jVar = kVar2 != null ? kVar2.f134726a : null;
        if (jVar != null) {
            NavBarLargeCentred navBarLargeCentredF3 = f3();
            navBarLargeCentredF3.setTopLabel(jVar.f134723a);
            navBarLargeCentredF3.setTopLabelEndImage(jVar.f134724b);
            navBarLargeCentredF3.setTopLabelClickable(jVar.f134725c);
            navBarLargeCentredF3.setTitle(jVar.d);
            navBarLargeCentredF3.setSubtitleText(jVar.e);
        }
        if (((b0) R2()).L2()) {
            FrameLayout creditCardOfferLargeActionButtonContainer = d3().f10681c;
            Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButtonContainer, "creditCardOfferLargeActionButtonContainer");
            RecyclerView recyclerViewH = ((dli.c) this.R.getValue()).h();
            NavBarLargeCentred navBarLargeCentredF32 = f3();
            a2.a aVar = new a2.a(this, 13, jVar, kVar);
            this.M.getClass();
            i.b(navBarLargeCentredF32, recyclerViewH, creditCardOfferLargeActionButtonContainer, aVar);
        }
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
        return (o4) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton creditCardOfferLargeActionButton = d3().f10680b;
        Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButton, "creditCardOfferLargeActionButton");
        creditCardOfferLargeActionButton.setLoadingButtonTag("LOADING_TAG_MAIN_BUTTON");
        NavBarLargeCentred navBarLargeCentredF3 = f3();
        navBarLargeCentredF3.setTitleStyle(x1.LARGE);
        navBarLargeCentredF3.setShadowVisible(false);
        Context context = navBarLargeCentredF3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        Context context2 = navBarLargeCentredF3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        navBarLargeCentredF3.setTitleGradient(iS, kli.a.s(R$attr.uikit_colorGreyTone50, context2));
        f3().setAlpha(BitmapDescriptorFactory.HUE_RED);
        FrameLayout creditCardOfferLargeActionButtonContainer = d3().f10681c;
        Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButtonContainer, "creditCardOfferLargeActionButtonContainer");
        creditCardOfferLargeActionButtonContainer.setAlpha(BitmapDescriptorFactory.HUE_RED);
        LargeActionButton creditCardOfferLargeActionButton2 = d3().f10680b;
        Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButton2, "creditCardOfferLargeActionButton");
        this.T = creditCardOfferLargeActionButton2.A.V();
        ((dli.c) this.R.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        f3().animate().cancel();
        ((dli.c) this.R.getValue()).h().animate().cancel();
        FrameLayout creditCardOfferLargeActionButtonContainer = d3().f10681c;
        Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButtonContainer, "creditCardOfferLargeActionButtonContainer");
        creditCardOfferLargeActionButtonContainer.animate().cancel();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59292m), null, new hf4.f(this, null, 1), 3);
        LargeActionButton creditCardOfferLargeActionButton = d3().f10680b;
        Intrinsics.checkNotNullExpressionValue(creditCardOfferLargeActionButton, "creditCardOfferLargeActionButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditCardOfferLargeActionButton.o), null, new hf4.f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(new h23.b(rd0.e.b(f3().D()), 14), new a0(rd0.e.b(f3().f59295q), this, 16)), null, new hba.k(this, (Continuation) null, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new hf4.e(this, null), 3);
    }

    public final aw3.e d3() {
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.P.getValue();
    }

    public final NavBarLargeCentred f3() {
        NavBarLargeCentred creditCardOfferNavBarLargeCentred = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditCardOfferNavBarLargeCentred, "creditCardOfferNavBarLargeCentred");
        return creditCardOfferNavBarLargeCentred;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
