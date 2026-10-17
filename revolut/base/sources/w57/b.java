package w57;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import ct6.w;
import dsh.j;
import et6.l0;
import go.g;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s57.m;
import vkm.q;
import vkm.y;
import w4l.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o57.a f294723b;

    public b(o57.a freelancerWidgetsProvider) {
        Intrinsics.checkNotNullParameter(freelancerWidgetsProvider, "freelancerWidgetsProvider");
        this.f294723b = freelancerWidgetsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "ProPerks")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        m mVar = (m) this.f294723b;
        return q.x(((l0) mVar.f260032b).b("FREELANCER_PERKS") ? mVar.a() : new g(Boolean.FALSE, 2), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "ProPerks")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", widgetType, "."));
        }
        ((m) this.f294723b).getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return TileGridWidgetDelegate.Model.Companion.a(TileGridWidgetDelegate.Model.INSTANCE, widgetId, w.a());
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
        m mVar = (m) this.f294723b;
        return mo3.a.g(q.Q(((l0) mVar.f260032b).b("FREELANCER_PERKS") ? mVar.a() : new g(Boolean.FALSE, 2), new mki.d((Continuation) null, this, id10, widgetType, 27)), null, new w2.d(28), 1);
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
            boolean r7 = r8 instanceof w57.a
            if (r7 == 0) goto L13
            r7 = r8
            w57.a r7 = (w57.a) r7
            int r0 = r7.f294722y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f294722y = r0
            goto L18
        L13:
            w57.a r7 = new w57.a
            r7.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r7.f294720w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f294722y
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
            r7.f294722y = r3
            java.lang.Object r8 = r4.c(r6, r7)
            if (r8 != r0) goto L4a
            goto L6e
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L70
            vkm.y r5 = r4.j(r5, r6)
            w2.d r6 = new w2.d
            r8 = 29
            r6.<init>(r8)
            jhi.b r5 = mo3.a.g(r5, r1, r6, r3)
            r7.u = r1
            r7.v = r1
            r7.f294722y = r2
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
        throw new UnsupportedOperationException("Method not decompiled: w57.b.i(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final y j(String widgetId, String str) {
        if (!Intrinsics.f(str, "ProPerks")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        m mVar = (m) this.f294723b;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return m.b(boh.f.e(((et6.g) mVar.f260033c).d(h.f294642c), new s57.a(mVar, widgetId, 5)), new s57.a(mVar, widgetId, 6));
    }
}
