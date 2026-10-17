package v9;

/* JADX INFO: loaded from: classes16.dex */
public final class b0 extends a {
    static {
        w9.f.f295677c.getClass();
        w9.f.k(Double.TYPE);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((double[]) obj2).length == 0;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        double[] dArr = (double[]) obj2;
        int i = 0;
        if (dArr.length == 1 && r(vVar)) {
            int length = dArr.length;
            while (i < length) {
                hVar.q(dArr[i]);
                i++;
            }
            return;
        }
        int length2 = dArr.length;
        hVar.getClass();
        com.fasterxml.jackson.core.h.f(dArr.length, length2);
        hVar.y(dArr);
        while (i < length2) {
            hVar.q(dArr[i]);
            i++;
        }
        hVar.l();
    }

    @Override // t9.g
    public final t9.g q(r9.c cVar) {
        return this;
    }

    @Override // v9.a
    public final k9.k s(k9.d dVar, Boolean bool) {
        return new b0(this, dVar, bool);
    }

    @Override // v9.a
    public final void t(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        for (double d : (double[]) obj2) {
            hVar.q(d);
        }
    }
}
