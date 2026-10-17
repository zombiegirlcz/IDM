package v9;

/* JADX INFO: loaded from: classes16.dex */
public final class f0 extends g0 {
    static {
        w9.f.f295677c.getClass();
        w9.f.k(Short.TYPE);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((short[]) obj2).length == 0;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        short[] sArr = (short[]) obj2;
        int i = 0;
        if (sArr.length == 1 && r(vVar)) {
            int length = sArr.length;
            while (i < length) {
                hVar.s(sArr[i]);
                i++;
            }
            return;
        }
        hVar.y(sArr);
        int length2 = sArr.length;
        while (i < length2) {
            hVar.s(sArr[i]);
            i++;
        }
        hVar.l();
    }

    @Override // v9.a
    public final k9.k s(k9.d dVar, Boolean bool) {
        return new f0(this, dVar, bool);
    }

    @Override // v9.a
    public final void t(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        for (short s2 : (short[]) obj2) {
            hVar.s(s2);
        }
    }
}
