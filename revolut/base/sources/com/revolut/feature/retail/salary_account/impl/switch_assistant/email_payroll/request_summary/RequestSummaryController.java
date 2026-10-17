package com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.RequestSummaryContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.RequestSummaryController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ohb.c;
import ohb.d;
import ohb.f;
import ohb.g;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import wfb.q;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/email_payroll/request_summary/RequestSummaryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lohb/c;", "Ldli/a;", "Lohb/d;", "Lno/m;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RequestSummaryController extends ViewController<c> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RequestSummaryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final RequestSummaryContract$InputData K;
    public final int L;
    public final h M;
    public final AnalyticsProduct.Retail N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RequestSummaryController(RequestSummaryContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, f.f);
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.N = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ohb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestSummaryController f225340b;

            {
                this.f225340b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RequestSummaryController requestSummaryController = this.f225340b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RequestSummaryController.R;
                        qji.b bVarU2 = requestSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.di.RequestSummaryControllerComponent.Injector");
                        q qVar = (q) bVarU2;
                        wfb.i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        RequestSummaryContract$InputData requestSummaryContract$InputData = requestSummaryController.K;
                        requestSummaryContract$InputData.getClass();
                        return new wfb.f(iVar, qVar2, requestSummaryContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestSummaryController.R;
                        return (b) ((wfb.f) requestSummaryController.O.getValue()).f297034c.get();
                    default:
                        KProperty[] kPropertyArr3 = RequestSummaryController.R;
                        RequestSummaryController requestSummaryController2 = this.f225340b;
                        return dli.f.a(requestSummaryController2, (b) requestSummaryController2.P.getValue(), v.k(new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ohb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestSummaryController f225340b;

            {
                this.f225340b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RequestSummaryController requestSummaryController = this.f225340b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RequestSummaryController.R;
                        qji.b bVarU2 = requestSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.di.RequestSummaryControllerComponent.Injector");
                        q qVar = (q) bVarU2;
                        wfb.i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        RequestSummaryContract$InputData requestSummaryContract$InputData = requestSummaryController.K;
                        requestSummaryContract$InputData.getClass();
                        return new wfb.f(iVar, qVar2, requestSummaryContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestSummaryController.R;
                        return (b) ((wfb.f) requestSummaryController.O.getValue()).f297034c.get();
                    default:
                        KProperty[] kPropertyArr3 = RequestSummaryController.R;
                        RequestSummaryController requestSummaryController2 = this.f225340b;
                        return dli.f.a(requestSummaryController2, (b) requestSummaryController2.P.getValue(), v.k(new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ohb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestSummaryController f225340b;

            {
                this.f225340b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RequestSummaryController requestSummaryController = this.f225340b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RequestSummaryController.R;
                        qji.b bVarU2 = requestSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.di.RequestSummaryControllerComponent.Injector");
                        q qVar = (q) bVarU2;
                        wfb.i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        RequestSummaryContract$InputData requestSummaryContract$InputData = requestSummaryController.K;
                        requestSummaryContract$InputData.getClass();
                        return new wfb.f(iVar, qVar2, requestSummaryContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestSummaryController.R;
                        return (b) ((wfb.f) requestSummaryController.O.getValue()).f297034c.get();
                    default:
                        KProperty[] kPropertyArr3 = RequestSummaryController.R;
                        RequestSummaryController requestSummaryController2 = this.f225340b;
                        return dli.f.a(requestSummaryController2, (b) requestSummaryController2.P.getValue(), v.k(new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174558c.setContent(uiState.f225338b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wfb.f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (ohb.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salary_switch_assistant_request_summary_title, null, null, 14), null);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setLoadingButtonTag("BUTTON_TAG_GENERATE_EMAIL");
        largeActionButton.setText(new TextLocalisedClause(R$string.salary_switch_assistant_request_summary_cta_generate_email, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new g(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
