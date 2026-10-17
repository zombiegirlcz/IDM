package m7g;

import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private c() {
    }

    public static d a(String str) {
        d dVar;
        if (str != null) {
            d[] dVarArrValues = d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i];
                if (a0.z(dVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return d.UNKNOWN;
    }
}
