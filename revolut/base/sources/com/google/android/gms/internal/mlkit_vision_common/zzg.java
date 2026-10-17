package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
public final class zzg {
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
                    String str2 = obj2.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj2));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbX = a.x("<", str2, " threw ");
                    sbX.append(e.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb6 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i3, iIndexOf);
            sb6.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb6.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb6.append(" [");
            sb6.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb6.append(", ");
                sb6.append(objArr[i5]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static boolean zzb(String str) {
        return zze.zza(str);
    }
}
