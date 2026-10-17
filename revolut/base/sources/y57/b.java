package y57;

import akg.n;
import au6.k1;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import cxe.u;
import dsh.j;
import et6.p1;
import ip0.c2;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nr6.b0;
import nr6.c0;
import s57.h;
import s57.m;
import sr6.k;
import vkm.q;
import w4l.i;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o57.a f310996b;

    public b(o57.a freelancerWidgetsProvider) {
        Intrinsics.checkNotNullParameter(freelancerWidgetsProvider, "freelancerWidgetsProvider");
        this.f310996b = freelancerWidgetsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "ProSales")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", str, "."));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        m mVar = (m) this.f310996b;
        mVar.getClass();
        return q.x(mVar.a(), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "ProSales")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", widgetType, "."));
        }
        ((m) this.f310996b).getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, widgetId, new TextLocalisedClause(R$string.freelancer_widget_sales_header_title, null, null, 14), c2.CIRCLE);
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
        m mVar = (m) this.f310996b;
        mVar.getClass();
        return mo3.a.g(q.Q(mVar.a(), new x4k.c((Continuation) null, this, id10, widgetType, 2)), null, new y13.a(21), 1);
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
            boolean r7 = r8 instanceof y57.a
            if (r7 == 0) goto L13
            r7 = r8
            y57.a r7 = (y57.a) r7
            int r0 = r7.f310995y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f310995y = r0
            goto L18
        L13:
            y57.a r7 = new y57.a
            r7.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r7.f310993w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f310995y
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
            r7.f310995y = r3
            java.lang.Object r8 = r4.c(r6, r7)
            if (r8 != r0) goto L4a
            goto L6e
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L70
            cxe.u r5 = r4.j(r5, r6)
            y13.a r6 = new y13.a
            r8 = 22
            r6.<init>(r8)
            jhi.b r5 = mo3.a.g(r5, r1, r6, r3)
            r7.u = r1
            r7.v = r1
            r7.f310995y = r2
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
        throw new UnsupportedOperationException("Method not decompiled: y57.b.i(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final u j(String widgetId, String str) {
        if (!Intrinsics.f(str, "ProSales")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", str, "."));
        }
        m mVar = (m) this.f310996b;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        n nVarV = nim.a.v(mVar.f260031a.t(new AcquiringOrderFilter.Status(y0.b(c0.PAID)), new b0(false), new gr6.c(i.f294643c)), new s4b.e(22));
        p1 p1Var = mVar.f260034g;
        k query = new k(false, null, 30);
        Intrinsics.checkNotNullParameter(query, "query");
        return nim.a.A(m.b(nim.a.u(new h(mVar, widgetId, null), u0.i(nVarV, rd0.e.b(((k1) p1Var.f129298b).c(query, true)), mVar.f260036j.c())), new s57.a(mVar, widgetId, 0)), new s57.a(mVar, widgetId, 1));
    }
}
