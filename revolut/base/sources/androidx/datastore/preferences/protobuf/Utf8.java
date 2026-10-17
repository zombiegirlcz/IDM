package androidx.datastore.preferences.protobuf;

import a0.d;
import com.google.common.base.Ascii;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import java.nio.charset.Charset;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes.dex */
abstract class Utf8 {
    private static final Processor processor;

    public static class DecodeUtil {
        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b4, byte b5, byte b7, byte b13, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b5)) {
                if ((((b5 + ISO7816.INS_MANAGE_CHANNEL) + (b4 << 28)) >> 30) == 0 && !isNotTrailingByte(b7) && !isNotTrailingByte(b13)) {
                    int iTrailingByteValue = ((b4 & 7) << 18) | (trailingByteValue(b5) << 12) | (trailingByteValue(b7) << 6) | trailingByteValue(b13);
                    cArr[i] = highSurrogate(iTrailingByteValue);
                    cArr[i + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b4, char[] cArr, int i) {
            cArr[i] = (char) b4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b4, byte b5, byte b7, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || isNotTrailingByte(b7)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b4 & 15) << 12) | (trailingByteValue(b5) << 6) | trailingByteValue(b7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b4 < -62 || isNotTrailingByte(b5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b4 & Ascii.US) << 6) | trailingByteValue(b5));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b4) {
            return b4 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b4) {
            return b4 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b4) {
            return b4 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b4) {
            return b4 < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b4) {
            return b4 & 63;
        }
    }

    public static abstract class Processor {
        public abstract String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(String str, byte[] bArr, int i, int i2);
    }

    public static final class SafeProcessor extends Processor {
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i3) {
                byte b4 = bArr[i];
                if (!DecodeUtil.isOneByte(b4)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b4, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i < i3) {
                int i21 = i + 1;
                byte b5 = bArr[i];
                if (DecodeUtil.isOneByte(b5)) {
                    int i22 = i6 + 1;
                    DecodeUtil.handleOneByte(b5, cArr, i6);
                    int i32 = i21;
                    while (i32 < i3) {
                        byte b7 = bArr[i32];
                        if (!DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        i32++;
                        DecodeUtil.handleOneByte(b7, cArr, i22);
                        i22++;
                    }
                    i6 = i22;
                    i = i32;
                } else if (DecodeUtil.isTwoBytes(b5)) {
                    if (i21 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b5, bArr[i21], cArr, i6);
                    i6++;
                } else if (DecodeUtil.isThreeBytes(b5)) {
                    if (i21 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i33 = i + 2;
                    i += 3;
                    DecodeUtil.handleThreeBytes(b5, bArr[i21], bArr[i33], cArr, i6);
                    i6++;
                } else {
                    if (i21 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b13 = bArr[i21];
                    int i43 = i + 3;
                    byte b15 = bArr[i + 2];
                    i += 4;
                    DecodeUtil.handleFourBytes(b5, b13, b15, bArr[i43], cArr, i6);
                    i6 += 2;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i5;
            char cCharAt;
            int length = str.length();
            int i6 = i2 + i;
            int i21 = 0;
            while (i21 < length && (i5 = i21 + i) < i6 && (cCharAt = str.charAt(i21)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i21++;
            }
            if (i21 == length) {
                return i + length;
            }
            int i22 = i + i21;
            while (i21 < length) {
                char cCharAt2 = str.charAt(i21);
                if (cCharAt2 < 128 && i22 < i6) {
                    bArr[i22] = (byte) cCharAt2;
                    i22++;
                } else if (cCharAt2 < 2048 && i22 <= i6 - 2) {
                    int i32 = i22 + 1;
                    bArr[i22] = (byte) ((cCharAt2 >>> 6) | 960);
                    i22 += 2;
                    bArr[i32] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i22 > i6 - 3) {
                        if (i22 > i6 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i21 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i21, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i22);
                        }
                        int i33 = i21 + 1;
                        if (i33 != str.length()) {
                            char cCharAt3 = str.charAt(i33);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i22] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i22 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i43 = i22 + 3;
                                bArr[i22 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i22 += 4;
                                bArr[i43] = (byte) ((codePoint & 63) | 128);
                                i21 = i33;
                            } else {
                                i21 = i33;
                            }
                        }
                        throw new UnpairedSurrogateException(i21 - 1, length);
                    }
                    bArr[i22] = (byte) ((cCharAt2 >>> '\f') | DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                    int i59 = i22 + 2;
                    bArr[i22 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i22 += 3;
                    bArr[i59] = (byte) ((cCharAt2 & '?') | 128);
                }
                i21++;
            }
            return i22;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(d.g(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i, i2, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(String str, byte[] bArr, int i, int i2) {
            long j2;
            long j3;
            long j5;
            int i3;
            char cCharAt;
            long j16 = i;
            long j22 = ((long) i2) + j16;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i5 = 0;
            while (true) {
                j2 = 1;
                if (i5 >= length || (cCharAt = str.charAt(i5)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j16, (byte) cCharAt);
                i5++;
                j16 = 1 + j16;
            }
            if (i5 == length) {
                return (int) j16;
            }
            while (i5 < length) {
                char cCharAt2 = str.charAt(i5);
                if (cCharAt2 < 128 && j16 < j22) {
                    UnsafeUtil.putByte(bArr, j16, (byte) cCharAt2);
                    j5 = j22;
                    j3 = j2;
                    j16 += j2;
                } else if (cCharAt2 >= 2048 || j16 > j22 - 2) {
                    j3 = j2;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j16 > j22 - 3) {
                        j5 = j22;
                        if (j16 > j5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i5, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j16);
                        }
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char cCharAt3 = str.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j16, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(bArr, j16 + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j42 = j16 + 3;
                                UnsafeUtil.putByte(bArr, j16 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j16 += 4;
                                UnsafeUtil.putByte(bArr, j42, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new UnpairedSurrogateException(i5 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j16, (byte) ((cCharAt2 >>> '\f') | DefaultFrameSampler.DESIRED_FRAME_WIDTH));
                    long j46 = j16 + 2;
                    j5 = j22;
                    UnsafeUtil.putByte(bArr, j16 + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j16 += 3;
                    UnsafeUtil.putByte(bArr, j46, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j3 = j2;
                    long j47 = j16 + j3;
                    UnsafeUtil.putByte(bArr, j16, (byte) ((cCharAt2 >>> 6) | 960));
                    j16 += 2;
                    UnsafeUtil.putByte(bArr, j47, (byte) ((cCharAt2 & '?') | 128));
                    j5 = j22;
                }
                i5++;
                j2 = j3;
                j22 = j5;
            }
            return (int) j16;
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    public static String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i2);
    }

    public static int encode(String str, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(str, bArr, i, i2);
    }

    public static int encodedLength(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(str, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }
}
