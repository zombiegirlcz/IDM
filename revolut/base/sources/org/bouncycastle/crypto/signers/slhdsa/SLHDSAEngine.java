package org.bouncycastle.crypto.signers.slhdsa;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.generators.MGF1BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.MGFParameters;
import org.bouncycastle.crypto.params.SLHDSAParameters;
import org.bouncycastle.crypto.params.SLHDSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.SLHDSAPublicKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SLHDSAEngine {
    final int A;
    final int D;
    final int H;
    final int H_PRIME;
    final int K;
    final int N;
    final int WOTS_LEN;
    final int WOTS_LEN1;
    final int WOTS_LEN2;
    final int WOTS_LOGW;
    final int WOTS_W;

    public static class Sha2Engine extends SLHDSAEngine {

        /* JADX INFO: renamed from: bl, reason: collision with root package name */
        private final int f228574bl;
        private final byte[] hmacBuf;
        private final MGF1BytesGenerator mgf1;
        private final Digest msgDigest;
        private final byte[] msgDigestBuf;
        private Memoable msgMemo;
        private final Digest sha256;
        private final byte[] sha256Buf;
        private Memoable sha256Memo;
        private final HMac treeHMac;

        public Sha2Engine(int i, int i2, int i3, int i5, int i6, int i21) {
            int i22;
            super(i, i2, i3, i5, i6, i21);
            SHA256Digest sHA256Digest = new SHA256Digest();
            this.sha256 = sHA256Digest;
            this.sha256Buf = new byte[sHA256Digest.getDigestSize()];
            if (i == 16) {
                this.msgDigest = new SHA256Digest();
                this.treeHMac = new HMac(new SHA256Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA256Digest());
                i22 = 64;
            } else {
                this.msgDigest = new SHA512Digest();
                this.treeHMac = new HMac(new SHA512Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA512Digest());
                i22 = 128;
            }
            this.f228574bl = i22;
            this.hmacBuf = new byte[this.treeHMac.getMacSize()];
            this.msgDigestBuf = new byte[this.msgDigest.getDigestSize()];
        }

        private byte[] compressedADRS(ADRS adrs) {
            byte[] bArr = new byte[22];
            System.arraycopy(adrs.value, 3, bArr, 0, 1);
            System.arraycopy(adrs.value, 8, bArr, 1, 8);
            System.arraycopy(adrs.value, 19, bArr, 9, 1);
            System.arraycopy(adrs.value, 20, bArr, 10, 12);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.sha256).reset(this.sha256Memo);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, this.N);
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            int i = ((this.A * this.K) + 7) / 8;
            int i2 = this.H;
            int i3 = i2 / this.D;
            int i5 = i2 - i3;
            int i6 = (i3 + 7) / 8;
            int i21 = (i5 + 7) / 8;
            byte[] bArr6 = new byte[i + i6 + i21];
            byte[] bArr7 = new byte[this.msgDigest.getDigestSize()];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            if (bArr4 != null) {
                this.msgDigest.update(bArr4, 0, bArr4.length);
            }
            this.msgDigest.update(bArr5, 0, bArr5.length);
            this.msgDigest.doFinal(bArr7, 0);
            byte[] bArrBitmask = bitmask(Arrays.concatenate(bArr, bArr2, bArr7), bArr6);
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArrBitmask, i, bArr8, 8 - i21, i21);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr8, 0) & ((-1) >>> (64 - i5));
            byte[] bArr9 = new byte[4];
            System.arraycopy(bArrBitmask, i21 + i, bArr9, 4 - i6, i6);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr9, 0) & ((-1) >>> (32 - i3)), Arrays.copyOfRange(bArrBitmask, 0, i));
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            int length = bArr2.length;
            ((Memoable) this.sha256).reset(this.sha256Memo);
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, length);
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.treeHMac.init(new KeyParameter(bArr));
            this.treeHMac.update(bArr2, 0, bArr2.length);
            if (bArr3 != null) {
                this.treeHMac.update(bArr3, 0, bArr3.length);
            }
            this.treeHMac.update(bArr4, 0, bArr4.length);
            this.treeHMac.doFinal(this.hmacBuf, 0);
            return Arrays.copyOfRange(this.hmacBuf, 0, this.N);
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        public byte[] bitmask256(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(new SHA256Digest());
            mGF1BytesGenerator.init(new MGFParameters(bArr));
            mGF1BytesGenerator.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public void init(byte[] bArr) {
            byte[] bArr2 = new byte[this.f228574bl];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, this.f228574bl - this.N);
            this.msgMemo = ((Memoable) this.msgDigest).copy();
            this.msgDigest.reset();
            this.sha256.update(bArr, 0, bArr.length);
            this.sha256.update(bArr2, 0, 64 - bArr.length);
            this.sha256Memo = ((Memoable) this.sha256).copy();
            this.sha256.reset();
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }
    }

    public static class Shake256Engine extends SLHDSAEngine {
        private final Xof maskDigest;
        private final Xof treeDigest;

        public Shake256Engine(int i, int i2, int i3, int i5, int i6, int i21) {
            super(i, i2, i3, i5, i6, i21);
            this.treeDigest = new SHAKEDigest(256);
            this.maskDigest = new SHAKEDigest(256);
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i = this.N;
            byte[] bArr3 = new byte[i];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof2 = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof2.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i);
            return bArr3;
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int i = this.N;
            byte[] bArr4 = new byte[i];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof2 = this.treeDigest;
            byte[] bArr5 = adrs.value;
            xof2.update(bArr5, 0, bArr5.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            this.treeDigest.doFinal(bArr4, 0, i);
            return bArr4;
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            int i = ((this.A * this.K) + 7) / 8;
            int i2 = this.H;
            int i3 = i2 / this.D;
            int i5 = i2 - i3;
            int i6 = (i3 + 7) / 8;
            int i21 = (i5 + 7) / 8;
            int i22 = i + i6 + i21;
            byte[] bArr6 = new byte[i22];
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            if (bArr4 != null) {
                this.treeDigest.update(bArr4, 0, bArr4.length);
            }
            this.treeDigest.update(bArr5, 0, bArr5.length);
            this.treeDigest.doFinal(bArr6, 0, i22);
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr6, i, bArr7, 8 - i21, i21);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr7, 0) & ((-1) >>> (64 - i5));
            byte[] bArr8 = new byte[4];
            System.arraycopy(bArr6, i21 + i, bArr8, 4 - i6, i6);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr8, 0) & ((-1) >>> (32 - i3)), Arrays.copyOfRange(bArr6, 0, i));
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof2 = this.treeDigest;
            byte[] bArr3 = adrs.value;
            xof2.update(bArr3, 0, bArr3.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            int i = this.N;
            byte[] bArr4 = new byte[i];
            this.treeDigest.doFinal(bArr4, 0, i);
            return bArr4;
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            if (bArr3 != null) {
                this.treeDigest.update(bArr3, 0, bArr3.length);
            }
            this.treeDigest.update(bArr4, 0, bArr4.length);
            int i = this.N;
            byte[] bArr5 = new byte[i];
            this.treeDigest.doFinal(bArr5, 0, i);
            return bArr5;
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i = this.N;
            byte[] bArr3 = new byte[i];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof2 = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof2.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i);
            return bArr3;
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof2 = this.maskDigest;
            byte[] bArr4 = adrs.value;
            xof2.update(bArr4, 0, bArr4.length);
            this.maskDigest.doFinal(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        @Override // org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine
        public void init(byte[] bArr) {
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof2 = this.maskDigest;
            byte[] bArr5 = adrs.value;
            xof2.update(bArr5, 0, bArr5.length);
            this.maskDigest.doFinal(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }
    }

    public SLHDSAEngine(int i, int i2, int i3, int i5, int i6, int i21) {
        int i22;
        this.N = i;
        if (i2 == 16) {
            i22 = 4;
            this.WOTS_LOGW = 4;
            this.WOTS_LEN1 = (i * 8) / 4;
            if (i <= 8) {
                this.WOTS_LEN2 = 2;
            } else if (i <= 136) {
                this.WOTS_LEN2 = 3;
            } else {
                if (i > 256) {
                    throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.WOTS_LEN2 = i22;
            }
        } else {
            if (i2 != 256) {
                throw new IllegalArgumentException("wots_w assumed 16 or 256");
            }
            this.WOTS_LOGW = 8;
            this.WOTS_LEN1 = (i * 8) / 8;
            i22 = 1;
            if (i > 1) {
                if (i > 256) {
                    throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.WOTS_LEN2 = 2;
            }
            this.WOTS_LEN2 = i22;
        }
        this.WOTS_W = i2;
        this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
        this.D = i3;
        this.A = i5;
        this.K = i6;
        this.H = i21;
        this.H_PRIME = i21 / i3;
    }

    public static AsymmetricCipherKeyPair implGenerateKeyPair(SLHDSAParameters sLHDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SLHDSAEngine engine = sLHDSAParameters.getEngine();
        engine.init(bArr3);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SLHDSAPublicKeyParameters(sLHDSAParameters, Arrays.concatenate(bArr3, new HT(engine, bArr, bArr3).htPubKey)), (AsymmetricKeyParameter) new SLHDSAPrivateKeyParameters(sLHDSAParameters, bArr, bArr2, bArr3, new HT(engine, bArr, bArr3).htPubKey));
    }

    public static byte[] internalGenerateSignature(SLHDSAParameters sLHDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        SLHDSAEngine engine = sLHDSAParameters.getEngine();
        engine.init(bArr3);
        Fors fors = new Fors(engine);
        byte[] bArrPRF_msg = engine.PRF_msg(bArr2, bArr7, bArr5, bArr6);
        IndexedDigest indexedDigestH_msg = engine.H_msg(bArrPRF_msg, bArr3, bArr4, bArr5, bArr6);
        byte[] bArr8 = indexedDigestH_msg.digest;
        long j2 = indexedDigestH_msg.idx_tree;
        int i = indexedDigestH_msg.idx_leaf;
        ADRS adrs = new ADRS();
        adrs.setTypeAndClear(3);
        adrs.setTreeAddress(j2);
        adrs.setKeyPairAddress(i);
        SIG_FORS[] sig_forsArrSign = fors.sign(bArr8, bArr, bArr3, adrs);
        ADRS adrs2 = new ADRS();
        adrs2.setTypeAndClear(3);
        adrs2.setTreeAddress(j2);
        adrs2.setKeyPairAddress(i);
        byte[] bArrPkFromSig = fors.pkFromSig(sig_forsArrSign, bArr8, bArr3, adrs2);
        new ADRS().setTypeAndClear(2);
        byte[] bArrSign = new HT(engine, bArr, bArr3).sign(bArrPkFromSig, j2, i);
        int length = sig_forsArrSign.length;
        byte[][] bArr9 = new byte[length + 2][];
        int i2 = 0;
        bArr9[0] = bArrPRF_msg;
        while (i2 != sig_forsArrSign.length) {
            int i3 = i2 + 1;
            SIG_FORS sig_fors = sig_forsArrSign[i2];
            bArr9[i3] = Arrays.concatenate(sig_fors.sk, Arrays.concatenate(sig_fors.authPath));
            i2 = i3;
        }
        bArr9[length + 1] = bArrSign;
        return Arrays.concatenate(bArr9);
    }

    public static boolean internalVerifySignature(SLHDSAParameters sLHDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        SLHDSAEngine engine = sLHDSAParameters.getEngine();
        engine.init(bArr);
        ADRS adrs = new ADRS();
        int i = engine.K;
        int i2 = engine.A;
        int i3 = ((i2 + 1) * i) + 1 + engine.H;
        int i5 = engine.D;
        int i6 = engine.WOTS_LEN;
        int i21 = engine.N;
        if (((i5 * i6) + i3) * i21 != bArr5.length) {
            return false;
        }
        SIG sig2 = new SIG(i21, i, i2, i5, engine.H_PRIME, i6, bArr5);
        byte[] r2 = sig2.getR();
        SIG_FORS[] sig_fors = sig2.getSIG_FORS();
        SIG_XMSS[] sig_ht = sig2.getSIG_HT();
        IndexedDigest indexedDigestH_msg = engine.H_msg(r2, bArr, bArr2, bArr3, bArr4);
        byte[] bArr6 = indexedDigestH_msg.digest;
        long j2 = indexedDigestH_msg.idx_tree;
        int i22 = indexedDigestH_msg.idx_leaf;
        adrs.setTypeAndClear(3);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j2);
        adrs.setKeyPairAddress(i22);
        byte[] bArrPkFromSig = new Fors(engine).pkFromSig(sig_fors, bArr6, bArr, adrs);
        adrs.setTypeAndClear(2);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j2);
        adrs.setKeyPairAddress(i22);
        return new HT(engine, null, bArr).verify(bArrPkFromSig, sig_ht, bArr, j2, i22, bArr2);
    }

    public abstract byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3);

    public abstract IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public abstract byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs);

    public abstract byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public abstract byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract void init(byte[] bArr);
}
