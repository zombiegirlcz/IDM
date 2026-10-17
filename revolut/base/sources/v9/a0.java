package v9;

/* JADX INFO: loaded from: classes16.dex */
public final class a0 extends a {
    static {
        w9.f.f295677c.getClass();
        w9.f.k(Boolean.class);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((boolean[]) obj2).length == 0;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        boolean[] zArr = (boolean[]) obj2;
        int i = 0;
        if (zArr.length == 1 && r(vVar)) {
            int length = zArr.length;
            while (i < length) {
                hVar.k(zArr[i]);
                i++;
            }
            return;
        }
        hVar.y(zArr);
        int length2 = zArr.length;
        while (i < length2) {
            hVar.k(zArr[i]);
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
        return new a0(this, dVar, bool);
    }

    @Override // v9.a
    public final void t(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        for (boolean z : (boolean[]) obj2) {
            hVar.k(z);
        }
    }
}
