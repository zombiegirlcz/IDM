package org.bouncycastle.crypto.digests;

import com.google.android.gms.nearby.uwb.RangingPosition;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class Blake2bDigest implements ExtendedDigest {
    private static final int BLOCK_LENGTH_BYTES = 128;
    private static final int ROUNDS = 12;
    private static final long[] blake2b_IV = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    private static final byte[][] blake2b_sigma = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    private final byte[] buffer;
    private int bufferPos;
    private final long[] chainValue;
    private int depth;
    private int digestLength;
    private long f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private long f228302f1;
    private int fanout;
    private int innerHashLength;
    private final long[] internalState;
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
    private long f228303t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private long f228304t1;

    public Blake2bDigest() {
        this(512, CryptoServicePurpose.ANY);
    }

    private void G(long j2, long j3, int i, int i2, int i3, int i5) {
        long[] jArr = this.internalState;
        long j5 = jArr[i] + jArr[i2] + j2;
        jArr[i] = j5;
        jArr[i5] = Longs.rotateRight(jArr[i5] ^ j5, 32);
        long[] jArr2 = this.internalState;
        long j16 = jArr2[i3] + jArr2[i5];
        jArr2[i3] = j16;
        jArr2[i2] = Longs.rotateRight(j16 ^ jArr2[i2], 24);
        long[] jArr3 = this.internalState;
        long j22 = jArr3[i] + jArr3[i2] + j3;
        jArr3[i] = j22;
        jArr3[i5] = Longs.rotateRight(jArr3[i5] ^ j22, 16);
        long[] jArr4 = this.internalState;
        long j42 = jArr4[i3] + jArr4[i5];
        jArr4[i3] = j42;
        jArr4[i2] = Longs.rotateRight(j42 ^ jArr4[i2], 63);
    }

    private void compress(byte[] bArr, int i) {
        initializeInternalState();
        long[] jArr = new long[16];
        Pack.littleEndianToLong(bArr, i, jArr);
        int i2 = 0;
        for (int i3 = 0; i3 < 12; i3++) {
            byte[][] bArr2 = blake2b_sigma;
            byte[] bArr3 = bArr2[i3];
            G(jArr[bArr3[0]], jArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i3];
            G(jArr[bArr4[2]], jArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i3];
            G(jArr[bArr5[4]], jArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i3];
            G(jArr[bArr6[6]], jArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i3];
            G(jArr[bArr7[8]], jArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i3];
            G(jArr[bArr8[10]], jArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i3];
            G(jArr[bArr9[12]], jArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i3];
            G(jArr[bArr10[14]], jArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.chainValue;
            if (i2 >= jArr2.length) {
                return;
            }
            long j2 = jArr2[i2];
            long[] jArr3 = this.internalState;
            jArr2[i2] = (j2 ^ jArr3[i2]) ^ jArr3[i2 + 8];
            i2++;
        }
    }

    private void incrementCounter(int i) {
        long j2 = i;
        long j3 = this.f228303t0 + j2;
        this.f228303t0 = j3;
        if (Longs.compareUnsigned(j3, j2) < 0) {
            this.f228304t1++;
        }
    }

    private void init() {
        long[] jArr = this.chainValue;
        long[] jArr2 = blake2b_IV;
        jArr[0] = jArr2[0] ^ ((long) ((this.digestLength | (this.keyLength << 8)) | (((this.fanout << 16) | (this.depth << 24)) | (this.leafLength << 32))));
        jArr[1] = jArr2[1] ^ this.nodeOffset;
        jArr[2] = jArr2[2] ^ ((long) (this.nodeDepth | (this.innerHashLength << 8)));
        jArr[3] = jArr2[3];
        long j2 = jArr2[4];
        jArr[4] = j2;
        jArr[5] = jArr2[5];
        byte[] bArr = this.salt;
        if (bArr != null) {
            jArr[4] = j2 ^ Pack.littleEndianToLong(bArr, 0);
            long[] jArr3 = this.chainValue;
            jArr3[5] = jArr3[5] ^ Pack.littleEndianToLong(this.salt, 8);
        }
        long[] jArr4 = this.chainValue;
        long j3 = jArr2[6];
        jArr4[6] = j3;
        jArr4[7] = jArr2[7];
        byte[] bArr2 = this.personalization;
        if (bArr2 != null) {
            jArr4[6] = Pack.littleEndianToLong(bArr2, 0) ^ j3;
            long[] jArr5 = this.chainValue;
            jArr5[7] = jArr5[7] ^ Pack.littleEndianToLong(this.personalization, 8);
        }
    }

    private void initializeInternalState() {
        long[] jArr = this.chainValue;
        System.arraycopy(jArr, 0, this.internalState, 0, jArr.length);
        long[] jArr2 = blake2b_IV;
        System.arraycopy(jArr2, 0, this.internalState, this.chainValue.length, 4);
        long[] jArr3 = this.internalState;
        jArr3[12] = this.f228303t0 ^ jArr2[4];
        jArr3[13] = this.f228304t1 ^ jArr2[5];
        jArr3[14] = this.f0 ^ jArr2[6];
        jArr3[15] = this.f228302f1 ^ jArr2[7];
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
        this.f0 = -1L;
        if (this.isLastNode) {
            this.f228302f1 = -1L;
        }
        int i2 = this.bufferPos;
        if (i2 > 0) {
            incrementCounter(i2);
        }
        compress(this.buffer, 0);
        int i3 = this.digestLength;
        int i5 = i3 >>> 3;
        int i6 = i3 & 7;
        Pack.longToLittleEndian(this.chainValue, 0, i5, bArr, i);
        if (i6 > 0) {
            Pack.longToLittleEndian_Low(this.chainValue[i5], bArr, (i + this.digestLength) - i6, i6);
        }
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.f0 = 0L;
        this.f228302f1 = 0L;
        this.f228303t0 = 0L;
        this.f228304t1 = 0L;
        this.isLastNode = false;
        Arrays.fill(this.internalState, 0L);
        Arrays.fill(this.buffer, (byte) 0);
        byte[] bArr = this.key;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 128;
        }
        init();
    }

    public void setAsLastNode() {
        this.isLastNode = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        int i = this.bufferPos;
        if (128 - i != 0) {
            byte[] bArr = this.buffer;
            this.bufferPos = i + 1;
            bArr[i] = b4;
        } else {
            incrementCounter(128);
            compress(this.buffer, 0);
            Arrays.fill(this.buffer, (byte) 0);
            this.buffer[0] = b4;
            this.bufferPos = 1;
        }
    }

    public Blake2bDigest(int i) {
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
            i3 = 128 - i5;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.buffer, i5, i2);
                this.bufferPos += i2;
            } else {
                System.arraycopy(bArr, i, this.buffer, i5, i3);
                incrementCounter(128);
                compress(this.buffer, 0);
                this.bufferPos = 0;
                Arrays.fill(this.buffer, (byte) 0);
            }
        } else {
            i3 = 0;
        }
        int i6 = i2 + i;
        int i21 = i6 + RangingPosition.RSSI_UNKNOWN;
        int i22 = i + i3;
        while (i22 < i21) {
            incrementCounter(128);
            compress(bArr, i22);
            i22 += 128;
        }
        i2 = i6 - i22;
        System.arraycopy(bArr, i22, this.buffer, 0, i2);
        this.bufferPos += i2;
    }

    public Blake2bDigest(int i, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 64;
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
        this.buffer = new byte[128];
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = new long[8];
        this.f228303t0 = 0L;
        this.f228304t1 = 0L;
        this.f0 = 0L;
        this.f228302f1 = 0L;
        this.purpose = cryptoServicePurpose;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.keyLength = 0;
        this.digestLength = i / 8;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i, cryptoServicePurpose));
        init();
    }

    public Blake2bDigest(Blake2bDigest blake2bDigest) {
        this.digestLength = 64;
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
        byte[] bArr = new byte[128];
        this.buffer = bArr;
        this.bufferPos = 0;
        this.internalState = new long[16];
        long[] jArr = new long[8];
        this.chainValue = jArr;
        this.f228303t0 = 0L;
        this.f228304t1 = 0L;
        this.f0 = 0L;
        this.f228302f1 = 0L;
        System.arraycopy(blake2bDigest.chainValue, 0, jArr, 0, 8);
        System.arraycopy(blake2bDigest.buffer, 0, bArr, 0, 128);
        this.bufferPos = blake2bDigest.bufferPos;
        this.keyLength = blake2bDigest.keyLength;
        this.key = Arrays.clone(blake2bDigest.key);
        this.digestLength = blake2bDigest.digestLength;
        this.personalization = Arrays.clone(blake2bDigest.personalization);
        this.salt = Arrays.clone(blake2bDigest.salt);
        this.f228303t0 = blake2bDigest.f228303t0;
        this.f228304t1 = blake2bDigest.f228304t1;
        this.f0 = blake2bDigest.f0;
        this.purpose = blake2bDigest.purpose;
    }

    public Blake2bDigest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public Blake2bDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this(bArr, i, bArr2, bArr3, CryptoServicePurpose.ANY);
    }

    public Blake2bDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 64;
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
        byte[] bArr4 = new byte[128];
        this.buffer = bArr4;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = new long[8];
        this.f228303t0 = 0L;
        this.f228304t1 = 0L;
        this.f0 = 0L;
        this.f228302f1 = 0L;
        this.purpose = cryptoServicePurpose;
        if (i < 1 || i > 64) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 64)");
        }
        this.digestLength = i;
        if (bArr2 != null) {
            if (bArr2.length != 16) {
                throw new IllegalArgumentException("salt length must be exactly 16 bytes");
            }
            byte[] bArr5 = new byte[16];
            this.salt = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        }
        if (bArr3 != null) {
            if (bArr3.length != 16) {
                throw new IllegalArgumentException("personalization length must be exactly 16 bytes");
            }
            byte[] bArr6 = new byte[16];
            this.personalization = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }
        if (bArr != null) {
            if (bArr.length > 64) {
                throw new IllegalArgumentException("Keys > 64 bytes are not supported");
            }
            byte[] bArr7 = new byte[bArr.length];
            this.key = bArr7;
            System.arraycopy(bArr, 0, bArr7, 0, bArr.length);
            this.keyLength = bArr.length;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            this.bufferPos = 128;
        }
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i * 8, cryptoServicePurpose));
        init();
    }

    public Blake2bDigest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 64;
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
        byte[] bArr2 = new byte[128];
        this.buffer = bArr2;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = new long[8];
        this.f228303t0 = 0L;
        this.f228304t1 = 0L;
        this.f0 = 0L;
        this.f228302f1 = 0L;
        if (bArr != null) {
            if (bArr.length > 64) {
                throw new IllegalArgumentException("Keys > 64 bytes are not supported");
            }
            byte[] bArr3 = new byte[bArr.length];
            this.key = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            this.keyLength = bArr.length;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.bufferPos = 128;
        }
        this.purpose = cryptoServicePurpose;
        this.digestLength = 64;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64 * 8, cryptoServicePurpose));
        init();
    }

    public Blake2bDigest(byte[] bArr, byte[] bArr2) {
        this.digestLength = 64;
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
        this.buffer = new byte[128];
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = new long[8];
        this.f228303t0 = 0L;
        this.f228304t1 = 0L;
        this.f0 = 0L;
        this.f228302f1 = 0L;
        this.purpose = CryptoServicePurpose.ANY;
        this.digestLength = bArr2[0];
        this.keyLength = bArr2[1];
        this.fanout = bArr2[2];
        this.depth = bArr2[3];
        this.leafLength = Pack.littleEndianToInt(bArr2, 4);
        this.nodeOffset |= (long) Pack.littleEndianToInt(bArr2, 8);
        this.nodeDepth = bArr2[16];
        this.innerHashLength = bArr2[17];
        init();
    }
}
