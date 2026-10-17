package org.bouncycastle.util.encoders;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.OutputStream;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes14.dex */
public class Base32Encoder implements Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55};
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable;
    private final byte[] encodingTable;
    private final byte padding;

    public Base32Encoder() {
        this.decodingTable = new byte[128];
        this.encodingTable = DEAULT_ENCODING_TABLE;
        this.padding = DEFAULT_PADDING;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c2, char c3, char c5, char c6, char c7, char c16, char c26, char c28) throws IOException {
        char c29 = this.padding;
        if (c28 != c29) {
            byte[] bArr = this.decodingTable;
            byte b4 = bArr[c2];
            byte b5 = bArr[c3];
            byte b7 = bArr[c5];
            byte b13 = bArr[c6];
            byte b15 = bArr[c7];
            byte b17 = bArr[c16];
            byte b40 = bArr[c26];
            byte b61 = bArr[c28];
            if ((b4 | b5 | b7 | b13 | b15 | b17 | b40 | b61) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b4 << 3) | (b5 >> 2));
            outputStream.write((b5 << 6) | (b7 << 1) | (b13 >> 4));
            outputStream.write((b13 << 4) | (b15 >> 1));
            outputStream.write((b15 << 7) | (b17 << 2) | (b40 >> 3));
            outputStream.write((b40 << 5) | b61);
            return 5;
        }
        if (c26 != c29) {
            byte[] bArr2 = this.decodingTable;
            byte b64 = bArr2[c2];
            byte b69 = bArr2[c3];
            byte b76 = bArr2[c5];
            byte b86 = bArr2[c6];
            byte b91 = bArr2[c7];
            byte b98 = bArr2[c16];
            byte b100 = bArr2[c26];
            if ((b64 | b69 | b76 | b86 | b91 | b98 | b100) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b64 << 3) | (b69 >> 2));
            outputStream.write((b69 << 6) | (b76 << 1) | (b86 >> 4));
            outputStream.write((b86 << 4) | (b91 >> 1));
            outputStream.write((b91 << 7) | (b98 << 2) | (b100 >> 3));
            return 4;
        }
        if (c16 != c29) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        if (c7 != c29) {
            byte[] bArr3 = this.decodingTable;
            byte b101 = bArr3[c2];
            byte b102 = bArr3[c3];
            byte b103 = bArr3[c5];
            byte b104 = bArr3[c6];
            byte b105 = bArr3[c7];
            if ((b101 | b102 | b103 | b104 | b105) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b101 << 3) | (b102 >> 2));
            outputStream.write((b102 << 6) | (b103 << 1) | (b104 >> 4));
            outputStream.write((b104 << 4) | (b105 >> 1));
            return 3;
        }
        if (c6 == c29) {
            if (c5 != c29) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            byte[] bArr4 = this.decodingTable;
            byte b106 = bArr4[c2];
            byte b107 = bArr4[c3];
            if ((b106 | b107) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b106 << 3) | (b107 >> 2));
            return 1;
        }
        byte[] bArr5 = this.decodingTable;
        byte b108 = bArr5[c2];
        byte b109 = bArr5[c3];
        byte b110 = bArr5[c5];
        byte b111 = bArr5[c6];
        if ((b108 | b109 | b110 | b111) < 0) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        outputStream.write((b108 << 3) | (b109 >> 2));
        outputStream.write((b109 << 6) | (b110 << 1) | (b111 >> 4));
        return 2;
    }

    private void encodeBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte b4 = bArr[i];
        int i3 = bArr[i + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i + 2] & UnsignedBytes.MAX_VALUE;
        int i6 = bArr[i + 3] & UnsignedBytes.MAX_VALUE;
        byte b5 = bArr[i + 4];
        int i21 = b5 & UnsignedBytes.MAX_VALUE;
        byte[] bArr3 = this.encodingTable;
        bArr2[i2] = bArr3[(b4 >>> 3) & 31];
        bArr2[i2 + 1] = bArr3[((b4 << 2) | (i3 >>> 6)) & 31];
        bArr2[i2 + 2] = bArr3[(i3 >>> 1) & 31];
        bArr2[i2 + 3] = bArr3[((i3 << 4) | (i5 >>> 4)) & 31];
        bArr2[i2 + 4] = bArr3[((i5 << 1) | (i6 >>> 7)) & 31];
        bArr2[i2 + 5] = bArr3[(i6 >>> 2) & 31];
        bArr2[i2 + 6] = bArr3[((i21 >>> 5) | (i6 << 3)) & 31];
        bArr2[i2 + 7] = bArr3[b5 & Ascii.US];
    }

    private boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    private int nextI(byte[] bArr, int i, int i2) {
        while (i < i2 && ignore((char) bArr[i])) {
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] byteArray = Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
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
            int iMin = Math.min(45, i5);
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
        return ((i + 4) / 5) * 8;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return (i / 8) * 5;
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

    public Base32Encoder(byte[] bArr, byte b4) {
        this.decodingTable = new byte[128];
        if (bArr.length != 32) {
            throw new IllegalArgumentException("encoding table needs to be length 32");
        }
        this.encodingTable = Arrays.clone(bArr);
        this.padding = b4;
        initialiseDecodingTable();
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[55];
        int i3 = i + i2;
        while (i3 > i && ignore((char) bArr[i3 - 1])) {
            i3--;
        }
        if (i3 == 0) {
            return 0;
        }
        int i5 = i3;
        int i6 = 0;
        while (i5 > i && i6 != 8) {
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
            int iNextI5 = nextI(bArr, i59, i5);
            int i66 = iNextI5 + 1;
            byte b15 = this.decodingTable[bArr[iNextI5]];
            int iNextI6 = nextI(bArr, i66, i5);
            int i74 = iNextI6 + 1;
            byte b17 = this.decodingTable[bArr[iNextI6]];
            int iNextI7 = nextI(bArr, i74, i5);
            int i92 = iNextI7 + 1;
            byte b40 = this.decodingTable[bArr[iNextI7]];
            int iNextI8 = nextI(bArr, i92, i5);
            int i96 = iNextI8 + 1;
            byte b61 = this.decodingTable[bArr[iNextI8]];
            if ((b4 | b5 | b7 | b13 | b15 | b17 | b40 | b61) < 0) {
                throw new IOException("invalid characters encountered in base32 data");
            }
            bArr2[i21] = (byte) ((b4 << 3) | (b5 >> 2));
            bArr2[i21 + 1] = (byte) ((b5 << 6) | (b7 << 1) | (b13 >> 4));
            bArr2[i21 + 2] = (byte) ((b13 << 4) | (b15 >> 1));
            int i99 = i21 + 4;
            bArr2[i21 + 3] = (byte) ((b17 << 2) | (b15 << 7) | (b40 >> 3));
            i21 += 5;
            bArr2[i99] = (byte) ((b40 << 5) | b61);
            if (i21 == 55) {
                outputStream.write(bArr2);
                i21 = 0;
            }
            i22 += 5;
            iNextI = nextI(bArr, i96, i5);
        }
        if (i21 > 0) {
            outputStream.write(bArr2, 0, i21);
        }
        int iNextI9 = nextI(bArr, iNextI, i3);
        int iNextI10 = nextI(bArr, iNextI9 + 1, i3);
        int iNextI11 = nextI(bArr, iNextI10 + 1, i3);
        int iNextI12 = nextI(bArr, iNextI11 + 1, i3);
        int iNextI13 = nextI(bArr, iNextI12 + 1, i3);
        int iNextI14 = nextI(bArr, iNextI13 + 1, i3);
        int iNextI15 = nextI(bArr, iNextI14 + 1, i3);
        return i22 + decodeLastBlock(outputStream, (char) bArr[iNextI9], (char) bArr[iNextI10], (char) bArr[iNextI11], (char) bArr[iNextI12], (char) bArr[iNextI13], (char) bArr[iNextI14], (char) bArr[iNextI15], (char) bArr[nextI(bArr, iNextI15 + 1, i3)]);
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i5 = (i + i2) - 4;
        int i6 = i;
        int i21 = i3;
        while (i6 < i5) {
            encodeBlock(bArr, i6, bArr2, i21);
            i6 += 5;
            i21 += 8;
        }
        int i22 = i2 - (i6 - i);
        if (i22 > 0) {
            byte[] bArr3 = new byte[5];
            System.arraycopy(bArr, i6, bArr3, 0, i22);
            encodeBlock(bArr3, 0, bArr2, i21);
            if (i22 == 1) {
                byte b4 = this.padding;
                bArr2[i21 + 2] = b4;
                bArr2[i21 + 3] = b4;
                bArr2[i21 + 4] = b4;
                bArr2[i21 + 5] = b4;
                bArr2[i21 + 6] = b4;
                bArr2[i21 + 7] = b4;
            } else if (i22 == 2) {
                byte b5 = this.padding;
                bArr2[i21 + 4] = b5;
                bArr2[i21 + 5] = b5;
                bArr2[i21 + 6] = b5;
                bArr2[i21 + 7] = b5;
            } else if (i22 == 3) {
                byte b7 = this.padding;
                bArr2[i21 + 5] = b7;
                bArr2[i21 + 6] = b7;
                bArr2[i21 + 7] = b7;
            } else if (i22 == 4) {
                bArr2[i21 + 7] = this.padding;
            }
            i21 += 8;
        }
        return i21 - i3;
    }
}
