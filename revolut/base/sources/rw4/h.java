package rw4;

import ard.c0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.n4;
import om4.x2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.n f257826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n4 f257827c;

    public h(al4.n creditCardInteractor, n4 securedCreditCardInteractor, o withdrawalWidgetMapper) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardInteractor, "securedCreditCardInteractor");
        Intrinsics.checkNotNullParameter(withdrawalWidgetMapper, "withdrawalWidgetMapper");
        this.f257826b = creditCardInteractor;
        this.f257827c = securedCreditCardInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return o.a(id10);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i((HomeFeedWidgetContext.Collateral) widgetContext, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        throw new IllegalStateException(a0.d.r(str2, " doesn't support the catalogue preview mode"));
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Collateral widgetContext2 = (HomeFeedWidgetContext.Collateral) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        String facilityId = widgetContext2.getFacilityId();
        x2 x2Var = (x2) this.f257826b;
        w4l.h hVar = w4l.h.f294642c;
        return rd0.e.e(new c0(new b(mo3.a.g(u0.m(x2Var.h(facilityId, hVar), this.f257827c.a(widgetContext2.getFacilityId(), hVar)), null, new ru5.m(14), 1), this, 1), this, widgetContext2, id10, 19), h0.f322473a, new g(this, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Collateral) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Collateral r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof rw4.c
            if (r0 == 0) goto L13
            r0 = r7
            rw4.c r0 = (rw4.c) r0
            int r1 = r0.f257821w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257821w = r1
            goto L18
        L13:
            rw4.c r0 = new rw4.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257821w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L65
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.String r6 = r6.getFacilityId()
            w4l.h r7 = w4l.h.f294642c
            om4.n4 r2 = r5.f257827c
            vkm.d r6 = r2.a(r6, r7)
            ru5.m r7 = new ru5.m
            r2 = 15
            r7.<init>(r2)
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r7, r3)
            rw4.b r7 = new rw4.b
            r4 = 0
            r7.<init>(r6, r5, r4)
            rw4.d r6 = new rw4.d
            r4 = 3
            r6.<init>(r4, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.e(r7, r2, r6)
            r0.f257821w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L6e
            boolean r6 = r7.booleanValue()
            goto L6f
        L6e:
            r6 = 0
        L6f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rw4.h.i(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Collateral, gim.c):java.lang.Object");
    }
}
