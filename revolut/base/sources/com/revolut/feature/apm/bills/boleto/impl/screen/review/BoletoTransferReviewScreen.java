package com.revolut.feature.apm.bills.boleto.impl.screen.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.boleto.impl.R$id;
import com.revolut.feature.apm.bills.boleto.impl.R$layout;
import com.revolut.feature.apm.bills.boleto.impl.screen.review.BoletoTransferReviewScreen;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mn1.b;
import mn1.b0;
import mn1.c;
import mn1.d;
import mn1.f;
import mn1.g;
import mn1.i;
import mn1.o;
import mn1.p;
import no.d1;
import sm1.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/screen/review/BoletoTransferReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmn1/o;", "Ldli/a;", "Lmn1/p;", "Lno/d1;", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BoletoTransferReviewScreen extends ViewController<o> implements a, d1 {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(BoletoTransferReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bills/boleto/impl/databinding/ScreenBoletoReviewBinding;", 0))};
    public final i K;
    public final boolean L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public BoletoTransferReviewScreen(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_boleto_review;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mn1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoTransferReviewScreen f207326b;

            {
                this.f207326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BoletoTransferReviewScreen boletoTransferReviewScreen = this.f207326b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoTransferReviewScreen.Z;
                        return (b0) ((sm1.j) boletoTransferReviewScreen.Y.getValue()).f264336h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoTransferReviewScreen.Z;
                        qji.b bVarU2 = boletoTransferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.review.di.BoletoTransferReviewScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        i iVar3 = boletoTransferReviewScreen.K;
                        iVar3.getClass();
                        return new sm1.j(dVar, iVar2, boletoTransferReviewScreen, iVar3);
                    default:
                        KProperty[] kPropertyArr3 = BoletoTransferReviewScreen.Z;
                        BoletoTransferReviewScreen boletoTransferReviewScreen2 = this.f207326b;
                        return dli.f.a(boletoTransferReviewScreen2, boletoTransferReviewScreen2.R2(), zhm.v.k((CellDetailsActionDelegate) boletoTransferReviewScreen2.S.getValue(), (CellDetailsDelegate) boletoTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) boletoTransferReviewScreen2.R.getValue(), (CounterTextDelegate) boletoTransferReviewScreen2.T.getValue(), (ListSubheaderDelegate) boletoTransferReviewScreen2.U.getValue(), (LargeActionButtonDelegate) boletoTransferReviewScreen2.V.getValue(), (PlainTextWarningDelegate) boletoTransferReviewScreen2.W.getValue(), (RowDelegate) boletoTransferReviewScreen2.X.getValue()), R$id.screenBoletoReview_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 2;
        this.P = w.y0(new Function0(this) { // from class: mn1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoTransferReviewScreen f207326b;

            {
                this.f207326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BoletoTransferReviewScreen boletoTransferReviewScreen = this.f207326b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoTransferReviewScreen.Z;
                        return (b0) ((sm1.j) boletoTransferReviewScreen.Y.getValue()).f264336h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoTransferReviewScreen.Z;
                        qji.b bVarU2 = boletoTransferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.review.di.BoletoTransferReviewScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        i iVar3 = boletoTransferReviewScreen.K;
                        iVar3.getClass();
                        return new sm1.j(dVar, iVar2, boletoTransferReviewScreen, iVar3);
                    default:
                        KProperty[] kPropertyArr3 = BoletoTransferReviewScreen.Z;
                        BoletoTransferReviewScreen boletoTransferReviewScreen2 = this.f207326b;
                        return dli.f.a(boletoTransferReviewScreen2, boletoTransferReviewScreen2.R2(), zhm.v.k((CellDetailsActionDelegate) boletoTransferReviewScreen2.S.getValue(), (CellDetailsDelegate) boletoTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) boletoTransferReviewScreen2.R.getValue(), (CounterTextDelegate) boletoTransferReviewScreen2.T.getValue(), (ListSubheaderDelegate) boletoTransferReviewScreen2.U.getValue(), (LargeActionButtonDelegate) boletoTransferReviewScreen2.V.getValue(), (PlainTextWarningDelegate) boletoTransferReviewScreen2.W.getValue(), (RowDelegate) boletoTransferReviewScreen2.X.getValue()), R$id.screenBoletoReview_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new mkf.s(18));
        this.R = w.y0(new mkf.s(19));
        this.S = w.y0(new mkf.s(20));
        this.T = w.y0(new mkf.s(21));
        this.U = w.y0(new mkf.s(22));
        this.V = w.y0(new mkf.s(23));
        this.W = w.y0(new mkf.s(24));
        this.X = w.y0(new mkf.s(17));
        final int i3 = 1;
        this.Y = w.y0(new Function0(this) { // from class: mn1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoTransferReviewScreen f207326b;

            {
                this.f207326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BoletoTransferReviewScreen boletoTransferReviewScreen = this.f207326b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoTransferReviewScreen.Z;
                        return (b0) ((sm1.j) boletoTransferReviewScreen.Y.getValue()).f264336h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoTransferReviewScreen.Z;
                        qji.b bVarU2 = boletoTransferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.review.di.BoletoTransferReviewScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        i iVar3 = boletoTransferReviewScreen.K;
                        iVar3.getClass();
                        return new sm1.j(dVar, iVar2, boletoTransferReviewScreen, iVar3);
                    default:
                        KProperty[] kPropertyArr3 = BoletoTransferReviewScreen.Z;
                        BoletoTransferReviewScreen boletoTransferReviewScreen2 = this.f207326b;
                        return dli.f.a(boletoTransferReviewScreen2, boletoTransferReviewScreen2.R2(), zhm.v.k((CellDetailsActionDelegate) boletoTransferReviewScreen2.S.getValue(), (CellDetailsDelegate) boletoTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) boletoTransferReviewScreen2.R.getValue(), (CounterTextDelegate) boletoTransferReviewScreen2.T.getValue(), (ListSubheaderDelegate) boletoTransferReviewScreen2.U.getValue(), (LargeActionButtonDelegate) boletoTransferReviewScreen2.V.getValue(), (PlainTextWarningDelegate) boletoTransferReviewScreen2.W.getValue(), (RowDelegate) boletoTransferReviewScreen2.X.getValue()), R$id.screenBoletoReview_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f255179b.setText(uiState.f207348b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((j) this.Y.getValue()).e.get()).d(u.c((LargeActionButtonDelegate) this.V.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f255180c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f255179b.setLoadingButtonTag("SUBMIT_BUTTON_TAG");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f255180c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f255179b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.V.getValue()).d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).f), null, new mn1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.S.getValue()).d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.X.getValue()).f53218h), null, new g(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f255180c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_review_payment_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_review_payment_title, null, null, 14));
    }

    public final rm1.b d3() {
        ViewBinding value = this.O.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rm1.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b0 R2() {
        return (b0) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
