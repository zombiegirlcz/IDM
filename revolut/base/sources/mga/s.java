package mga;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205219c;

    public s(String str, String str2, String str3) {
        this.f205217a = str;
        this.f205218b = str2;
        this.f205219c = str3;
    }

    @Override // mga.t
    public final String a() {
        return this.f205217a;
    }

    @Override // mga.t
    public final String b() {
        return this.f205218b;
    }

    @Override // mga.t
    public final String c() {
        return this.f205219c;
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
            boolean r1 = r5 instanceof mga.s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mga.s r5 = (mga.s) r5
            java.lang.String r1 = r5.f205217a
            java.lang.String r3 = r4.f205217a
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
            java.lang.String r1 = r4.f205218b
            java.lang.String r3 = r5.f205218b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f205219c
            java.lang.String r5 = r5.f205219c
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mga.s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f205217a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205218b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f205219c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
