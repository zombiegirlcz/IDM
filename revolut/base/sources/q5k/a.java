package q5k;

import dj0.d;
import mga.a0;
import mga.d0;
import mga.n;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private a() {
    }

    public static boolean a(d dVar) {
        return dVar != null && dVar.f115082a > 0;
    }

    public static d0 b(d dVar, d dVar2, d dVar3, d dVar4, String str) {
        if (a(dVar)) {
            return new a0(str, null);
        }
        if (a(dVar2) || a(dVar4) || a(dVar3)) {
            return new n(str);
        }
        return null;
    }
}
