package com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import grl.k9;
import iqh.d;
import iug.j;
import j3c.y;
import j75.b;
import j75.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import u45.u;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/paymentmanagement/manage/LoanManageRepaymentsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lj75/h;", "Lno/m;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanManageRepaymentsController extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LoanManageRepaymentsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LoanManageRepaymentsControllerContract$InputData K;
    public final int L;
    public final h M;
    public final AnalyticsProduct.Retail N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public LoanManageRepaymentsController(LoanManageRepaymentsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.N = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.O = w.y0(new y(13));
        this.P = w.y0(new y(14));
        this.Q = w.y0(new y(15));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: j75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanManageRepaymentsController f171851b;

            {
                this.f171851b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanManageRepaymentsController loanManageRepaymentsController = this.f171851b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanManageRepaymentsController.U;
                        qji.b bVarU2 = loanManageRepaymentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.di.LoanManageRepaymentsControllerInjector");
                        u45.w wVar = (u45.w) bVarU2;
                        u45.h hVar = wVar.f277241b;
                        u45.w wVar2 = wVar.f277242c;
                        LoanManageRepaymentsControllerContract$InputData loanManageRepaymentsControllerContract$InputData = loanManageRepaymentsController.K;
                        loanManageRepaymentsControllerContract$InputData.getClass();
                        return new u(hVar, wVar2, loanManageRepaymentsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanManageRepaymentsController.U;
                        return (g) ((u) loanManageRepaymentsController.R.getValue()).f277226c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanManageRepaymentsController.U;
                        LoanManageRepaymentsController loanManageRepaymentsController2 = this.f171851b;
                        return dli.f.a(loanManageRepaymentsController2, (g) loanManageRepaymentsController2.S.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new TextDelegate(), new CellDetailsDelegate(), (RowDelegate) loanManageRepaymentsController2.O.getValue(), (FullScreenStateDelegate) loanManageRepaymentsController2.Q.getValue(), (CellDetailsActionDelegate) loanManageRepaymentsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: j75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanManageRepaymentsController f171851b;

            {
                this.f171851b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanManageRepaymentsController loanManageRepaymentsController = this.f171851b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanManageRepaymentsController.U;
                        qji.b bVarU2 = loanManageRepaymentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.di.LoanManageRepaymentsControllerInjector");
                        u45.w wVar = (u45.w) bVarU2;
                        u45.h hVar = wVar.f277241b;
                        u45.w wVar2 = wVar.f277242c;
                        LoanManageRepaymentsControllerContract$InputData loanManageRepaymentsControllerContract$InputData = loanManageRepaymentsController.K;
                        loanManageRepaymentsControllerContract$InputData.getClass();
                        return new u(hVar, wVar2, loanManageRepaymentsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanManageRepaymentsController.U;
                        return (g) ((u) loanManageRepaymentsController.R.getValue()).f277226c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanManageRepaymentsController.U;
                        LoanManageRepaymentsController loanManageRepaymentsController2 = this.f171851b;
                        return dli.f.a(loanManageRepaymentsController2, (g) loanManageRepaymentsController2.S.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new TextDelegate(), new CellDetailsDelegate(), (RowDelegate) loanManageRepaymentsController2.O.getValue(), (FullScreenStateDelegate) loanManageRepaymentsController2.Q.getValue(), (CellDetailsActionDelegate) loanManageRepaymentsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: j75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanManageRepaymentsController f171851b;

            {
                this.f171851b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanManageRepaymentsController loanManageRepaymentsController = this.f171851b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanManageRepaymentsController.U;
                        qji.b bVarU2 = loanManageRepaymentsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.di.LoanManageRepaymentsControllerInjector");
                        u45.w wVar = (u45.w) bVarU2;
                        u45.h hVar = wVar.f277241b;
                        u45.w wVar2 = wVar.f277242c;
                        LoanManageRepaymentsControllerContract$InputData loanManageRepaymentsControllerContract$InputData = loanManageRepaymentsController.K;
                        loanManageRepaymentsControllerContract$InputData.getClass();
                        return new u(hVar, wVar2, loanManageRepaymentsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanManageRepaymentsController.U;
                        return (g) ((u) loanManageRepaymentsController.R.getValue()).f277226c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanManageRepaymentsController.U;
                        LoanManageRepaymentsController loanManageRepaymentsController2 = this.f171851b;
                        return dli.f.a(loanManageRepaymentsController2, (g) loanManageRepaymentsController2.S.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new TextDelegate(), new CellDetailsDelegate(), (RowDelegate) loanManageRepaymentsController2.O.getValue(), (FullScreenStateDelegate) loanManageRepaymentsController2.Q.getValue(), (CellDetailsActionDelegate) loanManageRepaymentsController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((j75.h) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.loan_management_manage_repayments_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.loan_management_manage_repayments_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new j2c.b(this, null, 8), 3);
        ViewController.P2(this, new f(vkm.q.J(new d(rd0.e.b(((RowDelegate) this.O.getValue()).f53220l), 20), rd0.e.b(((CellDetailsActionDelegate) this.P.getValue()).d), rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b)), yx4.b.Companion, 11), new j(this, (Continuation) null, 28), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
