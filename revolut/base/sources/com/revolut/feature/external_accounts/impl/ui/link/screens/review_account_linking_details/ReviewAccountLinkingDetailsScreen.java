package com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import te0.w;
import vc.s;
import xf6.b1;
import xf6.c1;
import xki.e;
import z75.f;
import zhm.u;
import zhm.v;
import zn6.d;
import zn6.k;
import zn6.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/screens/review_account_linking_details/ReviewAccountLinkingDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/link/screens/review_account_linking_details/a;", "Ltki/c;", "Lzn6/l;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewAccountLinkingDetailsScreen extends ViewController<a> implements tki.c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ReviewAccountLinkingDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final ReviewAccountLinkingDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputChecklistDelegate N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ReviewAccountLinkingDetailsScreen(ReviewAccountLinkingDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, zn6.b.f);
        this.N = new InputChecklistDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new RowDelegate(null, null, 7);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: zn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewAccountLinkingDetailsScreen f323671b;

            {
                this.f323671b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen = this.f323671b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewAccountLinkingDetailsScreen.T;
                        qji.b bVarU2 = reviewAccountLinkingDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.di.ReviewAccountLinkingDetailsScreenInjector");
                        b1 b1Var = (b1) ((ao6.a) bVarU2).q().mo3808a(reviewAccountLinkingDetailsScreen);
                        ReviewAccountLinkingDetailsScreenContract$InputData reviewAccountLinkingDetailsScreenContract$InputData = reviewAccountLinkingDetailsScreen.K;
                        switch (b1Var.f304795a) {
                            case 0:
                                reviewAccountLinkingDetailsScreenContract$InputData.getClass();
                                b1Var.d = reviewAccountLinkingDetailsScreenContract$InputData;
                                break;
                            default:
                                reviewAccountLinkingDetailsScreenContract$InputData.getClass();
                                b1Var.d = reviewAccountLinkingDetailsScreenContract$InputData;
                                break;
                        }
                        return (c1) b1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewAccountLinkingDetailsScreen.T;
                        c1 c1Var = (c1) reviewAccountLinkingDetailsScreen.Q.getValue();
                        switch (c1Var.f304807a) {
                            case 0:
                                return (k) c1Var.d.get();
                            default:
                                return (k) c1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = ReviewAccountLinkingDetailsScreen.T;
                        ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen2 = this.f323671b;
                        return tki.g.a(reviewAccountLinkingDetailsScreen2, reviewAccountLinkingDetailsScreen2.R2(), v.k(reviewAccountLinkingDetailsScreen2.O, reviewAccountLinkingDetailsScreen2.N, new ListCellDelegate(), new ListSubheaderDelegate(), reviewAccountLinkingDetailsScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: zn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewAccountLinkingDetailsScreen f323671b;

            {
                this.f323671b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen = this.f323671b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewAccountLinkingDetailsScreen.T;
                        qji.b bVarU2 = reviewAccountLinkingDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.di.ReviewAccountLinkingDetailsScreenInjector");
                        b1 b1Var = (b1) ((ao6.a) bVarU2).q().mo3808a(reviewAccountLinkingDetailsScreen);
                        ReviewAccountLinkingDetailsScreenContract$InputData reviewAccountLinkingDetailsScreenContract$InputData = reviewAccountLinkingDetailsScreen.K;
                        switch (b1Var.f304795a) {
                            case 0:
                                reviewAccountLinkingDetailsScreenContract$InputData.getClass();
                                b1Var.d = reviewAccountLinkingDetailsScreenContract$InputData;
                                break;
                            default:
                                reviewAccountLinkingDetailsScreenContract$InputData.getClass();
                                b1Var.d = reviewAccountLinkingDetailsScreenContract$InputData;
                                break;
                        }
                        return (c1) b1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewAccountLinkingDetailsScreen.T;
                        c1 c1Var = (c1) reviewAccountLinkingDetailsScreen.Q.getValue();
                        switch (c1Var.f304807a) {
                            case 0:
                                return (k) c1Var.d.get();
                            default:
                                return (k) c1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = ReviewAccountLinkingDetailsScreen.T;
                        ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen2 = this.f323671b;
                        return tki.g.a(reviewAccountLinkingDetailsScreen2, reviewAccountLinkingDetailsScreen2.R2(), v.k(reviewAccountLinkingDetailsScreen2.O, reviewAccountLinkingDetailsScreen2.N, new ListCellDelegate(), new ListSubheaderDelegate(), reviewAccountLinkingDetailsScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewAccountLinkingDetailsScreen f323671b;

            {
                this.f323671b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen = this.f323671b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewAccountLinkingDetailsScreen.T;
                        qji.b bVarU2 = reviewAccountLinkingDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.di.ReviewAccountLinkingDetailsScreenInjector");
                        b1 b1Var = (b1) ((ao6.a) bVarU2).q().mo3808a(reviewAccountLinkingDetailsScreen);
                        ReviewAccountLinkingDetailsScreenContract$InputData reviewAccountLinkingDetailsScreenContract$InputData = reviewAccountLinkingDetailsScreen.K;
                        switch (b1Var.f304795a) {
                            case 0:
                                reviewAccountLinkingDetailsScreenContract$InputData.getClass();
                                b1Var.d = reviewAccountLinkingDetailsScreenContract$InputData;
                                break;
                            default:
                                reviewAccountLinkingDetailsScreenContract$InputData.getClass();
                                b1Var.d = reviewAccountLinkingDetailsScreenContract$InputData;
                                break;
                        }
                        return (c1) b1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ReviewAccountLinkingDetailsScreen.T;
                        c1 c1Var = (c1) reviewAccountLinkingDetailsScreen.Q.getValue();
                        switch (c1Var.f304807a) {
                            case 0:
                                return (k) c1Var.d.get();
                            default:
                                return (k) c1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = ReviewAccountLinkingDetailsScreen.T;
                        ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen2 = this.f323671b;
                        return tki.g.a(reviewAccountLinkingDetailsScreen2, reviewAccountLinkingDetailsScreen2.R2(), v.k(reviewAccountLinkingDetailsScreen2.O, reviewAccountLinkingDetailsScreen2.N, new ListCellDelegate(), new ListSubheaderDelegate(), reviewAccountLinkingDetailsScreen2.P), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        jii.s sVarD3 = d3();
        sVarD3.e.setDescriptionText(uiState.f323680c);
        sVarD3.f174557b.setEnabled(uiState.f323679b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c1) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jii.s sVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = sVarD3.e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.external_institutions_account_linking_review_authorisation_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.external_institutions_account_linking_review_authorisation_title, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        sVarD3.f174558c.setContent(new c7(new HtmlLocalisedClause(R$string.external_institutions_account_linking_review_authorisation_footer_information_with_link, u.c("https://www.revolut.com/legal/terms/"), (Integer) null, (Object) null, 28), false, null, 6));
        LargeActionButton largeActionButton = sVarD3.f174557b;
        largeActionButton.setText(new TextLocalisedClause(R$string.external_institutions_account_linking_review_authorisation_continue_with, u.c(this.K.f73054b), null, 12));
        largeActionButton.setLoadingButtonTag("CONTINUE_BUTTON_TAG");
        largeActionButton.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jii.s sVarD3 = d3();
        ViewController.P2(this, rd0.e.b(sVarD3.e.f59410q), new zn6.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(sVarD3.f174557b.o), new zn6.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52518c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new zn6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(sVarD3.f174558c.f58608l), new zfd.s(this, (Continuation) null, 16), 3);
        ViewController.P2(this, new f(rd0.e.b(this.P.f53218h), 13), new zn6.f(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
