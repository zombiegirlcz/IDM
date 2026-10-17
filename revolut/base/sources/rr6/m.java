package rr6;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f256721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f256722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f256723c;

    public m(BigDecimal flatRate, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(flatRate, "flatRate");
        this.f256721a = flatRate;
        this.f256722b = bigDecimal;
        bigDecimal = bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
        Intrinsics.h(bigDecimal);
        BigDecimal value = flatRate.add(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(value, "add(...)");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f256723c = value;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof rr6.m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rr6.m r5 = (rr6.m) r5
            java.math.BigDecimal r1 = r4.f256721a
            java.math.BigDecimal r3 = r5.f256721a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.math.BigDecimal r5 = r5.f256722b
            java.math.BigDecimal r1 = r4.f256722b
            if (r1 != 0) goto L23
            if (r5 != 0) goto L21
            r5 = r0
            goto L2a
        L21:
            r5 = r2
            goto L2a
        L23:
            if (r5 != 0) goto L26
            goto L21
        L26:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L2a:
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rr6.m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f256721a.hashCode() * 31;
        BigDecimal bigDecimal = this.f256722b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
