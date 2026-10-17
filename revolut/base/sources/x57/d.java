package x57;

import ahe.y0;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.dialog.pocket_selection.FreelancerPocketSelectionScreen;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.ModalDestination;
import ct6.w;
import dsh.j;
import dsh.n;
import ip0.c2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s57.m;
import vkm.q;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o57.a f302916b;

    public d(w freelancerWidgetsClauseFactory, o57.a freelancerWidgetsProvider, zt6.b freelancerControllerProvider) {
        Intrinsics.checkNotNullParameter(freelancerControllerProvider, "freelancerControllerProvider");
        Intrinsics.checkNotNullParameter(freelancerWidgetsClauseFactory, "freelancerWidgetsClauseFactory");
        Intrinsics.checkNotNullParameter(freelancerWidgetsProvider, "freelancerWidgetsProvider");
        this.f302916b = freelancerWidgetsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "ProPockets")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        if (!Intrinsics.f(str, "ProPocketsSmall")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", str, "."));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(k(str), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        boolean zF = Intrinsics.f(widgetType, "ProPockets");
        o57.a aVar = this.f302916b;
        if (zF) {
            ((m) aVar).getClass();
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, widgetId, new TextLocalisedClause(R$string.freelancer_widget_pockets_title, null, null, 14), c2.CIRCLE);
        }
        if (!Intrinsics.f(widgetType, "ProPocketsSmall")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", widgetType, "."));
        }
        ((m) aVar).getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new AvatarWidgetLoadingDelegate.Model(widgetId, null, null);
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
        return mo3.a.g(q.Q(k(widgetType), new y0(27, this, id10, widgetType, config, (Continuation) null)), null, new x48.a(2), 1);
    }

    @Override // csh.e
    public final j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        FreelancerWidgetContext widgetContext2 = (FreelancerWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (Intrinsics.f(widgetType, "ProPocketsSmall")) {
            return new j(new TextLocalisedClause(R$string.freelancer_widget_pockets_customization_action_title, null, null, 14), new n(new FreelancerPocketSelectionScreen(), new dsh.q(inputConfig, 8)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        super.h(widgetContext2, widgetType, inputConfig);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, java.lang.String r7, dsh.e r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof x57.c
            if (r0 == 0) goto L13
            r0 = r9
            x57.c r0 = (x57.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            x57.c r0 = new x57.c
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f302914x
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
            dsh.e r8 = r0.f302913w
            java.lang.String r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r9)
            goto L4e
        L3c:
            yhm.o.b(r9)
            r0.u = r6
            r0.v = r7
            r0.f302913w = r8
            r0.z = r4
            java.lang.Object r9 = r5.c(r7, r0)
            if (r9 != r1) goto L4e
            goto L73
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2 = 0
            if (r9 == 0) goto L75
            vkm.y r6 = r5.j(r6, r7, r8)
            x48.a r7 = new x48.a
            r8 = 3
            r7.<init>(r8)
            jhi.b r6 = mo3.a.g(r6, r2, r7, r4)
            r0.u = r2
            r0.v = r2
            r0.f302913w = r2
            r0.z = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            return r6
        L75:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r6 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r7 = 3
            r6.<init>(r2, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x57.d.i(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final y j(String widgetId, String str, dsh.e eVar) {
        boolean zF = Intrinsics.f(str, "ProPockets");
        o57.a aVar = this.f302916b;
        if (zF) {
            m mVar = (m) aVar;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            return m.b(nim.a.u(new s57.f(mVar, widgetId, null), mVar.c()), new s57.a(mVar, widgetId, 10));
        }
        if (!Intrinsics.f(str, "ProPocketsSmall")) {
            throw new IllegalArgumentException(p.a.p("Not supported widget type: ", str, "."));
        }
        String strA = eVar != null ? eVar.a("PRO_POCKETS_SMALL_SELECTED_POCKET_ID") : null;
        m mVar2 = (m) aVar;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return m.b(nim.a.u(new s57.g(mVar2, widgetId, strA, null), mVar2.c()), new s57.a(mVar2, widgetId, 15));
    }

    public final Flow k(String str) {
        boolean zF = Intrinsics.f(str, "ProPockets");
        Continuation continuation = null;
        o57.a aVar = this.f302916b;
        if (zF) {
            m mVar = (m) aVar;
            mVar.getClass();
            return new v1(new s09.c(mVar, continuation, 13));
        }
        if (!Intrinsics.f(str, "ProPocketsSmall")) {
            return new go.g(Boolean.FALSE, 2);
        }
        m mVar2 = (m) aVar;
        mVar2.getClass();
        return new v1(new s09.c(mVar2, continuation, 13));
    }
}
