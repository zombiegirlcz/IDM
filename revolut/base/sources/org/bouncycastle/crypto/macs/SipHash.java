package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f228449c;
    protected final int d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected long f228450k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    protected long f228451k1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f228452m;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected long f228453v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    protected long f228454v1;
    protected long v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    protected long f228455v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f228452m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f228449c = 2;
        this.d = 4;
    }

    public static long rotateLeft(long j2, int i) {
        return (j2 >>> (-i)) | (j2 << i);
    }

    public void applySipRounds(int i) {
        long jRotateLeft = this.f228453v0;
        long jRotateLeft2 = this.f228454v1;
        long jRotateLeft3 = this.v2;
        long jRotateLeft4 = this.f228455v3;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = jRotateLeft + jRotateLeft2;
            long j3 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j2;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j3;
            long j5 = j3 + jRotateLeft5;
            jRotateLeft = rotateLeft(j2, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j5;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j5, 32);
        }
        this.f228453v0 = jRotateLeft;
        this.f228454v1 = jRotateLeft2;
        this.v2 = jRotateLeft3;
        this.f228455v3 = jRotateLeft4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        Pack.longToLittleEndian(doFinal(), bArr, i);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f228449c + "-" + this.d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f228450k0 = Pack.littleEndianToLong(key, 0);
        this.f228451k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.f228455v3 ^= this.f228452m;
        applySipRounds(this.f228449c);
        this.f228453v0 ^= this.f228452m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j2 = this.f228450k0;
        this.f228453v0 = 8317987319222330741L ^ j2;
        long j3 = this.f228451k1;
        this.f228454v1 = 7237128888997146477L ^ j3;
        this.v2 = j2 ^ 7816392313619706465L;
        this.f228455v3 = 8387220255154660723L ^ j3;
        this.f228452m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b4) throws IllegalStateException {
        this.f228452m = (this.f228452m >>> 8) | ((((long) b4) & 255) << 56);
        int i = this.wordPos + 1;
        this.wordPos = i;
        if (i == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i, int i2) {
        this.f228452m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f228449c = i;
        this.d = i2;
    }

    public long doFinal() throws IllegalStateException, DataLengthException {
        long j2 = this.f228452m;
        int i = this.wordPos;
        this.f228452m = ((j2 >>> ((7 - i) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i)) & 255) << 56);
        processMessageWord();
        this.v2 ^= 255;
        applySipRounds(this.d);
        long j3 = ((this.f228453v0 ^ this.f228454v1) ^ this.v2) ^ this.f228455v3;
        reset();
        return j3;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        int i3 = i2 & (-8);
        int i5 = this.wordPos;
        char c2 = '8';
        long j2 = 255;
        int i6 = 0;
        if (i5 == 0) {
            while (i6 < i3) {
                this.f228452m = Pack.littleEndianToLong(bArr, i + i6);
                processMessageWord();
                i6 += 8;
            }
            while (i6 < i2) {
                long j3 = this.f228452m >>> 8;
                this.f228452m = j3;
                this.f228452m = j3 | ((((long) bArr[i + i6]) & 255) << 56);
                i6++;
            }
            this.wordPos = i2 - i3;
            return;
        }
        int i21 = i5 << 3;
        int i22 = 0;
        while (i22 < i3) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i + i22);
            this.f228452m = (this.f228452m >>> (-i21)) | (jLittleEndianToLong << i21);
            processMessageWord();
            this.f228452m = jLittleEndianToLong;
            i22 += 8;
            c2 = c2;
            j2 = j2;
        }
        char c3 = c2;
        long j5 = j2;
        while (i22 < i2) {
            long j16 = this.f228452m >>> 8;
            this.f228452m = j16;
            this.f228452m = j16 | ((((long) bArr[i + i22]) & j5) << c3);
            int i32 = this.wordPos + 1;
            this.wordPos = i32;
            if (i32 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i22++;
        }
    }
}
