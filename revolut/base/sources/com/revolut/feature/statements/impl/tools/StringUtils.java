package com.revolut.feature.statements.impl.tools;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class StringUtils {
    @NonNull
    public static String sequenceStringsWithDivider(@NonNull String str, @NonNull String[] strArr) {
        StringBuilder sb6 = new StringBuilder();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                sb6.append(str2);
                sb6.append(str);
            }
        }
        if (sb6.length() < str.length()) {
            return "";
        }
        sb6.setLength(sb6.length() - str.length());
        return sb6.toString();
    }
}
