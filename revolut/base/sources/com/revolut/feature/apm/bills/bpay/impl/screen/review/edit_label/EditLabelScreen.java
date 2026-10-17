package com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.bpay.api.R$string;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.EditLabelScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pe2.c;
import po1.b;
import po1.d;
import po1.g;
import po1.l;
import po1.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/review/edit_label/EditLabelScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpo1/g;", "Ldli/a;", "Lpo1/l;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditLabelScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EditLabelScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final h P;

    public EditLabelScreen(EditLabelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new pni.a(1));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: po1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditLabelScreen f237876b;

            {
                this.f237876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = EditLabelScreen.Q;
                        return new n(((ao1.h) this.f237876b.N.getValue()).f7891a, new m());
                    default:
                        KProperty[] kPropertyArr2 = EditLabelScreen.Q;
                        EditLabelScreen editLabelScreen = this.f237876b;
                        return dli.f.a(editLabelScreen, (n) editLabelScreen.L.getValue(), u.c((InputTextDelegate) editLabelScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: po1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditLabelScreen f237876b;

            {
                this.f237876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditLabelScreen.Q;
                        return new n(((ao1.h) this.f237876b.N.getValue()).f7891a, new m());
                    default:
                        KProperty[] kPropertyArr2 = EditLabelScreen.Q;
                        EditLabelScreen editLabelScreen = this.f237876b;
                        return dli.f.a(editLabelScreen, (n) editLabelScreen.L.getValue(), u.c((InputTextDelegate) editLabelScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new c(this, inputData, 18));
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ao1.h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pay_bills_taxes_country_au_review_cell_label_title, null, null, 14), null);
        h30.l.A(R.string.common_action_update, null, null, 14, d3().f174564b);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new po1.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new po1.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.K.getValue()).e.f121375b), new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
