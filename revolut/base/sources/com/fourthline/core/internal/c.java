package com.fourthline.core.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f26297a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f26298b = {7, 3, 1};

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final boolean a(String data, String expectedChecksum) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(expectedChecksum, "expectedChecksum");
        return Intrinsics.f(expectedChecksum, a(data));
    }

    private final int a(char c2) {
        if (c2 == '<') {
            return 0;
        }
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < '[') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("MRZ contains invalid character: " + c2);
    }

    private final String a(String str) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < str.length()) {
            int iA = a(str.charAt(i));
            int[] iArr = f26298b;
            i2 += iA * iArr[i3 % iArr.length];
            i++;
            i3++;
        }
        return String.valueOf(i2 % 10);
    }
}
