package org.jmrtd.lds.iso39794;

import j6.a;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageInformation2DBlock extends Block {
    private static final long serialVersionUID = 76880187801114756L;
    private Integer cameraToSubjectDistance;
    private FaceImageKind2DCode faceImageKind2DCode;
    private ImageColourSpaceCode imageColourSpaceCode;
    private ImageDataFormatCode imageDataFormatCode;
    private ImageFaceMeasurementsBlock imageFaceMeasurementsBlock;
    private ImageSizeBlock imageSizeBlock;
    private Integer lensFocalLength;
    private LossyTransformationAttemptsCode lossyTransformationAttemptsCode;
    private FaceImagePostAcquisitionProcessingBlock postAcquisitionProcessingBlock;
    private FaceImageReferenceColourMappingBlock referenceColourMappingBlock;
    private Integer sensorDiagonal;

    public enum FaceImageKind2DCode implements EncodableEnum<FaceImageKind2DCode> {
        MRTD(0),
        GENERAL_PURPOSE(1);

        private int code;

        FaceImageKind2DCode(int i) {
            this.code = i;
        }

        public static FaceImageKind2DCode fromCode(int i) {
            return (FaceImageKind2DCode) EncodableEnum.fromCode(i, FaceImageKind2DCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum ImageColourSpaceCode implements EncodableEnum<ImageColourSpaceCode> {
        UNKNOWN(0),
        OTHER(1),
        RGB_24BIT(2),
        RGB_48BIT(3),
        YUV_422(4),
        GREYSCALE_8BIT(5),
        GREYSCALE_16BIT(6);

        private int code;

        ImageColourSpaceCode(int i) {
            this.code = i;
        }

        public static ImageColourSpaceCode fromCode(int i) {
            return (ImageColourSpaceCode) EncodableEnum.fromCode(i, ImageColourSpaceCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum ImageDataFormatCode implements EncodableEnum<ImageDataFormatCode> {
        UNKNOWN(0, "image/raw"),
        JPEG(2, "image/jpeg"),
        JPEG2000_LOSSY(3, "image/jp2"),
        JPEG2000_LOSSLESS(4, "image/jp2");

        private int code;
        private String mimeType;

        ImageDataFormatCode(int i, String str) {
            this.code = i;
            this.mimeType = str;
        }

        public static ImageDataFormatCode fromCode(int i) {
            return (ImageDataFormatCode) EncodableEnum.fromCode(i, ImageDataFormatCode.class);
        }

        public static String toMimeType(ImageDataFormatCode imageDataFormatCode) {
            return imageDataFormatCode == null ? "image/raw" : imageDataFormatCode.getMimeType();
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }

        public String getMimeType() {
            return this.mimeType;
        }
    }

    public enum LossyTransformationAttemptsCode implements EncodableEnum<LossyTransformationAttemptsCode> {
        UNKNOWN(0),
        ZERO(1),
        ONE(2),
        MORE_THAN_ONE(3);

        private int code;

        LossyTransformationAttemptsCode(int i) {
            this.code = i;
        }

        public static LossyTransformationAttemptsCode fromCode(int i) {
            return (LossyTransformationAttemptsCode) EncodableEnum.fromCode(i, LossyTransformationAttemptsCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public FaceImageInformation2DBlock(ImageDataFormatCode imageDataFormatCode, FaceImageKind2DCode faceImageKind2DCode, FaceImagePostAcquisitionProcessingBlock faceImagePostAcquisitionProcessingBlock, LossyTransformationAttemptsCode lossyTransformationAttemptsCode, Integer num, Integer num2, Integer num3, ImageSizeBlock imageSizeBlock, ImageFaceMeasurementsBlock imageFaceMeasurementsBlock, ImageColourSpaceCode imageColourSpaceCode, FaceImageReferenceColourMappingBlock faceImageReferenceColourMappingBlock) {
        this.imageDataFormatCode = imageDataFormatCode;
        this.faceImageKind2DCode = faceImageKind2DCode;
        this.postAcquisitionProcessingBlock = faceImagePostAcquisitionProcessingBlock;
        this.lossyTransformationAttemptsCode = lossyTransformationAttemptsCode;
        this.cameraToSubjectDistance = num;
        this.sensorDiagonal = num2;
        this.lensFocalLength = num3;
        this.imageSizeBlock = imageSizeBlock;
        this.imageFaceMeasurementsBlock = imageFaceMeasurementsBlock;
        this.imageColourSpaceCode = imageColourSpaceCode;
        this.referenceColourMappingBlock = faceImageReferenceColourMappingBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageInformation2DBlock faceImageInformation2DBlock = (FaceImageInformation2DBlock) obj2;
        return Objects.equals(this.cameraToSubjectDistance, faceImageInformation2DBlock.cameraToSubjectDistance) && this.faceImageKind2DCode == faceImageInformation2DBlock.faceImageKind2DCode && this.imageColourSpaceCode == faceImageInformation2DBlock.imageColourSpaceCode && this.imageDataFormatCode == faceImageInformation2DBlock.imageDataFormatCode && Objects.equals(this.imageFaceMeasurementsBlock, faceImageInformation2DBlock.imageFaceMeasurementsBlock) && Objects.equals(this.imageSizeBlock, faceImageInformation2DBlock.imageSizeBlock) && Objects.equals(this.lensFocalLength, faceImageInformation2DBlock.lensFocalLength) && this.lossyTransformationAttemptsCode == faceImageInformation2DBlock.lossyTransformationAttemptsCode && Objects.equals(this.postAcquisitionProcessingBlock, faceImageInformation2DBlock.postAcquisitionProcessingBlock) && Objects.equals(this.referenceColourMappingBlock, faceImageInformation2DBlock.referenceColourMappingBlock) && Objects.equals(this.sensorDiagonal, faceImageInformation2DBlock.sensorDiagonal);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.imageDataFormatCode.getCode()));
        if (this.faceImageKind2DCode != null) {
            map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.faceImageKind2DCode.getCode()));
        }
        if (this.postAcquisitionProcessingBlock != null) {
            map.put(2, this.postAcquisitionProcessingBlock.getASN1Object());
        }
        if (this.lossyTransformationAttemptsCode != null) {
            map.put(3, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.lossyTransformationAttemptsCode.getCode()));
        }
        if (this.cameraToSubjectDistance != null) {
            map.put(4, ASN1Util.encodeInt(this.cameraToSubjectDistance.intValue()));
        }
        if (this.sensorDiagonal != null) {
            map.put(5, ASN1Util.encodeInt(this.sensorDiagonal.intValue()));
        }
        if (this.lensFocalLength != null) {
            map.put(6, ASN1Util.encodeInt(this.lensFocalLength.intValue()));
        }
        if (this.imageSizeBlock != null) {
            map.put(7, this.imageSizeBlock.getASN1Object());
        }
        if (this.imageFaceMeasurementsBlock != null) {
            map.put(8, this.imageFaceMeasurementsBlock.getASN1Object());
        }
        if (this.imageColourSpaceCode != null) {
            map.put(9, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.imageColourSpaceCode.getCode()));
        }
        if (this.referenceColourMappingBlock != null) {
            map.put(10, this.referenceColourMappingBlock.getASN1Object());
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public Integer getCameraToSubjectDistance() {
        return this.cameraToSubjectDistance;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public FaceImageKind2DCode getFaceImageKind2DCode() {
        return this.faceImageKind2DCode;
    }

    public ImageColourSpaceCode getImageColourSpaceCode() {
        return this.imageColourSpaceCode;
    }

    public ImageDataFormatCode getImageDataFormatCode() {
        return this.imageDataFormatCode;
    }

    public ImageFaceMeasurementsBlock getImageFaceMeasurementsBlock() {
        return this.imageFaceMeasurementsBlock;
    }

    public ImageSizeBlock getImageSizeBlock() {
        return this.imageSizeBlock;
    }

    public Integer getLensFocalLength() {
        return this.lensFocalLength;
    }

    public LossyTransformationAttemptsCode getLossyTransformationAttemptsCode() {
        return this.lossyTransformationAttemptsCode;
    }

    public FaceImagePostAcquisitionProcessingBlock getPostAcquisitionProcessingBlock() {
        return this.postAcquisitionProcessingBlock;
    }

    public FaceImageReferenceColourMappingBlock getReferenceColourMappingBlock() {
        return this.referenceColourMappingBlock;
    }

    public Integer getSensorDiagonal() {
        return this.sensorDiagonal;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.cameraToSubjectDistance, this.faceImageKind2DCode, this.imageColourSpaceCode, this.imageDataFormatCode, this.imageFaceMeasurementsBlock, this.imageSizeBlock, this.lensFocalLength, this.lossyTransformationAttemptsCode, this.postAcquisitionProcessingBlock, this.referenceColourMappingBlock, this.sensorDiagonal);
    }

    public String toString() {
        return "FaceImageInformation2DBlock [imageSizeBlock: " + this.imageSizeBlock + ", imageDataFormatCode: " + this.imageDataFormatCode + ", faceImageKind2DCode: " + this.faceImageKind2DCode + ", postAcquisitionProcessingBlock: " + this.postAcquisitionProcessingBlock + ", lossyTransformationAttemptsCode: " + this.lossyTransformationAttemptsCode + ", cameraToSubjectDistance: " + this.cameraToSubjectDistance + ", sensorDiagonal: " + this.sensorDiagonal + ", lensFocalLength: " + this.lensFocalLength + ", imageFaceMeasurementsBlock: " + this.imageFaceMeasurementsBlock + ", imageColourSpaceCode: " + this.imageColourSpaceCode + ", referenceColourMappingBlock: " + this.referenceColourMappingBlock + "]";
    }

    public static class ImageSizeBlock extends Block {
        private static final long serialVersionUID = -261040653361008230L;
        private int height;
        private int width;

        public ImageSizeBlock(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 == null || getClass() != obj2.getClass()) {
                return false;
            }
            ImageSizeBlock imageSizeBlock = (ImageSizeBlock) obj2;
            return this.height == imageSizeBlock.height && this.width == imageSizeBlock.width;
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public ASN1Encodable getASN1Object() {
            HashMap map = new HashMap();
            map.put(0, ASN1Util.encodeInt(this.width));
            map.put(1, ASN1Util.encodeInt(this.height));
            return ASN1Util.encodeTaggedObjects(map);
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public /* bridge */ /* synthetic */ byte[] getEncoded() {
            return super.getEncoded();
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.height), Integer.valueOf(this.width));
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("ImageSizeBlock [width: ");
            sb6.append(this.width);
            sb6.append(", height: ");
            return a.v(sb6, "]", this.height);
        }

        public ImageSizeBlock(ASN1Encodable aSN1Encodable) {
            if (aSN1Encodable instanceof ASN1Sequence) {
                Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
                this.width = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
                this.height = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
                return;
            }
            throw new IllegalArgumentException("Cannot decode!");
        }
    }

    public static class ImageFaceMeasurementsBlock extends Block {
        private static final long serialVersionUID = -5665022845073986540L;
        private BigInteger imageEyeToMouthDistance;
        private BigInteger imageHeadLength;
        private BigInteger imageHeadWidth;
        private BigInteger imageInterEyeDistance;

        public ImageFaceMeasurementsBlock(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this.imageHeadWidth = bigInteger;
            this.imageInterEyeDistance = bigInteger2;
            this.imageEyeToMouthDistance = bigInteger3;
            this.imageHeadLength = bigInteger4;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 == null || getClass() != obj2.getClass()) {
                return false;
            }
            ImageFaceMeasurementsBlock imageFaceMeasurementsBlock = (ImageFaceMeasurementsBlock) obj2;
            return Objects.equals(this.imageEyeToMouthDistance, imageFaceMeasurementsBlock.imageEyeToMouthDistance) && Objects.equals(this.imageHeadLength, imageFaceMeasurementsBlock.imageHeadLength) && Objects.equals(this.imageHeadWidth, imageFaceMeasurementsBlock.imageHeadWidth) && Objects.equals(this.imageInterEyeDistance, imageFaceMeasurementsBlock.imageInterEyeDistance);
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public ASN1Encodable getASN1Object() {
            HashMap map = new HashMap();
            if (this.imageHeadWidth != null) {
                map.put(0, ASN1Util.encodeBigInteger(this.imageHeadWidth));
            }
            if (this.imageInterEyeDistance != null) {
                map.put(1, ASN1Util.encodeBigInteger(this.imageInterEyeDistance));
            }
            if (this.imageEyeToMouthDistance != null) {
                map.put(2, ASN1Util.encodeBigInteger(this.imageEyeToMouthDistance));
            }
            if (this.imageHeadLength != null) {
                map.put(3, ASN1Util.encodeBigInteger(this.imageHeadLength));
            }
            return ASN1Util.encodeTaggedObjects(map);
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public /* bridge */ /* synthetic */ byte[] getEncoded() {
            return super.getEncoded();
        }

        public BigInteger getImageEyeToMouthDistance() {
            return this.imageEyeToMouthDistance;
        }

        public BigInteger getImageHeadLength() {
            return this.imageHeadLength;
        }

        public BigInteger getImageHeadWidth() {
            return this.imageHeadWidth;
        }

        public BigInteger getImageInterEyeDistance() {
            return this.imageInterEyeDistance;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public int hashCode() {
            return Objects.hash(this.imageEyeToMouthDistance, this.imageHeadLength, this.imageHeadWidth, this.imageInterEyeDistance);
        }

        public String toString() {
            return "ImageFaceMeasurementsBlock [imageHeadWidth: " + this.imageHeadWidth + ", imageInterEyeDistance: " + this.imageInterEyeDistance + ", imageEyeToMouthDistance: " + this.imageEyeToMouthDistance + ", imageHeadLength: " + this.imageHeadLength + "]";
        }

        public ImageFaceMeasurementsBlock(ASN1Encodable aSN1Encodable) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            if (mapDecodeTaggedObjects.containsKey(0)) {
                this.imageHeadWidth = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(0));
            }
            if (mapDecodeTaggedObjects.containsKey(1)) {
                this.imageInterEyeDistance = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(1));
            }
            if (mapDecodeTaggedObjects.containsKey(2)) {
                this.imageEyeToMouthDistance = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(2));
            }
            if (mapDecodeTaggedObjects.containsKey(3)) {
                this.imageHeadLength = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(3));
            }
        }
    }

    public FaceImageInformation2DBlock(ASN1Encodable aSN1Encodable) {
        if (!(aSN1Encodable instanceof ASN1Sequence) && !(aSN1Encodable instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException("Cannot decode!");
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.imageDataFormatCode = ImageDataFormatCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(0)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.faceImageKind2DCode = FaceImageKind2DCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.postAcquisitionProcessingBlock = new FaceImagePostAcquisitionProcessingBlock(mapDecodeTaggedObjects.get(2));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.lossyTransformationAttemptsCode = LossyTransformationAttemptsCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(3)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.cameraToSubjectDistance = Integer.valueOf(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(4)));
        }
        if (mapDecodeTaggedObjects.containsKey(5)) {
            this.sensorDiagonal = Integer.valueOf(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(5)));
        }
        if (mapDecodeTaggedObjects.containsKey(6)) {
            this.lensFocalLength = Integer.valueOf(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(6)));
        }
        if (mapDecodeTaggedObjects.containsKey(7)) {
            this.imageSizeBlock = new ImageSizeBlock(mapDecodeTaggedObjects.get(7));
        }
        if (mapDecodeTaggedObjects.containsKey(8)) {
            this.imageFaceMeasurementsBlock = new ImageFaceMeasurementsBlock(mapDecodeTaggedObjects.get(8));
        }
        if (mapDecodeTaggedObjects.containsKey(9)) {
            this.imageColourSpaceCode = ImageColourSpaceCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(9)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(10)) {
            this.referenceColourMappingBlock = new FaceImageReferenceColourMappingBlock(mapDecodeTaggedObjects.get(10));
        }
    }
}
