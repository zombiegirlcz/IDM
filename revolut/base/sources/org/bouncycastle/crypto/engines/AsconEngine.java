package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class AsconEngine extends AsconBaseEngine {
    private long K2;
    private final AsconParameters asconParameters;

    public enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128
    }

    public AsconEngine(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        int iOrdinal = asconParameters.ordinal();
        if (iOrdinal == 0) {
            this.KEY_SIZE = 20;
            this.BlockSize = 8;
            this.ASCON_IV = -6899501409222262784L;
            str = "Ascon-80pq AEAD";
        } else if (iOrdinal == 1) {
            this.KEY_SIZE = 16;
            this.BlockSize = 16;
            this.ASCON_IV = -9187330011336540160L;
            str = "Ascon-128a AEAD";
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("invalid parameter setting for ASCON AEAD");
            }
            this.KEY_SIZE = 16;
            this.BlockSize = 8;
            this.ASCON_IV = -9205344418435956736L;
            str = "Ascon-128 AEAD";
        }
        this.algorithmName = str;
        int i = this.BlockSize;
        this.f228339nr = i == 8 ? 6 : 8;
        this.AADBufferSize = i;
        this.dsep = 1L;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void ascon_aeadinit() {
        this.f228340p.set(this.ASCON_IV, this.K1, this.K2, this.N0, this.N1);
        if (this.KEY_SIZE == 20) {
            this.f228340p.f228341x0 ^= this.K0;
        }
        this.f228340p.p(12);
        if (this.KEY_SIZE == 20) {
            this.f228340p.f228343x2 ^= this.K0;
        }
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f228340p;
        asconPermutation.x3 ^= this.K1;
        asconPermutation.f228344x4 ^= this.K2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i);
    }

    public void finishData(AEADBaseEngine.State state) {
        AsconPermutationFriend.AsconPermutation asconPermutation;
        long j2;
        long j3;
        int iOrdinal = this.asconParameters.ordinal();
        if (iOrdinal == 0) {
            asconPermutation = this.f228340p;
            long j5 = asconPermutation.f228342x1;
            long j16 = this.K0 << 32;
            long j22 = this.K1;
            asconPermutation.f228342x1 = j5 ^ (j16 | (j22 >> 32));
            long j42 = asconPermutation.f228343x2;
            long j46 = j22 << 32;
            long j47 = this.K2;
            asconPermutation.f228343x2 = j42 ^ (j46 | (j47 >> 32));
            j2 = asconPermutation.x3;
            j3 = j47 << 32;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new IllegalStateException();
                }
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f228340p;
                asconPermutation2.f228342x1 ^= this.K1;
                asconPermutation2.f228343x2 ^= this.K2;
                this.f228340p.p(12);
                AsconPermutationFriend.AsconPermutation asconPermutation3 = this.f228340p;
                asconPermutation3.x3 ^= this.K1;
                asconPermutation3.f228344x4 ^= this.K2;
                this.m_state = state;
            }
            asconPermutation = this.f228340p;
            asconPermutation.f228343x2 ^= this.K1;
            j2 = asconPermutation.x3;
            j3 = this.K2;
        }
        asconPermutation.x3 = j2 ^ j3;
        this.f228340p.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation32 = this.f228340p;
        asconPermutation32.x3 ^= this.K1;
        asconPermutation32.f228344x4 ^= this.K2;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public String getAlgorithmVersion() {
        return "v1.2";
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i) {
        return super.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i) {
        return super.getUpdateOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long loadBytes(byte[] bArr, int i) {
        return Pack.bigEndianToLong(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long pad(int i) {
        return 128 << (56 - (i << 3));
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b4) {
        super.processAADByte(b4);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b4, byte[] bArr, int i) throws DataLengthException {
        return super.processByte(b4, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        byte[] bArr = this.m_aad;
        int i = this.m_aadPos;
        bArr[i] = -128;
        if (i < 8) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f228340p;
            asconPermutation.f228341x0 = (((-1) << (56 - (this.m_aadPos << 3))) & Pack.bigEndianToLong(bArr, 0)) ^ asconPermutation.f228341x0;
            return;
        }
        this.f228340p.f228341x0 ^= Pack.bigEndianToLong(bArr, 0);
        AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f228340p;
        asconPermutation2.f228342x1 = (((-1) << (56 - ((this.m_aadPos - 8) << 3))) & Pack.bigEndianToLong(this.m_aad, 8)) ^ asconPermutation2.f228342x1;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i >= 8) {
            long jBigEndianToLong = Pack.bigEndianToLong(bArr, 0);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f228340p;
            long j2 = asconPermutation.f228341x0 ^ jBigEndianToLong;
            asconPermutation.f228341x0 = j2;
            Pack.longToBigEndian(j2, bArr2, i2);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f228340p;
            asconPermutation2.f228341x0 = jBigEndianToLong;
            int i3 = i2 + 8;
            int i5 = i - 8;
            asconPermutation2.f228342x1 ^= pad(i5);
            if (i5 > 0) {
                long jBigEndianToLong_High = Pack.bigEndianToLong_High(bArr, 8, i5);
                AsconPermutationFriend.AsconPermutation asconPermutation3 = this.f228340p;
                long j3 = asconPermutation3.f228342x1 ^ jBigEndianToLong_High;
                asconPermutation3.f228342x1 = j3;
                Pack.longToBigEndian_High(j3, bArr2, i3, i5);
                AsconPermutationFriend.AsconPermutation asconPermutation4 = this.f228340p;
                asconPermutation4.f228342x1 = (asconPermutation4.f228342x1 & ((-1) >>> (i5 << 3))) ^ jBigEndianToLong_High;
            }
        } else {
            this.f228340p.f228341x0 ^= pad(i);
            if (i > 0) {
                long jBigEndianToLong_High2 = Pack.bigEndianToLong_High(bArr, 0, i);
                AsconPermutationFriend.AsconPermutation asconPermutation5 = this.f228340p;
                long j5 = asconPermutation5.f228341x0 ^ jBigEndianToLong_High2;
                asconPermutation5.f228341x0 = j5;
                Pack.longToBigEndian_High(j5, bArr2, i2, i);
                AsconPermutationFriend.AsconPermutation asconPermutation6 = this.f228340p;
                asconPermutation6.f228341x0 = (asconPermutation6.f228341x0 & ((-1) >>> (i << 3))) ^ jBigEndianToLong_High2;
            }
        }
        finishData(AEADBaseEngine.State.DecFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        long j2;
        if (i >= 8) {
            this.f228340p.f228341x0 ^= Pack.bigEndianToLong(bArr, 0);
            Pack.longToBigEndian(this.f228340p.f228341x0, bArr2, i2);
            i2 += 8;
            i -= 8;
            this.f228340p.f228342x1 ^= pad(i);
            if (i > 0) {
                this.f228340p.f228342x1 ^= Pack.bigEndianToLong_High(bArr, 8, i);
                j2 = this.f228340p.f228342x1;
                Pack.longToBigEndian_High(j2, bArr2, i2, i);
            }
        } else {
            this.f228340p.f228341x0 ^= pad(i);
            if (i > 0) {
                this.f228340p.f228341x0 ^= Pack.bigEndianToLong_High(bArr, 0, i);
                j2 = this.f228340p.f228341x0;
                Pack.longToBigEndian_High(j2, bArr2, i2, i);
            }
        }
        finishData(AEADBaseEngine.State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void setBytes(long j2, byte[] bArr, int i) {
        Pack.longToBigEndian(j2, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        long jBigEndianToLong;
        this.N0 = Pack.bigEndianToLong(bArr2, 0);
        this.N1 = Pack.bigEndianToLong(bArr2, 8);
        int i = this.KEY_SIZE;
        if (i == 16) {
            this.K1 = Pack.bigEndianToLong(bArr, 0);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 8);
        } else {
            if (i != 20) {
                throw new IllegalStateException();
            }
            this.K0 = Pack.bigEndianToInt(bArr, 0);
            this.K1 = Pack.bigEndianToLong(bArr, 4);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 12);
        }
        this.K2 = jBigEndianToLong;
    }
}
