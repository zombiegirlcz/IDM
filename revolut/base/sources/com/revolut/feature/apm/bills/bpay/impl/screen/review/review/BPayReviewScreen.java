package com.revolut.feature.apm.bills.bpay.impl.screen.review.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ao1.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.bpay.api.R$string;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sdl.y;
import so1.b;
import so1.c;
import so1.d;
import so1.i;
import so1.j;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/review/review/BPayReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lso1/i;", "Ldli/a;", "Lso1/o;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BPayReviewScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BPayReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public BPayReviewScreen(BPayReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: so1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayReviewScreen f264672b;

            {
                this.f264672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = BPayReviewScreen.R;
                        return (j) ((ao1.f) this.f264672b.Q.getValue()).f7887c.get();
                    default:
                        KProperty[] kPropertyArr2 = BPayReviewScreen.R;
                        BPayReviewScreen bPayReviewScreen = this.f264672b;
                        return dli.f.a(bPayReviewScreen, bPayReviewScreen.d(), zhm.v.k(new PlainTextWarningDelegate(), new CellDetailsDelegate(), (CellDetailsActionDelegate) bPayReviewScreen.N.getValue(), (CellDetailsNoteDelegate) bPayReviewScreen.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new y(27));
        this.O = w.y0(new y(28));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: so1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayReviewScreen f264672b;

            {
                this.f264672b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BPayReviewScreen.R;
                        return (j) ((ao1.f) this.f264672b.Q.getValue()).f7887c.get();
                    default:
                        KProperty[] kPropertyArr2 = BPayReviewScreen.R;
                        BPayReviewScreen bPayReviewScreen = this.f264672b;
                        return dli.f.a(bPayReviewScreen, bPayReviewScreen.d(), zhm.v.k(new PlainTextWarningDelegate(), new CellDetailsDelegate(), (CellDetailsActionDelegate) bPayReviewScreen.N.getValue(), (CellDetailsNoteDelegate) bPayReviewScreen.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new s86.a(this, inputData, 21));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        so1.o uiState = (so1.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setText(uiState.f264684b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pay_bills_taxes_country_au_review_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(true);
        largeActionButton.setTag("PAY_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.N.getValue()).d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsNoteDelegate) this.O.getValue()).d), new so1.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
