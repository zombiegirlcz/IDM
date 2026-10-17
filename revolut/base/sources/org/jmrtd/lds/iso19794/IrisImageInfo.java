package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.lds.AbstractImageInfo;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class IrisImageInfo extends AbstractImageInfo {
    public static final int IMAGE_QUAL_HIGH_HI = 100;
    public static final int IMAGE_QUAL_HIGH_LO = 76;
    public static final int IMAGE_QUAL_LOW_HI = 50;
    public static final int IMAGE_QUAL_LOW_LO = 26;
    public static final int IMAGE_QUAL_MED_HI = 75;
    public static final int IMAGE_QUAL_MED_LO = 51;
    public static final int IMAGE_QUAL_UNDEF = 254;
    private static final int ROT_ANGLE_UNDEF = 65535;
    private static final int ROT_UNCERTAIN_UNDEF = 65535;
    private static final long serialVersionUID = 833541246115625112L;
    private int imageFormat;
    private int imageNumber;
    private int quality;
    private int rotationAngle;
    private int rotationAngleUncertainty;

    public IrisImageInfo(int i, int i2, int i3, int i5, int i6, int i21, InputStream inputStream, int i22, int i32) throws IOException {
        super(3, i6, i21, inputStream, i22, getMimeTypeFromImageFormat(i32));
        if (inputStream == null) {
            throw new IllegalArgumentException("Null image bytes");
        }
        this.imageNumber = i;
        this.quality = i2;
        this.rotationAngle = i3;
        this.rotationAngleUncertainty = i5;
    }

    private static String getMimeTypeFromImageFormat(int i) {
        if (i == 2 || i == 4) {
            return "image/x-wsq";
        }
        if (i == 6 || i == 8 || i == 10 || i == 12) {
            return "image/jpeg";
        }
        if (i == 14 || i == 16) {
            return "image/jp2";
        }
        return null;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!super.equals(obj2) || getClass() != obj2.getClass()) {
            return false;
        }
        IrisImageInfo irisImageInfo = (IrisImageInfo) obj2;
        return this.imageFormat == irisImageInfo.imageFormat && this.imageNumber == irisImageInfo.imageNumber && this.quality == irisImageInfo.quality && this.rotationAngle == irisImageInfo.rotationAngle && this.rotationAngleUncertainty == irisImageInfo.rotationAngleUncertainty;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getImageNumber() {
        return this.imageNumber;
    }

    public int getQuality() {
        return this.quality;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        return ((long) getImageLength()) + 11;
    }

    public int getRotationAngle() {
        return this.rotationAngle;
    }

    public int getRotationAngleUncertainty() {
        return this.rotationAngleUncertainty;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public int hashCode() {
        return (((((((((super.hashCode() * 31) + this.imageFormat) * 31) + this.imageNumber) * 31) + this.quality) * 31) + this.rotationAngle) * 31) + this.rotationAngleUncertainty;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.imageNumber = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedByte();
        this.rotationAngle = dataInputStream.readShort();
        this.rotationAngleUncertainty = dataInputStream.readUnsignedShort();
        readImage(inputStream, ((long) dataInputStream.readInt()) & BodyPartID.bodyIdMax);
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public String toString() {
        StringBuilder sb6 = new StringBuilder("IrisImageInfo [image number: ");
        sb6.append(this.imageNumber);
        sb6.append(", quality: ");
        sb6.append(this.quality);
        sb6.append(", image: ");
        sb6.append(getWidth());
        sb6.append(" x ");
        sb6.append(getHeight());
        sb6.append("mime-type: ");
        return a.i(sb6, getMimeTypeFromImageFormat(this.imageFormat), "]");
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void writeObject(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.imageNumber);
        dataOutputStream.writeByte(this.quality);
        dataOutputStream.writeShort(this.rotationAngle);
        dataOutputStream.writeShort(this.rotationAngleUncertainty);
        dataOutputStream.writeInt(getImageLength());
        writeImage(dataOutputStream);
    }

    public IrisImageInfo(int i, int i2, int i3, InputStream inputStream, int i5, int i6) throws IOException {
        this(i, 254, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, i2, i3, inputStream, i5, i6);
    }

    public IrisImageInfo(InputStream inputStream, int i) throws IOException {
        super(3);
        this.imageFormat = i;
        setMimeType(getMimeTypeFromImageFormat(i));
        readObject(inputStream);
    }
}
