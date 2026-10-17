package com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto;

import com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.jetbrains.annotations.NotNull;
import wk5.k;
import zhm.p;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static void a(f66.c wallet, k addressType, byte[] derivedAddress) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(derivedAddress, "derivedAddress");
        wallet.getClass();
        if (!Intrinsics.f(null, c66.b.f21682a[addressType.ordinal()] == 1 ? "SOLANA" : addressType.name())) {
            throw new SeedPhraseExportDecryptionException.InvalidWalletSet();
        }
        int i = c66.a.f21681a[addressType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new SeedPhraseExportDecryptionException.InvalidWalletSet();
            }
            BigInteger bigInteger = com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.a.f71854a;
            Intrinsics.checkNotNullParameter(null, "value");
            throw null;
        }
        String strE0 = d0.e0(d0.e0(null, "0x"), "0X");
        if (strE0.length() == 40) {
            for (int i2 = 0; i2 < strE0.length(); i2++) {
                if (kotlin.text.a.c(strE0.charAt(i2)) != null) {
                }
            }
            int i3 = 0;
            while (true) {
                if (i3 >= strE0.length()) {
                    break;
                }
                if (Character.isLowerCase(strE0.charAt(i3))) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= strE0.length()) {
                            break;
                        }
                        if (Character.isUpperCase(strE0.charAt(i5))) {
                            String lowerCase = strE0.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            byte[] bytes = lowerCase.getBytes(Charsets.d);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            byte[] bArr = new byte[32];
                            try {
                                KeccakDigest keccakDigest = new KeccakDigest(256);
                                keccakDigest.update(bytes, 0, bytes.length);
                                keccakDigest.doFinal(bArr, 0);
                                int i6 = 0;
                                int i21 = 0;
                                while (i6 < strE0.length()) {
                                    char cCharAt = strE0.charAt(i6);
                                    int i22 = i21 + 1;
                                    if (Character.isLetter(cCharAt)) {
                                        int i32 = bArr[i21 / 2];
                                        if (i21 % 2 == 0) {
                                            i32 >>>= 4;
                                        }
                                        if (Character.isUpperCase(cCharAt) != ((i32 & 15) >= 8)) {
                                            throw new SeedPhraseExportDecryptionException.InvalidWalletSet();
                                        }
                                    }
                                    i6++;
                                    i21 = i22;
                                }
                            } finally {
                                p.r(bytes);
                                p.r(bArr);
                            }
                        } else {
                            i5++;
                        }
                    }
                } else {
                    i3++;
                }
            }
            byte[] bArr2 = new byte[20];
            for (int i33 = 0; i33 < 20; i33++) {
                int i43 = i33 * 2;
                String strSubstring = strE0.substring(i43, i43 + 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                bArr2[i33] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            }
            try {
                if (MessageDigest.isEqual(bArr2, derivedAddress)) {
                    return;
                } else {
                    throw new SeedPhraseExportDecryptionException.AddressMismatch();
                }
            } finally {
                p.r(bArr2);
            }
        }
        throw new SeedPhraseExportDecryptionException.InvalidWalletSet();
    }
}
