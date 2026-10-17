package hp;

import java.util.ArrayList;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class c {
    public static String a(String str) {
        int length = str.length() + 1;
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            arrayList.add(Integer.valueOf((length - i2) * Integer.parseInt(String.valueOf(str.charAt(i)))));
            i++;
            i2++;
        }
        int iT0 = d0.T0(arrayList) % 11;
        return iT0 < 2 ? "0" : String.valueOf(11 - iT0);
    }
}
