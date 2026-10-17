package com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.R$id;
import com.revolut.feature.pay_bills_taxes.impl.R$layout;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.k;
import lh9.b;
import lh9.c;
import lh9.d;
import lh9.f;
import lh9.g;
import lh9.m;
import lh9.n;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/form/review/FormReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llh9/m;", "Ldli/a;", "Llh9/o;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormReviewScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(FormReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/pay_bills_taxes/impl/databinding/ScreenApmFormReviewBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Lazy O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public FormReviewScreen(FormReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_apm_form_review;
        this.L = true;
        this.M = s.t(this, c.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: lh9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormReviewScreen f195178b;

            {
                this.f195178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FormReviewScreen formReviewScreen = this.f195178b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FormReviewScreen.U;
                        return new CenteredAmountDelegate(new lcc.c(formReviewScreen, 11));
                    case 1:
                        KProperty[] kPropertyArr2 = FormReviewScreen.U;
                        return (n) ((lf9.k) formReviewScreen.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = FormReviewScreen.U;
                        FormReviewScreen formReviewScreen2 = this.f195178b;
                        return dli.f.a(formReviewScreen2, formReviewScreen2.R2(), v.k((CellDetailsActionDelegate) formReviewScreen2.P.getValue(), (CellDetailsDelegate) formReviewScreen2.O.getValue(), (CenteredAmountDelegate) formReviewScreen2.N.getValue(), (RowDelegate) formReviewScreen2.Q.getValue(), new ListSubheaderDelegate(), new CellDetailsNoteDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = j.b(new b(0));
        this.P = w.y0(new b(1));
        this.Q = w.y0(new b(2));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: lh9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormReviewScreen f195178b;

            {
                this.f195178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FormReviewScreen formReviewScreen = this.f195178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormReviewScreen.U;
                        return new CenteredAmountDelegate(new lcc.c(formReviewScreen, 11));
                    case 1:
                        KProperty[] kPropertyArr2 = FormReviewScreen.U;
                        return (n) ((lf9.k) formReviewScreen.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = FormReviewScreen.U;
                        FormReviewScreen formReviewScreen2 = this.f195178b;
                        return dli.f.a(formReviewScreen2, formReviewScreen2.R2(), v.k((CellDetailsActionDelegate) formReviewScreen2.P.getValue(), (CellDetailsDelegate) formReviewScreen2.O.getValue(), (CenteredAmountDelegate) formReviewScreen2.N.getValue(), (RowDelegate) formReviewScreen2.Q.getValue(), new ListSubheaderDelegate(), new CellDetailsNoteDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: lh9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormReviewScreen f195178b;

            {
                this.f195178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FormReviewScreen formReviewScreen = this.f195178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormReviewScreen.U;
                        return new CenteredAmountDelegate(new lcc.c(formReviewScreen, 11));
                    case 1:
                        KProperty[] kPropertyArr2 = FormReviewScreen.U;
                        return (n) ((lf9.k) formReviewScreen.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = FormReviewScreen.U;
                        FormReviewScreen formReviewScreen2 = this.f195178b;
                        return dli.f.a(formReviewScreen2, formReviewScreen2.R2(), v.k((CellDetailsActionDelegate) formReviewScreen2.P.getValue(), (CellDetailsDelegate) formReviewScreen2.O.getValue(), (CenteredAmountDelegate) formReviewScreen2.N.getValue(), (RowDelegate) formReviewScreen2.Q.getValue(), new ListSubheaderDelegate(), new CellDetailsNoteDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = w.y0(new lea.b(this, inputData, 3));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        lh9.o uiState = (lh9.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f160976b.setModel(uiState.f195187b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f160977c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_review_form_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160976b.f), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160977c.f59211b), null, new d(this, continuation, 1), 3);
        Lazy lazy = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) lazy.getValue()).f), null, new lh9.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) lazy.getValue()).d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.P.getValue()).d), null, new lh9.h(this, null), 3);
    }

    public final if9.d d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (if9.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
