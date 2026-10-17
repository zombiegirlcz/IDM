package com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info;

import aii.r;
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
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info.AdditionalCardsCardholderAccountInfoScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import hp4.i;
import java.util.List;
import jm4.u;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_account_info/AdditionalCardsCardholderAccountInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Ldli/a;", "Lhp4/i;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalCardsCardholderAccountInfoScreen extends ViewController<r> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AdditionalCardsCardholderAccountInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final int R;

    public AdditionalCardsCardholderAccountInfoScreen(AdditionalCardsCardholderAccountInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = new RowDelegate(null, null, 7);
        this.M = new FullScreenStateDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderAccountInfoScreen f154443b;

            {
                this.f154443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderAccountInfoScreen.S;
                        AdditionalCardsCardholderAccountInfoScreen additionalCardsCardholderAccountInfoScreen = this.f154443b;
                        return dli.f.a(additionalCardsCardholderAccountInfoScreen, (h) additionalCardsCardholderAccountInfoScreen.Q.getValue(), v.k(additionalCardsCardholderAccountInfoScreen.M, new RowLoadingDelegate(), additionalCardsCardholderAccountInfoScreen.L), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderAccountInfoScreen.S;
                        return (h) ((u) this.f154443b.P.getValue()).d.get();
                }
            }
        });
        this.O = s.t(this, hp4.b.f);
        this.P = w.y0(new hl6.b(this, inputData, 4));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderAccountInfoScreen f154443b;

            {
                this.f154443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsCardholderAccountInfoScreen.S;
                        AdditionalCardsCardholderAccountInfoScreen additionalCardsCardholderAccountInfoScreen = this.f154443b;
                        return dli.f.a(additionalCardsCardholderAccountInfoScreen, (h) additionalCardsCardholderAccountInfoScreen.Q.getValue(), v.k(additionalCardsCardholderAccountInfoScreen.M, new RowLoadingDelegate(), additionalCardsCardholderAccountInfoScreen.L), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = AdditionalCardsCardholderAccountInfoScreen.S;
                        return (h) ((u) this.f154443b.P.getValue()).d.get();
                }
            }
        });
        this.R = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f154451a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f154451a);
        navBarWithToolbar.setDescriptionText(uiState.f154452b);
        f0.t(navBarWithToolbar, uiState.f154453c, false, 6);
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
        return (u) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (hp4.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new f(vkm.q.J(new h23.b(rd0.e.b(d3().f174539b.f59410q), 28), rd0.e.b(this.L.f53218h), rd0.e.b(this.M.f52371h.f121375b)), yx4.b.Companion, 7), new hp4.e(2, (hp4.h) this.Q.getValue(), hp4.h.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 0), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
