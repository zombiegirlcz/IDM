package ir9;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public static final l a(jf0.c cVar) {
        String strE = cVar.e(3);
        int iHashCode = strE.hashCode();
        if (iHashCode != 93740364) {
            if (iHashCode != 530115961) {
                if (iHashCode == 1526341213 && strE.equals("settle-up")) {
                    return new k(cVar.e(2));
                }
            } else if (strE.equals("overview")) {
                return new j(cVar.e(2));
            }
        } else if (strE.equals("bills")) {
            return new h(cVar.e(2), cVar.e(4));
        }
        return i.f168035a;
    }
}
