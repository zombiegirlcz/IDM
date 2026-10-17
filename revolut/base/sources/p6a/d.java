package p6a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SearchInBlockController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SearchInBlockController searchInBlockController, Continuation continuation) {
        super(2, continuation);
        this.v = searchInBlockController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            com.revolut.core.ui_kit.delegates.FullScreenStateDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.FullScreenStateDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockController r6 = r5.v
            p6a.f r6 = r6.R2()
            java.lang.String r0 = r0.f52373a
            com.revolut.feature.payments_migration.impl.ui.screen.search.b r6 = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) r6
            r6.getClass()
            d6a.m r1 = r6.f80292r
            java.lang.String r2 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            int r2 = r0.hashCode()
            r3 = -1885105942(0xffffffff8fa390ea, float:-1.612886E-29)
            java.lang.String r4 = "query"
            if (r2 == r3) goto L55
            r3 = -1177926256(0xffffffffb9ca4590, float:-3.858027E-4)
            if (r2 == r3) goto L4c
            r6 = 1124553499(0x4307531b, float:135.32463)
            if (r2 == r6) goto L33
            goto L5d
        L33:
            java.lang.String r6 = "LIST_ID_NO_RESULTS"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L5d
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            vkm.z1 r0 = r1.f111478b
            r0.k(r6)
            goto L8f
        L4c:
            java.lang.String r2 = "LIST_ID_NO_CONNECTION_ERROR_ITEM"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L73
            goto L5d
        L55:
            java.lang.String r2 = "LIST_ID_ERROR_ITEM_LIST_ID"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L73
        L5d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported listId: "
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            goto L8f
        L73:
            cli.y r6 = r6.u
            java.lang.Object r6 = r6.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            p6a.e r6 = (p6a.e) r6
            java.lang.String r6 = r6.f233237b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            vkm.z1 r0 = r1.f111478b
            r0.k(r6)
        L8f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p6a.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
