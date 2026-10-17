package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class Blake2sDigest implements ExtendedDigest {
    private static final int BLOCK_LENGTH_BYTES = 64;
    private static final int ROUNDS = 10;
    private static final int[] blake2s_IV = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] blake2s_sigma = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};
    private final byte[] buffer;
    private int bufferPos;
    private final int[] chainValue;
    private int depth;
    private int digestLength;
    private int f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f228305f1;
    private int fanout;
    private int innerHashLength;
    private final int[] internalState;
    private boolean isLastNode;
    private byte[] key;
    private int keyLength;
    private int leafLength;
    private int nodeDepth;
    private long nodeOffset;
    private byte[] personalization;
    private final CryptoServicePurpose purpose;
    private byte[] salt;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f228306t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private int f228307t1;

    public Blake2sDigest() {
        this(256, CryptoServicePurpose.ANY);
    }

    private void G(int i, int i2, int i3, int i5, int i6, int i21) {
        int[] iArr = this.internalState;
        int i22 = iArr[i3] + iArr[i5] + i;
        iArr[i3] = i22;
        iArr[i21] = Integers.rotateRight(iArr[i21] ^ i22, 16);
        int[] iArr2 = this.internalState;
        int i32 = iArr2[i6] + iArr2[i21];
        iArr2[i6] = i32;
        iArr2[i5] = Integers.rotateRight(i32 ^ iArr2[i5], 12);
        int[] iArr3 = this.internalState;
        int i33 = iArr3[i3] + iArr3[i5] + i2;
        iArr3[i3] = i33;
        iArr3[i21] = Integers.rotateRight(iArr3[i21] ^ i33, 8);
        int[] iArr4 = this.internalState;
        int i43 = iArr4[i6] + iArr4[i21];
        iArr4[i6] = i43;
        iArr4[i5] = Integers.rotateRight(i43 ^ iArr4[i5], 7);
    }

    private void compress(byte[] bArr, int i) {
        initializeInternalState();
        int[] iArr = new int[16];
        Pack.littleEndianToInt(bArr, i, iArr);
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            byte[][] bArr2 = blake2s_sigma;
            byte[] bArr3 = bArr2[i3];
            G(iArr[bArr3[0]], iArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i3];
            G(iArr[bArr4[2]], iArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i3];
            G(iArr[bArr5[4]], iArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i3];
            G(iArr[bArr6[6]], iArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i3];
            G(iArr[bArr7[8]], iArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i3];
            G(iArr[bArr8[10]], iArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i3];
            G(iArr[bArr9[12]], iArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i3];
            G(iArr[bArr10[14]], iArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.chainValue;
            if (i2 >= iArr2.length) {
                return;
            }
            int i5 = iArr2[i2];
            int[] iArr3 = this.internalState;
            iArr2[i2] = (i5 ^ iArr3[i2]) ^ iArr3[i2 + 8];
            i2++;
        }
    }

    private void incrementCounter(int i) {
        int i2 = this.f228306t0 + i;
        this.f228306t0 = i2;
        if (Integers.compareUnsigned(i2, i) < 0) {
            this.f228307t1++;
        }
    }

    private void init(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 != null && bArr3.length > 0) {
            int length = bArr3.length;
            this.keyLength = length;
            if (length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[length];
            this.key = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            System.arraycopy(bArr3, 0, this.buffer, 0, this.keyLength);
            this.bufferPos = 64;
        }
        int[] iArr = this.chainValue;
        int[] iArr2 = blake2s_IV;
        iArr[0] = iArr2[0] ^ ((this.digestLength | (this.keyLength << 8)) | ((this.fanout << 16) | (this.depth << 24)));
        iArr[1] = iArr2[1] ^ this.leafLength;
        long j2 = this.nodeOffset;
        iArr[2] = ((int) j2) ^ iArr2[2];
        int i = iArr2[3];
        iArr[3] = ((((int) (j2 >> 32)) | (this.nodeDepth << 16)) | (this.innerHashLength << 24)) ^ i;
        iArr[4] = iArr2[4];
        iArr[5] = iArr2[5];
        if (bArr != null) {
            if (bArr.length != 8) {
                throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
            }
            byte[] bArr5 = new byte[8];
            this.salt = bArr5;
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
            int[] iArr3 = this.chainValue;
            iArr3[4] = iArr3[4] ^ Pack.littleEndianToInt(bArr, 0);
            int[] iArr4 = this.chainValue;
            iArr4[5] = Pack.littleEndianToInt(bArr, 4) ^ iArr4[5];
        }
        int[] iArr5 = this.chainValue;
        iArr5[6] = iArr2[6];
        iArr5[7] = iArr2[7];
        if (bArr2 != null) {
            if (bArr2.length != 8) {
                throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
            }
            byte[] bArr6 = new byte[8];
            this.personalization = bArr6;
            System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
            int[] iArr6 = this.chainValue;
            iArr6[6] = Pack.littleEndianToInt(bArr2, 0) ^ iArr6[6];
            int[] iArr7 = this.chainValue;
            iArr7[7] = Pack.littleEndianToInt(bArr2, 4) ^ iArr7[7];
        }
    }

    private void initializeInternalState() {
        int[] iArr = this.chainValue;
        System.arraycopy(iArr, 0, this.internalState, 0, iArr.length);
        int[] iArr2 = blake2s_IV;
        System.arraycopy(iArr2, 0, this.internalState, this.chainValue.length, 4);
        int[] iArr3 = this.internalState;
        iArr3[12] = this.f228306t0 ^ iArr2[4];
        iArr3[13] = this.f228307t1 ^ iArr2[5];
        iArr3[14] = this.f0 ^ iArr2[6];
        iArr3[15] = iArr2[7] ^ this.f228305f1;
    }

    public void clearKey() {
        byte[] bArr = this.key;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(this.buffer, (byte) 0);
        }
    }

    public void clearSalt() {
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (i > bArr.length - this.digestLength) {
            throw new OutputLengthException("output buffer too short");
        }
        this.f0 = -1;
        if (this.isLastNode) {
            this.f228305f1 = -1;
        }
        int i2 = this.bufferPos;
        if (i2 > 0) {
            incrementCounter(i2);
        }
        compress(this.buffer, 0);
        int i3 = this.digestLength;
        int i5 = i3 >>> 2;
        int i6 = i3 & 3;
        Pack.intToLittleEndian(this.chainValue, 0, i5, bArr, i);
        if (i6 > 0) {
            Pack.intToLittleEndian_Low(this.chainValue[i5], bArr, (i + this.digestLength) - i6, i6);
        }
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.isLastNode = false;
        Arrays.fill(this.internalState, 0);
        Arrays.fill(this.buffer, (byte) 0);
        byte[] bArr = this.key;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 64;
        }
        init(this.salt, this.personalization, this.key);
    }

    public void setAsLastNode() {
        this.isLastNode = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        int i = this.bufferPos;
        if (64 - i != 0) {
            byte[] bArr = this.buffer;
            this.bufferPos = i + 1;
            bArr[i] = b4;
        } else {
            incrementCounter(64);
            compress(this.buffer, 0);
            Arrays.fill(this.buffer, (byte) 0);
            this.buffer[0] = b4;
            this.bufferPos = 1;
        }
    }

    public Blake2sDigest(int i) {
        this(i, CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i5 = this.bufferPos;
        if (i5 != 0) {
            i3 = 64 - i5;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.buffer, i5, i2);
                this.bufferPos += i2;
            } else {
                System.arraycopy(bArr, i, this.buffer, i5, i3);
                incrementCounter(64);
                compress(this.buffer, 0);
                this.bufferPos = 0;
                Arrays.fill(this.buffer, (byte) 0);
            }
        } else {
            i3 = 0;
        }
        int i6 = i2 + i;
        int i21 = i6 - 64;
        int i22 = i + i3;
        while (i22 < i21) {
            incrementCounter(64);
            compress(bArr, i22);
            i22 += 64;
        }
        i2 = i6 - i22;
        System.arraycopy(bArr, i22, this.buffer, 0, i2);
        this.bufferPos += i2;
    }

    public Blake2sDigest(int i, int i2, long j2) {
        this(i, i2, j2, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(int i, int i2, long j2, CryptoServicePurpose cryptoServicePurpose) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.isLastNode = false;
        this.buffer = new byte[64];
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = new int[8];
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        this.digestLength = i;
        this.nodeOffset = j2;
        this.fanout = 0;
        this.depth = 0;
        this.leafLength = i2;
        this.innerHashLength = i2;
        this.nodeDepth = 0;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i * 8, cryptoServicePurpose));
        init(null, null, null);
    }

    public Blake2sDigest(int i, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = new byte[64];
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = new int[8];
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.digestLength = i / 8;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i, cryptoServicePurpose));
        init(null, null, null);
    }

    public Blake2sDigest(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, long j2, CryptoServicePurpose cryptoServicePurpose) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = new byte[64];
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = new int[8];
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        this.digestLength = i;
        this.nodeOffset = j2;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i * 8, cryptoServicePurpose));
        init(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(Blake2sDigest blake2sDigest) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        byte[] bArr = new byte[64];
        this.buffer = bArr;
        this.bufferPos = 0;
        this.internalState = new int[16];
        int[] iArr = new int[8];
        this.chainValue = iArr;
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        System.arraycopy(blake2sDigest.chainValue, 0, iArr, 0, 8);
        System.arraycopy(blake2sDigest.buffer, 0, bArr, 0, 64);
        this.bufferPos = blake2sDigest.bufferPos;
        this.keyLength = blake2sDigest.keyLength;
        this.key = Arrays.clone(blake2sDigest.key);
        this.digestLength = blake2sDigest.digestLength;
        this.f228306t0 = blake2sDigest.f228306t0;
        this.f228307t1 = blake2sDigest.f228307t1;
        this.f0 = blake2sDigest.f0;
        this.salt = Arrays.clone(blake2sDigest.salt);
        this.personalization = Arrays.clone(blake2sDigest.personalization);
        this.fanout = blake2sDigest.fanout;
        this.depth = blake2sDigest.depth;
        this.leafLength = blake2sDigest.leafLength;
        this.nodeOffset = blake2sDigest.nodeOffset;
        this.nodeDepth = blake2sDigest.nodeDepth;
        this.innerHashLength = blake2sDigest.innerHashLength;
        this.purpose = blake2sDigest.purpose;
    }

    public Blake2sDigest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this(bArr, i, bArr2, bArr3, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = new byte[64];
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = new int[8];
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        if (i < 1 || i > 32) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 32)");
        }
        this.digestLength = i;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i * 8, cryptoServicePurpose));
        init(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = new byte[64];
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = new int[8];
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, bArr.length * 8, cryptoServicePurpose));
        init(null, null, bArr);
    }

    public Blake2sDigest(byte[] bArr, byte[] bArr2) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.isLastNode = false;
        this.buffer = new byte[64];
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = new int[8];
        this.f228306t0 = 0;
        this.f228307t1 = 0;
        this.f0 = 0;
        this.f228305f1 = 0;
        this.purpose = CryptoServicePurpose.ANY;
        this.digestLength = bArr2[0];
        this.keyLength = bArr2[1];
        this.fanout = bArr2[2];
        this.depth = bArr2[3];
        this.leafLength = Pack.littleEndianToInt(bArr2, 4);
        this.nodeOffset |= (long) Pack.littleEndianToInt(bArr2, 8);
        this.nodeDepth = bArr2[14];
        this.innerHashLength = bArr2[15];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 16, bArr3, 0, 8);
        System.arraycopy(bArr2, 24, bArr4, 0, 8);
        init(bArr3, bArr4, bArr);
    }
}
