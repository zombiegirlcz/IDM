package jik;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jik.c a(com.revolut.feature.pricingplans.models.PricingPlanSubscription r10) {
        /*
            java.lang.String r0 = "subscription"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            hha.z r0 = r10.f81136m
            r1 = 0
            if (r0 == 0) goto L34
            hha.h0 r2 = r0.d
            hha.h0 r3 = hha.h0.PLAN_REFERRAL
            if (r2 != r3) goto L11
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L34
            org.joda.time.Period r0 = r0.f152375a
            if (r0 == 0) goto L34
            int r2 = r0.getYears()
            if (r2 > 0) goto L2c
            int r2 = r0.getMonths()
            if (r2 > 0) goto L2c
            int r2 = r0.getDays()
            if (r2 <= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L34
            jik.b r2 = new jik.b
            r2.<init>(r0)
            goto L35
        L34:
            r2 = r1
        L35:
            if (r2 == 0) goto L38
            return r2
        L38:
            hha.i0 r0 = r10.f81135l
            if (r0 == 0) goto Lb9
            hha.h0 r2 = r0.f152315h
            hha.h0 r3 = hha.h0.PLAN_REFERRAL
            if (r2 != r3) goto L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 == 0) goto Lb9
            org.joda.time.Period r2 = r0.f152311a
            if (r2 == 0) goto Lb9
            int r3 = r2.getYears()
            if (r3 > 0) goto L5e
            int r3 = r2.getMonths()
            if (r3 > 0) goto L5e
            int r3 = r2.getDays()
            if (r3 <= 0) goto L5d
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 == 0) goto Lb9
            hha.o r3 = r0.e
            if (r3 == 0) goto L68
            dj0.d r3 = r3.f152326a
            if (r3 != 0) goto L6a
        L68:
            dj0.d r3 = r0.d
        L6a:
            boolean r0 = r3.k()
            if (r0 == 0) goto L76
            jik.b r10 = new jik.b
            r10.<init>(r2)
            return r10
        L76:
            hha.o r10 = hha.s.c(r10)
            if (r10 == 0) goto Lac
            dj0.d r10 = r10.f152326a
            if (r10 != 0) goto L81
            goto Lac
        L81:
            xi0.b r0 = r10.f115083b
            xi0.b r4 = r3.f115083b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r4)
            if (r0 == 0) goto Lac
            long r4 = r10.f115082a
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto Lac
            long r8 = r3.f115082a
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto Lac
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 < 0) goto L9e
            goto Lac
        L9e:
            double r6 = (double) r8
            double r3 = (double) r4
            double r6 = r6 / r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 - r6
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            java.lang.Double r10 = java.lang.Double.valueOf(r3)
            goto Lad
        Lac:
            r10 = r1
        Lad:
            if (r10 == 0) goto Lb9
            double r0 = r10.doubleValue()
            jik.a r10 = new jik.a
            r10.<init>(r2, r0)
            return r10
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jik.d.a(com.revolut.feature.pricingplans.models.PricingPlanSubscription):jik.c");
    }
}
