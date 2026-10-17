package com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto;

import c66.k;
import com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f71856a = new IntRange(97, 122, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f71857b;

    public static final class a {
        private a() {
        }
    }

    static {
        Integer[] elements = {12, 15, 18, 21, 24};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f71857b = kotlin.collections.d.y0(elements);
    }

    public static k a(byte[] bArr) {
        if (bArr.length != 0) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            if (bArr.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (bArr[0] != 32) {
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                if (bArr.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                if (bArr[bArr.length - 1] != 32) {
                    int length = bArr.length;
                    int i = 1;
                    while (true) {
                        if (i >= length) {
                            for (byte b4 : bArr) {
                                if (b4 != 32) {
                                    IntRange intRange = f71856a;
                                    int i2 = intRange.f186448a;
                                    int i3 = intRange.f186449b;
                                    if (i2 > b4 || b4 > i3) {
                                    }
                                }
                            }
                            int i5 = 0;
                            for (byte b5 : bArr) {
                                if (b5 == 32) {
                                    i5++;
                                }
                            }
                            if (!f71857b.contains(new Integer(i5 + 1))) {
                                throw new SeedPhraseExportDecryptionException.InvalidMnemonic();
                            }
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                            byte[] bytes = "mnemonic".getBytes(Charsets.d);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            try {
                                byte[] bArrP = edl.a.p(bArrCopyOf, bytes);
                                byte[] bArrCopyOf2 = Arrays.copyOf(bArr, bArr.length);
                                Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(...)");
                                return new k(bArrCopyOf2, bArrP);
                            } finally {
                                p.r(bArrCopyOf);
                                p.r(bytes);
                            }
                        }
                        if (bArr[i] == 32 && bArr[i - 1] == 32) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        throw new SeedPhraseExportDecryptionException.InvalidMnemonic();
    }
}
