package icc;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ jf0.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, jf0.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            icc.e r5 = r4.u
            sri.m r0 = r5.f160242a
            gte.a r1 = r5.f160243b
            com.revolut.feature.store.api.declaration.StoreApi$Toggles$Store r2 = com.revolut.feature.store.api.declaration.StoreApi$Toggles$Store.f88419c
            r3 = r1
            jte.d r3 = (jte.d) r3
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L45
            eub.a r5 = r5.f160244c
            nyb.b r5 = (nyb.b) r5
            boolean r5 = r5.f()
            if (r5 == 0) goto L45
            com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles$RevolutPayPromotedMerchantsMigration r5 = com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles.RevolutPayPromotedMerchantsMigration.f84297c
            jte.d r1 = (jte.d) r1
            boolean r5 = r1.c(r5)
            if (r5 == 0) goto L45
            com.revolut.feature.store.api.navigation.StoreDestination r5 = new com.revolut.feature.store.api.navigation.StoreDestination
            com.revolut.feature.store.api.navigation.StoreDestination$StartType$OpenStoreHome r1 = new com.revolut.feature.store.api.navigation.StoreDestination$StartType$OpenStoreHome
            t1e.s r2 = t1e.s.REVPAY
            java.lang.String r2 = r2.c()
            com.revolut.feature.store.api.navigation.StoreTab$Brands r3 = com.revolut.feature.store.api.navigation.StoreTab.Brands.f88622a
            r1.<init>(r3, r2)
            r2 = 2
            r5.<init>(r1, r2)
            com.revolut.retail.core.navigation.FeatureCommand r5 = zh9.u0.f(r5)
            r0.c(r5)
            goto L67
        L45:
            com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination r5 = new com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination
            jf0.c r1 = r4.v
            java.util.HashMap r1 = r1.d
            java.lang.String r2 = "show_rev_points_opt_in"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination$InputData r2 = new com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination$InputData
            r3 = 1
            r2.<init>(r3, r3, r3, r1)
            r5.<init>(r2)
            com.revolut.retail.core.navigation.FeatureCommand r5 = zh9.u0.f(r5)
            r0.c(r5)
        L67:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: icc.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
