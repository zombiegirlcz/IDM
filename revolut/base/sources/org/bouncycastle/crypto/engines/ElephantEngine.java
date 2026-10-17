package org.bouncycastle.crypto.engines;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Bytes;
import org.jmrtd.lds.CVCAFile;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class ElephantEngine extends AEADBaseEngine {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private byte[] f228355ad;
    private int adOff;
    private int adlen;
    private final byte[] buffer;
    private byte[] current_mask;
    private byte[] expanded_key;
    private final Permutation instance;
    private int nb_its;
    private byte[] next_mask;
    private byte[] npub;
    private byte[] previous_mask;
    private final byte[] previous_outputMessage;
    private final byte[] tag_buffer;

    public class Delirium implements Permutation {
        private static final int nRounds = 18;
        private final int[] KeccakRhoOffsets;
        private final byte[] KeccakRoundConstants;

        private Delirium() {
            this.KeccakRoundConstants = new byte[]{1, -126, ISOFileInfo.LCS_BYTE, 0, ISOFileInfo.SECURITY_ATTR_EXP, 1, ISOFileInfo.DATA_BYTES2, 9, ISOFileInfo.LCS_BYTE, -120, 9, 10, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_EXP, -119, 3, 2, -128};
            this.KeccakRhoOffsets = new int[]{0, 1, 6, 4, 3, 4, 4, 6, 7, 4, 3, 2, 3, 1, 7, 1, 5, 7, 5, 0, 2, 2, 5, 0, 6};
        }

        private void KeccakP200Round(byte[] bArr, int i) {
            byte[] bArr2 = new byte[25];
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[index(i2, i3)]);
                }
            }
            int i5 = 0;
            while (i5 < 5) {
                int i6 = i5 + 1;
                bArr2[i5 + 5] = (byte) (bArr2[(i5 + 4) % 5] ^ ROL8(bArr2[i6 % 5], 1));
                i5 = i6;
            }
            for (int i21 = 0; i21 < 5; i21++) {
                for (int i22 = 0; i22 < 5; i22++) {
                    int iIndex = index(i21, i22);
                    bArr[iIndex] = (byte) (bArr[iIndex] ^ bArr2[i21 + 5]);
                }
            }
            for (int i32 = 0; i32 < 5; i32++) {
                for (int i33 = 0; i33 < 5; i33++) {
                    bArr2[index(i32, i33)] = ROL8(bArr[index(i32, i33)], this.KeccakRhoOffsets[index(i32, i33)]);
                }
            }
            for (int i43 = 0; i43 < 5; i43++) {
                for (int i59 = 0; i59 < 5; i59++) {
                    bArr[index(i59, ((i59 * 3) + (i43 * 2)) % 5)] = bArr2[index(i43, i59)];
                }
            }
            for (int i66 = 0; i66 < 5; i66++) {
                int i74 = 0;
                while (i74 < 5) {
                    int i92 = i74 + 1;
                    bArr2[i74] = (byte) (bArr[index(i74, i66)] ^ ((~bArr[index(i92 % 5, i66)]) & bArr[index((i74 + 2) % 5, i66)]));
                    i74 = i92;
                }
                for (int i96 = 0; i96 < 5; i96++) {
                    bArr[index(i96, i66)] = bArr2[i96];
                }
            }
            bArr[0] = (byte) (this.KeccakRoundConstants[i] ^ bArr[0]);
        }

        private byte ROL8(byte b4, int i) {
            return (byte) (((b4 & 255) >>> (8 - i)) | (b4 << i));
        }

        private int index(int i, int i2) {
            return (i2 * 5) + i;
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            int i = elephantEngine.BlockSize - 1;
            byte bRotl = elephantEngine.rotl(elephantEngine.current_mask[0]);
            ElephantEngine elephantEngine2 = ElephantEngine.this;
            bArr[i] = (byte) ((bRotl ^ elephantEngine2.rotl(elephantEngine2.current_mask[2])) ^ (ElephantEngine.this.current_mask[13] << 1));
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            for (int i = 0; i < 18; i++) {
                KeccakP200Round(bArr, i);
            }
        }
    }

    public class Dumbo extends Spongent {
        public Dumbo() {
            super(160, 20, 80, (byte) 117);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            ElephantEngine.this.next_mask[r1.BlockSize - 1] = (byte) (((((ElephantEngine.this.current_mask[0] & UnsignedBytes.MAX_VALUE) << 3) | ((ElephantEngine.this.current_mask[0] & UnsignedBytes.MAX_VALUE) >>> 5)) ^ ((ElephantEngine.this.current_mask[3] & UnsignedBytes.MAX_VALUE) << 7)) ^ ((ElephantEngine.this.current_mask[13] & UnsignedBytes.MAX_VALUE) >>> 7));
        }
    }

    public enum ElephantParameters {
        elephant160,
        elephant176,
        elephant200
    }

    public class Jumbo extends Spongent {
        public Jumbo() {
            super(SyslogConstants.LOG_LOCAL6, 22, 90, (byte) 69);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            bArr[elephantEngine.BlockSize - 1] = (byte) ((elephantEngine.rotl(elephantEngine.current_mask[0]) ^ ((ElephantEngine.this.current_mask[3] & UnsignedBytes.MAX_VALUE) << 7)) ^ ((ElephantEngine.this.current_mask[19] & UnsignedBytes.MAX_VALUE) >>> 7));
        }
    }

    public interface Permutation {
        void lfsr_step();

        void permutation(byte[] bArr);
    }

    public static abstract class Spongent implements Permutation {
        private final byte lfsrIV;
        private final int nBits;
        private final int nRounds;
        private final int nSBox;
        private final byte[] sBoxLayer = {-18, -19, -21, ISO7816.INS_CREATE_FILE, ISO7816.INS_APPEND_RECORD, -31, ISO7816.INS_DELETE_FILE, -17, -25, -22, -24, -27, -23, -20, -29, -26, -34, -35, -37, ISO7816.INS_WRITE_BINARY, ISO7816.INS_WRITE_RECORD, -47, -44, -33, -41, ISO7816.INS_PUT_DATA, ISO7816.INS_LOAD_KEY_FILE, -43, -39, ISO7816.INS_UPDATE_RECORD, -45, ISO7816.INS_UPDATE_BINARY, -66, -67, -69, ISO7816.INS_READ_BINARY, -78, ISO7816.INS_READ_BINARY2, ISO7816.INS_READ_BINARY_STAMPED, -65, -73, -70, -72, -75, -71, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD2, ISO7816.INS_READ_RECORD_STAMPED, 14, 13, 11, 0, 2, 1, 4, 15, 7, 10, 8, 5, 9, 12, 3, 6, 46, 45, 43, 32, ISO7816.INS_MSE, Constants.NFC_READER, ISO7816.INS_CHANGE_CHV, 47, 39, ISO7816.INS_PSO, 40, 37, 41, ISO7816.INS_UNBLOCK_CHV, 35, 38, 30, 29, Ascii.ESC, 16, 18, 17, Ascii.DC4, Ascii.US, Ascii.ETB, Ascii.SUB, Ascii.CAN, Ascii.NAK, Ascii.EM, 28, 19, Ascii.SYN, 78, 77, 75, SignedBytes.MAX_POWER_OF_TWO, CVCAFile.CAR_TAG, 65, ISO7816.INS_REHABILITATE_CHV, 79, 71, 74, 72, 69, 73, 76, 67, 70, -2, -3, -5, -16, -14, -15, -12, -1, -9, -6, -8, -11, -7, -4, -13, -10, 126, 125, 123, ISO7816.INS_MANAGE_CHANNEL, 114, 113, 116, Ascii.DEL, 119, 122, 120, 117, 121, 124, 115, 118, -82, -83, ISOFileInfo.AB, ISOFileInfo.A0, -94, ISOFileInfo.A1, -92, -81, -89, -86, -88, ISOFileInfo.A5, -87, -84, -93, -90, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -128, -126, ISOFileInfo.DATA_BYTES2, -124, -113, ISOFileInfo.FCI_EXT, ISOFileInfo.LCS_BYTE, -120, ISOFileInfo.PROP_INFO, -119, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.FILE_IDENTIFIER, -122, 94, 93, 91, 80, 82, 81, 84, 95, 87, 90, 88, 85, 89, 92, 83, 86, -98, -99, -101, -112, -110, -111, -108, -97, -105, -102, -104, -107, -103, -100, -109, -106, -50, -51, -53, ISO7816.INS_GET_RESPONSE, ISO7816.INS_ENVELOPE, -63, -60, -49, -57, ISO7816.INS_GET_DATA, -56, -59, -55, -52, -61, -58, 62, 61, 59, ISO7816.INS_DECREASE, ISO7816.INS_INCREASE, Constants.INQUIRY, ISO7816.INS_DECREASE_STAMPED, 63, 55, 58, 56, 53, 57, 60, 51, 54, 110, 109, 107, 96, ISOFileInfo.FCP_BYTE, 97, ISOFileInfo.FMD_BYTE, ISOFileInfo.FCI_BYTE, 103, 106, 104, 101, 105, 108, 99, 102};

        public Spongent(int i, int i2, int i3, byte b4) {
            this.nRounds = i3;
            this.nSBox = i2;
            this.lfsrIV = b4;
            this.nBits = i;
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            int i;
            byte b4 = this.lfsrIV;
            byte[] bArr2 = new byte[this.nSBox];
            for (int i2 = 0; i2 < this.nRounds; i2++) {
                bArr[0] = (byte) (bArr[0] ^ b4);
                int i3 = this.nSBox - 1;
                int i5 = b4 & 32;
                int i6 = b4 & SignedBytes.MAX_POWER_OF_TWO;
                bArr[i3] = (byte) (bArr[i3] ^ ((byte) (((((((((b4 & 1) << 7) | ((b4 & 2) << 5)) | ((b4 & 4) << 3)) | ((b4 & 8) << 1)) | ((b4 & 16) >>> 1)) | (i5 >>> 3)) | (i6 >>> 5)) | ((b4 & 128) >>> 7))));
                b4 = (byte) (((b4 << 1) | ((i6 >>> 6) ^ (i5 >>> 5))) & CertificateBody.profileType);
                for (int i21 = 0; i21 < this.nSBox; i21++) {
                    bArr[i21] = this.sBoxLayer[bArr[i21] & UnsignedBytes.MAX_VALUE];
                }
                Arrays.fill(bArr2, (byte) 0);
                int i22 = 0;
                while (true) {
                    i = this.nSBox;
                    if (i22 < i) {
                        for (int i32 = 0; i32 < 8; i32++) {
                            int i33 = (i22 << 3) + i32;
                            int i43 = this.nBits;
                            if (i33 != i43 - 1) {
                                i33 = ((i33 * i43) >> 2) % (i43 - 1);
                            }
                            int i59 = i33 >>> 3;
                            bArr2[i59] = (byte) (((((bArr[i22] & UnsignedBytes.MAX_VALUE) >>> i32) & 1) << (i33 & 7)) ^ bArr2[i59]);
                        }
                        i22++;
                    }
                }
                System.arraycopy(bArr2, 0, bArr, 0, i);
            }
        }
    }

    public ElephantEngine(ElephantParameters elephantParameters) {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 12;
        int iOrdinal = elephantParameters.ordinal();
        if (iOrdinal == 0) {
            this.BlockSize = 20;
            this.instance = new Dumbo();
            this.MAC_SIZE = 8;
            this.algorithmName = "Elephant 160 AEAD";
        } else if (iOrdinal == 1) {
            this.BlockSize = 22;
            this.instance = new Jumbo();
            this.algorithmName = "Elephant 176 AEAD";
            this.MAC_SIZE = 8;
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("Invalid parameter settings for Elephant");
            }
            this.BlockSize = 25;
            this.instance = new Delirium();
            this.algorithmName = "Elephant 200 AEAD";
            this.MAC_SIZE = 16;
        }
        int i = this.BlockSize;
        this.tag_buffer = new byte[i];
        this.previous_mask = new byte[i];
        this.current_mask = new byte[i];
        this.next_mask = new byte[i];
        this.buffer = new byte[i];
        this.previous_outputMessage = new byte[i];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Stream, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void absorbAAD() {
        processAADBytes(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void absorbCiphertext() {
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void computeCipherBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        System.arraycopy(this.npub, 0, this.buffer, 0, this.IV_SIZE);
        Arrays.fill(this.buffer, this.IV_SIZE, this.BlockSize, (byte) 0);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        Bytes.xorTo(i2, bArr, i, this.buffer);
        System.arraycopy(this.buffer, 0, bArr2, i3, i2);
    }

    private void lfsr_step() {
        this.instance.lfsr_step();
        System.arraycopy(this.current_mask, 1, this.next_mask, 0, this.BlockSize - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void processAADBytes(byte[] r10) {
        /*
            r9 = this;
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r0 = r9.m_state
            int r0 = r0.ord
            r1 = 6
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L39
            if (r0 == r2) goto L29
            r5 = 5
            if (r0 == r5) goto L12
            if (r0 == r1) goto L29
            goto L37
        L12:
            byte[] r0 = r9.expanded_key
            byte[] r5 = r9.current_mask
            int r6 = r9.BlockSize
            java.lang.System.arraycopy(r0, r3, r5, r3, r6)
            byte[] r0 = r9.npub
            int r5 = r9.IV_SIZE
            java.lang.System.arraycopy(r0, r3, r10, r3, r5)
            int r0 = r9.IV_SIZE
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r5 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.DecAad
        L26:
            r9.m_state = r5
            goto L4e
        L29:
            int r0 = r9.adOff
            int r5 = r9.adlen
            if (r0 != r5) goto L37
            int r0 = r9.BlockSize
            java.util.Arrays.fill(r10, r3, r0, r3)
            r10[r3] = r4
            return
        L37:
            r0 = r3
            goto L4e
        L39:
            byte[] r0 = r9.expanded_key
            byte[] r5 = r9.current_mask
            int r6 = r9.BlockSize
            java.lang.System.arraycopy(r0, r3, r5, r3, r6)
            byte[] r0 = r9.npub
            int r5 = r9.IV_SIZE
            java.lang.System.arraycopy(r0, r3, r10, r3, r5)
            int r0 = r9.IV_SIZE
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r5 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.EncAad
            goto L26
        L4e:
            int r5 = r9.BlockSize
            int r5 = r5 - r0
            int r6 = r9.adlen
            int r7 = r9.adOff
            int r6 = r6 - r7
            if (r5 > r6) goto L63
            byte[] r1 = r9.f228355ad
            java.lang.System.arraycopy(r1, r7, r10, r0, r5)
            int r10 = r9.adOff
            int r10 = r10 + r5
            r9.adOff = r10
            return
        L63:
            if (r6 <= 0) goto L6f
            byte[] r8 = r9.f228355ad
            java.lang.System.arraycopy(r8, r7, r10, r0, r6)
            int r7 = r9.adOff
            int r7 = r7 + r6
            r9.adOff = r7
        L6f:
            int r6 = r6 + r0
            int r0 = r0 + r5
            java.util.Arrays.fill(r10, r6, r0, r3)
            r10[r6] = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r10 = r9.m_state
            int r10 = r10.ord
            if (r10 == r2) goto L84
            if (r10 == r1) goto L7f
            return
        L7f:
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r10 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.DecData
            r9.m_state = r10
            return
        L84:
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r10 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.EncData
            r9.m_state = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.ElephantEngine.processAADBytes(byte[]):void");
    }

    private void processBuffer(byte[] bArr, int i, byte[] bArr2, int i2, AEADBaseEngine.State state) {
        AEADBaseEngine.State state2 = this.m_state;
        if (state2 == AEADBaseEngine.State.DecInit || state2 == AEADBaseEngine.State.EncInit) {
            processFinalAAD();
        }
        lfsr_step();
        computeCipherBlock(bArr, i, this.BlockSize, bArr2, i2);
        if (this.nb_its > 0) {
            System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, this.BlockSize);
            absorbCiphertext();
        }
        if (this.m_state != state) {
            absorbAAD();
        }
        swapMasks();
        this.nb_its++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte rotl(byte b4) {
        return (byte) (((b4 & UnsignedBytes.MAX_VALUE) >>> 7) | (b4 << 1));
    }

    private void swapMasks() {
        byte[] bArr = this.previous_mask;
        this.previous_mask = this.current_mask;
        this.current_mask = this.next_mask;
        this.next_mask = bArr;
    }

    public static void xorTo(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ (bArr[i2] ^ bArr2[i2]));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void checkAAD() {
        int i = this.m_state.ord;
        if (i == 3) {
            throw new IllegalArgumentException(a.i(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size"));
        }
        if (i == 4) {
            throw new IllegalArgumentException(a.i(new StringBuilder(), this.algorithmName, " cannot be reused for encryption"));
        }
        if (i == 7) {
            throw new IllegalArgumentException(a.i(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the plaintext to be processed exceeds the a block size"));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public boolean checkData(boolean z) {
        switch (this.m_state.ord) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD2(state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
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
    public int getOutputSize(int i) {
        int i2 = this.m_state.ord;
        if (i2 == 0) {
            throw new IllegalArgumentException(a.i(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i + this.m_bufPos + this.MAC_SIZE;
        }
        if (i2 == 4 || i2 == 8) {
            return 0;
        }
        return Math.max(0, (i + this.m_bufPos) - this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        switch (this.m_state.ord) {
            case 0:
                throw new IllegalArgumentException(a.i(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
            case 1:
            case 2:
            case 3:
                int i2 = this.m_bufPos + i;
                return i2 - (i2 % this.BlockSize);
            case 4:
            case 8:
                return 0;
            case 5:
            case 6:
            case 7:
                int iMax = Math.max(0, (this.m_bufPos + i) - this.MAC_SIZE);
                return iMax - (iMax % this.BlockSize);
            default:
                return Math.max(0, (i + this.m_bufPos) - this.MAC_SIZE);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b4) {
        super.processAADByte(b4);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBuffer(bArr, i, bArr2, i2, AEADBaseEngine.State.DecData);
        System.arraycopy(bArr, i, this.previous_outputMessage, 0, this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBuffer(bArr, i, bArr2, i2, AEADBaseEngine.State.EncData);
        System.arraycopy(bArr2, i2, this.previous_outputMessage, 0, this.BlockSize);
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
        if (this.adOff == -1) {
            this.f228355ad = ((AEADBaseEngine.StreamAADOperator) this.aadOperator).getBytes();
            this.adOff = 0;
            this.adlen = this.aadOperator.getLen();
            this.aadOperator.reset();
        }
        int i = this.m_state.ord;
        if (i == 1 || i == 5) {
            processAADBytes(this.tag_buffer);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        processFinalAAD();
        int i2 = this.BlockSize;
        int i3 = len / i2;
        int i5 = i3 + 1;
        int i6 = len % i2 != 0 ? i5 : i3;
        int i21 = (this.IV_SIZE + this.adlen) / i2;
        processBytes(this.m_buf, bArr, i, Math.max(i3 + 2, i21), i6, i5, len, i21 + 1);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        this.instance.permutation(this.tag_buffer);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        System.arraycopy(this.tag_buffer, 0, this.mac, 0, this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    private void processBytes(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i5, int i6, int i21) {
        byte[] bArr3 = new byte[this.BlockSize];
        int i22 = this.nb_its;
        int i32 = i;
        int i33 = 0;
        while (i22 < i2) {
            int i43 = i22 == i3 + (-1) ? i6 - (this.BlockSize * i22) : this.BlockSize;
            lfsr_step();
            if (i22 < i3) {
                computeCipherBlock(bArr, i33, i43, bArr2, i32);
                if (this.forEncryption) {
                    System.arraycopy(this.buffer, 0, bArr3, 0, i43);
                } else {
                    System.arraycopy(bArr, i33, bArr3, 0, i43);
                }
                i32 += i43;
                i33 += i43;
            }
            if (i22 > 0 && i22 <= i5) {
                int i59 = this.BlockSize;
                int i66 = (i22 - 1) * i59;
                if (i66 == i6) {
                    Arrays.fill(this.buffer, 1, i59, (byte) 0);
                    this.buffer[0] = 1;
                } else {
                    int i74 = i6 - i66;
                    if (i59 <= i74) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i59);
                    } else if (i74 > 0) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i74);
                        Arrays.fill(this.buffer, i74, this.BlockSize, (byte) 0);
                        this.buffer[i74] = 1;
                    }
                }
                absorbCiphertext();
            }
            i22++;
            if (i22 < i21) {
                absorbAAD();
            }
            swapMasks();
            System.arraycopy(bArr3, 0, this.previous_outputMessage, 0, this.BlockSize);
        }
        this.nb_its = i22;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.npub = bArr2;
        byte[] bArr3 = new byte[this.BlockSize];
        this.expanded_key = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, this.KEY_SIZE);
        this.instance.permutation(this.expanded_key);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        Arrays.fill(this.tag_buffer, (byte) 0);
        Arrays.fill(this.previous_outputMessage, (byte) 0);
        this.nb_its = 0;
        this.adOff = -1;
    }
}
