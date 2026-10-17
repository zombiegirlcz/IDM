package z28;

import ael.h0;
import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import z0f.a0;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f319025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f319026c;
    public final n28.d d;

    public q(r dataProvider, z mapper, n28.d widgetAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        this.f319025b = dataProvider;
        this.f319026c = mapper;
        this.d = widgetAvailabilityProvider;
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
        return AvatarGridWidgetDelegate.Model.Companion.d(AvatarGridWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_products_header_title, null, null, 14));
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((InvestWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6, java.lang.String r7, java.lang.String r8, dsh.e r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof z28.m
            if (r0 == 0) goto L13
            r0 = r10
            z28.m r0 = (z28.m) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            z28.m r0 = new z28.m
            gim.c r10 = (gim.c) r10
            r0.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r0.f319020y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r8 = r0.f319019x
            java.lang.String r7 = r0.f319018w
            com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6 = r0.v
            z28.q r9 = r0.u
            yhm.o.b(r10)
            goto L5c
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L5f
            r0.u = r5
            r0.v = r6
            r0.f319018w = r7
            r0.f319019x = r8
            r0.A = r4
            dsh.d r9 = dsh.e.Companion
            r9.getClass()
            dsh.e r10 = dsh.d.a()
            if (r10 != r1) goto L5b
            goto L76
        L5b:
            r9 = r5
        L5c:
            dsh.e r10 = (dsh.e) r10
            goto L61
        L5f:
            r10 = r9
            r9 = r5
        L61:
            kotlinx.coroutines.flow.Flow r6 = r9.g(r6, r7, r8, r10)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f319018w = r7
            r0.f319019x = r7
            r0.A = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z28.q.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.invest_feed.api.models.InvestWidgetContext r3, java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r2 = this;
            boolean r3 = r5 instanceof z28.n
            if (r3 == 0) goto L13
            r3 = r5
            z28.n r3 = (z28.n) r3
            int r4 = r3.f319021w
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f319021w = r4
            goto L1a
        L13:
            z28.n r3 = new z28.n
            gim.c r5 = (gim.c) r5
            r3.<init>(r2, r5)
        L1a:
            java.lang.Object r4 = r3.u
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r0 = r3.f319021w
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            yhm.o.b(r4)
            goto L3f
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            yhm.o.b(r4)
            r3.f319021w = r1
            n28.d r4 = r2.d
            java.lang.Object r4 = r4.f(r3)
            if (r4 != r5) goto L3f
            return r5
        L3f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            r3 = r3 ^ r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z28.q.e(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r rVar = this.f319025b;
        return rd0.e.e(new wc7.e(mo3.a.g(nim.a.v(u0.i(tzg.m.c(rVar.f319028b, null, cfl.k.f23744a, 1), ((h0) rVar.f319027a).d(), rVar.d.b()), new z2.a(rVar, 2)), null, new a0(10), 1), 15, this, id10), zhm.h0.f322473a, new p(this, id10, null));
    }
}
