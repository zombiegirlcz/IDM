package org.bouncycastle.jcajce.provider.asymmetric.dh;

import j6.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
class DHUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger, DHParameters dHParameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb6 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = dHParameters.getG().modPow(bigInteger, dHParameters.getP());
        sb6.append(str);
        sb6.append(" Private Key [");
        a.D(sb6, generateKeyFingerprint(bigIntegerModPow, dHParameters), "]", strLineSeparator, "              Y: ");
        sb6.append(bigIntegerModPow.toString(16));
        sb6.append(strLineSeparator);
        return sb6.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb6 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        sb6.append(str);
        sb6.append(" Public Key [");
        a.D(sb6, generateKeyFingerprint(bigInteger, dHParameters), "]", strLineSeparator, "             Y: ");
        sb6.append(bigInteger.toString(16));
        sb6.append(strLineSeparator);
        return sb6.toString();
    }
}
