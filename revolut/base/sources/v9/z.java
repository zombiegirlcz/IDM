package v9;

import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
public abstract class z extends o0 implements t9.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f286948c;

    public z(Class cls) {
        super(cls, 0);
        this.f286948c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r6, k9.d r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L1a
            k9.t r1 = r6.f182201a
            k9.p r1 = r1.e()
            p9.f r2 = r7.b()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.c(r2)
            if (r1 == 0) goto L1a
            k9.k r1 = r6.D(r2, r1)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            java.lang.Class r2 = r5.f286928a
            d9.p r2 = v9.o0.m(r6, r7, r2)
            if (r2 == 0) goto L2a
            d9.m r3 = d9.m.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r2.b(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            k9.k r1 = v9.o0.l(r6, r7, r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != 0) goto L37
            k9.k r1 = r6.k(r3, r7)
        L37:
            boolean r4 = x9.f.q(r1)
            if (r4 == 0) goto L4b
            java.lang.Boolean r6 = r5.f286948c
            boolean r6 = java.util.Objects.equals(r2, r6)
            if (r6 == 0) goto L46
            return r5
        L46:
            k9.k r6 = r5.q(r7, r2)
            return r6
        L4b:
            u9.e r7 = new u9.e
            w9.f r6 = r6.s()
            w9.e r2 = w9.f.d
            com.fasterxml.jackson.databind.JavaType r6 = r6.b(r0, r3, r2)
            r2 = 1
            r7.<init>(r6, r2, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.z.a(k9.v, k9.d):k9.k");
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((Collection) obj2).size() == 0;
    }

    public abstract k9.k q(k9.d dVar, Boolean bool);

    public z(z zVar, Boolean bool) {
        super(zVar);
        this.f286948c = bool;
    }
}
