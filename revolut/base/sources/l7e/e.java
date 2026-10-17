package l7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import k25.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l2c.v;
import s6e.b0;
import s6e.z;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f192568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f192569c;
    public final j d;
    public final g6e.b e;
    public final gte.a f;

    public e(g6e.d subaccountInteractor, b0 subaccountLinkInteractor, j mapper, g6e.b subaccountBackgroundInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(subaccountLinkInteractor, "subaccountLinkInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f192568b = subaccountInteractor;
        this.f192569c = subaccountLinkInteractor;
        this.d = mapper;
        this.e = subaccountBackgroundInteractor;
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
        return new PaymentLinkWidgetLoadingDelegate.Model(new TextLocalisedClause(R$string.pocket_link_widget_title, null, null, 14), id10);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i((HomeFeedWidgetContext.PersonalPocket) widgetContext, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        throw new IllegalStateException(a0.d.r(str2, " doesn't support the catalogue preview mode"));
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.PersonalPocket widgetContext2 = (HomeFeedWidgetContext.PersonalPocket) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return rd0.e.e(q.Q(mo3.a.g(((z) this.f192568b).u(widgetContext2.getSubaccountId()), null, new v(18), 1), new o(null, this, id10, 10)), h0.f322473a, new c(this, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.PersonalPocket) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.PersonalPocket r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l7e.a
            if (r0 == 0) goto L13
            r0 = r7
            l7e.a r0 = (l7e.a) r0
            int r1 = r0.f192561w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192561w = r1
            goto L18
        L13:
            l7e.a r0 = new l7e.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192561w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L5f
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            com.revolut.feature.subaccount.api.SubaccountApi$Toggles$PersonalPocketLink r7 = com.revolut.feature.subaccount.api.SubaccountApi$Toggles.PersonalPocketLink.f88945c
            gte.a r2 = r5.f
            jte.d r2 = (jte.d) r2
            boolean r7 = r2.c(r7)
            if (r7 == 0) goto L6e
            java.lang.String r6 = r6.getSubaccountId()
            g6e.d r7 = r5.f192568b
            s6e.z r7 = (s6e.z) r7
            vkm.d r6 = r7.u(r6)
            l2c.v r7 = new l2c.v
            r2 = 17
            r7.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)
            r0.f192561w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            com.revolut.feature.subaccount.api.models.Subaccount r7 = (com.revolut.feature.subaccount.api.models.Subaccount) r7
            if (r7 == 0) goto L67
            xi0.b r4 = r7.getCurrency()
        L67:
            boolean r6 = cp5.d.A(r4)
            if (r6 == 0) goto L6e
            goto L6f
        L6e:
            r3 = 0
        L6f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l7e.e.i(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$PersonalPocket, gim.c):java.lang.Object");
    }
}
