package mga;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205199b;

    public a0(String str, String str2) {
        this.f205198a = str;
        this.f205199b = str2;
    }

    @Override // mga.c0
    public final String a() {
        return this.f205198a;
    }

    @Override // mga.c0
    public final String b() {
        return this.f205199b;
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
            boolean r1 = r5 instanceof mga.a0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mga.a0 r5 = (mga.a0) r5
            java.lang.String r1 = r5.f205198a
            java.lang.String r3 = r4.f205198a
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
            java.lang.String r1 = r4.f205199b
            java.lang.String r5 = r5.f205199b
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mga.a0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f205198a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205199b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
