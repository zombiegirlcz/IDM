package com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.PayrollManagerInputController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m75.i;
import mhb.b;
import mhb.c;
import mhb.d;
import mhb.f;
import mhb.g;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/email_payroll/payroll_manager_input/PayrollManagerInputController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmhb/c;", "Ldli/a;", "Lmhb/d;", "Lno/m;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayrollManagerInputController extends ViewController<c> implements dli.a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PayrollManagerInputController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_footer_nextbutton;
    public final h L = s.t(this, a.f);
    public final AnalyticsProduct.Retail M;
    public final Object N;
    public final Object O;
    public final InputTextDelegate P;
    public final TextDelegate Q;
    public final Object R;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.s.a(p0);
        }
    }

    public PayrollManagerInputController() {
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mhb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayrollManagerInputController f205478b;

            {
                this.f205478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayrollManagerInputController payrollManagerInputController = this.f205478b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayrollManagerInputController.S;
                        qji.b bVarU2 = payrollManagerInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.di.PayrollManagerInputControllerComponent.Injector");
                        wfb.c cVar = new wfb.c();
                        cVar.f297027a = e4m.b.b(new vk6.a(cVar, 12));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayrollManagerInputController.S;
                        return (b) ((wfb.c) payrollManagerInputController.N.getValue()).f297027a.get();
                    default:
                        KProperty[] kPropertyArr3 = PayrollManagerInputController.S;
                        PayrollManagerInputController payrollManagerInputController2 = this.f205478b;
                        return dli.f.a(payrollManagerInputController2, payrollManagerInputController2.d(), v.k(new ListSubheaderDelegate(), payrollManagerInputController2.P, payrollManagerInputController2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mhb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayrollManagerInputController f205478b;

            {
                this.f205478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayrollManagerInputController payrollManagerInputController = this.f205478b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayrollManagerInputController.S;
                        qji.b bVarU2 = payrollManagerInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.di.PayrollManagerInputControllerComponent.Injector");
                        wfb.c cVar = new wfb.c();
                        cVar.f297027a = e4m.b.b(new vk6.a(cVar, 12));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayrollManagerInputController.S;
                        return (b) ((wfb.c) payrollManagerInputController.N.getValue()).f297027a.get();
                    default:
                        KProperty[] kPropertyArr3 = PayrollManagerInputController.S;
                        PayrollManagerInputController payrollManagerInputController2 = this.f205478b;
                        return dli.f.a(payrollManagerInputController2, payrollManagerInputController2.d(), v.k(new ListSubheaderDelegate(), payrollManagerInputController2.P, payrollManagerInputController2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new InputTextDelegate(null);
        this.Q = new TextDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: mhb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayrollManagerInputController f205478b;

            {
                this.f205478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayrollManagerInputController payrollManagerInputController = this.f205478b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayrollManagerInputController.S;
                        qji.b bVarU2 = payrollManagerInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.di.PayrollManagerInputControllerComponent.Injector");
                        wfb.c cVar = new wfb.c();
                        cVar.f297027a = e4m.b.b(new vk6.a(cVar, 12));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = PayrollManagerInputController.S;
                        return (b) ((wfb.c) payrollManagerInputController.N.getValue()).f297027a.get();
                    default:
                        KProperty[] kPropertyArr3 = PayrollManagerInputController.S;
                        PayrollManagerInputController payrollManagerInputController2 = this.f205478b;
                        return dli.f.a(payrollManagerInputController2, payrollManagerInputController2.d(), v.k(new ListSubheaderDelegate(), payrollManagerInputController2.P, payrollManagerInputController2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174558c.setContent(uiState.f205475b);
        d3().f174557b.setEnabled(uiState.f205476c);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wfb.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_description, null, null, 14));
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGreyTone50);
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174557b.setText(new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_cta_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.e.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new i(this, null, 26), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new f(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b d() {
        return (b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
