package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    private static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int[] f228383x;

    public Salsa20Engine() {
        this(20);
    }

    private boolean limitExceeded() {
        int i = this.cW0 + 1;
        this.cW0 = i;
        if (i == 0) {
            int i2 = this.cW1 + 1;
            this.cW1 = i2;
            if (i2 == 0) {
                int i3 = this.cW2 + 1;
                this.cW2 = i3;
                if ((i3 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public static void salsaCore(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        char c2 = 3;
        int i6 = iArr[3];
        char c3 = 4;
        int i21 = iArr[4];
        char c5 = 5;
        int i22 = iArr[5];
        char c6 = 6;
        int i32 = iArr[6];
        int i33 = 7;
        int i43 = iArr[7];
        int i59 = iArr[8];
        int i66 = 9;
        int i74 = iArr[9];
        int i92 = iArr[10];
        int i96 = iArr[11];
        int i99 = iArr[12];
        int i100 = 13;
        int i101 = iArr[13];
        int i102 = iArr[14];
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i102;
        int iRotateLeft3 = i101;
        int iRotateLeft4 = i99;
        int iRotateLeft5 = i96;
        int iRotateLeft6 = i92;
        int i103 = i74;
        int i104 = i59;
        int i105 = i43;
        int i106 = i32;
        int iRotateLeft7 = i22;
        int i107 = i21;
        int i108 = i6;
        int i109 = i5;
        int i110 = i3;
        int iRotateLeft8 = i2;
        int i111 = i;
        while (true) {
            char c7 = c2;
            if (i111 <= 0) {
                char c16 = c3;
                char c26 = c5;
                char c28 = c6;
                iArr2[0] = iRotateLeft8 + iArr[0];
                iArr2[1] = i110 + iArr[1];
                iArr2[2] = i109 + iArr[2];
                iArr2[c7] = i108 + iArr[c7];
                iArr2[c16] = i107 + iArr[c16];
                iArr2[c26] = iRotateLeft7 + iArr[c26];
                iArr2[c28] = i106 + iArr[c28];
                iArr2[7] = i105 + iArr[7];
                iArr2[8] = i104 + iArr[8];
                iArr2[9] = i103 + iArr[9];
                iArr2[10] = iRotateLeft6 + iArr[10];
                iArr2[11] = iRotateLeft5 + iArr[11];
                iArr2[12] = iRotateLeft4 + iArr[12];
                iArr2[13] = iRotateLeft3 + iArr[13];
                iArr2[14] = iRotateLeft2 + iArr[14];
                iArr2[15] = iRotateLeft + iArr[15];
                return;
            }
            int iRotateLeft9 = Integers.rotateLeft(iRotateLeft8 + iRotateLeft4, i33) ^ i107;
            int iRotateLeft10 = i104 ^ Integers.rotateLeft(iRotateLeft9 + iRotateLeft8, i66);
            char c29 = c3;
            int iRotateLeft11 = iRotateLeft4 ^ Integers.rotateLeft(iRotateLeft10 + iRotateLeft9, i100);
            char c33 = c5;
            char c39 = c6;
            int iRotateLeft12 = iRotateLeft8 ^ Integers.rotateLeft(iRotateLeft11 + iRotateLeft10, 18);
            int iRotateLeft13 = i103 ^ Integers.rotateLeft(iRotateLeft7 + i110, i33);
            int iRotateLeft14 = iRotateLeft3 ^ Integers.rotateLeft(iRotateLeft13 + iRotateLeft7, i66);
            int iRotateLeft15 = Integers.rotateLeft(iRotateLeft14 + iRotateLeft13, i100) ^ i110;
            int iRotateLeft16 = Integers.rotateLeft(iRotateLeft15 + iRotateLeft14, 18) ^ iRotateLeft7;
            int iRotateLeft17 = iRotateLeft2 ^ Integers.rotateLeft(iRotateLeft6 + i106, 7);
            int iRotateLeft18 = i109 ^ Integers.rotateLeft(iRotateLeft17 + iRotateLeft6, 9);
            int iRotateLeft19 = i106 ^ Integers.rotateLeft(iRotateLeft18 + iRotateLeft17, 13);
            int iRotateLeft20 = iRotateLeft6 ^ Integers.rotateLeft(iRotateLeft19 + iRotateLeft18, 18);
            int iRotateLeft21 = i108 ^ Integers.rotateLeft(iRotateLeft + iRotateLeft5, 7);
            int iRotateLeft22 = i105 ^ Integers.rotateLeft(iRotateLeft21 + iRotateLeft, 9);
            int iRotateLeft23 = iRotateLeft5 ^ Integers.rotateLeft(iRotateLeft22 + iRotateLeft21, 13);
            int iRotateLeft24 = iRotateLeft ^ Integers.rotateLeft(iRotateLeft23 + iRotateLeft22, 18);
            int iRotateLeft25 = iRotateLeft15 ^ Integers.rotateLeft(iRotateLeft12 + iRotateLeft21, 7);
            int iRotateLeft26 = Integers.rotateLeft(iRotateLeft25 + iRotateLeft12, 9) ^ iRotateLeft18;
            int iRotateLeft27 = iRotateLeft21 ^ Integers.rotateLeft(iRotateLeft26 + iRotateLeft25, 13);
            iRotateLeft8 = iRotateLeft12 ^ Integers.rotateLeft(iRotateLeft27 + iRotateLeft26, 18);
            int iRotateLeft28 = Integers.rotateLeft(iRotateLeft16 + iRotateLeft9, 7) ^ iRotateLeft19;
            int iRotateLeft29 = Integers.rotateLeft(iRotateLeft28 + iRotateLeft16, 9) ^ iRotateLeft22;
            int iRotateLeft30 = iRotateLeft9 ^ Integers.rotateLeft(iRotateLeft29 + iRotateLeft28, 13);
            iRotateLeft7 = iRotateLeft16 ^ Integers.rotateLeft(iRotateLeft30 + iRotateLeft29, 18);
            iRotateLeft5 = iRotateLeft23 ^ Integers.rotateLeft(iRotateLeft20 + iRotateLeft13, 7);
            int iRotateLeft31 = Integers.rotateLeft(iRotateLeft5 + iRotateLeft20, 9) ^ iRotateLeft10;
            int iRotateLeft32 = Integers.rotateLeft(iRotateLeft31 + iRotateLeft5, 13) ^ iRotateLeft13;
            iRotateLeft6 = iRotateLeft20 ^ Integers.rotateLeft(iRotateLeft32 + iRotateLeft31, 18);
            iRotateLeft4 = iRotateLeft11 ^ Integers.rotateLeft(iRotateLeft24 + iRotateLeft17, 7);
            iRotateLeft3 = iRotateLeft14 ^ Integers.rotateLeft(iRotateLeft4 + iRotateLeft24, 9);
            iRotateLeft2 = iRotateLeft17 ^ Integers.rotateLeft(iRotateLeft3 + iRotateLeft4, 13);
            iRotateLeft = iRotateLeft24 ^ Integers.rotateLeft(iRotateLeft2 + iRotateLeft3, 18);
            i111 -= 2;
            i104 = iRotateLeft31;
            i110 = iRotateLeft25;
            i106 = iRotateLeft28;
            i107 = iRotateLeft30;
            i105 = iRotateLeft29;
            i103 = iRotateLeft32;
            c2 = c7;
            c3 = c29;
            c5 = c33;
            c6 = c39;
            i33 = 7;
            i109 = iRotateLeft26;
            i108 = iRotateLeft27;
            i66 = 9;
            i100 = 13;
        }
    }

    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f228383x);
        Pack.intToLittleEndian(this.f228383x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.rounds;
    }

    public long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[9]) << 32) | (((long) iArr[8]) & BodyPartID.bodyIdMax);
    }

    public int getNonceSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + ((long) this.index);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv2);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            byte[] key = ((KeyParameter) parameters).getKey();
            setKey(key, iv2);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z)));
        }
        reset();
        this.initialised = true;
    }

    public void packTauOrSigma(int i, int[] iArr, int i2) {
        int i3 = (i - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i2] = iArr2[i3];
        iArr[i2 + 1] = iArr2[i3 + 1];
        iArr[i2 + 2] = iArr2[i3 + 2];
        iArr[i2 + 3] = iArr2[i3 + 3];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (limitExceeded(i2)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i5 = 0; i5 < i2; i5++) {
            byte[] bArr3 = this.keyStream;
            int i6 = this.index;
            bArr2[i5 + i3] = (byte) (bArr3[i6] ^ bArr[i5 + i]);
            int i21 = (i6 + 1) & 63;
            this.index = i21;
            if (i21 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8];
        if (i == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i2 = i - 1;
        iArr[8] = i2;
        if (i2 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b4) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i = this.index;
        byte b5 = (byte) (b4 ^ bArr[i]);
        int i2 = (i + 1) & 63;
        this.index = i2;
        if (i2 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b5;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j2) {
        reset();
        return skip(j2);
    }

    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j2) {
        long j3;
        if (j2 >= 0) {
            if (j2 >= 64) {
                long j5 = j2 / 64;
                advanceCounter(j5);
                j3 = j2 - (j5 * 64);
            } else {
                j3 = j2;
            }
            int i = this.index;
            int i2 = (((int) j3) + i) & 63;
            this.index = i2;
            if (i2 < i) {
                advanceCounter();
            }
        } else {
            long j16 = -j2;
            if (j16 >= 64) {
                long j22 = j16 / 64;
                retreatCounter(j22);
                j16 -= j22 * 64;
            }
            for (long j42 = 0; j42 < j16; j42++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j2;
    }

    public Salsa20Engine(int i) {
        this.index = 0;
        this.engineState = new int[16];
        this.f228383x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i;
    }

    private boolean limitExceeded(int i) {
        int i2 = this.cW0 + i;
        this.cW0 = i2;
        if (i2 < i && i2 >= 0) {
            int i3 = this.cW1 + 1;
            this.cW1 = i3;
            if (i3 == 0) {
                int i5 = this.cW2 + 1;
                this.cW2 = i5;
                if ((i5 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void advanceCounter(long j2) {
        int i = (int) (j2 >>> 32);
        int i2 = (int) j2;
        if (i > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i;
        }
        int[] iArr2 = this.engineState;
        int i3 = iArr2[8];
        int i5 = i2 + i3;
        iArr2[8] = i5;
        if (i3 == 0 || i5 >= i3) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    public void retreatCounter(long j2) {
        int i = (int) (j2 >>> 32);
        int i2 = (int) j2;
        if (i != 0) {
            int[] iArr = this.engineState;
            int i3 = iArr[9];
            if ((((long) i3) & BodyPartID.bodyIdMax) < (((long) i) & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i3 - i;
        }
        int[] iArr2 = this.engineState;
        int i5 = iArr2[8];
        if ((((long) i5) & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & ((long) i2))) {
            iArr2[8] = i5 - i2;
            return;
        }
        int i6 = iArr2[9];
        if (i6 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i6 - 1;
        iArr2[8] = i5 - i2;
    }
}
