package org.jmrtd.lds.iso19794;

import j6.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import kii.e;
import net.sf.scuba.data.Gender;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jmrtd.lds.AbstractImageInfo;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageInfo extends AbstractImageInfo {
    public static final short EXPRESSION_EYES_LOOKING_AWAY = 5;
    public static final short EXPRESSION_FROWNING = 7;
    public static final short EXPRESSION_NEUTRAL = 1;
    public static final short EXPRESSION_RAISED_EYEBROWS = 4;
    public static final short EXPRESSION_SMILE_CLOSED = 2;
    public static final short EXPRESSION_SMILE_OPEN = 3;
    public static final short EXPRESSION_SQUINTING = 6;
    public static final short EXPRESSION_UNSPECIFIED = 0;
    public static final int EYE_COLOR_BLACK = 1;
    public static final int EYE_COLOR_BLUE = 2;
    public static final int EYE_COLOR_BROWN = 3;
    public static final int EYE_COLOR_GRAY = 4;
    public static final int EYE_COLOR_GREEN = 5;
    public static final int EYE_COLOR_MULTI_COLORED = 6;
    public static final int EYE_COLOR_PINK = 7;
    public static final int EYE_COLOR_UNKNOWN = 255;
    public static final int EYE_COLOR_UNSPECIFIED = 0;
    public static final int FACE_IMAGE_TYPE_BASIC = 0;
    public static final int FACE_IMAGE_TYPE_FULL_FRONTAL = 1;
    public static final int FACE_IMAGE_TYPE_TOKEN_FRONTAL = 2;
    private static final int FEATURE_BEARD_FLAG = 8;
    private static final int FEATURE_BLINK_FLAG = 32;
    private static final int FEATURE_DARK_GLASSES = 512;
    private static final int FEATURE_DISTORTING_MEDICAL_CONDITION = 1024;
    private static final int FEATURE_FEATURES_ARE_SPECIFIED_FLAG = 1;
    private static final int FEATURE_GLASSES_FLAG = 2;
    private static final int FEATURE_LEFT_EYE_PATCH_FLAG = 128;
    private static final int FEATURE_MOUSTACHE_FLAG = 4;
    private static final int FEATURE_MOUTH_OPEN_FLAG = 64;
    private static final int FEATURE_RIGHT_EYE_PATCH = 256;
    private static final int FEATURE_TEETH_VISIBLE_FLAG = 16;
    public static final int HAIR_COLOR_BALD = 1;
    public static final int HAIR_COLOR_BLACK = 2;
    public static final int HAIR_COLOR_BLONDE = 3;
    public static final int HAIR_COLOR_BLUE = 9;
    public static final int HAIR_COLOR_BROWN = 4;
    public static final int HAIR_COLOR_GRAY = 5;
    public static final int HAIR_COLOR_GREEN = 8;
    public static final int HAIR_COLOR_RED = 7;
    public static final int HAIR_COLOR_UNKNOWN = 255;
    public static final int HAIR_COLOR_UNSPECIFIED = 0;
    public static final int HAIR_COLOR_WHITE = 6;
    public static final int IMAGE_COLOR_SPACE_GRAY8 = 3;
    public static final int IMAGE_COLOR_SPACE_OTHER = 4;
    public static final int IMAGE_COLOR_SPACE_RGB24 = 1;
    public static final int IMAGE_COLOR_SPACE_UNSPECIFIED = 0;
    public static final int IMAGE_COLOR_SPACE_YUV422 = 2;
    public static final int IMAGE_DATA_TYPE_JPEG = 0;
    public static final int IMAGE_DATA_TYPE_JPEG2000 = 1;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int PITCH = 1;
    private static final int ROLL = 2;
    public static final int SOURCE_TYPE_STATIC_PHOTO_DIGITAL_CAM = 2;
    public static final int SOURCE_TYPE_STATIC_PHOTO_SCANNER = 3;
    public static final int SOURCE_TYPE_STATIC_PHOTO_UNKNOWN_SOURCE = 1;
    public static final int SOURCE_TYPE_UNKNOWN = 7;
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int SOURCE_TYPE_VIDEO_FRAME_ANALOG_CAM = 5;
    public static final int SOURCE_TYPE_VIDEO_FRAME_DIGITAL_CAM = 6;
    public static final int SOURCE_TYPE_VIDEO_FRAME_UNKNOWN_SOURCE = 4;
    private static final int YAW = 0;
    private static final long serialVersionUID = -1751069410327594067L;
    private int colorSpace;
    private int deviceType;
    private int expression;
    private EyeColor eyeColor;
    private int faceImageType;
    private int featureMask;
    private FeaturePoint[] featurePoints;
    private Gender gender;
    private int hairColor;
    private int imageDataType;
    private int[] poseAngle;
    private int[] poseAngleUncertainty;
    private int quality;
    private long recordLength;
    private int sourceType;

    public enum Expression {
        UNSPECIFIED,
        NEUTRAL,
        SMILE_CLOSED,
        SMILE_OPEN,
        RAISED_EYEBROWS,
        EYES_LOOKING_AWAY,
        SQUINTING,
        FROWNING
    }

    public enum EyeColor {
        UNSPECIFIED(0),
        BLACK(1),
        BLUE(2),
        BROWN(3),
        GRAY(4),
        GREEN(5),
        MULTI_COLORED(6),
        PINK(7),
        UNKNOWN(255);

        private int code;

        EyeColor(int i) {
            this.code = i;
        }

        public static EyeColor toEyeColor(int i) {
            for (EyeColor eyeColor : values()) {
                if (eyeColor.toInt() == i) {
                    return eyeColor;
                }
            }
            return UNKNOWN;
        }

        public int toInt() {
            return this.code;
        }
    }

    public enum FaceImageType {
        BASIC,
        FULL_FRONTAL,
        TOKEN_FRONTAL
    }

    public enum Features {
        FEATURES_ARE_SPECIFIED,
        GLASSES,
        MOUSTACHE,
        BEARD,
        TEETH_VISIBLE,
        BLINK,
        MOUTH_OPEN,
        LEFT_EYE_PATCH,
        RIGHT_EYE_PATCH,
        DARK_GLASSES,
        DISTORTING_MEDICAL_CONDITION
    }

    public enum HairColor {
        UNSPECIFIED(0),
        BALD(1),
        BLACK(2),
        BLONDE(3),
        BROWN(4),
        GRAY(5),
        WHITE(6),
        RED(7),
        GREEN(8),
        BLUE(9),
        UNKNOWN(255);

        private int code;

        HairColor(int i) {
            this.code = i;
        }

        public static HairColor toHairColor(int i) {
            for (HairColor hairColor : values()) {
                if (hairColor.toInt() == i) {
                    return hairColor;
                }
            }
            return UNKNOWN;
        }

        public int toInt() {
            return this.code;
        }
    }

    public enum ImageColorSpace {
        UNSPECIFIED,
        RGB24,
        YUV422,
        GRAY8,
        OTHER
    }

    public enum ImageDataType {
        TYPE_JPEG,
        TYPE_JPEG2000
    }

    public enum SourceType {
        UNSPECIFIED,
        STATIC_PHOTO_UNKNOWN_SOURCE,
        STATIC_PHOTO_DIGITAL_CAM,
        STATIC_PHOTO_SCANNER,
        VIDEO_FRAME_UNKNOWN_SOURCE,
        VIDEO_FRAME_ANALOG_CAM,
        VIDEO_FRAME_DIGITAL_CAM,
        UNKNOWN
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceImageInfo(Gender gender, EyeColor eyeColor, int i, int i2, int i3, int[] iArr, int[] iArr2, int i5, int i6, int i21, int i22, int i32, FeaturePoint[] featurePointArr, int i33, int i43, InputStream inputStream, int i59, int i66) throws IOException {
        long j2 = i59;
        super(0, i33, i43, inputStream, j2, toMimeType(i66));
        if (inputStream == null) {
            throw new IllegalArgumentException("Null image");
        }
        this.gender = gender == null ? Gender.UNSPECIFIED : gender;
        this.eyeColor = eyeColor == null ? EyeColor.UNSPECIFIED : eyeColor;
        this.featureMask = i;
        this.hairColor = i2;
        this.expression = i3;
        this.colorSpace = i6;
        this.sourceType = i21;
        this.deviceType = i22;
        int length = featurePointArr == null ? 0 : featurePointArr.length;
        FeaturePoint[] featurePointArr2 = new FeaturePoint[length];
        this.featurePoints = featurePointArr2;
        if (length > 0) {
            System.arraycopy(featurePointArr, 0, featurePointArr2, 0, length);
        }
        int[] iArr3 = new int[3];
        this.poseAngle = iArr3;
        System.arraycopy(iArr, 0, iArr3, 0, 3);
        int[] iArr4 = new int[3];
        this.poseAngleUncertainty = iArr4;
        System.arraycopy(iArr2, 0, iArr4, 0, 3);
        this.imageDataType = i66;
        this.recordLength = ((long) (length * 8)) + 32 + j2;
        this.faceImageType = i5;
        this.colorSpace = i6;
        this.sourceType = i21;
        this.deviceType = i22;
        this.quality = i32;
    }

    private String expressionToString() {
        switch (this.expression) {
            case 0:
                return "unspecified";
            case 1:
                return "neutral (non-smiling) with both eyes open and mouth closed";
            case 2:
                return "a smile where the inside of the mouth and/or teeth is not exposed (closed jaw)";
            case 3:
                return "a smile where the inside of the mouth and/or teeth is exposed";
            case 4:
                return "raised eyebrows";
            case 5:
                return "eyes looking away from the camera";
            case 6:
                return "squinting";
            case 7:
                return "frowning";
            default:
                return "unknown";
        }
    }

    private String faceImageTypeToString() {
        int i = this.faceImageType;
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "token frontal" : "full frontal" : "basic";
    }

    private String featureMaskToString() {
        if ((this.featureMask & 1) == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.featureMask & 2) != 0) {
            arrayList.add("glasses");
        }
        if ((this.featureMask & 4) != 0) {
            arrayList.add("moustache");
        }
        if ((this.featureMask & 8) != 0) {
            arrayList.add("beard");
        }
        if ((this.featureMask & 16) != 0) {
            arrayList.add("teeth visible");
        }
        if ((this.featureMask & 32) != 0) {
            arrayList.add("blink");
        }
        if ((this.featureMask & 64) != 0) {
            arrayList.add("mouth open");
        }
        if ((this.featureMask & 128) != 0) {
            arrayList.add("left eye patch");
        }
        if ((this.featureMask & 256) != 0) {
            arrayList.add("right eye patch");
        }
        if ((this.featureMask & 512) != 0) {
            arrayList.add("dark glasses");
        }
        if ((this.featureMask & 1024) != 0) {
            arrayList.add("distorting medical condition (which could impact feature point detection)");
        }
        StringBuilder sb6 = new StringBuilder();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            sb6.append((String) it8.next());
            if (it8.hasNext()) {
                sb6.append(", ");
            }
        }
        return sb6.toString();
    }

    private String hairColorToString() {
        switch (this.hairColor) {
            case 0:
                return "unspecified";
            case 1:
                return "bald";
            case 2:
                return "black";
            case 3:
                return "blonde";
            case 4:
                return "brown";
            case 5:
                return "gray";
            case 6:
                return "white";
            case 7:
                return "red";
            case 8:
                return "green";
            case 9:
                return "blue";
            default:
                return "unknown";
        }
    }

    private String poseAngleToString() {
        StringBuilder sb6 = new StringBuilder("(y: ");
        sb6.append(this.poseAngle[0]);
        if (this.poseAngleUncertainty[0] != 0) {
            sb6.append(" (");
            sb6.append(this.poseAngleUncertainty[0]);
            sb6.append(")");
        }
        sb6.append(", p:");
        sb6.append(this.poseAngle[1]);
        if (this.poseAngleUncertainty[1] != 0) {
            sb6.append(" (");
            sb6.append(this.poseAngleUncertainty[1]);
            sb6.append(")");
        }
        sb6.append(", r: ");
        sb6.append(this.poseAngle[2]);
        if (this.poseAngleUncertainty[2] != 0) {
            sb6.append(" (");
            sb6.append(this.poseAngleUncertainty[2]);
            sb6.append(")");
        }
        sb6.append(")");
        return sb6.toString();
    }

    private String sourceTypeToString() {
        switch (this.sourceType) {
            case 0:
                return "unspecified";
            case 1:
                return "static photograph from an unknown source";
            case 2:
                return "static photograph from a digital still-image camera";
            case 3:
                return "static photograph from a scanner";
            case 4:
                return "single video frame from an unknown source";
            case 5:
                return "single video frame from an analogue camera";
            case 6:
                return "single video frame from a digital camera";
            default:
                return "unknown";
        }
    }

    private static String toMimeType(int i) {
        if (i == 0) {
            return "image/jpeg";
        }
        if (i == 1) {
            return "image/jp2";
        }
        LOGGER.warning("Unknown image type: " + i);
        return null;
    }

    private void writeFacialRecordData(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.featurePoints.length);
        Gender gender = this.gender;
        if (gender == null) {
            gender = Gender.UNSPECIFIED;
        }
        dataOutputStream.writeByte(gender.toInt());
        EyeColor eyeColor = this.eyeColor;
        if (eyeColor == null) {
            eyeColor = EyeColor.UNSPECIFIED;
        }
        dataOutputStream.writeByte(eyeColor.toInt());
        dataOutputStream.writeByte(this.hairColor);
        dataOutputStream.writeByte((byte) ((((long) this.featureMask) & 16711680) >> 16));
        dataOutputStream.writeByte((byte) ((((long) this.featureMask) & 65280) >> 8));
        dataOutputStream.writeByte((byte) (((long) this.featureMask) & 255));
        dataOutputStream.writeShort(this.expression);
        for (int i = 0; i < 3; i++) {
            dataOutputStream.writeByte(this.poseAngle[i]);
        }
        for (int i2 = 0; i2 < 3; i2++) {
            dataOutputStream.writeByte(this.poseAngleUncertainty[i2]);
        }
        for (FeaturePoint featurePoint : this.featurePoints) {
            dataOutputStream.writeByte(featurePoint.getType());
            dataOutputStream.writeByte((featurePoint.getMajorCode() << 4) | featurePoint.getMinorCode());
            dataOutputStream.writeShort(featurePoint.getX());
            dataOutputStream.writeShort(featurePoint.getY());
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.writeByte(this.faceImageType);
        dataOutputStream.writeByte(this.imageDataType);
        dataOutputStream.writeShort(getWidth());
        dataOutputStream.writeShort(getHeight());
        dataOutputStream.writeByte(this.colorSpace);
        dataOutputStream.writeByte(this.sourceType);
        dataOutputStream.writeShort(this.deviceType);
        dataOutputStream.writeShort(this.quality);
        writeImage(dataOutputStream);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!super.equals(obj2) || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageInfo faceImageInfo = (FaceImageInfo) obj2;
        return this.colorSpace == faceImageInfo.colorSpace && this.deviceType == faceImageInfo.deviceType && this.expression == faceImageInfo.expression && this.eyeColor == faceImageInfo.eyeColor && this.faceImageType == faceImageInfo.faceImageType && this.featureMask == faceImageInfo.featureMask && Arrays.equals(this.featurePoints, faceImageInfo.featurePoints) && this.gender == faceImageInfo.gender && this.hairColor == faceImageInfo.hairColor && this.imageDataType == faceImageInfo.imageDataType && Arrays.equals(this.poseAngle, faceImageInfo.poseAngle) && Arrays.equals(this.poseAngleUncertainty, faceImageInfo.poseAngleUncertainty) && this.quality == faceImageInfo.quality && this.recordLength == faceImageInfo.recordLength && this.sourceType == faceImageInfo.sourceType;
    }

    public int getColorSpace() {
        return this.colorSpace;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public int getExpression() {
        return this.expression;
    }

    public EyeColor getEyeColor() {
        return this.eyeColor;
    }

    public int getFaceImageType() {
        return this.faceImageType;
    }

    public int getFeatureMask() {
        return this.featureMask;
    }

    public FeaturePoint[] getFeaturePoints() {
        return this.featurePoints;
    }

    public Gender getGender() {
        return this.gender;
    }

    public int getHairColor() {
        return this.hairColor;
    }

    public int getImageDataType() {
        return this.imageDataType;
    }

    public int[] getPoseAngle() {
        int[] iArr = new int[3];
        System.arraycopy(this.poseAngle, 0, iArr, 0, 3);
        return iArr;
    }

    public int[] getPoseAngleUncertainty() {
        int[] iArr = new int[3];
        System.arraycopy(this.poseAngleUncertainty, 0, iArr, 0, 3);
        return iArr;
    }

    public int getQuality() {
        return this.quality;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        return this.recordLength;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 31) + this.colorSpace) * 31) + this.deviceType) * 31) + this.expression) * 31;
        EyeColor eyeColor = this.eyeColor;
        int iHashCode2 = (((((((iHashCode + (eyeColor == null ? 0 : eyeColor.hashCode())) * 31) + this.faceImageType) * 31) + this.featureMask) * 31) + Arrays.hashCode(this.featurePoints)) * 31;
        Gender gender = this.gender;
        int iHashCode3 = (((Arrays.hashCode(this.poseAngleUncertainty) + ((Arrays.hashCode(this.poseAngle) + ((((((iHashCode2 + (gender != null ? gender.hashCode() : 0)) * 31) + this.hairColor) * 31) + this.imageDataType) * 31)) * 31)) * 31) + this.quality) * 31;
        long j2 = this.recordLength;
        return ((iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.sourceType;
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.recordLength = ((long) dataInputStream.readInt()) & BodyPartID.bodyIdMax;
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.gender = Gender.getInstance(dataInputStream.readUnsignedByte());
        this.eyeColor = EyeColor.toEyeColor(dataInputStream.readUnsignedByte());
        this.hairColor = dataInputStream.readUnsignedByte();
        int unsignedByte = dataInputStream.readUnsignedByte();
        this.featureMask = unsignedByte;
        this.featureMask = (unsignedByte << 16) | dataInputStream.readUnsignedShort();
        this.expression = dataInputStream.readShort();
        this.poseAngle = new int[3];
        this.poseAngle[0] = dataInputStream.readUnsignedByte();
        this.poseAngle[1] = dataInputStream.readUnsignedByte();
        this.poseAngle[2] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty = new int[]{dataInputStream.readUnsignedByte(), 0, 0};
        this.poseAngleUncertainty[1] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty[2] = dataInputStream.readUnsignedByte();
        this.featurePoints = new FeaturePoint[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            int unsignedByte2 = dataInputStream.readUnsignedByte();
            byte b4 = dataInputStream.readByte();
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            int unsignedShort3 = dataInputStream.readUnsignedShort();
            for (long jSkip = 0; jSkip < 2; jSkip += dataInputStream.skip(2L)) {
            }
            this.featurePoints[i] = new FeaturePoint(unsignedByte2, b4, unsignedShort2, unsignedShort3);
        }
        this.faceImageType = dataInputStream.readUnsignedByte();
        this.imageDataType = dataInputStream.readUnsignedByte();
        setWidth(dataInputStream.readUnsignedShort());
        setHeight(dataInputStream.readUnsignedShort());
        this.colorSpace = dataInputStream.readUnsignedByte();
        this.sourceType = dataInputStream.readUnsignedByte();
        this.deviceType = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedShort();
        if (getWidth() <= 0) {
            setWidth(800);
        }
        if (getHeight() <= 0) {
            setHeight(600);
        }
        setMimeType(toMimeType(this.imageDataType));
        readImage(inputStream, ((this.recordLength - 20) - ((long) (unsignedShort * 8))) - 12);
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceImageInfo [Image size: ");
        sb6.append(getWidth());
        sb6.append(" x ");
        sb6.append(getHeight());
        sb6.append(", Gender: ");
        Gender gender = this.gender;
        if (gender == null) {
            gender = Gender.UNSPECIFIED;
        }
        sb6.append(gender);
        sb6.append(", Eye color: ");
        EyeColor eyeColor = this.eyeColor;
        if (eyeColor == null) {
            eyeColor = EyeColor.UNSPECIFIED;
        }
        sb6.append(eyeColor);
        sb6.append(", Hair color: ");
        sb6.append(hairColorToString());
        sb6.append(", Feature mask: ");
        sb6.append(featureMaskToString());
        sb6.append(", Expression: ");
        sb6.append(expressionToString());
        sb6.append(", Pose angle: ");
        sb6.append(poseAngleToString());
        sb6.append(", Face image type: ");
        sb6.append(faceImageTypeToString());
        sb6.append(", Source type: ");
        sb6.append(sourceTypeToString());
        sb6.append(", FeaturePoints [");
        FeaturePoint[] featurePointArr = this.featurePoints;
        if (featurePointArr != null && featurePointArr.length > 0) {
            boolean z = true;
            for (FeaturePoint featurePoint : featurePointArr) {
                if (z) {
                    z = false;
                } else {
                    sb6.append(", ");
                }
                sb6.append(featurePoint.toString());
            }
        }
        sb6.append("]]");
        return sb6.toString();
    }

    @Override // org.jmrtd.lds.AbstractImageInfo
    public void writeObject(OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeFacialRecordData(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = ((long) byteArray.length) + 4;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt((int) length);
        dataOutputStream.write(byteArray);
        dataOutputStream.flush();
    }

    public static class FeaturePoint implements Serializable {
        private static final long serialVersionUID = -4209679423938065215L;
        private int majorCode;
        private int minorCode;
        private int type;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f228973x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f228974y;

        public FeaturePoint(int i, int i2, int i3, int i5, int i6) {
            this.type = i;
            this.majorCode = i2;
            this.minorCode = i3;
            this.f228973x = i5;
            this.f228974y = i6;
        }

        public int getMajorCode() {
            return this.majorCode;
        }

        public int getMinorCode() {
            return this.minorCode;
        }

        public int getType() {
            return this.type;
        }

        public int getX() {
            return this.f228973x;
        }

        public int getY() {
            return this.f228974y;
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("( point: ");
            sb6.append(getMajorCode());
            sb6.append(".");
            sb6.append(getMinorCode());
            sb6.append(", type: ");
            e.y(sb6, ", (", this.type);
            sb6.append(this.f228973x);
            sb6.append(", ");
            return a.v(sb6, "))", this.f228974y);
        }

        public FeaturePoint(int i, byte b4, int i2, int i3) {
            this(i, (b4 & 240) >> 4, b4 & 15, i2, i3);
        }
    }

    public FaceImageInfo(InputStream inputStream) throws IOException {
        super(0);
        readObject(inputStream);
    }
}
