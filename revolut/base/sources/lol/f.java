package lol;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197469c;

    public f(String str, boolean z, boolean z3) {
        this.f197467a = str;
        this.f197468b = z;
        this.f197469c = z3;
    }

    public static f a(f fVar, String str, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = fVar.f197467a;
        }
        if ((i & 2) != 0) {
            z = fVar.f197468b;
        }
        if ((i & 4) != 0) {
            z3 = fVar.f197469c;
        }
        fVar.getClass();
        return new f(str, z, z3);
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
            boolean r1 = r5 instanceof lol.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lol.f r5 = (lol.f) r5
            java.lang.String r1 = r5.f197467a
            java.lang.String r3 = r4.f197467a
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
            boolean r1 = r4.f197468b
            boolean r3 = r5.f197468b
            if (r1 == r3) goto L29
            return r2
        L29:
            boolean r1 = r4.f197469c
            boolean r5 = r5.f197469c
            if (r1 == r5) goto L30
            return r2
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lol.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f197467a;
        return Boolean.hashCode(this.f197469c) + j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f197468b);
    }
}
