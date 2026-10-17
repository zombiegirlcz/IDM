package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.reflect.Array;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.RomulusDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes14.dex */
public class RomulusEngine extends AEADBaseEngine {
    private static final int AD_BLK_LEN_HALF = 16;
    private final byte[] CNT;
    private Instance instance;
    private byte[] k;
    private byte[] npub;
    private static final byte[] sbox_8 = {101, 76, 106, CVCAFile.CAR_TAG, 75, 99, 67, 107, 85, 117, 90, 122, 83, 115, 91, 123, 53, ISOFileInfo.SECURITY_ATTR_COMPACT, 58, ISOFileInfo.DATA_BYTES2, -119, 51, -128, 59, -107, 37, -104, ISO7816.INS_PSO, -112, 35, -103, 43, -27, -52, -24, -63, -55, ISO7816.INS_CREATE_FILE, ISO7816.INS_GET_RESPONSE, -23, -43, -11, ISO7816.INS_LOAD_KEY_FILE, -8, ISO7816.INS_WRITE_BINARY, -16, -39, -7, ISOFileInfo.A5, 28, -88, 18, Ascii.ESC, ISOFileInfo.A0, 19, -87, 5, -75, 10, -72, 3, ISO7816.INS_READ_BINARY, 11, -71, ISO7816.INS_INCREASE, -120, 60, ISOFileInfo.PROP_INFO, ISOFileInfo.ENV_TEMP_EF, ISO7816.INS_DECREASE_STAMPED, -124, 61, -111, ISO7816.INS_MSE, -100, ISO7816.INS_UNBLOCK_CHV, -108, ISO7816.INS_CHANGE_CHV, -99, 45, ISOFileInfo.FCP_BYTE, 74, 108, 69, 77, ISOFileInfo.FMD_BYTE, ISO7816.INS_REHABILITATE_CHV, 109, 82, 114, 92, 124, 84, 116, 93, 125, ISOFileInfo.A1, Ascii.SUB, -84, Ascii.NAK, 29, -92, Ascii.DC4, -83, 2, ISO7816.INS_READ_BINARY2, 12, PSSSigner.TRAILER_IMPLICIT, 4, ISO7816.INS_READ_BINARY_STAMPED, 13, -67, -31, -56, -20, -59, -51, ISO7816.INS_DELETE_FILE, -60, -19, -47, -15, ISO7816.INS_UPDATE_RECORD, -4, -44, -12, -35, -3, 54, ISOFileInfo.CHANNEL_SECURITY, 56, -126, ISOFileInfo.SECURITY_ATTR_EXP, ISO7816.INS_DECREASE, ISOFileInfo.FILE_IDENTIFIER, 57, -106, 38, -102, 40, -109, 32, -101, 41, 102, 78, 104, 65, 73, 96, SignedBytes.MAX_POWER_OF_TWO, 105, 86, 118, 88, 120, 80, ISO7816.INS_MANAGE_CHANNEL, 89, 121, -90, 30, -86, 17, Ascii.EM, -93, 16, ISOFileInfo.AB, 6, ISO7816.INS_READ_RECORD_STAMPED, 8, -70, 0, ISO7816.INS_READ_RECORD2, 9, -69, -26, -50, -22, ISO7816.INS_ENVELOPE, -53, -29, -61, -21, ISO7816.INS_UPDATE_BINARY, -10, ISO7816.INS_PUT_DATA, -6, -45, -13, -37, -5, Constants.INQUIRY, ISOFileInfo.LCS_BYTE, 62, -122, -113, 55, ISOFileInfo.FCI_EXT, 63, -110, Constants.NFC_READER, -98, 46, -105, 39, -97, 47, 97, 72, 110, 70, 79, 103, 71, ISOFileInfo.FCI_BYTE, 81, 113, 94, 126, 87, 119, 95, Ascii.DEL, -94, Ascii.CAN, -82, Ascii.SYN, Ascii.US, -89, Ascii.ETB, -81, 1, -78, 14, -66, 7, -73, 15, -65, ISO7816.INS_APPEND_RECORD, ISO7816.INS_GET_DATA, -18, -58, -49, -25, -57, -17, ISO7816.INS_WRITE_RECORD, -14, -34, -2, -41, -9, -33, -1};
    private static final byte[] TWEAKEY_P = {9, 15, 8, 13, 10, 14, 12, 11, 0, 1, 2, 3, 4, 5, 6, 7};
    private static final byte[] RC = {1, 3, 7, 15, Ascii.US, 62, 61, 59, 55, 47, 30, 60, 57, 51, 39, 14, 29, 58, 53, 43, Ascii.SYN, ISO7816.INS_UNBLOCK_CHV, Ascii.CAN, ISO7816.INS_DECREASE, Constants.NFC_READER, 2, 5, 11, Ascii.ETB, 46, 28, 56, Constants.INQUIRY, 35, 6, 13, Ascii.ESC, 54, 45, Ascii.SUB};

    public interface Instance {
        void processBufferAAD(byte[] bArr, int i);

        void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2);

        void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2);

        void processFinalAAD();

        void processFinalBlock(byte[] bArr, int i);

        void reset();
    }

    public class RomulusM implements Instance {
        private int offset;
        private final byte[] mac_s = new byte[16];
        private final byte[] mac_CNT = new byte[7];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final byte[] f228378s = new byte[16];
        private boolean twist = true;

        public RomulusM() {
        }

        public int ad_encryption(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4) {
            byte[] bArr5 = new byte[16];
            byte[] bArr6 = new byte[16];
            int iMin = Math.min(i2, 16);
            int i3 = i2 - iMin;
            RomulusEngine.this.pad(bArr, i, bArr6, 16, iMin);
            Bytes.xorTo(16, bArr6, bArr2);
            int i5 = i + iMin;
            this.offset = i5;
            RomulusEngine.this.lfsr_gf56(bArr4);
            if (i3 == 0) {
                return i3;
            }
            int iMin2 = Math.min(i3, 16);
            int i6 = i3 - iMin2;
            RomulusEngine.this.pad(bArr, i5, bArr5, 16, iMin2);
            this.offset = i5 + iMin2;
            RomulusEngine.this.block_cipher(bArr2, bArr3, bArr5, 0, bArr4, ISO7816.INS_UNBLOCK_CHV);
            RomulusEngine.this.lfsr_gf56(bArr4);
            return i6;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i) {
            if (this.twist) {
                Bytes.xorTo(RomulusEngine.this.MAC_SIZE, bArr, i, this.mac_s);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.block_cipher(this.mac_s, romulusEngine.k, bArr, i, this.mac_CNT, (byte) 40);
            }
            this.twist = !this.twist;
            RomulusEngine.this.lfsr_gf56(this.mac_CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            if (RomulusEngine.this.aadOperator.getLen() == 0) {
                RomulusEngine.this.lfsr_gf56(this.mac_CNT);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                int i = romulusEngine.m_aadPos;
                if (i != 0) {
                    Arrays.fill(romulusEngine.m_aad, i, romulusEngine.BlockSize - 1, (byte) 0);
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    byte[] bArr = romulusEngine2.m_aad;
                    int i2 = romulusEngine2.BlockSize;
                    bArr[i2 - 1] = (byte) (romulusEngine2.m_aadPos & 15);
                    if (this.twist) {
                        Bytes.xorTo(i2, bArr, this.mac_s);
                    } else {
                        romulusEngine2.block_cipher(this.mac_s, romulusEngine2.k, RomulusEngine.this.m_aad, 0, this.mac_CNT, (byte) 40);
                    }
                    RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                }
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.m_aadPos = 0;
            romulusEngine3.m_bufPos = romulusEngine3.dataOperator.getLen();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void processFinalBlock(byte[] r31, int r32) {
            /*
                Method dump skipped, instruction units count: 501
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.RomulusEngine.RomulusM.processFinalBlock(byte[], int):void");
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f228378s);
            Arrays.clear(this.mac_s);
            RomulusEngine.this.reset_lfsr_gf56(this.mac_CNT);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }
    }

    public class RomulusN implements Instance {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final byte[] f228379s = new byte[16];
        boolean twist;

        public RomulusN() {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i) {
            if (this.twist) {
                Bytes.xorTo(16, bArr, i, this.f228379s);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.block_cipher(this.f228379s, romulusEngine.k, bArr, i, RomulusEngine.this.CNT, (byte) 8);
            }
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.lfsr_gf56(romulusEngine2.CNT);
            this.twist = !this.twist;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            RomulusEngine.this.g8A(this.f228379s, bArr2, i2);
            for (int i3 = 0; i3 < 16; i3++) {
                int i5 = i3 + i2;
                byte b4 = (byte) (bArr2[i5] ^ bArr[i3 + i]);
                bArr2[i5] = b4;
                byte[] bArr3 = this.f228379s;
                bArr3[i3] = (byte) (b4 ^ bArr3[i3]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.f228379s, romulusEngine2.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            RomulusEngine.this.g8A(this.f228379s, bArr2, i2);
            for (int i3 = 0; i3 < 16; i3++) {
                byte[] bArr3 = this.f228379s;
                int i5 = i3 + i;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i5]);
                int i6 = i3 + i2;
                bArr2[i6] = (byte) (bArr2[i6] ^ bArr[i5]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.f228379s, romulusEngine2.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            int i = RomulusEngine.this.m_aadPos;
            if (i != 0) {
                byte[] bArr = new byte[16];
                int iMin = Math.min(i, 16);
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.pad(romulusEngine.m_aad, 0, bArr, 16, iMin);
                if (this.twist) {
                    Bytes.xorTo(16, bArr, this.f228379s);
                } else {
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    romulusEngine2.block_cipher(this.f228379s, romulusEngine2.k, bArr, 0, RomulusEngine.this.CNT, (byte) 8);
                }
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
            }
            if (RomulusEngine.this.aadOperator.getLen() == 0) {
                RomulusEngine romulusEngine4 = RomulusEngine.this;
                romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                romulusEngine5.block_cipher(this.f228379s, romulusEngine5.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, Ascii.SUB);
            } else {
                RomulusEngine romulusEngine6 = RomulusEngine.this;
                int i2 = romulusEngine6.m_aadPos & 15;
                byte[] bArr2 = this.f228379s;
                byte[] bArr3 = romulusEngine6.k;
                if (i2 != 0) {
                    romulusEngine6.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, Ascii.SUB);
                } else {
                    romulusEngine6.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, Ascii.CAN);
                }
            }
            RomulusEngine romulusEngine7 = RomulusEngine.this;
            romulusEngine7.reset_lfsr_gf56(romulusEngine7.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i) {
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            if (len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE) == 0) {
                romulusEngine.lfsr_gf56(romulusEngine.CNT);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.f228379s, romulusEngine2.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, Ascii.NAK);
            } else {
                int i2 = romulusEngine.m_bufPos;
                if (i2 != 0) {
                    int iMin = Math.min(i2, 16);
                    RomulusEngine romulusEngine3 = RomulusEngine.this;
                    romulusEngine3.rho(romulusEngine3.m_buf, 0, bArr, i, this.f228379s, iMin);
                    RomulusEngine romulusEngine4 = RomulusEngine.this;
                    romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                    RomulusEngine romulusEngine5 = RomulusEngine.this;
                    romulusEngine5.block_cipher(this.f228379s, romulusEngine5.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, RomulusEngine.this.m_bufPos == 16 ? Ascii.DC4 : Ascii.NAK);
                }
            }
            RomulusEngine romulusEngine6 = RomulusEngine.this;
            romulusEngine6.g8A(this.f228379s, romulusEngine6.mac, 0);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f228379s);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }
    }

    public static class RomulusParameters {
        public static final int ROMULUS_M = 0;
        public static final int ROMULUS_N = 1;
        public static final int ROMULUS_T = 2;
        public static final RomulusParameters RomulusM = new RomulusParameters(0);
        public static final RomulusParameters RomulusN = new RomulusParameters(1);
        public static final RomulusParameters RomulusT = new RomulusParameters(2);
        private final int ord;

        public RomulusParameters(int i) {
            this.ord = i;
        }
    }

    public class RomulusT implements Instance {
        byte[] CNT_Z;
        byte[] LR;
        byte[] S;
        byte[] T;
        byte[] Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f228380g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f228381h;

        private RomulusT() {
            this.f228381h = new byte[16];
            this.f228380g = new byte[16];
            this.Z = new byte[16];
            this.CNT_Z = new byte[7];
            this.LR = new byte[32];
            this.T = new byte[16];
            this.S = new byte[16];
        }

        private void processAfterAbsorbCiphertext() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i = romulusEngine.m_aadPos;
            int i2 = romulusEngine.BlockSize;
            if (i == i2) {
                RomulusEngine.hirose_128_128_256(this.f228381h, this.f228380g, romulusEngine.m_aad, 0);
                RomulusEngine.this.m_aadPos = 0;
            } else {
                romulusEngine.m_aadPos = i2;
            }
            RomulusEngine.this.lfsr_gf56(this.CNT_Z);
        }

        private void processBuffer(byte[] bArr, int i, byte[] bArr2, int i2) {
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.block_cipher(this.S, this.Z, this.T, 0, romulusEngine.CNT, SignedBytes.MAX_POWER_OF_TWO);
            Bytes.xor(16, this.S, bArr, i, bArr2, i2);
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, (byte) 65);
            System.arraycopy(this.S, 0, this.Z, 0, 16);
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i) {
            RomulusEngine.hirose_128_128_256(this.f228381h, this.f228380g, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            processBuffer(bArr, i, bArr2, i2);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr, i, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            processBuffer(bArr, i, bArr2, i2);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr2, i2, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            Arrays.fill(romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.AADBufferSize - 1, (byte) 0);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            int i = romulusEngine2.m_aadPos;
            if (i >= 16) {
                byte[] bArr = romulusEngine2.m_aad;
                bArr[romulusEngine2.AADBufferSize - 1] = (byte) (i & 15);
                RomulusEngine.hirose_128_128_256(this.f228381h, this.f228380g, bArr, 0);
                RomulusEngine.this.m_aadPos = 0;
                return;
            }
            if (i < 0 || romulusEngine2.aadOperator.getLen() == 0) {
                return;
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            byte[] bArr2 = romulusEngine3.m_aad;
            int i2 = romulusEngine3.BlockSize;
            bArr2[i2 - 1] = (byte) (romulusEngine3.m_aadPos & 15);
            romulusEngine3.m_aadPos = i2;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i) {
            char c2;
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i2 = len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE);
            int i3 = romulusEngine.m_bufPos;
            if (i3 != 0) {
                int iMin = Math.min(i3, 16);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, SignedBytes.MAX_POWER_OF_TWO);
                Bytes.xor(iMin, RomulusEngine.this.m_buf, this.S, bArr, i);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
                RomulusEngine romulusEngine4 = RomulusEngine.this;
                if (!romulusEngine4.forEncryption) {
                    bArr = romulusEngine4.m_buf;
                    i = 0;
                }
                System.arraycopy(bArr, i, romulusEngine4.m_aad, romulusEngine4.m_aadPos, romulusEngine4.m_bufPos);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                Arrays.fill(romulusEngine5.m_aad, romulusEngine5.m_aadPos + romulusEngine5.m_bufPos, romulusEngine5.AADBufferSize - 1, (byte) 0);
                RomulusEngine romulusEngine6 = RomulusEngine.this;
                byte[] bArr2 = romulusEngine6.m_aad;
                int i5 = romulusEngine6.m_aadPos;
                bArr2[(romulusEngine6.BlockSize + i5) - 1] = (byte) (romulusEngine6.m_bufPos & 15);
                if (i5 == 0) {
                    byte[] bArr3 = romulusEngine6.npub;
                    RomulusEngine romulusEngine7 = RomulusEngine.this;
                    byte[] bArr4 = romulusEngine7.m_aad;
                    int i6 = romulusEngine7.BlockSize;
                    System.arraycopy(bArr3, 0, bArr4, i6, i6);
                    c2 = 0;
                } else {
                    c2 = 16;
                }
                RomulusEngine.hirose_128_128_256(this.f228381h, this.f228380g, RomulusEngine.this.m_aad, 0);
                RomulusEngine.this.lfsr_gf56(this.CNT_Z);
            } else if (romulusEngine.m_aadPos != 0) {
                if (i2 > 0) {
                    Arrays.fill(romulusEngine.m_aad, romulusEngine.BlockSize, romulusEngine.AADBufferSize, (byte) 0);
                } else {
                    if (romulusEngine.aadOperator.getLen() != 0) {
                        byte[] bArr5 = RomulusEngine.this.npub;
                        RomulusEngine romulusEngine8 = RomulusEngine.this;
                        System.arraycopy(bArr5, 0, romulusEngine8.m_aad, romulusEngine8.m_aadPos, 16);
                        RomulusEngine.this.m_aadPos = 0;
                        c2 = 0;
                    }
                    RomulusEngine.hirose_128_128_256(this.f228381h, this.f228380g, RomulusEngine.this.m_aad, 0);
                }
                c2 = 16;
                RomulusEngine.hirose_128_128_256(this.f228381h, this.f228380g, RomulusEngine.this.m_aad, 0);
            } else if (i2 > 0) {
                Arrays.fill(romulusEngine.m_aad, 0, romulusEngine.BlockSize, (byte) 0);
                byte[] bArr6 = RomulusEngine.this.npub;
                RomulusEngine romulusEngine9 = RomulusEngine.this;
                byte[] bArr7 = romulusEngine9.m_aad;
                int i21 = romulusEngine9.BlockSize;
                System.arraycopy(bArr6, 0, bArr7, i21, i21);
                RomulusEngine.hirose_128_128_256(this.f228381h, this.f228380g, RomulusEngine.this.m_aad, 0);
                c2 = 0;
            } else {
                c2 = 16;
            }
            if (c2 == 16) {
                System.arraycopy(RomulusEngine.this.npub, 0, RomulusEngine.this.m_aad, 0, 16);
                System.arraycopy(RomulusEngine.this.CNT, 0, RomulusEngine.this.m_aad, 16, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 23, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = Ascii.ETB;
            } else {
                System.arraycopy(this.CNT_Z, 0, RomulusEngine.this.m_aad, 0, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 7, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = 7;
            }
            byte[] bArr8 = this.f228381h;
            bArr8[0] = (byte) (bArr8[0] ^ 2);
            RomulusEngine.hirose_128_128_256(bArr8, this.f228380g, RomulusEngine.this.m_aad, 0);
            System.arraycopy(this.f228381h, 0, this.LR, 0, 16);
            System.arraycopy(this.f228380g, 0, this.LR, 16, 16);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine10 = RomulusEngine.this;
            romulusEngine10.block_cipher(this.LR, romulusEngine10.k, this.LR, 16, this.CNT_Z, ISO7816.INS_REHABILITATE_CHV);
            byte[] bArr9 = this.LR;
            RomulusEngine romulusEngine11 = RomulusEngine.this;
            System.arraycopy(bArr9, 0, romulusEngine11.mac, 0, romulusEngine11.MAC_SIZE);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f228381h);
            Arrays.clear(this.f228380g);
            Arrays.clear(this.LR);
            Arrays.clear(this.T);
            Arrays.clear(this.S);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            System.arraycopy(RomulusEngine.this.npub, 0, this.Z, 0, RomulusEngine.this.IV_SIZE);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.Z, romulusEngine2.k, this.T, 0, this.CNT_Z, CVCAFile.CAR_TAG);
            RomulusEngine.this.reset_lfsr_gf56(this.CNT_Z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RomulusEngine(org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 16
            r3.AADBufferSize = r0
            r3.BlockSize = r0
            r3.MAC_SIZE = r0
            r3.IV_SIZE = r0
            r3.KEY_SIZE = r0
            r0 = 7
            byte[] r0 = new byte[r0]
            r3.CNT = r0
            int r0 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.access$000(r4)
            if (r0 == 0) goto L3c
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L21
            goto L46
        L21:
            java.lang.String r0 = "Romulus-T"
            r3.algorithmName = r0
            r0 = 32
            r3.AADBufferSize = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusT r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusT
            r1 = 0
            r0.<init>()
        L2f:
            r3.instance = r0
            goto L46
        L32:
            java.lang.String r0 = "Romulus-N"
            r3.algorithmName = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusN r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusN
            r0.<init>()
            goto L2f
        L3c:
            java.lang.String r0 = "Romulus-M"
            r3.algorithmName = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusM r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusM
            r0.<init>()
            goto L2f
        L46:
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters r0 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.RomulusN
            if (r4 != r0) goto L4d
            org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType r0 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.Buffered
            goto L4f
        L4d:
            org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType r0 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.Immediate
        L4f:
            org.bouncycastle.crypto.engines.AEADBaseEngine$AADOperatorType r1 = org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType.Counter
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters r2 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.RomulusM
            if (r4 != r2) goto L58
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.Stream
            goto L5a
        L58:
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.Counter
        L5a:
            r3.setInnerMembers(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.RomulusEngine.<init>(org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters):void");
    }

    public static void hirose_128_128_256(RomulusDigest.Friend friend, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by RomulusDigest");
        }
        hirose_128_128_256(bArr, bArr2, bArr3, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset_lfsr_gf56(byte[] bArr) {
        bArr[0] = 1;
        Arrays.fill(bArr, 1, 7, (byte) 0);
    }

    private static void skinny_128_384_plus_enc(byte[] bArr, byte[] bArr2) {
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 4);
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        for (int i = 0; i < 4; i++) {
            int i2 = i << 2;
            System.arraycopy(bArr, i2, bArr3[i], 0, 4);
            System.arraycopy(bArr2, i2, bArr4[0][i], 0, 4);
            System.arraycopy(bArr2, i2 + 16, bArr4[1][i], 0, 4);
            System.arraycopy(bArr2, i2 + 32, bArr4[2][i], 0, 4);
        }
        for (int i3 = 0; i3 < 40; i3++) {
            for (int i5 = 0; i5 < 4; i5++) {
                for (int i6 = 0; i6 < 4; i6++) {
                    byte[] bArr6 = bArr3[i5];
                    bArr6[i6] = sbox_8[bArr6[i6] & UnsignedBytes.MAX_VALUE];
                }
            }
            byte[] bArr7 = bArr3[0];
            byte b4 = bArr7[0];
            byte[] bArr8 = RC;
            bArr7[0] = (byte) (b4 ^ (bArr8[i3] & 15));
            byte[] bArr9 = bArr3[1];
            bArr9[0] = (byte) (bArr9[0] ^ ((bArr8[i3] >>> 4) & 3));
            byte[] bArr10 = bArr3[2];
            bArr10[0] = (byte) (bArr10[0] ^ 2);
            for (int i21 = 0; i21 <= 1; i21++) {
                for (int i22 = 0; i22 < 4; i22++) {
                    byte[] bArr11 = bArr3[i21];
                    bArr11[i22] = (byte) (bArr11[i22] ^ ((bArr4[0][i21][i22] ^ bArr4[1][i21][i22]) ^ bArr4[2][i21][i22]));
                }
            }
            for (int i32 = 0; i32 < 4; i32++) {
                for (int i33 = 0; i33 < 4; i33++) {
                    byte b5 = TWEAKEY_P[(i32 << 2) + i33];
                    int i43 = b5 >>> 2;
                    int i59 = b5 & 3;
                    bArr5[0][i32][i33] = bArr4[0][i43][i59];
                    bArr5[1][i32][i33] = bArr4[1][i43][i59];
                    bArr5[2][i32][i33] = bArr4[2][i43][i59];
                }
            }
            int i66 = 0;
            while (i66 <= 1) {
                for (int i74 = 0; i74 < 4; i74++) {
                    bArr4[0][i66][i74] = bArr5[0][i66][i74];
                    byte b7 = bArr5[1][i66][i74];
                    bArr4[1][i66][i74] = (byte) (((b7 >>> 5) & 1) ^ (((b7 << 1) & 254) ^ ((b7 >>> 7) & 1)));
                    byte b13 = bArr5[2][i66][i74];
                    bArr4[2][i66][i74] = (byte) (((b13 << 1) & 128) ^ (((b13 >>> 1) & CertificateBody.profileType) ^ ((b13 << 7) & 128)));
                }
                i66++;
            }
            while (i66 < 4) {
                for (int i92 = 0; i92 < 4; i92++) {
                    bArr4[0][i66][i92] = bArr5[0][i66][i92];
                    bArr4[1][i66][i92] = bArr5[1][i66][i92];
                    bArr4[2][i66][i92] = bArr5[2][i66][i92];
                }
                i66++;
            }
            byte[] bArr12 = bArr3[1];
            byte b15 = bArr12[3];
            bArr12[3] = bArr12[2];
            bArr12[2] = bArr12[1];
            bArr12[1] = bArr12[0];
            bArr12[0] = b15;
            byte[] bArr13 = bArr3[2];
            byte b17 = bArr13[0];
            bArr13[0] = bArr13[2];
            bArr13[2] = b17;
            byte b40 = bArr13[1];
            bArr13[1] = bArr13[3];
            bArr13[3] = b40;
            byte[] bArr14 = bArr3[3];
            byte b61 = bArr14[0];
            bArr14[0] = bArr14[1];
            bArr14[1] = bArr14[2];
            bArr14[2] = bArr14[3];
            bArr14[3] = b61;
            for (int i96 = 0; i96 < 4; i96++) {
                byte[] bArr15 = bArr3[1];
                byte b64 = bArr15[i96];
                byte[] bArr16 = bArr3[2];
                bArr15[i96] = (byte) (b64 ^ bArr16[i96]);
                byte b69 = bArr16[i96];
                byte[] bArr17 = bArr3[0];
                byte b76 = (byte) (b69 ^ bArr17[i96]);
                bArr16[i96] = b76;
                byte[] bArr18 = bArr3[3];
                byte b86 = (byte) (bArr18[i96] ^ b76);
                bArr18[i96] = b86;
                bArr18[i96] = bArr16[i96];
                bArr16[i96] = bArr15[i96];
                bArr15[i96] = bArr17[i96];
                bArr17[i96] = b86;
            }
        }
        for (int i99 = 0; i99 < 16; i99++) {
            bArr[i99] = (byte) (bArr3[i99 >>> 2][i99 & 3] & UnsignedBytes.MAX_VALUE);
        }
    }

    public void block_cipher(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b4) {
        byte[] bArr5 = new byte[48];
        System.arraycopy(bArr4, 0, bArr5, 0, 7);
        bArr5[7] = b4;
        System.arraycopy(bArr3, i, bArr5, 16, 16);
        System.arraycopy(bArr2, 0, bArr5, 32, 16);
        skinny_128_384_plus_enc(bArr, bArr5);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD1(state);
    }

    public void g8A(byte[] bArr, byte[] bArr2, int i) {
        int iMin = Math.min(bArr2.length - i, 16);
        for (int i2 = 0; i2 < iMin; i2++) {
            byte b4 = bArr[i2];
            bArr2[i2 + i] = (byte) (((b4 & 1) << 7) ^ (((b4 & UnsignedBytes.MAX_VALUE) >>> 1) ^ (b4 & 128)));
        }
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

    public void lfsr_gf56(byte[] bArr) {
        byte b4 = bArr[6];
        byte b5 = (byte) ((b4 & UnsignedBytes.MAX_VALUE) >>> 7);
        int i = (b4 & UnsignedBytes.MAX_VALUE) << 1;
        byte b7 = bArr[5];
        bArr[6] = (byte) (i | ((b7 & UnsignedBytes.MAX_VALUE) >>> 7));
        int i2 = (b7 & UnsignedBytes.MAX_VALUE) << 1;
        byte b13 = bArr[4];
        bArr[5] = (byte) (i2 | ((b13 & UnsignedBytes.MAX_VALUE) >>> 7));
        int i3 = (b13 & UnsignedBytes.MAX_VALUE) << 1;
        byte b15 = bArr[3];
        bArr[4] = (byte) (i3 | ((b15 & UnsignedBytes.MAX_VALUE) >>> 7));
        int i5 = (b15 & UnsignedBytes.MAX_VALUE) << 1;
        byte b17 = bArr[2];
        bArr[3] = (byte) (i5 | ((b17 & UnsignedBytes.MAX_VALUE) >>> 7));
        int i6 = (b17 & UnsignedBytes.MAX_VALUE) << 1;
        byte b40 = bArr[1];
        bArr[2] = (byte) (i6 | ((b40 & UnsignedBytes.MAX_VALUE) >>> 7));
        int i21 = (b40 & UnsignedBytes.MAX_VALUE) << 1;
        byte b61 = bArr[0];
        bArr[1] = (byte) (i21 | ((b61 & UnsignedBytes.MAX_VALUE) >>> 7));
        int i22 = (b61 & UnsignedBytes.MAX_VALUE) << 1;
        if (b5 == 1) {
            bArr[0] = (byte) (i22 ^ 149);
        } else {
            bArr[0] = (byte) i22;
        }
    }

    public void pad(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr2[i2 - 1] = (byte) (i3 & 15);
        System.arraycopy(bArr, i, bArr2, 0, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b4) {
        super.processAADByte(b4);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        this.instance.processBufferAAD(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.instance.processBufferDecrypt(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.instance.processBufferEncrypt(bArr, i, bArr2, i2);
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
        this.instance.processFinalAAD();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        this.instance.processFinalBlock(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public void rho(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i5;
        byte[] bArr4 = new byte[16];
        pad(bArr, i, bArr4, 16, i3);
        g8A(bArr3, bArr2, i2);
        if (this.forEncryption) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArr3[i6] = (byte) (bArr3[i6] ^ bArr4[i6]);
                int i21 = i6 + i2;
                if (i6 < i3) {
                    bArr2[i21] = (byte) (bArr2[i21] ^ bArr4[i6]);
                } else {
                    bArr2[i21] = 0;
                }
            }
            return;
        }
        for (int i22 = 0; i22 < 16; i22++) {
            byte b4 = (byte) (bArr3[i22] ^ bArr4[i22]);
            bArr3[i22] = b4;
            if (i22 < i3 && (i5 = i22 + i2) < bArr2.length) {
                bArr3[i22] = (byte) (b4 ^ bArr2[i5]);
                bArr2[i5] = (byte) (bArr2[i5] ^ bArr4[i22]);
            }
        }
    }

    public static void hirose_128_128_256(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        byte[] bArr4 = new byte[48];
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        bArr2[0] = (byte) (bArr2[0] ^ 1);
        System.arraycopy(bArr3, i, bArr4, 16, 32);
        skinny_128_384_plus_enc(bArr, bArr4);
        skinny_128_384_plus_enc(bArr2, bArr4);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr5[i2]);
            bArr2[i2] = (byte) (bArr2[i2] ^ bArr5[i2]);
        }
        bArr2[0] = (byte) (bArr2[0] ^ 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.npub = bArr2;
        this.k = bArr;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        this.instance.reset();
    }
}
