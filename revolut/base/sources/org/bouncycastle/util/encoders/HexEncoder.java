package org.bouncycastle.util.encoders;

import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.io.IOException;
import java.io.OutputStream;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes14.dex */
public class HexEncoder implements Encoder {
    protected final byte[] encodingTable = {ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    private static boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length && ignore(str.charAt(i))) {
                i++;
            }
            int i5 = i + 1;
            byte b4 = this.decodingTable[str.charAt(i)];
            while (i5 < length && ignore(str.charAt(i5))) {
                i5++;
            }
            int i6 = i5 + 1;
            byte b5 = this.decodingTable[str.charAt(i5)];
            if ((b4 | b5) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i21 = i2 + 1;
            bArr[i2] = (byte) ((b4 << 4) | b5);
            if (i21 == 36) {
                outputStream.write(bArr);
                i2 = 0;
            } else {
                i2 = i21;
            }
            i3++;
            i = i6;
        }
        if (i2 > 0) {
            outputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    public byte[] decodeStrict(String str, int i, int i2) throws IOException {
        if (str == null) {
            throw new NullPointerException("'str' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i2 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i + 1;
            byte b4 = this.decodingTable[str.charAt(i)];
            i += 2;
            int i21 = (b4 << 4) | this.decodingTable[str.charAt(i6)];
            if (i21 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i5] = (byte) i21;
        }
        return bArr;
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
            int iMin = Math.min(36, i5);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i3, iMin, bArr2, 0));
            i3 += iMin;
            i5 -= iMin;
            bArr = bArr3;
        }
        return i2 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return i * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return i / 2;
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
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[36];
        int i3 = i2 + i;
        while (i3 > i && ignore((char) bArr[i3 - 1])) {
            i3--;
        }
        int i5 = 0;
        int i6 = 0;
        while (i < i3) {
            while (i < i3 && ignore((char) bArr[i])) {
                i++;
            }
            int i21 = i + 1;
            byte b4 = this.decodingTable[bArr[i]];
            while (i21 < i3 && ignore((char) bArr[i21])) {
                i21++;
            }
            int i22 = i21 + 1;
            byte b5 = this.decodingTable[bArr[i21]];
            if ((b4 | b5) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            int i32 = i5 + 1;
            bArr2[i5] = (byte) ((b4 << 4) | b5);
            if (i32 == 36) {
                outputStream.write(bArr2);
                i5 = 0;
            } else {
                i5 = i32;
            }
            i6++;
            i = i22;
        }
        if (i5 > 0) {
            outputStream.write(bArr2, 0, i5);
        }
        return i6;
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i5 = i2 + i;
        int i6 = i3;
        while (i < i5) {
            int i21 = i + 1;
            byte b4 = bArr[i];
            int i22 = b4 & UnsignedBytes.MAX_VALUE;
            int i32 = i6 + 1;
            byte[] bArr3 = this.encodingTable;
            bArr2[i6] = bArr3[i22 >>> 4];
            i6 += 2;
            bArr2[i32] = bArr3[b4 & 15];
            i = i21;
        }
        return i6 - i3;
    }
}
