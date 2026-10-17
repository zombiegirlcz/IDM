package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.other_liabilities;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.other_liabilities.DebtV2OtherLiabilitiesController;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.x1;
import g94.b;
import g94.c;
import g94.e;
import g94.f;
import g94.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/other_liabilities/DebtV2OtherLiabilitiesController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lg94/e;", "Ldli/a;", "Lg94/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebtV2OtherLiabilitiesController extends PluginScreenController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DebtV2OtherLiabilitiesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h L;
    public final int M;
    public final InputDisclosureDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public DebtV2OtherLiabilitiesController(DebtV2OtherLiabilitiesControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        this.N = new InputDisclosureDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: g94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtV2OtherLiabilitiesController f141457b;

            {
                this.f141457b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DebtV2OtherLiabilitiesController.R;
                        DebtV2OtherLiabilitiesController debtV2OtherLiabilitiesController = this.f141457b;
                        return dli.f.a(debtV2OtherLiabilitiesController, (f) debtV2OtherLiabilitiesController.Q.getValue(), u.c(debtV2OtherLiabilitiesController.N), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = DebtV2OtherLiabilitiesController.R;
                        return (f) ((x1) this.f141457b.P.getValue()).f120127c.get();
                }
            }
        });
        this.P = w.y0(new fx5.a(this, inputData, 17));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: g94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtV2OtherLiabilitiesController f141457b;

            {
                this.f141457b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DebtV2OtherLiabilitiesController.R;
                        DebtV2OtherLiabilitiesController debtV2OtherLiabilitiesController = this.f141457b;
                        return dli.f.a(debtV2OtherLiabilitiesController, (f) debtV2OtherLiabilitiesController.Q.getValue(), u.c(debtV2OtherLiabilitiesController.N), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = DebtV2OtherLiabilitiesController.R;
                        return (f) ((x1) this.f141457b.P.getValue()).f120127c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_application_outstanding_debts_other_liabilities_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_application_outstanding_debts_other_liabilities_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new g85.f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52538c), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
