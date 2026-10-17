package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes14.dex */
class Rounding {
    public static int[] decompose(int i, int i2) {
        int i3;
        int i5 = (i + CertificateBody.profileType) >> 7;
        if (i2 == 261888) {
            i3 = (((i5 * 1025) + PKIFailureInfo.badSenderNonce) >> 22) & 15;
        } else {
            if (i2 != 95232) {
                throw new RuntimeException("Wrong Gamma2!");
            }
            int i6 = ((i5 * 11275) + 8388608) >> 24;
            i3 = i6 ^ (((43 - i6) >> 31) & i6);
        }
        int i21 = i - ((i3 * 2) * i2);
        return new int[]{i21 - (((4190208 - i21) >> 31) & 8380417), i3};
    }

    public static int makeHint(int i, int i2, MLDSAEngine mLDSAEngine) {
        int i3;
        int dilithiumGamma2 = mLDSAEngine.getDilithiumGamma2();
        if (i <= dilithiumGamma2 || i > (i3 = 8380417 - dilithiumGamma2)) {
            return 0;
        }
        return (i == i3 && i2 == 0) ? 0 : 1;
    }

    public static void power2RoundAll(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 256; i++) {
            int i2 = iArr[i];
            int i3 = i2 + 4095;
            iArr[i] = i3 >> 13;
            iArr2[i] = i2 - (i3 & (-8192));
        }
    }

    public static int useHint(int i, int i2, int i3) {
        int[] iArrDecompose = decompose(i, i3);
        int i5 = iArrDecompose[0];
        int i6 = iArrDecompose[1];
        if (i2 == 0) {
            return i6;
        }
        if (i3 == 261888) {
            return (i5 > 0 ? i6 + 1 : i6 - 1) & 15;
        }
        if (i3 != 95232) {
            throw new RuntimeException("Wrong Gamma2!");
        }
        if (i5 > 0) {
            if (i6 == 43) {
                return 0;
            }
            return i6 + 1;
        }
        if (i6 == 0) {
            return 43;
        }
        return i6 - 1;
    }
}
