package com.revolut.feature.pay_bills_taxes.impl.ui_payment.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.R$id;
import com.revolut.feature.pay_bills_taxes.impl.R$layout;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.r;
import pki.b;
import te0.w;
import th9.c;
import th9.g;
import th9.k;
import th9.m;
import th9.n;
import th9.v;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/review/PaymentReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lth9/g;", "Ldli/a;", "Lth9/h;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentReviewScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PaymentReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/pay_bills_taxes/impl/databinding/ScreenApmBillsTransferReviewBinding;", 0))};
    public final PaymentReviewContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PaymentReviewScreen(PaymentReviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_apm_bills_transfer_review;
        this.M = true;
        this.N = s.t(this, m.f);
        final int i = 0;
        this.O = w.y0(new k(0));
        this.P = w.y0(new Function0(this) { // from class: th9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentReviewScreen f271343b;

            {
                this.f271343b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentReviewScreen paymentReviewScreen = this.f271343b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentReviewScreen.S;
                        PaymentReviewScreen paymentReviewScreen2 = this.f271343b;
                        return dli.f.a(paymentReviewScreen2, (v) paymentReviewScreen2.R.getValue(), zhm.v.k((CellDetailsActionDelegate) paymentReviewScreen2.O.getValue(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsSwitcherDelegate(), new CounterTextDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentReviewScreen.S;
                        qji.b bVarU2 = paymentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.di.PaymentReviewScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentReviewContract$InputData paymentReviewContract$InputData = paymentReviewScreen.K;
                        paymentReviewContract$InputData.getClass();
                        return new lf9.r(mVar, qVar2, paymentReviewScreen, paymentReviewContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentReviewScreen.S;
                        return (v) ((lf9.r) paymentReviewScreen.Q.getValue()).f194794l.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: th9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentReviewScreen f271343b;

            {
                this.f271343b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentReviewScreen paymentReviewScreen = this.f271343b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentReviewScreen.S;
                        PaymentReviewScreen paymentReviewScreen2 = this.f271343b;
                        return dli.f.a(paymentReviewScreen2, (v) paymentReviewScreen2.R.getValue(), zhm.v.k((CellDetailsActionDelegate) paymentReviewScreen2.O.getValue(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsSwitcherDelegate(), new CounterTextDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentReviewScreen.S;
                        qji.b bVarU2 = paymentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.di.PaymentReviewScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentReviewContract$InputData paymentReviewContract$InputData = paymentReviewScreen.K;
                        paymentReviewContract$InputData.getClass();
                        return new lf9.r(mVar, qVar2, paymentReviewScreen, paymentReviewContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentReviewScreen.S;
                        return (v) ((lf9.r) paymentReviewScreen.Q.getValue()).f194794l.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: th9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentReviewScreen f271343b;

            {
                this.f271343b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentReviewScreen paymentReviewScreen = this.f271343b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentReviewScreen.S;
                        PaymentReviewScreen paymentReviewScreen2 = this.f271343b;
                        return dli.f.a(paymentReviewScreen2, (v) paymentReviewScreen2.R.getValue(), zhm.v.k((CellDetailsActionDelegate) paymentReviewScreen2.O.getValue(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsSwitcherDelegate(), new CounterTextDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextWarningDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentReviewScreen.S;
                        qji.b bVarU2 = paymentReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.di.PaymentReviewScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentReviewContract$InputData paymentReviewContract$InputData = paymentReviewScreen.K;
                        paymentReviewContract$InputData.getClass();
                        return new lf9.r(mVar, qVar2, paymentReviewScreen, paymentReviewContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentReviewScreen.S;
                        return (v) ((lf9.r) paymentReviewScreen.Q.getValue()).f194794l.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((th9.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        v vVar = (v) this.R.getValue();
        vVar.C2(new c(vVar.o.f78797b));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (v) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r06 = this.Q;
        ((r) r06.getValue()).getClass();
        pd.b.p(view, this.K.d);
        ((j60.a) ((r) r06.getValue()).e.get()).d(u.c(new TextDelegate()));
        NavBarWithToolbar navBarWithToolbar = d3().f160970b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pay_bills_taxes_payment_review_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pay_bills_taxes_payment_review_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
        LargeActionButton largeActionButton = d3().f160971c;
        largeActionButton.setEnabled(true);
        largeActionButton.setText(new TextLocalisedClause(R$string.pay_bills_taxes_payment_review_cta, null, null, 14));
        largeActionButton.setLoadingButtonTag("APM_TRANSFER_REVIEW_CTA_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160970b.f59410q), null, new n(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160970b.f59409p.f57336l), null, new n(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160971c.o), null, new n(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.O.getValue()).d), null, new th9.o(this, null), 3);
    }

    public final if9.b d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (if9.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
