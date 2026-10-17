package com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.AdditionalCardsCardholderDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.AdditionalCardsCardholderDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import i5b.d;
import ip0.e70;
import ip4.i;
import ip4.j;
import ip4.k;
import java.util.List;
import jm4.a3;
import jm4.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/AdditionalCardsCardholderDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lip4/i;", "Ldli/a;", "Lip4/k;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalCardsCardholderDetailsScreen extends ViewController<i> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AdditionalCardsCardholderDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final AdditionalCardsCardholderDetailsScreenContract$InputData L;
    public final Object M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final int S;

    public AdditionalCardsCardholderDetailsScreen(AdditionalCardsCardholderDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = w.y0(new e70(26));
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ip4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderDetailsScreen f167644b;

            {
                this.f167644b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalCardsCardholderDetailsScreen additionalCardsCardholderDetailsScreen = this.f167644b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderDetailsScreen.T;
                        AdditionalCardsCardholderDetailsScreen additionalCardsCardholderDetailsScreen2 = this.f167644b;
                        return dli.f.a(additionalCardsCardholderDetailsScreen2, (j) additionalCardsCardholderDetailsScreen2.R.getValue(), v.k(new RowLoadingDelegate(), additionalCardsCardholderDetailsScreen2.N, (RowDelegate) additionalCardsCardholderDetailsScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderDetailsScreen.T;
                        qji.b bVarU2 = additionalCardsCardholderDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.di.AdditionalCardsCardholderDetailsScreenInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsCardholderDetailsScreenContract$InputData additionalCardsCardholderDetailsScreenContract$InputData = additionalCardsCardholderDetailsScreen.L;
                        additionalCardsCardholderDetailsScreenContract$InputData.getClass();
                        return new x(a3Var, wVar2, additionalCardsCardholderDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsCardholderDetailsScreen.T;
                        return (j) ((x) additionalCardsCardholderDetailsScreen.Q.getValue()).f176428c.get();
                }
            }
        });
        this.P = s.t(this, ip4.b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ip4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderDetailsScreen f167644b;

            {
                this.f167644b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalCardsCardholderDetailsScreen additionalCardsCardholderDetailsScreen = this.f167644b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderDetailsScreen.T;
                        AdditionalCardsCardholderDetailsScreen additionalCardsCardholderDetailsScreen2 = this.f167644b;
                        return dli.f.a(additionalCardsCardholderDetailsScreen2, (j) additionalCardsCardholderDetailsScreen2.R.getValue(), v.k(new RowLoadingDelegate(), additionalCardsCardholderDetailsScreen2.N, (RowDelegate) additionalCardsCardholderDetailsScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderDetailsScreen.T;
                        qji.b bVarU2 = additionalCardsCardholderDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.di.AdditionalCardsCardholderDetailsScreenInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsCardholderDetailsScreenContract$InputData additionalCardsCardholderDetailsScreenContract$InputData = additionalCardsCardholderDetailsScreen.L;
                        additionalCardsCardholderDetailsScreenContract$InputData.getClass();
                        return new x(a3Var, wVar2, additionalCardsCardholderDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsCardholderDetailsScreen.T;
                        return (j) ((x) additionalCardsCardholderDetailsScreen.Q.getValue()).f176428c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ip4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderDetailsScreen f167644b;

            {
                this.f167644b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdditionalCardsCardholderDetailsScreen additionalCardsCardholderDetailsScreen = this.f167644b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderDetailsScreen.T;
                        AdditionalCardsCardholderDetailsScreen additionalCardsCardholderDetailsScreen2 = this.f167644b;
                        return dli.f.a(additionalCardsCardholderDetailsScreen2, (j) additionalCardsCardholderDetailsScreen2.R.getValue(), v.k(new RowLoadingDelegate(), additionalCardsCardholderDetailsScreen2.N, (RowDelegate) additionalCardsCardholderDetailsScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderDetailsScreen.T;
                        qji.b bVarU2 = additionalCardsCardholderDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.di.AdditionalCardsCardholderDetailsScreenInjector");
                        jm4.w wVar = (jm4.w) bVarU2;
                        a3 a3Var = wVar.f176410b;
                        jm4.w wVar2 = wVar.f176411c;
                        AdditionalCardsCardholderDetailsScreenContract$InputData additionalCardsCardholderDetailsScreenContract$InputData = additionalCardsCardholderDetailsScreen.L;
                        additionalCardsCardholderDetailsScreenContract$InputData.getClass();
                        return new x(a3Var, wVar2, additionalCardsCardholderDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsCardholderDetailsScreen.T;
                        return (j) ((x) additionalCardsCardholderDetailsScreen.Q.getValue()).f176428c.get();
                }
            }
        });
        this.S = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f167657a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f167657a);
        navBarWithToolbar.setDescriptionText(uiState.f167658b);
        f0.t(navBarWithToolbar, uiState.f167659c, false, 6);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = new d(rd0.e.b(d3().f174539b.f59410q), 29);
        ?? r132 = this.M;
        ViewController.P2(this, new f(vkm.q.J(dVar, rd0.e.b(((RowDelegate) r132.getValue()).f53218h), rd0.e.b(((RowDelegate) r132.getValue()).f53225r), rd0.e.b(this.N.f52371h.f121375b)), yx4.b.Companion, 9), new hp4.e(2, (j) this.R.getValue(), j.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 18), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
