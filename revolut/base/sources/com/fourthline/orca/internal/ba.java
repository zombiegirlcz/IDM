package com.fourthline.orca.internal;

import java.text.Normalizer;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ba {
    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = a((CharSequence) kotlin.text.d0.F0(str).toString()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final String a(CharSequence charSequence) {
        Regex regex = new Regex("\\p{InCombiningDiacriticalMarks}+");
        String strNormalize = Normalizer.normalize(charSequence, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return regex.replace(strNormalize, "");
    }
}
