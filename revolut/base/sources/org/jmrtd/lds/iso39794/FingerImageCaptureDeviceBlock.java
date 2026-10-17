package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public class FingerImageCaptureDeviceBlock extends Block {
    private static final long serialVersionUID = -5356682106972185445L;
    private CaptureDeviceTechnologyIdCode captureDeviceTechnologyIdCode;
    private List<RegistryIdBlock> certifications;
    private RegistryIdBlock model;

    public enum CaptureDeviceTechnologyIdCode implements EncodableEnum<CaptureDeviceTechnologyIdCode> {
        UNKNOWN_CAPTURE_DEVICE_TECHNOLOGY(0),
        OTHER_CAPTURE_DEVICE_TECHNOLOGY(1),
        SCANNED_INK_ON_PAPER(2),
        OPTICAL_TIR_BRIGHT_FIELD(3),
        OPTICAL_TIR_DARK_FIELD(4),
        OPTICAL_IMAGE(5),
        OPTICAL_LOW_FREQUENCY_3D_MAPPED(6),
        OPTICAL_HIGH_FREQUENCY_3D_MAPPED(7),
        CAPACITIVE(9),
        CAPACITIVE_RF(10),
        ELECTRO_LUMINESCENCE(11),
        REFLECTED_ULTRASONIC(12),
        IMPEDIOGRAPHIC_ULTRASONIC(13),
        THERMAL(14),
        DIRECT_PRESSURE(15),
        INDIRECT_PRESSURE(16),
        LIVE_TAPE(17),
        LATENT_IMPRESSION(18),
        LATENT_PHOTO(19),
        LATENT_MOLDED(20),
        LATENT_TRACING(21),
        LATENT_LIFT(22);

        private int code;

        CaptureDeviceTechnologyIdCode(int i) {
            this.code = i;
        }

        public static CaptureDeviceTechnologyIdCode fromCode(int i) {
            return (CaptureDeviceTechnologyIdCode) EncodableEnum.fromCode(i, CaptureDeviceTechnologyIdCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public FingerImageCaptureDeviceBlock(RegistryIdBlock registryIdBlock, CaptureDeviceTechnologyIdCode captureDeviceTechnologyIdCode, List<RegistryIdBlock> list) {
        this.model = registryIdBlock;
        this.captureDeviceTechnologyIdCode = captureDeviceTechnologyIdCode;
        this.certifications = list;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FingerImageCaptureDeviceBlock fingerImageCaptureDeviceBlock = (FingerImageCaptureDeviceBlock) obj2;
        return this.captureDeviceTechnologyIdCode == fingerImageCaptureDeviceBlock.captureDeviceTechnologyIdCode && Objects.equals(this.certifications, fingerImageCaptureDeviceBlock.certifications) && Objects.equals(this.model, fingerImageCaptureDeviceBlock.model);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.model != null) {
            map.put(0, this.model.getASN1Object());
        }
        if (this.captureDeviceTechnologyIdCode != null) {
            map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.captureDeviceTechnologyIdCode.getCode()));
        }
        if (this.certifications != null) {
            map.put(2, ISO39794Util.encodeBlocks(this.certifications));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public CaptureDeviceTechnologyIdCode getCaptureDeviceTechnologyIdCode() {
        return this.captureDeviceTechnologyIdCode;
    }

    public List<RegistryIdBlock> getCertifications() {
        return this.certifications;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public RegistryIdBlock getModel() {
        return this.model;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.captureDeviceTechnologyIdCode, this.certifications, this.model);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FingerImageCaptureDeviceBlock [model: ");
        sb6.append(this.model);
        sb6.append(", captureDeviceTechnologyIdCode: ");
        sb6.append(this.captureDeviceTechnologyIdCode);
        sb6.append(", certifications: ");
        return a.q("]", this.certifications, sb6);
    }

    public FingerImageCaptureDeviceBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            if (mapDecodeTaggedObjects.containsKey(0)) {
                this.model = new RegistryIdBlock(mapDecodeTaggedObjects.get(0));
            }
            if (mapDecodeTaggedObjects.containsKey(1)) {
                this.captureDeviceTechnologyIdCode = CaptureDeviceTechnologyIdCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
            }
            if (mapDecodeTaggedObjects.containsKey(2)) {
                this.certifications = RegistryIdBlock.decodeRegistryIdBlocks(mapDecodeTaggedObjects.get(2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot decode null!");
    }
}
