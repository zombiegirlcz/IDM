package org.bouncycastle.pqc.crypto.falcon;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes14.dex */
class FalconCodec {
    static final byte[] max_fg_bits = {0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 5};
    static final byte[] max_FG_bits = {0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    public static int comp_decode(short[] sArr, int i, byte[] bArr, int i2) {
        int i3 = 1 << i;
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < i3; i22++) {
            if (i21 >= i2) {
                return 0;
            }
            i5 = (i5 << 8) | (bArr[i21] & UnsignedBytes.MAX_VALUE);
            i21++;
            int i32 = i5 >>> i6;
            int i33 = i32 & 128;
            int i43 = i32 & CertificateBody.profileType;
            do {
                if (i6 == 0) {
                    if (i21 >= i2) {
                        return 0;
                    }
                    i5 = (i5 << 8) | (bArr[i21] & UnsignedBytes.MAX_VALUE);
                    i21++;
                    i6 = 8;
                }
                i6--;
                if (((i5 >>> i6) & 1) == 0) {
                    i43 += 128;
                } else {
                    if (i33 != 0 && i43 == 0) {
                        return 0;
                    }
                    if (i33 != 0) {
                        i43 = -i43;
                    }
                    sArr[i22] = (short) i43;
                }
            } while (i43 <= 2047);
            return 0;
        }
        if ((((1 << i6) - 1) & i5) != 0) {
            return 0;
        }
        return i21;
    }

    public static int comp_encode(byte[] bArr, int i, short[] sArr, int i2) {
        int i3 = 1 << i2;
        for (int i5 = 0; i5 < i3; i5++) {
            short s2 = sArr[i5];
            if (s2 < -2047 || s2 > 2047) {
                return 0;
            }
        }
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        for (int i32 = 0; i32 < i3; i32++) {
            int i33 = i21 << 1;
            short s3 = sArr[i32];
            int i43 = s3;
            if (s3 < 0) {
                i33 |= 1;
                i43 = -s3;
            }
            int i59 = (i33 << 7) | (i43 & CertificateBody.profileType);
            int i66 = (i43 >>> 7) + 1;
            i21 = (i59 << i66) | 1;
            i6 = i6 + 8 + i66;
            while (i6 >= 8) {
                i6 -= 8;
                if (bArr != null) {
                    if (i22 >= i) {
                        return 0;
                    }
                    bArr[i22] = (byte) (i21 >>> i6);
                }
                i22++;
            }
        }
        if (i6 <= 0) {
            return i22;
        }
        if (bArr != null) {
            if (i22 >= i) {
                return 0;
            }
            bArr[i22] = (byte) (i21 << (8 - i6));
        }
        return i22 + 1;
    }

    public static int modq_decode(short[] sArr, int i, byte[] bArr, int i2) {
        int i3 = 1 << i;
        int i5 = ((i3 * 14) + 7) >> 3;
        if (i5 > i2) {
            return 0;
        }
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        int i32 = 0;
        while (i6 < i3) {
            int i33 = i32 + 1;
            i21 = (i21 << 8) | (bArr[i32] & UnsignedBytes.MAX_VALUE);
            int i43 = i22 + 8;
            if (i43 >= 14) {
                i22 -= 6;
                int i59 = (i21 >>> i22) & 16383;
                if (i59 >= 12289) {
                    return 0;
                }
                sArr[i6] = (short) i59;
                i6++;
            } else {
                i22 = i43;
            }
            i32 = i33;
        }
        if ((((1 << i22) - 1) & i21) != 0) {
            return 0;
        }
        return i5;
    }

    public static int modq_encode(byte[] bArr, int i, short[] sArr, int i2) {
        int i3 = 1;
        int i5 = 1 << i2;
        for (int i6 = 0; i6 < i5; i6++) {
            if ((65535 & sArr[i6]) >= 12289) {
                return 0;
            }
        }
        int i21 = ((i5 * 14) + 7) >> 3;
        if (bArr != null) {
            if (i21 > i) {
                return 0;
            }
            int i22 = 0;
            int i32 = 0;
            for (int i33 = 0; i33 < i5; i33++) {
                i32 = (i32 << 14) | (sArr[i33] & HPKE.aead_EXPORT_ONLY);
                i22 += 14;
                while (i22 >= 8) {
                    i22 -= 8;
                    bArr[i3] = (byte) (i32 >> i22);
                    i3++;
                }
            }
            if (i22 > 0) {
                bArr[i3] = (byte) (i32 << (8 - i22));
            }
        }
        return i21;
    }

    public static int trim_i8_decode(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i5) {
        int i6 = 1 << i;
        int i21 = ((i6 * i2) + 7) >> 3;
        if (i21 > i5) {
            return 0;
        }
        int i22 = (1 << i2) - 1;
        int i32 = 1 << (i2 - 1);
        int i33 = 0;
        int i43 = 0;
        int i59 = 0;
        while (i33 < i6) {
            int i66 = i3 + 1;
            i43 = (i43 << 8) | (bArr2[i3] & 255);
            i59 += 8;
            while (i59 >= i2 && i33 < i6) {
                i59 -= i2;
                int i74 = (i43 >>> i59) & i22;
                int i92 = i74 | (-(i74 & i32));
                if (i92 == (-i32)) {
                    return 0;
                }
                bArr[i33] = (byte) i92;
                i33++;
            }
            i3 = i66;
        }
        if ((((1 << i59) - 1) & i43) != 0) {
            return 0;
        }
        return i21;
    }

    public static int trim_i8_encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i5) {
        int i6 = 1 << i3;
        int i21 = (1 << (i5 - 1)) - 1;
        int i22 = -i21;
        for (int i32 = 0; i32 < i6; i32++) {
            int i33 = bArr2[i32];
            if (i33 < i22 || i33 > i21) {
                return 0;
            }
        }
        int i43 = ((i6 * i5) + 7) >> 3;
        if (bArr != null) {
            if (i43 > i2) {
                return 0;
            }
            int i59 = (1 << i5) - 1;
            int i66 = 0;
            int i74 = 0;
            for (int i92 = 0; i92 < i6; i92++) {
                i74 = (i74 << i5) | (bArr2[i92] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & i59);
                i66 += i5;
                while (i66 >= 8) {
                    i66 -= 8;
                    bArr[i] = (byte) (i74 >>> i66);
                    i++;
                }
            }
            if (i66 > 0) {
                bArr[i] = (byte) (i74 << (8 - i66));
            }
        }
        return i43;
    }
}
