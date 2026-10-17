package com.revolut.feature_workflow_reminder_impl.ui.reminder;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_workflow_reminder_impl.R$string;
import com.revolut.feature_workflow_reminder_impl.ui.reminder.WorkflowReminderController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dhi.f;
import dhi.g;
import dhi.i;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zgi.b;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_workflow_reminder_impl/ui/reminder/WorkflowReminderController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldhi/f;", "Ldli/a;", "Ldhi/g;", "<init>", "()V", "feature_workflow_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowReminderController extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(WorkflowReminderController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final Object K;
    public final Object N;
    public final Object P;
    public final int L = R$layout.screen_recycler_navbar_bottomsheet;
    public final h M = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public WorkflowReminderController() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: dhi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowReminderController f114814b;

            {
                this.f114814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WorkflowReminderController workflowReminderController = this.f114814b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowReminderController.Q;
                        return (i) ((zgi.b) workflowReminderController.N.getValue()).f322129b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowReminderController.Q;
                        qji.b bVarU2 = workflowReminderController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_workflow_reminder_impl.ui.reminder.di.WorkflowReminderControllerInjector");
                        zgi.c cVar = (zgi.c) bVarU2;
                        zgi.a aVar = cVar.f322130a;
                        zgi.c cVar2 = cVar.f322131b;
                        zgi.b bVar = new zgi.b();
                        bVar.f322128a = e4m.b.b(new z52.q(aVar, cVar2, bVar, 1, 4));
                        bVar.f322129b = e4m.b.b(new z52.q(aVar, cVar2, bVar, 0, 4));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = WorkflowReminderController.Q;
                        WorkflowReminderController workflowReminderController2 = this.f114814b;
                        return dli.f.a(workflowReminderController2, (i) workflowReminderController2.K.getValue(), u.c(workflowReminderController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: dhi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowReminderController f114814b;

            {
                this.f114814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WorkflowReminderController workflowReminderController = this.f114814b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowReminderController.Q;
                        return (i) ((zgi.b) workflowReminderController.N.getValue()).f322129b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowReminderController.Q;
                        qji.b bVarU2 = workflowReminderController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_workflow_reminder_impl.ui.reminder.di.WorkflowReminderControllerInjector");
                        zgi.c cVar = (zgi.c) bVarU2;
                        zgi.a aVar = cVar.f322130a;
                        zgi.c cVar2 = cVar.f322131b;
                        zgi.b bVar = new zgi.b();
                        bVar.f322128a = e4m.b.b(new z52.q(aVar, cVar2, bVar, 1, 4));
                        bVar.f322129b = e4m.b.b(new z52.q(aVar, cVar2, bVar, 0, 4));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = WorkflowReminderController.Q;
                        WorkflowReminderController workflowReminderController2 = this.f114814b;
                        return dli.f.a(workflowReminderController2, (i) workflowReminderController2.K.getValue(), u.c(workflowReminderController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: dhi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowReminderController f114814b;

            {
                this.f114814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WorkflowReminderController workflowReminderController = this.f114814b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowReminderController.Q;
                        return (i) ((zgi.b) workflowReminderController.N.getValue()).f322129b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowReminderController.Q;
                        qji.b bVarU2 = workflowReminderController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_workflow_reminder_impl.ui.reminder.di.WorkflowReminderControllerInjector");
                        zgi.c cVar = (zgi.c) bVarU2;
                        zgi.a aVar = cVar.f322130a;
                        zgi.c cVar2 = cVar.f322131b;
                        zgi.b bVar = new zgi.b();
                        bVar.f322128a = e4m.b.b(new z52.q(aVar, cVar2, bVar, 1, 4));
                        bVar.f322129b = e4m.b.b(new z52.q(aVar, cVar2, bVar, 0, 4));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = WorkflowReminderController.Q;
                        WorkflowReminderController workflowReminderController2 = this.f114814b;
                        return dli.f.a(workflowReminderController2, (i) workflowReminderController2.K.getValue(), u.c(workflowReminderController2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.fincrime_reminder_remind_me, null, null, 14), null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new dhi.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
