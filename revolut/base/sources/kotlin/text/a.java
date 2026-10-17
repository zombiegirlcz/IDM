package kotlin.text;

/* JADX INFO: loaded from: classes13.dex */
public class a extends CharsKt__CharJVMKt {
    public static int a(char c2) {
        int iDigit = Character.digit((int) c2, 10);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    public static Integer b(char c2) {
        Integer numValueOf = Integer.valueOf(Character.digit((int) c2, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static Integer c(char c2) {
        CharsKt__CharJVMKt.checkRadix(16);
        int iDigit = Character.digit((int) c2, 16);
        Integer numValueOf = Integer.valueOf(iDigit);
        if (iDigit >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean d(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
