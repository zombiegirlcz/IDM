package rc;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f253153b;

    public h(String str, Long l2) {
        this.f253152a = str;
        this.f253153b = l2;
    }

    public static pc.k a() {
        return new pc.k();
    }

    public final Long b() {
        return this.f253153b;
    }

    public final String c() {
        return this.f253152a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof rc.h
            r2 = 0
            if (r1 == 0) goto L1f
            rc.h r6 = (rc.h) r6
            java.lang.Long r3 = r6.f253153b
            java.lang.String r4 = r5.f253152a
            java.lang.String r6 = r6.f253152a
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L1f
            java.lang.Long r6 = r5.f253153b
            if (r6 != 0) goto L21
            if (r3 != 0) goto L1f
        L1d:
            r6 = r0
            goto L28
        L1f:
            r6 = r2
            goto L28
        L21:
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L1f
            goto L1d
        L28:
            if (r1 == 0) goto L2e
            if (r6 == 0) goto L2d
            return r0
        L2d:
            return r2
        L2e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f253152a.hashCode() ^ 1000003;
        Long l2 = this.f253153b;
        return ((iHashCode * 1000003) ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.f253152a + ", cloudProjectNumber=" + this.f253153b).concat(", network=null").concat("}");
    }
}
