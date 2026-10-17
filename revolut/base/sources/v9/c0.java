package v9;

/* JADX INFO: loaded from: classes16.dex */
public final class c0 extends g0 {
    static {
        w9.f.f295677c.getClass();
        w9.f.k(Float.TYPE);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((float[]) obj2).length == 0;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        float[] fArr = (float[]) obj2;
        int i = 0;
        if (fArr.length == 1 && r(vVar)) {
            int length = fArr.length;
            while (i < length) {
                hVar.r(fArr[i]);
                i++;
            }
            return;
        }
        hVar.y(fArr);
        int length2 = fArr.length;
        while (i < length2) {
            hVar.r(fArr[i]);
            i++;
        }
        hVar.l();
    }

    @Override // v9.a
    public final k9.k s(k9.d dVar, Boolean bool) {
        return new c0(this, dVar, bool);
    }

    @Override // v9.a
    public final void t(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        for (float f : (float[]) obj2) {
            hVar.r(f);
        }
    }
}
