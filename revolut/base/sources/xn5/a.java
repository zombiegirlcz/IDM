package xn5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.util.Locale;
import jli.g;
import kn5.c;
import kn5.e;
import kn5.f;
import kn5.h;
import kn5.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ln5.d;
import org.bouncycastle.jcajce.provider.digest.Keccak;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rn5.a {
    public a(b validateStandardAddress) {
        Intrinsics.checkNotNullParameter(validateStandardAddress, "validateStandardAddress");
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String ethAddress = params.f185996a;
        int length = ethAddress.length();
        if (length == 0) {
            return new e(h.f186003a);
        }
        if (length != 42) {
            return new e(null);
        }
        Intrinsics.checkNotNullParameter(ethAddress, "ethAddress");
        int i = 0;
        if (a0.H(ethAddress, "0x", false)) {
            Intrinsics.checkNotNullParameter(ethAddress, "<this>");
            StringBuilder sb6 = new StringBuilder();
            int length2 = ethAddress.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt = ethAddress.charAt(i2);
                if (Character.isLetterOrDigit(cCharAt)) {
                    sb6.append(cCharAt);
                }
            }
            if (sb6.toString().length() == ethAddress.length() && ethAddress.length() == 42) {
                String strSubstring = ethAddress.substring(2, ethAddress.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (d.a(strSubstring)) {
                    Keccak.Digest256 digest256 = new Keccak.Digest256();
                    String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    byte[] bytes = lowerCase.getBytes(UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    byte[] bArrDigest = digest256.digest(bytes);
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    String strI = g.i(bArrDigest);
                    int i3 = 0;
                    while (i < strSubstring.length()) {
                        char cCharAt2 = strSubstring.charAt(i);
                        int i5 = i3 + 1;
                        char cCharAt3 = strI.charAt(i3);
                        Integer numValueOf = ('0' > cCharAt3 || cCharAt3 >= ':') ? ('a' > cCharAt3 || cCharAt3 >= 'g') ? ('A' > cCharAt3 || cCharAt3 >= 'G') ? null : Integer.valueOf(cCharAt3 - '7') : Integer.valueOf(cCharAt3 - 'W') : Integer.valueOf(cCharAt3 - '0');
                        if (numValueOf == null) {
                            throw new InvalidParameterException("Invalid encoding for the addressHash");
                        }
                        int iIntValue = numValueOf.intValue();
                        if ((iIntValue > 7 && Character.toUpperCase(cCharAt2) != cCharAt2) || (iIntValue <= 7 && Character.toLowerCase(cCharAt2) != cCharAt2)) {
                            return new kn5.b(j.f186005a);
                        }
                        i++;
                        i3 = i5;
                    }
                }
                return c.f186000a;
            }
        }
        return new e(null);
    }
}
