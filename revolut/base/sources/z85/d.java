package z85;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.credit.loan.api.widget.LoanWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.y;
import w4l.h;
import y45.i;
import yui.v;
import z0f.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f320042b;

    public d(i loanProductInteractor, g loanInterestRateWidgetMapper) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanInterestRateWidgetMapper, "loanInterestRateWidgetMapper");
        this.f320042b = loanProductInteractor;
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
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new AvatarWidgetLoadingDelegate.Model(widgetId, null, null);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i((LoanWidgetContext) widgetContext, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(j(str, (LoanWidgetContext) widgetContext), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        LoanWidgetContext widgetContext2 = (LoanWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return j(id10, widgetContext2);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((LoanWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.credit.loan.api.widget.LoanWidgetContext r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof z85.b
            if (r0 == 0) goto L13
            r0 = r8
            z85.b r0 = (z85.b) r0
            int r1 = r0.f320039w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320039w = r1
            goto L1a
        L13:
            z85.b r0 = new z85.b
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320039w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)
            goto L80
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            y45.i r8 = r6.f320042b
            java.lang.String r7 = r7.getLoanId()
            efm.r r7 = y45.i.c(r8, r7)
            z0f.a0 r8 = new z0f.a0
            r2 = 28
            r8.<init>(r2)
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r8, r3)
            z55.w r8 = new z55.w
            r4 = 15
            r8.<init>(r4)
            z3e.a r4 = new z3e.a
            r5 = 24
            r4.<init>(r8, r5)
            efm.r r7 = r7.map(r4)
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            vkm.d r7 = rd0.e.b(r7)
            z6k.l r8 = new z6k.l
            r4 = 3
            r5 = 1
            r8.<init>(r4, r5, r2)
            z6e.g r4 = new z6e.g
            r4.<init>(r8, r2)
            zhm.h0 r8 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r8, r4)
            r0.f320039w = r3
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            java.lang.String r7 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.i(com.revolut.feature.credit.loan.api.widget.LoanWidgetContext, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final y j(String str, LoanWidgetContext loanWidgetContext) {
        r map = m70.a.g(this.f320042b.b(loanWidgetContext.getLoanId(), h.f294642c), null, new a0(27), 1).map(new z3e.a(new v(this, str, 8), 23));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.e(rd0.e.b(map), h0.f322473a, new z6e.g(new c(this, str, null), null));
    }
}
