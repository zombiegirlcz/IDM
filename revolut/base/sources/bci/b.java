package bci;

import hha.x;
import hha.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final boolean a(b bVar, x xVar) {
        bVar.getClass();
        if (xVar == null) {
            return false;
        }
        y yVar = xVar.f152370b;
        return yVar == y.ENABLED || yVar == y.LOCKED || yVar == y.PENDING;
    }
}
