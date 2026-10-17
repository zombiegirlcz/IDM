package mga;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205202b;

    public b0(String str, String str2) {
        this.f205201a = str;
        this.f205202b = str2;
    }

    @Override // mga.c0
    public final String a() {
        return this.f205201a;
    }

    @Override // mga.c0
    public final String b() {
        return this.f205202b;
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
            boolean r1 = r5 instanceof mga.b0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mga.b0 r5 = (mga.b0) r5
            java.lang.String r1 = r5.f205201a
            java.lang.String r3 = r4.f205201a
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
            java.lang.String r1 = r4.f205202b
            java.lang.String r5 = r5.f205202b
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mga.b0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f205201a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205202b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
