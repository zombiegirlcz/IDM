package v9;

/* JADX INFO: loaded from: classes16.dex */
public final class d0 extends a {
    static {
        w9.f.f295677c.getClass();
        w9.f.k(Integer.TYPE);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((int[]) obj2).length == 0;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        int[] iArr = (int[]) obj2;
        int i = 0;
        if (iArr.length == 1 && r(vVar)) {
            int length = iArr.length;
            while (i < length) {
                hVar.s(iArr[i]);
                i++;
            }
            return;
        }
        int length2 = iArr.length;
        hVar.getClass();
        com.fasterxml.jackson.core.h.f(iArr.length, length2);
        hVar.y(iArr);
        while (i < length2) {
            hVar.s(iArr[i]);
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
        return new d0(this, dVar, bool);
    }

    @Override // v9.a
    public final void t(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        for (int i : (int[]) obj2) {
            hVar.s(i);
        }
    }
}
