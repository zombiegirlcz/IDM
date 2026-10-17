package c67;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import cxe.u;
import dsh.j;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s57.m;
import vkm.q;
import vkm.y;
import zh9.u0;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o57.a f21692b;

    public b(o57.a freelancerWidgetsProvider) {
        Intrinsics.checkNotNullParameter(freelancerWidgetsProvider, "freelancerWidgetsProvider");
        this.f21692b = freelancerWidgetsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "ProVATReminder")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(((m) this.f21692b).d(), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "ProVATReminder")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", widgetType, "."));
        }
        ((m) this.f21692b).getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return RowsWidgetDelegate.Model.Companion.g(RowsWidgetDelegate.Model.INSTANCE, widgetId, new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_header_title, null, null, 14));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        return i(str, str2, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        FreelancerWidgetContext widgetContext2 = (FreelancerWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return mo3.a.g(q.Q(((m) this.f21692b).d(), new a67.c((Continuation) null, this, id10, widgetType, 10)), null, new c2f.m(9), 1);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((FreelancerWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, java.lang.String r6, dsh.e r7, gim.c r8) {
        /*
            r4 = this;
            boolean r7 = r8 instanceof c67.a
            if (r7 == 0) goto L13
            r7 = r8
            c67.a r7 = (c67.a) r7
            int r0 = r7.f21691y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f21691y = r0
            goto L18
        L13:
            c67.a r7 = new c67.a
            r7.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r7.f21689w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f21691y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.String r6 = r7.v
            java.lang.String r5 = r7.u
            yhm.o.b(r8)
            goto L4a
        L3a:
            yhm.o.b(r8)
            r7.u = r5
            r7.v = r6
            r7.f21691y = r3
            java.lang.Object r8 = r4.c(r6, r7)
            if (r8 != r0) goto L4a
            goto L6e
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L70
            vkm.y r5 = r4.j(r5, r6)
            c2f.m r6 = new c2f.m
            r8 = 10
            r6.<init>(r8)
            jhi.b r5 = mo3.a.g(r5, r1, r6, r3)
            r7.u = r1
            r7.v = r1
            r7.f21691y = r2
            java.lang.Object r5 = vkm.q.x(r5, r7)
            if (r5 != r0) goto L6f
        L6e:
            return r0
        L6f:
            return r5
        L70:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r5 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r6 = 3
            r5.<init>(r1, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c67.b.i(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final y j(String widgetId, String str) {
        if (!Intrinsics.f(str, "ProVATReminder")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        m mVar = (m) this.f21692b;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        i iVar = mVar.f260038m;
        w4l.i loadingStrategy = w4l.i.f294643c;
        u uVarA = nim.a.A(iVar.j(loadingStrategy), new s4b.e(25));
        r10.f fVar = mVar.f260046x;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return m.b(nim.a.v(u0.m(uVarA, nim.a.A(xam.a.h(new enb.f(fVar, null, 20), fVar.s0(loadingStrategy)), new s4b.e(26))), new s57.a(mVar, widgetId, 16)), new s57.a(mVar, widgetId, 17));
    }
}
