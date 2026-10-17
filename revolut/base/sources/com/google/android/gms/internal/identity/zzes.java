package com.google.android.gms.internal.identity;

import a0.d;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
public final class zzes {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                string = "null";
            } else {
                try {
                    string = obj2.toString();
                } catch (Exception e) {
                    String name = obj2.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj2));
                    String strU = d.u(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strU), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb6 = new StringBuilder(name2.length() + strU.length() + 8 + 1);
                    sb6.append("<");
                    sb6.append(strU);
                    sb6.append(" threw ");
                    sb6.append(name2);
                    sb6.append(">");
                    string = sb6.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb9 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb9.append((CharSequence) str, i3, iIndexOf);
            sb9.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb9.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb9.append(" [");
            sb9.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb9.append(", ");
                sb9.append(objArr[i5]);
            }
            sb9.append(']');
        }
        return sb9.toString();
    }
}
