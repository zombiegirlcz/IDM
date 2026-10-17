package st5;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private a() {
    }

    public static b a(double d) {
        b bVar;
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (bVar.b() == ((int) d)) {
                break;
            }
            i++;
        }
        return bVar == null ? b.FIVE : bVar;
    }
}
