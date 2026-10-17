package g6a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MigrateSubscriptionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MigrateSubscriptionsController migrateSubscriptionsController, Continuation continuation) {
        super(2, continuation);
        this.v = migrateSubscriptionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            com.revolut.core.ui_kit.delegates.FullScreenStateDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.FullScreenStateDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsController r7 = r6.v
            g6a.g r7 = r7.R2()
            java.lang.String r0 = r0.f52373a
            com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c r7 = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) r7
            cli.y r1 = r7.v
            d6a.m r2 = r7.f80268s
            java.lang.String r3 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            int r3 = r0.hashCode()
            r4 = -1885105942(0xffffffff8fa390ea, float:-1.612886E-29)
            java.lang.String r5 = "query"
            if (r3 == r4) goto L62
            r4 = -1177926256(0xffffffffb9ca4590, float:-3.858027E-4)
            if (r3 == r4) goto L59
            r7 = 1124553499(0x4307531b, float:135.32463)
            if (r3 == r7) goto L32
            goto L6a
        L32:
            java.lang.String r7 = "LIST_ID_NO_RESULTS"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r1.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            g6a.f r7 = (g6a.f) r7
            boolean r7 = r7.d
            if (r7 == 0) goto Lae
            java.lang.String r7 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            vkm.z1 r0 = r2.f111478b
            r0.k(r7)
            goto Lae
        L59:
            java.lang.String r3 = "LIST_ID_NO_CONNECTION_ERROR_ITEM"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L80
            goto L6a
        L62:
            java.lang.String r3 = "LIST_ID_ERROR_ITEM_LIST_ID"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L80
        L6a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported listId: "
            java.lang.String r0 = r1.concat(r0)
            r7.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r7, r0)
            goto Lae
        L80:
            java.lang.Object r0 = r1.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            g6a.f r0 = (g6a.f) r0
            boolean r0 = r0.d
            if (r0 == 0) goto La9
            java.lang.Object r7 = r1.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            g6a.f r7 = (g6a.f) r7
            java.lang.String r7 = r7.e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            vkm.z1 r0 = r2.f111478b
            r0.k(r7)
            goto Lae
        La9:
            vii.b r7 = r7.u
            r7.a()
        Lae:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g6a.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
