package org.bouncycastle.crypto.macs;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f228440h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f228441h1;
    private int h2;
    private int h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private int f228442h4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f228443k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f228444k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private int f228445k2;
    private int k3;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f228446r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f228447r1;
    private int r2;
    private int r3;
    private int r4;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f228448s1;
    private int s2;
    private int s3;
    private int s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i, int i2) {
        return (((long) i) & BodyPartID.bodyIdMax) * ((long) i2);
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.currentBlock[i2] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j2 = jLittleEndianToInt & BodyPartID.bodyIdMax;
        long jLittleEndianToInt2 = ((long) Pack.littleEndianToInt(this.currentBlock, 4)) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt3 = ((long) Pack.littleEndianToInt(this.currentBlock, 8)) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt4 = BodyPartID.bodyIdMax & ((long) Pack.littleEndianToInt(this.currentBlock, 12));
        int i3 = (int) (((long) this.f228440h0) + (jLittleEndianToInt & 67108863));
        this.f228440h0 = i3;
        this.f228441h1 = (int) (((long) this.f228441h1) + ((((jLittleEndianToInt2 << 32) | j2) >>> 26) & 67108863));
        this.h2 = (int) (((long) this.h2) + (((jLittleEndianToInt2 | (jLittleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.h3 = (int) (((long) this.h3) + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i5 = (int) (((long) this.f228442h4) + (jLittleEndianToInt4 >>> 8));
        this.f228442h4 = i5;
        if (this.currentBlockOffset == 16) {
            this.f228442h4 = i5 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i3, this.f228446r0) + mul32x32_64(this.f228441h1, this.s4) + mul32x32_64(this.h2, this.s3) + mul32x32_64(this.h3, this.s2) + mul32x32_64(this.f228442h4, this.f228448s1);
        long jMul32x32_642 = mul32x32_64(this.f228440h0, this.f228447r1) + mul32x32_64(this.f228441h1, this.f228446r0) + mul32x32_64(this.h2, this.s4) + mul32x32_64(this.h3, this.s3) + mul32x32_64(this.f228442h4, this.s2);
        long jMul32x32_643 = mul32x32_64(this.f228440h0, this.r2) + mul32x32_64(this.f228441h1, this.f228447r1) + mul32x32_64(this.h2, this.f228446r0) + mul32x32_64(this.h3, this.s4) + mul32x32_64(this.f228442h4, this.s3);
        long jMul32x32_644 = mul32x32_64(this.f228440h0, this.r3) + mul32x32_64(this.f228441h1, this.r2) + mul32x32_64(this.h2, this.f228447r1) + mul32x32_64(this.h3, this.f228446r0) + mul32x32_64(this.f228442h4, this.s4);
        long jMul32x32_645 = mul32x32_64(this.f228440h0, this.r4) + mul32x32_64(this.f228441h1, this.r3) + mul32x32_64(this.h2, this.r2) + mul32x32_64(this.h3, this.f228447r1) + mul32x32_64(this.f228442h4, this.f228446r0);
        long j3 = jMul32x32_642 + (jMul32x32_64 >>> 26);
        long j5 = jMul32x32_643 + (j3 >>> 26);
        this.h2 = ((int) j5) & 67108863;
        long j16 = jMul32x32_644 + (j5 >>> 26);
        this.h3 = ((int) j16) & 67108863;
        long j22 = jMul32x32_645 + (j16 >>> 26);
        this.f228442h4 = ((int) j22) & 67108863;
        int i6 = (((int) (j22 >>> 26)) * 5) + (((int) jMul32x32_64) & 67108863);
        this.f228441h1 = (((int) j3) & 67108863) + (i6 >>> 26);
        this.f228440h0 = i6 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f228446r0 = 67108863 & iLittleEndianToInt;
        int i2 = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.f228447r1 = i2;
        int i3 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.r2 = i3;
        int i5 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.r3 = i5;
        int i6 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.r4 = i6;
        this.f228448s1 = i2 * 5;
        this.s2 = i3 * 5;
        this.s3 = i5 * 5;
        this.s4 = i6 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i = 0;
            bArr = bArr3;
        }
        this.f228443k0 = Pack.littleEndianToInt(bArr, i);
        this.f228444k1 = Pack.littleEndianToInt(bArr, i + 4);
        this.f228445k2 = Pack.littleEndianToInt(bArr, i + 8);
        this.k3 = Pack.littleEndianToInt(bArr, i + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        if (i + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i2 = this.f228441h1;
        int i3 = this.f228440h0;
        int i5 = i2 + (i3 >>> 26);
        int i6 = this.h2 + (i5 >>> 26);
        int i21 = this.h3 + (i6 >>> 26);
        int i22 = i6 & 67108863;
        int i32 = this.f228442h4 + (i21 >>> 26);
        int i33 = i21 & 67108863;
        int i43 = ((i32 >>> 26) * 5) + (i3 & 67108863);
        int i59 = i32 & 67108863;
        int i66 = (i5 & 67108863) + (i43 >>> 26);
        int i74 = i43 & 67108863;
        int i92 = i74 + 5;
        int i96 = (i92 >>> 26) + i66;
        int i99 = (i96 >>> 26) + i22;
        int i100 = (i99 >>> 26) + i33;
        int i101 = 67108863 & i100;
        int i102 = ((i100 >>> 26) + i59) - 67108864;
        int i103 = (i102 >>> 31) - 1;
        int i104 = ~i103;
        int i105 = (i74 & i104) | (i92 & 67108863 & i103);
        this.f228440h0 = i105;
        int i106 = (i66 & i104) | (i96 & 67108863 & i103);
        this.f228441h1 = i106;
        int i107 = (i22 & i104) | (i99 & 67108863 & i103);
        this.h2 = i107;
        int i108 = (i101 & i103) | (i33 & i104);
        this.h3 = i108;
        int i109 = (i59 & i104) | (i102 & i103);
        this.f228442h4 = i109;
        long j2 = (((long) ((i106 << 26) | i105)) & BodyPartID.bodyIdMax) + (((long) this.f228443k0) & BodyPartID.bodyIdMax);
        long j3 = (((long) ((i106 >>> 6) | (i107 << 20))) & BodyPartID.bodyIdMax) + (((long) this.f228444k1) & BodyPartID.bodyIdMax);
        long j5 = (((long) ((i107 >>> 12) | (i108 << 14))) & BodyPartID.bodyIdMax) + (((long) this.f228445k2) & BodyPartID.bodyIdMax);
        long j16 = (((long) ((i108 >>> 18) | (i109 << 8))) & BodyPartID.bodyIdMax) + (((long) this.k3) & BodyPartID.bodyIdMax);
        Pack.intToLittleEndian((int) j2, bArr, i);
        long j22 = j3 + (j2 >>> 32);
        Pack.intToLittleEndian((int) j22, bArr, i + 4);
        long j42 = j5 + (j22 >>> 32);
        Pack.intToLittleEndian((int) j42, bArr, i + 8);
        Pack.intToLittleEndian((int) (j16 + (j42 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv2;
        if (this.cipher == null) {
            iv2 = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), iv2);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f228442h4 = 0;
        this.h3 = 0;
        this.h2 = 0;
        this.f228441h1 = 0;
        this.f228440h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b4) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b4;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i3 + i, this.currentBlock, this.currentBlockOffset, iMin);
            i3 += iMin;
            this.currentBlockOffset += iMin;
        }
    }
}
