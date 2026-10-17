package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.reflect.Array;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import okl.m;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.CVCAFile;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int m1 = -2139062144;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final int f228337m2 = 2139062143;
    private static final int m3 = 27;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f228338m4 = -1061109568;
    private static final int m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, Constants.INQUIRY, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, 18, -128, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, Ascii.SUB, Ascii.ESC, 110, 90, ISOFileInfo.A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Ascii.DEL, 80, 60, -97, -88, 81, -93, SignedBytes.MAX_POWER_OF_TWO, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, Constants.NFC_READER, 16, -1, -13, ISO7816.INS_WRITE_RECORD, -51, 12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, Ascii.ETB, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, Ascii.EM, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, 11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, Ascii.US, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, 30, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.A1, -119, 13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, 15, ISO7816.INS_READ_BINARY, 84, -69, Ascii.SYN};
    private static final byte[] Si = {82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.A5, 56, -65, SignedBytes.MAX_POWER_OF_TWO, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, 11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, Ascii.NAK, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, 30, -113, ISO7816.INS_GET_DATA, 63, 15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, Ascii.SUB, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, 14, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, 32, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, Ascii.US, -35, -88, 51, -120, 7, -57, Constants.INQUIRY, ISO7816.INS_READ_BINARY2, 18, 16, 89, 39, -128, -20, 95, 96, 81, Ascii.DEL, -87, Ascii.EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, Ascii.DC4, 99, 85, Constants.NFC_READER, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, LDSFile.EF_DG12_TAG, Constants.TAG_EMV_L2_CHECKSUM, 171, 77, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 47, 94, 188, 99, Constants.TAG_POWER_OFF_TIMEOUT, ISO7816.TAG_SM_EXPECTED_LENGTH, 53, 106, Constants.TAG_PCI_PED_CHECKSUM, 179, ISO781611.SMT_TAG, Constants.TAG_SUPPORTED_LOCALE_LIST, 239, Constants.TAG_BATTERY_STATE, 145};

    public AESLightEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private static int FFmulX(int i) {
        return (((i & m1) >>> 7) * 27) ^ ((f228337m2 & i) << 1);
    }

    private static int FFmulX2(int i) {
        int i2 = (m5 & i) << 2;
        int i3 = i & f228338m4;
        int i5 = i3 ^ (i3 >>> 1);
        return (i5 >>> 5) ^ (i2 ^ (i5 >>> 2));
    }

    private int bitsOfSecurity() {
        if (this.WorkingKey == null) {
            return 256;
        }
        return (r0.length - 7) << 5;
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int i3 = this.ROUNDS;
        int[] iArr2 = iArr[i3];
        char c2 = 0;
        int i5 = iLittleEndianToInt ^ iArr2[0];
        int i6 = 1;
        int i21 = iLittleEndianToInt2 ^ iArr2[1];
        int i22 = iLittleEndianToInt3 ^ iArr2[2];
        int i32 = i3 - 1;
        int iInv_mcol = iLittleEndianToInt4 ^ iArr2[3];
        while (i32 > i6) {
            byte[] bArr3 = Si;
            int iInv_mcol2 = inv_mcol((((bArr3[i5 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(iInv_mcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(i22 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i21 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][c2];
            int iInv_mcol3 = inv_mcol((((bArr3[i21 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(i5 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(iInv_mcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i22 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][i6];
            char c3 = c2;
            int iInv_mcol4 = inv_mcol(((((bArr3[(i21 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr3[i22 & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr3[(i5 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iInv_mcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][2];
            int iInv_mcol5 = inv_mcol((((bArr3[iInv_mcol & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(i22 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(i21 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i5 >> 24) & 255] << Ascii.CAN));
            int i33 = i32 - 1;
            int i43 = iInv_mcol5 ^ iArr[i32][3];
            int iInv_mcol6 = inv_mcol((((bArr3[iInv_mcol2 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(i43 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(iInv_mcol4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iInv_mcol3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i33][c3];
            int iInv_mcol7 = inv_mcol((((bArr3[iInv_mcol3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(iInv_mcol2 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(i43 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iInv_mcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i33][i6];
            int i59 = i6;
            int iInv_mcol8 = inv_mcol(((((bArr3[(iInv_mcol3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr3[iInv_mcol4 & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr3[(iInv_mcol2 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i43 >> 24) & 255] << Ascii.CAN)) ^ iArr[i33][2];
            i32 -= 2;
            iInv_mcol = inv_mcol((((bArr3[i43 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(iInv_mcol4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(iInv_mcol3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iInv_mcol2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i33][3];
            c2 = c3;
            i5 = iInv_mcol6;
            i21 = iInv_mcol7;
            i22 = iInv_mcol8;
            i6 = i59;
        }
        char c5 = c2;
        int i66 = i6;
        byte[] bArr4 = Si;
        int iInv_mcol9 = inv_mcol((((bArr4[i5 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iInv_mcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(i22 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(i21 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][c5];
        int iInv_mcol10 = inv_mcol((((bArr4[i21 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(i5 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iInv_mcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(i22 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][i66];
        int iInv_mcol11 = inv_mcol((((bArr4[i22 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(i21 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(i5 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iInv_mcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][2];
        int iInv_mcol12 = inv_mcol((((bArr4[iInv_mcol & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(i22 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(i21 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(i5 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][3];
        int i74 = (((bArr4[iInv_mcol9 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iInv_mcol12 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iInv_mcol11 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iInv_mcol10 >> 24) & 255] << Ascii.CAN);
        int[] iArr3 = iArr[c5];
        int i92 = i74 ^ iArr3[c5];
        int i96 = ((((bArr4[iInv_mcol10 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iInv_mcol9 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iInv_mcol12 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iInv_mcol11 >> 24) & 255] << Ascii.CAN)) ^ iArr3[i66];
        int i99 = ((((bArr4[iInv_mcol11 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iInv_mcol10 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iInv_mcol9 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iInv_mcol12 >> 24) & 255] << Ascii.CAN)) ^ iArr3[2];
        int i100 = ((((bArr4[iInv_mcol12 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iInv_mcol11 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iInv_mcol10 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iInv_mcol9 >> 24) & 255] << Ascii.CAN)) ^ iArr3[3];
        Pack.intToLittleEndian(i92, bArr2, i2);
        Pack.intToLittleEndian(i96, bArr2, i2 + 4);
        Pack.intToLittleEndian(i99, bArr2, i2 + 8);
        Pack.intToLittleEndian(i100, bArr2, i2 + 12);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        char c2 = 0;
        int[] iArr2 = iArr[0];
        int i3 = iLittleEndianToInt ^ iArr2[0];
        int i5 = 1;
        int i6 = iLittleEndianToInt2 ^ iArr2[1];
        int i21 = iLittleEndianToInt3 ^ iArr2[2];
        int iMcol = iLittleEndianToInt4 ^ iArr2[3];
        int i22 = 1;
        while (i22 < this.ROUNDS - i5) {
            byte[] bArr3 = S;
            int iMcol2 = mcol((((bArr3[i3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(i6 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(i21 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iMcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i22][c2];
            int iMcol3 = mcol((((bArr3[i6 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(i21 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(iMcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i22][i5];
            char c3 = c2;
            int iMcol4 = mcol(((((bArr3[(iMcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr3[i21 & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr3[(i3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i6 >> 24) & 255] << Ascii.CAN)) ^ iArr[i22][2];
            int iMcol5 = mcol((((bArr3[iMcol & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(i3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(i6 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i21 >> 24) & 255] << Ascii.CAN));
            int i32 = i22 + 1;
            int i33 = iMcol5 ^ iArr[i22][3];
            int iMcol6 = mcol((((bArr3[iMcol2 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(iMcol3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(iMcol4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(i33 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][c3];
            int iMcol7 = mcol((((bArr3[iMcol3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(iMcol4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(i33 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iMcol2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][i5];
            int i43 = i5;
            int iMcol8 = mcol(((((bArr3[(i33 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr3[iMcol4 & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr3[(iMcol2 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iMcol3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][2];
            i22 += 2;
            iMcol = mcol((((bArr3[i33 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr3[(iMcol2 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr3[(iMcol3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr3[(iMcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i32][3];
            c2 = c3;
            i3 = iMcol6;
            i6 = iMcol7;
            i21 = iMcol8;
            i5 = i43;
        }
        char c5 = c2;
        int i59 = i5;
        byte[] bArr4 = S;
        int iMcol9 = mcol((((bArr4[i3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(i6 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(i21 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iMcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i22][c5];
        int iMcol10 = mcol((((bArr4[i6 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(i21 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iMcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(i3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i22][i59];
        int iMcol11 = mcol((((bArr4[i21 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iMcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(i3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(i6 >> 24) & 255] << Ascii.CAN)) ^ iArr[i22][2];
        int iMcol12 = mcol((((bArr4[iMcol & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(i3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(i6 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(i21 >> 24) & 255] << Ascii.CAN)) ^ iArr[i22][3];
        int i66 = (((bArr4[iMcol9 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iMcol10 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iMcol11 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iMcol12 >> 24) & 255] << Ascii.CAN);
        int[] iArr3 = iArr[i22 + 1];
        int i74 = i66 ^ iArr3[c5];
        int i92 = ((((bArr4[iMcol10 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iMcol11 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iMcol12 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iMcol9 >> 24) & 255] << Ascii.CAN)) ^ iArr3[i59];
        int i96 = iArr3[2] ^ ((((bArr4[iMcol11 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iMcol12 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iMcol9 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iMcol10 >> 24) & 255] << Ascii.CAN));
        int i99 = ((((bArr4[iMcol12 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iMcol9 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iMcol10 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iMcol11 >> 24) & 255] << Ascii.CAN)) ^ iArr3[3];
        Pack.intToLittleEndian(i74, bArr2, i2);
        Pack.intToLittleEndian(i92, bArr2, i2 + 4);
        Pack.intToLittleEndian(i96, bArr2, i2 + 8);
        Pack.intToLittleEndian(i99, bArr2, i2 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int i;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i2 = length >>> 2;
        this.ROUNDS = i2 + 6;
        int i3 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        char c2 = 3;
        if (i2 == 4) {
            i = 1;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i5 = 1; i5 <= 10; i5++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i5 - 1];
                int[] iArr2 = iArr[i5];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i2 == 6) {
            i = 1;
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i6 = 1;
            int i21 = 1;
            while (true) {
                int[] iArr3 = iArr[i6];
                iArr3[0] = iLittleEndianToInt9;
                iArr3[1] = iLittleEndianToInt10;
                int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ i21);
                int[] iArr4 = iArr[i6];
                iArr4[2] = iSubWord;
                int i22 = iLittleEndianToInt6 ^ iSubWord;
                iArr4[3] = i22;
                int i32 = iLittleEndianToInt7 ^ i22;
                int[] iArr5 = iArr[i6 + 1];
                iArr5[0] = i32;
                int i33 = iLittleEndianToInt8 ^ i32;
                iArr5[1] = i33;
                int i43 = iLittleEndianToInt9 ^ i33;
                iArr5[2] = i43;
                int i59 = iLittleEndianToInt10 ^ i43;
                iArr5[3] = i59;
                int iSubWord2 = subWord(shift(i59, 8)) ^ (i21 << 1);
                i21 <<= 2;
                iLittleEndianToInt5 = iSubWord ^ iSubWord2;
                int[] iArr6 = iArr[i6 + 2];
                iArr6[0] = iLittleEndianToInt5;
                iLittleEndianToInt6 = i22 ^ iLittleEndianToInt5;
                iArr6[1] = iLittleEndianToInt6;
                iLittleEndianToInt7 = i32 ^ iLittleEndianToInt6;
                iArr6[2] = iLittleEndianToInt7;
                iLittleEndianToInt8 = i33 ^ iLittleEndianToInt7;
                iArr6[3] = iLittleEndianToInt8;
                i6 += 3;
                if (i6 >= 13) {
                    break;
                }
                iLittleEndianToInt9 = i43 ^ iLittleEndianToInt8;
                iLittleEndianToInt10 = i59 ^ iLittleEndianToInt9;
            }
        } else {
            if (i2 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i66 = 1;
            int i74 = 2;
            while (true) {
                int iSubWord3 = subWord(shift(iLittleEndianToInt18, 8)) ^ i66;
                i66 <<= i3;
                iLittleEndianToInt11 ^= iSubWord3;
                int[] iArr7 = iArr[i74];
                iArr7[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr7[i3] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr7[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr7[c2] = iLittleEndianToInt14;
                i = i3;
                int i92 = i74 + 1;
                char c3 = c2;
                if (i92 >= 15) {
                    break;
                }
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr8 = iArr[i92];
                iArr8[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr8[i] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr8[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr8[c3] = iLittleEndianToInt18;
                i74 += 2;
                i3 = i;
                c2 = c3;
            }
        }
        if (!z) {
            for (int i96 = i; i96 < this.ROUNDS; i96++) {
                for (int i99 = 0; i99 < 4; i99++) {
                    int[] iArr9 = iArr[i96];
                    iArr9[i99] = inv_mcol(iArr9[i99]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int iShift = shift(i, 8) ^ i;
        int iFFmulX = i ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private static int mcol(int i) {
        int iShift = shift(i, 8);
        int i2 = i ^ iShift;
        return FFmulX(i2) ^ (iShift ^ shift(i2, 16));
    }

    private static int shift(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private static int subWord(int i) {
        byte[] bArr = S;
        return (bArr[(i >> 24) & 255] << Ascii.CAN) | (bArr[i & 255] & UnsignedBytes.MAX_VALUE) | ((bArr[(i >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[(i >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(m.l("invalid parameter passed to AES init - ", cipherParameters));
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
        this.forEncryption = z;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i, bArr2, i2, iArr);
        } else {
            decryptBlock(bArr, i, bArr2, i2, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
