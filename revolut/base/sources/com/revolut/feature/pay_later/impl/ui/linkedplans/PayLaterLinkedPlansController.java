package com.revolut.feature.pay_later.impl.ui.linkedplans;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$plurals;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansController;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ij9.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import r0e.c;
import re3.d;
import rj9.f;
import rj9.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/linkedplans/PayLaterLinkedPlansController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lrj9/g;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterLinkedPlansController extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PayLaterLinkedPlansController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final PayLaterLinkedPlansControllerContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public PayLaterLinkedPlansController(PayLaterLinkedPlansControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f161739a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, rj9.b.f);
        this.O = w.y0(new d(11));
        this.P = w.y0(new d(12));
        this.Q = w.y0(new d(13));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: rj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterLinkedPlansController f254632b;

            {
                this.f254632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayLaterLinkedPlansController payLaterLinkedPlansController = this.f254632b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterLinkedPlansController.U;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterLinkedPlansController.m2()).v;
                        PayLaterLinkedPlansControllerContract$InputData payLaterLinkedPlansControllerContract$InputData = payLaterLinkedPlansController.L;
                        payLaterLinkedPlansControllerContract$InputData.getClass();
                        return new oi9.h(fVar, payLaterLinkedPlansControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterLinkedPlansController.U;
                        return (f) ((oi9.h) payLaterLinkedPlansController.R.getValue()).f225521c.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterLinkedPlansController.U;
                        PayLaterLinkedPlansController payLaterLinkedPlansController2 = this.f254632b;
                        return dli.f.a(payLaterLinkedPlansController2, (f) payLaterLinkedPlansController2.S.getValue(), v.k((RowDelegate) payLaterLinkedPlansController2.O.getValue(), (RowLoadingDelegate) payLaterLinkedPlansController2.P.getValue(), (FullScreenStateDelegate) payLaterLinkedPlansController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: rj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterLinkedPlansController f254632b;

            {
                this.f254632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayLaterLinkedPlansController payLaterLinkedPlansController = this.f254632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterLinkedPlansController.U;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterLinkedPlansController.m2()).v;
                        PayLaterLinkedPlansControllerContract$InputData payLaterLinkedPlansControllerContract$InputData = payLaterLinkedPlansController.L;
                        payLaterLinkedPlansControllerContract$InputData.getClass();
                        return new oi9.h(fVar, payLaterLinkedPlansControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterLinkedPlansController.U;
                        return (f) ((oi9.h) payLaterLinkedPlansController.R.getValue()).f225521c.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterLinkedPlansController.U;
                        PayLaterLinkedPlansController payLaterLinkedPlansController2 = this.f254632b;
                        return dli.f.a(payLaterLinkedPlansController2, (f) payLaterLinkedPlansController2.S.getValue(), v.k((RowDelegate) payLaterLinkedPlansController2.O.getValue(), (RowLoadingDelegate) payLaterLinkedPlansController2.P.getValue(), (FullScreenStateDelegate) payLaterLinkedPlansController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: rj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterLinkedPlansController f254632b;

            {
                this.f254632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayLaterLinkedPlansController payLaterLinkedPlansController = this.f254632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLaterLinkedPlansController.U;
                        oi9.f fVar = kotlin.jvm.internal.s.n(payLaterLinkedPlansController.m2()).v;
                        PayLaterLinkedPlansControllerContract$InputData payLaterLinkedPlansControllerContract$InputData = payLaterLinkedPlansController.L;
                        payLaterLinkedPlansControllerContract$InputData.getClass();
                        return new oi9.h(fVar, payLaterLinkedPlansControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayLaterLinkedPlansController.U;
                        return (f) ((oi9.h) payLaterLinkedPlansController.R.getValue()).f225521c.get();
                    default:
                        KProperty[] kPropertyArr3 = PayLaterLinkedPlansController.U;
                        PayLaterLinkedPlansController payLaterLinkedPlansController2 = this.f254632b;
                        return dli.f.a(payLaterLinkedPlansController2, (f) payLaterLinkedPlansController2.S.getValue(), v.k((RowDelegate) payLaterLinkedPlansController2.O.getValue(), (RowLoadingDelegate) payLaterLinkedPlansController2.P.getValue(), (FullScreenStateDelegate) payLaterLinkedPlansController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        this.K.getClass();
        return b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (oi9.h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedQuantityClause(R$plurals.pay_later_repayment_details_related_plans_title, (Number) Integer.MAX_VALUE, u.c(Integer.MAX_VALUE), (Style) null, 24), null);
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new c(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new rj9.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new rj9.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
