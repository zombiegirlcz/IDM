package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImagePostAcquisitionProcessingBlock extends Block {
    private static final long serialVersionUID = -3603621266074466100L;
    private Boolean isAgeProgressed;
    private Boolean isContrastStretched;
    private Boolean isCropped;
    private Boolean isDownSampled;
    private Boolean isInterpolated;
    private Boolean isMultiViewImage;
    private Boolean isMultiplyCompressed;
    private Boolean isNormalised;
    private Boolean isPoseCorrected;
    private Boolean isRotated;
    private Boolean isSuperResolutionProcessed;
    private Boolean isWhiteBalanceAdjusted;

    public FaceImagePostAcquisitionProcessingBlock(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12) {
        this.isRotated = bool;
        this.isCropped = bool2;
        this.isDownSampled = bool3;
        this.isWhiteBalanceAdjusted = bool4;
        this.isMultiplyCompressed = bool5;
        this.isInterpolated = bool6;
        this.isContrastStretched = bool7;
        this.isPoseCorrected = bool8;
        this.isMultiViewImage = bool9;
        this.isAgeProgressed = bool10;
        this.isSuperResolutionProcessed = bool11;
        this.isNormalised = bool12;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImagePostAcquisitionProcessingBlock faceImagePostAcquisitionProcessingBlock = (FaceImagePostAcquisitionProcessingBlock) obj2;
        return Objects.equals(this.isAgeProgressed, faceImagePostAcquisitionProcessingBlock.isAgeProgressed) && Objects.equals(this.isContrastStretched, faceImagePostAcquisitionProcessingBlock.isContrastStretched) && Objects.equals(this.isCropped, faceImagePostAcquisitionProcessingBlock.isCropped) && Objects.equals(this.isDownSampled, faceImagePostAcquisitionProcessingBlock.isDownSampled) && Objects.equals(this.isInterpolated, faceImagePostAcquisitionProcessingBlock.isInterpolated) && Objects.equals(this.isMultiViewImage, faceImagePostAcquisitionProcessingBlock.isMultiViewImage) && Objects.equals(this.isMultiplyCompressed, faceImagePostAcquisitionProcessingBlock.isMultiplyCompressed) && Objects.equals(this.isNormalised, faceImagePostAcquisitionProcessingBlock.isNormalised) && Objects.equals(this.isPoseCorrected, faceImagePostAcquisitionProcessingBlock.isPoseCorrected) && Objects.equals(this.isRotated, faceImagePostAcquisitionProcessingBlock.isRotated) && Objects.equals(this.isSuperResolutionProcessed, faceImagePostAcquisitionProcessingBlock.isSuperResolutionProcessed) && Objects.equals(this.isWhiteBalanceAdjusted, faceImagePostAcquisitionProcessingBlock.isWhiteBalanceAdjusted);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.isRotated != null) {
            a.w(this.isRotated, map, 0);
        }
        if (this.isCropped != null) {
            a.w(this.isCropped, map, 1);
        }
        if (this.isDownSampled != null) {
            a.w(this.isDownSampled, map, 2);
        }
        if (this.isWhiteBalanceAdjusted != null) {
            a.w(this.isWhiteBalanceAdjusted, map, 3);
        }
        if (this.isMultiplyCompressed != null) {
            a.w(this.isMultiplyCompressed, map, 4);
        }
        if (this.isInterpolated != null) {
            a.w(this.isInterpolated, map, 5);
        }
        if (this.isContrastStretched != null) {
            a.w(this.isContrastStretched, map, 6);
        }
        if (this.isPoseCorrected != null) {
            a.w(this.isPoseCorrected, map, 7);
        }
        if (this.isMultiViewImage != null) {
            a.w(this.isMultiViewImage, map, 8);
        }
        if (this.isAgeProgressed != null) {
            a.w(this.isAgeProgressed, map, 9);
        }
        if (this.isSuperResolutionProcessed != null) {
            a.w(this.isSuperResolutionProcessed, map, 10);
        }
        if (this.isNormalised != null) {
            a.w(this.isNormalised, map, 11);
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.isAgeProgressed, this.isContrastStretched, this.isCropped, this.isDownSampled, this.isInterpolated, this.isMultiViewImage, this.isMultiplyCompressed, this.isNormalised, this.isPoseCorrected, this.isRotated, this.isSuperResolutionProcessed, this.isWhiteBalanceAdjusted);
    }

    public Boolean isAgeProgressed() {
        return this.isAgeProgressed;
    }

    public Boolean isContrastStretched() {
        return this.isContrastStretched;
    }

    public Boolean isCropped() {
        return this.isCropped;
    }

    public Boolean isDownSampled() {
        return this.isDownSampled;
    }

    public Boolean isInterpolated() {
        return this.isInterpolated;
    }

    public Boolean isMultiViewImage() {
        return this.isMultiViewImage;
    }

    public Boolean isMultiplyCompressed() {
        return this.isMultiplyCompressed;
    }

    public Boolean isNormalised() {
        return this.isNormalised;
    }

    public Boolean isPoseCorrected() {
        return this.isPoseCorrected;
    }

    public Boolean isRotated() {
        return this.isRotated;
    }

    public Boolean isSuperResolutionProcessed() {
        return this.isSuperResolutionProcessed;
    }

    public Boolean isWhiteBalanceAdjusted() {
        return this.isWhiteBalanceAdjusted;
    }

    public String toString() {
        return "FaceImagePostAcquisitionProcessingBlock [isRotated: " + this.isRotated + ", isCropped: " + this.isCropped + ", isDownSampled: " + this.isDownSampled + ", isWhiteBalanceAdjusted: " + this.isWhiteBalanceAdjusted + ", isMultiplyCompressed: " + this.isMultiplyCompressed + ", isInterpolated: " + this.isInterpolated + ", isContrastStretched: " + this.isContrastStretched + ", isPoseCorrected: " + this.isPoseCorrected + ", isMultiViewImage: " + this.isMultiViewImage + ", isAgeProgressed: " + this.isAgeProgressed + ", isSuperResolutionProcessed: " + this.isSuperResolutionProcessed + ", isNormalised: " + this.isNormalised + "]";
    }

    public FaceImagePostAcquisitionProcessingBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.isRotated = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(0)));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.isCropped = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(1)));
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.isDownSampled = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(2)));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.isWhiteBalanceAdjusted = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(3)));
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.isMultiplyCompressed = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(4)));
        }
        if (mapDecodeTaggedObjects.containsKey(5)) {
            this.isInterpolated = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(5)));
        }
        if (mapDecodeTaggedObjects.containsKey(6)) {
            this.isContrastStretched = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(6)));
        }
        if (mapDecodeTaggedObjects.containsKey(7)) {
            this.isPoseCorrected = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(7)));
        }
        if (mapDecodeTaggedObjects.containsKey(8)) {
            this.isMultiViewImage = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(8)));
        }
        if (mapDecodeTaggedObjects.containsKey(9)) {
            this.isAgeProgressed = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(9)));
        }
        if (mapDecodeTaggedObjects.containsKey(10)) {
            this.isSuperResolutionProcessed = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(10)));
        }
        if (mapDecodeTaggedObjects.containsKey(11)) {
            this.isNormalised = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(11)));
        }
    }
}
