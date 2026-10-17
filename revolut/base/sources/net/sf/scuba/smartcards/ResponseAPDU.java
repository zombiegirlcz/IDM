package net.sf.scuba.smartcards;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class ResponseAPDU implements Serializable {
    private static final long serialVersionUID = 6962744978375594225L;
    private byte[] apdu;

    public ResponseAPDU(byte[] bArr) {
        byte[] bArr2 = (byte[]) bArr.clone();
        check(bArr2);
        this.apdu = bArr2;
    }

    private static void check(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("apdu must be at least 2 bytes long");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        byte[] bArr = (byte[]) objectInputStream.readUnshared();
        this.apdu = bArr;
        check(bArr);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof ResponseAPDU) {
            return Arrays.equals(this.apdu, ((ResponseAPDU) obj2).apdu);
        }
        return false;
    }

    public byte[] getBytes() {
        return (byte[]) this.apdu.clone();
    }

    public byte[] getData() {
        byte[] bArr = this.apdu;
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public int getNr() {
        return this.apdu.length - 2;
    }

    public int getSW() {
        return (getSW1() << 8) | getSW2();
    }

    public int getSW1() {
        return this.apdu[r0.length - 2] & UnsignedBytes.MAX_VALUE;
    }

    public int getSW2() {
        return this.apdu[r0.length - 1] & UnsignedBytes.MAX_VALUE;
    }

    public int hashCode() {
        return Arrays.hashCode(this.apdu);
    }

    public String toString() {
        return "ResponseAPDU: " + this.apdu.length + " bytes, SW=" + Integer.toHexString(getSW());
    }
}
