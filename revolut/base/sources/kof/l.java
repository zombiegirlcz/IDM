package kof;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xi0.b f186352c;
    public static final dj0.d d;
    public static final BigInteger e;
    public static final BigInteger f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f186353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f186354b;

    static {
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306273h;
        f186352c = bVar;
        d = new dj0.d(50000L, bVar);
        e = BigInteger.valueOf(100L);
        f = BigInteger.valueOf(20L);
    }

    public l(l80.e dateProvider, ppk.f ratesInteractor, wzi.a incomeSorterInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        this.f186353a = dateProvider;
        this.f186354b = ratesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kof.b a(tof.a3 r5, dj0.d r6, kof.a r7) {
        /*
            r4 = this;
            org.joda.time.DateTime r0 = r5.f272596j
            if (r0 != 0) goto L6
            goto L79
        L6:
            long r0 = r0.getMillis()
            l80.e r2 = r4.f186353a
            l80.f r2 = (l80.f) r2
            org.joda.time.DateTime r3 = new org.joda.time.DateTime
            r3.<init>(r0)
            org.joda.time.LocalDate r0 = r3.toLocalDate()
            org.joda.time.DateTime r1 = r2.g()
            r2 = 3
            org.joda.time.DateTime r1 = r1.minusMonths(r2)
            org.joda.time.LocalDate r1 = r1.toLocalDate()
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L79
            if (r6 != 0) goto L2d
            goto L79
        L2d:
            dj0.d r5 = r5.k
            xi0.b r0 = r6.f115083b
            xi0.b r1 = r5.f115083b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L3a
            goto L79
        L3a:
            long r0 = r6.f115082a
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r6 = r6.abs()
            long r0 = r5.f115082a
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r5 = r5.abs()
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.lang.String r0 = "PERCENTAGE_MULTIPLIER"
            java.math.BigInteger r1 = kof.l.e
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.math.BigInteger r6 = r6.multiply(r1)
            java.lang.String r0 = "multiply(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            kotlin.jvm.internal.Intrinsics.h(r5)
            java.lang.String r1 = "MIN_CURRENT_BALANCE_TRANSACTION_AMOUNT_PERCENTAGE"
            java.math.BigInteger r2 = kof.l.f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.math.BigInteger r5 = r5.multiply(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            int r5 = r6.compareTo(r5)
            if (r5 < 0) goto L79
            goto L7b
        L79:
            kof.a r7 = kof.a.ACTION_BUTTON
        L7b:
            kof.b r5 = new kof.b
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kof.l.a(tof.a3, dj0.d, kof.a):kof.b");
    }
}
