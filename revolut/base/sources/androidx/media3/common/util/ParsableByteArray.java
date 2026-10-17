package androidx.media3.common.util;

import a0.d;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.primitives.UnsignedInts;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final ImmutableSet<Charset> SUPPORTED_CHARSETS_FOR_READLINE = ImmutableSet.of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean shouldEnforceLimitOnLegacyMethods = new AtomicBoolean();
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private static int decodeUtf8CodeUnit(int i, int i2, int i3, int i5) {
        byte b4 = (byte) i3;
        return Ints.fromBytes((byte) 0, UnsignedBytes.checkedCast(((i & 7) << 2) | ((i2 & 48) >> 4)), UnsignedBytes.checkedCast(((((byte) i2) & 15) << 4) | ((b4 & 60) >> 2)), UnsignedBytes.checkedCast(((b4 & 3) << 6) | (((byte) i5) & 63)));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int findNextLineTerminator(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L40
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L40
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L3e
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L3e:
            r0 = 2
            goto L41
        L40:
            r0 = 1
        L41:
            int r1 = r4.position
        L43:
            int r2 = r4.limit
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La2
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5b
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L66
        L5b:
            byte[] r2 = r4.data
            r2 = r2[r1]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L66
            goto L9f
        L66:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L76
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L87
        L76:
            byte[] r2 = r4.data
            r3 = r2[r1]
            if (r3 != 0) goto L87
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L87
            goto L9f
        L87:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La0
            byte[] r2 = r4.data
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La0
            r2 = r2[r1]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto La0
        L9f:
            return r1
        La0:
            int r1 = r1 + r0
            goto L43
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.ParsableByteArray.findNextLineTerminator(java.nio.charset.Charset):int");
    }

    private static int getSmallestCodeUnitSize(Charset charset) {
        Preconditions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean isUtf8ContinuationByte(byte b4) {
        return (b4 & ISO7816.INS_GET_RESPONSE) == 128;
    }

    private void maybeAssertAtLeastBytesLeftForLegacyMethod(int i) {
        if (!shouldEnforceLimitOnLegacyMethods.get() || bytesLeft() >= i) {
            return;
        }
        StringBuilder sbW = d.w(i, "bytesNeeded= ", ", bytesLeft=");
        sbW.append(bytesLeft());
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    private int peekCodePointAndSize(Charset charset) {
        int codePoint;
        int iDecodeUtf8CodeUnit;
        Preconditions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() < getSmallestCodeUnitSize(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
        }
        byte b4 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b5 = this.data[this.position];
            if ((b5 & 128) != 0) {
                return 0;
            }
            codePoint = UnsignedBytes.toInt(b5);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bPeekUtf8CodeUnitSize = peekUtf8CodeUnitSize();
            if (bPeekUtf8CodeUnitSize == 1) {
                iDecodeUtf8CodeUnit = UnsignedBytes.toInt(this.data[this.position]);
            } else if (bPeekUtf8CodeUnitSize == 2) {
                byte[] bArr = this.data;
                int i = this.position;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(0, 0, bArr[i], bArr[i + 1]);
            } else if (bPeekUtf8CodeUnitSize == 3) {
                byte[] bArr2 = this.data;
                int i2 = this.position;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(0, bArr2[i2] & 15, bArr2[i2 + 1], bArr2[i2 + 2]);
            } else {
                if (bPeekUtf8CodeUnitSize != 4) {
                    return 0;
                }
                byte[] bArr3 = this.data;
                int i3 = this.position;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(bArr3[i3], bArr3[i3 + 1], bArr3[i3 + 2], bArr3[i3 + 3]);
            }
            b4 = bPeekUtf8CodeUnitSize;
            codePoint = iDecodeUtf8CodeUnit;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cPeekChar = peekChar(byteOrder, 0);
            if (!Character.isHighSurrogate(cPeekChar) || bytesLeft() < 4) {
                codePoint = cPeekChar;
                b4 = 2;
            } else {
                codePoint = Character.toCodePoint(cPeekChar, peekChar(byteOrder, 2));
                b4 = 4;
            }
        }
        return (codePoint << 8) | b4;
    }

    private byte peekUtf8CodeUnitSize() {
        byte b4 = this.data[this.position];
        if ((b4 & 128) == 0) {
            return (byte) 1;
        }
        if ((b4 & ISO7816.INS_CREATE_FILE) == 192 && bytesLeft() >= 2 && isUtf8ContinuationByte(this.data[this.position + 1])) {
            return (byte) 2;
        }
        if ((this.data[this.position] & 240) == 224 && bytesLeft() >= 3 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2])) {
            return (byte) 3;
        }
        return ((this.data[this.position] & 248) == 240 && bytesLeft() >= 4 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2]) && isUtf8ContinuationByte(this.data[this.position + 3])) ? (byte) 4 : (byte) 0;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCodePointAndSize;
        if (bytesLeft() < getSmallestCodeUnitSize(charset) || (iPeekCodePointAndSize = peekCodePointAndSize(charset)) == 0) {
            return (char) 0;
        }
        int iCheckedCast = UnsignedInts.checkedCast(iPeekCodePointAndSize >>> 8);
        if (Character.isSupplementaryCodePoint(iCheckedCast)) {
            return (char) 0;
        }
        char cCheckedCast = Chars.checkedCast(iCheckedCast);
        if (!Chars.contains(cArr, cCheckedCast)) {
            return (char) 0;
        }
        this.position = Ints.checkedCast(iPeekCodePointAndSize & 255) + this.position;
        return cCheckedCast;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return Math.max(this.limit - this.position, 0);
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = Arrays.copyOf(this.data, i);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        return peekChar(ByteOrder.BIG_ENDIAN, 0);
    }

    public int peekCodePoint(Charset charset) {
        if (peekCodePointAndSize(charset) != 0) {
            return Ints.checkedCast(r3 >>> 8);
        }
        return 1114112;
    }

    public int peekInt() {
        if (bytesLeft() >= 4) {
            int i = readInt();
            this.position -= 4;
            return i;
        }
        throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
    }

    public int peekUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        return this.data[this.position] & UnsignedBytes.MAX_VALUE;
    }

    public int peekUnsignedInt24() {
        if (bytesLeft() >= 3) {
            int unsignedInt24 = readUnsignedInt24();
            this.position -= 3;
            return unsignedInt24;
        }
        throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public String readDelimiterTerminatedString(char c2) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c2) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 24;
        int i5 = i + 2;
        this.position = i5;
        int i6 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 16) | i3;
        int i21 = i + 3;
        this.position = i21;
        int i22 = i6 | ((bArr[i5] & UnsignedBytes.MAX_VALUE) << 8);
        this.position = i + 4;
        return (bArr[i21] & UnsignedBytes.MAX_VALUE) | i22;
    }

    public int readInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) >> 8;
        int i5 = i + 2;
        this.position = i5;
        int i6 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
        this.position = i + 3;
        return (bArr[i5] & UnsignedBytes.MAX_VALUE) | i6;
    }

    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    public int readLittleEndianInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        int i5 = i + 2;
        this.position = i5;
        int i6 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
        int i21 = i + 3;
        this.position = i21;
        int i22 = i6 | ((bArr[i5] & UnsignedBytes.MAX_VALUE) << 16);
        this.position = i + 4;
        return ((bArr[i21] & UnsignedBytes.MAX_VALUE) << 24) | i22;
    }

    public long readLittleEndianLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j2 = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.position = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 8);
        int i5 = i + 3;
        this.position = i5;
        long j5 = j3 | ((((long) bArr[i3]) & 255) << 16);
        int i6 = i + 4;
        this.position = i6;
        long j16 = j5 | ((((long) bArr[i5]) & 255) << 24);
        int i21 = i + 5;
        this.position = i21;
        long j22 = j16 | ((((long) bArr[i6]) & 255) << 32);
        int i22 = i + 6;
        this.position = i22;
        long j42 = j22 | ((((long) bArr[i21]) & 255) << 40);
        int i32 = i + 7;
        this.position = i32;
        long j46 = j42 | ((((long) bArr[i22]) & 255) << 48);
        this.position = i + 8;
        return ((((long) bArr[i32]) & 255) << 56) | j46;
    }

    public short readLittleEndianShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        this.position = i + 2;
        return (short) (((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3);
    }

    public long readLittleEndianUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j2 = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.position = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 8);
        int i5 = i + 3;
        this.position = i5;
        long j5 = j3 | ((((long) bArr[i3]) & 255) << 16);
        this.position = i + 4;
        return ((((long) bArr[i5]) & 255) << 24) | j5;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException(d.n("Top bit not zero: ", littleEndianInt));
    }

    public int readLittleEndianUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        this.position = i + 2;
        return ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
    }

    public long readLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j2 = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.position = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 48);
        int i5 = i + 3;
        this.position = i5;
        long j5 = j3 | ((((long) bArr[i3]) & 255) << 40);
        int i6 = i + 4;
        this.position = i6;
        long j16 = j5 | ((((long) bArr[i5]) & 255) << 32);
        int i21 = i + 5;
        this.position = i21;
        long j22 = j16 | ((((long) bArr[i6]) & 255) << 24);
        int i22 = i + 6;
        this.position = i22;
        long j42 = j22 | ((((long) bArr[i21]) & 255) << 16);
        int i32 = i + 7;
        this.position = i32;
        long j46 = j42 | ((((long) bArr[i22]) & 255) << 8);
        this.position = i + 8;
        return (((long) bArr[i32]) & 255) | j46;
    }

    public String readNullTerminatedString(int i) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        this.position = i + 2;
        return (short) ((bArr[i2] & UnsignedBytes.MAX_VALUE) | i3);
    }

    public String readString(int i) {
        return readString(i, StandardCharsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    public int readUnsignedFixedPoint1616() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        this.position = i + 2;
        int i5 = (bArr[i2] & UnsignedBytes.MAX_VALUE) | i3;
        this.position = i + 4;
        return i5;
    }

    public long readUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j2 = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.position = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 16);
        int i5 = i + 3;
        this.position = i5;
        long j5 = j3 | ((((long) bArr[i3]) & 255) << 8);
        this.position = i + 4;
        return (((long) bArr[i5]) & 255) | j5;
    }

    public int readUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 16;
        int i5 = i + 2;
        this.position = i5;
        int i6 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
        this.position = i + 3;
        return (bArr[i5] & UnsignedBytes.MAX_VALUE) | i6;
    }

    public int readUnsignedIntToInt() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(d.n("Top bit not zero: ", i));
    }

    public int readUnsignedLeb128ToInt() {
        return Ints.checkedCast(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLeb128ToLong() {
        long j2 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.position == this.limit) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long unsignedByte = readUnsignedByte();
            j2 |= (127 & unsignedByte) << (i * 7);
            if ((unsignedByte & 128) == 0) {
                return j2;
            }
        }
        return j2;
    }

    public long readUnsignedLongToLong() {
        long j2 = readLong();
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalStateException(p.a.m(j2, "Top bit not zero: "));
    }

    public int readUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        this.position = i + 2;
        return (bArr[i2] & UnsignedBytes.MAX_VALUE) | i3;
    }

    public long readUtf8EncodedLong() {
        int i;
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        long j2 = this.data[this.position];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int i3 = 1 << i2;
            if ((((long) i3) & j2) != 0) {
                i2--;
            } else if (i2 < 6) {
                j2 &= (long) (i3 - 1);
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(p.a.m(j2, "Invalid UTF-8 sequence first byte: "));
        }
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        for (int i5 = 1; i5 < i; i5++) {
            byte b4 = this.data[this.position + i5];
            if ((b4 & ISO7816.INS_GET_RESPONSE) != 128) {
                throw new NumberFormatException(p.a.m(j2, "Invalid UTF-8 sequence continuation byte: "));
            }
            j2 = (j2 << 6) | ((long) (b4 & 63));
        }
        this.position += i;
        return j2;
    }

    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i2 = this.position;
        byte b4 = bArr2[i2];
        if (b4 == -2 && bArr2[i2 + 1] == -1) {
            this.position = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b4 != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.position = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void setLimit(int i) {
        Preconditions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public void setPosition(int i) {
        Preconditions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public void skipLeb128() {
        while ((readUnsignedByte() & 128) != 0) {
        }
    }

    private char peekChar(ByteOrder byteOrder, int i) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.data;
            int i2 = this.position;
            return Chars.fromBytes(bArr[i2 + i], bArr[i2 + i + 1]);
        }
        byte[] bArr2 = this.data;
        int i3 = this.position;
        return Chars.fromBytes(bArr2[i3 + i + 1], bArr2[i3 + i]);
    }

    public String readLine(Charset charset) {
        Preconditions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public String readString(int i, Charset charset) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i);
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i2);
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }
}
