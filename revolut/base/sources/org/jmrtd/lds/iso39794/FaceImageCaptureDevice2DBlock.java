package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageCaptureDevice2DBlock extends Block {
    private static final long serialVersionUID = -8445632002285427924L;
    private FaceImageCaptureDeviceSpectral2DBlock captureDeviceSpectral2DBlock;
    private CaptureDeviceTechnologyId2DCode captureDeviceTechnologyId2D;

    public enum CaptureDeviceTechnologyId2DCode implements EncodableEnum<CaptureDeviceTechnologyId2DCode> {
        UNKNOWN(0),
        STATIC_PHOTOGRAPH_FROM_UNKNOWN_SOURCE(1),
        STATIC_PHOTOGRAPH_FROM_DIGITAL_STILL_IMAGE_CAMERA(2),
        STATIC_PHOTOGRAPH_FROM_SCANNER(3),
        VIDEO_FRAME_FROM_UNKNOWN_SOURCE(4),
        VIDEO_FRAME_FROM_ANALOGUE_VIDEO_CAMERA(5),
        VIDEO_FRAME_FROM_DIGITAL_VIDEO_CAMERA(6);

        private int code;

        CaptureDeviceTechnologyId2DCode(int i) {
            this.code = i;
        }

        public static CaptureDeviceTechnologyId2DCode fromCode(int i) {
            return (CaptureDeviceTechnologyId2DCode) EncodableEnum.fromCode(i, CaptureDeviceTechnologyId2DCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public FaceImageCaptureDevice2DBlock(FaceImageCaptureDeviceSpectral2DBlock faceImageCaptureDeviceSpectral2DBlock, CaptureDeviceTechnologyId2DCode captureDeviceTechnologyId2DCode) {
        this.captureDeviceSpectral2DBlock = faceImageCaptureDeviceSpectral2DBlock;
        this.captureDeviceTechnologyId2D = captureDeviceTechnologyId2DCode;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageCaptureDevice2DBlock faceImageCaptureDevice2DBlock = (FaceImageCaptureDevice2DBlock) obj2;
        return Objects.equals(this.captureDeviceSpectral2DBlock, faceImageCaptureDevice2DBlock.captureDeviceSpectral2DBlock) && this.captureDeviceTechnologyId2D == faceImageCaptureDevice2DBlock.captureDeviceTechnologyId2D;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.captureDeviceSpectral2DBlock != null) {
            map.put(0, this.captureDeviceSpectral2DBlock.getASN1Object());
        }
        if (this.captureDeviceTechnologyId2D != null) {
            map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.captureDeviceTechnologyId2D.getCode()));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public FaceImageCaptureDeviceSpectral2DBlock getCaptureDeviceSpectral2DBlock() {
        return this.captureDeviceSpectral2DBlock;
    }

    public CaptureDeviceTechnologyId2DCode getCaptureDeviceTechnologyId2D() {
        return this.captureDeviceTechnologyId2D;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.captureDeviceSpectral2DBlock, this.captureDeviceTechnologyId2D);
    }

    public String toString() {
        return "FaceImageCaptureDevice2DBlock [captureDeviceSpectral2DBlock: " + this.captureDeviceSpectral2DBlock + ", captureDeviceTechnologyId2D: " + this.captureDeviceTechnologyId2D + "]";
    }

    public FaceImageCaptureDevice2DBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            if (aSN1Encodable instanceof ASN1Sequence) {
                Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(ASN1Sequence.getInstance(aSN1Encodable));
                if (mapDecodeTaggedObjects.containsKey(0)) {
                    this.captureDeviceSpectral2DBlock = new FaceImageCaptureDeviceSpectral2DBlock(mapDecodeTaggedObjects.get(0));
                }
                if (mapDecodeTaggedObjects.containsKey(1)) {
                    this.captureDeviceTechnologyId2D = CaptureDeviceTechnologyId2DCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot decode null!");
    }
}
