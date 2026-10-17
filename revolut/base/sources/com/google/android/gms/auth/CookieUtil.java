package com.google.android.gms.auth;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    @NonNull
    public static String getCookieUrl(@NonNull String str, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        return a.o(true != zza(bool) ? "http" : "https", "://", str);
    }

    @NonNull
    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l2) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb6.append(str2);
        }
        if (zza(bool)) {
            sb6.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb6.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb6.append(";Domain=");
            sb6.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb6.append(";Path=");
            sb6.append(str4);
        }
        if (l2 != null && l2.longValue() > 0) {
            sb6.append(";Max-Age=");
            sb6.append(l2);
        }
        if (!TextUtils.isEmpty(null)) {
            sb6.append(";Priority=null");
        }
        if (!TextUtils.isEmpty(null)) {
            sb6.append(";SameSite=null");
        }
        if (zza(null)) {
            sb6.append(";SameParty");
        }
        return sb6.toString();
    }

    private static boolean zza(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
