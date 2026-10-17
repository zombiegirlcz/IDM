package com.google.android.gms.internal.common;

import a0.d;
import j6.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
public final class zzx {
    public static String zza(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb6 = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i2, iIndexOf);
            sb6.append(zzb(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb6.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb6.append(str2);
                sb6.append(zzb(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    private static String zzb(Object obj2) {
        if (obj2 == null) {
            return "null";
        }
        try {
            return obj2.toString();
        } catch (Exception e) {
            String name = obj2.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj2));
            String strU = d.u(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strU), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb6 = new StringBuilder(strU.length() + 8 + name2.length() + 1);
            a.D(sb6, "<", strU, " threw ", name2);
            sb6.append(">");
            return sb6.toString();
        }
    }
}
