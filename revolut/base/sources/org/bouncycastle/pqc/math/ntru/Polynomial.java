package org.bouncycastle.pqc.math.ntru;

import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Polynomial {
    public short[] coeffs;
    protected NTRUParameterSet params;

    public Polynomial(NTRUParameterSet nTRUParameterSet) {
        this.coeffs = new short[nTRUParameterSet.n()];
        this.params = nTRUParameterSet;
    }

    public static short bothNegativeMask(short s2, short s3) {
        return (short) ((s2 & s3) >>> 15);
    }

    public static byte mod3(byte b4) {
        return (byte) ((b4 & UnsignedBytes.MAX_VALUE) % 3);
    }

    public static int modQ(int i, int i2) {
        return i % i2;
    }

    private void r2InvToRqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int length = this.coeffs.length;
        for (int i = 0; i < length; i++) {
            polynomial3.coeffs[i] = (short) (-polynomial2.coeffs[i]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            this.coeffs[i2] = polynomial.coeffs[i2];
        }
        polynomial4.rqMul(this, polynomial3);
        short[] sArr = polynomial4.coeffs;
        sArr[0] = (short) (sArr[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr2 = polynomial4.coeffs;
        sArr2[0] = (short) (sArr2[0] + 2);
        rqMul(polynomial4, polynomial5);
        polynomial4.rqMul(this, polynomial3);
        short[] sArr3 = polynomial4.coeffs;
        sArr3[0] = (short) (sArr3[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr4 = polynomial4.coeffs;
        sArr4[0] = (short) (sArr4[0] + 2);
        rqMul(polynomial4, polynomial5);
    }

    public abstract void lift(Polynomial polynomial);

    public void mod3PhiN() {
        int iN = this.params.n();
        for (int i = 0; i < iN; i++) {
            short[] sArr = this.coeffs;
            sArr[i] = mod3((short) ((sArr[iN - 1] * 2) + sArr[i]));
        }
    }

    public void modQPhiN() {
        int iN = this.params.n();
        for (int i = 0; i < iN; i++) {
            short[] sArr = this.coeffs;
            sArr[i] = (short) (sArr[i] - sArr[iN - 1]);
        }
    }

    public void r2Inv(Polynomial polynomial) {
        r2Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqInv(Polynomial polynomial) {
        rqInv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void rqMul(Polynomial polynomial, Polynomial polynomial2) {
        int i;
        int length = this.coeffs.length;
        int i2 = 0;
        while (i2 < length) {
            this.coeffs[i2] = 0;
            for (int i3 = 1; i3 < length - i2; i3++) {
                short[] sArr = this.coeffs;
                sArr[i2] = (short) ((polynomial.coeffs[i2 + i3] * polynomial2.coeffs[length - i3]) + sArr[i2]);
            }
            int i5 = 0;
            while (true) {
                i = i2 + 1;
                if (i5 < i) {
                    short[] sArr2 = this.coeffs;
                    sArr2[i2] = (short) ((polynomial.coeffs[i2 - i5] * polynomial2.coeffs[i5]) + sArr2[i2]);
                    i5++;
                }
            }
            i2 = i;
        }
    }

    public void rqSumZeroFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        sqFromBytes(bArr);
        int i = length - 1;
        this.coeffs[i] = 0;
        for (int i2 = 0; i2 < this.params.packDegree(); i2++) {
            short[] sArr = this.coeffs;
            sArr[i] = (short) (sArr[i] - sArr[i2]);
        }
    }

    public byte[] rqSumZeroToBytes(int i) {
        return sqToBytes(i);
    }

    public void rqToS3(Polynomial polynomial) {
        int length = this.coeffs.length;
        for (int i = 0; i < length; i++) {
            this.coeffs[i] = (short) modQ(polynomial.coeffs[i] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sLogQ = (short) (this.coeffs[i] >>> (this.params.logQ() - 1));
            short[] sArr = this.coeffs;
            sArr[i] = (short) (sArr[i] + (sLogQ << (1 - (this.params.logQ() & 1))));
        }
        mod3PhiN();
    }

    public void s3FromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        for (int i = 0; i < this.params.packDegree() / 5; i++) {
            byte b4 = bArr[i];
            short[] sArr = this.coeffs;
            int i2 = i * 5;
            sArr[i2] = b4;
            int i3 = b4 & UnsignedBytes.MAX_VALUE;
            sArr[i2 + 1] = (short) ((i3 * 171) >>> 9);
            sArr[i2 + 2] = (short) ((i3 * 57) >>> 9);
            sArr[i2 + 3] = (short) ((i3 * 19) >>> 9);
            sArr[i2 + 4] = (short) ((i3 * Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1) >>> 14);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int iPackDegree = this.params.packDegree() / 5;
            byte b5 = bArr[iPackDegree];
            int i5 = 0;
            while (true) {
                int i6 = (iPackDegree * 5) + i5;
                if (i6 >= this.params.packDegree()) {
                    break;
                }
                this.coeffs[i6] = b5;
                b5 = (byte) (((b5 & UnsignedBytes.MAX_VALUE) * 171) >> 9);
                i5++;
            }
        }
        this.coeffs[length - 1] = 0;
        mod3PhiN();
    }

    public void s3Inv(Polynomial polynomial) {
        s3Inv(polynomial, this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial(), this.params.createPolynomial());
    }

    public void s3Mul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        mod3PhiN();
    }

    public void s3ToBytes(byte[] bArr, int i) {
        int iPackDegree = this.params.packDegree();
        int i2 = iPackDegree - 5;
        int i3 = 0;
        while (i3 <= i2) {
            short[] sArr = this.coeffs;
            int i5 = sArr[i3] & 255;
            int i6 = (sArr[i3 + 1] & 255) * 3;
            int i21 = (sArr[i3 + 2] & 255) * 9;
            bArr[i] = (byte) (i5 + i6 + i21 + ((sArr[i3 + 3] & 255) * 27) + ((sArr[i3 + 4] & 255) * 81));
            i3 += 5;
            i++;
        }
        if (i3 >= iPackDegree) {
            return;
        }
        int i22 = iPackDegree - 1;
        int i32 = this.coeffs[i22] & 255;
        while (true) {
            i22--;
            if (i22 < i3) {
                bArr[i] = (byte) i32;
                return;
            }
            i32 = (i32 * 3) + (this.coeffs[i22] & 255);
        }
    }

    public abstract void sqFromBytes(byte[] bArr);

    public void sqMul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        modQPhiN();
    }

    public abstract byte[] sqToBytes(int i);

    public void trinaryZqToZ3() {
        int length = this.coeffs.length;
        for (int i = 0; i < length; i++) {
            short[] sArr = this.coeffs;
            sArr[i] = (short) modQ(sArr[i] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short[] sArr2 = this.coeffs;
            short s2 = sArr2[i];
            sArr2[i] = (short) ((s2 ^ (s2 >>> (this.params.logQ() - 1))) & 3);
        }
    }

    public void z3ToZq() {
        int length = this.coeffs.length;
        for (int i = 0; i < length; i++) {
            short[] sArr = this.coeffs;
            short s2 = sArr[i];
            sArr[i] = (short) (s2 | ((-(s2 >>> 1)) & (this.params.q() - 1)));
        }
    }

    public static short mod3(short s2) {
        return (short) ((s2 & HPKE.aead_EXPORT_ONLY) % 3);
    }

    public void r2Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i;
        int length = this.coeffs.length;
        short s2 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i2 = 0; i2 < length; i2++) {
            polynomial2.coeffs[i2] = 1;
        }
        int i3 = 0;
        while (true) {
            i = length - 1;
            if (i3 >= i) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i3] = (short) ((sArr[i] ^ sArr[i3]) & 1);
            i3++;
        }
        polynomial3.coeffs[i] = 0;
        int i5 = 0;
        short s3 = 1;
        for (short s4 = 1; i5 < (i * 2) - s4; s4 = 1) {
            for (int i6 = i; i6 > 0; i6--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i6] = sArr2[i6 - 1];
            }
            polynomial4.coeffs[s2] = s2;
            short s6 = polynomial3.coeffs[s2];
            short s11 = (short) (polynomial2.coeffs[s2] & s6);
            int i21 = -s3;
            short sBothNegativeMask = bothNegativeMask((short) i21, (short) (-s6));
            s3 = (short) (((short) (s3 ^ ((i21 ^ s3) & sBothNegativeMask))) + s4);
            int i22 = s2;
            short s27 = s2;
            while (i22 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s37 = sArr3[i22];
                short s51 = s27;
                short[] sArr4 = polynomial3.coeffs;
                short s60 = (short) (sBothNegativeMask & (s37 ^ sArr4[i22]));
                sArr3[i22] = (short) (s37 ^ s60);
                sArr4[i22] = (short) (s60 ^ sArr4[i22]);
                short[] sArr5 = polynomial4.coeffs;
                short s61 = sArr5[i22];
                short[] sArr6 = polynomial5.coeffs;
                short s67 = (short) ((sArr6[i22] ^ s61) & sBothNegativeMask);
                sArr5[i22] = (short) (s61 ^ s67);
                sArr6[i22] = (short) (sArr6[i22] ^ s67);
                i22++;
                s27 = s51 == true ? 1 : 0;
            }
            short s73 = s27;
            for (int i32 = s27; i32 < length; i32++) {
                short[] sArr7 = polynomial3.coeffs;
                sArr7[i32] = (short) (sArr7[i32] ^ (polynomial2.coeffs[i32] & s11));
            }
            for (int i33 = s73; i33 < length; i33++) {
                short[] sArr8 = polynomial5.coeffs;
                sArr8[i33] = (short) (sArr8[i33] ^ (polynomial4.coeffs[i33] & s11));
            }
            int i43 = s73;
            while (i43 < i) {
                short[] sArr9 = polynomial3.coeffs;
                int i59 = i43 + 1;
                sArr9[i43] = sArr9[i59];
                i43 = i59;
            }
            polynomial3.coeffs[i] = s73;
            i5++;
            s2 = s73;
        }
        short s100 = s2;
        for (int i66 = s100; i66 < i; i66++) {
            this.coeffs[i66] = polynomial4.coeffs[(length - 2) - i66];
        }
        this.coeffs[i] = s100;
    }

    public void rqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        polynomial2.r2Inv(polynomial);
        r2InvToRqInv(polynomial2, polynomial, polynomial3, polynomial4, polynomial5);
    }

    public void s3Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i;
        int length = this.coeffs.length;
        short s2 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i2 = 0; i2 < length; i2++) {
            polynomial2.coeffs[i2] = 1;
        }
        int i3 = 0;
        while (true) {
            i = length - 1;
            if (i3 >= i) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i3] = mod3((short) (((sArr[i] & 3) * 2) + (sArr[i3] & 3)));
            i3++;
        }
        polynomial3.coeffs[i] = 0;
        int i5 = 0;
        short s3 = 1;
        for (short s4 = 1; i5 < (i * 2) - s4; s4 = 1) {
            for (int i6 = i; i6 > 0; i6--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i6] = sArr2[i6 - 1];
            }
            polynomial4.coeffs[s2] = s2;
            short sMod3 = mod3((byte) (polynomial3.coeffs[s2] * 2 * polynomial2.coeffs[s2]));
            int i21 = -s3;
            short sBothNegativeMask = bothNegativeMask((short) i21, (short) (-polynomial3.coeffs[s2]));
            s3 = (short) (((short) (s3 ^ ((i21 ^ s3) & sBothNegativeMask))) + s4);
            int i22 = s2;
            short s6 = s2;
            while (i22 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s11 = sArr3[i22];
                short s27 = s6;
                short[] sArr4 = polynomial3.coeffs;
                short s37 = (short) (sBothNegativeMask & (s11 ^ sArr4[i22]));
                sArr3[i22] = (short) (s11 ^ s37);
                sArr4[i22] = (short) (s37 ^ sArr4[i22]);
                short[] sArr5 = polynomial4.coeffs;
                short s51 = sArr5[i22];
                short[] sArr6 = polynomial5.coeffs;
                short s60 = (short) ((sArr6[i22] ^ s51) & sBothNegativeMask);
                sArr5[i22] = (short) (s51 ^ s60);
                sArr6[i22] = (short) (sArr6[i22] ^ s60);
                i22++;
                s6 = s27 == true ? 1 : 0;
            }
            short s61 = s6;
            for (int i32 = s6; i32 < length; i32++) {
                polynomial3.coeffs[i32] = mod3((byte) ((polynomial2.coeffs[i32] * sMod3) + r8[i32]));
            }
            for (int i33 = s61; i33 < length; i33++) {
                polynomial5.coeffs[i33] = mod3((byte) ((polynomial4.coeffs[i33] * sMod3) + r8[i33]));
            }
            int i43 = s61;
            while (i43 < i) {
                short[] sArr7 = polynomial3.coeffs;
                int i59 = i43 + 1;
                sArr7[i43] = sArr7[i59];
                i43 = i59;
            }
            polynomial3.coeffs[i] = s61;
            i5++;
            s2 = s61;
        }
        short s67 = s2;
        short s73 = polynomial2.coeffs[s67];
        for (int i66 = s67; i66 < i; i66++) {
            this.coeffs[i66] = mod3((byte) (polynomial4.coeffs[(length - 2) - i66] * s73));
        }
        this.coeffs[i] = s67;
    }

    public byte[] s3ToBytes(int i) {
        byte[] bArr = new byte[i];
        s3ToBytes(bArr, 0);
        return bArr;
    }
}
