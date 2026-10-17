package o7g;

import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private a() {
    }

    public static b a(String str) {
        b bVar;
        if (str != null) {
            b[] bVarArrValues = b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i];
                if (a0.z(bVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        return b.UNKNOWN;
    }
}
