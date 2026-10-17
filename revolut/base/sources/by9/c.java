package by9;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final ey9.c a(iy9.d dVar, String str) {
        String str2 = dVar == iy9.d.USER ? str : null;
        String str3 = dVar == iy9.d.BENEFICIARY ? str : null;
        String str4 = dVar == iy9.d.CARD_OWNER ? str : null;
        if (dVar != iy9.d.COMPANY) {
            str = null;
        }
        return new ey9.c(str2, str3, str4, str);
    }
}
