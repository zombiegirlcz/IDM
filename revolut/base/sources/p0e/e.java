package p0e;

import com.revolut.feature.statements.api.models.StatementProductType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementProductType f231516c;

    public e(StatementProductType productType, String str, String str2) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f231514a = str;
        this.f231515b = str2;
        this.f231516c = productType;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
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
            boolean r1 = r5 instanceof p0e.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p0e.e r5 = (p0e.e) r5
            java.lang.String r1 = r5.f231514a
            java.lang.String r3 = r4.f231514a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.f231515b
            java.lang.String r3 = r4.f231515b
            if (r3 != 0) goto L2e
            if (r1 != 0) goto L2c
            r1 = r0
            goto L35
        L2c:
            r1 = r2
            goto L35
        L2e:
            if (r1 != 0) goto L31
            goto L2c
        L31:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            com.revolut.feature.statements.api.models.StatementProductType r1 = r4.f231516c
            com.revolut.feature.statements.api.models.StatementProductType r5 = r5.f231516c
            if (r1 == r5) goto L3f
            return r2
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0e.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f231514a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f231515b;
        return this.f231516c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
