package zdb;

import cli.y;
import org.jetbrains.annotations.NotNull;
import wdb.n;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements dli.b {

    @NotNull
    private static final g Companion = new g();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f321440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f321441q;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(zdb.e r8, wdb.n r9, l80.e r10, zdb.j r11) {
        /*
            r7 = this;
            java.lang.String r0 = "inputData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "reservationsInteractor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "dateProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "stateMapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r7.<init>()
            r7.o = r8
            r7.f321440p = r9
            zdb.d r2 = new zdb.d
            com.revolut.feature.retail.restaurants.impl.domain.model.Reservation r8 = r8.f321435a
            l80.f r10 = (l80.f) r10
            java.time.Instant r9 = r10.b()
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
            java.lang.String r10 = "now"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            com.revolut.feature.retail.restaurants.impl.domain.model.Reservation$Guarantee r10 = r8.i
            int r0 = r8.f
            if (r10 != 0) goto L39
            xdb.i r8 = xdb.i.f304395a
            goto Laa
        L39:
            com.revolut.feature.retail.restaurants.impl.domain.model.b r1 = r10.f82821a
            com.revolut.feature.retail.restaurants.impl.domain.model.b r3 = com.revolut.feature.retail.restaurants.impl.domain.model.b.UNKNOWN
            xdb.h r4 = xdb.h.f304394a
            if (r1 != r3) goto L44
        L41:
            r8 = r4
            goto Laa
        L44:
            com.revolut.feature.retail.restaurants.impl.domain.model.c r1 = r10.f82822b
            com.revolut.feature.retail.restaurants.impl.domain.model.c r3 = com.revolut.feature.retail.restaurants.impl.domain.model.c.UNKNOWN
            if (r1 != r3) goto L4b
            goto L41
        L4b:
            java.time.Instant r3 = r8.f82817n
            r5 = 1
            if (r3 == 0) goto L55
            boolean r9 = r9.isBefore(r3)
            goto L56
        L55:
            r9 = r5
        L56:
            r3 = 3
            r6 = 2
            if (r9 == 0) goto L7c
            int[] r8 = com.revolut.feature.retail.restaurants.impl.domain.model.d.f82832a
            int r9 = r1.ordinal()
            r8 = r8[r9]
            if (r8 == r5) goto L72
            if (r8 == r6) goto L6f
            if (r8 != r3) goto L69
            goto L41
        L69:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L6f:
            xdb.e r8 = xdb.e.f304390a
            goto Laa
        L72:
            xdb.g r8 = new xdb.g
            xdb.c r9 = com.revolut.feature.retail.restaurants.impl.domain.model.e.a(r10, r0)
            r8.<init>(r9)
            goto Laa
        L7c:
            xdb.c r9 = com.revolut.feature.retail.restaurants.impl.domain.model.e.a(r10, r0)
            if (r9 != 0) goto L83
            goto L41
        L83:
            java.time.Duration r8 = r8.o
            if (r8 != 0) goto L88
            goto L41
        L88:
            int[] r10 = com.revolut.feature.retail.restaurants.impl.domain.model.d.f82832a
            int r0 = r1.ordinal()
            r10 = r10[r0]
            if (r10 == r5) goto La4
            if (r10 == r6) goto L9d
            if (r10 != r3) goto L97
            goto L41
        L97:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L9d:
            xdb.d r10 = new xdb.d
            r10.<init>(r8, r9)
        La2:
            r8 = r10
            goto Laa
        La4:
            xdb.f r10 = new xdb.f
            r10.<init>(r8, r9)
            goto La2
        Laa:
            r2.<init>(r8)
            r5 = 0
            r6 = 12
            r4 = 0
            r1 = r7
            r3 = r11
            cli.y r8 = mra.d.b(r1, r2, r3, r4, r5, r6)
            r1.f321441q = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zdb.i.<init>(zdb.e, wdb.n, l80.e, zdb.j):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f321441q;
    }
}
