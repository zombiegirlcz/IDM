package com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wfb.q;
import zc0.m;
import zhb.c;
import zhb.d;
import zhb.e;
import zhb.g;
import zhb.i;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/payroll_platform/work_email_input/PayrollPlatformEmailInputController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzhb/d;", "Ldli/a;", "Lzhb/e;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayrollPlatformEmailInputController extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PayrollPlatformEmailInputController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final PayrollPlatformEmailInputContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;

    public PayrollPlatformEmailInputController(PayrollPlatformEmailInputContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, g.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zhb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayrollPlatformEmailInputController f322388b;

            {
                this.f322388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayrollPlatformEmailInputController payrollPlatformEmailInputController = this.f322388b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayrollPlatformEmailInputController.R;
                        return (c) ((wfb.d) payrollPlatformEmailInputController.P.getValue()).f297029b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayrollPlatformEmailInputController.R;
                        PayrollPlatformEmailInputController payrollPlatformEmailInputController2 = this.f322388b;
                        return dli.f.a(payrollPlatformEmailInputController2, (c) payrollPlatformEmailInputController2.M.getValue(), u.c((InputTextDelegate) payrollPlatformEmailInputController2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PayrollPlatformEmailInputController.R;
                        qji.b bVarU2 = payrollPlatformEmailInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.di.PayrollPlatformEmailInputControllerComponent.Injector");
                        q qVar = (q) bVarU2;
                        wfb.i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        PayrollPlatformEmailInputContract$InputData payrollPlatformEmailInputContract$InputData = payrollPlatformEmailInputController.K;
                        payrollPlatformEmailInputContract$InputData.getClass();
                        return new wfb.d(iVar, qVar2, payrollPlatformEmailInputContract$InputData);
                }
            }
        });
        this.N = w.y0(new m(25));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zhb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayrollPlatformEmailInputController f322388b;

            {
                this.f322388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayrollPlatformEmailInputController payrollPlatformEmailInputController = this.f322388b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayrollPlatformEmailInputController.R;
                        return (c) ((wfb.d) payrollPlatformEmailInputController.P.getValue()).f297029b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayrollPlatformEmailInputController.R;
                        PayrollPlatformEmailInputController payrollPlatformEmailInputController2 = this.f322388b;
                        return dli.f.a(payrollPlatformEmailInputController2, (c) payrollPlatformEmailInputController2.M.getValue(), u.c((InputTextDelegate) payrollPlatformEmailInputController2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PayrollPlatformEmailInputController.R;
                        qji.b bVarU2 = payrollPlatformEmailInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.di.PayrollPlatformEmailInputControllerComponent.Injector");
                        q qVar = (q) bVarU2;
                        wfb.i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        PayrollPlatformEmailInputContract$InputData payrollPlatformEmailInputContract$InputData = payrollPlatformEmailInputController.K;
                        payrollPlatformEmailInputContract$InputData.getClass();
                        return new wfb.d(iVar, qVar2, payrollPlatformEmailInputContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: zhb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayrollPlatformEmailInputController f322388b;

            {
                this.f322388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayrollPlatformEmailInputController payrollPlatformEmailInputController = this.f322388b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayrollPlatformEmailInputController.R;
                        return (c) ((wfb.d) payrollPlatformEmailInputController.P.getValue()).f297029b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayrollPlatformEmailInputController.R;
                        PayrollPlatformEmailInputController payrollPlatformEmailInputController2 = this.f322388b;
                        return dli.f.a(payrollPlatformEmailInputController2, (c) payrollPlatformEmailInputController2.M.getValue(), u.c((InputTextDelegate) payrollPlatformEmailInputController2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PayrollPlatformEmailInputController.R;
                        qji.b bVarU2 = payrollPlatformEmailInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.di.PayrollPlatformEmailInputControllerComponent.Injector");
                        q qVar = (q) bVarU2;
                        wfb.i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        PayrollPlatformEmailInputContract$InputData payrollPlatformEmailInputContract$InputData = payrollPlatformEmailInputController.K;
                        payrollPlatformEmailInputContract$InputData.getClass();
                        return new wfb.d(iVar, qVar2, payrollPlatformEmailInputContract$InputData);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar_footer_nextbutton;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174557b.setEnabled(uiState.f322386b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (wfb.d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salary_switch_assistant_payroll_platform_email_input_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.salary_switch_assistant_payroll_platform_email_input_title, null, null, 14));
        PayrollPlatformEmailInputContract$InputData payrollPlatformEmailInputContract$InputData = this.K;
        PayrollPlatformEmailInputContract$InputData.UpdatePayrollPlatform updatePayrollPlatform = PayrollPlatformEmailInputContract$InputData.UpdatePayrollPlatform.f83058a;
        if (Intrinsics.f(payrollPlatformEmailInputContract$InputData, updatePayrollPlatform)) {
            i = R$string.salary_switch_assistant_payroll_platform_email_input_description;
        } else {
            if (!(payrollPlatformEmailInputContract$InputData instanceof PayrollPlatformEmailInputContract$InputData.AccountToWorkEmail)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.salary_switch_assistant_account_to_work_email_input_description;
        }
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(i, null, null, 14));
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGreyTone50);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174557b;
        if (Intrinsics.f(payrollPlatformEmailInputContract$InputData, updatePayrollPlatform)) {
            i2 = R$string.salary_switch_assistant_payroll_platform_email_input_cta;
        } else {
            if (!(payrollPlatformEmailInputContract$InputData instanceof PayrollPlatformEmailInputContract$InputData.AccountToWorkEmail)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.salary_switch_assistant_account_to_work_email_input_cta;
        }
        largeActionButton.setText(new TextLocalisedClause(i2, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.N.getValue()).e.f121375b), new zhb.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new i(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
