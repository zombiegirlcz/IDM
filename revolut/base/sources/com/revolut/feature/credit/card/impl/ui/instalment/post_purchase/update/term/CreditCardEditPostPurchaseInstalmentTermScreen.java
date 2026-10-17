package com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import java.util.List;
import jm4.y0;
import jp9.l;
import js4.c;
import js4.f;
import js4.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/post_purchase/update/term/CreditCardEditPostPurchaseInstalmentTermScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Ljs4/h;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardEditPostPurchaseInstalmentTermScreen extends ViewController<Object> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardEditPostPurchaseInstalmentTermScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CreditCardEditPostPurchaseInstalmentTermScreen(CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, js4.b.f);
        this.N = w.y0(new jnf.a(this, inputData, 3));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: js4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardEditPostPurchaseInstalmentTermScreen f178120b;

            {
                this.f178120b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                        return (f) ((y0) this.f178120b.N.getValue()).f176444b.get();
                    default:
                        KProperty[] kPropertyArr2 = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                        CreditCardEditPostPurchaseInstalmentTermScreen creditCardEditPostPurchaseInstalmentTermScreen = this.f178120b;
                        return dli.f.a(creditCardEditPostPurchaseInstalmentTermScreen, (f) creditCardEditPostPurchaseInstalmentTermScreen.O.getValue(), v.k((CellDetailsDelegate) creditCardEditPostPurchaseInstalmentTermScreen.P.getValue(), (FullScreenStateDelegate) creditCardEditPostPurchaseInstalmentTermScreen.Q.getValue(), (SuggestionsBarDelegate) creditCardEditPostPurchaseInstalmentTermScreen.R.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new l(21));
        this.Q = w.y0(new l(22));
        this.R = w.y0(new l(23));
        this.S = w.y0(new l(24));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: js4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardEditPostPurchaseInstalmentTermScreen f178120b;

            {
                this.f178120b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                        return (f) ((y0) this.f178120b.N.getValue()).f176444b.get();
                    default:
                        KProperty[] kPropertyArr2 = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                        CreditCardEditPostPurchaseInstalmentTermScreen creditCardEditPostPurchaseInstalmentTermScreen = this.f178120b;
                        return dli.f.a(creditCardEditPostPurchaseInstalmentTermScreen, (f) creditCardEditPostPurchaseInstalmentTermScreen.O.getValue(), v.k((CellDetailsDelegate) creditCardEditPostPurchaseInstalmentTermScreen.P.getValue(), (FullScreenStateDelegate) creditCardEditPostPurchaseInstalmentTermScreen.Q.getValue(), (SuggestionsBarDelegate) creditCardEditPostPurchaseInstalmentTermScreen.R.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        js4.h uiState = (js4.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        g gVar = uiState.f178129b;
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(gVar.f178125a);
        largeActionButton.setVisibility(gVar.f178127c ? 0 : 8);
        largeActionButton.setEnabled(gVar.f178126b);
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
        return (y0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174557b.setLoadingButtonTag("CONFIRM_BUTTON_TAG");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_edit_quote_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), rd0.e.b(((CellDetailsDelegate) this.P.getValue()).e), rd0.e.b(((SuggestionsBarDelegate) this.R.getValue()).p().d)), null, new jij.h(this, (Continuation) null, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
