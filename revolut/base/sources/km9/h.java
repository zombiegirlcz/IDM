package km9;

import java.util.Comparator;
import jq9.t;
import kotlin.text.a0;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Comparator {
    public static String a(String str) {
        Character chQ0 = f0.Q0(str);
        return ((chQ0 == null || !Character.isLetter(chQ0.charValue())) ? "1_" : "0_").concat(str);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        t tVar = (t) obj2;
        t tVar2 = (t) obj3;
        if (tVar == tVar2) {
            return 0;
        }
        if (tVar == null) {
            return -1;
        }
        if (tVar2 == null) {
            return 1;
        }
        return a0.q(a(tVar.a()), a(tVar2.a()));
    }
}
