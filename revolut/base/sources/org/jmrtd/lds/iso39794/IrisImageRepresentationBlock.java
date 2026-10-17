package org.jmrtd.lds.iso39794;

import ehe.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.jmrtd.ASN1Util;
import org.jmrtd.lds.ImageInfo;

/* JADX INFO: loaded from: classes14.dex */
public class IrisImageRepresentationBlock extends Block implements ImageInfo {
    private static final long serialVersionUID = -982987535985932641L;
    private int bitDepth;
    private DateTimeBlock captureDateTimeBlock;
    private IrisImageCaptureDeviceBlock captureDeviceBlock;
    private CompressionHistoryCode compressionHistoryCode;
    private EyeLabelCode eyeLabelCode;
    private HorizontalOrientationCode horizontalOrientationCode;
    private byte[] imageData;
    private ImageDataFormatCode imageDataFormatCode;
    private IrisImageKindCode irisImageKind;
    private IrisImageLocalisationBlock localisationBlock;
    private PADDataBlock padDataBlock;
    private List<QualityBlock> qualityBlocks;
    private Integer range;
    private RangingErrorCode rangingErrorCode;
    private RollAngleBlock rollAngleBlock;
    private VerticalOrientationCode verticalOrientationCode;

    public enum CompressionHistoryCode implements EncodableEnum<CompressionHistoryCode> {
        UNDEFINED(0),
        LOSSLESS_OR_NONE(1),
        LOSSY(2);

        private int code;

        CompressionHistoryCode(int i) {
            this.code = i;
        }

        public static CompressionHistoryCode fromCode(int i) {
            return (CompressionHistoryCode) EncodableEnum.fromCode(i, CompressionHistoryCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum EyeLabelCode implements EncodableEnum<EyeLabelCode> {
        UNKNOWN(0),
        RIGHT_IRIS(1),
        LEFT_IRIS(2);

        private int code;

        EyeLabelCode(int i) {
            this.code = i;
        }

        public static EyeLabelCode fromCode(int i) {
            return (EyeLabelCode) EncodableEnum.fromCode(i, EyeLabelCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum HorizontalOrientationCode implements EncodableEnum<HorizontalOrientationCode> {
        UNDEFINED(0),
        LEFT_TO_RIGHT(1),
        RIGHT_TO_LEFT(2);

        private int code;

        HorizontalOrientationCode(int i) {
            this.code = i;
        }

        public static HorizontalOrientationCode fromCode(int i) {
            return (HorizontalOrientationCode) EncodableEnum.fromCode(i, HorizontalOrientationCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum ImageDataFormatCode implements EncodableEnum<ImageDataFormatCode> {
        PGM(0, "image/pgm"),
        PPM(1, "image/ppm"),
        PNG(2, "image/png"),
        JPEG2000_LOSSLESS(3, "image/jp2"),
        JPEG2000_LOSSY(4, "image/jp2");

        private int code;
        private String mimeType;

        ImageDataFormatCode(int i, String str) {
            this.code = i;
            this.mimeType = str;
        }

        public static ImageDataFormatCode fromCode(int i) {
            return (ImageDataFormatCode) EncodableEnum.fromCode(i, ImageDataFormatCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }

        public String getMimeType() {
            return this.mimeType;
        }
    }

    public enum IrisImageKindCode implements EncodableEnum<IrisImageKindCode> {
        UNCROPPED(1),
        VGA(2),
        CROPPED(3),
        CROPPED_AND_MASKED(7);

        private int code;

        IrisImageKindCode(int i) {
            this.code = i;
        }

        public static IrisImageKindCode fromCode(int i) {
            return (IrisImageKindCode) EncodableEnum.fromCode(i, IrisImageKindCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum RangingErrorCode implements EncodableEnum<RangingErrorCode> {
        UNASSIGNED(0),
        FAILED(1),
        OVERFLOW(2);

        private int code;

        RangingErrorCode(int i) {
            this.code = i;
        }

        public static RangingErrorCode fromCode(int i) {
            return (RangingErrorCode) EncodableEnum.fromCode(i, RangingErrorCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum VerticalOrientationCode implements EncodableEnum<VerticalOrientationCode> {
        UNDEFINED(0),
        TOP_TO_BOTTOM(1),
        BOTTOM_TO_TOP(2);

        private int code;

        VerticalOrientationCode(int i) {
            this.code = i;
        }

        public static VerticalOrientationCode fromCode(int i) {
            return (VerticalOrientationCode) EncodableEnum.fromCode(i, VerticalOrientationCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public IrisImageRepresentationBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new IllegalArgumentException("Cannot decode!");
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.eyeLabelCode = EyeLabelCode.fromCode(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0)));
        this.irisImageKind = IrisImageKindCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
        this.bitDepth = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(2));
        this.imageDataFormatCode = ImageDataFormatCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(3)).intValue());
        this.horizontalOrientationCode = HorizontalOrientationCode.fromCode(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(4)));
        this.verticalOrientationCode = VerticalOrientationCode.fromCode(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(5)));
        this.compressionHistoryCode = CompressionHistoryCode.fromCode(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(6)));
        decodeRangeOrError(mapDecodeTaggedObjects.get(7));
        this.captureDateTimeBlock = new DateTimeBlock(mapDecodeTaggedObjects.get(8));
        this.imageData = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(9)).getOctets();
        if (mapDecodeTaggedObjects.containsKey(10)) {
            this.captureDeviceBlock = new IrisImageCaptureDeviceBlock(mapDecodeTaggedObjects.get(10));
        }
        if (mapDecodeTaggedObjects.containsKey(11)) {
            this.qualityBlocks = QualityBlock.decodeQualityBlocks(mapDecodeTaggedObjects.get(11));
        }
        if (mapDecodeTaggedObjects.containsKey(12)) {
            this.rollAngleBlock = new RollAngleBlock(mapDecodeTaggedObjects.get(12));
        }
        if (mapDecodeTaggedObjects.containsKey(13)) {
            this.localisationBlock = new IrisImageLocalisationBlock(mapDecodeTaggedObjects.get(13));
        }
        if (mapDecodeTaggedObjects.containsKey(14)) {
            this.padDataBlock = new PADDataBlock(mapDecodeTaggedObjects.get(14));
        }
    }

    private void decodeRangeOrError(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.range = Integer.valueOf(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0)));
            this.rangingErrorCode = null;
        } else if (mapDecodeTaggedObjects.containsKey(1)) {
            this.range = null;
            this.rangingErrorCode = RangingErrorCode.fromCode(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1)));
        }
    }

    public static List<IrisImageRepresentationBlock> decodeRepresentationBlocks(ASN1Encodable aSN1Encodable) {
        ArrayList arrayList = new ArrayList();
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            arrayList.add(new IrisImageRepresentationBlock(aSN1Encodable));
            return arrayList;
        }
        Iterator<ASN1Encodable> it8 = ASN1Util.list(aSN1Encodable).iterator();
        while (it8.hasNext()) {
            arrayList.add(new IrisImageRepresentationBlock(it8.next()));
        }
        return arrayList;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        IrisImageRepresentationBlock irisImageRepresentationBlock = (IrisImageRepresentationBlock) obj2;
        return this.bitDepth == irisImageRepresentationBlock.bitDepth && Objects.equals(this.captureDateTimeBlock, irisImageRepresentationBlock.captureDateTimeBlock) && Objects.equals(this.captureDeviceBlock, irisImageRepresentationBlock.captureDeviceBlock) && this.compressionHistoryCode == irisImageRepresentationBlock.compressionHistoryCode && this.eyeLabelCode == irisImageRepresentationBlock.eyeLabelCode && this.horizontalOrientationCode == irisImageRepresentationBlock.horizontalOrientationCode && Arrays.equals(this.imageData, irisImageRepresentationBlock.imageData) && this.imageDataFormatCode == irisImageRepresentationBlock.imageDataFormatCode && this.irisImageKind == irisImageRepresentationBlock.irisImageKind && Objects.equals(this.localisationBlock, irisImageRepresentationBlock.localisationBlock) && Objects.equals(this.padDataBlock, irisImageRepresentationBlock.padDataBlock) && Objects.equals(this.qualityBlocks, irisImageRepresentationBlock.qualityBlocks) && Objects.equals(this.range, irisImageRepresentationBlock.range) && this.rangingErrorCode == irisImageRepresentationBlock.rangingErrorCode && Objects.equals(this.rollAngleBlock, irisImageRepresentationBlock.rollAngleBlock) && this.verticalOrientationCode == irisImageRepresentationBlock.verticalOrientationCode;
    }

    public byte[] geImageData() {
        return this.imageData;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeInt(this.eyeLabelCode.getCode()));
        map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.irisImageKind.getCode()));
        map.put(2, ASN1Util.encodeInt(this.bitDepth));
        map.put(3, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.imageDataFormatCode.getCode()));
        map.put(4, ASN1Util.encodeInt(this.horizontalOrientationCode.getCode()));
        map.put(5, ASN1Util.encodeInt(this.verticalOrientationCode.getCode()));
        map.put(6, ASN1Util.encodeInt(this.compressionHistoryCode.getCode()));
        if (this.range != null) {
            map.put(7, ASN1Util.encodeInt(this.range.intValue()));
        } else if (this.rangingErrorCode != null) {
            map.put(7, ASN1Util.encodeInt(this.rangingErrorCode.getCode()));
        }
        map.put(8, this.captureDateTimeBlock.getASN1Object());
        map.put(9, new DEROctetString(this.imageData));
        if (this.captureDeviceBlock != null) {
            map.put(10, this.captureDeviceBlock.getASN1Object());
        }
        if (this.qualityBlocks != null) {
            map.put(10, ISO39794Util.encodeBlocks(this.qualityBlocks));
        }
        if (this.rollAngleBlock != null) {
            map.put(12, this.rollAngleBlock.getASN1Object());
        }
        if (this.localisationBlock != null) {
            map.put(13, this.localisationBlock.getASN1Object());
        }
        if (this.padDataBlock != null) {
            map.put(14, this.padDataBlock.getASN1Object());
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public int getBiometricSubtype() {
        EyeLabelCode eyeLabelCode = this.eyeLabelCode;
        return eyeLabelCode == null ? EyeLabelCode.UNKNOWN.getCode() : eyeLabelCode.getCode();
    }

    public int getBitDepth() {
        return this.bitDepth;
    }

    public IrisImageCaptureDeviceBlock getCaptureDeviceBlock() {
        return this.captureDeviceBlock;
    }

    public CompressionHistoryCode getCompressionHistoryCode() {
        return this.compressionHistoryCode;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public EyeLabelCode getEyeLabelCode() {
        return this.eyeLabelCode;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getHeight() {
        return 0;
    }

    public HorizontalOrientationCode getHorizontalOrientationCode() {
        return this.horizontalOrientationCode;
    }

    public ImageDataFormatCode getImageDataFormat() {
        return this.imageDataFormatCode;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public InputStream getImageInputStream() {
        return new ByteArrayInputStream(this.imageData);
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getImageLength() {
        byte[] bArr = this.imageData;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public IrisImageKindCode getIrisImageKind() {
        return this.irisImageKind;
    }

    public IrisImageLocalisationBlock getLocalisationBlock() {
        return this.localisationBlock;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public String getMimeType() {
        ImageDataFormatCode imageDataFormatCode = this.imageDataFormatCode;
        return imageDataFormatCode == null ? "image/raw" : imageDataFormatCode.getMimeType();
    }

    public PADDataBlock getPADDataBlock() {
        return this.padDataBlock;
    }

    public List<QualityBlock> getQualityBlocks() {
        return this.qualityBlocks;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        return 0L;
    }

    public RollAngleBlock getRollAngleBlock() {
        return this.rollAngleBlock;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getType() {
        return 3;
    }

    public VerticalOrientationCode getVerticalOrientationCode() {
        return this.verticalOrientationCode;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getWidth() {
        return 0;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.bitDepth), this.captureDateTimeBlock, this.captureDeviceBlock, this.compressionHistoryCode, this.eyeLabelCode, this.horizontalOrientationCode, this.imageDataFormatCode, this.irisImageKind, this.localisationBlock, this.padDataBlock, this.qualityBlocks, this.range, this.rangingErrorCode, this.rollAngleBlock, this.verticalOrientationCode) + n.b(31, 31, this.imageData);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("IrisImageRepresentationBlock [eyeLabelCode: ");
        sb6.append(this.eyeLabelCode);
        sb6.append(", irisImageKind: ");
        sb6.append(this.irisImageKind);
        sb6.append(", bitDepth: ");
        sb6.append(this.bitDepth);
        sb6.append(", imageDataFormat: ");
        sb6.append(this.imageDataFormatCode);
        sb6.append(", horizontalOrientationCode: ");
        sb6.append(this.horizontalOrientationCode);
        sb6.append(", verticalOrientationCode: ");
        sb6.append(this.verticalOrientationCode);
        sb6.append(", compressionHistoryCode: ");
        sb6.append(this.compressionHistoryCode);
        sb6.append(", imageData: ");
        byte[] bArr = this.imageData;
        sb6.append(bArr != null ? "null" : Integer.valueOf(bArr.length));
        sb6.append(", range: ");
        Object obj2 = this.range;
        if (obj2 == null) {
            obj2 = this.rangingErrorCode;
        }
        sb6.append(obj2);
        sb6.append(", captureDateTimeBlock: ");
        sb6.append(this.captureDateTimeBlock);
        sb6.append(", captureDeviceBlock: ");
        sb6.append(this.captureDeviceBlock);
        sb6.append(", qualityBlocks: ");
        sb6.append(this.qualityBlocks);
        sb6.append(", rollAngleBlock: ");
        sb6.append(this.rollAngleBlock);
        sb6.append(", localisationBlock: ");
        sb6.append(this.localisationBlock);
        sb6.append(", padDataBlock: ");
        sb6.append(this.padDataBlock);
        sb6.append("]");
        return sb6.toString();
    }

    public static class RollAngleBlock extends Block {
        private static final long serialVersionUID = -1867300334704286030L;
        private int angle;
        private int uncertainty;

        public RollAngleBlock(int i, int i2) {
            this.angle = i;
            this.uncertainty = i2;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 == null || getClass() != obj2.getClass()) {
                return false;
            }
            RollAngleBlock rollAngleBlock = (RollAngleBlock) obj2;
            return this.angle == rollAngleBlock.angle && this.uncertainty == rollAngleBlock.uncertainty;
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public ASN1Encodable getASN1Object() {
            HashMap map = new HashMap();
            map.put(0, ASN1Util.encodeInt(this.angle));
            map.put(1, ASN1Util.encodeInt(this.uncertainty));
            return ASN1Util.encodeTaggedObjects(map);
        }

        public int getAngle() {
            return this.angle;
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public /* bridge */ /* synthetic */ byte[] getEncoded() {
            return super.getEncoded();
        }

        public int getUncertainty() {
            return this.uncertainty;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.angle), Integer.valueOf(this.uncertainty));
        }

        public RollAngleBlock(ASN1Encodable aSN1Encodable) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            this.angle = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
            this.uncertainty = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
        }
    }
}
