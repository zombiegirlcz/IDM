package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.q;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreen;
import cv3.p;
import cv3.x;
import dli.a;
import dw3.c9;
import dw3.d9;
import hli.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pf4.n;
import pf4.o;
import pf4.r;
import pf4.t;
import rr0.f;
import te0.w;
import tx0.t1;
import tx0.x1;
import tzh.g;
import uf4.b;
import vc.s;
import vkm.j2;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/content/top_item/TopItemOfferContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lpf4/n;", "Ldli/a;", "Lpf4/u;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopItemOfferContentScreen extends PluginScreenController<n> implements a, c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TopItemOfferContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenTopItemOfferBinding;", 0))};
    public final OfferContentScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public f S;

    public TopItemOfferContentScreen(OfferContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_top_item_offer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: uf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopItemOfferContentScreen f279537b;

            {
                this.f279537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TopItemOfferContentScreen topItemOfferContentScreen = this.f279537b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TopItemOfferContentScreen.T;
                        qji.b bVarU2 = topItemOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.di.TopItemOfferContentScreenInjector");
                        c9 c9Var = (c9) ((vf4.a) bVarU2).D().mo3808a(topItemOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = topItemOfferContentScreen.L;
                        switch (c9Var.f118525a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            case 1:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            case 2:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (d9) c9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TopItemOfferContentScreen.T;
                        d9 d9Var = (d9) topItemOfferContentScreen.N.getValue();
                        switch (d9Var.f118597a) {
                            case 0:
                                return (o) d9Var.k.get();
                            case 1:
                                return (o) d9Var.k.get();
                            case 2:
                                return (o) d9Var.k.get();
                            default:
                                return (o) d9Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TopItemOfferContentScreen.T;
                        TopItemOfferContentScreen topItemOfferContentScreen2 = this.f279537b;
                        return dli.f.a(topItemOfferContentScreen2, topItemOfferContentScreen2.d(), d0.E0(u.c(topItemOfferContentScreen2.R), ((d9) topItemOfferContentScreen2.N.getValue()).c().Q()), R$id.topItemOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: uf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopItemOfferContentScreen f279537b;

            {
                this.f279537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TopItemOfferContentScreen topItemOfferContentScreen = this.f279537b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopItemOfferContentScreen.T;
                        qji.b bVarU2 = topItemOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.di.TopItemOfferContentScreenInjector");
                        c9 c9Var = (c9) ((vf4.a) bVarU2).D().mo3808a(topItemOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = topItemOfferContentScreen.L;
                        switch (c9Var.f118525a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            case 1:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            case 2:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (d9) c9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TopItemOfferContentScreen.T;
                        d9 d9Var = (d9) topItemOfferContentScreen.N.getValue();
                        switch (d9Var.f118597a) {
                            case 0:
                                return (o) d9Var.k.get();
                            case 1:
                                return (o) d9Var.k.get();
                            case 2:
                                return (o) d9Var.k.get();
                            default:
                                return (o) d9Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TopItemOfferContentScreen.T;
                        TopItemOfferContentScreen topItemOfferContentScreen2 = this.f279537b;
                        return dli.f.a(topItemOfferContentScreen2, topItemOfferContentScreen2.d(), d0.E0(u.c(topItemOfferContentScreen2.R), ((d9) topItemOfferContentScreen2.N.getValue()).c().Q()), R$id.topItemOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, uf4.c.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopItemOfferContentScreen f279537b;

            {
                this.f279537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TopItemOfferContentScreen topItemOfferContentScreen = this.f279537b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopItemOfferContentScreen.T;
                        qji.b bVarU2 = topItemOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.di.TopItemOfferContentScreenInjector");
                        c9 c9Var = (c9) ((vf4.a) bVarU2).D().mo3808a(topItemOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = topItemOfferContentScreen.L;
                        switch (c9Var.f118525a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            case 1:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            case 2:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                c9Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (d9) c9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TopItemOfferContentScreen.T;
                        d9 d9Var = (d9) topItemOfferContentScreen.N.getValue();
                        switch (d9Var.f118597a) {
                            case 0:
                                return (o) d9Var.k.get();
                            case 1:
                                return (o) d9Var.k.get();
                            case 2:
                                return (o) d9Var.k.get();
                            default:
                                return (o) d9Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TopItemOfferContentScreen.T;
                        TopItemOfferContentScreen topItemOfferContentScreen2 = this.f279537b;
                        return dli.f.a(topItemOfferContentScreen2, topItemOfferContentScreen2.d(), d0.E0(u.c(topItemOfferContentScreen2.R), ((d9) topItemOfferContentScreen2.N.getValue()).c().Q()), R$id.topItemOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new FullScreenStateDelegate();
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        pf4.u uiState = (pf4.u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        t tVar = uiState.f235463b;
        boolean z = tVar instanceof r;
        r rVar = z ? (r) tVar : null;
        if ((rVar != null ? rVar.f235458a : null) == null) {
            NavBarLargeCentred navBarLargeCentredG3 = g3();
            navBarLargeCentredG3.getClass();
            navBarLargeCentredG3.heightMode = t1.DEFAULT;
            if (navBarLargeCentredG3.getLayoutParams().height != -2) {
                ViewGroup.LayoutParams layoutParams = navBarLargeCentredG3.getLayoutParams();
                layoutParams.height = -2;
                navBarLargeCentredG3.setLayoutParams(layoutParams);
            }
        }
        TwinVerticalButton topItemOfferTwinVerticalButton = e3().d;
        Intrinsics.checkNotNullExpressionValue(topItemOfferTwinVerticalButton, "topItemOfferTwinVerticalButton");
        boolean z3 = uiState.f;
        boolean z4 = uiState.f235464c;
        topItemOfferTwinVerticalButton.setMainButtonVisible(z3);
        topItemOfferTwinVerticalButton.setMainButtonText(uiState.d);
        Clause clause = uiState.e;
        topItemOfferTwinVerticalButton.setSecondaryButtonVisible(clause != null);
        topItemOfferTwinVerticalButton.setSecondaryButtonText(clause);
        topItemOfferTwinVerticalButton.setFabEnabled(false);
        int i = b.f279538a[this.L.f.ordinal()];
        if (i == 1) {
            f fVar = this.S;
            if (fVar == null) {
                Intrinsics.r("mainButtonLoadingController");
                throw null;
            }
            fVar.b(z4);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar2 = this.S;
            if (fVar2 == null) {
                Intrinsics.r("mainButtonLoadingController");
                throw null;
            }
            fVar2.c(z4);
        }
        r rVar2 = z ? (r) tVar : null;
        pf4.q qVar2 = rVar2 != null ? rVar2.f235458a : null;
        if (qVar2 != null) {
            NavBarLargeCentred navBarLargeCentredG32 = g3();
            navBarLargeCentredG32.setTopLabel(qVar2.f235455b);
            navBarLargeCentredG32.setTopLabelEndImage(qVar2.f235456c);
            navBarLargeCentredG32.setTopLabelClickable(qVar2.d);
            navBarLargeCentredG32.setTitle(qVar2.e);
            navBarLargeCentredG32.setSubtitleText(qVar2.f);
            navBarLargeCentredG32.setNavigationButtonImage(qVar2.f235454a);
            if (uiState.f235465g) {
                g3().setMenuItems(qVar2.f235457g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F2() {
        /*
            r7 = this;
            pf4.o r0 = r7.d()
            cv3.x r1 = r7.d3()
            if (r1 == 0) goto L43
            boolean r2 = r1.f109280j
            if (r2 != 0) goto L11
            cv3.n r1 = cv3.n.DEFAULT
            goto L41
        L11:
            kotlin.enums.EnumEntries r2 = cv3.n.b()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            r5 = r3
            cv3.n r5 = (cv3.n) r5
            java.lang.String r5 = r5.a()
            cv3.w r6 = r1.i
            if (r6 == 0) goto L33
            dx4.a r4 = r6.f109274b
            java.lang.String r4 = r4.f120542a
        L33:
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r5, r4)
            if (r4 == 0) goto L19
            r4 = r3
        L3a:
            r1 = r4
            cv3.n r1 = (cv3.n) r1
            if (r1 != 0) goto L41
            cv3.n r1 = cv3.n.DEFAULT
        L41:
            if (r1 != 0) goto L45
        L43:
            cv3.n r1 = cv3.n.DEFAULT
        L45:
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b r0 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) r0
            r0.getClass()
            java.lang.String r2 = "handleBackIntent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            pf4.g r2 = new pf4.g
            r2.<init>(r1)
            r0.C2(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreen.F2():boolean");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void J0(boolean z) {
        super.J0(z);
        ViewParent parent = D2().getParent();
        e eVar = parent instanceof e ? (e) parent : null;
        boolean z3 = eVar == null || !eVar.getControllersTransitionActive();
        if (z && z3) {
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) d();
            bVar.H2(bVar.f68143s, new pd4.u(20));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d9) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        AnimatedBackgroundType animatedBackgroundType;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Parcelable parcelable = this.L.d;
        TopItemOfferContentScreenContract$OfferContentPayload topItemOfferContentScreenContract$OfferContentPayload = parcelable instanceof TopItemOfferContentScreenContract$OfferContentPayload ? (TopItemOfferContentScreenContract$OfferContentPayload) parcelable : null;
        if (topItemOfferContentScreenContract$OfferContentPayload == null || (animatedBackgroundType = topItemOfferContentScreenContract$OfferContentPayload.f68145a) == null) {
            AnimatedBackgroundView topItemOfferBackground = e3().f10725b;
            Intrinsics.checkNotNullExpressionValue(topItemOfferBackground, "topItemOfferBackground");
            topItemOfferBackground.setVisibility(8);
        } else {
            e3().f10725b.setBackgroundType(animatedBackgroundType);
        }
        NavBarLargeCentred navBarLargeCentredG3 = g3();
        navBarLargeCentredG3.setHeightMode(t1.FILL_AVAILABLE_SPACE);
        navBarLargeCentredG3.setTitleStyle(x1.LARGE);
        navBarLargeCentredG3.setShadowVisible(false);
        Context context = navBarLargeCentredG3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        Context context2 = navBarLargeCentredG3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        navBarLargeCentredG3.setTitleGradient(iS, kli.a.s(R$attr.uikit_colorGreyTone50, context2));
        TwinVerticalButton topItemOfferTwinVerticalButton = e3().d;
        Intrinsics.checkNotNullExpressionValue(topItemOfferTwinVerticalButton, "topItemOfferTwinVerticalButton");
        this.S = topItemOfferTwinVerticalButton.l0();
        ((dli.c) this.Q.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f59292m), null, new uf4.h(this, continuation, 2), 3);
        TwinVerticalButton topItemOfferTwinVerticalButton = e3().d;
        Intrinsics.checkNotNullExpressionValue(topItemOfferTwinVerticalButton, "topItemOfferTwinVerticalButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(topItemOfferTwinVerticalButton.o0()), null, new uf4.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(topItemOfferTwinVerticalButton.p0()), null, new uf4.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(g3().D()), 11), null, new uf4.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new tse.c(rd0.e.b(g3().f59295q), this, 14), null, new uf4.f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f59291l.f57403b), null, new uf4.f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new uf4.g(this, null), 3);
    }

    public final x d3() {
        cv3.s sVar = (cv3.s) ((pf4.e) ((j2) ((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) d()).f68143s.f22677a).getValue()).f235436b.getContent();
        if (sVar != null) {
            cv3.r rVar = sVar.f109267a;
            p pVar = rVar instanceof p ? (p) rVar : null;
            if (pVar != null) {
                return pVar.f109263a;
            }
        }
        return null;
    }

    public final aw3.t e3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.t) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final o d() {
        return (o) this.O.getValue();
    }

    public final NavBarLargeCentred g3() {
        NavBarLargeCentred topItemOfferNavBarLargeCentred = e3().f10726c;
        Intrinsics.checkNotNullExpressionValue(topItemOfferNavBarLargeCentred, "topItemOfferNavBarLargeCentred");
        return topItemOfferNavBarLargeCentred;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
