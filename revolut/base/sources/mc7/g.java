package mc7;

import ahe.y0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import dsh.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lu6.p;
import m9d.j1;
import vkm.q;
import xnd.n;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lmd.d f204302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wif.a f204303c;

    public g(lmd.d cashflowAnalyticsTilesInteractor, wif.a userFeaturesChecker) {
        Intrinsics.checkNotNullParameter(cashflowAnalyticsTilesInteractor, "cashflowAnalyticsTilesInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        this.f204302b = cashflowAnalyticsTilesInteractor;
        this.f204303c = userFeaturesChecker;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(rd0.e.b(this.f204303c.d(wog.a.ANALYTICS)), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "CashflowSmall")) {
            return new TileLoadingWidgetDelegate.Model(6, (Clause) null, id10);
        }
        throw new IllegalArgumentException(j6.a.q("Unknown analytics widget type ", widgetType));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i((CashflowWidgetContext) widgetContext, str, str2, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CashflowWidgetContext widgetContext2 = (CashflowWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(rd0.e.b(this.f204303c.d(wog.a.ANALYTICS)), new y0(16, this, id10, widgetType, widgetContext2, (Continuation) null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CashflowWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext r6, java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof mc7.f
            if (r0 == 0) goto L13
            r0 = r9
            mc7.f r0 = (mc7.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            mc7.f r0 = new mc7.f
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f204300x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r8 = r0.f204299w
            java.lang.String r7 = r0.v
            com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext r6 = r0.u
            yhm.o.b(r9)
            goto L4e
        L3c:
            yhm.o.b(r9)
            r0.u = r6
            r0.v = r7
            r0.f204299w = r8
            r0.z = r4
            java.lang.Object r9 = r5.c(r8, r0)
            if (r9 != r1) goto L4e
            goto L69
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2 = 0
            if (r9 == 0) goto L6b
            jhi.b r6 = r5.j(r7, r8, r6)
            r0.u = r2
            r0.v = r2
            r0.f204299w = r2
            r0.z = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r6
        L6b:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r6 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r7 = 3
            r6.<init>(r2, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mc7.g.i(com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final jhi.b j(String widgetId, String str, CashflowWidgetContext cashflowWidgetContext) {
        if (!Intrinsics.f(str, "CashflowSmall")) {
            throw new IllegalArgumentException(j6.a.q("Unknown analytics widget type ", str));
        }
        AnalyticsAccount analyticsAccount = cashflowWidgetContext.getAnalyticsAccount();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        lmd.d dVar = this.f204302b;
        n nVar = dVar.e;
        AnalyticsAccountsSelection.INSTANCE.getClass();
        return mo3.a.g(nim.a.A(rd0.e.e(boh.f.e(u0.m(nVar.a(AnalyticsAccountsSelection.Companion.a(analyticsAccount)), nim.a.v(q.q(eqj.d.d(dVar.f196953a)), new lk4.g(dVar, 13))), new li8.n(dVar, 3, widgetId, analyticsAccount)), h0.f322473a, new lmd.b(3, null)), new p(16, widgetId, this)), null, new j1(13), 1);
    }
}
