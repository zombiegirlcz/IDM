package org.bouncycastle.jcajce.provider.asymmetric.gost;

import j6.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
class GOSTUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb6 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = gOST3410Parameters.getA().modPow(bigInteger, gOST3410Parameters.getP());
        sb6.append(str);
        sb6.append(" Private Key [");
        a.D(sb6, generateKeyFingerprint(bigIntegerModPow, gOST3410Parameters), "]", strLineSeparator, "                  Y: ");
        sb6.append(bigIntegerModPow.toString(16));
        sb6.append(strLineSeparator);
        return sb6.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb6 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        sb6.append(str);
        sb6.append(" Public Key [");
        a.D(sb6, generateKeyFingerprint(bigInteger, gOST3410Parameters), "]", strLineSeparator, "                 Y: ");
        sb6.append(bigInteger.toString(16));
        sb6.append(strLineSeparator);
        return sb6.toString();
    }
}
