package i7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import hy1.b0;
import i2l.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import vkm.q;
import w4l.h;
import ypg.p;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f159279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f159280c;
    public final g d;
    public final hj8.a e;
    public final gte.a f;

    public d(ppg.b vaultsInteractor, ang.f userInteractor, g goalsWidgetMapper, hj8.a juniorProfileInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(goalsWidgetMapper, "goalsWidgetMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f159279b = vaultsInteractor;
        this.f159280c = userInteractor;
        this.d = goalsWidgetMapper;
        this.e = juniorProfileInteractor;
        this.f = featureToggleInteractor;
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
        Intrinsics.checkNotNullParameter(id10, "id");
        return new GoalProgressLoadingWidgetDelegate.Model(id10, new TextLocalisedClause(R$string.vaults_goal_widget_title, null, null, 14), null, 28);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        VaultWidgetContext vaultWidgetContext = (VaultWidgetContext) widgetContext;
        nib.c.Companion.getClass();
        return !nib.b.d.contains(vaultWidgetContext.f74721b.getF74730a()) ? i(vaultWidgetContext.f74721b.getF74730a(), eVar) : Boolean.FALSE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(j((VaultWidgetContext) widgetContext, str), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        VaultWidgetContext widgetContext2 = (VaultWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return j(widgetContext2, id10);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((VaultWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof i7e.b
            if (r0 == 0) goto L13
            r0 = r8
            i7e.b r0 = (i7e.b) r0
            int r1 = r0.f159277w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159277w = r1
            goto L18
        L13:
            i7e.b r0 = new i7e.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159277w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L6d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            w4l.h r8 = w4l.h.f294642c
            ppg.b r2 = r6.f159279b
            ypg.p r2 = (ypg.p) r2
            efm.r r7 = r2.j(r7, r8)
            vkm.d r7 = rd0.e.b(r7)
            i30.a r8 = new i30.a
            r2 = 25
            r8.<init>(r6, r2)
            akg.n r7 = nim.a.v(r7, r8)
            i2l.n0 r8 = new i2l.n0
            r2 = 28
            r8.<init>(r2)
            r2 = 0
            jhi.b r7 = mo3.a.g(r7, r2, r8, r3)
            i23.c r8 = new i23.c
            r4 = 3
            r5 = 1
            r8.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f159277w = r3
            java.lang.Object r8 = vkm.q.z(r7, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L76
            boolean r7 = r8.booleanValue()
            goto L77
        L76:
            r7 = 0
        L77:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i7e.d.i(java.lang.String, gim.c):java.lang.Object");
    }

    public final b0 j(VaultWidgetContext vaultWidgetContext, String str) {
        Flow flowH;
        String f74730a = vaultWidgetContext.f74721b.getF74730a();
        p pVar = (p) this.f159279b;
        h hVar = h.f294642c;
        vkm.d dVarB = rd0.e.b(pVar.j(f74730a, hVar));
        vkm.d dVarB2 = rd0.e.b(this.f159280c.k(false));
        VaultWidgetContext.Type type = vaultWidgetContext.f74721b;
        Continuation continuation = null;
        if ((type instanceof VaultWidgetContext.Type.JuniorPockets) || (type instanceof VaultWidgetContext.Type.JuniorSavings)) {
            flowH = xam.a.h(new i13.d(this, continuation, 20), rd0.e.b(pVar.j(type.getF74730a(), hVar)));
        } else {
            i.Companion.getClass();
            flowH = new go.g(new Data(i.f224256b, null, false, 6, null), 2);
        }
        return new b0(mo3.a.g(u0.i(dVarB, dVarB2, flowH), null, new n0(27), 1), this, str, 6);
    }
}
