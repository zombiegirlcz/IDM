package mga;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205210b;

    public k(String str, String str2) {
        this.f205209a = str;
        this.f205210b = str2;
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
            goto L2d
        L4:
            boolean r1 = r5 instanceof mga.k
            r2 = 0
            if (r1 != 0) goto La
            goto L2c
        La:
            mga.k r5 = (mga.k) r5
            java.lang.String r1 = r5.f205209a
            java.lang.String r3 = r4.f205209a
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
            boolean r1 = r3.equals(r1)
        L1f:
            if (r1 != 0) goto L22
            goto L2c
        L22:
            java.lang.String r1 = r4.f205210b
            java.lang.String r5 = r5.f205210b
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L2d
        L2c:
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mga.k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f205209a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205210b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
