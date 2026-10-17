package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU7624Engine implements BlockCipher {
    private static final int ROUNDS_128 = 10;
    private static final int ROUNDS_256 = 14;
    private static final int ROUNDS_512 = 18;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, ISOFileInfo.FCI_EXT, -107, Ascii.ETB, -16, ISO7816.INS_LOAD_KEY_FILE, 9, 109, -13, 29, -53, -55, 77, ISO7816.INS_UNBLOCK_CHV, -81, 121, ISO7816.INS_CREATE_FILE, -105, -3, ISOFileInfo.FCI_BYTE, 75, 69, 57, 62, -35, -93, 79, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_READ_RECORD_STAMPED, -102, 14, Ascii.US, -65, Ascii.NAK, -31, 73, ISO7816.INS_WRITE_RECORD, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, Ascii.EM, -43, -83, 88, -92, -69, ISOFileInfo.A1, ISO7816.INS_UPDATE_RECORD, -14, ISOFileInfo.FILE_IDENTIFIER, 55, CVCAFile.CAR_TAG, ISO7816.INS_DELETE_FILE, 122, ISO7816.INS_INCREASE, -100, -52, ISOFileInfo.AB, 74, -113, 110, 4, 39, 46, -25, ISO7816.INS_APPEND_RECORD, 90, -106, Ascii.SYN, 35, 43, ISO7816.INS_ENVELOPE, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, ISO7816.INS_DECREASE_STAMPED, 72, -4, -73, 106, -120, ISOFileInfo.A5, 83, -122, -7, 91, -37, 56, 123, -61, 30, ISO7816.INS_MSE, 51, ISO7816.INS_CHANGE_CHV, 40, 54, -57, -78, 59, ISOFileInfo.CHANNEL_SECURITY, 119, -70, -11, Ascii.DC4, -97, 8, 85, -101, 76, -2, 96, 92, ISO7816.INS_PUT_DATA, Ascii.CAN, 70, -51, 125, Constants.NFC_READER, ISO7816.INS_READ_BINARY, 63, Ascii.ESC, -119, -1, -21, -124, 105, 58, -99, -41, -45, ISO7816.INS_MANAGE_CHANNEL, 103, SignedBytes.MAX_POWER_OF_TWO, -75, -34, 93, ISO7816.INS_DECREASE, -111, ISO7816.INS_READ_BINARY2, 120, 17, 1, -27, 0, 104, -104, ISOFileInfo.A0, -59, 2, -90, 116, 45, 11, -94, 118, ISO7816.INS_READ_RECORD2, -66, -50, -67, -82, -23, ISOFileInfo.LCS_BYTE, Constants.INQUIRY, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, ISOFileInfo.SECURITY_ATTR_COMPACT, 53, 3, -44, Ascii.DEL, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, Ascii.SUB, -60, 7, 87, -72, 60, ISOFileInfo.FCP_BYTE, -29, -56, -84, 82, ISOFileInfo.FMD_BYTE, 16, ISO7816.INS_WRITE_BINARY, -39, 19, 12, 18, 41, 81, -71, -49, ISO7816.INS_UPDATE_BINARY, 115, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.DATA_BYTES2, 84, ISO7816.INS_GET_RESPONSE, -19, 78, ISO7816.INS_REHABILITATE_CHV, -89, ISO7816.INS_PSO, ISOFileInfo.PROP_INFO, 37, -26, ISO7816.INS_GET_DATA, 124, ISOFileInfo.SECURITY_ATTR_EXP, 86, -128};
    private static final byte[] S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, ISO7816.INS_UPDATE_BINARY, -78, ISO7816.INS_WRITE_RECORD, -112, Ascii.ETB, -8, CVCAFile.CAR_TAG, Ascii.NAK, 86, ISO7816.INS_READ_BINARY_STAMPED, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, ISOFileInfo.ENV_TEMP_EF, Constants.INQUIRY, -10, ISOFileInfo.FMD_BYTE, 88, -98, -12, ISO7816.INS_MSE, -86, 117, 15, 2, ISO7816.INS_READ_BINARY2, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, ISO7816.INS_REHABILITATE_CHV, 62, -97, Ascii.DC4, -56, -82, 84, 16, ISO7816.INS_LOAD_KEY_FILE, PSSSigner.TRAILER_IMPLICIT, Ascii.SUB, 107, 105, -13, -67, 51, ISOFileInfo.AB, -6, -47, -101, 104, 78, Ascii.SYN, -107, -111, -18, 76, 99, ISOFileInfo.CHANNEL_SECURITY, 91, -52, 60, Ascii.EM, ISOFileInfo.A1, ISOFileInfo.DATA_BYTES2, 73, 123, -39, ISOFileInfo.FCI_BYTE, 55, 96, ISO7816.INS_GET_DATA, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, ISOFileInfo.SECURITY_ATTR_COMPACT, -29, 32, ISO7816.INS_DECREASE, ISO7816.INS_UPDATE_RECORD, -73, 108, 74, -75, 63, -105, -44, ISOFileInfo.FCP_BYTE, 45, 6, -92, ISOFileInfo.A5, ISOFileInfo.FILE_IDENTIFIER, 95, ISO7816.INS_PSO, ISO7816.INS_PUT_DATA, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, Ascii.ESC, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, ISO7816.INS_READ_BINARY, -104, Ascii.CAN, ISO7816.INS_INCREASE, 113, 75, -17, 59, ISO7816.INS_MANAGE_CHANNEL, ISOFileInfo.A0, ISO7816.INS_DELETE_FILE, SignedBytes.MAX_POWER_OF_TWO, -1, -61, -87, -26, 120, -7, ISOFileInfo.SECURITY_ATTR_EXP, 70, -128, 30, 56, -31, -72, -88, ISO7816.INS_CREATE_FILE, 12, 35, 118, 29, 37, ISO7816.INS_CHANGE_CHV, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, 82, -14, -126, 80, 122, 47, 116, 83, ISO7816.INS_READ_RECORD2, 97, -81, 57, 53, -34, -51, Ascii.US, -103, -84, -83, 114, ISO7816.INS_UNBLOCK_CHV, -35, ISO7816.INS_WRITE_BINARY, ISOFileInfo.FCI_EXT, -66, 94, -90, -20, 4, -58, 3, ISO7816.INS_DECREASE_STAMPED, -5, -37, 89, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_ENVELOPE, 1, -16, 90, -19, -89, 102, Constants.NFC_READER, Ascii.DEL, ISOFileInfo.LCS_BYTE, 39, -57, ISO7816.INS_GET_RESPONSE, 41, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, ISO7816.INS_MSE, 69, -4, -70, 106, -33, 2, -97, ISO7816.INS_UPDATE_RECORD, 81, 89, 74, Ascii.ETB, 43, ISO7816.INS_ENVELOPE, -108, -12, -69, -93, ISOFileInfo.FCP_BYTE, ISO7816.INS_DELETE_FILE, 113, -44, -51, ISO7816.INS_MANAGE_CHANNEL, Ascii.SYN, -31, 73, 60, ISO7816.INS_GET_RESPONSE, ISO7816.INS_LOAD_KEY_FILE, 92, -101, -83, ISOFileInfo.PROP_INFO, 83, ISOFileInfo.A1, 122, -56, 45, ISO7816.INS_CREATE_FILE, -47, 114, -90, ISO7816.INS_UNBLOCK_CHV, -60, -29, 118, 120, -73, ISO7816.INS_READ_BINARY_STAMPED, 9, 59, 14, 65, 76, -34, -78, -112, 37, ISOFileInfo.A5, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, ISO7816.INS_WRITE_BINARY, 123, Ascii.CAN, -105, -45, 54, -26, 72, 86, ISOFileInfo.DATA_BYTES2, -113, 119, -52, -100, -71, ISO7816.INS_APPEND_RECORD, -84, -72, 47, Ascii.NAK, -92, 124, ISO7816.INS_PUT_DATA, 56, 30, 11, 5, ISO7816.INS_UPDATE_BINARY, Ascii.DC4, 110, 108, 126, 102, -3, ISO7816.INS_READ_BINARY2, -27, 96, -81, 94, 51, ISOFileInfo.FCI_EXT, -55, -16, 93, 109, 63, -120, ISOFileInfo.ENV_TEMP_EF, -57, -9, 29, -23, -20, -19, -128, 41, 39, -49, -103, -88, 80, 15, 55, ISO7816.INS_CHANGE_CHV, 40, ISO7816.INS_DECREASE, -107, ISO7816.INS_WRITE_RECORD, 62, 91, SignedBytes.MAX_POWER_OF_TWO, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_READ_RECORD2, 105, 87, Ascii.US, 7, 28, ISOFileInfo.LCS_BYTE, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.AB, -18, Constants.INQUIRY, -94, 115, -7, ISO7816.INS_GET_DATA, 58, Ascii.SUB, -5, 13, -63, -2, -6, -14, ISOFileInfo.FCI_BYTE, -67, -106, -35, 67, 82, ISO7816.INS_READ_RECORD_STAMPED, 8, -13, -82, -66, Ascii.EM, -119, ISO7816.INS_INCREASE, 38, ISO7816.INS_READ_BINARY, -22, 75, ISOFileInfo.FMD_BYTE, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, Ascii.ESC, 35, 61, 104, ISO7816.INS_PSO, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Ascii.DEL, -59, -89, -25, 97, 90, 6, 70, ISO7816.INS_REHABILITATE_CHV, CVCAFile.CAR_TAG, 4, ISOFileInfo.A0, -37, 57, -122, 84, -86, ISOFileInfo.SECURITY_ATTR_COMPACT, ISO7816.INS_DECREASE_STAMPED, Constants.NFC_READER, ISOFileInfo.SECURITY_ATTR_EXP, -8, 12, 116, 103};
    private static final byte[] S3 = {104, ISOFileInfo.ENV_TEMP_EF, ISO7816.INS_GET_DATA, 77, 115, 75, 78, ISO7816.INS_PSO, -44, 82, 38, ISO7816.INS_READ_RECORD2, 84, 30, Ascii.EM, Ascii.US, ISO7816.INS_MSE, 3, 70, 61, 45, 74, 83, ISOFileInfo.FILE_IDENTIFIER, 19, ISOFileInfo.LCS_BYTE, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, Ascii.SYN, 60, 102, ISO7816.INS_MANAGE_CHANNEL, 93, -13, 69, SignedBytes.MAX_POWER_OF_TWO, -52, -24, -108, 86, 8, -50, Ascii.SUB, 58, ISO7816.INS_WRITE_RECORD, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, ISO7816.INS_UPDATE_BINARY, ISOFileInfo.PROP_INFO, 35, -49, ISO7816.INS_INCREASE, -103, Constants.INQUIRY, Ascii.DC4, -82, -18, -56, 72, -45, ISO7816.INS_DECREASE, ISOFileInfo.A1, -110, 65, ISO7816.INS_READ_BINARY2, Ascii.CAN, -60, ISO7816.INS_UNBLOCK_CHV, 113, 114, ISO7816.INS_REHABILITATE_CHV, Ascii.NAK, -3, 55, -66, 95, -86, -101, -120, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.FCP_BYTE, 12, ISO7816.INS_CHANGE_CHV, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, ISO7816.INS_DECREASE_STAMPED, 126, 16, -15, 123, -113, 99, ISOFileInfo.A0, 5, -102, 67, 119, Constants.NFC_READER, -65, 39, 9, -61, -97, ISO7816.INS_READ_RECORD_STAMPED, -41, 41, ISO7816.INS_ENVELOPE, -21, ISO7816.INS_GET_RESPONSE, -92, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_COMPACT, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, ISO7816.INS_DELETE_FILE, -39, -71, ISO7816.INS_WRITE_BINARY, CVCAFile.CAR_TAG, -57, 108, -112, 0, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.FCI_BYTE, 80, 1, -59, ISO7816.INS_PUT_DATA, 71, 63, -51, 105, -94, ISO7816.INS_APPEND_RECORD, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, ISO7816.INS_READ_BINARY, -126, -9, -2, -99, ISOFileInfo.FCI_EXT, 92, ISOFileInfo.DATA_BYTES2, 53, -34, ISO7816.INS_READ_BINARY_STAMPED, ISOFileInfo.A5, -4, -128, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, ISOFileInfo.FMD_BYTE, 109, ISO7816.INS_UPDATE_RECORD, -16, 89, -87, 76, Ascii.ETB, Ascii.DEL, -111, -72, -55, 87, Ascii.ESC, ISO7816.INS_CREATE_FILE, 97};
    private static final byte[] T0 = {-92, -94, -87, -59, 78, -55, 3, -39, 126, 15, ISO7816.INS_WRITE_RECORD, -83, -25, -45, 39, 91, -29, ISOFileInfo.A1, -24, -26, 124, ISO7816.INS_PSO, 85, 12, -122, 57, -41, ISOFileInfo.ENV_TEMP_EF, -72, 18, ISOFileInfo.FCI_BYTE, 40, -51, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 86, 114, -7, -65, 79, 115, -23, -9, 87, Ascii.SYN, -84, 80, ISO7816.INS_GET_RESPONSE, -99, -73, 71, 113, 96, -60, 116, 67, 108, Ascii.US, -109, 119, ISO7816.INS_UPDATE_RECORD, -50, 32, ISOFileInfo.SECURITY_ATTR_COMPACT, -103, 95, ISO7816.INS_REHABILITATE_CHV, 1, -11, 30, ISOFileInfo.FCI_EXT, 94, 97, ISO7816.INS_UNBLOCK_CHV, 75, 29, ISOFileInfo.DATA_BYTES2, Ascii.NAK, -12, 35, ISO7816.INS_UPDATE_BINARY, -22, -31, 103, -15, Ascii.DEL, -2, ISO7816.INS_PUT_DATA, 60, 7, 83, 106, -124, -100, -53, 2, ISOFileInfo.FILE_IDENTIFIER, 51, -35, 53, ISO7816.INS_APPEND_RECORD, 89, 90, -104, ISOFileInfo.A5, -110, ISOFileInfo.FMD_BYTE, 4, 6, 16, 77, 28, -105, 8, Constants.INQUIRY, -18, ISOFileInfo.AB, 5, -81, 121, ISOFileInfo.A0, Ascii.CAN, 70, 109, -4, -119, -44, -57, -1, -16, -49, CVCAFile.CAR_TAG, -111, -8, 104, 10, 101, ISOFileInfo.CHANNEL_SECURITY, ISO7816.INS_READ_RECORD_STAMPED, -3, -61, -17, 120, 76, -52, -98, ISO7816.INS_DECREASE, 46, PSSSigner.TRAILER_IMPLICIT, 11, 84, Ascii.SUB, -90, -69, 38, -128, 72, -108, ISO7816.INS_INCREASE, 125, -89, 63, -82, ISO7816.INS_MSE, 61, 102, -86, -10, 0, 93, -67, 74, ISO7816.INS_CREATE_FILE, 59, ISO7816.INS_READ_BINARY_STAMPED, Ascii.ETB, ISOFileInfo.SECURITY_ATTR_EXP, -97, 118, ISO7816.INS_READ_BINARY, ISO7816.INS_CHANGE_CHV, -102, 37, 99, -37, -21, 122, 62, 92, ISO7816.INS_READ_RECORD2, ISO7816.INS_READ_BINARY2, 41, -14, ISO7816.INS_GET_DATA, 88, 110, ISO7816.INS_LOAD_KEY_FILE, -88, 47, 117, -33, Ascii.DC4, -5, 19, 73, -120, -78, -20, ISO7816.INS_DELETE_FILE, ISO7816.INS_DECREASE_STAMPED, 45, -106, -58, 58, -19, -107, 14, -27, ISOFileInfo.PROP_INFO, 107, SignedBytes.MAX_POWER_OF_TWO, Constants.NFC_READER, -101, 9, Ascii.EM, 43, 82, -34, 69, -93, -6, 81, ISO7816.INS_ENVELOPE, -75, -47, -112, -71, -13, 55, -63, 13, -70, 65, 17, 56, 123, -66, ISO7816.INS_WRITE_BINARY, -43, 105, 54, -56, ISOFileInfo.FCP_BYTE, Ascii.ESC, -126, -113};
    private static final byte[] T1 = {ISOFileInfo.FILE_IDENTIFIER, -14, ISO7816.INS_PSO, -21, -23, -65, 123, -100, ISO7816.INS_DECREASE_STAMPED, -106, ISOFileInfo.ENV_TEMP_EF, -104, -71, 105, ISOFileInfo.SECURITY_ATTR_COMPACT, 41, 61, -120, 104, 6, 57, 17, 76, 14, ISOFileInfo.A0, 86, SignedBytes.MAX_POWER_OF_TWO, -110, Ascii.NAK, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD2, ISO7816.INS_UPDATE_RECORD, ISOFileInfo.FCI_BYTE, -8, 38, -70, -66, -67, Constants.INQUIRY, -5, -61, -2, -128, 97, -31, 122, ISO7816.INS_INCREASE, ISO7816.INS_WRITE_RECORD, ISO7816.INS_MANAGE_CHANNEL, 32, ISOFileInfo.A1, 69, -20, -39, Ascii.SUB, 93, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_LOAD_KEY_FILE, 9, ISOFileInfo.A5, 85, ISOFileInfo.CHANNEL_SECURITY, 55, 118, -87, 103, 16, Ascii.ETB, 54, 101, ISO7816.INS_READ_BINARY2, -107, ISOFileInfo.FCP_BYTE, 89, 116, -93, 80, 47, 75, -56, ISO7816.INS_WRITE_BINARY, -113, -51, -44, 60, -122, 18, 29, 35, -17, -12, 83, Ascii.EM, 53, -26, Ascii.DEL, 94, ISO7816.INS_UPDATE_BINARY, 121, 81, ISO7816.INS_MSE, Ascii.DC4, -9, 30, 74, CVCAFile.CAR_TAG, -101, 65, 115, 45, -63, 92, -90, -94, ISO7816.INS_CREATE_FILE, 46, -45, 40, -69, -55, -82, 106, -47, 90, ISO7816.INS_DECREASE, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, ISO7816.INS_DELETE_FILE, Ascii.SYN, 108, -6, ISO7816.INS_READ_BINARY, 109, Ascii.US, 82, -103, 13, 78, 3, -111, ISO7816.INS_ENVELOPE, 77, ISOFileInfo.FMD_BYTE, 119, -97, -35, -60, 73, ISOFileInfo.LCS_BYTE, -102, ISO7816.INS_CHANGE_CHV, 56, -89, 87, ISOFileInfo.PROP_INFO, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, 11, -43, 19, 117, -16, 114, ISO7816.INS_READ_RECORD_STAMPED, -99, Ascii.ESC, 1, 63, ISO7816.INS_REHABILITATE_CHV, -27, ISOFileInfo.FCI_EXT, -3, 7, -15, ISOFileInfo.AB, -108, Ascii.CAN, -22, -4, 58, -126, 95, 5, 84, -37, 0, ISOFileInfo.SECURITY_ATTR_EXP, -29, 72, 12, ISO7816.INS_GET_DATA, 120, -119, 10, -1, 62, 91, ISOFileInfo.DATA_BYTES2, -18, 113, ISO7816.INS_APPEND_RECORD, ISO7816.INS_PUT_DATA, ISO7816.INS_UNBLOCK_CHV, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, ISO7816.INS_GET_RESPONSE, -50, 67, 37, 28, Constants.NFC_READER, 51, 15, -81, 71, -19, 102, 99, -109, -86};
    private static final byte[] T2 = {69, -44, 11, 67, -15, 114, -19, -92, ISO7816.INS_ENVELOPE, 56, -26, 113, -3, ISO7816.INS_READ_RECORD_STAMPED, 58, -107, 80, ISO7816.INS_REHABILITATE_CHV, 75, ISO7816.INS_APPEND_RECORD, 116, 107, 30, 17, 90, -58, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.A5, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, -93, -88, -6, 5, -39, -105, SignedBytes.MAX_POWER_OF_TWO, -55, -112, -104, -113, ISO7816.INS_UPDATE_RECORD, 18, Constants.INQUIRY, ISO7816.INS_UNBLOCK_CHV, 71, 106, -103, -82, -56, Ascii.DEL, -7, 79, 93, -106, ISOFileInfo.FCI_BYTE, -12, ISO7816.INS_READ_RECORD2, 57, Constants.NFC_READER, ISO7816.INS_PUT_DATA, -100, ISOFileInfo.PROP_INFO, -98, 59, -16, -65, -17, 6, -18, -27, 95, 32, 16, -52, 60, 84, 74, 82, -108, 14, ISO7816.INS_GET_RESPONSE, 40, -10, 86, 96, -94, -29, 15, -20, -99, ISO7816.INS_CHANGE_CHV, ISOFileInfo.FILE_IDENTIFIER, 126, -43, 124, -21, Ascii.CAN, -41, -51, -35, 120, -1, -37, ISOFileInfo.A1, 9, ISO7816.INS_WRITE_BINARY, 118, -124, 117, -69, 29, Ascii.SUB, 47, ISO7816.INS_READ_BINARY, -2, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_DECREASE_STAMPED, 99, 53, ISO7816.INS_WRITE_RECORD, ISO7816.INS_PSO, 89, 109, 77, 119, -25, ISOFileInfo.CHANNEL_SECURITY, 97, -49, -97, -50, 39, -11, -128, -122, -57, -90, -5, -8, ISOFileInfo.FCI_EXT, ISOFileInfo.AB, ISOFileInfo.FCP_BYTE, 63, -33, 72, 0, Ascii.DC4, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, 12, -14, 41, -81, Ascii.ETB, 108, 65, ISO7816.INS_DECREASE, -23, -109, 85, -9, -84, 104, 38, -60, 125, ISO7816.INS_GET_DATA, 122, 62, ISOFileInfo.A0, 55, 3, -63, 54, 105, 102, 8, Ascii.SYN, -89, PSSSigner.TRAILER_IMPLICIT, -59, -45, ISO7816.INS_MSE, -73, 19, 70, ISO7816.INS_INCREASE, -24, 87, -120, 43, ISOFileInfo.DATA_BYTES2, -78, 78, ISOFileInfo.FMD_BYTE, 28, -86, -111, 88, 46, -101, 92, Ascii.ESC, 81, 115, CVCAFile.CAR_TAG, 35, 1, 110, -13, 13, -66, 61, 10, 45, Ascii.US, 103, 51, Ascii.EM, 123, 94, -22, -34, ISOFileInfo.SECURITY_ATTR_EXP, -53, -87, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.ENV_TEMP_EF, -83, 73, -126, ISO7816.INS_DELETE_FILE, -70, -61, Ascii.NAK, -47, ISO7816.INS_CREATE_FILE, -119, -4, ISO7816.INS_READ_BINARY2, -71, -75, 7, 121, -72, -31};
    private static final byte[] T3 = {-78, ISO7816.INS_READ_RECORD_STAMPED, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, ISO7816.INS_MSE, 67, -61, -126, 39, -51, Ascii.CAN, 81, ISOFileInfo.FCP_BYTE, 45, -9, 92, 14, 59, -3, ISO7816.INS_GET_DATA, -101, 13, 15, 121, ISOFileInfo.SECURITY_ATTR_COMPACT, 16, 76, 116, 28, 10, ISOFileInfo.CHANNEL_SECURITY, 124, -108, 7, -57, 94, Ascii.DC4, ISOFileInfo.A1, Constants.NFC_READER, 87, 80, 78, -87, -128, -39, -17, ISOFileInfo.FMD_BYTE, 65, -49, 60, -18, 46, 19, 41, -70, ISO7816.INS_DECREASE_STAMPED, 90, -82, ISOFileInfo.LCS_BYTE, 97, 51, 18, -71, 85, -88, Ascii.NAK, 5, -10, 3, 6, 73, -75, 37, 9, Ascii.SYN, 12, ISO7816.INS_PSO, 56, -4, 32, -12, -27, Ascii.DEL, -41, Constants.INQUIRY, 43, 102, ISOFileInfo.FCI_BYTE, -1, 114, -122, -16, -93, 47, 120, 0, PSSSigner.TRAILER_IMPLICIT, -52, ISO7816.INS_APPEND_RECORD, ISO7816.INS_READ_BINARY, -15, CVCAFile.CAR_TAG, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_DECREASE, 95, 96, 4, -20, ISOFileInfo.A5, -29, ISOFileInfo.SECURITY_ATTR_EXP, -25, 29, -65, -124, 123, -26, ISOFileInfo.DATA_BYTES2, -8, -34, ISO7816.INS_LOAD_KEY_FILE, ISO7816.INS_WRITE_RECORD, Ascii.ETB, -50, 75, 71, ISO7816.INS_UPDATE_BINARY, 105, 108, Ascii.EM, -103, -102, 1, ISO7816.INS_READ_RECORD2, ISOFileInfo.PROP_INFO, ISO7816.INS_READ_BINARY2, -7, 89, ISO7816.INS_ENVELOPE, 55, -23, -56, ISOFileInfo.A0, -19, 79, -119, 104, 109, -43, 38, -111, ISOFileInfo.FCI_EXT, 88, -67, -55, -104, ISO7816.INS_UPDATE_RECORD, 117, ISO7816.INS_GET_RESPONSE, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, 11, -37, SignedBytes.MAX_POWER_OF_TWO, -110, Ascii.SUB, -6, -84, ISO7816.INS_DELETE_FILE, -31, 113, Ascii.US, 101, ISOFileInfo.ENV_TEMP_EF, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, ISO7816.INS_CREATE_FILE, 53, -69, 58, 77, -83, ISO7816.INS_UNBLOCK_CHV, 61, 86, 8, Ascii.ESC, 74, -109, 106, ISOFileInfo.AB, -72, 122, -14, 125, ISO7816.INS_PUT_DATA, 63, -2, 62, -66, -22, -86, ISO7816.INS_REHABILITATE_CHV, -58, ISO7816.INS_WRITE_BINARY, 54, 72, ISO7816.INS_MANAGE_CHANNEL, -106, 119, ISO7816.INS_CHANGE_CHV, 83, -33, -13, ISOFileInfo.FILE_IDENTIFIER, 40, ISO7816.INS_INCREASE, 69, 30, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};
    private boolean forEncryption;
    private long[] internalState;
    private long[][] roundKeys;
    private int roundsAmount;
    private int wordsInBlock;
    private int wordsInKey;
    private long[] workingKey;

    public DSTU7624Engine(int i) throws IllegalArgumentException {
        if (i != 128 && i != 256 && i != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i2 = i >>> 6;
        this.wordsInBlock = i2;
        this.internalState = new long[i2];
    }

    private void addRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i2 = 0; i2 < this.wordsInBlock; i2++) {
            long[] jArr2 = this.internalState;
            jArr2[i2] = jArr2[i2] + jArr[i2];
        }
    }

    private void decryptBlock_128(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, i + 8);
        long[][] jArr = this.roundKeys;
        int i3 = this.roundsAmount;
        long[] jArr2 = jArr[i3];
        char c2 = 0;
        long j2 = jLittleEndianToLong - jArr2[0];
        char c3 = 1;
        long j3 = jLittleEndianToLong2 - jArr2[1];
        while (true) {
            long jMixColumnInv = mixColumnInv(j2);
            long jMixColumnInv2 = mixColumnInv(j3);
            int i5 = (int) jMixColumnInv;
            int i6 = (int) (jMixColumnInv >>> 32);
            int i21 = (int) jMixColumnInv2;
            int i22 = (int) (jMixColumnInv2 >>> 32);
            byte[] bArr3 = T0;
            byte b4 = bArr3[i5 & 255];
            byte[] bArr4 = T1;
            byte b5 = bArr4[(i5 >>> 8) & 255];
            byte[] bArr5 = T2;
            char c5 = c2;
            byte b7 = bArr5[(i5 >>> 16) & 255];
            byte[] bArr6 = T3;
            int i32 = (bArr6[i5 >>> 24] << Ascii.CAN) | ((b7 & UnsignedBytes.MAX_VALUE) << 16) | (b4 & UnsignedBytes.MAX_VALUE) | ((b5 & UnsignedBytes.MAX_VALUE) << 8);
            byte b13 = bArr3[i22 & 255];
            byte b15 = bArr4[(i22 >>> 8) & 255];
            byte b17 = bArr5[(i22 >>> 16) & 255];
            char c6 = c3;
            long j5 = (((long) i32) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i22 >>> 24] << Ascii.CAN) | (((b13 & UnsignedBytes.MAX_VALUE) | ((b15 & UnsignedBytes.MAX_VALUE) << 8)) | ((b17 & UnsignedBytes.MAX_VALUE) << 16)))) << 32);
            byte b40 = bArr3[i21 & 255];
            byte b61 = bArr4[(i21 >>> 8) & 255];
            byte b64 = bArr5[(i21 >>> 16) & 255];
            int i33 = (bArr6[i21 >>> 24] << Ascii.CAN) | (b40 & UnsignedBytes.MAX_VALUE) | ((b61 & UnsignedBytes.MAX_VALUE) << 8) | ((b64 & UnsignedBytes.MAX_VALUE) << 16);
            byte b69 = bArr3[i6 & 255];
            byte b76 = bArr4[(i6 >>> 8) & 255];
            byte b86 = bArr5[(i6 >>> 16) & 255];
            long j16 = (((long) i33) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i6 >>> 24] << Ascii.CAN) | (((b69 & UnsignedBytes.MAX_VALUE) | ((b76 & UnsignedBytes.MAX_VALUE) << 8)) | ((b86 & UnsignedBytes.MAX_VALUE) << 16)))) << 32);
            i3--;
            long[][] jArr3 = this.roundKeys;
            if (i3 == 0) {
                long[] jArr4 = jArr3[c5];
                long j22 = j5 - jArr4[c5];
                long j42 = j16 - jArr4[c6];
                Pack.longToLittleEndian(j22, bArr2, i2);
                Pack.longToLittleEndian(j42, bArr2, i2 + 8);
                return;
            }
            long[] jArr5 = jArr3[i3];
            long j46 = jArr5[c5] ^ j5;
            j3 = j16 ^ jArr5[c6];
            j2 = j46;
            c2 = c5;
            c3 = c6;
        }
    }

    private void encryptBlock_128(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, i + 8);
        char c2 = 0;
        long[] jArr = this.roundKeys[0];
        long j2 = jLittleEndianToLong + jArr[0];
        char c3 = 1;
        long j3 = jLittleEndianToLong2 + jArr[1];
        int i3 = 0;
        while (true) {
            int i5 = (int) j2;
            int i6 = (int) (j2 >>> 32);
            int i21 = (int) j3;
            int i22 = (int) (j3 >>> 32);
            byte[] bArr3 = S0;
            byte b4 = bArr3[i5 & 255];
            byte[] bArr4 = S1;
            byte b5 = bArr4[(i5 >>> 8) & 255];
            byte[] bArr5 = S2;
            char c5 = c2;
            byte b7 = bArr5[(i5 >>> 16) & 255];
            byte[] bArr6 = S3;
            int i32 = ((b7 & UnsignedBytes.MAX_VALUE) << 16) | (b4 & UnsignedBytes.MAX_VALUE) | ((b5 & UnsignedBytes.MAX_VALUE) << 8) | (bArr6[i5 >>> 24] << Ascii.CAN);
            byte b13 = bArr3[i22 & 255];
            byte b15 = bArr4[(i22 >>> 8) & 255];
            byte b17 = bArr5[(i22 >>> 16) & 255];
            char c6 = c3;
            long j5 = (((long) i32) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i22 >>> 24] << Ascii.CAN) | (((b13 & UnsignedBytes.MAX_VALUE) | ((b15 & UnsignedBytes.MAX_VALUE) << 8)) | ((b17 & UnsignedBytes.MAX_VALUE) << 16)))) << 32);
            byte b40 = bArr3[i21 & 255];
            byte b61 = bArr4[(i21 >>> 8) & 255];
            byte b64 = bArr5[(i21 >>> 16) & 255];
            int i33 = (bArr6[i21 >>> 24] << Ascii.CAN) | (b40 & UnsignedBytes.MAX_VALUE) | ((b61 & UnsignedBytes.MAX_VALUE) << 8) | ((b64 & UnsignedBytes.MAX_VALUE) << 16);
            byte b69 = bArr3[i6 & 255];
            byte b76 = bArr4[(i6 >>> 8) & 255];
            byte b86 = bArr5[(i6 >>> 16) & 255];
            long j16 = (((long) i33) & BodyPartID.bodyIdMax) | (((long) ((bArr6[i6 >>> 24] << Ascii.CAN) | (((b69 & UnsignedBytes.MAX_VALUE) | ((b76 & UnsignedBytes.MAX_VALUE) << 8)) | ((b86 & UnsignedBytes.MAX_VALUE) << 16)))) << 32);
            long jMixColumn = mixColumn(j5);
            long jMixColumn2 = mixColumn(j16);
            i3++;
            int i43 = this.roundsAmount;
            if (i3 == i43) {
                long[] jArr2 = this.roundKeys[i43];
                long j22 = jMixColumn + jArr2[c5];
                long j42 = jMixColumn2 + jArr2[c6];
                Pack.longToLittleEndian(j22, bArr2, i2);
                Pack.longToLittleEndian(j42, bArr2, i2 + 8);
                return;
            }
            long[] jArr3 = this.roundKeys[i3];
            long j46 = jMixColumn ^ jArr3[c5];
            j3 = jMixColumn2 ^ jArr3[c6];
            j2 = j46;
            c2 = c5;
            c3 = c6;
        }
    }

    private void invShiftRows() {
        int i = this.wordsInBlock;
        if (i == 2) {
            long[] jArr = this.internalState;
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j5 = (-4294967296L) & (j2 ^ j3);
            jArr[0] = j2 ^ j5;
            jArr[1] = j5 ^ j3;
            return;
        }
        if (i == 4) {
            long[] jArr2 = this.internalState;
            long j16 = jArr2[0];
            long j22 = jArr2[1];
            long j42 = jArr2[2];
            long j46 = jArr2[3];
            long j47 = (j16 ^ j22) & (-281470681808896L);
            long j57 = j16 ^ j47;
            long j58 = j22 ^ j47;
            long j65 = (j42 ^ j46) & (-281470681808896L);
            long j69 = j42 ^ j65;
            long j76 = j46 ^ j65;
            long j85 = (j57 ^ j69) & (-4294967296L);
            long j100 = j57 ^ j85;
            long j101 = (j58 ^ j76) & 281474976645120L;
            jArr2[0] = j100;
            jArr2[1] = j58 ^ j101;
            jArr2[2] = j69 ^ j85;
            jArr2[3] = j101 ^ j76;
            return;
        }
        if (i != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j102 = jArr3[0];
        long j103 = jArr3[1];
        long j104 = jArr3[2];
        long j105 = jArr3[3];
        long j106 = jArr3[4];
        long j107 = jArr3[5];
        long j108 = jArr3[6];
        long j109 = jArr3[7];
        long j110 = (j102 ^ j103) & (-71777214294589696L);
        long j111 = j102 ^ j110;
        long j112 = j103 ^ j110;
        long j113 = (j104 ^ j105) & (-71777214294589696L);
        long j114 = j104 ^ j113;
        long j115 = j105 ^ j113;
        long j116 = (j106 ^ j107) & (-71777214294589696L);
        long j117 = j106 ^ j116;
        long j118 = j107 ^ j116;
        long j119 = (j108 ^ j109) & (-71777214294589696L);
        long j120 = j108 ^ j119;
        long j121 = j109 ^ j119;
        long j122 = (j111 ^ j114) & (-281470681808896L);
        long j123 = j111 ^ j122;
        long j124 = j114 ^ j122;
        long j125 = (j112 ^ j115) & 72056494543077120L;
        long j126 = j112 ^ j125;
        long j127 = j115 ^ j125;
        long j128 = (j117 ^ j120) & (-281470681808896L);
        long j129 = j117 ^ j128;
        long j130 = j120 ^ j128;
        long j131 = (j118 ^ j121) & 72056494543077120L;
        long j132 = j118 ^ j131;
        long j133 = j121 ^ j131;
        long j134 = (j123 ^ j129) & (-4294967296L);
        long j135 = j123 ^ j134;
        long j136 = j129 ^ j134;
        long j137 = (j126 ^ j132) & 72057594021150720L;
        long j138 = j126 ^ j137;
        long j139 = (j124 ^ j130) & 281474976645120L;
        long j140 = j124 ^ j139;
        long j141 = j139 ^ j130;
        long j142 = (j127 ^ j133) & 1099511627520L;
        jArr3[0] = j135;
        jArr3[1] = j138;
        jArr3[2] = j140;
        jArr3[3] = j127 ^ j142;
        jArr3[4] = j136;
        jArr3[5] = j132 ^ j137;
        jArr3[6] = j141;
        jArr3[7] = j133 ^ j142;
    }

    private void invSubBytes() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            long j2 = jArr[i];
            int i2 = (int) j2;
            int i3 = (int) (j2 >>> 32);
            byte[] bArr = T0;
            byte b4 = bArr[i2 & 255];
            byte[] bArr2 = T1;
            byte b5 = bArr2[(i2 >>> 8) & 255];
            byte[] bArr3 = T2;
            byte b7 = bArr3[(i2 >>> 16) & 255];
            byte[] bArr4 = T3;
            byte b13 = bArr4[i2 >>> 24];
            int i5 = (b13 << Ascii.CAN) | (b4 & UnsignedBytes.MAX_VALUE) | ((b5 & UnsignedBytes.MAX_VALUE) << 8) | ((b7 & UnsignedBytes.MAX_VALUE) << 16);
            byte b15 = bArr[i3 & 255];
            byte b17 = bArr2[(i3 >>> 8) & 255];
            byte b40 = bArr3[(i3 >>> 16) & 255];
            byte b61 = bArr4[i3 >>> 24];
            jArr[i] = (((long) i5) & BodyPartID.bodyIdMax) | (((long) ((b61 << Ascii.CAN) | (((b15 & UnsignedBytes.MAX_VALUE) | ((b17 & UnsignedBytes.MAX_VALUE) << 8)) | ((b40 & UnsignedBytes.MAX_VALUE) << 16)))) << 32);
        }
    }

    private static long mixColumn(long j2) {
        long jMulX = mulX(j2);
        long jRotate = rotate(8, j2) ^ j2;
        long jRotate2 = (jRotate ^ rotate(16, jRotate)) ^ rotate(48, j2);
        return ((rotate(32, mulX2((j2 ^ jRotate2) ^ jMulX)) ^ jRotate2) ^ rotate(40, jMulX)) ^ rotate(48, jMulX);
    }

    private static long mixColumnInv(long j2) {
        long jRotate = rotate(8, j2) ^ j2;
        long jRotate2 = (jRotate ^ rotate(32, jRotate)) ^ rotate(48, j2);
        long j3 = jRotate2 ^ j2;
        long jRotate3 = rotate(48, j2);
        long jRotate4 = rotate(56, j2);
        long jMulX = mulX(j3 ^ jRotate4) ^ rotate(56, j3);
        long jMulX2 = mulX(rotate(40, mulX(jMulX) ^ j2) ^ (rotate(16, j3) ^ j2)) ^ (j3 ^ jRotate3);
        return mulX(rotate(40, ((j2 ^ rotate(32, j3)) ^ jRotate4) ^ mulX(((jRotate3 ^ (rotate(24, j2) ^ j3)) ^ jRotate4) ^ mulX(mulX(jMulX2) ^ rotate(16, jRotate2))))) ^ jRotate2;
    }

    private void mixColumns() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            jArr[i] = mixColumn(jArr[i]);
        }
    }

    private void mixColumnsInv() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            jArr[i] = mixColumnInv(jArr[i]);
        }
    }

    private static long mulX(long j2) {
        return (((j2 & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j2) << 1);
    }

    private static long mulX2(long j2) {
        return (((j2 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j2) << 2) ^ ((((-9187201950435737472L) & j2) >>> 6) * 29));
    }

    private static long rotate(int i, long j2) {
        return (j2 << (-i)) | (j2 >>> i);
    }

    private void rotateLeft(long[] jArr, long[] jArr2) {
        int i = this.wordsInBlock;
        if (i == 2) {
            long j2 = jArr[0];
            long j3 = jArr[1];
            jArr2[0] = (j2 >>> 56) | (j3 << 8);
            jArr2[1] = (j2 << 8) | (j3 >>> 56);
            return;
        }
        if (i == 4) {
            long j5 = jArr[0];
            long j16 = jArr[1];
            long j22 = jArr[2];
            long j42 = jArr[3];
            jArr2[0] = (j16 >>> 24) | (j22 << 40);
            jArr2[1] = (j22 >>> 24) | (j42 << 40);
            jArr2[2] = (j42 >>> 24) | (j5 << 40);
            jArr2[3] = (j5 >>> 24) | (j16 << 40);
            return;
        }
        if (i != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long j46 = jArr[0];
        long j47 = jArr[1];
        long j57 = jArr[2];
        long j58 = jArr[3];
        long j65 = jArr[4];
        long j69 = jArr[5];
        long j76 = jArr[6];
        long j85 = jArr[7];
        jArr2[0] = (j57 >>> 24) | (j58 << 40);
        jArr2[1] = (j58 >>> 24) | (j65 << 40);
        jArr2[2] = (j65 >>> 24) | (j69 << 40);
        jArr2[3] = (j69 >>> 24) | (j76 << 40);
        jArr2[4] = (j76 >>> 24) | (j85 << 40);
        jArr2[5] = (j85 >>> 24) | (j46 << 40);
        jArr2[6] = (j46 >>> 24) | (j47 << 40);
        jArr2[7] = (j47 >>> 24) | (j57 << 40);
    }

    private void shiftRows() {
        int i = this.wordsInBlock;
        if (i == 2) {
            long[] jArr = this.internalState;
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j5 = (-4294967296L) & (j2 ^ j3);
            jArr[0] = j2 ^ j5;
            jArr[1] = j5 ^ j3;
            return;
        }
        if (i == 4) {
            long[] jArr2 = this.internalState;
            long j16 = jArr2[0];
            long j22 = jArr2[1];
            long j42 = jArr2[2];
            long j46 = jArr2[3];
            long j47 = (j16 ^ j42) & (-4294967296L);
            long j57 = j16 ^ j47;
            long j58 = j42 ^ j47;
            long j65 = (j22 ^ j46) & 281474976645120L;
            long j69 = j22 ^ j65;
            long j76 = j46 ^ j65;
            long j85 = (j57 ^ j69) & (-281470681808896L);
            long j100 = (j58 ^ j76) & (-281470681808896L);
            jArr2[0] = j57 ^ j85;
            jArr2[1] = j69 ^ j85;
            jArr2[2] = j58 ^ j100;
            jArr2[3] = j76 ^ j100;
            return;
        }
        if (i != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j101 = jArr3[0];
        long j102 = jArr3[1];
        long j103 = jArr3[2];
        long j104 = jArr3[3];
        long j105 = jArr3[4];
        long j106 = jArr3[5];
        long j107 = jArr3[6];
        long j108 = jArr3[7];
        long j109 = (j101 ^ j105) & (-4294967296L);
        long j110 = j101 ^ j109;
        long j111 = j105 ^ j109;
        long j112 = (j102 ^ j106) & 72057594021150720L;
        long j113 = j102 ^ j112;
        long j114 = j106 ^ j112;
        long j115 = (j103 ^ j107) & 281474976645120L;
        long j116 = j103 ^ j115;
        long j117 = j107 ^ j115;
        long j118 = (j104 ^ j108) & 1099511627520L;
        long j119 = j104 ^ j118;
        long j120 = j108 ^ j118;
        long j121 = (j110 ^ j116) & (-281470681808896L);
        long j122 = j110 ^ j121;
        long j123 = j116 ^ j121;
        long j124 = (j113 ^ j119) & 72056494543077120L;
        long j125 = j113 ^ j124;
        long j126 = j119 ^ j124;
        long j127 = (j111 ^ j117) & (-281470681808896L);
        long j128 = j111 ^ j127;
        long j129 = j117 ^ j127;
        long j130 = (j114 ^ j120) & 72056494543077120L;
        long j131 = j114 ^ j130;
        long j132 = j120 ^ j130;
        long j133 = (j122 ^ j125) & (-71777214294589696L);
        long j134 = j122 ^ j133;
        long j135 = j125 ^ j133;
        long j136 = (j123 ^ j126) & (-71777214294589696L);
        long j137 = j123 ^ j136;
        long j138 = j126 ^ j136;
        long j139 = (j128 ^ j131) & (-71777214294589696L);
        long j140 = j128 ^ j139;
        long j141 = j131 ^ j139;
        long j142 = (j129 ^ j132) & (-71777214294589696L);
        jArr3[0] = j134;
        jArr3[1] = j135;
        jArr3[2] = j137;
        jArr3[3] = j138;
        jArr3[4] = j140;
        jArr3[5] = j141;
        jArr3[6] = j129 ^ j142;
        jArr3[7] = j132 ^ j142;
    }

    private void subBytes() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
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

    private void subRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i2 = 0; i2 < this.wordsInBlock; i2++) {
            long[] jArr2 = this.internalState;
            jArr2[i2] = jArr2[i2] - jArr[i2];
        }
    }

    private void workingKeyExpandEven(long[] jArr, long[] jArr2) {
        int i;
        int i2;
        int i3 = this.wordsInKey;
        long[] jArr3 = new long[i3];
        long[] jArr4 = new long[this.wordsInBlock];
        System.arraycopy(jArr, 0, jArr3, 0, i3);
        long j2 = 281479271743489L;
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 < this.wordsInBlock; i6++) {
                jArr4[i6] = jArr2[i6] + j2;
            }
            for (int i21 = 0; i21 < this.wordsInBlock; i21++) {
                this.internalState[i21] = jArr3[i21] + jArr4[i21];
            }
            subBytes();
            shiftRows();
            mixColumns();
            for (int i22 = 0; i22 < this.wordsInBlock; i22++) {
                long[] jArr5 = this.internalState;
                jArr5[i22] = jArr5[i22] ^ jArr4[i22];
            }
            subBytes();
            shiftRows();
            mixColumns();
            int i32 = 0;
            while (true) {
                i = this.wordsInBlock;
                if (i32 >= i) {
                    break;
                }
                long[] jArr6 = this.internalState;
                jArr6[i32] = jArr6[i32] + jArr4[i32];
                i32++;
            }
            System.arraycopy(this.internalState, 0, this.roundKeys[i5], 0, i);
            if (this.roundsAmount == i5) {
                return;
            }
            if (this.wordsInBlock != this.wordsInKey) {
                i5 += 2;
                j2 <<= 1;
                for (int i33 = 0; i33 < this.wordsInBlock; i33++) {
                    jArr4[i33] = jArr2[i33] + j2;
                }
                int i43 = 0;
                while (true) {
                    int i59 = this.wordsInBlock;
                    if (i43 >= i59) {
                        break;
                    }
                    this.internalState[i43] = jArr3[i59 + i43] + jArr4[i43];
                    i43++;
                }
                subBytes();
                shiftRows();
                mixColumns();
                for (int i66 = 0; i66 < this.wordsInBlock; i66++) {
                    long[] jArr7 = this.internalState;
                    jArr7[i66] = jArr7[i66] ^ jArr4[i66];
                }
                subBytes();
                shiftRows();
                mixColumns();
                int i74 = 0;
                while (true) {
                    i2 = this.wordsInBlock;
                    if (i74 >= i2) {
                        break;
                    }
                    long[] jArr8 = this.internalState;
                    jArr8[i74] = jArr8[i74] + jArr4[i74];
                    i74++;
                }
                System.arraycopy(this.internalState, 0, this.roundKeys[i5], 0, i2);
                if (this.roundsAmount == i5) {
                    return;
                }
            }
            i5 += 2;
            j2 <<= 1;
            long j3 = jArr3[0];
            for (int i92 = 1; i92 < i3; i92++) {
                jArr3[i92 - 1] = jArr3[i92];
            }
            jArr3[i3 - 1] = j3;
        }
    }

    private void workingKeyExpandKT(long[] jArr, long[] jArr2) {
        int i = this.wordsInBlock;
        long[] jArr3 = new long[i];
        long[] jArr4 = new long[i];
        long[] jArr5 = new long[i];
        this.internalState = jArr5;
        long j2 = jArr5[0];
        int i2 = this.wordsInKey;
        jArr5[0] = j2 + ((long) (i + i2 + 1));
        System.arraycopy(jArr, 0, jArr3, 0, i);
        if (i == i2) {
            System.arraycopy(jArr, 0, jArr4, 0, i);
        } else {
            int i3 = this.wordsInBlock;
            System.arraycopy(jArr, i3, jArr4, 0, i3);
        }
        int i5 = 0;
        while (true) {
            long[] jArr6 = this.internalState;
            if (i5 >= jArr6.length) {
                break;
            }
            jArr6[i5] = jArr6[i5] + jArr3[i5];
            i5++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i6 = 0;
        while (true) {
            long[] jArr7 = this.internalState;
            if (i6 >= jArr7.length) {
                break;
            }
            jArr7[i6] = jArr7[i6] ^ jArr4[i6];
            i6++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i21 = 0;
        while (true) {
            long[] jArr8 = this.internalState;
            if (i21 >= jArr8.length) {
                subBytes();
                shiftRows();
                mixColumns();
                System.arraycopy(this.internalState, 0, jArr2, 0, this.wordsInBlock);
                return;
            }
            jArr8[i21] = jArr8[i21] + jArr3[i21];
            i21++;
        }
    }

    private void workingKeyExpandOdd() {
        for (int i = 1; i < this.roundsAmount; i += 2) {
            long[][] jArr = this.roundKeys;
            rotateLeft(jArr[i - 1], jArr[i]);
        }
    }

    private void xorRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i2 = 0; i2 < this.wordsInBlock; i2++) {
            long[] jArr2 = this.internalState;
            jArr2[i2] = jArr2[i2] ^ jArr[i2];
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.wordsInBlock << 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[LOOP:0: B:26:0x0086->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[EDGE_INSN: B:37:0x0094->B:29:0x0094 BREAK  A[LOOP:0: B:26:0x0086->B:28:0x008b], SYNTHETIC] */
    @Override // org.bouncycastle.crypto.BlockCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r7, org.bouncycastle.crypto.CipherParameters r8) throws java.lang.IllegalArgumentException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof org.bouncycastle.crypto.params.KeyParameter
            if (r0 == 0) goto Lbc
            r6.forEncryption = r7
            r0 = r8
            org.bouncycastle.crypto.params.KeyParameter r0 = (org.bouncycastle.crypto.params.KeyParameter) r0
            byte[] r0 = r0.getKey()
            int r1 = r0.length
            int r1 = r1 << 3
            int r2 = r6.wordsInBlock
            int r2 = r2 << 6
            r3 = 512(0x200, float:7.17E-43)
            r4 = 128(0x80, float:1.8E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r1 == r4) goto L29
            if (r1 == r5) goto L29
            if (r1 != r3) goto L21
            goto L29
        L21:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unsupported key length: only 128/256/512 are allowed"
            r7.<init>(r8)
            throw r7
        L29:
            if (r1 == r2) goto L38
            int r2 = r2 * 2
            if (r1 != r2) goto L30
            goto L38
        L30:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unsupported key length"
            r7.<init>(r8)
            throw r7
        L38:
            if (r1 == r4) goto L66
            if (r1 == r5) goto L54
            if (r1 == r3) goto L3f
            goto L78
        L3f:
            r2 = 18
            r6.roundsAmount = r2
            org.bouncycastle.crypto.constraints.DefaultServiceProperties r2 = new org.bouncycastle.crypto.constraints.DefaultServiceProperties
            java.lang.String r3 = r6.getAlgorithmName()
            org.bouncycastle.crypto.CryptoServicePurpose r7 = org.bouncycastle.crypto.engines.Utils.getPurpose(r7)
            r2.<init>(r3, r5, r8, r7)
        L50:
            org.bouncycastle.crypto.CryptoServicesRegistrar.checkConstraints(r2)
            goto L78
        L54:
            r2 = 14
            r6.roundsAmount = r2
            org.bouncycastle.crypto.constraints.DefaultServiceProperties r2 = new org.bouncycastle.crypto.constraints.DefaultServiceProperties
            java.lang.String r3 = r6.getAlgorithmName()
            org.bouncycastle.crypto.CryptoServicePurpose r7 = org.bouncycastle.crypto.engines.Utils.getPurpose(r7)
            r2.<init>(r3, r5, r8, r7)
            goto L50
        L66:
            r2 = 10
            r6.roundsAmount = r2
            org.bouncycastle.crypto.constraints.DefaultServiceProperties r2 = new org.bouncycastle.crypto.constraints.DefaultServiceProperties
            java.lang.String r3 = r6.getAlgorithmName()
            org.bouncycastle.crypto.CryptoServicePurpose r7 = org.bouncycastle.crypto.engines.Utils.getPurpose(r7)
            r2.<init>(r3, r4, r8, r7)
            goto L50
        L78:
            int r7 = r1 >>> 6
            r6.wordsInKey = r7
            int r7 = r6.roundsAmount
            int r7 = r7 + 1
            long[][] r7 = new long[r7][]
            r6.roundKeys = r7
            r7 = 0
            r8 = r7
        L86:
            long[][] r2 = r6.roundKeys
            int r3 = r2.length
            if (r8 >= r3) goto L94
            int r3 = r6.wordsInBlock
            long[] r3 = new long[r3]
            r2[r8] = r3
            int r8 = r8 + 1
            goto L86
        L94:
            int r8 = r6.wordsInKey
            long[] r8 = new long[r8]
            r6.workingKey = r8
            int r2 = r0.length
            int r1 = r1 >>> 3
            if (r2 != r1) goto Lb4
            org.bouncycastle.util.Pack.littleEndianToLong(r0, r7, r8)
            int r7 = r6.wordsInBlock
            long[] r7 = new long[r7]
            long[] r8 = r6.workingKey
            r6.workingKeyExpandKT(r8, r7)
            long[] r8 = r6.workingKey
            r6.workingKeyExpandEven(r8, r7)
            r6.workingKeyExpandOdd()
            return
        Lb4:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid key parameter passed to DSTU7624Engine init"
            r7.<init>(r8)
            throw r7
        Lbc:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid parameter passed to DSTU7624Engine init"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.DSTU7624Engine.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        if (this.workingKey == null) {
            throw new IllegalStateException("DSTU7624Engine not initialised");
        }
        if (getBlockSize() + i > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (getBlockSize() + i2 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i5 = 0;
        if (this.forEncryption) {
            if (this.wordsInBlock != 2) {
                Pack.littleEndianToLong(bArr, i, this.internalState);
                addRoundKey(0);
                while (true) {
                    subBytes();
                    shiftRows();
                    mixColumns();
                    i5++;
                    i3 = this.roundsAmount;
                    if (i5 == i3) {
                        break;
                    }
                    xorRoundKey(i5);
                }
                addRoundKey(i3);
                Pack.longToLittleEndian(this.internalState, bArr2, i2);
            } else {
                encryptBlock_128(bArr, i, bArr2, i2);
            }
        } else if (this.wordsInBlock != 2) {
            Pack.littleEndianToLong(bArr, i, this.internalState);
            subRoundKey(this.roundsAmount);
            int i6 = this.roundsAmount;
            while (true) {
                mixColumnsInv();
                invShiftRows();
                invSubBytes();
                i6--;
                if (i6 == 0) {
                    break;
                }
                xorRoundKey(i6);
            }
            subRoundKey(0);
            Pack.longToLittleEndian(this.internalState, bArr2, i2);
        } else {
            decryptBlock_128(bArr, i, bArr2, i2);
        }
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.internalState, 0L);
    }
}
