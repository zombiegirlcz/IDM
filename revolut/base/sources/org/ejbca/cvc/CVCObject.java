package org.ejbca.cvc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CVCObject implements Serializable {
    public static final int CVC_VERSION = 0;
    private static final int INT_LENGTH = 4;
    private static final int LONG_LENGTH = 8;
    public static final String NEWLINE = System.getProperty("line.separator");
    private static final long serialVersionUID = 1;
    private AbstractSequence parent;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    private final CVCTagEnum f228960tag;

    public CVCObject(CVCTagEnum cVCTagEnum) {
        this.f228960tag = cVCTagEnum;
    }

    public static int decodeLength(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.read();
        return i > 127 ? (i & 15) == 1 ? dataInputStream.readUnsignedByte() : dataInputStream.readShort() : i;
    }

    public static byte[] encodeLength(int i) {
        int i2 = i > 127 ? i > 255 ? 2 : 1 : 0;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2 + 1);
        if (i2 == 0) {
            byteBufferAllocate.put(0, (byte) i);
        } else {
            byteBufferAllocate.put(0, (byte) (i2 + 128));
            if (i2 == 1) {
                byteBufferAllocate.put(1, (byte) i);
            } else {
                byteBufferAllocate.putShort(1, (short) i);
            }
        }
        return byteBufferAllocate.array();
    }

    public static byte[] toByteArray(Integer num) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(num.intValue());
        return trimByteArray(byteBufferAllocate.array());
    }

    public static byte[] trimByteArray(byte[] bArr) {
        int i = 0;
        boolean z = false;
        while (i < bArr.length) {
            z = bArr[i] != 0;
            if (z) {
                break;
            }
            i++;
        }
        if (!z) {
            return new byte[]{0};
        }
        byte[] bArr2 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr2, 0, bArr.length - i);
        return bArr2;
    }

    public abstract int encode(DataOutputStream dataOutputStream) throws IOException;

    public String getAsText() {
        return getAsText("", true);
    }

    public AbstractSequence getParent() {
        return this.parent;
    }

    public CVCTagEnum getTag() {
        return this.f228960tag;
    }

    public void setParent(AbstractSequence abstractSequence) {
        this.parent = abstractSequence;
    }

    public String getAsText(boolean z) {
        return getAsText("", z);
    }

    public String getAsText(String str) {
        return getAsText(str, true);
    }

    public static byte[] toByteArray(Long l2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(l2.longValue());
        return trimByteArray(byteBufferAllocate.array());
    }

    public String getAsText(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (z) {
            stringBuffer.append(Integer.toHexString(getTag().getValue()));
            stringBuffer.append(p.SPACE_CHAR);
        }
        stringBuffer.append(getTag().name());
        stringBuffer.append("  ");
        return stringBuffer.toString();
    }
}
