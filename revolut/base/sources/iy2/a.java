package iy2;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static boolean a(String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sb6 = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb6.append(cCharAt);
                }
            }
            String string = sb6.toString();
            if (string.length() != 0) {
                int i2 = 0;
                boolean z = false;
                for (int length2 = string.length() - 1; -1 < length2; length2--) {
                    int iA = kotlin.text.a.a(string.charAt(length2));
                    if (z && (iA = iA * 2) > 9) {
                        iA = (iA % 10) + 1;
                    }
                    i2 += iA;
                    z = !z;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
