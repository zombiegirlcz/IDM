package v9;

/* JADX INFO: loaded from: classes16.dex */
public final class e0 extends g0 {
    static {
        w9.f.f295677c.getClass();
        w9.f.k(Long.TYPE);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((long[]) obj2).length == 0;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        long[] jArr = (long[]) obj2;
        int i = 0;
        if (jArr.length == 1 && r(vVar)) {
            int length = jArr.length;
            while (i < length) {
                hVar.t(jArr[i]);
                i++;
            }
            return;
        }
        int length2 = jArr.length;
        hVar.getClass();
        com.fasterxml.jackson.core.h.f(jArr.length, length2);
        hVar.y(jArr);
        while (i < length2) {
            hVar.t(jArr[i]);
            i++;
        }
        hVar.l();
    }

    @Override // v9.a
    public final k9.k s(k9.d dVar, Boolean bool) {
        return new e0(this, dVar, bool);
    }

    @Override // v9.a
    public final void t(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        for (long j2 : (long[]) obj2) {
            hVar.t(j2);
        }
    }
}
