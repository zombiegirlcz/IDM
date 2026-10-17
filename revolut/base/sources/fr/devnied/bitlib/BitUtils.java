package fr.devnied.bitlib;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class BitUtils {
    public static final int BYTE_SIZE = 8;
    public static final float BYTE_SIZE_F = 8.0f;
    private static final int DEFAULT_VALUE = 255;
    private final byte[] byteTab;
    private int currentBitIndex;
    private final int size;
    public static final String DATE_FORMAT = "yyyyMMdd";
    private static final Logger LOGGER = LoggerFactory.getLogger(BitUtils.class.getName());
    private static final Charset DEFAULT_CHARSET = Charset.forName("ASCII");

    public BitUtils(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        this.byteTab = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.size = bArr.length * 8;
    }

    public void addCurrentBitIndex(int i) {
        int i2 = this.currentBitIndex + i;
        this.currentBitIndex = i2;
        if (i2 < 0) {
            this.currentBitIndex = 0;
        }
    }

    public void clear() {
        Arrays.fill(this.byteTab, (byte) 0);
        reset();
    }

    public int getCurrentBitIndex() {
        return this.currentBitIndex;
    }

    public byte[] getData() {
        byte[] bArr = this.byteTab;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public byte getMask(int i, int i2) {
        byte b4 = (byte) ((((byte) ((-1) << i)) & UnsignedBytes.MAX_VALUE) >> i);
        int i3 = 8 - (i2 + i);
        return i3 > 0 ? (byte) (((byte) (b4 >> i3)) << i3) : b4;
    }

    public boolean getNextBoolean() {
        return getNextInteger(1) == 1;
    }

    public byte[] getNextByte(int i) {
        return getNextByte(i, true);
    }

    public Date getNextDate(int i, String str) {
        return getNextDate(i, str, false);
    }

    public String getNextHexaString(int i) {
        return BytesUtils.bytesToStringNoSpace(getNextByte(i, true));
    }

    public int getNextInteger(int i) {
        return (int) getNextLong(i);
    }

    public int getNextIntegerSigned(int i) {
        if (i <= 32) {
            return (int) getNextLongSigned(i);
        }
        throw new IllegalArgumentException("Integer overflow with length > 32");
    }

    public long getNextLong(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        int i2 = this.currentBitIndex + i;
        long jMin = 0;
        while (true) {
            int i3 = this.currentBitIndex;
            if (i3 >= i2) {
                byteBufferAllocate.putLong(jMin);
                byteBufferAllocate.rewind();
                return byteBufferAllocate.getLong();
            }
            int i5 = i3 % 8;
            jMin = (jMin << Math.min(i, 8)) | (((((long) ((this.byteTab[i3 / 8] & getMask(i5, i)) & 255)) & 255) >>> Math.max(8 - (i5 + i), 0)) & 255);
            int i6 = 8 - i5;
            i -= i6;
            this.currentBitIndex = Math.min(this.currentBitIndex + i6, i2);
        }
    }

    public long getNextLongSigned(int i) {
        if (i > 64) {
            throw new IllegalArgumentException("Long overflow with length > 64");
        }
        long nextLong = getNextLong(i);
        long j2 = 1 << (i - 1);
        return (nextLong & j2) != 0 ? -(j2 - (nextLong ^ j2)) : nextLong;
    }

    public String getNextString(int i) {
        return getNextString(i, DEFAULT_CHARSET);
    }

    public int getSize() {
        return this.size;
    }

    public void reset() {
        setCurrentBitIndex(0);
    }

    public void resetNextBits(int i) {
        int i2 = this.currentBitIndex + i;
        while (true) {
            int i3 = this.currentBitIndex;
            if (i3 >= i2) {
                return;
            }
            int i5 = i3 % 8;
            int iMin = Math.min(i2 - i3, 8 - i5);
            byte[] bArr = this.byteTab;
            int i6 = this.currentBitIndex / 8;
            bArr[i6] = (byte) ((~getMask(i5, iMin)) & bArr[i6]);
            this.currentBitIndex += iMin;
        }
    }

    public void setCurrentBitIndex(int i) {
        this.currentBitIndex = i;
    }

    public void setNextBoolean(boolean z) {
        if (z) {
            setNextInteger(1, 1);
        } else {
            setNextInteger(0, 1);
        }
    }

    public void setNextByte(byte[] bArr, int i) {
        setNextByte(bArr, i, true);
    }

    public void setNextDate(Date date, String str) {
        setNextDate(date, str, false);
    }

    public void setNextHexaString(String str, int i) {
        setNextByte(BytesUtils.fromString(str), i);
    }

    public void setNextInteger(int i, int i2) {
        if (i2 > 32) {
            throw new IllegalArgumentException("Integer overflow with length > 32");
        }
        setNextValue(i, i2, 31);
    }

    public void setNextLong(long j2, int i) {
        if (i > 64) {
            throw new IllegalArgumentException("Long overflow with length > 64");
        }
        setNextValue(j2, i, 63);
    }

    public void setNextString(String str, int i) {
        setNextString(str, i, true);
    }

    public void setNextValue(long j2, int i, int i2) {
        long j3;
        long jPow = (long) Math.pow(2.0d, Math.min(i, i2));
        if (j2 > jPow) {
            j2 = jPow - 1;
        }
        int i3 = i;
        while (i3 > 0) {
            int i5 = this.currentBitIndex % 8;
            if ((i5 != 0 || i3 > 8) && i >= 8 - i5) {
                long length = Long.toBinaryString(j2).length();
                j3 = j2 >> ((int) ((((long) i3) - length) - ((8 - length) - ((long) i5))));
            } else {
                j3 = j2 << (8 - (i3 + i5));
            }
            byte b4 = (byte) j3;
            byte[] bArr = this.byteTab;
            int i6 = this.currentBitIndex / 8;
            bArr[i6] = (byte) (bArr[i6] | b4);
            long jMin = Math.min(i3, 8 - i5);
            i3 = (int) (((long) i3) - jMin);
            this.currentBitIndex = (int) (((long) this.currentBitIndex) + jMin);
        }
    }

    public byte[] getNextByte(int i, boolean z) {
        int iCeil = (int) Math.ceil(i / 8.0f);
        byte[] bArr = new byte[iCeil];
        int i2 = this.currentBitIndex;
        int i3 = 0;
        if (i2 % 8 == 0) {
            System.arraycopy(this.byteTab, i2 / 8, bArr, 0, iCeil);
            int i5 = i % 8;
            if (i5 == 0) {
                i5 = 8;
            }
            int i6 = iCeil - 1;
            bArr[i6] = (byte) (getMask(this.currentBitIndex % 8, i5) & bArr[i6]);
            this.currentBitIndex += i;
            return bArr;
        }
        int i21 = i2 + i;
        while (true) {
            int i22 = this.currentBitIndex;
            if (i22 >= i21) {
                break;
            }
            int i32 = i22 % 8;
            int i33 = i3 % 8;
            int iMin = Math.min(i21 - i22, Math.min(8 - i32, 8 - i33));
            byte mask = (byte) (this.byteTab[this.currentBitIndex / 8] & getMask(i32, iMin));
            if (z || i % 8 == 0) {
                mask = (byte) (i32 != 0 ? mask << Math.min(i32, 8 - iMin) : (mask & UnsignedBytes.MAX_VALUE) >> i33);
            }
            int i43 = i3 / 8;
            bArr[i43] = (byte) (bArr[i43] | mask);
            this.currentBitIndex += iMin;
            i3 += iMin;
        }
        if (!z && i % 8 != 0) {
            int i59 = iCeil - 1;
            bArr[i59] = (byte) (getMask(((i21 - i) - 1) % 8, 8) & bArr[i59]);
        }
        return bArr;
    }

    public Date getNextDate(int i, String str, boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        String nextHexaString = z ? getNextHexaString(i) : getNextString(i);
        try {
            return simpleDateFormat.parse(nextHexaString);
        } catch (ParseException e) {
            LOGGER.error(d.s("Parsing date error. date:", nextHexaString, " pattern:", str), (Throwable) e);
            return null;
        }
    }

    public String getNextString(int i, Charset charset) {
        return new String(getNextByte(i, true), charset);
    }

    public void setNextByte(byte[] bArr, int i, boolean z) {
        int iCeil = (int) Math.ceil(i / 8.0f);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iCeil);
        int i2 = 0;
        int iMax = Math.max(iCeil - bArr.length, 0);
        if (z) {
            for (int i3 = 0; i3 < iMax; i3++) {
                byteBufferAllocate.put((byte) 0);
            }
        }
        byteBufferAllocate.put(bArr, 0, Math.min(iCeil, bArr.length));
        if (!z) {
            for (int i5 = 0; i5 < iMax; i5++) {
                byteBufferAllocate.put((byte) 0);
            }
        }
        byte[] bArrArray = byteBufferAllocate.array();
        int i6 = this.currentBitIndex;
        if (i6 % 8 == 0) {
            System.arraycopy(bArrArray, 0, this.byteTab, i6 / 8, bArrArray.length);
            this.currentBitIndex += i;
            return;
        }
        int i21 = i6 + i;
        while (true) {
            int i22 = this.currentBitIndex;
            if (i22 >= i21) {
                return;
            }
            int i32 = i22 % 8;
            int i33 = i2 % 8;
            int iMin = Math.min(i21 - i22, Math.min(8 - i32, 8 - i33));
            byte mask = (byte) (bArrArray[i2 / 8] & getMask(i33, iMin));
            byte bMin = (byte) (i32 == 0 ? mask << Math.min(i33, 8 - iMin) : (mask & UnsignedBytes.MAX_VALUE) >> i32);
            byte[] bArr2 = this.byteTab;
            int i43 = this.currentBitIndex;
            int i59 = i43 / 8;
            bArr2[i59] = (byte) (bMin | bArr2[i59]);
            this.currentBitIndex = i43 + iMin;
            i2 += iMin;
        }
    }

    public void setNextDate(Date date, String str, boolean z) {
        String str2 = new SimpleDateFormat(str).format(date);
        if (z) {
            setNextHexaString(str2, str2.length() * 4);
        } else {
            setNextString(str2, str2.length() * 8);
        }
    }

    public void setNextString(String str, int i, boolean z) {
        setNextByte(str.getBytes(Charset.defaultCharset()), i, z);
    }

    public BitUtils(int i) {
        this.byteTab = new byte[(int) Math.ceil(i / 8.0f)];
        this.size = i;
    }
}
