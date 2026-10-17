package z57;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import dsh.d;
import dsh.j;
import go.g;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s57.m;
import vkm.q;
import vkm.y;
import z0f.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o57.a f319525b;

    public b(o57.a freelancerWidgetsProvider) {
        Intrinsics.checkNotNullParameter(freelancerWidgetsProvider, "freelancerWidgetsProvider");
        this.f319525b = freelancerWidgetsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "ProSalesAnalyticsSmall")) {
            dsh.e.Companion.getClass();
            return d.a();
        }
        if (!Intrinsics.f(str, "ProSalesAnalytics")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", str, "."));
        }
        dsh.e.Companion.getClass();
        return d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(k(str), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        boolean zF = Intrinsics.f(widgetType, "ProSalesAnalyticsSmall");
        o57.a aVar = this.f319525b;
        if (zF) {
            ((m) aVar).getClass();
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            return LineChartLoadingTileWidgetDelegate.Model.Companion.b(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, widgetId);
        }
        if (!Intrinsics.f(widgetType, "ProSalesAnalytics")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", widgetType, "."));
        }
        ((m) aVar).getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return LineChartLoadingTileWidgetDelegate.Model.Companion.a(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, widgetId);
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
        return mo3.a.g(q.Q(k(widgetType), new x4k.c((Continuation) null, this, id10, widgetType, 5)), null, new a0(16), 1);
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
            boolean r7 = r8 instanceof z57.a
            if (r7 == 0) goto L13
            r7 = r8
            z57.a r7 = (z57.a) r7
            int r0 = r7.f319524y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f319524y = r0
            goto L18
        L13:
            z57.a r7 = new z57.a
            r7.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r7.f319522w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f319524y
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
            r7.f319524y = r3
            java.lang.Object r8 = r4.c(r6, r7)
            if (r8 != r0) goto L4a
            goto L6e
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L70
            vkm.y r5 = r4.j(r5, r6)
            z0f.a0 r6 = new z0f.a0
            r8 = 17
            r6.<init>(r8)
            jhi.b r5 = mo3.a.g(r5, r1, r6, r3)
            r7.u = r1
            r7.v = r1
            r7.f319524y = r2
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
        throw new UnsupportedOperationException("Method not decompiled: z57.b.i(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final y j(String widgetId, String str) {
        boolean zF = Intrinsics.f(str, "ProSalesAnalyticsSmall");
        o57.a aVar = this.f319525b;
        if (zF) {
            m mVar = (m) aVar;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            return m.b(nim.a.v(hia.a.a(mVar.f260043s), new s57.a(mVar, widgetId, 8)), new s57.a(mVar, widgetId, 12));
        }
        if (!Intrinsics.f(str, "ProSalesAnalytics")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", str, "."));
        }
        m mVar2 = (m) aVar;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return m.b(nim.a.v(hia.a.a(mVar2.f260043s), new s57.a(mVar2, widgetId, 2)), new s57.a(mVar2, widgetId, 3));
    }

    public final Flow k(String str) {
        boolean zF = Intrinsics.f(str, "ProSalesAnalyticsSmall");
        o57.a aVar = this.f319525b;
        if (zF) {
            m mVar = (m) aVar;
            mVar.getClass();
            return mVar.a();
        }
        if (!Intrinsics.f(str, "ProSalesAnalytics")) {
            return new g(Boolean.FALSE, 2);
        }
        m mVar2 = (m) aVar;
        mVar2.getClass();
        return mVar2.a();
    }
}
