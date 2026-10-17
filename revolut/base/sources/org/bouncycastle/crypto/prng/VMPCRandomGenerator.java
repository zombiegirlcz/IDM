package org.bouncycastle.crypto.prng;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes14.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f228553n = 0;
    private byte[] P = {-69, ISO7816.INS_UNBLOCK_CHV, ISOFileInfo.FCP_BYTE, Ascii.DEL, -75, -86, -44, 13, ISOFileInfo.DATA_BYTES2, -2, -78, -126, -53, ISOFileInfo.A0, ISOFileInfo.A1, 8, Ascii.CAN, 113, 86, -24, 73, 2, 16, -60, -34, 53, ISOFileInfo.A5, -20, -128, 18, -72, 105, ISO7816.INS_PUT_DATA, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, ISO7816.INS_CREATE_FILE, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, ISO7816.INS_LOAD_KEY_FILE, 81, -82, 80, ISOFileInfo.PROP_INFO, 60, 10, ISO7816.INS_DELETE_FILE, -13, -100, 38, 35, 83, -55, ISOFileInfo.FILE_IDENTIFIER, -105, 70, ISO7816.INS_READ_BINARY2, -103, ISOFileInfo.FMD_BYTE, Constants.INQUIRY, 119, -43, 29, ISO7816.INS_UPDATE_BINARY, 120, -67, 94, ISO7816.INS_READ_BINARY, ISOFileInfo.LCS_BYTE, ISO7816.INS_MSE, 56, -8, 104, 43, ISO7816.INS_PSO, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.FCI_BYTE, -33, 4, -27, -107, 62, 37, -122, -90, 11, -113, -15, ISO7816.INS_CHANGE_CHV, 14, -41, SignedBytes.MAX_POWER_OF_TWO, ISO7816.INS_READ_RECORD2, -49, 126, 6, Ascii.NAK, -102, 77, 28, -93, -37, ISO7816.INS_INCREASE, -110, 88, 17, 39, -12, 89, ISO7816.INS_WRITE_BINARY, 78, 106, Ascii.ETB, 91, -84, -1, 7, ISO7816.INS_GET_RESPONSE, 101, 121, -4, -57, -51, 118, CVCAFile.CAR_TAG, 93, -25, 58, ISO7816.INS_DECREASE_STAMPED, 122, ISO7816.INS_DECREASE, 40, 15, 115, 1, -7, -47, ISO7816.INS_WRITE_RECORD, Ascii.EM, -23, -111, -71, 90, -19, 65, 109, ISO7816.INS_READ_BINARY_STAMPED, -61, -98, -65, 99, -6, Ascii.US, 51, 96, 71, -119, -16, -106, Ascii.SUB, 95, -109, 61, 55, 75, -39, -88, -63, Ascii.ESC, -10, 57, ISOFileInfo.SECURITY_ATTR_EXP, -73, 12, 32, -50, -120, 110, ISO7816.INS_READ_RECORD_STAMPED, 116, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, Ascii.SYN, 41, -14, ISOFileInfo.FCI_EXT, -11, -21, ISO7816.INS_MANAGE_CHANNEL, -29, -5, 85, -97, -58, ISO7816.INS_REHABILITATE_CHV, 74, 69, 125, ISO7816.INS_APPEND_RECORD, 107, 92, 108, 102, -87, ISOFileInfo.SECURITY_ATTR_COMPACT, -18, -124, 19, -89, 30, -99, ISO7816.INS_UPDATE_RECORD, 103, 72, -70, 46, -26, -92, ISOFileInfo.AB, 124, -108, 0, Constants.NFC_READER, -17, -22, -66, ISO7816.INS_GET_DATA, 114, 79, 82, -104, 63, ISO7816.INS_ENVELOPE, Ascii.DC4, 123, 59, 84};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f228554s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j2) {
        addSeedMaterial(Pack.longToBigEndian(j2));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b4 : bArr) {
            byte[] bArr2 = this.P;
            byte b5 = this.f228554s;
            byte b7 = this.f228553n;
            byte b13 = bArr2[(b5 + bArr2[b7 & UnsignedBytes.MAX_VALUE] + b4) & 255];
            this.f228554s = b13;
            byte b15 = bArr2[b7 & UnsignedBytes.MAX_VALUE];
            bArr2[b7 & UnsignedBytes.MAX_VALUE] = bArr2[b13 & UnsignedBytes.MAX_VALUE];
            bArr2[b13 & UnsignedBytes.MAX_VALUE] = b15;
            this.f228553n = (byte) ((b7 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.P) {
            int i3 = i2 + i;
            while (i != i3) {
                try {
                    byte[] bArr2 = this.P;
                    byte b4 = this.f228554s;
                    byte b5 = this.f228553n;
                    byte b7 = bArr2[(b4 + bArr2[b5 & UnsignedBytes.MAX_VALUE]) & 255];
                    this.f228554s = b7;
                    bArr[i] = bArr2[(bArr2[bArr2[b7 & UnsignedBytes.MAX_VALUE] & UnsignedBytes.MAX_VALUE] + 1) & 255];
                    byte b13 = bArr2[b5 & UnsignedBytes.MAX_VALUE];
                    bArr2[b5 & UnsignedBytes.MAX_VALUE] = bArr2[b7 & UnsignedBytes.MAX_VALUE];
                    bArr2[b7 & UnsignedBytes.MAX_VALUE] = b13;
                    this.f228553n = (byte) ((b5 + 1) & 255);
                    i++;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }
}
