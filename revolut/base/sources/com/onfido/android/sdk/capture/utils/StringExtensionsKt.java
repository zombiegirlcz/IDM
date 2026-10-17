package com.onfido.android.sdk.capture.utils;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0000\u001a \u0010\t\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"MINUTE_TO_MILLISECONDS", "", "WORDS_READ_PER_MINUTE", "", "isNotNullOrEmpty", "", "", "readingTimeMilliseconds", "", "substring", "pair", "Lkotlin/Pair;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringExtensionsKt {
    private static final int MINUTE_TO_MILLISECONDS = 60000;
    private static final float WORDS_READ_PER_MINUTE = 150.0f;

    public static final boolean isNotNullOrEmpty(String str) {
        return !(str == null || str.length() == 0);
    }

    public static final long readingTimeMilliseconds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (long) ((d0.n0(str, new String[]{" "}, 0, 6).size() / WORDS_READ_PER_MINUTE) * 60000);
    }

    @NotNull
    public static final String substring(@NotNull String str, @NotNull Pair<Integer, Integer> pair) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        String strSubstring = str.substring(((Number) pair.f186385a).intValue(), ((Number) pair.f186386b).intValue());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
