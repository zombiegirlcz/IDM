package com.revolut.feature_workflow_reminder_impl.ui.timer;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_workflow_reminder_impl.R$id;
import com.revolut.feature_workflow_reminder_impl.R$layout;
import com.revolut.feature_workflow_reminder_impl.R$string;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerController;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fhi.b;
import fhi.c;
import fhi.g;
import fhi.m;
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
import zgi.d;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_workflow_reminder_impl/ui/timer/WorkflowTimerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfhi/g;", "Ldli/a;", "Lfhi/h;", "feature_workflow_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowTimerController extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WorkflowTimerController.class, "binding", "getBinding()Lcom/revolut/feature_workflow_reminder_impl/databinding/ScreenWorkflowTimerBinding;", 0))};
    public final WorkflowTimerControllerContract$InputData K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final TimePickerDelegate P;
    public final Object Q;

    public WorkflowTimerController(WorkflowTimerControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: fhi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowTimerController f135239b;

            {
                this.f135239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WorkflowTimerController workflowTimerController = this.f135239b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowTimerController.R;
                        return (m) ((zgi.d) workflowTimerController.O.getValue()).f322134b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowTimerController.R;
                        qji.b bVarU2 = workflowTimerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_workflow_reminder_impl.ui.timer.di.WorkflowTimerControllerInjector");
                        zgi.c cVar = (zgi.c) bVarU2;
                        zgi.a aVar = cVar.f322130a;
                        zgi.c cVar2 = cVar.f322131b;
                        WorkflowTimerControllerContract$InputData workflowTimerControllerContract$InputData = workflowTimerController.K;
                        workflowTimerControllerContract$InputData.getClass();
                        return new zgi.d(aVar, cVar2, workflowTimerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WorkflowTimerController.R;
                        WorkflowTimerController workflowTimerController2 = this.f135239b;
                        return dli.f.a(workflowTimerController2, (m) workflowTimerController2.L.getValue(), u.c(workflowTimerController2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R$layout.screen_workflow_timer;
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fhi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowTimerController f135239b;

            {
                this.f135239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WorkflowTimerController workflowTimerController = this.f135239b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowTimerController.R;
                        return (m) ((zgi.d) workflowTimerController.O.getValue()).f322134b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowTimerController.R;
                        qji.b bVarU2 = workflowTimerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_workflow_reminder_impl.ui.timer.di.WorkflowTimerControllerInjector");
                        zgi.c cVar = (zgi.c) bVarU2;
                        zgi.a aVar = cVar.f322130a;
                        zgi.c cVar2 = cVar.f322131b;
                        WorkflowTimerControllerContract$InputData workflowTimerControllerContract$InputData = workflowTimerController.K;
                        workflowTimerControllerContract$InputData.getClass();
                        return new zgi.d(aVar, cVar2, workflowTimerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WorkflowTimerController.R;
                        WorkflowTimerController workflowTimerController2 = this.f135239b;
                        return dli.f.a(workflowTimerController2, (m) workflowTimerController2.L.getValue(), u.c(workflowTimerController2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new TimePickerDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fhi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowTimerController f135239b;

            {
                this.f135239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WorkflowTimerController workflowTimerController = this.f135239b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowTimerController.R;
                        return (m) ((zgi.d) workflowTimerController.O.getValue()).f322134b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowTimerController.R;
                        qji.b bVarU2 = workflowTimerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_workflow_reminder_impl.ui.timer.di.WorkflowTimerControllerInjector");
                        zgi.c cVar = (zgi.c) bVarU2;
                        zgi.a aVar = cVar.f322130a;
                        zgi.c cVar2 = cVar.f322131b;
                        WorkflowTimerControllerContract$InputData workflowTimerControllerContract$InputData = workflowTimerController.K;
                        workflowTimerControllerContract$InputData.getClass();
                        return new zgi.d(aVar, cVar2, workflowTimerControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WorkflowTimerController.R;
                        WorkflowTimerController workflowTimerController2 = this.f135239b;
                        return dli.f.a(workflowTimerController2, (m) workflowTimerController2.L.getValue(), u.c(workflowTimerController2.P), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        fhi.h uiState = (fhi.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f313668b.setHeaderModel(new lw0.a(uiState.f135245b, null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f313669c.setPrimaryButtonText(new TextLocalisedClause(R$string.fincrime_reminder_set, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f313669c.c()), null, new c(this, null, 0), 3);
        d3().f313669c.setSecondaryButtonText(new TextLocalisedClause(R$string.fincrime_reminder_cancel, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f313669c.d()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.p()), null, new f9d.c(this, (Continuation) null, 17), 3);
    }

    public final ygi.a d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ygi.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
