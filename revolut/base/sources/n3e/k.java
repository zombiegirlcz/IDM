package n3e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreOrdersSeeAllScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(StoreOrdersSeeAllScreen storeOrdersSeeAllScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeOrdersSeeAllScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.FullScreenStateDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.FullScreenStateDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen r5 = r4.v
            n3e.e r5 = r5.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.store.impl.ui.orders.see_all.a r5 = (com.revolut.feature.store.impl.ui.orders.see_all.a) r5
            r5.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = r0.f52373a
            int r1 = r0.hashCode()
            r2 = -2049865970(0xffffffff85d1870e, float:-1.9703877E-35)
            if (r1 == r2) goto L51
            r2 = -1663750825(0xffffffff9cd52d57, float:-1.4106878E-21)
            if (r1 == r2) goto L3c
            r2 = 352175823(0x14fdc6cf, float:2.5624888E-26)
            if (r1 == r2) goto L33
            goto L9f
        L33:
            java.lang.String r1 = "STORE_ORDERS_SEE_ALL_ERROR_GENERAL_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L9f
        L3c:
            java.lang.String r1 = "STORE_ORDERS_SEE_ALL_GIFT_CARDS_ERROR_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            goto L9f
        L45:
            kotlin.Lazy r5 = r5.f88721t
            java.lang.Object r5 = r5.getValue()
            vii.b r5 = (vii.b) r5
            r5.a()
            goto L9f
        L51:
            java.lang.String r1 = "STORE_ORDERS_SEE_ALL_ERROR_PAGE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9f
        L59:
            n3e.b r5 = r5.o
            n3e.c r5 = (n3e.c) r5
            ihm.b r0 = r5.f211991b
            java.lang.Object r1 = r0.f()
            lk0.g r1 = (lk0.g) r1
            if (r1 != 0) goto L68
            goto L9f
        L68:
            java.util.List r1 = r1.f196174a
            java.lang.Object r2 = zhm.d0.o0(r1)
            lk0.e r2 = (lk0.e) r2
            if (r2 != 0) goto L73
            goto L9f
        L73:
            java.lang.Throwable r2 = r2.e
            if (r2 != 0) goto L78
            goto L9f
        L78:
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto L87
            ihm.f r5 = r5.d
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r5.onNext(r0)
            goto L9f
        L87:
            int r2 = r1.size()
            int r2 = r2 - r3
            r3 = 0
            java.util.List r1 = r1.subList(r3, r2)
            lk0.g r1 = lk0.g.a(r1)
            r0.onNext(r1)
            ihm.f r5 = r5.f211992c
            lk0.h$b r0 = lk0.h.b.f196176a
            r5.onNext(r0)
        L9f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n3e.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
