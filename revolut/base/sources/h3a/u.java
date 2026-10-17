package h3a;

import java.util.Comparator;
import kotlin.text.a0;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        jq9.t tVar = (jq9.t) obj2;
        jq9.t tVar2 = (jq9.t) obj3;
        if (tVar == tVar2) {
            return 0;
        }
        if (tVar == null) {
            return -1;
        }
        if (tVar2 == null) {
            return 1;
        }
        String strA = tVar.a();
        Character chQ0 = f0.Q0(strA);
        String strConcat = (chQ0 == null || !Character.isLetter(chQ0.charValue())) ? "1_".concat(strA) : "0_".concat(strA);
        String strA2 = tVar2.a();
        Character chQ02 = f0.Q0(strA2);
        return a0.q(strConcat, (chQ02 == null || !Character.isLetter(chQ02.charValue())) ? "1_".concat(strA2) : "0_".concat(strA2));
    }
}
