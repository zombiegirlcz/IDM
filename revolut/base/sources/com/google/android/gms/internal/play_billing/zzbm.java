package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbm {
    public static String zza(String str) {
        if (zzbi.zza(str)) {
            return null;
        }
        return str;
    }

    public static String zzb(String str, Object... objArr) {
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
            sb6.append(zze(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb6.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb6.append(str2);
                sb6.append(zze(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static String zzc(String str) {
        return str == null ? "" : str;
    }

    public static boolean zzd(String str) {
        return zzbi.zza(str);
    }

    private static String zze(Object obj2) {
        if (obj2 == null) {
            return "null";
        }
        try {
            return obj2.toString();
        } catch (Exception e) {
            String strO = a.o(obj2.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj2)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strO), (Throwable) e);
            return j6.a.s("<", strO, " threw ", e.getClass().getName(), ">");
        }
    }
}
