package org.jmrtd.lds;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jmrtd.cert.CVCPrincipal;

/* JADX INFO: loaded from: classes14.dex */
public class CVCAFile extends AbstractLDSFile {
    public static final byte CAR_TAG = 66;
    public static final int LENGTH = 36;
    private static final long serialVersionUID = -1100904058684365703L;
    private String altCAReference;
    private String caReference;

    /* JADX INFO: renamed from: fid, reason: collision with root package name */
    private short f228967fid;

    public CVCAFile(InputStream inputStream) throws IOException {
        this((short) 284, inputStream);
    }

    public boolean equals(Object obj2) {
        if (obj2 == null || !getClass().equals(obj2.getClass())) {
            return false;
        }
        CVCAFile cVCAFile = (CVCAFile) obj2;
        if (this.caReference.equals(cVCAFile.caReference)) {
            String str = this.altCAReference;
            if (str == null && cVCAFile.altCAReference == null) {
                return true;
            }
            if (str != null && str.equals(cVCAFile.altCAReference)) {
                return true;
            }
        }
        return false;
    }

    public CVCPrincipal getAltCAReference() {
        if (this.altCAReference == null) {
            return null;
        }
        return new CVCPrincipal(this.altCAReference);
    }

    public CVCPrincipal getCAReference() {
        if (this.caReference == null) {
            return null;
        }
        return new CVCPrincipal(this.caReference);
    }

    @Override // org.jmrtd.lds.AbstractLDSFile, org.jmrtd.lds.LDSElement
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public short getFID() {
        return this.f228967fid;
    }

    @Override // org.jmrtd.lds.LDSFile
    public int getLength() {
        return 36;
    }

    public int hashCode() {
        int iHashCode = this.caReference.hashCode() * 11;
        String str = this.altCAReference;
        return iHashCode + (str != null ? str.hashCode() * 13 : 0) + 5;
    }

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int i = dataInputStream.read();
        if (i != 66) {
            throw new IllegalArgumentException("Wrong tag, expected " + Integer.toHexString(66) + ", found " + Integer.toHexString(i));
        }
        int i2 = dataInputStream.read();
        if (i2 > 16) {
            throw new IllegalArgumentException("Wrong length");
        }
        byte[] bArr = new byte[i2];
        dataInputStream.readFully(bArr);
        this.caReference = new String(bArr);
        int i3 = dataInputStream.read();
        if (i3 != 0 && i3 != -1) {
            if (i3 != 66) {
                throw new IllegalArgumentException("Wrong tag");
            }
            int i5 = dataInputStream.read();
            if (i5 > 16) {
                throw new IllegalArgumentException("Wrong length");
            }
            byte[] bArr2 = new byte[i5];
            dataInputStream.readFully(bArr2);
            this.altCAReference = new String(bArr2);
            i3 = dataInputStream.read();
        }
        while (i3 != -1) {
            if (i3 != 0) {
                throw new IllegalArgumentException("Bad file padding");
            }
            i3 = dataInputStream.read();
        }
    }

    public String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder("CA reference: \"");
        sb6.append(this.caReference);
        sb6.append("\"");
        if (this.altCAReference != null) {
            str = ", Alternative CA reference: " + this.altCAReference;
        } else {
            str = "";
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void writeObject(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[36];
        bArr[0] = CAR_TAG;
        bArr[1] = (byte) this.caReference.length();
        System.arraycopy(this.caReference.getBytes(), 0, bArr, 2, bArr[1]);
        String str = this.altCAReference;
        if (str != null) {
            byte b4 = bArr[1];
            bArr[b4 + 2] = CAR_TAG;
            int i = b4 + 3;
            bArr[i] = (byte) str.length();
            System.arraycopy(this.altCAReference.getBytes(), 0, bArr, b4 + 4, bArr[i]);
        }
        outputStream.write(bArr);
    }

    public CVCAFile(short s2, InputStream inputStream) throws IOException {
        this.caReference = null;
        this.altCAReference = null;
        this.f228967fid = s2;
        readObject(inputStream);
    }

    public CVCAFile(String str, String str2) {
        this((short) 284, str, str2);
    }

    public CVCAFile(short s2, String str, String str2) {
        this.caReference = null;
        this.altCAReference = null;
        if (str != null && str.length() <= 16 && (str2 == null || str2.length() <= 16)) {
            this.f228967fid = s2;
            this.caReference = str;
            this.altCAReference = str2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public CVCAFile(short s2, String str) {
        this(s2, str, null);
    }
}
