package org.bouncycastle.crypto.threshold;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.crypto.threshold.ShamirSecretSplitter;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes14.dex */
class PolynomialTable extends Polynomial {
    private final byte[] EXP;
    private final byte[] LOG;
    private static final byte[] AES_LOG = {0, -1, Ascii.EM, 1, ISO7816.INS_INCREASE, 2, Ascii.SUB, -58, 75, -57, Ascii.ESC, 104, 51, -18, -33, 3, ISOFileInfo.FMD_BYTE, 4, ISO7816.INS_CREATE_FILE, 14, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.DATA_BYTES2, -17, 76, 113, 8, -56, -8, 105, 28, -63, 125, ISO7816.INS_ENVELOPE, 29, -75, -7, -71, 39, 106, 77, ISO7816.INS_DELETE_FILE, -90, 114, -102, -55, 9, 120, 101, 47, ISOFileInfo.LCS_BYTE, 5, Constants.NFC_READER, 15, -31, ISO7816.INS_CHANGE_CHV, 18, -16, -126, 69, 53, -109, ISO7816.INS_PUT_DATA, ISOFileInfo.CHANNEL_SECURITY, -106, -113, -37, -67, 54, ISO7816.INS_WRITE_BINARY, -50, -108, 19, 92, ISO7816.INS_WRITE_RECORD, -15, SignedBytes.MAX_POWER_OF_TWO, 70, ISOFileInfo.FILE_IDENTIFIER, 56, 102, -35, -3, ISO7816.INS_DECREASE, -65, 6, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.FCP_BYTE, ISO7816.INS_READ_RECORD2, 37, ISO7816.INS_APPEND_RECORD, -104, ISO7816.INS_MSE, -120, -111, 16, 126, 110, 72, -61, -93, ISO7816.INS_READ_RECORD_STAMPED, 30, CVCAFile.CAR_TAG, 58, 107, 40, 84, -6, ISOFileInfo.PROP_INFO, 61, -70, 43, 121, 10, Ascii.NAK, -101, -97, 94, ISO7816.INS_GET_DATA, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, ISO7816.INS_UPDATE_BINARY, 116, 79, -82, -23, -43, -25, -26, -83, -24, ISO7816.INS_UNBLOCK_CHV, -41, 117, 122, -21, Ascii.SYN, 11, -11, 89, -53, 95, ISO7816.INS_READ_BINARY, -100, -87, 81, ISOFileInfo.A0, Ascii.DEL, 12, -10, ISOFileInfo.FCI_BYTE, Ascii.ETB, -60, 73, -20, ISO7816.INS_LOAD_KEY_FILE, 67, Ascii.US, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, ISO7816.INS_READ_BINARY2, -122, 59, 82, ISOFileInfo.A1, 108, -86, 85, 41, -99, -105, -78, ISOFileInfo.FCI_EXT, -112, 97, -66, ISO7816.INS_UPDATE_RECORD, -4, PSSSigner.TRAILER_IMPLICIT, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, Ascii.DC4, ISO7816.INS_PSO, -98, 93, 86, -14, -45, ISOFileInfo.AB, ISO7816.INS_REHABILITATE_CHV, 17, -110, -39, 35, 32, 46, -119, ISO7816.INS_READ_BINARY_STAMPED, 124, -72, 38, 119, -103, -29, ISOFileInfo.A5, 103, 74, -19, -34, -59, Constants.INQUIRY, -2, Ascii.CAN, 13, 99, ISOFileInfo.SECURITY_ATTR_COMPACT, -128, ISO7816.INS_GET_RESPONSE, -9, ISO7816.INS_MANAGE_CHANNEL, 7};
    private static final byte[] AES_EXP = {1, 3, 5, 15, 17, 51, 85, -1, Ascii.SUB, 46, 114, -106, ISOFileInfo.A1, -8, 19, 53, 95, -31, 56, 72, ISO7816.INS_LOAD_KEY_FILE, 115, -107, -92, -9, 2, 6, 10, 30, ISO7816.INS_MSE, 102, -86, -27, ISO7816.INS_DECREASE_STAMPED, 92, ISO7816.INS_DELETE_FILE, 55, 89, -21, 38, 106, -66, -39, ISO7816.INS_MANAGE_CHANNEL, -112, ISOFileInfo.AB, -26, Constants.INQUIRY, 83, -11, 4, 12, Ascii.DC4, 60, ISO7816.INS_REHABILITATE_CHV, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, ISO7816.INS_CREATE_FILE, 59, 77, -41, ISOFileInfo.FCP_BYTE, -90, -15, 8, Ascii.CAN, 40, 120, -120, ISOFileInfo.FILE_IDENTIFIER, -98, -71, ISO7816.INS_WRITE_BINARY, 107, -67, ISO7816.INS_UPDATE_RECORD, Ascii.DEL, ISOFileInfo.DATA_BYTES2, -104, ISO7816.INS_READ_RECORD2, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, ISO7816.INS_DECREASE, 80, -16, 11, 29, 39, 105, -69, ISO7816.INS_UPDATE_BINARY, 97, -93, -2, Ascii.EM, 43, 125, ISOFileInfo.FCI_EXT, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, ISOFileInfo.A0, -5, Ascii.SYN, 58, 78, ISO7816.INS_WRITE_RECORD, 109, -73, ISO7816.INS_ENVELOPE, 93, -25, ISO7816.INS_INCREASE, 86, -6, Ascii.NAK, 63, 65, -61, 94, ISO7816.INS_APPEND_RECORD, 61, 71, -55, SignedBytes.MAX_POWER_OF_TWO, ISO7816.INS_GET_RESPONSE, 91, -19, ISO7816.INS_UNBLOCK_CHV, 116, -100, -65, ISO7816.INS_PUT_DATA, 117, -97, -70, -43, ISOFileInfo.FMD_BYTE, -84, -17, ISO7816.INS_PSO, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, ISOFileInfo.CHANNEL_SECURITY, -119, -128, -101, ISO7816.INS_READ_RECORD_STAMPED, -63, 88, -24, 35, 101, -81, -22, 37, ISOFileInfo.FCI_BYTE, ISO7816.INS_READ_BINARY2, -56, 67, -59, 84, -4, Ascii.US, Constants.NFC_READER, 99, ISOFileInfo.A5, -12, 7, 9, Ascii.ESC, 45, 119, -103, ISO7816.INS_READ_BINARY, -53, 70, ISO7816.INS_GET_DATA, 69, -49, 74, -34, 121, ISOFileInfo.SECURITY_ATTR_EXP, -122, -111, -88, -29, 62, CVCAFile.CAR_TAG, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_COMPACT, -113, ISOFileInfo.LCS_BYTE, ISOFileInfo.PROP_INFO, -108, -89, -14, 13, Ascii.ETB, 57, 75, -35, 124, -124, -105, -94, -3, 28, ISO7816.INS_CHANGE_CHV, 108, ISO7816.INS_READ_BINARY_STAMPED, -57, 82, -10, 1};
    private static final byte[] RSA_LOG = {-1, 0, 1, Ascii.EM, 2, ISO7816.INS_INCREASE, Ascii.SUB, -58, 3, -33, 51, -18, Ascii.ESC, 104, -57, 75, 4, ISOFileInfo.FMD_BYTE, ISO7816.INS_CREATE_FILE, 14, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.ENV_TEMP_EF, -17, ISOFileInfo.DATA_BYTES2, 28, -63, 105, -8, -56, 8, 76, 113, 5, ISOFileInfo.LCS_BYTE, 101, 47, -31, ISO7816.INS_CHANGE_CHV, 15, Constants.NFC_READER, 53, -109, ISOFileInfo.CHANNEL_SECURITY, ISO7816.INS_PUT_DATA, -16, 18, -126, 69, 29, -75, ISO7816.INS_ENVELOPE, 125, 106, 39, -7, -71, -55, -102, 9, 120, 77, ISO7816.INS_DELETE_FILE, 114, -90, 6, -65, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.FCP_BYTE, 102, -35, ISO7816.INS_DECREASE, -3, ISO7816.INS_APPEND_RECORD, -104, 37, ISO7816.INS_READ_RECORD2, 16, -111, ISO7816.INS_MSE, -120, 54, ISO7816.INS_WRITE_BINARY, -108, -50, -113, -106, -37, -67, -15, ISO7816.INS_WRITE_RECORD, 19, 92, ISOFileInfo.FILE_IDENTIFIER, 56, 70, SignedBytes.MAX_POWER_OF_TWO, 30, CVCAFile.CAR_TAG, ISO7816.INS_READ_RECORD_STAMPED, -93, -61, 72, 126, 110, 107, 58, 40, 84, -6, ISOFileInfo.PROP_INFO, -70, 61, ISO7816.INS_GET_DATA, 94, -101, -97, 10, Ascii.NAK, 121, 43, 78, -44, -27, -84, 115, -13, -89, 87, 7, ISO7816.INS_MANAGE_CHANNEL, ISO7816.INS_GET_RESPONSE, -9, ISOFileInfo.SECURITY_ATTR_COMPACT, -128, 99, 13, 103, 74, -34, -19, Constants.INQUIRY, -59, -2, Ascii.CAN, -29, ISOFileInfo.A5, -103, 119, 38, -72, ISO7816.INS_READ_BINARY_STAMPED, 124, 17, ISO7816.INS_REHABILITATE_CHV, -110, -39, 35, 32, -119, 46, 55, 63, -47, 91, -107, PSSSigner.TRAILER_IMPLICIT, -49, -51, -112, ISOFileInfo.FCI_EXT, -105, -78, ISO7816.INS_UPDATE_RECORD, -4, -66, 97, -14, 86, -45, ISOFileInfo.AB, Ascii.DC4, ISO7816.INS_PSO, 93, -98, -124, 60, 57, 83, 71, 109, 65, -94, Ascii.US, 45, 67, ISO7816.INS_LOAD_KEY_FILE, -73, 123, -92, 118, -60, Ascii.ETB, 73, -20, Ascii.DEL, 12, ISOFileInfo.FCI_BYTE, -10, 108, ISOFileInfo.A1, 59, 82, 41, -99, 85, -86, -5, 96, -122, ISO7816.INS_READ_BINARY2, -69, -52, 62, 90, -53, 89, 95, ISO7816.INS_READ_BINARY, -100, -87, ISOFileInfo.A0, 81, 11, -11, Ascii.SYN, -21, 122, 117, ISO7816.INS_UNBLOCK_CHV, -41, 79, -82, -43, -23, -26, -25, -83, -24, 116, ISO7816.INS_UPDATE_BINARY, -12, -22, -88, 80, 88, -81};
    private static final byte[] RSA_EXP = {1, 2, 4, 8, 16, 32, SignedBytes.MAX_POWER_OF_TWO, -128, 29, 58, 116, -24, -51, ISOFileInfo.FCI_EXT, 19, 38, 76, -104, 45, 90, ISO7816.INS_READ_BINARY_STAMPED, 117, -22, -55, -113, 3, 6, 12, Ascii.CAN, ISO7816.INS_DECREASE, 96, ISO7816.INS_GET_RESPONSE, -99, 39, 78, -100, 37, 74, -108, 53, 106, -44, -75, 119, -18, -63, -97, 35, 70, ISOFileInfo.SECURITY_ATTR_COMPACT, 5, 10, Ascii.DC4, 40, 80, ISOFileInfo.A0, 93, -70, 105, ISO7816.INS_WRITE_RECORD, -71, ISOFileInfo.FCI_BYTE, -34, ISOFileInfo.A1, 95, -66, 97, ISO7816.INS_ENVELOPE, -103, 47, 94, PSSSigner.TRAILER_IMPLICIT, 101, ISO7816.INS_GET_DATA, -119, 15, 30, 60, 120, -16, -3, -25, -45, -69, 107, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_BINARY2, Ascii.DEL, -2, -31, -33, -93, 91, ISO7816.INS_READ_RECORD_STAMPED, 113, ISO7816.INS_APPEND_RECORD, -39, -81, 67, -122, 17, ISO7816.INS_MSE, ISO7816.INS_REHABILITATE_CHV, -120, 13, Ascii.SUB, ISO7816.INS_DECREASE_STAMPED, 104, ISO7816.INS_WRITE_BINARY, -67, 103, -50, ISOFileInfo.DATA_BYTES2, Ascii.US, 62, 124, -8, -19, -57, -109, 59, 118, -20, -59, -105, 51, 102, -52, ISOFileInfo.PROP_INFO, Ascii.ETB, 46, 92, -72, 109, ISO7816.INS_PUT_DATA, -87, 79, -98, Constants.NFC_READER, CVCAFile.CAR_TAG, -124, Ascii.NAK, ISO7816.INS_PSO, 84, -88, 77, -102, 41, 82, -92, 85, -86, 73, -110, 57, 114, ISO7816.INS_DELETE_FILE, -43, -73, 115, -26, -47, -65, 99, -58, -111, 63, 126, -4, -27, -41, ISO7816.INS_READ_RECORD2, 123, -10, -15, -1, -29, -37, ISOFileInfo.AB, 75, -106, Constants.INQUIRY, ISOFileInfo.FCP_BYTE, -60, -107, 55, 110, ISO7816.INS_UPDATE_RECORD, ISOFileInfo.A5, 87, -82, 65, -126, Ascii.EM, ISO7816.INS_INCREASE, ISOFileInfo.FMD_BYTE, -56, ISOFileInfo.ENV_TEMP_EF, 7, 14, 28, 56, ISO7816.INS_MANAGE_CHANNEL, ISO7816.INS_CREATE_FILE, -35, -89, 83, -90, 81, -94, 89, -78, 121, -14, -7, -17, -61, -101, 43, 86, -84, 69, ISOFileInfo.LCS_BYTE, 9, 18, ISO7816.INS_CHANGE_CHV, 72, -112, 61, 122, -12, -11, -9, -13, -5, -21, -53, ISOFileInfo.SECURITY_ATTR_EXP, 11, Ascii.SYN, ISO7816.INS_UNBLOCK_CHV, 88, ISO7816.INS_READ_BINARY, 125, -6, -23, -49, ISOFileInfo.FILE_IDENTIFIER, Ascii.ESC, 54, 108, ISO7816.INS_LOAD_KEY_FILE, -83, 71, ISOFileInfo.CHANNEL_SECURITY, 1};

    /* JADX INFO: renamed from: org.bouncycastle.crypto.threshold.PolynomialTable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm;

        static {
            int[] iArr = new int[ShamirSecretSplitter.Algorithm.values().length];
            $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm = iArr;
            try {
                iArr[ShamirSecretSplitter.Algorithm.AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[ShamirSecretSplitter.Algorithm.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolynomialTable(ShamirSecretSplitter.Algorithm algorithm) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[algorithm.ordinal()];
        if (i == 1) {
            this.LOG = AES_LOG;
            this.EXP = AES_EXP;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("The algorithm is not correct");
            }
            this.LOG = RSA_LOG;
            this.EXP = RSA_EXP;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfDiv(int i, int i2) {
        if (i == 0) {
            return (byte) 0;
        }
        byte[] bArr = this.EXP;
        byte[] bArr2 = this.LOG;
        return bArr[(((bArr2[i] & UnsignedBytes.MAX_VALUE) - (bArr2[i2] & UnsignedBytes.MAX_VALUE)) + 255) % 255];
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfMul(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return (byte) 0;
        }
        byte[] bArr = this.EXP;
        byte[] bArr2 = this.LOG;
        return (byte) (bArr[((bArr2[i] & UnsignedBytes.MAX_VALUE) + (bArr2[i2] & UnsignedBytes.MAX_VALUE)) % 255] & UnsignedBytes.MAX_VALUE);
    }
}
