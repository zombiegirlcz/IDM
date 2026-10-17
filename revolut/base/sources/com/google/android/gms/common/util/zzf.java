package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
final class zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Pattern f38329zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f38329zza.matcher(str);
        StringBuilder sb6 = null;
        int iEnd = 0;
        while (matcher.find()) {
            if (sb6 == null) {
                sb6 = new StringBuilder();
            }
            int iStart = matcher.start();
            int i = iStart;
            while (i >= 0 && str.charAt(i) == '\\') {
                i--;
            }
            if ((iStart - i) % 2 != 0) {
                int i2 = Integer.parseInt(matcher.group().substring(2), 16);
                sb6.append((CharSequence) str, iEnd, matcher.start());
                if (i2 == 92) {
                    sb6.append("\\\\");
                } else {
                    sb6.append(Character.toChars(i2));
                }
                iEnd = matcher.end();
            }
        }
        if (sb6 == null) {
            return str;
        }
        if (iEnd < matcher.regionEnd()) {
            sb6.append((CharSequence) str, iEnd, matcher.regionEnd());
        }
        return sb6.toString();
    }
}
