package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187494c;
    public int d;
    public final InputStream e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f187495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f187496h;
    public int i;

    public CodedInputStream(InputStream inputStream) {
        this.f187496h = Integer.MAX_VALUE;
        this.f187492a = new byte[4096];
        this.f187493b = 0;
        this.d = 0;
        this.f187495g = 0;
        this.e = inputStream;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public final byte[] a(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f187495g;
        int i3 = this.d;
        int i5 = i2 + i3 + i;
        int i6 = this.f187496h;
        if (i5 > i6) {
            skipRawBytes((i6 - i2) - i3);
            throw InvalidProtocolBufferException.a();
        }
        byte[] bArr = this.f187492a;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i21 = this.f187493b - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i21);
            this.d = this.f187493b;
            int i22 = i - i21;
            if (i22 > 0) {
                d(i22);
            }
            System.arraycopy(bArr, 0, bArr2, i21, i22);
            this.d = i22;
            return bArr2;
        }
        int i32 = this.f187493b;
        this.f187495g = i2 + i32;
        this.d = 0;
        this.f187493b = 0;
        int length = i32 - i3;
        int i33 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i33 > 0) {
            int iMin = Math.min(i33, 4096);
            byte[] bArr3 = new byte[iMin];
            int i43 = 0;
            while (i43 < iMin) {
                InputStream inputStream = this.e;
                int i59 = inputStream == null ? -1 : inputStream.read(bArr3, i43, iMin - i43);
                if (i59 == -1) {
                    throw InvalidProtocolBufferException.a();
                }
                this.f187495g += i59;
                i43 += i59;
            }
            i33 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final long b() throws IOException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte rawByte = readRawByte();
            j2 |= ((long) (rawByte & Ascii.DEL)) << i;
            if ((rawByte & 128) == 0) {
                return j2;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final void c() {
        int i = this.f187493b + this.f187494c;
        this.f187493b = i;
        int i2 = this.f187495g + i;
        int i3 = this.f187496h;
        if (i2 <= i3) {
            this.f187494c = 0;
            return;
        }
        int i5 = i2 - i3;
        this.f187494c = i5;
        this.f187493b = i - i5;
    }

    public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.f != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void d(int i) throws InvalidProtocolBufferException {
        if (!e(i)) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final boolean e(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.d;
        int i3 = i2 + i;
        int i5 = this.f187493b;
        if (i3 <= i5) {
            StringBuilder sb6 = new StringBuilder(77);
            sb6.append("refillBuffer() called when ");
            sb6.append(i);
            sb6.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb6.toString());
        }
        if (this.f187495g + i2 + i <= this.f187496h && (inputStream = this.e) != null) {
            byte[] bArr = this.f187492a;
            if (i2 > 0) {
                if (i5 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i5 - i2);
                }
                this.f187495g += i2;
                this.f187493b -= i2;
                this.d = 0;
            }
            int i6 = this.f187493b;
            int i21 = inputStream.read(bArr, i6, bArr.length - i6);
            if (i21 == 0 || i21 < -1 || i21 > bArr.length) {
                StringBuilder sb9 = new StringBuilder(102);
                sb9.append("InputStream#read(byte[]) returned invalid result: ");
                sb9.append(i21);
                sb9.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb9.toString());
            }
            if (i21 > 0) {
                this.f187493b += i21;
                if ((this.f187495g + i) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                c();
                if (this.f187493b >= i) {
                    return true;
                }
                return e(i);
            }
        }
        return false;
    }

    public int getBytesUntilLimit() {
        int i = this.f187496h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f187495g + this.d);
    }

    public boolean isAtEnd() throws IOException {
        return this.d == this.f187493b && !e(1);
    }

    public void popLimit(int i) {
        this.f187496h = i;
        c();
    }

    public int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f187495g + this.d + i;
        int i3 = this.f187496h;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.a();
        }
        this.f187496h = i2;
        c();
        return i3;
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.f187493b;
        int i2 = this.d;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ByteString.EMPTY : new g(a(rawVarint32));
        }
        ByteString byteStringCopyFrom = ByteString.copyFrom(this.f187492a, i2, rawVarint32);
        this.d += rawVarint32;
        return byteStringCopyFrom;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i2 = this.i;
        if (i2 >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        this.i = i2 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas((i << 3) | 4);
        this.i--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.i++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.i--;
        popLimit(iPushLimit);
    }

    public byte readRawByte() throws IOException {
        if (this.d == this.f187493b) {
            d(1);
        }
        int i = this.d;
        this.d = i + 1;
        return this.f187492a[i];
    }

    public int readRawLittleEndian32() throws IOException {
        int i = this.d;
        if (this.f187493b - i < 4) {
            d(4);
            i = this.d;
        }
        this.d = i + 4;
        byte[] bArr = this.f187492a;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i = this.d;
        if (this.f187493b - i < 8) {
            d(8);
            i = this.d;
        }
        this.d = i + 8;
        byte[] bArr = this.f187492a;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i;
        int i2 = this.d;
        int i3 = this.f187493b;
        if (i3 != i2) {
            int i5 = i2 + 1;
            byte[] bArr = this.f187492a;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.d = i5;
                return b4;
            }
            if (i3 - i5 >= 9) {
                int i6 = i2 + 2;
                int i21 = (bArr[i5] << 7) ^ b4;
                long j2 = i21;
                if (j2 < 0) {
                    i = (int) ((-128) ^ j2);
                } else {
                    int i22 = i2 + 3;
                    int i32 = (bArr[i6] << 14) ^ i21;
                    long j3 = i32;
                    if (j3 >= 0) {
                        i = (int) (16256 ^ j3);
                    } else {
                        int i33 = i2 + 4;
                        int i43 = i32 ^ (bArr[i22] << Ascii.NAK);
                        long j5 = i43;
                        if (j5 < 0) {
                            i = (int) ((-2080896) ^ j5);
                        } else {
                            i22 = i2 + 5;
                            byte b5 = bArr[i33];
                            int i59 = (int) (((long) (i43 ^ (b5 << 28))) ^ 266354560);
                            if (b5 < 0) {
                                i33 = i2 + 6;
                                if (bArr[i22] < 0) {
                                    i22 = i2 + 7;
                                    if (bArr[i33] < 0) {
                                        i33 = i2 + 8;
                                        if (bArr[i22] < 0) {
                                            i22 = i2 + 9;
                                            if (bArr[i33] < 0) {
                                                int i66 = i2 + 10;
                                                if (bArr[i22] >= 0) {
                                                    i6 = i66;
                                                    i = i59;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i59;
                            }
                            i = i59;
                        }
                        i6 = i33;
                    }
                    i6 = i22;
                }
                this.d = i6;
                return i;
            }
        }
        return (int) b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r12.d
            int r1 = r12.f187493b
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.f187492a
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.d = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.b()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.f187493b;
        int i2 = this.d;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new String(a(rawVarint32), "UTF-8");
        }
        String str = new String(this.f187492a, i2, rawVarint32, "UTF-8");
        this.d += rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] bArrA;
        int rawVarint32 = readRawVarint32();
        int i = this.d;
        if (rawVarint32 <= this.f187493b - i && rawVarint32 > 0) {
            this.d = i + rawVarint32;
            bArrA = this.f187492a;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            bArrA = a(rawVarint32);
            i = 0;
        }
        if (vjm.h.c(bArrA, i, i + rawVarint32) == 0) {
            return new String(bArrA, i, rawVarint32, "UTF-8");
        }
        throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.f = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        int i2 = i & 7;
        if (i2 == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (i2 == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (i2 == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (i2 == 3) {
            codedOutputStream.writeRawVarint32(i);
            skipMessage(codedOutputStream);
            int tagFieldNumber = (WireFormat.getTagFieldNumber(i) << 3) | 4;
            checkLastTagWas(tagFieldNumber);
            codedOutputStream.writeRawVarint32(tagFieldNumber);
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        if (i2 != 5) {
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i);
        codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag2;
        do {
            tag2 = readTag();
            if (tag2 == 0) {
                return;
            }
        } while (skipField(tag2, codedOutputStream));
    }

    public void skipRawBytes(int i) throws IOException {
        int i2 = this.f187493b;
        int i3 = this.d;
        int i5 = i2 - i3;
        if (i <= i5 && i >= 0) {
            this.d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.f187495g;
        int i21 = i6 + i3 + i;
        int i22 = this.f187496h;
        if (i21 > i22) {
            skipRawBytes((i22 - i6) - i3);
            throw InvalidProtocolBufferException.a();
        }
        this.d = i2;
        d(1);
        while (true) {
            int i32 = i - i5;
            int i33 = this.f187493b;
            if (i32 <= i33) {
                this.d = i32;
                return;
            } else {
                i5 += i33;
                this.d = i33;
                d(1);
            }
        }
    }

    public CodedInputStream(g gVar) {
        this.f187496h = Integer.MAX_VALUE;
        byte[] bArr = gVar.f187528a;
        this.f187492a = bArr;
        this.d = 0;
        this.f187493b = bArr.length;
        this.f187495g = -0;
        this.e = null;
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.i < 64) {
            int iPushLimit = pushLimit(rawVarint32);
            this.i++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.i--;
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & CertificateBody.profileType;
        int i3 = 7;
        while (i3 < 32) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.a();
            }
            i2 |= (i5 & CertificateBody.profileType) << i3;
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw InvalidProtocolBufferException.a();
            }
            if ((i6 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }
}
