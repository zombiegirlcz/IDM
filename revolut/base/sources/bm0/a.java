package bm0;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import zhm.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static String a(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            if (bArr2 != null) {
                bArr = p.v(bArr, bArr2);
            }
            String string = new BigInteger(1, messageDigest.digest(bArr)).toString(16);
            Intrinsics.h(string);
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public final String b(String plaintext) {
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        byte[] bytes = plaintext.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return a(bytes, null);
    }
}
