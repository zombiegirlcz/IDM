package u9;

/* JADX INFO: loaded from: classes16.dex */
public final class p extends v9.a {
    public static final p f;
    public final k9.k e;

    static {
        w9.f.f295677c.getClass();
        w9.f.k(String.class);
        f = new p();
    }

    public p() {
        super(String[].class);
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // v9.a, t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r5, k9.d r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L1a
            k9.t r1 = r5.f182201a
            k9.p r1 = r1.e()
            p9.f r2 = r6.b()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.c(r2)
            if (r1 == 0) goto L1a
            k9.k r1 = r5.D(r2, r1)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            d9.m r2 = d9.m.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            d9.p r3 = v9.o0.m(r5, r6, r3)
            if (r3 == 0) goto L2a
            java.lang.Boolean r2 = r3.b(r2)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            k9.k r3 = r4.e
            if (r1 != 0) goto L30
            r1 = r3
        L30:
            k9.k r1 = v9.o0.l(r5, r6, r1)
            if (r1 != 0) goto L3c
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            k9.k r1 = r5.k(r1, r6)
        L3c:
            boolean r5 = x9.f.q(r1)
            if (r5 == 0) goto L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 != r3) goto L4f
            java.lang.Boolean r5 = r4.d
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L4f
            return r4
        L4f:
            u9.p r5 = new u9.p
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.p.a(k9.v, k9.d):k9.k");
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((String[]) obj2).length == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // k9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r4, com.fasterxml.jackson.core.h r5, k9.v r6) {
        /*
            r3 = this;
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r0 = r3.d
            if (r0 != 0) goto L14
            k9.u r1 = k9.u.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            k9.t r2 = r6.f182201a
            boolean r1 = r2.n(r1)
            if (r1 != 0) goto L18
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L1c
        L18:
            r3.t(r4, r5, r6)
            return
        L1c:
            r5.y(r4)
            r3.t(r4, r5, r6)
            r5.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.p.f(java.lang.Object, com.fasterxml.jackson.core.h, k9.v):void");
    }

    @Override // t9.g
    public final t9.g q(r9.c cVar) {
        return this;
    }

    @Override // v9.a
    public final k9.k s(k9.d dVar, Boolean bool) {
        return new p(this, dVar, this.e, bool);
    }

    @Override // v9.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(String[] strArr, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        int length = strArr.length;
        if (length == 0) {
            return;
        }
        int i = 0;
        k9.k kVar = this.e;
        if (kVar == null) {
            while (i < length) {
                String str = strArr[i];
                if (str == null) {
                    hVar.p();
                } else {
                    hVar.B(str);
                }
                i++;
            }
            return;
        }
        int length2 = strArr.length;
        while (i < length2) {
            String str2 = strArr[i];
            if (str2 == null) {
                vVar.h(hVar);
            } else {
                kVar.f(str2, hVar, vVar);
            }
            i++;
        }
    }

    public p(p pVar, k9.d dVar, k9.k kVar, Boolean bool) {
        super(pVar, dVar, bool);
        this.e = kVar;
    }
}
