package l7g;

/* JADX INFO: loaded from: classes9.dex */
public final class p {
    private p() {
    }

    public static q a(String str) {
        q qVar;
        if (str != null) {
            q[] qVarArrValues = q.values();
            int length = qVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    qVar = null;
                    break;
                }
                qVar = qVarArrValues[i];
                if (kotlin.text.a0.z(qVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (qVar != null) {
                return qVar;
            }
        }
        return q.UNKNOWN;
    }
}
