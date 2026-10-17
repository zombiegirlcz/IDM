package mmd;

import amd.j;
import dj0.d;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        j jVar = (j) obj3;
        d dVarO0 = mra.d.o0(jVar);
        d dVar = d.e;
        d dVar2 = null;
        if (!dVarO0.f(dVar) || !mra.d.w(jVar)) {
            dVarO0 = null;
        }
        j jVar2 = (j) obj2;
        d dVarO02 = mra.d.o0(jVar2);
        if (dVarO02.f(dVar) && mra.d.w(jVar2)) {
            dVar2 = dVarO02;
        }
        return cim.b.b(dVarO0, dVar2);
    }
}
