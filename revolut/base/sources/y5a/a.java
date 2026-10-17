package y5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311016b;

    public a(String query, String str) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f311015a = query;
        this.f311016b = str;
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
            boolean r1 = r5 instanceof y5a.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            y5a.a r5 = (y5a.a) r5
            java.lang.String r1 = r4.f311015a
            java.lang.String r3 = r5.f311015a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r5 = r5.f311016b
            java.lang.String r1 = r4.f311016b
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
        throw new UnsupportedOperationException("Method not decompiled: y5a.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f311015a.hashCode() * 31;
        String str = this.f311016b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
