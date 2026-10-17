package l7g;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    private r() {
    }

    public static s a(String str) {
        s sVar;
        if (str != null) {
            s[] sVarArrValues = s.values();
            int length = sVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    sVar = null;
                    break;
                }
                sVar = sVarArrValues[i];
                if (kotlin.text.a0.z(sVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (sVar != null) {
                return sVar;
            }
        }
        return s.UNKNOWN;
    }
}
