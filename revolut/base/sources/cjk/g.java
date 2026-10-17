package cjk;

import jgk.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements u {

    @NotNull
    public static final e Companion = new e();

    public g(d dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hha.o b(com.revolut.feature.pricingplans.models.PricingPlanSubscription r9, java.util.Date r10) {
        /*
            r8 = this;
            java.lang.String r0 = "subscription"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "nextBillingDate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            hha.i0 r0 = r9.f81135l
            org.joda.time.Period r1 = r9.d
            com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo r2 = r9.f81134j
            r3 = 0
            if (r2 == 0) goto L31
            long r4 = r10.getTime()
            java.lang.Long r6 = r2.e
            if (r6 != 0) goto L1c
            goto L31
        L1c:
            long r6 = r6.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L31
            hha.g r9 = r2.f81119b
            if (r9 == 0) goto L92
            long r0 = r10.getTime()
            hha.o r9 = r9.a(r0)
            return r9
        L31:
            if (r0 == 0) goto L62
            java.lang.Long r2 = r0.f152313c
            if (r2 == 0) goto L4b
            long r4 = r2.longValue()
            long r6 = r10.getTime()
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L4c
        L4b:
            r2 = r3
        L4c:
            boolean r2 = pd.b.k(r2)
            if (r2 == 0) goto L62
            hha.o r9 = r0.e
            if (r9 != 0) goto L61
            hha.n r9 = hha.o.Companion
            dj0.d r10 = r0.d
            r9.getClass()
            hha.o r9 = hha.n.a(r10)
        L61:
            return r9
        L62:
            java.util.List r9 = r9.i
            if (r1 != 0) goto L68
            r0 = r3
            goto L87
        L68:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r9.next()
            r2 = r0
            hha.g r2 = (hha.g) r2
            org.joda.time.Period r2 = r2.f152306a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r1)
            if (r2 == 0) goto L6e
            goto L85
        L84:
            r0 = r3
        L85:
            hha.g r0 = (hha.g) r0
        L87:
            if (r0 == 0) goto L92
            long r9 = r10.getTime()
            hha.o r9 = r0.a(r9)
            return r9
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cjk.g.b(com.revolut.feature.pricingplans.models.PricingPlanSubscription, java.util.Date):hha.o");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jgk.t c(com.revolut.feature.pricingplans.models.PricingPlanSubscription r21, java.util.List r22, hha.j r23, java.util.List r24, com.revolut.feature.pricingplans.models.family.FamilyPlanState r25) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cjk.g.c(com.revolut.feature.pricingplans.models.PricingPlanSubscription, java.util.List, hha.j, java.util.List, com.revolut.feature.pricingplans.models.family.FamilyPlanState):jgk.t");
    }
}
