package org.bouncycastle.util.encoders;

import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.io.IOException;
import java.io.OutputStream;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes14.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = 61;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c2, char c3, char c5, char c6) throws IOException {
        char c7 = this.padding;
        if (c5 == c7) {
            if (c6 != c7) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.decodingTable;
            byte b4 = bArr[c2];
            byte b5 = bArr[c3];
            if ((b4 | b5) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b4 << 2) | (b5 >> 4));
            return 1;
        }
        if (c6 == c7) {
            byte[] bArr2 = this.decodingTable;
            byte b7 = bArr2[c2];
            byte b13 = bArr2[c3];
            byte b15 = bArr2[c5];
            if ((b7 | b13 | b15) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b7 << 2) | (b13 >> 4));
            outputStream.write((b13 << 4) | (b15 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b17 = bArr3[c2];
        byte b40 = bArr3[c3];
        byte b61 = bArr3[c5];
        byte b64 = bArr3[c6];
        if ((b17 | b40 | b61 | b64) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b17 << 2) | (b40 >> 4));
        outputStream.write((b40 << 4) | (b61 >> 2));
        outputStream.write((b61 << 6) | b64);
        return 3;
    }

    private boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    private int nextI(String str, int i, int i2) {
        while (i < i2 && ignore(str.charAt(i))) {
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i2 = 0;
        while (i > 0 && i2 != 4) {
            if (!ignore(str.charAt(i - 1))) {
                i2++;
            }
            i--;
        }
        int iNextI = nextI(str, 0, i);
        int i3 = 0;
        int i5 = 0;
        while (iNextI < i) {
            int i6 = iNextI + 1;
            byte b4 = this.decodingTable[str.charAt(iNextI)];
            int iNextI2 = nextI(str, i6, i);
            int i21 = iNextI2 + 1;
            byte b5 = this.decodingTable[str.charAt(iNextI2)];
            int iNextI3 = nextI(str, i21, i);
            int i22 = iNextI3 + 1;
            byte b7 = this.decodingTable[str.charAt(iNextI3)];
            int iNextI4 = nextI(str, i22, i);
            int i32 = iNextI4 + 1;
            byte b13 = this.decodingTable[str.charAt(iNextI4)];
            if ((b4 | b5 | b7 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i3] = (byte) ((b4 << 2) | (b5 >> 4));
            int i33 = i3 + 2;
            bArr[i3 + 1] = (byte) ((b5 << 4) | (b7 >> 2));
            i3 += 3;
            bArr[i33] = (byte) ((b7 << 6) | b13);
            i5 += 3;
            if (i3 == 54) {
                outputStream.write(bArr);
                i3 = 0;
            }
            iNextI = nextI(str, i32, i);
        }
        if (i3 > 0) {
            outputStream.write(bArr, 0, i3);
        }
        int iNextI5 = nextI(str, iNextI, length);
        int iNextI6 = nextI(str, iNextI5 + 1, length);
        int iNextI7 = nextI(str, iNextI6 + 1, length);
        return i5 + decodeLastBlock(outputStream, str.charAt(iNextI5), str.charAt(iNextI6), str.charAt(iNextI7), str.charAt(nextI(str, iNextI7 + 1, length)));
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i3 = i;
        int i5 = i2;
        while (i5 > 0) {
            int iMin = Math.min(54, i5);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i3, iMin, bArr2, 0));
            i3 += iMin;
            i5 -= iMin;
            bArr = bArr3;
        }
        return ((i2 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return ((i + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return (i / 4) * 3;
    }

    public void initialiseDecodingTable() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i >= bArr2.length) {
                return;
            }
            this.decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    private int nextI(byte[] bArr, int i, int i2) {
        while (i < i2 && ignore((char) bArr[i])) {
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[54];
        int i3 = i + i2;
        while (i3 > i && ignore((char) bArr[i3 - 1])) {
            i3--;
        }
        if (i3 == 0) {
            return 0;
        }
        int i5 = i3;
        int i6 = 0;
        while (i5 > i && i6 != 4) {
            if (!ignore((char) bArr[i5 - 1])) {
                i6++;
            }
            i5--;
        }
        int iNextI = nextI(bArr, i, i5);
        int i21 = 0;
        int i22 = 0;
        while (iNextI < i5) {
            int i32 = iNextI + 1;
            byte b4 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, i32, i5);
            int i33 = iNextI2 + 1;
            byte b5 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, i33, i5);
            int i43 = iNextI3 + 1;
            byte b7 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, i43, i5);
            int i59 = iNextI4 + 1;
            byte b13 = this.decodingTable[bArr[iNextI4]];
            if ((b4 | b5 | b7 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr2[i21] = (byte) ((b4 << 2) | (b5 >> 4));
            int i66 = i21 + 2;
            bArr2[i21 + 1] = (byte) ((b5 << 4) | (b7 >> 2));
            i21 += 3;
            bArr2[i66] = (byte) ((b7 << 6) | b13);
            if (i21 == 54) {
                outputStream.write(bArr2);
                i21 = 0;
            }
            i22 += 3;
            iNextI = nextI(bArr, i59, i5);
        }
        if (i21 > 0) {
            outputStream.write(bArr2, 0, i21);
        }
        int iNextI5 = nextI(bArr, iNextI, i3);
        int iNextI6 = nextI(bArr, iNextI5 + 1, i3);
        int iNextI7 = nextI(bArr, iNextI6 + 1, i3);
        return i22 + decodeLastBlock(outputStream, (char) bArr[iNextI5], (char) bArr[iNextI6], (char) bArr[iNextI7], (char) bArr[nextI(bArr, iNextI7 + 1, i3)]);
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i5 = (i + i2) - 2;
        int i6 = i;
        int i21 = i3;
        while (i6 < i5) {
            byte b4 = bArr[i6];
            int i22 = i6 + 2;
            int i32 = bArr[i6 + 1] & UnsignedBytes.MAX_VALUE;
            i6 += 3;
            byte b5 = bArr[i22];
            int i33 = b5 & UnsignedBytes.MAX_VALUE;
            byte[] bArr3 = this.encodingTable;
            bArr2[i21] = bArr3[(b4 >>> 2) & 63];
            bArr2[i21 + 1] = bArr3[((b4 << 4) | (i32 >>> 4)) & 63];
            int i43 = i21 + 3;
            bArr2[i21 + 2] = bArr3[((i32 << 2) | (i33 >>> 6)) & 63];
            i21 += 4;
            bArr2[i43] = bArr3[b5 & 63];
        }
        int i59 = i2 - (i6 - i);
        if (i59 == 1) {
            int i66 = bArr[i6] & UnsignedBytes.MAX_VALUE;
            byte[] bArr4 = this.encodingTable;
            bArr2[i21] = bArr4[(i66 >>> 2) & 63];
            bArr2[i21 + 1] = bArr4[(i66 << 4) & 63];
            int i74 = i21 + 3;
            byte b7 = this.padding;
            bArr2[i21 + 2] = b7;
            i21 += 4;
            bArr2[i74] = b7;
        } else if (i59 == 2) {
            int i92 = bArr[i6] & UnsignedBytes.MAX_VALUE;
            int i96 = bArr[i6 + 1] & UnsignedBytes.MAX_VALUE;
            byte[] bArr5 = this.encodingTable;
            bArr2[i21] = bArr5[(i92 >>> 2) & 63];
            bArr2[i21 + 1] = bArr5[((i92 << 4) | (i96 >>> 4)) & 63];
            int i99 = i21 + 3;
            bArr2[i21 + 2] = bArr5[(i96 << 2) & 63];
            i21 += 4;
            bArr2[i99] = this.padding;
        }
        return i21 - i3;
    }
}
