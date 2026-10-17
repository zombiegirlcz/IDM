package s88;

import aw0.o9;
import b9d.k;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import f28.b0;
import ip0.c2;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import s6d.r;
import te8.z;
import vkm.q;
import w4l.h;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements b78.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bgc.e f260932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f260933c;
    public final hj8.a d;

    public d(bgc.e rewardsInteractor, t88.a juniorPerksWidgetMapper, z juniorProductInteractor, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(juniorPerksWidgetMapper, "juniorPerksWidgetMapper");
        Intrinsics.checkNotNullParameter(juniorProductInteractor, "juniorProductInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f260932b = rewardsInteractor;
        this.f260933c = juniorProductInteractor;
        this.d = juniorProfileInteractor;
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
        ContactsWidgetDelegate.Model.Companion companion = ContactsWidgetDelegate.Model.INSTANCE;
        m70.a.c(t0.f186434a);
        return ContactsWidgetDelegate.Model.Companion.b(companion, id10, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), c2.CIRCLE);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return k((HomeFeedWidgetContext.Junior) widgetContext, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(l(str, (HomeFeedWidgetContext.Junior) widgetContext), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return l(id10, widgetContext2);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Junior) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s88.a
            if (r0 == 0) goto L13
            r0 = r7
            s88.a r0 = (s88.a) r0
            int r1 = r0.f260928w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260928w = r1
            goto L18
        L13:
            s88.a r0 = new s88.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260928w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            bgc.e r7 = r5.f260932b
            r2 = 2
            efm.r r6 = bgc.e.c(r7, r6, r2)
            s6d.r r7 = new s6d.r
            r2 = 18
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            s6e.g r7 = new s6e.g
            r2 = 19
            r7.<init>(r2)
            s65.o r2 = new s65.o
            r4 = 10
            r2.<init>(r7, r4)
            efm.r r6 = r6.map(r2)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            efm.r r6 = ue0.e.E(r6, r7)
            vkm.d r6 = rd0.e.b(r6)
            r0.f260928w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            java.lang.String r6 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s88.d.i(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s88.b
            if (r0 == 0) goto L13
            r0 = r7
            s88.b r0 = (s88.b) r0
            int r1 = r0.f260929w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260929w = r1
            goto L18
        L13:
            s88.b r0 = new s88.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260929w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r7 = 0
            r2 = 6
            te8.z r4 = r5.f260933c
            efm.r r6 = te8.z.b(r4, r6, r7, r2)
            s6d.r r7 = new s6d.r
            r2 = 19
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            s6e.g r7 = new s6e.g
            r2 = 20
            r7.<init>(r2)
            s65.o r2 = new s65.o
            r4 = 11
            r2.<init>(r7, r4)
            efm.r r6 = r6.map(r2)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            vkm.d r6 = rd0.e.b(r6)
            r0.f260929w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r6 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s88.d.j(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Junior r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s88.c
            if (r0 == 0) goto L13
            r0 = r7
            s88.c r0 = (s88.c) r0
            int r1 = r0.f260931x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260931x = r1
            goto L1a
        L13:
            s88.c r0 = new s88.c
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260931x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Junior r6 = r0.u
            yhm.o.b(r7)
            goto L4c
        L3a:
            yhm.o.b(r7)
            java.lang.String r7 = r6.getJuniorId()
            r0.u = r6
            r0.f260931x = r4
            java.lang.Object r7 = r5.j(r7, r0)
            if (r7 != r1) goto L4c
            goto L63
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L65
            java.lang.String r6 = r6.getJuniorId()
            r7 = 0
            r0.u = r7
            r0.f260931x = r3
            java.lang.Object r6 = r5.i(r6, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            return r6
        L65:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s88.d.k(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Junior, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jhi.b l(String str, HomeFeedWidgetContext.Junior junior) {
        return mo3.a.f(u0.m(rd0.e.b(bgc.e.c(this.f260932b, junior.getJuniorId(), 2)), hj8.a.a(this.d, junior.getJuniorId(), h.f294642c)), new b0(this, str, 20), new k(11, str, this), new r(17));
    }
}
