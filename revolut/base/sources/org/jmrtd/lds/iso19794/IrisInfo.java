package org.jmrtd.lds.iso19794;

import a0.d;
import ehe.n;
import j6.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;

/* JADX INFO: loaded from: classes14.dex */
public class IrisInfo extends AbstractListInfo<IrisBiometricSubtypeInfo> implements BiometricDataBlock {
    public static final int CAPTURE_DEVICE_UNDEF = 0;
    private static final int FORMAT_IDENTIFIER = 1229541888;
    public static final int IMAGEFORMAT_MONO_JPEG = 6;
    public static final int IMAGEFORMAT_MONO_JPEG2000 = 14;
    public static final int IMAGEFORMAT_MONO_JPEG_LS = 10;
    public static final int IMAGEFORMAT_MONO_RAW = 2;
    public static final int IMAGEFORMAT_RGB_JPEG = 8;
    public static final int IMAGEFORMAT_RGB_JPEG2000 = 16;
    public static final int IMAGEFORMAT_RGB_JPEG_LS = 12;
    public static final int IMAGEFORMAT_RGB_RAW = 4;
    public static final int INTENSITY_DEPTH_UNDEF = 0;
    public static final int IRBNDY_PROCESSED = 1;
    public static final int IRBNDY_UNDEF = 0;
    public static final int IROCC_PROCESSED = 1;
    public static final int IROCC_UNDEF = 0;
    public static final int IROCC_ZEROFILL = 0;
    public static final int IROC_UNITFILL = 1;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int ORIENTATION_BASE = 1;
    public static final int ORIENTATION_FLIPPED = 2;
    public static final int ORIENTATION_UNDEF = 0;
    public static final int SCAN_TYPE_CORRECTED = 4;
    public static final int SCAN_TYPE_INTERLACE_FIELD = 3;
    public static final int SCAN_TYPE_INTERLACE_FRAME = 2;
    public static final int SCAN_TYPE_PROGRESSIVE = 1;
    public static final int SCAN_TYPE_UNDEF = 0;
    public static final int TRANS_STD = 1;
    public static final int TRANS_UNDEF = 0;
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = -3415309711643815511L;
    private int boundaryExtraction;
    private int captureDeviceId;
    private byte[] deviceUniqueId;
    private int horizontalOrientation;
    private int imageFormat;
    private int imageTransformation;
    private int intensityDepth;
    private int irisDiameter;
    private int irisOcclusion;
    private int occlusionFilling;
    private int rawImageHeight;
    private int rawImageWidth;
    private long recordLength;

    /* JADX INFO: renamed from: sbh, reason: collision with root package name */
    private StandardBiometricHeader f228977sbh;
    private int scanType;
    private int verticalOrientation;

    public IrisInfo(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59, int i66, int i74, byte[] bArr, List<IrisBiometricSubtypeInfo> list) {
        this(null, i, i2, i3, i5, i6, i21, i22, i32, i33, i43, i59, i66, i74, bArr, list);
    }

    private int getBiometricSubtype() {
        Iterator<IrisBiometricSubtypeInfo> it8 = getSubRecords().iterator();
        while (it8.hasNext()) {
            it8.next().getBiometricSubtype();
        }
        return 0;
    }

    public void addIrisBiometricSubtypeInfo(IrisBiometricSubtypeInfo irisBiometricSubtypeInfo) {
        add(irisBiometricSubtypeInfo);
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!super.equals(obj2) || getClass() != obj2.getClass()) {
            return false;
        }
        IrisInfo irisInfo = (IrisInfo) obj2;
        StandardBiometricHeader standardBiometricHeader = this.f228977sbh;
        if (standardBiometricHeader == null) {
            if (irisInfo.f228977sbh != null) {
                return false;
            }
        } else if (!standardBiometricHeader.equals(irisInfo.f228977sbh)) {
            return false;
        }
        return this.boundaryExtraction == irisInfo.boundaryExtraction && this.captureDeviceId == irisInfo.captureDeviceId && Arrays.equals(this.deviceUniqueId, irisInfo.deviceUniqueId) && this.horizontalOrientation == irisInfo.horizontalOrientation && this.imageFormat == irisInfo.imageFormat && this.imageTransformation == irisInfo.imageTransformation && this.intensityDepth == irisInfo.intensityDepth && this.irisDiameter == irisInfo.irisDiameter && this.irisOcclusion == irisInfo.irisOcclusion && this.occlusionFilling == irisInfo.occlusionFilling && this.rawImageHeight == irisInfo.rawImageHeight && this.rawImageWidth == irisInfo.rawImageWidth && this.recordLength == irisInfo.recordLength && this.scanType == irisInfo.scanType && this.verticalOrientation == irisInfo.verticalOrientation;
    }

    public int getBoundaryExtraction() {
        return this.boundaryExtraction;
    }

    public int getCaptureDeviceId() {
        return this.captureDeviceId;
    }

    public byte[] getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getHorizontalOrientation() {
        return this.horizontalOrientation;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getImageTransformation() {
        return this.imageTransformation;
    }

    public int getIntensityDepth() {
        return this.intensityDepth;
    }

    public List<IrisBiometricSubtypeInfo> getIrisBiometricSubtypeInfos() {
        return getSubRecords();
    }

    public int getIrisDiameter() {
        return this.irisDiameter;
    }

    public int getIrisOcclusion() {
        return this.irisOcclusion;
    }

    public int getOcclusionFilling() {
        return this.occlusionFilling;
    }

    public int getRawImageHeight() {
        return this.rawImageHeight;
    }

    public int getRawImageWidth() {
        return this.rawImageWidth;
    }

    public int getScanType() {
        return this.scanType;
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.f228977sbh == null) {
            byte[] bArr = {(byte) getBiometricSubtype()};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{8});
            treeMap.put(130, bArr);
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 9});
            this.f228977sbh = new StandardBiometricHeader(treeMap);
        }
        return this.f228977sbh;
    }

    public int getVerticalOrientation() {
        return this.verticalOrientation;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public int hashCode() {
        int iB = (((((((((((((((((n.b(((((super.hashCode() * 31) + this.boundaryExtraction) * 31) + this.captureDeviceId) * 31, 31, this.deviceUniqueId) + this.horizontalOrientation) * 31) + this.imageFormat) * 31) + this.imageTransformation) * 31) + this.intensityDepth) * 31) + this.irisDiameter) * 31) + this.irisOcclusion) * 31) + this.occlusionFilling) * 31) + this.rawImageHeight) * 31) + this.rawImageWidth) * 31;
        long j2 = this.recordLength;
        int i = (iB + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        StandardBiometricHeader standardBiometricHeader = this.f228977sbh;
        return ((((i + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode())) * 31) + this.scanType) * 31) + this.verticalOrientation;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int i = dataInputStream.readInt();
        if (i != FORMAT_IDENTIFIER) {
            throw new IllegalArgumentException(a.n(i, new StringBuilder("'IIR' marker expected! Found ")));
        }
        int i2 = dataInputStream.readInt();
        if (i2 != VERSION_NUMBER) {
            throw new IllegalArgumentException(a.n(i2, new StringBuilder("'010' version number expected! Found ")));
        }
        long j2 = dataInputStream.readInt();
        this.recordLength = j2;
        long j3 = j2 - 45;
        this.captureDeviceId = dataInputStream.readUnsignedShort();
        int unsignedByte = dataInputStream.readUnsignedByte();
        int unsignedShort = dataInputStream.readUnsignedShort();
        if (unsignedShort != 45) {
            throw new IllegalArgumentException(d.n("Expected header length 45, found ", unsignedShort));
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        this.horizontalOrientation = unsignedShort2 & 3;
        this.verticalOrientation = (unsignedShort2 & 12) >> 2;
        this.scanType = (unsignedShort2 & 112) >> 4;
        this.irisOcclusion = (unsignedShort2 & 128) >> 7;
        this.occlusionFilling = (unsignedShort2 & 256) >> 8;
        this.boundaryExtraction = (unsignedShort2 & 512) >> 9;
        this.irisDiameter = dataInputStream.readUnsignedShort();
        this.imageFormat = dataInputStream.readUnsignedShort();
        this.rawImageWidth = dataInputStream.readUnsignedShort();
        this.rawImageHeight = dataInputStream.readUnsignedShort();
        this.intensityDepth = dataInputStream.readUnsignedByte();
        this.imageTransformation = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[16];
        this.deviceUniqueId = bArr;
        dataInputStream.readFully(bArr);
        long recordLength = 0;
        for (int i3 = 0; i3 < unsignedByte; i3++) {
            IrisBiometricSubtypeInfo irisBiometricSubtypeInfo = new IrisBiometricSubtypeInfo(inputStream, this.imageFormat);
            recordLength += irisBiometricSubtypeInfo.getRecordLength();
            add(irisBiometricSubtypeInfo);
        }
        if (j3 != recordLength) {
            Logger logger = LOGGER;
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j3, "ConstructedDataLength and dataLength differ: dataLength = ", ", constructedDataLength = ");
            sbV.append(recordLength);
            logger.warning(sbV.toString());
        }
    }

    public void removeIrisBiometricSubtypeInfo(int i) {
        remove(i);
    }

    public String toString() {
        return "IrisInfo []";
    }

    @Override // org.jmrtd.lds.AbstractListInfo, org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) throws IOException {
        List<IrisBiometricSubtypeInfo> subRecords = getSubRecords();
        Iterator<IrisBiometricSubtypeInfo> it8 = subRecords.iterator();
        int recordLength = 0;
        while (it8.hasNext()) {
            recordLength = (int) (it8.next().getRecordLength() + ((long) recordLength));
        }
        int i = recordLength + 45;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        dataOutputStream.writeInt(i);
        dataOutputStream.writeShort(this.captureDeviceId);
        dataOutputStream.writeByte(subRecords.size());
        dataOutputStream.writeShort(45);
        dataOutputStream.writeShort((this.horizontalOrientation & 3) | ((this.verticalOrientation << 2) & 12) | ((this.scanType << 4) & 112) | ((this.irisOcclusion << 7) & 128) | ((this.occlusionFilling << 8) & 256) | ((this.boundaryExtraction << 9) & 512));
        dataOutputStream.writeShort(this.irisDiameter);
        dataOutputStream.writeShort(this.imageFormat);
        dataOutputStream.writeShort(this.rawImageWidth);
        dataOutputStream.writeShort(this.rawImageHeight);
        dataOutputStream.writeByte(this.intensityDepth);
        dataOutputStream.writeByte(this.imageTransformation);
        dataOutputStream.write(this.deviceUniqueId);
        Iterator<IrisBiometricSubtypeInfo> it9 = subRecords.iterator();
        while (it9.hasNext()) {
            it9.next().writeObject(outputStream);
        }
    }

    public IrisInfo(StandardBiometricHeader standardBiometricHeader, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59, int i66, int i74, byte[] bArr, List<IrisBiometricSubtypeInfo> list) {
        this.f228977sbh = standardBiometricHeader;
        if (list == null) {
            throw new IllegalArgumentException("Null irisBiometricSubtypeInfos");
        }
        this.captureDeviceId = i;
        this.horizontalOrientation = i2;
        this.verticalOrientation = i3;
        this.scanType = i5;
        this.irisOcclusion = i6;
        this.occlusionFilling = i21;
        this.boundaryExtraction = i22;
        this.irisDiameter = i32;
        this.imageFormat = i33;
        this.rawImageWidth = i43;
        this.rawImageHeight = i59;
        this.intensityDepth = i66;
        this.imageTransformation = i74;
        long recordLength = 0;
        for (IrisBiometricSubtypeInfo irisBiometricSubtypeInfo : list) {
            recordLength += irisBiometricSubtypeInfo.getRecordLength();
            add(irisBiometricSubtypeInfo);
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("deviceUniqueId invalid");
        }
        byte[] bArr2 = new byte[16];
        this.deviceUniqueId = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.recordLength = recordLength + 45;
    }

    public IrisInfo(InputStream inputStream) throws IOException {
        this(null, inputStream);
    }

    public IrisInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this.f228977sbh = standardBiometricHeader;
        readObject(inputStream);
    }
}
