package a67;

import a5g.l;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import et6.l0;
import go.g;
import ip0.a5;
import ip0.b5;
import java.util.ArrayList;
import koi.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import op0.s;
import s57.m;
import vkm.q;
import vkm.y;
import w4l.h;
import w4l.i;
import zh9.u0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o57.a f1555b;

    public d(o57.a freelancerWidgetsProvider) {
        Intrinsics.checkNotNullParameter(freelancerWidgetsProvider, "freelancerWidgetsProvider");
        this.f1555b = freelancerWidgetsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "ProTaxHub")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        m mVar = (m) this.f1555b;
        return q.x(((l0) mVar.f260032b).k() ? mVar.a() : new g(Boolean.FALSE, 2), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "ProTaxHub")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", widgetType, "."));
        }
        ((m) this.f1555b).getClass();
        Intrinsics.checkNotNullParameter(listId, "widgetId");
        Intrinsics.checkNotNullParameter(listId, "widgetId");
        CalendarListWidgetDelegate.Model.Companion companion = CalendarListWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause title = new TextLocalisedClause(R$string.freelancer_tax_hub_hub_title, null, null, 14);
        companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        s0 s0Var = new s0(2);
        s0Var.a(new s(yh5.b.a(title), false));
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            a5 a5Var = b5.Companion;
            String listId2 = String.valueOf(iNextInt);
            int i = R$attr.uikit_dp16;
            a5Var.getClass();
            Intrinsics.checkNotNullParameter(listId2, "listId");
            int i2 = R$attr.uikit_dp16;
            arrayList.add(new b5(listId2, i, i, i2, i2));
        }
        s0Var.b((b5[]) arrayList.toArray(new b5[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        return new CalendarListWidgetDelegate.Model(listId, v.k(arrayList2.toArray(new j[arrayList2.size()])), true, op0.q.DYNAMIC, new py0.c(title), null, 192);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, str2, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        FreelancerWidgetContext widgetContext2 = (FreelancerWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        m mVar = (m) this.f1555b;
        return mo3.a.g(q.Q(((l0) mVar.f260032b).k() ? mVar.a() : new g(Boolean.FALSE, 2), new c((Continuation) null, this, id10, widgetType, 0)), null, new l(3), 1);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
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
            boolean r7 = r8 instanceof a67.b
            if (r7 == 0) goto L13
            r7 = r8
            a67.b r7 = (a67.b) r7
            int r0 = r7.f1551y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f1551y = r0
            goto L18
        L13:
            a67.b r7 = new a67.b
            r7.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r7.f1549w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f1551y
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
            r7.f1551y = r3
            java.lang.Object r8 = r4.c(r6, r7)
            if (r8 != r0) goto L4a
            goto L6d
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto L6f
            vkm.y r5 = r4.j(r5, r6)
            a5g.l r6 = new a5g.l
            r8 = 4
            r6.<init>(r8)
            jhi.b r5 = mo3.a.g(r5, r1, r6, r3)
            r7.u = r1
            r7.v = r1
            r7.f1551y = r2
            java.lang.Object r5 = vkm.q.x(r5, r7)
            if (r5 != r0) goto L6e
        L6d:
            return r0
        L6e:
            return r5
        L6f:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r5 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r6 = 3
            r5.<init>(r1, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a67.d.i(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final y j(String widgetId, String str) {
        if (!Intrinsics.f(str, "ProTaxHub")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        m mVar = (m) this.f1555b;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        a61.a aVar = mVar.f260045w;
        i iVar = i.f294643c;
        return m.b(nim.a.v(u0.i(aVar.V(iVar), mVar.v.m0(null, iVar), mVar.f260047y.j(h.f294642c)), new s57.a(mVar, widgetId, 13)), new s57.a(mVar, widgetId, 14));
    }
}
