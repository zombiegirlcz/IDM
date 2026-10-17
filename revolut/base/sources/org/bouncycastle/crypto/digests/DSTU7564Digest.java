package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU7564Digest implements ExtendedDigest, Memoable {
    private static final int NB_1024 = 16;
    private static final int NB_512 = 8;
    private static final int NR_1024 = 14;
    private static final int NR_512 = 10;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, ISOFileInfo.FCI_EXT, -107, Ascii.ETB, -16, ISO7816.INS_LOAD_KEY_FILE, 9, 109, -13, 29, -53, -55, 77, ISO7816.INS_UNBLOCK_CHV, -81, 121, ISO7816.INS_CREATE_FILE, -105, -3, ISOFileInfo.FCI_BYTE, 75, 69, 57, 62, -35, -93, 79, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_READ_RECORD_STAMPED, -102, 14, Ascii.US, -65, Ascii.NAK, -31, 73, ISO7816.INS_WRITE_RECORD, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, Ascii.EM, -43, -83, 88, -92, -69, ISOFileInfo.A1, ISO7816.INS_UPDATE_RECORD, -14, ISOFileInfo.FILE_IDENTIFIER, 55, CVCAFile.CAR_TAG, ISO7816.INS_DELETE_FILE, 122, ISO7816.INS_INCREASE, -100, -52, ISOFileInfo.AB, 74, -113, 110, 4, 39, 46, -25, ISO7816.INS_APPEND_RECORD, 90, -106, Ascii.SYN, 35, 43, ISO7816.INS_ENVELOPE, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, ISO7816.INS_DECREASE_STAMPED, 72, -4, -73, 106, -120, ISOFileInfo.A5, 83, -122, -7, 91, -37, 56, 123, -61, 30, ISO7816.INS_MSE, 51, ISO7816.INS_CHANGE_CHV, 40, 54, -57, -78, 59, ISOFileInfo.CHANNEL_SECURITY, 119, -70, -11, Ascii.DC4, -97, 8, 85, -101, 76, -2, 96, 92, ISO7816.INS_PUT_DATA, Ascii.CAN, 70, -51, 125, Constants.NFC_READER, ISO7816.INS_READ_BINARY, 63, Ascii.ESC, -119, -1, -21, -124, 105, 58, -99, -41, -45, ISO7816.INS_MANAGE_CHANNEL, 103, SignedBytes.MAX_POWER_OF_TWO, -75, -34, 93, ISO7816.INS_DECREASE, -111, ISO7816.INS_READ_BINARY2, 120, 17, 1, -27, 0, 104, -104, ISOFileInfo.A0, -59, 2, -90, 116, 45, 11, -94, 118, ISO7816.INS_READ_RECORD2, -66, -50, -67, -82, -23, ISOFileInfo.LCS_BYTE, Constants.INQUIRY, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, ISOFileInfo.SECURITY_ATTR_COMPACT, 53, 3, -44, Ascii.DEL, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, Ascii.SUB, -60, 7, 87, -72, 60, ISOFileInfo.FCP_BYTE, -29, -56, -84, 82, ISOFileInfo.FMD_BYTE, 16, ISO7816.INS_WRITE_BINARY, -39, 19, 12, 18, 41, 81, -71, -49, ISO7816.INS_UPDATE_BINARY, 115, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.DATA_BYTES2, 84, ISO7816.INS_GET_RESPONSE, -19, 78, ISO7816.INS_REHABILITATE_CHV, -89, ISO7816.INS_PSO, ISOFileInfo.PROP_INFO, 37, -26, ISO7816.INS_GET_DATA, 124, ISOFileInfo.SECURITY_ATTR_EXP, 86, -128};
    private static final byte[] S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, ISO7816.INS_UPDATE_BINARY, -78, ISO7816.INS_WRITE_RECORD, -112, Ascii.ETB, -8, CVCAFile.CAR_TAG, Ascii.NAK, 86, ISO7816.INS_READ_BINARY_STAMPED, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, ISOFileInfo.ENV_TEMP_EF, Constants.INQUIRY, -10, ISOFileInfo.FMD_BYTE, 88, -98, -12, ISO7816.INS_MSE, -86, 117, 15, 2, ISO7816.INS_READ_BINARY2, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, ISO7816.INS_REHABILITATE_CHV, 62, -97, Ascii.DC4, -56, -82, 84, 16, ISO7816.INS_LOAD_KEY_FILE, PSSSigner.TRAILER_IMPLICIT, Ascii.SUB, 107, 105, -13, -67, 51, ISOFileInfo.AB, -6, -47, -101, 104, 78, Ascii.SYN, -107, -111, -18, 76, 99, ISOFileInfo.CHANNEL_SECURITY, 91, -52, 60, Ascii.EM, ISOFileInfo.A1, ISOFileInfo.DATA_BYTES2, 73, 123, -39, ISOFileInfo.FCI_BYTE, 55, 96, ISO7816.INS_GET_DATA, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, ISOFileInfo.SECURITY_ATTR_COMPACT, -29, 32, ISO7816.INS_DECREASE, ISO7816.INS_UPDATE_RECORD, -73, 108, 74, -75, 63, -105, -44, ISOFileInfo.FCP_BYTE, 45, 6, -92, ISOFileInfo.A5, ISOFileInfo.FILE_IDENTIFIER, 95, ISO7816.INS_PSO, ISO7816.INS_PUT_DATA, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, Ascii.ESC, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, ISO7816.INS_READ_BINARY, -104, Ascii.CAN, ISO7816.INS_INCREASE, 113, 75, -17, 59, ISO7816.INS_MANAGE_CHANNEL, ISOFileInfo.A0, ISO7816.INS_DELETE_FILE, SignedBytes.MAX_POWER_OF_TWO, -1, -61, -87, -26, 120, -7, ISOFileInfo.SECURITY_ATTR_EXP, 70, -128, 30, 56, -31, -72, -88, ISO7816.INS_CREATE_FILE, 12, 35, 118, 29, 37, ISO7816.INS_CHANGE_CHV, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, 82, -14, -126, 80, 122, 47, 116, 83, ISO7816.INS_READ_RECORD2, 97, -81, 57, 53, -34, -51, Ascii.US, -103, -84, -83, 114, ISO7816.INS_UNBLOCK_CHV, -35, ISO7816.INS_WRITE_BINARY, ISOFileInfo.FCI_EXT, -66, 94, -90, -20, 4, -58, 3, ISO7816.INS_DECREASE_STAMPED, -5, -37, 89, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_ENVELOPE, 1, -16, 90, -19, -89, 102, Constants.NFC_READER, Ascii.DEL, ISOFileInfo.LCS_BYTE, 39, -57, ISO7816.INS_GET_RESPONSE, 41, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, ISO7816.INS_MSE, 69, -4, -70, 106, -33, 2, -97, ISO7816.INS_UPDATE_RECORD, 81, 89, 74, Ascii.ETB, 43, ISO7816.INS_ENVELOPE, -108, -12, -69, -93, ISOFileInfo.FCP_BYTE, ISO7816.INS_DELETE_FILE, 113, -44, -51, ISO7816.INS_MANAGE_CHANNEL, Ascii.SYN, -31, 73, 60, ISO7816.INS_GET_RESPONSE, ISO7816.INS_LOAD_KEY_FILE, 92, -101, -83, ISOFileInfo.PROP_INFO, 83, ISOFileInfo.A1, 122, -56, 45, ISO7816.INS_CREATE_FILE, -47, 114, -90, ISO7816.INS_UNBLOCK_CHV, -60, -29, 118, 120, -73, ISO7816.INS_READ_BINARY_STAMPED, 9, 59, 14, 65, 76, -34, -78, -112, 37, ISOFileInfo.A5, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, ISO7816.INS_WRITE_BINARY, 123, Ascii.CAN, -105, -45, 54, -26, 72, 86, ISOFileInfo.DATA_BYTES2, -113, 119, -52, -100, -71, ISO7816.INS_APPEND_RECORD, -84, -72, 47, Ascii.NAK, -92, 124, ISO7816.INS_PUT_DATA, 56, 30, 11, 5, ISO7816.INS_UPDATE_BINARY, Ascii.DC4, 110, 108, 126, 102, -3, ISO7816.INS_READ_BINARY2, -27, 96, -81, 94, 51, ISOFileInfo.FCI_EXT, -55, -16, 93, 109, 63, -120, ISOFileInfo.ENV_TEMP_EF, -57, -9, 29, -23, -20, -19, -128, 41, 39, -49, -103, -88, 80, 15, 55, ISO7816.INS_CHANGE_CHV, 40, ISO7816.INS_DECREASE, -107, ISO7816.INS_WRITE_RECORD, 62, 91, SignedBytes.MAX_POWER_OF_TWO, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_READ_RECORD2, 105, 87, Ascii.US, 7, 28, ISOFileInfo.LCS_BYTE, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.AB, -18, Constants.INQUIRY, -94, 115, -7, ISO7816.INS_GET_DATA, 58, Ascii.SUB, -5, 13, -63, -2, -6, -14, ISOFileInfo.FCI_BYTE, -67, -106, -35, 67, 82, ISO7816.INS_READ_RECORD_STAMPED, 8, -13, -82, -66, Ascii.EM, -119, ISO7816.INS_INCREASE, 38, ISO7816.INS_READ_BINARY, -22, 75, ISOFileInfo.FMD_BYTE, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, Ascii.ESC, 35, 61, 104, ISO7816.INS_PSO, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Ascii.DEL, -59, -89, -25, 97, 90, 6, 70, ISO7816.INS_REHABILITATE_CHV, CVCAFile.CAR_TAG, 4, ISOFileInfo.A0, -37, 57, -122, 84, -86, ISOFileInfo.SECURITY_ATTR_COMPACT, ISO7816.INS_DECREASE_STAMPED, Constants.NFC_READER, ISOFileInfo.SECURITY_ATTR_EXP, -8, 12, 116, 103};
    private static final byte[] S3 = {104, ISOFileInfo.ENV_TEMP_EF, ISO7816.INS_GET_DATA, 77, 115, 75, 78, ISO7816.INS_PSO, -44, 82, 38, ISO7816.INS_READ_RECORD2, 84, 30, Ascii.EM, Ascii.US, ISO7816.INS_MSE, 3, 70, 61, 45, 74, 83, ISOFileInfo.FILE_IDENTIFIER, 19, ISOFileInfo.LCS_BYTE, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, Ascii.SYN, 60, 102, ISO7816.INS_MANAGE_CHANNEL, 93, -13, 69, SignedBytes.MAX_POWER_OF_TWO, -52, -24, -108, 86, 8, -50, Ascii.SUB, 58, ISO7816.INS_WRITE_RECORD, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, ISO7816.INS_UPDATE_BINARY, ISOFileInfo.PROP_INFO, 35, -49, ISO7816.INS_INCREASE, -103, Constants.INQUIRY, Ascii.DC4, -82, -18, -56, 72, -45, ISO7816.INS_DECREASE, ISOFileInfo.A1, -110, 65, ISO7816.INS_READ_BINARY2, Ascii.CAN, -60, ISO7816.INS_UNBLOCK_CHV, 113, 114, ISO7816.INS_REHABILITATE_CHV, Ascii.NAK, -3, 55, -66, 95, -86, -101, -120, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.FCP_BYTE, 12, ISO7816.INS_CHANGE_CHV, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, ISO7816.INS_DECREASE_STAMPED, 126, 16, -15, 123, -113, 99, ISOFileInfo.A0, 5, -102, 67, 119, Constants.NFC_READER, -65, 39, 9, -61, -97, ISO7816.INS_READ_RECORD_STAMPED, -41, 41, ISO7816.INS_ENVELOPE, -21, ISO7816.INS_GET_RESPONSE, -92, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_COMPACT, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, ISO7816.INS_DELETE_FILE, -39, -71, ISO7816.INS_WRITE_BINARY, CVCAFile.CAR_TAG, -57, 108, -112, 0, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.FCI_BYTE, 80, 1, -59, ISO7816.INS_PUT_DATA, 71, 63, -51, 105, -94, ISO7816.INS_APPEND_RECORD, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, ISO7816.INS_READ_BINARY, -126, -9, -2, -99, ISOFileInfo.FCI_EXT, 92, ISOFileInfo.DATA_BYTES2, 53, -34, ISO7816.INS_READ_BINARY_STAMPED, ISOFileInfo.A5, -4, -128, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, ISOFileInfo.FMD_BYTE, 109, ISO7816.INS_UPDATE_RECORD, -16, 89, -87, 76, Ascii.ETB, Ascii.DEL, -111, -72, -55, 87, Ascii.ESC, ISO7816.INS_CREATE_FILE, 97};
    private int blockSize;

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    private byte[] f228310buf;
    private int bufOff;
    private int columns;
    private int hashSize;
    private long inputBlocks;
    private final CryptoServicePurpose purpose;
    private int rounds;
    private long[] state;
    private long[] tempState1;
    private long[] tempState2;

    public DSTU7564Digest(int i) {
        this(i, CryptoServicePurpose.ANY);
    }

    private void P(long[] jArr) {
        for (int i = 0; i < this.rounds; i++) {
            long j2 = i;
            for (int i2 = 0; i2 < this.columns; i2++) {
                jArr[i2] = jArr[i2] ^ j2;
                j2 += 16;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void Q(long[] jArr) {
        for (int i = 0; i < this.rounds; i++) {
            long j2 = (((long) (((this.columns - 1) << 4) ^ i)) << 56) | 67818912035696883L;
            for (int i2 = 0; i2 < this.columns; i2++) {
                jArr[i2] = jArr[i2] + j2;
                j2 -= 1152921504606846976L;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void copyIn(DSTU7564Digest dSTU7564Digest) {
        this.hashSize = dSTU7564Digest.hashSize;
        this.blockSize = dSTU7564Digest.blockSize;
        this.rounds = dSTU7564Digest.rounds;
        int i = this.columns;
        if (i <= 0 || i != dSTU7564Digest.columns) {
            this.columns = dSTU7564Digest.columns;
            this.state = Arrays.clone(dSTU7564Digest.state);
            int i2 = this.columns;
            this.tempState1 = new long[i2];
            this.tempState2 = new long[i2];
            this.f228310buf = Arrays.clone(dSTU7564Digest.f228310buf);
        } else {
            System.arraycopy(dSTU7564Digest.state, 0, this.state, 0, i);
            System.arraycopy(dSTU7564Digest.f228310buf, 0, this.f228310buf, 0, this.blockSize);
        }
        this.inputBlocks = dSTU7564Digest.inputBlocks;
        this.bufOff = dSTU7564Digest.bufOff;
    }

    private static long mixColumn(long j2) {
        long j3 = ((9187201950435737471L & j2) << 1) ^ (((j2 & (-9187201950435737472L)) >>> 7) * 29);
        long jRotate = rotate(8, j2) ^ j2;
        long jRotate2 = (jRotate ^ rotate(16, jRotate)) ^ rotate(48, j2);
        long j5 = (j2 ^ jRotate2) ^ j3;
        return ((rotate(32, (((j5 & 4629771061636907072L) >>> 6) * 29) ^ (((((-9187201950435737472L) & j5) >>> 6) * 29) ^ ((4557430888798830399L & j5) << 2))) ^ jRotate2) ^ rotate(40, j3)) ^ rotate(48, j3);
    }

    private void mixColumns(long[] jArr) {
        for (int i = 0; i < this.columns; i++) {
            jArr[i] = mixColumn(jArr[i]);
        }
    }

    private void processBlock(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.columns; i2++) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i);
            i += 8;
            this.tempState1[i2] = this.state[i2] ^ jLittleEndianToLong;
            this.tempState2[i2] = jLittleEndianToLong;
        }
        P(this.tempState1);
        Q(this.tempState2);
        for (int i3 = 0; i3 < this.columns; i3++) {
            long[] jArr = this.state;
            jArr[i3] = jArr[i3] ^ (this.tempState1[i3] ^ this.tempState2[i3]);
        }
    }

    private static long rotate(int i, long j2) {
        return (j2 << (-i)) | (j2 >>> i);
    }

    private void shiftRows(long[] jArr) {
        int i = this.columns;
        if (i == 8) {
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j5 = jArr[2];
            long j16 = jArr[3];
            long j22 = jArr[4];
            long j42 = jArr[5];
            long j46 = jArr[6];
            long j47 = jArr[7];
            long j57 = (j2 ^ j22) & (-4294967296L);
            long j58 = j2 ^ j57;
            long j65 = j22 ^ j57;
            long j69 = (j3 ^ j42) & 72057594021150720L;
            long j76 = j3 ^ j69;
            long j85 = j42 ^ j69;
            long j100 = (j5 ^ j46) & 281474976645120L;
            long j101 = j5 ^ j100;
            long j102 = j46 ^ j100;
            long j103 = (j16 ^ j47) & 1099511627520L;
            long j104 = j16 ^ j103;
            long j105 = j47 ^ j103;
            long j106 = (j58 ^ j101) & (-281470681808896L);
            long j107 = j58 ^ j106;
            long j108 = j101 ^ j106;
            long j109 = (j76 ^ j104) & 72056494543077120L;
            long j110 = j76 ^ j109;
            long j111 = j104 ^ j109;
            long j112 = (j65 ^ j102) & (-281470681808896L);
            long j113 = j65 ^ j112;
            long j114 = j102 ^ j112;
            long j115 = (j85 ^ j105) & 72056494543077120L;
            long j116 = j85 ^ j115;
            long j117 = j105 ^ j115;
            long j118 = (j107 ^ j110) & (-71777214294589696L);
            long j119 = j107 ^ j118;
            long j120 = j110 ^ j118;
            long j121 = (j108 ^ j111) & (-71777214294589696L);
            long j122 = j108 ^ j121;
            long j123 = j111 ^ j121;
            long j124 = (j113 ^ j116) & (-71777214294589696L);
            long j125 = (j114 ^ j117) & (-71777214294589696L);
            jArr[0] = j119;
            jArr[1] = j120;
            jArr[2] = j122;
            jArr[3] = j123;
            jArr[4] = j113 ^ j124;
            jArr[5] = j116 ^ j124;
            jArr[6] = j114 ^ j125;
            jArr[7] = j117 ^ j125;
            return;
        }
        if (i != 16) {
            throw new IllegalStateException("unsupported state size: only 512/1024 are allowed");
        }
        long j126 = jArr[0];
        long j127 = jArr[1];
        long j128 = jArr[2];
        long j129 = jArr[3];
        long j130 = jArr[4];
        long j131 = jArr[5];
        long j132 = jArr[6];
        long j133 = jArr[7];
        long j134 = jArr[8];
        long j135 = jArr[9];
        long j136 = jArr[10];
        long j137 = jArr[11];
        long j138 = jArr[12];
        long j139 = jArr[13];
        long j140 = jArr[14];
        long j141 = jArr[15];
        long j142 = (j126 ^ j134) & (-72057594037927936L);
        long j143 = j126 ^ j142;
        long j144 = j134 ^ j142;
        long j145 = (j127 ^ j135) & (-72057594037927936L);
        long j146 = j127 ^ j145;
        long j147 = j135 ^ j145;
        long j148 = (j128 ^ j136) & (-281474976710656L);
        long j149 = j128 ^ j148;
        long j150 = j136 ^ j148;
        long j151 = (j129 ^ j137) & (-1099511627776L);
        long j152 = j129 ^ j151;
        long j153 = j137 ^ j151;
        long j154 = (j130 ^ j138) & (-4294967296L);
        long j155 = j130 ^ j154;
        long j156 = j138 ^ j154;
        long j157 = (j131 ^ j139) & 72057594021150720L;
        long j158 = j131 ^ j157;
        long j159 = j139 ^ j157;
        long j160 = (j132 ^ j140) & 72057594037862400L;
        long j161 = j132 ^ j160;
        long j162 = j140 ^ j160;
        long j163 = (j133 ^ j141) & 72057594037927680L;
        long j164 = j133 ^ j163;
        long j165 = j141 ^ j163;
        long j166 = (j143 ^ j155) & 72057589742960640L;
        long j167 = j143 ^ j166;
        long j168 = j155 ^ j166;
        long j169 = (j146 ^ j158) & (-16777216);
        long j170 = j146 ^ j169;
        long j171 = j158 ^ j169;
        long j172 = (j149 ^ j161) & (-71776119061282816L);
        long j173 = j149 ^ j172;
        long j174 = j161 ^ j172;
        long j175 = (j152 ^ j164) & (-72056494526300416L);
        long j176 = j152 ^ j175;
        long j177 = j164 ^ j175;
        long j178 = (j144 ^ j156) & 72057589742960640L;
        long j179 = j144 ^ j178;
        long j180 = j156 ^ j178;
        long j181 = (j147 ^ j159) & (-16777216);
        long j182 = j147 ^ j181;
        long j183 = j159 ^ j181;
        long j184 = (j150 ^ j162) & (-71776119061282816L);
        long j185 = j150 ^ j184;
        long j186 = j162 ^ j184;
        long j187 = (j153 ^ j165) & (-72056494526300416L);
        long j188 = j153 ^ j187;
        long j189 = j165 ^ j187;
        long j190 = (j167 ^ j173) & (-281470681808896L);
        long j191 = j167 ^ j190;
        long j192 = j173 ^ j190;
        long j193 = (j170 ^ j176) & 72056494543077120L;
        long j194 = j170 ^ j193;
        long j195 = j176 ^ j193;
        long j196 = (j168 ^ j174) & (-281470681808896L);
        long j197 = j168 ^ j196;
        long j198 = j174 ^ j196;
        long j199 = (j171 ^ j177) & 72056494543077120L;
        long j200 = j171 ^ j199;
        long j201 = j177 ^ j199;
        long j202 = (j179 ^ j185) & (-281470681808896L);
        long j203 = j179 ^ j202;
        long j204 = j185 ^ j202;
        long j205 = (j182 ^ j188) & 72056494543077120L;
        long j206 = j182 ^ j205;
        long j207 = j188 ^ j205;
        long j208 = (j180 ^ j186) & (-281470681808896L);
        long j209 = j180 ^ j208;
        long j210 = j186 ^ j208;
        long j211 = (j183 ^ j189) & 72056494543077120L;
        long j212 = j183 ^ j211;
        long j213 = j189 ^ j211;
        long j214 = (j191 ^ j194) & (-71777214294589696L);
        long j215 = j191 ^ j214;
        long j216 = j194 ^ j214;
        long j217 = (j192 ^ j195) & (-71777214294589696L);
        long j218 = j192 ^ j217;
        long j219 = j195 ^ j217;
        long j220 = (j197 ^ j200) & (-71777214294589696L);
        long j221 = j197 ^ j220;
        long j222 = j200 ^ j220;
        long j223 = (j198 ^ j201) & (-71777214294589696L);
        long j224 = j198 ^ j223;
        long j225 = j201 ^ j223;
        long j226 = (j203 ^ j206) & (-71777214294589696L);
        long j227 = j203 ^ j226;
        long j228 = j206 ^ j226;
        long j229 = (j204 ^ j207) & (-71777214294589696L);
        long j230 = j204 ^ j229;
        long j231 = j207 ^ j229;
        long j232 = (j209 ^ j212) & (-71777214294589696L);
        long j233 = (j210 ^ j213) & (-71777214294589696L);
        jArr[0] = j215;
        jArr[1] = j216;
        jArr[2] = j218;
        jArr[3] = j219;
        jArr[4] = j221;
        jArr[5] = j222;
        jArr[6] = j224;
        jArr[7] = j225;
        jArr[8] = j227;
        jArr[9] = j228;
        jArr[10] = j230;
        jArr[11] = j231;
        jArr[12] = j209 ^ j232;
        jArr[13] = j212 ^ j232;
        jArr[14] = j210 ^ j233;
        jArr[15] = j213 ^ j233;
    }

    private void subBytes(long[] jArr) {
        for (int i = 0; i < this.columns; i++) {
            long j2 = jArr[i];
            int i2 = (int) j2;
            int i3 = (int) (j2 >>> 32);
            byte[] bArr = S0;
            byte b4 = bArr[i2 & 255];
            byte[] bArr2 = S1;
            byte b5 = bArr2[(i2 >>> 8) & 255];
            byte[] bArr3 = S2;
            byte b7 = bArr3[(i2 >>> 16) & 255];
            byte[] bArr4 = S3;
            byte b13 = bArr4[i2 >>> 24];
            int i5 = (b13 << Ascii.CAN) | (b4 & UnsignedBytes.MAX_VALUE) | ((b5 & UnsignedBytes.MAX_VALUE) << 8) | ((b7 & UnsignedBytes.MAX_VALUE) << 16);
            byte b15 = bArr[i3 & 255];
            byte b17 = bArr2[(i3 >>> 8) & 255];
            byte b40 = bArr3[(i3 >>> 16) & 255];
            byte b61 = bArr4[i3 >>> 24];
            jArr[i] = (((long) i5) & BodyPartID.bodyIdMax) | (((long) ((b61 << Ascii.CAN) | (((b15 & UnsignedBytes.MAX_VALUE) | ((b17 & UnsignedBytes.MAX_VALUE) << 8)) | ((b40 & UnsignedBytes.MAX_VALUE) << 16)))) << 32);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new DSTU7564Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int i2;
        int i3;
        int i5 = this.bufOff;
        byte[] bArr2 = this.f228310buf;
        int i6 = i5 + 1;
        this.bufOff = i6;
        bArr2[i5] = -128;
        int i21 = this.blockSize - 12;
        int i22 = 0;
        if (i6 > i21) {
            while (true) {
                int i32 = this.bufOff;
                if (i32 >= this.blockSize) {
                    break;
                }
                byte[] bArr3 = this.f228310buf;
                this.bufOff = i32 + 1;
                bArr3[i32] = 0;
            }
            this.bufOff = 0;
            processBlock(this.f228310buf, 0);
        }
        while (true) {
            i2 = this.bufOff;
            if (i2 >= i21) {
                break;
            }
            byte[] bArr4 = this.f228310buf;
            this.bufOff = i2 + 1;
            bArr4[i2] = 0;
        }
        long j2 = (((this.inputBlocks & BodyPartID.bodyIdMax) * ((long) this.blockSize)) + ((long) i5)) << 3;
        Pack.intToLittleEndian((int) j2, this.f228310buf, i2);
        int i33 = this.bufOff + 4;
        this.bufOff = i33;
        Pack.longToLittleEndian((j2 >>> 32) + (((this.inputBlocks >>> 32) * ((long) this.blockSize)) << 3), this.f228310buf, i33);
        processBlock(this.f228310buf, 0);
        System.arraycopy(this.state, 0, this.tempState1, 0, this.columns);
        P(this.tempState1);
        while (true) {
            i3 = this.columns;
            if (i22 >= i3) {
                break;
            }
            long[] jArr = this.state;
            jArr[i22] = jArr[i22] ^ this.tempState1[i22];
            i22++;
        }
        for (int i43 = i3 - (this.hashSize >>> 3); i43 < this.columns; i43++) {
            Pack.longToLittleEndian(this.state[i43], bArr, i);
            i += 8;
        }
        reset();
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, 0L);
        this.state[0] = this.blockSize;
        this.inputBlocks = 0L;
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        byte[] bArr = this.f228310buf;
        int i = this.bufOff;
        int i2 = i + 1;
        this.bufOff = i2;
        bArr[i] = b4;
        if (i2 == this.blockSize) {
            processBlock(bArr, 0);
            this.bufOff = 0;
            this.inputBlocks++;
        }
    }

    public DSTU7564Digest(int i, CryptoServicePurpose cryptoServicePurpose) {
        int i2;
        this.purpose = cryptoServicePurpose;
        if (i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
        }
        this.hashSize = i >>> 3;
        if (i > 256) {
            this.columns = 16;
            i2 = 14;
        } else {
            this.columns = 8;
            i2 = 10;
        }
        this.rounds = i2;
        int i3 = this.columns;
        int i5 = i3 << 3;
        this.blockSize = i5;
        long[] jArr = new long[i3];
        this.state = jArr;
        jArr[0] = i5;
        this.tempState1 = new long[i3];
        this.tempState2 = new long[i3];
        this.f228310buf = new byte[i5];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((DSTU7564Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.bufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i2--;
            i++;
        }
        if (i2 > 0) {
            while (i2 >= this.blockSize) {
                processBlock(bArr, i);
                int i3 = this.blockSize;
                i += i3;
                i2 -= i3;
                this.inputBlocks++;
            }
            while (i2 > 0) {
                update(bArr[i]);
                i2--;
                i++;
            }
        }
    }

    public DSTU7564Digest(DSTU7564Digest dSTU7564Digest) {
        this.purpose = dSTU7564Digest.purpose;
        copyIn(dSTU7564Digest);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
