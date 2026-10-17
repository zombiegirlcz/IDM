package org.bouncycastle.pqc.legacy.picnic;

import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.logging.Logger;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.math.raw.Bits;
import org.bouncycastle.pqc.legacy.picnic.Signature;
import org.bouncycastle.pqc.legacy.picnic.Signature2;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class PicnicEngine {
    private static final Logger LOG = Logger.getLogger(PicnicEngine.class.getName());
    protected static final int LOWMC_MAX_AND_GATES = 1144;
    protected static final int LOWMC_MAX_KEY_BITS = 256;
    private static final int LOWMC_MAX_STATE_SIZE = 64;
    protected static final int LOWMC_MAX_WORDS = 16;
    private static final int MAX_AUX_BYTES = 176;
    private static final int MAX_DIGEST_SIZE = 64;
    private static final int PICNIC_MAX_LOWMC_BLOCK_SIZE = 32;
    private static final int TRANSFORM_FS = 0;
    private static final int TRANSFORM_INVALID = 255;
    private static final int TRANSFORM_UR = 1;
    private static final int WORD_SIZE_BITS = 32;
    protected static final int saltSizeBytes = 32;
    private final int CRYPTO_BYTES;
    private final int CRYPTO_PUBLICKEYBYTES;
    private final int CRYPTO_SECRETKEYBYTES;
    protected final int UnruhGWithInputBytes;
    protected final int UnruhGWithoutInputBytes;
    protected final int andSizeBytes;
    protected final Xof digest;
    protected final int digestSizeBytes;
    protected final LowmcConstants lowmcConstants;
    protected final int numMPCParties;
    protected final int numMPCRounds;
    protected final int numOpenedRounds;
    protected final int numRounds;
    protected final int numSboxes;
    private final int parameters;
    protected final int pqSecurityLevel;
    protected final int seedSizeBytes;
    private int signatureLength;
    protected final int stateSizeBits;
    protected final int stateSizeBytes;
    protected final int stateSizeWords;
    private final int transform;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PicnicEngine(int r17, org.bouncycastle.pqc.legacy.picnic.LowmcConstants r18) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.picnic.PicnicEngine.<init>(int, org.bouncycastle.pqc.legacy.picnic.LowmcConstants):void");
    }

    private void Commit(byte[] bArr, int i, View view, byte[] bArr2) {
        this.digest.update((byte) 4);
        this.digest.update(bArr, i, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update((byte) 0);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.outputShare), 0, this.stateSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
    }

    private void G(int i, byte[] bArr, int i2, View view, byte[] bArr2) {
        int i3 = this.seedSizeBytes + this.andSizeBytes;
        this.digest.update((byte) 5);
        this.digest.update(bArr, i2, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        if (i == 2) {
            this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
            i3 += this.stateSizeBytes;
        }
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(i3), 0, 2);
        this.digest.doFinal(bArr2, 0, i3);
    }

    private void H3(int[] iArr, int[] iArr2, View[][] viewArr, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i = 0; i < this.numMPCRounds; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                Pack.intToLittleEndian(viewArr[i][i2].outputShare, bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private void HCP(byte[] bArr, int[] iArr, int[] iArr2, byte[][] bArr2, byte[] bArr3, byte[] bArr4, int[] iArr3, int[] iArr4, byte[] bArr5) {
        for (int i = 0; i < this.numMPCRounds; i++) {
            this.digest.update(bArr2[i], 0, this.digestSizeBytes);
        }
        byte[] bArr6 = new byte[32];
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr4, 0, 32);
        updateDigest(iArr3, bArr6);
        updateDigest(iArr4, bArr6);
        this.digest.update(bArr5, 0, bArr5.length);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
        if (iArr == null || iArr2 == null) {
            return;
        }
        expandChallengeHash(bArr, iArr, iArr2);
    }

    private void LowMCEnc(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        if (iArr != iArr2) {
            System.arraycopy(iArr, 0, iArr2, 0, this.stateSizeWords);
        }
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr2, iArr2, iArr4, 0);
        for (int i = 1; i <= this.numRounds; i++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i);
            matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            substitution(iArr2);
            int i2 = i - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i2);
            matrix_mul(iArr2, iArr2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i2);
            xor_array(iArr2, iArr2, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            xor_array(iArr2, iArr2, iArr4, 0);
        }
    }

    public static int appendUnique(int[] iArr, int i, int i2) {
        if (i2 == 0) {
            iArr[i2] = i;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == i) {
                    return i2;
                }
            }
            iArr[i2] = i;
        }
        return i2 + 1;
    }

    private boolean arePaddingBitsZero(byte[] bArr, int i) {
        int iNumBytes = Utils.numBytes(i);
        while (i < iNumBytes * 8) {
            if (Utils.getBit(bArr, i) != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    private void aux_mpc_AND(int i, int i2, int i3, Tape tape) {
        int i5 = this.numMPCParties - 1;
        Utils.setBit(tape.tapes[i5], tape.pos - 1, (byte) ((((i & i2) ^ (Utils.parity16(tape.tapesToWord()) ^ Utils.getBit(tape.tapes[i5], tape.pos - 1))) ^ i3) & 255));
    }

    public static int bitsToChunks(int i, byte[] bArr, int i2, int[] iArr) {
        int i3 = i2 * 8;
        if (i > i3) {
            return 0;
        }
        int i5 = i3 / i;
        for (int i6 = 0; i6 < i5; i6++) {
            iArr[i6] = 0;
            for (int i21 = 0; i21 < i; i21++) {
                iArr[i6] = iArr[i6] + (Utils.getBit(bArr, (i6 * i) + i21) << i21);
            }
        }
        return i5;
    }

    private void commit(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2) {
        this.digest.update(bArr2, 0, this.seedSizeBytes);
        if (bArr3 != null) {
            this.digest.update(bArr3, 0, this.andSizeBytes);
        }
        this.digest.update(bArr4, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i2), 0, 2);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_h(byte[] bArr, byte[][] bArr2) {
        for (int i = 0; i < this.numMPCParties; i++) {
            this.digest.update(bArr2[i], 0, this.digestSizeBytes);
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_v(byte[] bArr, byte[] bArr2, Msg msg) {
        this.digest.update(bArr2, 0, this.stateSizeBytes);
        for (int i = 0; i < this.numMPCParties; i++) {
            this.digest.update(msg.msgs[i], 0, Utils.numBytes(msg.pos));
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void computeSaltAndRootSeed(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr2, 0, bArr2.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        Pack.shortToLittleEndian((short) this.stateSizeBits, bArr3, 0);
        this.digest.update(bArr3, 0, 2);
        this.digest.doFinal(bArr, 0, bArr.length);
    }

    private byte[] computeSeeds(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr) {
        byte[] bArr2 = new byte[(this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32];
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr, 0, bArr.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        this.digest.update(Pack.intToLittleEndian(this.stateSizeBits), 0, 2);
        this.digest.doFinal(bArr2, 0, (this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32);
        return bArr2;
    }

    private boolean contains(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private int countNonZeroChallenges(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        int i5 = 0;
        int iBitCount = 0;
        while (true) {
            int i6 = i3 + 16;
            i2 = this.numMPCRounds;
            if (i6 > i2) {
                break;
            }
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i3 >>> 2) + i);
            int i21 = iLittleEndianToInt >>> 1;
            i5 |= iLittleEndianToInt & i21;
            iBitCount += Integers.bitCount((iLittleEndianToInt ^ i21) & 1431655765);
            i3 = i6;
        }
        int i22 = (i2 - i3) * 2;
        if (i22 > 0) {
            int iLittleEndianToInt_Low = Pack.littleEndianToInt_Low(bArr, i + (i3 >>> 2), (i22 + 7) / 8) & Utils.getTrailingBitsMask(i22);
            int i32 = iLittleEndianToInt_Low >>> 1;
            i5 |= iLittleEndianToInt_Low & i32;
            iBitCount += Integers.bitCount((iLittleEndianToInt_Low ^ i32) & 1431655765);
        }
        if ((i5 & 1431655765) == 0) {
            return iBitCount;
        }
        return -1;
    }

    private boolean createRandomTape(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i5) {
        if (i5 < this.digestSizeBytes) {
            return false;
        }
        this.digest.update((byte) 2);
        this.digest.update(bArr, i, this.seedSizeBytes);
        this.digest.doFinal(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i2), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i3), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i5), 0, 2);
        this.digest.doFinal(bArr3, 0, i5);
        return true;
    }

    private void createRandomTapes(Tape tape, byte[][] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.andSizeBytes * 2;
        for (int i5 = 0; i5 < this.numMPCParties; i5++) {
            this.digest.update(bArr[i5 + i], 0, this.seedSizeBytes);
            this.digest.update(bArr2, 0, 32);
            this.digest.update(Pack.intToLittleEndian(i2), 0, 2);
            this.digest.update(Pack.intToLittleEndian(i5), 0, 2);
            this.digest.doFinal(tape.tapes[i5], 0, i3);
        }
    }

    private int deserializeSignature(Signature signature, byte[] bArr, int i, int i2) {
        int iCountNonZeroChallenges;
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2);
        if (i < iNumBytes || (iCountNonZeroChallenges = countNonZeroChallenges(bArr, i2)) < 0) {
            return -1;
        }
        int i3 = this.stateSizeBytes * iCountNonZeroChallenges;
        int i5 = this.numMPCRounds;
        int iA = (((this.seedSizeBytes * 2) + this.andSizeBytes + this.digestSizeBytes) * i5) + iNumBytes + 32 + i3;
        if (this.transform == 1) {
            iA = (this.UnruhGWithoutInputBytes * iCountNonZeroChallenges) + a.a(i5, iCountNonZeroChallenges, this.UnruhGWithInputBytes, iA);
        }
        if (i != iA) {
            LOG.fine("sigBytesLen = " + i + ", expected bytesRequired = " + iA);
            return -1;
        }
        System.arraycopy(bArr, i2, bArr2, 0, iNumBytes);
        int i6 = i2 + iNumBytes;
        System.arraycopy(bArr, i6, signature.salt, 0, 32);
        int i21 = i6 + 32;
        for (int i22 = 0; i22 < this.numMPCRounds; i22++) {
            int challenge = getChallenge(bArr2, i22);
            System.arraycopy(bArr, i21, proofArr[i22].view3Commitment, 0, this.digestSizeBytes);
            int i32 = i21 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i33 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(bArr, i32, proofArr[i22].view3UnruhG, 0, i33);
                i32 += i33;
            }
            System.arraycopy(bArr, i32, proofArr[i22].communicatedBits, 0, this.andSizeBytes);
            int i43 = i32 + this.andSizeBytes;
            System.arraycopy(bArr, i43, proofArr[i22].seed1, 0, this.seedSizeBytes);
            int i59 = this.seedSizeBytes;
            int i66 = i43 + i59;
            System.arraycopy(bArr, i66, proofArr[i22].seed2, 0, i59);
            i21 = i66 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.littleEndianToInt(bArr, i21, proofArr[i22].inputShare, 0, this.stateSizeBytes / 4);
                int i74 = this.stateSizeBits;
                if (i74 == 129) {
                    proofArr[i22].inputShare[this.stateSizeWords - 1] = bArr[(this.stateSizeBytes + i21) - 1] & UnsignedBytes.MAX_VALUE;
                }
                i21 += this.stateSizeBytes;
                if (!arePaddingBitsZero(proofArr[i22].inputShare, i74)) {
                    return -1;
                }
            }
        }
        return 0;
    }

    private int deserializeSignature2(Signature2 signature2, byte[] bArr, int i, int i2) {
        Logger logger;
        String str;
        int i3 = this.digestSizeBytes;
        int i5 = i3 + 32;
        if (bArr.length < i5) {
            return -1;
        }
        System.arraycopy(bArr, i2, signature2.challengeHash, 0, i3);
        int i6 = i2 + this.digestSizeBytes;
        System.arraycopy(bArr, i6, signature2.salt, 0, 32);
        int i21 = i6 + 32;
        expandChallengeHash(signature2.challengeHash, signature2.challengeC, signature2.challengeP);
        int iRevealSeedsSize = new Tree(this, this.numMPCRounds, this.seedSizeBytes).revealSeedsSize(signature2.challengeC, this.numOpenedRounds);
        signature2.iSeedInfoLen = iRevealSeedsSize;
        int i22 = i5 + iRevealSeedsSize;
        int iOpenMerkleTreeSize = new Tree(this, this.numMPCRounds, this.digestSizeBytes).openMerkleTreeSize(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds);
        signature2.cvInfoLen = iOpenMerkleTreeSize;
        int i32 = i22 + iOpenMerkleTreeSize;
        int iRevealSeedsSize2 = new Tree(this, this.numMPCParties, this.seedSizeBytes).revealSeedsSize(new int[1], 1);
        for (int i33 = 0; i33 < this.numMPCRounds; i33++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i33)) {
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i33)] != this.numMPCParties - 1) {
                    i32 += this.andSizeBytes;
                }
                i32 = i32 + iRevealSeedsSize2 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (i == i32) {
            int i43 = signature2.iSeedInfoLen;
            byte[] bArr2 = new byte[i43];
            signature2.iSeedInfo = bArr2;
            System.arraycopy(bArr, i21, bArr2, 0, i43);
            int i59 = i21 + signature2.iSeedInfoLen;
            int i66 = signature2.cvInfoLen;
            byte[] bArr3 = new byte[i66];
            signature2.cvInfo = bArr3;
            System.arraycopy(bArr, i59, bArr3, 0, i66);
            int i74 = i59 + signature2.cvInfoLen;
            for (int i92 = 0; i92 < this.numMPCRounds; i92++) {
                if (contains(signature2.challengeC, this.numOpenedRounds, i92)) {
                    signature2.proofs[i92] = new Signature2.Proof2(this);
                    Signature2.Proof2 proof2 = signature2.proofs[i92];
                    proof2.seedInfoLen = iRevealSeedsSize2;
                    byte[] bArr4 = new byte[iRevealSeedsSize2];
                    proof2.seedInfo = bArr4;
                    System.arraycopy(bArr, i74, bArr4, 0, iRevealSeedsSize2);
                    int i96 = i74 + signature2.proofs[i92].seedInfoLen;
                    if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i92)] != this.numMPCParties - 1) {
                        System.arraycopy(bArr, i96, signature2.proofs[i92].aux, 0, this.andSizeBytes);
                        i96 += this.andSizeBytes;
                        if (!arePaddingBitsZero(signature2.proofs[i92].aux, this.numRounds * 3 * this.numSboxes)) {
                            logger = LOG;
                            str = "failed while deserializing aux bits";
                        }
                    }
                    System.arraycopy(bArr, i96, signature2.proofs[i92].input, 0, this.stateSizeBytes);
                    int i99 = i96 + this.stateSizeBytes;
                    int i100 = this.andSizeBytes;
                    System.arraycopy(bArr, i99, signature2.proofs[i92].msgs, 0, i100);
                    int i101 = i99 + i100;
                    if (arePaddingBitsZero(signature2.proofs[i92].msgs, this.numRounds * 3 * this.numSboxes)) {
                        System.arraycopy(bArr, i101, signature2.proofs[i92].C, 0, this.digestSizeBytes);
                        i74 = i101 + this.digestSizeBytes;
                    } else {
                        logger = LOG;
                        str = "failed while deserializing msgs bits";
                    }
                }
            }
            return 0;
        }
        logger = LOG;
        str = "sigLen = " + i + ", expected bytesRequired = " + i32;
        logger.fine(str);
        return -1;
    }

    private void expandChallengeHash(byte[] bArr, int[] iArr, int[] iArr2) {
        int iCeil_log2 = Utils.ceil_log2(this.numMPCRounds);
        int iCeil_log22 = Utils.ceil_log2(this.numMPCParties);
        int[] iArr3 = new int[(this.digestSizeBytes * 8) / Math.min(iCeil_log2, iCeil_log22)];
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, this.digestSizeBytes);
        int iAppendUnique = 0;
        while (iAppendUnique < this.numOpenedRounds) {
            int iBitsToChunks = bitsToChunks(iCeil_log2, bArr2, this.digestSizeBytes, iArr3);
            for (int i = 0; i < iBitsToChunks; i++) {
                int i2 = iArr3[i];
                if (i2 < this.numMPCRounds) {
                    iAppendUnique = appendUnique(iArr, i2, iAppendUnique);
                }
                if (iAppendUnique == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
        int i3 = 0;
        while (i3 < this.numOpenedRounds) {
            int iBitsToChunks2 = bitsToChunks(iCeil_log22, bArr2, this.digestSizeBytes, iArr3);
            for (int i5 = 0; i5 < iBitsToChunks2; i5++) {
                int i6 = iArr3[i5];
                if (i6 < this.numMPCParties) {
                    iArr2[i3] = i6;
                    i3++;
                }
                if (i3 == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
    }

    public static int extend(int i) {
        return ~(i - 1);
    }

    private void getAuxBits(byte[] bArr, Tape tape) {
        byte[] bArr2 = tape.tapes[this.numMPCParties - 1];
        int i = this.stateSizeBits;
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < this.numRounds; i5++) {
            i2 += i;
            int i6 = 0;
            while (i6 < i) {
                Utils.setBit(bArr, i3, Utils.getBit(bArr2, i2));
                i6++;
                i3++;
                i2++;
            }
        }
    }

    private int[] getMissingLeavesList(int[] iArr) {
        int[] iArr2 = new int[this.numMPCRounds - this.numOpenedRounds];
        int i = 0;
        for (int i2 = 0; i2 < this.numMPCRounds; i2++) {
            if (!contains(iArr, this.numOpenedRounds, i2)) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    private void implH3(int[] iArr, int[] iArr2, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        byte[] bArr6 = new byte[this.digestSizeBytes];
        bArr2[Utils.numBytes(this.numMPCRounds * 2) - 1] = 0;
        for (int i = 0; i < this.numMPCRounds; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.digest.update(bArr[i][i2], 0, this.digestSizeBytes);
            }
        }
        if (this.transform == 1) {
            for (int i3 = 0; i3 < this.numMPCRounds; i3++) {
                int i5 = 0;
                while (i5 < 3) {
                    this.digest.update(bArr5[i3][i5], 0, i5 == 2 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
                    i5++;
                }
            }
        }
        this.digest.update(Pack.intToLittleEndian(iArr), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(iArr2), 0, this.stateSizeBytes);
        this.digest.update(bArr3, 0, 32);
        this.digest.update(bArr4, 0, bArr4.length);
        this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        boolean z = true;
        int i6 = 0;
        while (z) {
            for (int i21 = 0; i21 < this.digestSizeBytes; i21++) {
                byte b4 = bArr6[i21];
                int i22 = 0;
                while (true) {
                    if (i22 >= 8) {
                        break;
                    }
                    int i32 = (b4 >>> (6 - i22)) & 3;
                    if (i32 < 3) {
                        setChallenge(bArr2, i6, i32);
                        i6++;
                        if (i6 == this.numMPCRounds) {
                            z = false;
                            break;
                        }
                    }
                    i22 += 2;
                }
                if (!z) {
                    break;
                }
            }
            if (!z) {
                return;
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr6, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        }
    }

    public static int indexOf(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static boolean is_picnic3(int i) {
        return i == 7 || i == 8 || i == 9;
    }

    private int mpc_AND(int i, int i2, int i3, int i5, Tape tape, Msg msg) {
        int iExtend = ((i3 & extend(i2)) ^ (i5 & extend(i))) ^ tape.tapesToWord();
        int i6 = msg.unopened;
        if (i6 >= 0) {
            iExtend = Utils.setBit(iExtend, msg.unopened, Utils.getBit(msg.msgs[i6], msg.pos));
        }
        wordToMsgs(iExtend, msg);
        return (i & i2) ^ Utils.parity16(iExtend);
    }

    private void mpc_LowMC(Tape tape, View[] viewArr, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i = this.stateSizeWords;
        mpc_xor_constant(iArr2, i * 3, iArr, 0, i);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        for (int i2 = 0; i2 < 3; i2++) {
            matrix_mul_offset(iArr2, i2 * this.stateSizeWords, viewArr[i2].inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        }
        int[] iArr3 = iArr2;
        mpc_xor(iArr3, iArr3, 3);
        for (int i3 = 1; i3 <= this.numRounds; i3++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i3);
            for (int i5 = 0; i5 < 3; i5++) {
                matrix_mul_offset(iArr3, this.stateSizeWords * i5, viewArr[i5].inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            }
            mpc_substitution(iArr3, tape, viewArr);
            int i6 = i3 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i6);
            int i21 = this.stateSizeWords;
            mpc_matrix_mul(iArr3, i21 * 3, iArr2, i21 * 3, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 3);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i6);
            iArr3 = iArr2;
            mpc_xor_constant(iArr3, this.stateSizeWords * 3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords);
            mpc_xor(iArr3, iArr3, 3);
        }
        for (int i22 = 0; i22 < 3; i22++) {
            int i32 = this.stateSizeWords;
            System.arraycopy(iArr3, (i22 + 3) * i32, viewArr[i22].outputShare, 0, i32);
        }
    }

    private void mpc_matrix_mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            int i21 = this.stateSizeWords;
            matrix_mul_offset(iArr, (i6 * i21) + i, iArr2, (i21 * i6) + i2, iArr3, i3);
        }
    }

    private void mpc_sbox(int[] iArr, int[] iArr2, Tape tape, Msg msg) {
        for (int i = 0; i < this.numSboxes * 3; i += 3) {
            int i2 = i + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i2);
            int i3 = iArr2[i2];
            int i5 = i + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i5);
            int i6 = iArr2[i5];
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i);
            int i21 = iArr2[i];
            int iMpc_AND = mpc_AND(bitFromWordArray, bitFromWordArray2, i3, i6, tape, msg);
            int iMpc_AND2 = mpc_AND(bitFromWordArray2, bitFromWordArray3, i6, i21, tape, msg);
            int iMpc_AND3 = mpc_AND(bitFromWordArray3, bitFromWordArray, i21, i3, tape, msg);
            int i22 = bitFromWordArray ^ iMpc_AND2;
            int i32 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i2, i22);
            Utils.setBitInWordArray(iArr, i5, iMpc_AND3 ^ i32);
            Utils.setBitInWordArray(iArr, i, (i32 ^ bitFromWordArray3) ^ iMpc_AND);
        }
    }

    private void mpc_substitution(int[] iArr, Tape tape, View[] viewArr) {
        int[] iArr2 = new int[3];
        int[] iArr3 = new int[3];
        int[] iArr4 = new int[3];
        int[] iArr5 = new int[3];
        int[] iArr6 = new int[3];
        int[] iArr7 = new int[3];
        int i = 0;
        while (i < this.numSboxes * 3) {
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = ((i2 + 3) * this.stateSizeWords * 32) + i;
                iArr2[i2] = Utils.getBitFromWordArray(iArr, i3 + 2);
                iArr3[i2] = Utils.getBitFromWordArray(iArr, i3 + 1);
                iArr4[i2] = Utils.getBitFromWordArray(iArr, i3);
            }
            mpc_AND(iArr2, iArr3, iArr5, tape, viewArr);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND(iArr10, iArr8, iArr11, tape, viewArr);
            int[] iArr13 = iArr7;
            mpc_AND(iArr8, iArr9, iArr13, tape, viewArr);
            iArr2 = iArr9;
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = ((i5 + 3) * this.stateSizeWords * 32) + i;
                Utils.setBitInWordArray(iArr, i6 + 2, iArr2[i5] ^ iArr11[i5]);
                Utils.setBitInWordArray(iArr, i6 + 1, (iArr2[i5] ^ iArr10[i5]) ^ iArr13[i5]);
                Utils.setBitInWordArray(iArr, i6, ((iArr2[i5] ^ iArr10[i5]) ^ iArr8[i5]) ^ iArr12[i5]);
            }
            i += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    private void mpc_xor(int[] iArr, int[] iArr2, int i) {
        int i2 = this.stateSizeWords * i;
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = (this.stateSizeWords * i) + i3;
            iArr[i5] = iArr[i5] ^ iArr2[i3];
        }
    }

    private void mpc_xor_constant(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 + i;
            iArr[i6] = iArr[i6] ^ iArr2[i5 + i2];
        }
    }

    private void mpc_xor_constant_verify(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i5;
        if (i3 == 0) {
            i5 = this.stateSizeWords * 2;
        } else if (i3 != 2) {
            return;
        } else {
            i5 = this.stateSizeWords * 3;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            int i21 = i6 + i5;
            iArr[i21] = iArr[i21] ^ iArr2[i6 + i];
        }
    }

    private void picnic_keygen(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int[] iArr = new int[bArr3.length / 4];
        int[] iArr2 = new int[bArr.length / 4];
        int[] iArr3 = new int[bArr2.length / 4];
        secureRandom.nextBytes(bArr3);
        Pack.littleEndianToInt(bArr3, 0, iArr);
        Utils.zeroTrailingBits(iArr, this.stateSizeBits);
        secureRandom.nextBytes(bArr);
        Pack.littleEndianToInt(bArr, 0, iArr2);
        Utils.zeroTrailingBits(iArr2, this.stateSizeBits);
        LowMCEnc(iArr2, iArr3, iArr);
        Pack.intToLittleEndian(iArr, bArr3, 0);
        Pack.intToLittleEndian(iArr2, bArr, 0);
        Pack.intToLittleEndian(iArr3, bArr2, 0);
    }

    private void picnic_read_public_key(int[] iArr, int[] iArr2, byte[] bArr) {
        int i = this.stateSizeBytes;
        int i2 = i + 1;
        int i3 = i / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i3);
        Pack.littleEndianToInt(bArr, i2, iArr2, 0, i3);
        if (i3 < this.stateSizeWords) {
            int i5 = i3 * 4;
            int i6 = this.stateSizeBytes - i5;
            iArr[i3] = Pack.littleEndianToInt_Low(bArr, i5 + 1, i6);
            iArr2[i3] = Pack.littleEndianToInt_Low(bArr, i2 + i5, i6);
        }
    }

    private boolean picnic_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PicnicEngine picnicEngine;
        int iSerializeSignature2;
        int i = this.stateSizeWords;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = this.stateSizeBytes;
        int i3 = i2 + 1;
        int i5 = (i2 * 2) + 1;
        int i6 = i2 / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i6);
        Pack.littleEndianToInt(bArr, i3, iArr2, 0, i6);
        Pack.littleEndianToInt(bArr, i5, iArr3, 0, i6);
        if (i6 < this.stateSizeWords) {
            int i21 = i6 * 4;
            int i22 = this.stateSizeBytes - i21;
            iArr[i6] = Pack.littleEndianToInt_Low(bArr, i21 + 1, i22);
            iArr2[i6] = Pack.littleEndianToInt_Low(bArr, i3 + i21, i22);
            iArr3[i6] = Pack.littleEndianToInt_Low(bArr, i5 + i21, i22);
        }
        if (is_picnic3(this.parameters)) {
            picnicEngine = this;
            Signature2 signature2 = new Signature2(this);
            if (!picnicEngine.sign_picnic3(iArr, iArr2, iArr3, bArr2, signature2)) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature2(signature2, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        } else {
            Signature signature = new Signature(this);
            picnicEngine = this;
            if (picnicEngine.sign_picnic1(iArr, iArr2, iArr3, bArr2, signature) != 0) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature(signature, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        }
        picnicEngine.signatureLength = iSerializeSignature2;
        Pack.intToLittleEndian(iSerializeSignature2, bArr3, 0);
        return true;
    }

    private int picnic_verify(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Logger logger;
        String str;
        int i2 = this.stateSizeWords;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        picnic_read_public_key(iArr, iArr2, bArr);
        if (is_picnic3(this.parameters)) {
            Signature2 signature2 = new Signature2(this);
            if (deserializeSignature2(signature2, bArr3, i, bArr2.length + 4) == 0) {
                return verify_picnic3(signature2, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature (2)!";
        } else {
            Signature signature = new Signature(this);
            if (deserializeSignature(signature, bArr3, i, bArr2.length + 4) == 0) {
                return verify(signature, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature!";
        }
        logger.fine(str);
        return -1;
    }

    private int picnic_write_private_key(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = this.stateSizeBytes;
        int i2 = (i * 3) + 1;
        if (bArr4.length < i2) {
            LOG.fine("Failed writing private key!");
            return -1;
        }
        bArr4[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr4, 1, i);
        int i3 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr4, i3 + 1, i3);
        int i5 = this.stateSizeBytes;
        System.arraycopy(bArr3, 0, bArr4, (i5 * 2) + 1, i5);
        return i2;
    }

    private int picnic_write_public_key(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = this.stateSizeBytes;
        int i2 = (i * 2) + 1;
        if (bArr3.length < i2) {
            LOG.fine("Failed writing public key!");
            return -1;
        }
        bArr3[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr3, 1, i);
        int i3 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr3, i3 + 1, i3);
        return i2;
    }

    private int serializeSignature2(Signature2 signature2, byte[] bArr, int i) {
        int i2 = this.digestSizeBytes + 32 + signature2.iSeedInfoLen + signature2.cvInfoLen;
        for (int i3 = 0; i3 < this.numMPCRounds; i3++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i3)) {
                int i5 = signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i3)];
                int i6 = i2 + signature2.proofs[i3].seedInfoLen;
                if (i5 != this.numMPCParties - 1) {
                    i6 += this.andSizeBytes;
                }
                i2 = i6 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (bArr.length < i2) {
            return -1;
        }
        System.arraycopy(signature2.challengeHash, 0, bArr, i, this.digestSizeBytes);
        int i21 = this.digestSizeBytes + i;
        System.arraycopy(signature2.salt, 0, bArr, i21, 32);
        int i22 = i21 + 32;
        System.arraycopy(signature2.iSeedInfo, 0, bArr, i22, signature2.iSeedInfoLen);
        int i32 = i22 + signature2.iSeedInfoLen;
        System.arraycopy(signature2.cvInfo, 0, bArr, i32, signature2.cvInfoLen);
        int i33 = i32 + signature2.cvInfoLen;
        for (int i43 = 0; i43 < this.numMPCRounds; i43++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i43)) {
                Signature2.Proof2 proof2 = signature2.proofs[i43];
                System.arraycopy(proof2.seedInfo, 0, bArr, i33, proof2.seedInfoLen);
                int i59 = i33 + signature2.proofs[i43].seedInfoLen;
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i43)] != this.numMPCParties - 1) {
                    System.arraycopy(signature2.proofs[i43].aux, 0, bArr, i59, this.andSizeBytes);
                    i59 += this.andSizeBytes;
                }
                System.arraycopy(signature2.proofs[i43].input, 0, bArr, i59, this.stateSizeBytes);
                int i66 = i59 + this.stateSizeBytes;
                System.arraycopy(signature2.proofs[i43].msgs, 0, bArr, i66, this.andSizeBytes);
                int i74 = i66 + this.andSizeBytes;
                System.arraycopy(signature2.proofs[i43].C, 0, bArr, i74, this.digestSizeBytes);
                i33 = i74 + this.digestSizeBytes;
            }
        }
        return i33 - i;
    }

    private void setChallenge(byte[] bArr, int i, int i2) {
        int i3 = i * 2;
        Utils.setBit(bArr, i3, (byte) (i2 & 1));
        Utils.setBit(bArr, i3 + 1, (byte) ((i2 >>> 1) & 1));
    }

    private int sign_picnic1(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature signature) {
        byte[] bArr2;
        PicnicEngine picnicEngine = this;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        View[][] viewArr = (View[][]) Array.newInstance((Class<?>) View.class, picnicEngine.numMPCRounds, 3);
        int[] iArr4 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        byte[] bArrComputeSeeds = computeSeeds(iArr, iArr2, iArr3, bArr);
        int i5 = picnicEngine.numMPCParties * picnicEngine.seedSizeBytes;
        System.arraycopy(bArrComputeSeeds, picnicEngine.numMPCRounds * i5, signature.salt, 0, 32);
        Tape tape = new Tape(picnicEngine);
        int i6 = picnicEngine.stateSizeBytes;
        int iMax = Math.max(i6 * 9, i6 + picnicEngine.andSizeBytes);
        byte[] bArr5 = new byte[iMax];
        int i21 = 0;
        while (i21 < picnicEngine.numMPCRounds) {
            viewArr[i21][i3] = new View(picnicEngine);
            viewArr[i21][i2] = new View(picnicEngine);
            viewArr[i21][i] = new View(picnicEngine);
            int i22 = i3;
            while (i22 < i) {
                int i32 = i;
                int i33 = iMax;
                int i43 = i2;
                Tape tape2 = tape;
                byte[] bArr6 = bArrComputeSeeds;
                byte[] bArr7 = bArr5;
                if (!picnicEngine.createRandomTape(bArr6, (picnicEngine.seedSizeBytes * i22) + (i5 * i21), signature.salt, i21, i22, bArr5, picnicEngine.stateSizeBytes + picnicEngine.andSizeBytes)) {
                    LOG.fine("createRandomTape failed");
                    return -1;
                }
                int[] iArr5 = viewArr[i21][i22].inputShare;
                Pack.littleEndianToInt(bArr7, 0, iArr5);
                Utils.zeroTrailingBits(iArr5, picnicEngine.stateSizeBits);
                System.arraycopy(bArr7, picnicEngine.stateSizeBytes, tape2.tapes[i22], 0, picnicEngine.andSizeBytes);
                i22++;
                bArrComputeSeeds = bArr6;
                tape = tape2;
                bArr5 = bArr7;
                iMax = i33;
                i = i32;
                i2 = i43;
            }
            int i59 = iMax;
            byte[] bArr8 = bArr5;
            int i66 = i;
            int i74 = i2;
            Tape tape3 = tape;
            byte[] bArr9 = bArrComputeSeeds;
            int i92 = i5 * i21;
            View[][] viewArr2 = viewArr;
            int i96 = i21;
            if (!picnicEngine.createRandomTape(bArr9, (picnicEngine.seedSizeBytes * 2) + i92, signature.salt, i21, 2, tape3.tapes[i66], picnicEngine.andSizeBytes)) {
                LOG.fine("createRandomTape failed");
                return -1;
            }
            View[] viewArr3 = viewArr2[i96];
            picnicEngine.xor_three(viewArr3[i66].inputShare, iArr, viewArr3[0].inputShare, viewArr3[i74].inputShare);
            tape3.pos = 0;
            int[] iArrLittleEndianToInt = Pack.littleEndianToInt(bArr8, 0, i59 / 4);
            picnicEngine.mpc_LowMC(tape3, viewArr2[i96], iArr3, iArrLittleEndianToInt);
            Pack.intToLittleEndian(iArrLittleEndianToInt, bArr8, 0);
            int[] iArr6 = new int[16];
            View[] viewArr4 = viewArr2[i96];
            picnicEngine.xor_three(iArr6, viewArr4[0].outputShare, viewArr4[i74].outputShare, viewArr4[i66].outputShare);
            if (!subarrayEquals(iArr6, iArr2, picnicEngine.stateSizeWords)) {
                LOG.fine("Simulation failed; output does not match public key (round = " + i96 + ")");
                return -1;
            }
            picnicEngine.Commit(bArr9, i92, viewArr2[i96][0], bArr3[i96][0]);
            picnicEngine.Commit(bArr9, i92 + picnicEngine.seedSizeBytes, viewArr2[i96][i74], bArr3[i96][i74]);
            picnicEngine.Commit(bArr9, (picnicEngine.seedSizeBytes * 2) + i92, viewArr2[i96][i66], bArr3[i96][i66]);
            if (picnicEngine.transform == i74) {
                picnicEngine.G(0, bArr9, i92, viewArr2[i96][0], bArr4[i96][0]);
                picnicEngine.G(1, bArr9, i92 + picnicEngine.seedSizeBytes, viewArr2[i96][i74], bArr4[i96][i74]);
                picnicEngine.G(2, bArr9, (picnicEngine.seedSizeBytes * 2) + i92, viewArr2[i96][i66], bArr4[i96][i66]);
                bArr2 = bArr9;
            } else {
                bArr2 = bArr9;
            }
            i21 = i96 + 1;
            picnicEngine = this;
            tape = tape3;
            bArr5 = bArr8;
            bArrComputeSeeds = bArr2;
            iMax = i59;
            i = i66;
            viewArr = viewArr2;
            i2 = 1;
            i3 = 0;
        }
        View[][] viewArr5 = viewArr;
        byte[] bArr10 = bArrComputeSeeds;
        PicnicEngine picnicEngine2 = this;
        picnicEngine2.H3(iArr2, iArr3, viewArr5, bArr3, signature.challengeBits, signature.salt, bArr, bArr4);
        int i99 = 0;
        while (i99 < picnicEngine2.numMPCRounds) {
            byte[] bArr11 = bArr10;
            picnicEngine2.prove(signature.proofs[i99], picnicEngine2.getChallenge(signature.challengeBits, i99), bArr11, i5 * i99, viewArr5[i99], bArr3[i99], picnicEngine2.transform != 1 ? null : bArr4[i99]);
            i99++;
            picnicEngine2 = this;
            bArr10 = bArr11;
        }
        return 0;
    }

    private boolean sign_picnic3(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature2 signature2) {
        int i;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21 = this.seedSizeBytes + 32;
        byte[] bArr2 = new byte[i21];
        computeSaltAndRootSeed(bArr2, iArr, iArr2, iArr3, bArr);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, i21);
        signature2.salt = Arrays.copyOfRange(bArr2, 0, 32);
        Tree tree = new Tree(this, this.numMPCRounds, this.seedSizeBytes);
        tree.generateSeeds(bArrCopyOfRange, signature2.salt, 0);
        byte[][] leaves = tree.getLeaves();
        int leavesOffset = tree.getLeavesOffset();
        int i22 = this.numMPCRounds;
        Tape[] tapeArr = new Tape[i22];
        Tree[] treeArr = new Tree[i22];
        int i32 = 0;
        while (true) {
            i = this.numMPCRounds;
            if (i32 >= i) {
                break;
            }
            tapeArr[i32] = new Tape(this);
            Tree tree2 = new Tree(this, this.numMPCParties, this.seedSizeBytes);
            treeArr[i32] = tree2;
            tree2.generateSeeds(leaves[i32 + leavesOffset], signature2.salt, i32);
            createRandomTapes(tapeArr[i32], treeArr[i32].getLeaves(), treeArr[i32].getLeavesOffset(), signature2.salt, i32);
            i32++;
        }
        int[] iArr4 = {i, this.stateSizeWords * 4};
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[] bArr4 = new byte[176];
        int i33 = 0;
        while (true) {
            i2 = this.numMPCRounds;
            if (i33 >= i2) {
                break;
            }
            tapeArr[i33].computeAuxTape(bArr3[i33]);
            i33++;
        }
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, i2, this.numMPCParties, this.digestSizeBytes);
        int i43 = 0;
        while (true) {
            i3 = this.numMPCRounds;
            if (i43 >= i3) {
                break;
            }
            int i59 = 0;
            while (true) {
                i6 = this.numMPCParties;
                if (i59 < i6 - 1) {
                    commit(bArr5[i43][i59], treeArr[i43].getLeaf(i59), null, signature2.salt, i43, i59);
                    i59++;
                }
            }
            int i66 = i6 - 1;
            getAuxBits(bArr4, tapeArr[i43]);
            commit(bArr5[i43][i66], treeArr[i43].getLeaf(i66), bArr4, signature2.salt, i43, i66);
            i43++;
        }
        Msg[] msgArr = new Msg[i3];
        int[] iArr5 = new int[this.stateSizeBits];
        int i74 = 0;
        while (true) {
            int i92 = this.numMPCRounds;
            if (i74 >= i92) {
                byte[][] bArr6 = (byte[][]) Array.newInstance((Class<?>) cls, i92, this.digestSizeBytes);
                byte[][] bArr7 = (byte[][]) Array.newInstance((Class<?>) cls, this.numMPCRounds, this.digestSizeBytes);
                for (int i96 = 0; i96 < this.numMPCRounds; i96++) {
                    commit_h(bArr6[i96], bArr5[i96]);
                    commit_v(bArr7[i96], bArr3[i96], msgArr[i96]);
                }
                Tree tree3 = new Tree(this, this.numMPCRounds, this.digestSizeBytes);
                tree3.buildMerkleTree(bArr7, signature2.salt);
                int i99 = this.numOpenedRounds;
                int[] iArr6 = new int[i99];
                signature2.challengeC = iArr6;
                int[] iArr7 = new int[i99];
                signature2.challengeP = iArr7;
                byte[] bArr8 = new byte[this.digestSizeBytes];
                signature2.challengeHash = bArr8;
                int i100 = 0;
                HCP(bArr8, iArr6, iArr7, bArr6, tree3.nodes[0], signature2.salt, iArr2, iArr3, bArr);
                int[] iArr8 = new int[1];
                signature2.cvInfo = tree3.openMerkleTree(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds, iArr8);
                signature2.cvInfoLen = iArr8[0];
                int i101 = this.numMPCRounds;
                int i102 = this.seedSizeBytes;
                byte[] bArr9 = new byte[i101 * i102];
                signature2.iSeedInfo = bArr9;
                signature2.iSeedInfoLen = tree.revealSeeds(signature2.challengeC, this.numOpenedRounds, bArr9, i101 * i102);
                signature2.proofs = new Signature2.Proof2[this.numMPCRounds];
                int i103 = 0;
                while (i103 < this.numMPCRounds) {
                    if (contains(signature2.challengeC, this.numOpenedRounds, i103)) {
                        signature2.proofs[i103] = new Signature2.Proof2(this);
                        int iIndexOf = indexOf(signature2.challengeC, this.numOpenedRounds, i103);
                        int[] iArr9 = {signature2.challengeP[iIndexOf]};
                        Signature2.Proof2 proof2 = signature2.proofs[i103];
                        int i104 = this.numMPCParties;
                        int i105 = this.seedSizeBytes;
                        byte[] bArr10 = new byte[i104 * i105];
                        proof2.seedInfo = bArr10;
                        proof2.seedInfoLen = treeArr[i103].revealSeeds(iArr9, 1, bArr10, i104 * i105);
                        if (signature2.challengeP[iIndexOf] != this.numMPCParties - 1) {
                            getAuxBits(signature2.proofs[i103].aux, tapeArr[i103]);
                        }
                        i5 = i100;
                        System.arraycopy(bArr3[i103], i5, signature2.proofs[i103].input, i5, this.stateSizeBytes);
                        System.arraycopy(msgArr[i103].msgs[signature2.challengeP[iIndexOf]], i5, signature2.proofs[i103].msgs, i5, this.andSizeBytes);
                        System.arraycopy(bArr5[i103][signature2.challengeP[iIndexOf]], i5, signature2.proofs[i103].C, i5, this.digestSizeBytes);
                    } else {
                        i5 = i100;
                    }
                    i103++;
                    i100 = i5;
                }
                return true;
            }
            msgArr[i74] = new Msg(this);
            int[] iArrLittleEndianToInt = Pack.littleEndianToInt(bArr3[i74], 0, this.stateSizeWords);
            xor_array(iArrLittleEndianToInt, iArrLittleEndianToInt, iArr, 0);
            int i106 = i74;
            if (simulateOnline(iArrLittleEndianToInt, tapeArr[i106], iArr5, msgArr[i106], iArr3, iArr2) != 0) {
                LOG.fine("MPC simulation failed, aborting signature");
                return false;
            }
            Pack.intToLittleEndian(iArrLittleEndianToInt, bArr3[i106], 0);
            i74 = i106 + 1;
        }
    }

    private int simulateOnline(int[] iArr, Tape tape, int[] iArr2, Msg msg, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr6, iArr5, iArr3, 0);
        for (int i = 1; i <= this.numRounds; i++) {
            tapesToWords(iArr2, tape);
            mpc_sbox(iArr6, iArr2, tape, msg);
            int i2 = i - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i2);
            matrix_mul(iArr6, iArr6, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i2);
            xor_array(iArr6, iArr6, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i);
            matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            xor_array(iArr6, iArr5, iArr6, 0);
        }
        return !subarrayEquals(iArr6, iArr4, this.stateSizeWords) ? -1 : 0;
    }

    private static boolean subarrayEquals(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private void substitution(int[] iArr) {
        for (int i = 0; i < this.numSboxes * 3; i += 3) {
            int i2 = i + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i2);
            int i3 = i + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i3);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i);
            Utils.setBitInWordArray(iArr, i2, (bitFromWordArray2 & bitFromWordArray3) ^ bitFromWordArray);
            int i5 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i3, (bitFromWordArray & bitFromWordArray3) ^ i5);
            Utils.setBitInWordArray(iArr, i, (i5 ^ bitFromWordArray3) ^ (bitFromWordArray & bitFromWordArray2));
        }
    }

    private void tapesToWords(int[] iArr, Tape tape) {
        for (int i = 0; i < this.stateSizeBits; i++) {
            iArr[i] = tape.tapesToWord();
        }
    }

    private void updateDigest(int[] iArr, byte[] bArr) {
        Pack.intToLittleEndian(iArr, bArr, 0);
        this.digest.update(bArr, 0, this.stateSizeBytes);
    }

    private int verify(Signature signature, int[] iArr, int[] iArr2, byte[] bArr) {
        String str;
        int i;
        int i2;
        PicnicEngine picnicEngine = this;
        char c2 = 3;
        char c3 = 2;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        int[][][] iArr4 = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, picnicEngine.numMPCRounds, 3, picnicEngine.stateSizeBytes);
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr4 = signature.challengeBits;
        int i3 = picnicEngine.stateSizeBytes;
        byte[] bArr5 = new byte[Math.max(i3 * 6, i3 + picnicEngine.andSizeBytes)];
        Tape tape = new Tape(picnicEngine);
        int i5 = picnicEngine.numMPCRounds;
        View[] viewArr = new View[i5];
        View[] viewArr2 = new View[i5];
        int i6 = 0;
        while (true) {
            int i21 = picnicEngine.numMPCRounds;
            if (i6 < i21) {
                viewArr[i6] = new View(picnicEngine);
                View[] viewArr3 = viewArr2;
                View view = new View(picnicEngine);
                viewArr3[i6] = view;
                Signature.Proof[] proofArr2 = proofArr;
                View[] viewArr4 = viewArr;
                char c5 = c2;
                byte[] bArr6 = bArr4;
                char c6 = c3;
                str = "Invalid signature. Did not verify";
                if (!picnicEngine.verifyProof(proofArr2[i6], viewArr[i6], view, picnicEngine.getChallenge(bArr4, i6), signature.salt, i6, bArr5, iArr2, tape)) {
                    break;
                }
                int challenge = picnicEngine.getChallenge(bArr6, i6);
                picnicEngine.Commit(proofArr2[i6].seed1, 0, viewArr4[i6], bArr2[i6][challenge]);
                int i22 = (challenge + 1) % 3;
                picnicEngine.Commit(proofArr2[i6].seed2, 0, viewArr3[i6], bArr2[i6][i22]);
                int i32 = (challenge + 2) % 3;
                System.arraycopy(proofArr2[i6].view3Commitment, 0, bArr2[i6][i32], 0, picnicEngine.digestSizeBytes);
                if (picnicEngine.transform == 1) {
                    picnicEngine.G(challenge, proofArr2[i6].seed1, 0, viewArr4[i6], bArr3[i6][challenge]);
                    i = challenge;
                    picnicEngine = this;
                    i2 = i22;
                    picnicEngine.G(i2, proofArr2[i6].seed2, 0, viewArr3[i6], bArr3[i6][i22]);
                    System.arraycopy(proofArr2[i6].view3UnruhG, 0, bArr3[i6][i32], 0, i == 0 ? picnicEngine.UnruhGWithInputBytes : picnicEngine.UnruhGWithoutInputBytes);
                } else {
                    i = challenge;
                    i2 = i22;
                }
                iArr4[i6][i] = viewArr4[i6].outputShare;
                iArr4[i6][i2] = viewArr3[i6].outputShare;
                int[] iArr5 = new int[picnicEngine.stateSizeWords];
                picnicEngine.xor_three(iArr5, viewArr4[i6].outputShare, viewArr3[i6].outputShare, iArr);
                iArr4[i6][i32] = iArr5;
                i6++;
                bArr4 = bArr6;
                proofArr = proofArr2;
                c2 = c5;
                viewArr = viewArr4;
                viewArr2 = viewArr3;
                c3 = c6;
            } else {
                str = "Invalid signature. Did not verify";
                byte[] bArr7 = new byte[Utils.numBytes(i21 * 2)];
                picnicEngine.H3(iArr, iArr2, iArr4, bArr2, bArr7, signature.salt, bArr, bArr3);
                if (subarrayEquals(bArr4, bArr7, Utils.numBytes(picnicEngine.numMPCRounds * 2))) {
                    return 0;
                }
            }
        }
        LOG.fine(str);
        return -1;
    }

    private int verify_picnic3(Signature2 signature2, int[] iArr, int[] iArr2, byte[] bArr) {
        int iVerifyMerkleTree;
        Logger logger;
        String string;
        StringBuilder sb6;
        Tape[] tapeArr;
        int i;
        PicnicEngine picnicEngine = this;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        Msg[] msgArr = new Msg[picnicEngine.numMPCRounds];
        Tree tree = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[] bArr5 = new byte[64];
        int i2 = picnicEngine.numMPCRounds;
        Tree[] treeArr = new Tree[i2];
        Tape[] tapeArr2 = new Tape[i2];
        Tree tree2 = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.seedSizeBytes);
        if (tree2.reconstructSeeds(signature2.challengeC, picnicEngine.numOpenedRounds, signature2.iSeedInfo, signature2.iSeedInfoLen, signature2.salt, 0) != 0) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            if (i3 < picnicEngine.numMPCRounds) {
                if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i3)) {
                    treeArr[i3] = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                    int[] iArr4 = {signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i3)]};
                    Tree tree3 = treeArr[i3];
                    Signature2.Proof2 proof2 = signature2.proofs[i3];
                    int i5 = i3;
                    int iReconstructSeeds = tree3.reconstructSeeds(iArr4, 1, proof2.seedInfo, proof2.seedInfoLen, signature2.salt, i5);
                    i = i5;
                    if (iReconstructSeeds != 0) {
                        logger = LOG;
                        sb6 = new StringBuilder("Failed to reconstruct seeds for round ");
                        sb6.append(i);
                        break;
                    }
                } else {
                    Tree tree4 = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                    treeArr[i3] = tree4;
                    tree4.generateSeeds(tree2.getLeaf(i3), signature2.salt, i3);
                    i = i3;
                }
                i3 = i + 1;
            } else {
                int i6 = picnicEngine.numMPCParties - 1;
                byte[] bArr6 = new byte[176];
                int i21 = 0;
                while (i21 < picnicEngine.numMPCRounds) {
                    byte[] bArr7 = bArr6;
                    Tape tape = new Tape(picnicEngine);
                    tapeArr2[i21] = tape;
                    byte[][] bArr8 = bArr3;
                    byte[][][] bArr9 = bArr2;
                    picnicEngine.createRandomTapes(tape, treeArr[i21].getLeaves(), treeArr[i21].getLeavesOffset(), signature2.salt, i21);
                    if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i21)) {
                        tapeArr = tapeArr2;
                        int i22 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i21)];
                        int i32 = 0;
                        while (i32 < i6) {
                            if (i32 != i22) {
                                picnicEngine.commit(bArr9[i21][i32], treeArr[i21].getLeaf(i32), null, signature2.salt, i21, i32);
                            }
                            i32++;
                            picnicEngine = this;
                        }
                        if (i6 != i22) {
                            picnicEngine = this;
                            picnicEngine.commit(bArr9[i21][i6], treeArr[i21].getLeaf(i6), signature2.proofs[i21].aux, signature2.salt, i21, i6);
                        } else {
                            picnicEngine = this;
                        }
                        System.arraycopy(signature2.proofs[i21].C, 0, bArr9[i21][i22], 0, picnicEngine.digestSizeBytes);
                    } else {
                        tapeArr2[i21].computeAuxTape(null);
                        Tape[] tapeArr3 = tapeArr2;
                        int i33 = 0;
                        while (i33 < i6) {
                            picnicEngine.commit(bArr9[i21][i33], treeArr[i21].getLeaf(i33), null, signature2.salt, i21, i33);
                            i33++;
                            tapeArr3 = tapeArr3;
                        }
                        tapeArr = tapeArr3;
                        picnicEngine.getAuxBits(bArr7, tapeArr[i21]);
                        picnicEngine.commit(bArr9[i21][i6], treeArr[i21].getLeaf(i6), bArr7, signature2.salt, i21, i6);
                    }
                    i21++;
                    bArr6 = bArr7;
                    bArr3 = bArr8;
                    tapeArr2 = tapeArr;
                    bArr2 = bArr9;
                }
                Tape[] tapeArr4 = tapeArr2;
                byte[][][] bArr10 = bArr2;
                byte[][] bArr11 = bArr3;
                for (int i43 = 0; i43 < picnicEngine.numMPCRounds; i43++) {
                    picnicEngine.commit_h(bArr11[i43], bArr10[i43]);
                }
                int[] iArr5 = new int[picnicEngine.stateSizeBits];
                int i59 = 0;
                while (true) {
                    int i66 = picnicEngine.numMPCRounds;
                    if (i59 < i66) {
                        msgArr[i59] = new Msg(picnicEngine);
                        if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i59)) {
                            int i74 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i59)];
                            if (i74 != i6) {
                                tapeArr4[i59].setAuxBits(signature2.proofs[i59].aux);
                            }
                            System.arraycopy(signature2.proofs[i59].msgs, 0, msgArr[i59].msgs[i74], 0, picnicEngine.andSizeBytes);
                            Arrays.fill(tapeArr4[i59].tapes[i74], (byte) 0);
                            msgArr[i59].unopened = i74;
                            byte[] bArr12 = new byte[picnicEngine.stateSizeWords * 4];
                            byte[] bArr13 = signature2.proofs[i59].input;
                            System.arraycopy(bArr13, 0, bArr12, 0, bArr13.length);
                            int i92 = picnicEngine.stateSizeWords;
                            int[] iArr6 = new int[i92];
                            Pack.littleEndianToInt(bArr12, 0, iArr6, 0, i92);
                            if (picnicEngine.simulateOnline(iArr6, tapeArr4[i59], iArr5, msgArr[i59], iArr2, iArr) != 0) {
                                logger = LOG;
                                sb6 = new StringBuilder("MPC simulation failed for round ");
                                sb6.append(i59);
                                sb6.append(", signature invalid");
                                break;
                            }
                            picnicEngine.commit_v(bArr4[i59], signature2.proofs[i59].input, msgArr[i59]);
                        } else {
                            bArr4[i59] = null;
                        }
                        i59++;
                    } else {
                        if (tree.addMerkleNodes(picnicEngine.getMissingLeavesList(signature2.challengeC), i66 - picnicEngine.numOpenedRounds, signature2.cvInfo, signature2.cvInfoLen) != 0 || (iVerifyMerkleTree = tree.verifyMerkleTree(bArr4, signature2.salt)) != 0) {
                            return -1;
                        }
                        picnicEngine.HCP(bArr5, null, null, bArr11, tree.nodes[0], signature2.salt, iArr, iArr2, bArr);
                        if (subarrayEquals(signature2.challengeHash, bArr5, picnicEngine.digestSizeBytes)) {
                            return iVerifyMerkleTree;
                        }
                        logger = LOG;
                        string = "Challenge does not match, signature invalid";
                    }
                }
            }
        }
        string = sb6.toString();
        logger.fine(string);
        return -1;
    }

    private void wordToMsgs(int i, Msg msg) {
        for (int i2 = 0; i2 < this.numMPCParties; i2++) {
            Utils.setBit(msg.msgs[i2], msg.pos, (byte) Utils.getBit(i, i2));
        }
        msg.pos++;
    }

    private void xor_three(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < this.stateSizeWords; i++) {
            iArr[i] = (iArr2[i] ^ iArr3[i]) ^ iArr4[i];
        }
    }

    public void aux_mpc_sbox(int[] iArr, int[] iArr2, Tape tape) {
        for (int i = 0; i < this.numSboxes * 3; i += 3) {
            int i2 = i + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i2);
            int i3 = i + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i3);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i);
            int bitFromWordArray4 = Utils.getBitFromWordArray(iArr2, i2);
            int bitFromWordArray5 = Utils.getBitFromWordArray(iArr2, i3);
            aux_mpc_AND(bitFromWordArray, bitFromWordArray2, ((Utils.getBitFromWordArray(iArr2, i) ^ bitFromWordArray) ^ bitFromWordArray2) ^ bitFromWordArray3, tape);
            aux_mpc_AND(bitFromWordArray2, bitFromWordArray3, bitFromWordArray4 ^ bitFromWordArray, tape);
            aux_mpc_AND(bitFromWordArray3, bitFromWordArray, (bitFromWordArray5 ^ bitFromWordArray) ^ bitFromWordArray2, tape);
        }
    }

    public void crypto_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_sign(bArr3, bArr2, bArr)) {
            System.arraycopy(bArr2, 0, bArr, 4, bArr2.length);
        }
    }

    public void crypto_sign_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i = this.stateSizeWords;
        byte[] bArr3 = new byte[i * 4];
        byte[] bArr4 = new byte[i * 4];
        byte[] bArr5 = new byte[i * 4];
        picnic_keygen(bArr3, bArr4, bArr5, secureRandom);
        picnic_write_public_key(bArr4, bArr3, bArr);
        picnic_write_private_key(bArr5, bArr4, bArr3, bArr2);
    }

    public boolean crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_verify(bArr3, Arrays.copyOfRange(bArr2, 4, bArr.length + 4), bArr2, Pack.littleEndianToInt(bArr2, 0)) == -1) {
            return false;
        }
        System.arraycopy(bArr2, 4, bArr, 0, bArr.length);
        return true;
    }

    public int getChallenge(byte[] bArr, int i) {
        return Utils.getCrumbAligned(bArr, i);
    }

    public int getPublicKeySize() {
        return this.CRYPTO_PUBLICKEYBYTES;
    }

    public int getSecretKeySize() {
        return this.CRYPTO_SECRETKEYBYTES;
    }

    public int getSignatureSize(int i) {
        return this.CRYPTO_BYTES + i;
    }

    public int getTrueSignatureSize() {
        return this.signatureLength;
    }

    public void matrix_mul(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        matrix_mul_offset(iArr, 0, iArr2, 0, iArr3, i);
    }

    public void matrix_mul_offset(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        int[] iArr4 = new int[16];
        int i5 = this.stateSizeWords;
        iArr4[i5 - 1] = 0;
        int i6 = this.stateSizeBits;
        int i21 = i6 / 32;
        int i22 = (i5 * 32) - i6;
        int iBitPermuteStepSimple = Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple((-1) >>> i22, 1431655765, 1), 858993459, 2), 252645135, 4);
        for (int i32 = 0; i32 < this.stateSizeBits; i32++) {
            int i33 = 0;
            for (int i43 = 0; i43 < i21; i43++) {
                i33 ^= iArr3[i3 + ((this.stateSizeWords * i32) + i43)] & iArr2[i2 + i43];
            }
            if (i22 > 0) {
                i33 ^= (iArr3[i3 + ((this.stateSizeWords * i32) + i21)] & iArr2[i2 + i21]) & iBitPermuteStepSimple;
            }
            Utils.setBit(iArr4, i32, Utils.parity32(i33));
        }
        System.arraycopy(iArr4, 0, iArr, i, this.stateSizeWords);
    }

    public void mpc_AND_verify(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View view, View view2) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr2[0];
        int i5 = ((((i2 & i3) ^ (iArr2[1] & i)) ^ (i & i3)) ^ bit) ^ bit2;
        iArr3[0] = i5;
        Utils.setBit(view.communicatedBits, tape.pos, (byte) i5);
        iArr3[1] = Utils.getBit(view2.communicatedBits, tape.pos);
        tape.pos++;
    }

    public void mpc_LowMC_verify(View view, View view2, Tape tape, int[] iArr, int[] iArr2, int i) {
        Arrays.fill(iArr, 0, iArr.length, 0);
        mpc_xor_constant_verify(iArr, iArr2, 0, this.stateSizeWords, i);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        int[] iArr3 = iArr;
        matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        matrix_mul_offset(iArr3, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        mpc_xor(iArr3, iArr3, 2);
        for (int i2 = 1; i2 <= this.numRounds; i2++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i2);
            matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            matrix_mul_offset(iArr, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            mpc_substitution_verify(iArr, tape, view, view2);
            int i3 = i2 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i3);
            int i5 = this.stateSizeWords;
            mpc_matrix_mul(iArr, i5 * 2, iArr, i5 * 2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 2);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i3);
            iArr3 = iArr;
            mpc_xor_constant_verify(iArr3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords, i);
            mpc_xor(iArr3, iArr3, 2);
        }
        int i6 = this.stateSizeWords;
        System.arraycopy(iArr3, i6 * 2, view.outputShare, 0, i6);
        int i21 = this.stateSizeWords;
        System.arraycopy(iArr3, i21 * 3, view2.outputShare, 0, i21);
    }

    public void mpc_substitution_verify(int[] iArr, Tape tape, View view, View view2) {
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[2];
        int[] iArr7 = new int[2];
        int i = 0;
        while (i < this.numSboxes * 3) {
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = ((i2 + 2) * this.stateSizeWords * 32) + i;
                iArr2[i2] = Utils.getBitFromWordArray(iArr, i3 + 2);
                iArr3[i2] = Utils.getBitFromWordArray(iArr, i3 + 1);
                iArr4[i2] = Utils.getBitFromWordArray(iArr, i3);
            }
            mpc_AND_verify(iArr2, iArr3, iArr5, tape, view, view2);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND_verify(iArr10, iArr8, iArr11, tape, view, view2);
            int[] iArr13 = iArr7;
            mpc_AND_verify(iArr8, iArr9, iArr13, tape, view, view2);
            iArr2 = iArr9;
            for (int i5 = 0; i5 < 2; i5++) {
                int i6 = ((i5 + 2) * this.stateSizeWords * 32) + i;
                Utils.setBitInWordArray(iArr, i6 + 2, iArr2[i5] ^ iArr11[i5]);
                Utils.setBitInWordArray(iArr, i6 + 1, (iArr2[i5] ^ iArr10[i5]) ^ iArr13[i5]);
                Utils.setBitInWordArray(iArr, i6, ((iArr2[i5] ^ iArr10[i5]) ^ iArr8[i5]) ^ iArr12[i5]);
            }
            i += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    public void prove(Signature.Proof proof, int i, byte[] bArr, int i2, View[] viewArr, byte[][] bArr2, byte[][] bArr3) {
        if (i == 0) {
            System.arraycopy(bArr, i2, proof.seed1, 0, this.seedSizeBytes);
            int i3 = this.seedSizeBytes;
            System.arraycopy(bArr, i2 + i3, proof.seed2, 0, i3);
        } else if (i == 1) {
            int i5 = this.seedSizeBytes;
            System.arraycopy(bArr, i2 + i5, proof.seed1, 0, i5);
            int i6 = this.seedSizeBytes;
            System.arraycopy(bArr, (i6 * 2) + i2, proof.seed2, 0, i6);
        } else {
            if (i != 2) {
                LOG.fine("Invalid challenge");
                throw new IllegalArgumentException("challenge");
            }
            int i21 = this.seedSizeBytes;
            System.arraycopy(bArr, (i21 * 2) + i2, proof.seed1, 0, i21);
            System.arraycopy(bArr, i2, proof.seed2, 0, this.seedSizeBytes);
        }
        if (i == 1 || i == 2) {
            System.arraycopy(viewArr[2].inputShare, 0, proof.inputShare, 0, this.stateSizeWords);
        }
        System.arraycopy(viewArr[(i + 1) % 3].communicatedBits, 0, proof.communicatedBits, 0, this.andSizeBytes);
        int i22 = (i + 2) % 3;
        System.arraycopy(bArr2[i22], 0, proof.view3Commitment, 0, this.digestSizeBytes);
        if (this.transform == 1) {
            System.arraycopy(bArr3[i22], 0, proof.view3UnruhG, 0, i == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
        }
    }

    public int serializeSignature(Signature signature, byte[] bArr, int i) {
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2) + 32;
        int i2 = this.numMPCRounds;
        int i3 = (((this.seedSizeBytes * 2) + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes) * i2) + iNumBytes;
        if (this.transform == 1) {
            i3 += this.UnruhGWithoutInputBytes * i2;
        }
        if (this.CRYPTO_BYTES < i3) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, Utils.numBytes(i2 * 2));
        int iNumBytes2 = Utils.numBytes(this.numMPCRounds * 2) + i;
        System.arraycopy(signature.salt, 0, bArr, iNumBytes2, 32);
        int i5 = iNumBytes2 + 32;
        for (int i6 = 0; i6 < this.numMPCRounds; i6++) {
            int challenge = getChallenge(bArr2, i6);
            System.arraycopy(proofArr[i6].view3Commitment, 0, bArr, i5, this.digestSizeBytes);
            int i21 = i5 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i22 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(proofArr[i6].view3UnruhG, 0, bArr, i21, i22);
                i21 += i22;
            }
            System.arraycopy(proofArr[i6].communicatedBits, 0, bArr, i21, this.andSizeBytes);
            int i32 = i21 + this.andSizeBytes;
            System.arraycopy(proofArr[i6].seed1, 0, bArr, i32, this.seedSizeBytes);
            int i33 = this.seedSizeBytes;
            int i43 = i32 + i33;
            System.arraycopy(proofArr[i6].seed2, 0, bArr, i43, i33);
            i5 = i43 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.intToLittleEndian(proofArr[i6].inputShare, 0, this.stateSizeWords, bArr, i5);
                i5 += this.stateSizeBytes;
            }
        }
        return i5 - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verifyProof(org.bouncycastle.pqc.legacy.picnic.Signature.Proof r17, org.bouncycastle.pqc.legacy.picnic.View r18, org.bouncycastle.pqc.legacy.picnic.View r19, int r20, byte[] r21, int r22, byte[] r23, int[] r24, org.bouncycastle.pqc.legacy.picnic.Tape r25) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.picnic.PicnicEngine.verifyProof(org.bouncycastle.pqc.legacy.picnic.Signature$Proof, org.bouncycastle.pqc.legacy.picnic.View, org.bouncycastle.pqc.legacy.picnic.View, int, byte[], int, byte[], int[], org.bouncycastle.pqc.legacy.picnic.Tape):boolean");
    }

    public void xor_array(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        for (int i2 = 0; i2 < this.stateSizeWords; i2++) {
            iArr[i2] = iArr2[i2] ^ iArr3[i2 + i];
        }
    }

    private void H3(int[] iArr, int[] iArr2, int[][][] iArr3, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i = 0; i < this.numMPCRounds; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                Pack.intToLittleEndian(iArr3[i][i2], bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private boolean arePaddingBitsZero(int[] iArr, int i) {
        if ((i & 31) == 0) {
            return true;
        }
        return (iArr[i >>> 5] & (~Utils.getTrailingBitsMask(i))) == 0;
    }

    private void mpc_AND(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View[] viewArr) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        byte bit3 = Utils.getBit(tape.tapes[2], tape.pos);
        int i = iArr[0];
        int i2 = iArr2[1];
        int i3 = iArr[1];
        int i5 = iArr2[0];
        int i6 = (((i & i5) ^ ((i & i2) ^ (i3 & i5))) ^ bit) ^ bit2;
        iArr3[0] = i6;
        int i21 = iArr2[2];
        int i22 = iArr[2];
        iArr3[1] = (bit2 ^ ((i2 & i3) ^ ((i3 & i21) ^ (i22 & i2)))) ^ bit3;
        iArr3[2] = ((((iArr[0] & i21) ^ (iArr2[0] & i22)) ^ (i22 & i21)) ^ bit3) ^ bit;
        Utils.setBit(viewArr[0].communicatedBits, tape.pos, (byte) i6);
        Utils.setBit(viewArr[1].communicatedBits, tape.pos, (byte) iArr3[1]);
        Utils.setBit(viewArr[2].communicatedBits, tape.pos, (byte) iArr3[2]);
        tape.pos++;
    }

    private static boolean subarrayEquals(int[] iArr, int[] iArr2, int i) {
        if (iArr.length < i || iArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
