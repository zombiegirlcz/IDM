package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187499c;
    public final OutputStream d;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(byte[] bArr, int i, int i2) {
        this.d = null;
        this.f187497a = bArr;
        this.f187499c = i;
        this.f187498b = i + i2;
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeBoolSizeNoTag(z) + computeTagSize(i);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return byteString.size() + computeRawVarint32Size(byteString.size());
    }

    public static int computeDoubleSize(int i, double d) {
        return computeDoubleSizeNoTag(d) + computeTagSize(i);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeEnumSizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeFloatSizeNoTag(f) + computeTagSize(i);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & RangingPosition.RSSI_UNKNOWN) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j2) {
        return computeSInt64SizeNoTag(j2) + computeTagSize(i);
    }

    public static int computeSInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(encodeZigZag64(j2));
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(i << 3);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f187497a, 0, this.f187499c);
        this.f187499c = 0;
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void flush() throws IOException {
        if (this.d != null) {
            a();
        }
    }

    public int spaceLeft() {
        if (this.d == null) {
            return this.f187498b - this.f187499c;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public void writeBoolNoTag(boolean z) throws IOException {
        writeRawByte(z ? 1 : 0);
    }

    public void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i, ByteString byteString) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public void writeBytesNoTag(ByteString byteString) throws IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeDouble(int i, double d) throws IOException {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public void writeDoubleNoTag(double d) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
    }

    public void writeEnum(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public void writeFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeFixed64NoTag(long j2) throws IOException {
        writeRawLittleEndian64(j2);
    }

    public void writeFloat(int i, float f) throws IOException {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public void writeFloatNoTag(float f) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f));
    }

    public void writeGroup(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    public void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64(i);
        }
    }

    public void writeInt64NoTag(long j2) throws IOException {
        writeRawVarint64(j2);
    }

    public void writeMessage(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b4) throws IOException {
        if (this.f187499c == this.f187498b) {
            a();
        }
        int i = this.f187499c;
        this.f187499c = i + 1;
        this.f187497a[i] = b4;
    }

    public void writeRawBytes(ByteString byteString) throws IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawLittleEndian32(int i) throws IOException {
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j2) throws IOException {
        writeRawByte(((int) j2) & 255);
        writeRawByte(((int) (j2 >> 8)) & 255);
        writeRawByte(((int) (j2 >> 16)) & 255);
        writeRawByte(((int) (j2 >> 24)) & 255);
        writeRawByte(((int) (j2 >> 32)) & 255);
        writeRawByte(((int) (j2 >> 40)) & 255);
        writeRawByte(((int) (j2 >> 48)) & 255);
        writeRawByte(((int) (j2 >> 56)) & 255);
    }

    public void writeRawVarint32(int i) throws IOException {
        while ((i & RangingPosition.RSSI_UNKNOWN) != 0) {
            writeRawByte((i & CertificateBody.profileType) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            writeRawByte((((int) j2) & CertificateBody.profileType) | 128);
            j2 >>>= 7;
        }
        writeRawByte((int) j2);
    }

    public void writeSFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64NoTag(long j2) throws IOException {
        writeRawLittleEndian64(j2);
    }

    public void writeSInt32NoTag(int i) throws IOException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64(int i, long j2) throws IOException {
        writeTag(i, 0);
        writeSInt64NoTag(j2);
    }

    public void writeSInt64NoTag(long j2) throws IOException {
        writeRawVarint64(encodeZigZag64(j2));
    }

    public void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i, int i2) throws IOException {
        writeRawVarint32((i << 3) | i2);
    }

    public void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public void writeUInt32NoTag(int i) throws IOException {
        writeRawVarint32(i);
    }

    public void writeUInt64NoTag(long j2) throws IOException {
        writeRawVarint64(j2);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new CodedOutputStream(bArr, i, i2);
    }

    public void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f187499c;
        int i5 = this.f187498b;
        int i6 = i5 - i3;
        byte[] bArr2 = this.f187497a;
        if (i6 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f187499c += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i6);
        int i21 = i + i6;
        int i22 = i2 - i6;
        this.f187499c = i5;
        a();
        if (i22 <= i5) {
            System.arraycopy(bArr, i21, bArr2, 0, i22);
            this.f187499c = i22;
        } else {
            this.d.write(bArr, i21, i22);
        }
    }

    public void writeRawByte(int i) throws IOException {
        writeRawByte((byte) i);
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.f187497a = bArr;
        this.f187499c = 0;
        this.f187498b = bArr.length;
    }

    public void writeRawBytes(ByteString byteString, int i, int i2) throws IOException {
        int i3 = this.f187499c;
        int i5 = this.f187498b;
        int i6 = i5 - i3;
        byte[] bArr = this.f187497a;
        if (i6 >= i2) {
            byteString.copyTo(bArr, i, i3, i2);
            this.f187499c += i2;
            return;
        }
        byteString.copyTo(bArr, i, i3, i6);
        int i21 = i + i6;
        int i22 = i2 - i6;
        this.f187499c = i5;
        a();
        if (i22 <= i5) {
            byteString.copyTo(bArr, i21, 0, i22);
            this.f187499c = i22;
            return;
        }
        if (i21 < 0) {
            StringBuilder sb6 = new StringBuilder(30);
            sb6.append("Source offset < 0: ");
            sb6.append(i21);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        if (i22 >= 0) {
            int i32 = i21 + i22;
            if (i32 <= byteString.size()) {
                if (i22 > 0) {
                    byteString.h(this.d, i21, i22);
                    return;
                }
                return;
            } else {
                StringBuilder sb9 = new StringBuilder(39);
                sb9.append("Source end offset exceeded: ");
                sb9.append(i32);
                throw new IndexOutOfBoundsException(sb9.toString());
            }
        }
        StringBuilder sb10 = new StringBuilder(23);
        sb10.append("Length < 0: ");
        sb10.append(i22);
        throw new IndexOutOfBoundsException(sb10.toString());
    }
}
