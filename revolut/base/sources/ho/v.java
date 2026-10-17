package ho;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154198b;

    public v(String str, String registeredIdentityId) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        this.f154197a = str;
        this.f154198b = registeredIdentityId;
    }

    @Override // ho.w
    public final String a() {
        return this.f154198b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
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
            boolean r1 = r5 instanceof ho.v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ho.v r5 = (ho.v) r5
            java.lang.String r1 = r5.f154197a
            java.lang.String r3 = r4.f154197a
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
            java.lang.String r1 = r4.f154198b
            java.lang.String r5 = r5.f154198b
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ho.v.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f154197a;
        return this.f154198b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
