package com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.m6;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreen;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import java.util.List;
import jii.i;
import jm4.a3;
import jm4.c2;
import jm4.e2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import su4.d;
import su4.f;
import su4.g;
import su4.j;
import su4.k;
import su4.l;
import te0.w;
import tki.c;
import vc.s;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsu4/j;", "Ltki/c;", "Lsu4/l;", "Lbx4/c;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRepayPaymentReviewScreen extends ViewController<j> implements c, bx4.c, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardRepayPaymentReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardRepayPaymentReviewScreenContract$InputData L;
    public final FullScreenStateDelegate M;
    public final AttributeSelectorSmallDelegate N;
    public final ScrollerDelegate O;
    public final int P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public CreditCardRepayPaymentReviewScreen(CreditCardRepayPaymentReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = new FullScreenStateDelegate();
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.N = attributeSelectorSmallDelegate;
        this.O = new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false);
        this.P = R$layout.screen_recycler_basic_navbar_action_footer;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: su4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentReviewScreen f265640b;

            {
                this.f265640b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen = this.f265640b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentReviewScreen.U;
                        CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen2 = this.f265640b;
                        return tki.g.a(creditCardRepayPaymentReviewScreen2, creditCardRepayPaymentReviewScreen2.R2(), d0.F0(creditCardRepayPaymentReviewScreen2.O, d0.F0(new CenteredAmountDelegate(null), d0.F0(creditCardRepayPaymentReviewScreen2.M, ((c2) creditCardRepayPaymentReviewScreen2.S.getValue()).c().Q()))), creditCardRepayPaymentReviewScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentReviewScreen.U;
                        qji.b bVarU2 = creditCardRepayPaymentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.di.CreditCardRepayPaymentReviewScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentReviewScreenContract$InputData creditCardRepayPaymentReviewScreenContract$InputData = creditCardRepayPaymentReviewScreen.L;
                        creditCardRepayPaymentReviewScreenContract$InputData.getClass();
                        return new c2(a3Var, e2Var2, creditCardRepayPaymentReviewScreen, creditCardRepayPaymentReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentReviewScreen.U;
                        return (k) ((c2) creditCardRepayPaymentReviewScreen.S.getValue()).f176023h.get();
                }
            }
        });
        this.R = s.t(this, d.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: su4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentReviewScreen f265640b;

            {
                this.f265640b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen = this.f265640b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentReviewScreen.U;
                        CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen2 = this.f265640b;
                        return tki.g.a(creditCardRepayPaymentReviewScreen2, creditCardRepayPaymentReviewScreen2.R2(), d0.F0(creditCardRepayPaymentReviewScreen2.O, d0.F0(new CenteredAmountDelegate(null), d0.F0(creditCardRepayPaymentReviewScreen2.M, ((c2) creditCardRepayPaymentReviewScreen2.S.getValue()).c().Q()))), creditCardRepayPaymentReviewScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentReviewScreen.U;
                        qji.b bVarU2 = creditCardRepayPaymentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.di.CreditCardRepayPaymentReviewScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentReviewScreenContract$InputData creditCardRepayPaymentReviewScreenContract$InputData = creditCardRepayPaymentReviewScreen.L;
                        creditCardRepayPaymentReviewScreenContract$InputData.getClass();
                        return new c2(a3Var, e2Var2, creditCardRepayPaymentReviewScreen, creditCardRepayPaymentReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentReviewScreen.U;
                        return (k) ((c2) creditCardRepayPaymentReviewScreen.S.getValue()).f176023h.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: su4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentReviewScreen f265640b;

            {
                this.f265640b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen = this.f265640b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentReviewScreen.U;
                        CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen2 = this.f265640b;
                        return tki.g.a(creditCardRepayPaymentReviewScreen2, creditCardRepayPaymentReviewScreen2.R2(), d0.F0(creditCardRepayPaymentReviewScreen2.O, d0.F0(new CenteredAmountDelegate(null), d0.F0(creditCardRepayPaymentReviewScreen2.M, ((c2) creditCardRepayPaymentReviewScreen2.S.getValue()).c().Q()))), creditCardRepayPaymentReviewScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentReviewScreen.U;
                        qji.b bVarU2 = creditCardRepayPaymentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.di.CreditCardRepayPaymentReviewScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentReviewScreenContract$InputData creditCardRepayPaymentReviewScreenContract$InputData = creditCardRepayPaymentReviewScreen.L;
                        creditCardRepayPaymentReviewScreenContract$InputData.getClass();
                        return new c2(a3Var, e2Var2, creditCardRepayPaymentReviewScreen, creditCardRepayPaymentReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentReviewScreen.U;
                        return (k) ((c2) creditCardRepayPaymentReviewScreen.S.getValue()).f176023h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174528c.setMenuItems(v.l(uiState.f265653c));
        ActionFooterView actionFooterView = d3().f174527b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerBasicNavba…ionFooterActionFooterView");
        Clause clause = uiState.f265652b;
        actionFooterView.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            d3().f174527b.setModel(new e(false, null, null, m6.c(n6.Companion, clause, LargeActionButton.ButtonStyle.f58725a, null, "credit_card_repay_loading_tag", uiState.d, null, null, null, 972), null, null, 55));
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c2) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.credit_card_repay_payment_review_header_title, null, null, 14));
        basicNavBar.setTitleCentered(true);
        basicNavBar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59211b), new su4.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59210a.f57403b), new su4.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.f), new su4.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.p()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new g(this, null), 3);
    }

    public final i d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
