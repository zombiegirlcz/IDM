package d6b;

import kotlin.jvm.internal.Intrinsics;
import q5b.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements s5b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f111481a;

    public b(c cobrandsProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        this.f111481a = cobrandsProductAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d6b.a
            if (r0 == 0) goto L13
            r0 = r6
            d6b.a r0 = (d6b.a) r0
            int r1 = r0.f111480x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111480x = r1
            goto L18
        L13:
            d6b.a r0 = new d6b.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111480x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f111480x = r3
            q5b.c r6 = r4.f111481a
            c6b.p r6 = (c6b.p) r6
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L52
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$PlanHubDestination r5 = new com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$PlanHubDestination
            r6 = 0
            r5.<init>(r6)
            return r5
        L52:
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default r6 = new com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default
            r0 = 2
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d6b.b.a(java.lang.String, gim.c):java.lang.Object");
    }
}
