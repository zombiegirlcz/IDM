package mga;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205211a;

    public n(String str) {
        this.f205211a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof mga.n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mga.n r4 = (mga.n) r4
            java.lang.String r4 = r4.f205211a
            java.lang.String r1 = r3.f205211a
            if (r1 != 0) goto L18
            if (r4 != 0) goto L16
            r4 = r0
            goto L1f
        L16:
            r4 = r2
            goto L1f
        L18:
            if (r4 != 0) goto L1b
            goto L16
        L1b:
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
        L1f:
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mga.n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f205211a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
