package org.jmrtd.lds.iso39794;

import ehe.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERVisibleString;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jmrtd.ASN1Util;
import org.jmrtd.lds.ImageInfo;

/* JADX INFO: loaded from: classes14.dex */
public class FingerImageRepresentationBlock extends Block implements ImageInfo {
    private static final long serialVersionUID = -9136319709147388829L;
    private List<FingerImageAnnotationBlock> annotationBlocks;
    private DateTimeBlock captureDateTimeBlock;
    private FingerImageCaptureDeviceBlock captureDeviceBlock;
    private List<String> commentBlocks;
    private Integer fingerRotation;
    private byte[] imageData;
    private ImageDataFormatCode imageDataFormat;
    private ImpressionCode impression;
    private Boolean isImageHasBeenLossilyCompressed;
    private Boolean isImageRotatedToVertical;
    private Boolean isPositionComputedByCaptureSystem;
    private PADDataBlock padDataBlock;
    private FingerImagePositionCode position;
    private List<QualityBlock> qualityBlocks;
    private List<FingerImageSegmentationBlock> segmentationBlocks;
    private FingerImageSpatialSamplingRateBlock spatialSamplingRateBlock;
    private List<ExtendedDataBlock> vendorSpecificDataBlocks;

    /* JADX INFO: renamed from: org.jmrtd.lds.iso39794.FingerImageRepresentationBlock$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode;

        static {
            int[] iArr = new int[FingerImagePositionCode.values().length];
            $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode = iArr;
            try {
                iArr[FingerImagePositionCode.UNKNOWN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_THUMB_FINGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_INDEX_FINGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_MIDDLE_FINGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_RING_FINGER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_LITTLE_FINGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_THUMB_FINGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_INDEX_FINGER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_MIDDLE_FINGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_RING_FINGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_LITTLE_FINGER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_FOUR_FINGERS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_FOUR_FINGERS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.BOTH_THUMB_FINGERS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.UNKNOWN_PALM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_FULL_PALM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_WRITERS_PALM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_FULL_PALM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_WRITERS_PALM.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_LOWER_PALM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_UPPER_PALM.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_LOWER_PALM.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_UPPER_PALM.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_INTERDIGITAL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_THENAR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.RIGHT_HYPOTHENAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_INTERDIGITAL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_THENAR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.LEFT_HYPOTHENAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[FingerImagePositionCode.OTHER_POSITION.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    public enum ImageDataFormatCode implements EncodableEnum<ImageDataFormatCode> {
        PGM(0, "image/pgm"),
        WSQ(1, "image/x-wsq"),
        JPEG2000_LOSSY(2, "image/jp2"),
        JPEG2000_LOSSLESS(3, "image/jp2"),
        PNG(4, "image/png");

        private int code;
        private String mimeType;

        ImageDataFormatCode(int i, String str) {
            this.code = i;
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

    public enum ImpressionCode implements EncodableEnum<ImpressionCode> {
        PLAIN_CONTACT(0),
        ROLLED_CONTACT(1),
        LATENT_IMAGE(4),
        SWIPE_CONTACT(8),
        STATIONARY_SUBJECT_CONTACTLESS_PLAIN(24),
        STATIONARY_SUBJECT_CONTACTLESS_ROLLED(25),
        MOVING_SUBJECT_CONTACTLESS_PLAIN(41),
        MOVING_SUBJECT_CONTACTLESS_ROLLED(42),
        OTHER_IMPRESSION(28),
        UNKNOWN_IMPRESSION(29);

        private int code;

        ImpressionCode(int i) {
            this.code = i;
        }

        public static ImpressionCode fromCode(int i) {
            return (ImpressionCode) EncodableEnum.fromCode(i, ImpressionCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public FingerImageRepresentationBlock(FingerImagePositionCode fingerImagePositionCode, ImpressionCode impressionCode, ImageDataFormatCode imageDataFormatCode, DateTimeBlock dateTimeBlock, FingerImageCaptureDeviceBlock fingerImageCaptureDeviceBlock, List<QualityBlock> list, FingerImageSpatialSamplingRateBlock fingerImageSpatialSamplingRateBlock, Boolean bool, Integer num, Boolean bool2, Boolean bool3, List<FingerImageSegmentationBlock> list2, List<FingerImageAnnotationBlock> list3, PADDataBlock pADDataBlock, byte[] bArr, List<String> list4, List<ExtendedDataBlock> list5) {
        this.position = fingerImagePositionCode;
        this.impression = impressionCode;
        this.imageDataFormat = imageDataFormatCode;
        this.captureDateTimeBlock = dateTimeBlock;
        this.captureDeviceBlock = fingerImageCaptureDeviceBlock;
        this.qualityBlocks = list;
        this.spatialSamplingRateBlock = fingerImageSpatialSamplingRateBlock;
        this.isPositionComputedByCaptureSystem = bool;
        this.fingerRotation = num;
        this.isImageRotatedToVertical = bool2;
        this.isImageHasBeenLossilyCompressed = bool3;
        this.segmentationBlocks = list2;
        this.annotationBlocks = list3;
        this.padDataBlock = pADDataBlock;
        this.imageData = bArr;
        this.commentBlocks = list4;
        this.vendorSpecificDataBlocks = list5;
    }

    private static List<String> decodeCommentBlocks(ASN1Encodable aSN1Encodable) {
        if (!(aSN1Encodable instanceof ASN1Sequence)) {
            if (aSN1Encodable instanceof ASN1VisibleString) {
                return Collections.singletonList(ASN1VisibleString.getInstance(aSN1Encodable).getString());
            }
            Block.LOGGER.warning("Cannot decode comment blocks!");
            return null;
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(ASN1VisibleString.getInstance(it8.next()).getString());
        }
        return arrayList;
    }

    public static List<FingerImageRepresentationBlock> decodeRepresentationBlocks(ASN1Encodable aSN1Encodable) {
        ArrayList arrayList = new ArrayList();
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            arrayList.add(new FingerImageRepresentationBlock(aSN1Encodable));
            return arrayList;
        }
        Iterator<ASN1Encodable> it8 = ASN1Util.list(aSN1Encodable).iterator();
        while (it8.hasNext()) {
            arrayList.add(new FingerImageRepresentationBlock(it8.next()));
        }
        return arrayList;
    }

    private static ASN1Encodable encodeCommentBlocks(List<String> list) {
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[list.size()];
        Iterator<String> it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            aSN1EncodableArr[i] = new DERVisibleString(it8.next());
            i++;
        }
        return new DERSequence(aSN1EncodableArr);
    }

    private static int toBiometricSubtype(FingerImagePositionCode fingerImagePositionCode) {
        if (fingerImagePositionCode == null) {
            return 0;
        }
        switch (AnonymousClass1.$SwitchMap$org$jmrtd$lds$iso39794$FingerImagePositionCode[fingerImagePositionCode.ordinal()]) {
        }
        return 0;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FingerImageRepresentationBlock fingerImageRepresentationBlock = (FingerImageRepresentationBlock) obj2;
        return Objects.equals(this.annotationBlocks, fingerImageRepresentationBlock.annotationBlocks) && Objects.equals(this.captureDateTimeBlock, fingerImageRepresentationBlock.captureDateTimeBlock) && Objects.equals(this.captureDeviceBlock, fingerImageRepresentationBlock.captureDeviceBlock) && Objects.equals(this.commentBlocks, fingerImageRepresentationBlock.commentBlocks) && Objects.equals(this.fingerRotation, fingerImageRepresentationBlock.fingerRotation) && Arrays.equals(this.imageData, fingerImageRepresentationBlock.imageData) && this.imageDataFormat == fingerImageRepresentationBlock.imageDataFormat && this.impression == fingerImageRepresentationBlock.impression && Objects.equals(this.isImageHasBeenLossilyCompressed, fingerImageRepresentationBlock.isImageHasBeenLossilyCompressed) && Objects.equals(this.isImageRotatedToVertical, fingerImageRepresentationBlock.isImageRotatedToVertical) && Objects.equals(this.isPositionComputedByCaptureSystem, fingerImageRepresentationBlock.isPositionComputedByCaptureSystem) && Objects.equals(this.padDataBlock, fingerImageRepresentationBlock.padDataBlock) && this.position == fingerImageRepresentationBlock.position && Objects.equals(this.qualityBlocks, fingerImageRepresentationBlock.qualityBlocks) && Objects.equals(this.segmentationBlocks, fingerImageRepresentationBlock.segmentationBlocks) && Objects.equals(this.spatialSamplingRateBlock, fingerImageRepresentationBlock.spatialSamplingRateBlock) && Objects.equals(this.vendorSpecificDataBlocks, fingerImageRepresentationBlock.vendorSpecificDataBlocks);
    }

    public byte[] geImageData() {
        return this.imageData;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.position.getCode()));
        map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.impression.getCode()));
        map.put(2, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.imageDataFormat.getCode()));
        map.put(3, new DEROctetString(this.imageData));
        if (this.captureDateTimeBlock != null) {
            map.put(4, this.captureDateTimeBlock.getASN1Object());
        }
        if (this.captureDeviceBlock != null) {
            map.put(5, this.captureDeviceBlock.getASN1Object());
        }
        if (this.qualityBlocks != null) {
            map.put(6, ISO39794Util.encodeBlocks(this.qualityBlocks));
        }
        if (this.spatialSamplingRateBlock != null) {
            map.put(7, this.spatialSamplingRateBlock.getASN1Object());
        }
        if (this.isPositionComputedByCaptureSystem != null) {
            a.w(this.isPositionComputedByCaptureSystem, map, 8);
        }
        if (this.fingerRotation != null) {
            map.put(9, ASN1Util.encodeInt(this.fingerRotation.intValue()));
        }
        if (this.isImageRotatedToVertical != null) {
            a.w(this.isImageRotatedToVertical, map, 10);
        }
        if (this.isImageHasBeenLossilyCompressed != null) {
            a.w(this.isImageHasBeenLossilyCompressed, map, 11);
        }
        if (this.segmentationBlocks != null) {
            map.put(12, ISO39794Util.encodeBlocks(this.segmentationBlocks));
        }
        if (this.annotationBlocks != null) {
            map.put(13, ISO39794Util.encodeBlocks(this.annotationBlocks));
        }
        if (this.padDataBlock != null) {
            map.put(14, this.padDataBlock.getASN1Object());
        }
        if (this.commentBlocks != null) {
            map.put(15, encodeCommentBlocks(this.commentBlocks));
        }
        if (this.vendorSpecificDataBlocks != null) {
            map.put(16, ISO39794Util.encodeBlocks(this.vendorSpecificDataBlocks));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public List<FingerImageAnnotationBlock> getAnnotationBlocks() {
        return this.annotationBlocks;
    }

    public int getBiometricSubtype() {
        return toBiometricSubtype(this.position);
    }

    public DateTimeBlock getCaptureDateTimeBlock() {
        return this.captureDateTimeBlock;
    }

    public FingerImageCaptureDeviceBlock getCaptureDeviceBlock() {
        return this.captureDeviceBlock;
    }

    public List<String> getCommentBlocks() {
        return this.commentBlocks;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public Integer getFingerRotation() {
        return this.fingerRotation;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getHeight() {
        return 0;
    }

    public ImageDataFormatCode getImageDataFormat() {
        return this.imageDataFormat;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public InputStream getImageInputStream() {
        return new ByteArrayInputStream(this.imageData);
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getImageLength() {
        return this.imageData.length;
    }

    public ImpressionCode getImpression() {
        return this.impression;
    }

    public Boolean getIsImageHasBeenLossilyCompressed() {
        return this.isImageHasBeenLossilyCompressed;
    }

    public Boolean getIsImageRotatedToVertical() {
        return this.isImageRotatedToVertical;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public String getMimeType() {
        ImageDataFormatCode imageDataFormatCode = this.imageDataFormat;
        return imageDataFormatCode == null ? "image/raw" : imageDataFormatCode.getMimeType();
    }

    public PADDataBlock getPadDataBlock() {
        return this.padDataBlock;
    }

    public FingerImagePositionCode getPosition() {
        return this.position;
    }

    public List<QualityBlock> getQualityBlocks() {
        return this.qualityBlocks;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        return 0L;
    }

    public List<FingerImageSegmentationBlock> getSegmentationBlocks() {
        return this.segmentationBlocks;
    }

    public FingerImageSpatialSamplingRateBlock getSpatialSamplingRateBlock() {
        return this.spatialSamplingRateBlock;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getType() {
        return 2;
    }

    public List<ExtendedDataBlock> getVendorSpecificDataBlocks() {
        return this.vendorSpecificDataBlocks;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getWidth() {
        return 0;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.annotationBlocks, this.captureDateTimeBlock, this.captureDeviceBlock, this.commentBlocks, this.fingerRotation, this.imageDataFormat, this.impression, this.isImageHasBeenLossilyCompressed, this.isImageRotatedToVertical, this.isPositionComputedByCaptureSystem, this.padDataBlock, this.position, this.qualityBlocks, this.segmentationBlocks, this.spatialSamplingRateBlock, this.vendorSpecificDataBlocks) + n.b(31, 31, this.imageData);
    }

    public Boolean isPositionComputedByCaptureSystem() {
        return this.isPositionComputedByCaptureSystem;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FingerImageRepresentationBlock [position: ");
        sb6.append(this.position);
        sb6.append(", impression: ");
        sb6.append(this.impression);
        sb6.append(", imageDataFormat: ");
        sb6.append(this.imageDataFormat);
        sb6.append(", captureDateTimeBlock: ");
        sb6.append(this.captureDateTimeBlock);
        sb6.append(", captureDeviceBlock: ");
        sb6.append(this.captureDeviceBlock);
        sb6.append(", qualityBlocks: ");
        sb6.append(this.qualityBlocks);
        sb6.append(", spatialSamplingRateBlock: ");
        sb6.append(this.spatialSamplingRateBlock);
        sb6.append(", isPositionComputedByCaptureSystem: ");
        sb6.append(this.isPositionComputedByCaptureSystem);
        sb6.append(", fingerRotation: ");
        sb6.append(this.fingerRotation);
        sb6.append(", isImageRotatedToVertical: ");
        sb6.append(this.isImageRotatedToVertical);
        sb6.append(", isImageHasBeenLossilyCompressed: ");
        sb6.append(this.isImageHasBeenLossilyCompressed);
        sb6.append(", segmentationBlocks: ");
        sb6.append(this.segmentationBlocks);
        sb6.append(", annotationBlocks: ");
        sb6.append(this.annotationBlocks);
        sb6.append(", padDataBlock: ");
        sb6.append(this.padDataBlock);
        sb6.append(", imageData: ");
        sb6.append(this.imageData.length);
        sb6.append(", commentBlocks: ");
        sb6.append(this.commentBlocks);
        sb6.append(", vendorSpecificDataBlocks: ");
        return t61.a.q("]", this.vendorSpecificDataBlocks, sb6);
    }

    public FingerImageRepresentationBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            this.position = FingerImagePositionCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(0)).intValue());
            this.impression = ImpressionCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
            this.imageDataFormat = ImageDataFormatCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(2)).intValue());
            this.imageData = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(3)).getOctets();
            if (mapDecodeTaggedObjects.containsKey(4)) {
                this.captureDateTimeBlock = new DateTimeBlock(mapDecodeTaggedObjects.get(4));
            }
            if (mapDecodeTaggedObjects.containsKey(5)) {
                this.captureDeviceBlock = new FingerImageCaptureDeviceBlock(mapDecodeTaggedObjects.get(5));
            }
            if (mapDecodeTaggedObjects.containsKey(6)) {
                this.qualityBlocks = QualityBlock.decodeQualityBlocks(mapDecodeTaggedObjects.get(6));
            }
            if (mapDecodeTaggedObjects.containsKey(7)) {
                this.spatialSamplingRateBlock = new FingerImageSpatialSamplingRateBlock(mapDecodeTaggedObjects.get(7));
            }
            if (mapDecodeTaggedObjects.containsKey(8)) {
                this.isPositionComputedByCaptureSystem = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(8)));
            }
            if (mapDecodeTaggedObjects.containsKey(9)) {
                this.fingerRotation = Integer.valueOf(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(9)));
            }
            if (mapDecodeTaggedObjects.containsKey(10)) {
                this.isImageRotatedToVertical = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(10)));
            }
            if (mapDecodeTaggedObjects.containsKey(11)) {
                this.isImageHasBeenLossilyCompressed = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(11)));
            }
            if (mapDecodeTaggedObjects.containsKey(12)) {
                this.segmentationBlocks = FingerImageSegmentationBlock.decodeFingerImageSegmentationBlocks(mapDecodeTaggedObjects.get(12));
            }
            if (mapDecodeTaggedObjects.containsKey(13)) {
                this.annotationBlocks = FingerImageAnnotationBlock.decodeFingerImageAnnotationBlocks(mapDecodeTaggedObjects.get(13));
            }
            if (mapDecodeTaggedObjects.containsKey(14)) {
                this.padDataBlock = new PADDataBlock(mapDecodeTaggedObjects.get(14));
            }
            if (mapDecodeTaggedObjects.containsKey(15)) {
                this.commentBlocks = decodeCommentBlocks(mapDecodeTaggedObjects.get(15));
            }
            if (mapDecodeTaggedObjects.containsKey(16)) {
                this.vendorSpecificDataBlocks = ExtendedDataBlock.decodeExtendedDataBlocks(mapDecodeTaggedObjects.get(16));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot decode!");
    }
}
