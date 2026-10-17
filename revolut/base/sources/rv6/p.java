package rv6;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr6.j f257706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr6.n f257707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f257708c;
    public final BigDecimal d;
    public final whf.p e;
    public final whf.p f;

    public p(rr6.j cashbackInfo, rr6.n currentPlanInfo, List cashbackPlansToUpgrade, BigDecimal bigDecimal, whf.p transactions, whf.p payouts) {
        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
        Intrinsics.checkNotNullParameter(currentPlanInfo, "currentPlanInfo");
        Intrinsics.checkNotNullParameter(cashbackPlansToUpgrade, "cashbackPlansToUpgrade");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(payouts, "payouts");
        this.f257706a = cashbackInfo;
        this.f257707b = currentPlanInfo;
        this.f257708c = cashbackPlansToUpgrade;
        this.d = bigDecimal;
        this.e = transactions;
        this.f = payouts;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
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
            boolean r1 = r5 instanceof rv6.p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rv6.p r5 = (rv6.p) r5
            rr6.j r1 = r4.f257706a
            rr6.j r3 = r5.f257706a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            rr6.n r1 = r4.f257707b
            rr6.n r3 = r5.f257707b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.f257708c
            java.util.List r3 = r5.f257708c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.math.BigDecimal r1 = r5.d
            java.math.BigDecimal r3 = r4.d
            if (r3 != 0) goto L39
            if (r1 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r1 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            whf.p r1 = r4.e
            whf.p r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            whf.p r1 = r4.f
            whf.p r5 = r5.f
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L59
            return r2
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv6.p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iD = p.a.d((this.f257707b.hashCode() + (this.f257706a.hashCode() * 31)) * 31, 31, this.f257708c);
        BigDecimal bigDecimal = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31)) * 31);
    }
}
