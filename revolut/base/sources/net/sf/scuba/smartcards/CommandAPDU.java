package net.sf.scuba.smartcards;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public final class CommandAPDU implements Serializable {
    private static final int MAX_APDU_SIZE = 65544;
    private static final long serialVersionUID = 398698301286670877L;
    private byte[] apdu;
    private transient int dataOffset;

    /* JADX INFO: renamed from: nc, reason: collision with root package name */
    private transient int f214652nc;
    private transient int ne;

    public CommandAPDU(byte[] bArr) {
        this.apdu = (byte[]) bArr.clone();
        parse();
    }

    private static int arrayLength(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    private void checkArrayBounds(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Offset and length must not be negative");
        }
        if (bArr != null) {
            if (i > bArr.length - i2) {
                throw new IllegalArgumentException("Offset plus length exceed array size");
            }
        } else if (i != 0 && i2 != 0) {
            throw new IllegalArgumentException("offset and length must be 0 if array is null");
        }
    }

    private void parse() {
        byte[] bArr = this.apdu;
        if (bArr.length < 4) {
            throw new IllegalArgumentException("apdu must be at least 4 bytes long");
        }
        if (bArr.length == 4) {
            return;
        }
        int i = bArr[4] & UnsignedBytes.MAX_VALUE;
        if (bArr.length == 5) {
            if (i == 0) {
                i = 256;
            }
            this.ne = i;
            return;
        }
        if (i != 0) {
            if (bArr.length == i + 5) {
                this.f214652nc = i;
                this.dataOffset = 5;
                return;
            } else {
                if (bArr.length == i + 6) {
                    this.f214652nc = i;
                    this.dataOffset = 5;
                    int i2 = bArr[bArr.length - 1] & UnsignedBytes.MAX_VALUE;
                    this.ne = i2 != 0 ? i2 : 256;
                    return;
                }
                throw new IllegalArgumentException("Invalid APDU: length=" + this.apdu.length + ", b1=" + i);
            }
        }
        if (bArr.length < 7) {
            throw new IllegalArgumentException("Invalid APDU: length=" + this.apdu.length + ", b1=" + i);
        }
        int i3 = ((bArr[5] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[6] & UnsignedBytes.MAX_VALUE);
        if (bArr.length == 7) {
            if (i3 == 0) {
                i3 = 65536;
            }
            this.ne = i3;
            return;
        }
        if (i3 == 0) {
            StringBuilder sb6 = new StringBuilder("Invalid APDU: length=");
            a.x(sb6, this.apdu.length, ", b1=", i, ", b2||b3=");
            sb6.append(i3);
            throw new IllegalArgumentException(sb6.toString());
        }
        if (bArr.length == i3 + 7) {
            this.f214652nc = i3;
            this.dataOffset = 7;
        } else {
            if (bArr.length != i3 + 9) {
                StringBuilder sb9 = new StringBuilder("Invalid APDU: length=");
                a.x(sb9, this.apdu.length, ", b1=", i, ", b2||b3=");
                sb9.append(i3);
                throw new IllegalArgumentException(sb9.toString());
            }
            this.f214652nc = i3;
            this.dataOffset = 7;
            int length = bArr.length;
            int i5 = (bArr[length - 1] & UnsignedBytes.MAX_VALUE) | ((bArr[length - 2] & UnsignedBytes.MAX_VALUE) << 8);
            this.ne = i5 != 0 ? i5 : 65536;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.apdu = (byte[]) objectInputStream.readUnshared();
        parse();
    }

    private void setHeader(int i, int i2, int i3, int i5) {
        byte[] bArr = this.apdu;
        bArr[0] = (byte) i;
        bArr[1] = (byte) i2;
        bArr[2] = (byte) i3;
        bArr[3] = (byte) i5;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof CommandAPDU) {
            return Arrays.equals(this.apdu, ((CommandAPDU) obj2).apdu);
        }
        return false;
    }

    public byte[] getBytes() {
        return (byte[]) this.apdu.clone();
    }

    public int getCLA() {
        return this.apdu[0] & UnsignedBytes.MAX_VALUE;
    }

    public byte[] getData() {
        int i = this.f214652nc;
        byte[] bArr = new byte[i];
        System.arraycopy(this.apdu, this.dataOffset, bArr, 0, i);
        return bArr;
    }

    public int getINS() {
        return this.apdu[1] & UnsignedBytes.MAX_VALUE;
    }

    public int getNc() {
        return this.f214652nc;
    }

    public int getNe() {
        return this.ne;
    }

    public int getP1() {
        return this.apdu[2] & UnsignedBytes.MAX_VALUE;
    }

    public int getP2() {
        return this.apdu[3] & UnsignedBytes.MAX_VALUE;
    }

    public int hashCode() {
        return Arrays.hashCode(this.apdu);
    }

    public String toString() {
        return "CommmandAPDU: " + this.apdu.length + " bytes, nc=" + this.f214652nc + ", ne=" + this.ne;
    }

    public CommandAPDU(byte[] bArr, int i, int i2) {
        checkArrayBounds(bArr, i, i2);
        byte[] bArr2 = new byte[i2];
        this.apdu = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        parse();
    }

    public CommandAPDU(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.apdu = bArr;
        byteBuffer.get(bArr);
        parse();
    }

    public CommandAPDU(int i, int i2, int i3, int i5) {
        this(i, i2, i3, i5, null, 0, 0, 0);
    }

    public CommandAPDU(int i, int i2, int i3, int i5, int i6) {
        this(i, i2, i3, i5, null, 0, 0, i6);
    }

    public CommandAPDU(int i, int i2, int i3, int i5, byte[] bArr) {
        this(i, i2, i3, i5, bArr, 0, arrayLength(bArr), 0);
    }

    public CommandAPDU(int i, int i2, int i3, int i5, byte[] bArr, int i6, int i21) {
        this(i, i2, i3, i5, bArr, i6, i21, 0);
    }

    public CommandAPDU(int i, int i2, int i3, int i5, byte[] bArr, int i6) {
        this(i, i2, i3, i5, bArr, 0, arrayLength(bArr), i6);
    }

    public CommandAPDU(int i, int i2, int i3, int i5, byte[] bArr, int i6, int i21, int i22) {
        byte b4;
        checkArrayBounds(bArr, i6, i21);
        if (i21 > 65535) {
            throw new IllegalArgumentException("dataLength is too large");
        }
        if (i22 < 0) {
            throw new IllegalArgumentException("ne must not be negative");
        }
        if (i22 <= 65536) {
            this.ne = i22;
            this.f214652nc = i21;
            if (i21 == 0) {
                if (i22 == 0) {
                    this.apdu = new byte[4];
                    setHeader(i, i2, i3, i5);
                    return;
                }
                if (i22 <= 256) {
                    b = i22 != 256 ? (byte) i22 : (byte) 0;
                    this.apdu = new byte[5];
                    setHeader(i, i2, i3, i5);
                    this.apdu[4] = b;
                    return;
                }
                if (i22 == 65536) {
                    b4 = 0;
                } else {
                    b = (byte) (i22 >> 8);
                    b4 = (byte) i22;
                }
                this.apdu = new byte[7];
                setHeader(i, i2, i3, i5);
                byte[] bArr2 = this.apdu;
                bArr2[5] = b;
                bArr2[6] = b4;
                return;
            }
            if (i22 == 0) {
                if (i21 <= 255) {
                    this.apdu = new byte[i21 + 5];
                    setHeader(i, i2, i3, i5);
                    byte[] bArr3 = this.apdu;
                    bArr3[4] = (byte) i21;
                    this.dataOffset = 5;
                    System.arraycopy(bArr, i6, bArr3, 5, i21);
                    return;
                }
                this.apdu = new byte[i21 + 7];
                setHeader(i, i2, i3, i5);
                byte[] bArr4 = this.apdu;
                bArr4[4] = 0;
                bArr4[5] = (byte) (i21 >> 8);
                bArr4[6] = (byte) i21;
                this.dataOffset = 7;
                System.arraycopy(bArr, i6, bArr4, 7, i21);
                return;
            }
            if (i21 <= 255 && i22 <= 256) {
                this.apdu = new byte[i21 + 6];
                setHeader(i, i2, i3, i5);
                byte[] bArr5 = this.apdu;
                bArr5[4] = (byte) i21;
                this.dataOffset = 5;
                System.arraycopy(bArr, i6, bArr5, 5, i21);
                this.apdu[r13.length - 1] = i22 != 256 ? (byte) i22 : (byte) 0;
                return;
            }
            this.apdu = new byte[i21 + 9];
            setHeader(i, i2, i3, i5);
            byte[] bArr6 = this.apdu;
            bArr6[4] = 0;
            bArr6[5] = (byte) (i21 >> 8);
            bArr6[6] = (byte) i21;
            this.dataOffset = 7;
            System.arraycopy(bArr, i6, bArr6, 7, i21);
            if (i22 != 65536) {
                byte[] bArr7 = this.apdu;
                int length = bArr7.length;
                bArr7[length - 2] = (byte) (i22 >> 8);
                bArr7[length - 1] = (byte) i22;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ne is too large");
    }
}
