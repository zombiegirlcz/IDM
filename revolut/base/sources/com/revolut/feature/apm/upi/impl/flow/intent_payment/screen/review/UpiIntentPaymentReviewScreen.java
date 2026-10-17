package com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import if2.j;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import te0.w;
import tf2.b;
import tf2.c;
import tf2.f;
import tf2.g;
import tf2.m;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/intent_payment/screen/review/UpiIntentPaymentReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltf2/f;", "Ldli/a;", "Ltf2/g;", "Lno/d1;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiIntentPaymentReviewScreen extends ViewController<f> implements a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(UpiIntentPaymentReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final boolean K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public UpiIntentPaymentReviewScreen(UpiIntentPaymentReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: tf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiIntentPaymentReviewScreen f270210b;

            {
                this.f270210b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = UpiIntentPaymentReviewScreen.S;
                        return (m) ((if2.j) this.f270210b.R.getValue()).f160878g.get();
                    default:
                        KProperty[] kPropertyArr2 = UpiIntentPaymentReviewScreen.S;
                        UpiIntentPaymentReviewScreen upiIntentPaymentReviewScreen = this.f270210b;
                        return dli.f.a(upiIntentPaymentReviewScreen, (m) upiIntentPaymentReviewScreen.M.getValue(), v.k((CellDetailsDelegate) upiIntentPaymentReviewScreen.P.getValue(), (LargeActionButtonDelegate) upiIntentPaymentReviewScreen.Q.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new IconDelegate(), new CounterTextDelegate(), new CellDetailsActionDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: tf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiIntentPaymentReviewScreen f270210b;

            {
                this.f270210b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpiIntentPaymentReviewScreen.S;
                        return (m) ((if2.j) this.f270210b.R.getValue()).f160878g.get();
                    default:
                        KProperty[] kPropertyArr2 = UpiIntentPaymentReviewScreen.S;
                        UpiIntentPaymentReviewScreen upiIntentPaymentReviewScreen = this.f270210b;
                        return dli.f.a(upiIntentPaymentReviewScreen, (m) upiIntentPaymentReviewScreen.M.getValue(), v.k((CellDetailsDelegate) upiIntentPaymentReviewScreen.P.getValue(), (LargeActionButtonDelegate) upiIntentPaymentReviewScreen.Q.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new IconDelegate(), new CounterTextDelegate(), new CellDetailsActionDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new t73.h(25));
        this.Q = w.y0(new t73.h(26));
        this.R = w.y0(new sw6.a(this, inputData, 17));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_transfer_review_title_outgoing, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.apm_transfer_review_title_outgoing, null, null, 14));
        LargeActionButton largeActionButton = d3().f174564b;
        l.A(R.string.common_action_send, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("SUBMIT_BUTTON_TAG");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
