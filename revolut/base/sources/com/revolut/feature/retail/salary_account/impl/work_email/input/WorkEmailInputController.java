package com.revolut.feature.retail.salary_account.impl.work_email.input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputController;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hf7.d;
import hib.b;
import hib.c;
import hib.f;
import hib.j;
import hib.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/work_email/input/WorkEmailInputController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhib/j;", "Ldli/a;", "Lhib/k;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkEmailInputController extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WorkEmailInputController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final WorkEmailInputControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;

    public WorkEmailInputController(WorkEmailInputControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: hib.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkEmailInputController f152575b;

            {
                this.f152575b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WorkEmailInputController workEmailInputController = this.f152575b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WorkEmailInputController.R;
                        return (f) ((wfb.s) workEmailInputController.P.getValue()).f297077b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkEmailInputController.R;
                        WorkEmailInputController workEmailInputController2 = this.f152575b;
                        return dli.f.a(workEmailInputController2, workEmailInputController2.R2(), u.c((InputTextDelegate) workEmailInputController2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WorkEmailInputController.R;
                        qji.b bVarU2 = workEmailInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.work_email.input.di.WorkEmailInputControllerComponent.Injector");
                        wfb.r rVar = (wfb.r) bVarU2;
                        wfb.i iVar = rVar.f297074b;
                        wfb.r rVar2 = rVar.f297075c;
                        WorkEmailInputControllerContract$InputData workEmailInputControllerContract$InputData = workEmailInputController.K;
                        workEmailInputControllerContract$InputData.getClass();
                        return new wfb.s(iVar, rVar2, workEmailInputControllerContract$InputData);
                }
            }
        });
        this.N = w.y0(new d(8));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hib.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkEmailInputController f152575b;

            {
                this.f152575b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WorkEmailInputController workEmailInputController = this.f152575b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkEmailInputController.R;
                        return (f) ((wfb.s) workEmailInputController.P.getValue()).f297077b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkEmailInputController.R;
                        WorkEmailInputController workEmailInputController2 = this.f152575b;
                        return dli.f.a(workEmailInputController2, workEmailInputController2.R2(), u.c((InputTextDelegate) workEmailInputController2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WorkEmailInputController.R;
                        qji.b bVarU2 = workEmailInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.work_email.input.di.WorkEmailInputControllerComponent.Injector");
                        wfb.r rVar = (wfb.r) bVarU2;
                        wfb.i iVar = rVar.f297074b;
                        wfb.r rVar2 = rVar.f297075c;
                        WorkEmailInputControllerContract$InputData workEmailInputControllerContract$InputData = workEmailInputController.K;
                        workEmailInputControllerContract$InputData.getClass();
                        return new wfb.s(iVar, rVar2, workEmailInputControllerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: hib.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkEmailInputController f152575b;

            {
                this.f152575b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WorkEmailInputController workEmailInputController = this.f152575b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkEmailInputController.R;
                        return (f) ((wfb.s) workEmailInputController.P.getValue()).f297077b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkEmailInputController.R;
                        WorkEmailInputController workEmailInputController2 = this.f152575b;
                        return dli.f.a(workEmailInputController2, workEmailInputController2.R2(), u.c((InputTextDelegate) workEmailInputController2.N.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WorkEmailInputController.R;
                        qji.b bVarU2 = workEmailInputController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.work_email.input.di.WorkEmailInputControllerComponent.Injector");
                        wfb.r rVar = (wfb.r) bVarU2;
                        wfb.i iVar = rVar.f297074b;
                        wfb.r rVar2 = rVar.f297075c;
                        WorkEmailInputControllerContract$InputData workEmailInputControllerContract$InputData = workEmailInputController.K;
                        workEmailInputControllerContract$InputData.getClass();
                        return new wfb.s(iVar, rVar2, workEmailInputControllerContract$InputData);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar_footer_nextbutton;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174558c.setContent(uiState.f152582b);
        d3().f174557b.setEnabled(uiState.f152583c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wfb.s) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_title, null, null, 14));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_description, null, null, 14));
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGrey50);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setText(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.N.getValue()).e.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new hib.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174558c.f58608l), new hba.k(this, (Continuation) null, 19), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new hib.d(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
