package com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubController;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dmj.k;
import dze.n;
import e0b.c;
import e18.i;
import e75.b;
import e75.l;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import u45.x;
import u45.y;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/hub/LoanPaymentSettingsHubController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Le75/l;", "Ldli/a;", "Le75/m;", "Lno/m;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanPaymentSettingsHubController extends ViewController<l> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LoanPaymentSettingsHubController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LoanPaymentSettingsHubControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final AnalyticsProduct.Retail Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public LoanPaymentSettingsHubController(LoanPaymentSettingsHubControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new i(19));
        this.N = w.y0(new i(20));
        this.O = w.y0(new i(21));
        this.P = R$layout.screen_recycler_navbar;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: e75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPaymentSettingsHubController f123061b;

            {
                this.f123061b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanPaymentSettingsHubController loanPaymentSettingsHubController = this.f123061b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanPaymentSettingsHubController.U;
                        qji.b bVarU2 = loanPaymentSettingsHubController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.di.LoanPaymentSettingsHubControllerInjector");
                        x xVar = (x) bVarU2;
                        u45.h hVar = xVar.f277247b;
                        x xVar2 = xVar.f277248c;
                        LoanPaymentSettingsHubControllerContract$InputData loanPaymentSettingsHubControllerContract$InputData = loanPaymentSettingsHubController.K;
                        loanPaymentSettingsHubControllerContract$InputData.getClass();
                        return new y(hVar, xVar2, loanPaymentSettingsHubControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanPaymentSettingsHubController.U;
                        return (o) ((y) loanPaymentSettingsHubController.R.getValue()).f277256c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanPaymentSettingsHubController.U;
                        LoanPaymentSettingsHubController loanPaymentSettingsHubController2 = this.f123061b;
                        return dli.f.a(loanPaymentSettingsHubController2, (o) loanPaymentSettingsHubController2.S.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (ListSubheaderDelegate) loanPaymentSettingsHubController2.N.getValue(), (RowDelegate) loanPaymentSettingsHubController2.M.getValue(), (FullScreenStateDelegate) loanPaymentSettingsHubController2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: e75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPaymentSettingsHubController f123061b;

            {
                this.f123061b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanPaymentSettingsHubController loanPaymentSettingsHubController = this.f123061b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanPaymentSettingsHubController.U;
                        qji.b bVarU2 = loanPaymentSettingsHubController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.di.LoanPaymentSettingsHubControllerInjector");
                        x xVar = (x) bVarU2;
                        u45.h hVar = xVar.f277247b;
                        x xVar2 = xVar.f277248c;
                        LoanPaymentSettingsHubControllerContract$InputData loanPaymentSettingsHubControllerContract$InputData = loanPaymentSettingsHubController.K;
                        loanPaymentSettingsHubControllerContract$InputData.getClass();
                        return new y(hVar, xVar2, loanPaymentSettingsHubControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanPaymentSettingsHubController.U;
                        return (o) ((y) loanPaymentSettingsHubController.R.getValue()).f277256c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanPaymentSettingsHubController.U;
                        LoanPaymentSettingsHubController loanPaymentSettingsHubController2 = this.f123061b;
                        return dli.f.a(loanPaymentSettingsHubController2, (o) loanPaymentSettingsHubController2.S.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (ListSubheaderDelegate) loanPaymentSettingsHubController2.N.getValue(), (RowDelegate) loanPaymentSettingsHubController2.M.getValue(), (FullScreenStateDelegate) loanPaymentSettingsHubController2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: e75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPaymentSettingsHubController f123061b;

            {
                this.f123061b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanPaymentSettingsHubController loanPaymentSettingsHubController = this.f123061b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanPaymentSettingsHubController.U;
                        qji.b bVarU2 = loanPaymentSettingsHubController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.di.LoanPaymentSettingsHubControllerInjector");
                        x xVar = (x) bVarU2;
                        u45.h hVar = xVar.f277247b;
                        x xVar2 = xVar.f277248c;
                        LoanPaymentSettingsHubControllerContract$InputData loanPaymentSettingsHubControllerContract$InputData = loanPaymentSettingsHubController.K;
                        loanPaymentSettingsHubControllerContract$InputData.getClass();
                        return new y(hVar, xVar2, loanPaymentSettingsHubControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanPaymentSettingsHubController.U;
                        return (o) ((y) loanPaymentSettingsHubController.R.getValue()).f277256c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanPaymentSettingsHubController.U;
                        LoanPaymentSettingsHubController loanPaymentSettingsHubController2 = this.f123061b;
                        return dli.f.a(loanPaymentSettingsHubController2, (o) loanPaymentSettingsHubController2.S.getValue(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (ListSubheaderDelegate) loanPaymentSettingsHubController2.N.getValue(), (RowDelegate) loanPaymentSettingsHubController2.M.getValue(), (FullScreenStateDelegate) loanPaymentSettingsHubController2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e75.m) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e75.o) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_payment_settings_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new n(this, null, 16), 3);
        ?? r112 = this.M;
        ViewController.P2(this, new f(vkm.q.J(new k(rd0.e.b(((RowDelegate) r112.getValue()).f53220l), 18), rd0.e.b(((RowDelegate) r112.getValue()).f53218h), rd0.e.b(((RowDelegate) r112.getValue()).k), rd0.e.b(((RowDelegate) r112.getValue()).f53225r), rd0.e.b(((ListSubheaderDelegate) this.N.getValue()).d), rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b)), yx4.b.Companion, 4), new c(this, null, 18), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
