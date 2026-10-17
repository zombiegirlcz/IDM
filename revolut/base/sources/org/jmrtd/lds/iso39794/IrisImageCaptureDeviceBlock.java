package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public class IrisImageCaptureDeviceBlock extends Block {
    private static final long serialVersionUID = -4279701511600052026L;
    private CaptureDeviceTechnologyIdCode captureDeviceTechnologyIdCode;
    private List<RegistryIdBlock> certifications;
    private RegistryIdBlock model;

    public enum CaptureDeviceTechnologyIdCode implements EncodableEnum<CaptureDeviceTechnologyIdCode> {
        UNKNOWN(0),
        CMOS_CCD(1);

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

    public IrisImageCaptureDeviceBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new IllegalArgumentException("Cannot decode null!");
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.model = new RegistryIdBlock(mapDecodeTaggedObjects.get(0));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.captureDeviceTechnologyIdCode = CaptureDeviceTechnologyIdCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.certifications = RegistryIdBlock.decodeRegistryIdBlocks(mapDecodeTaggedObjects.get(2));
        }
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        IrisImageCaptureDeviceBlock irisImageCaptureDeviceBlock = (IrisImageCaptureDeviceBlock) obj2;
        return this.captureDeviceTechnologyIdCode == irisImageCaptureDeviceBlock.captureDeviceTechnologyIdCode && Objects.equals(this.certifications, irisImageCaptureDeviceBlock.certifications) && Objects.equals(this.model, irisImageCaptureDeviceBlock.model);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, this.model.getASN1Object());
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
        StringBuilder sb6 = new StringBuilder("IrisImageCaptureDeviceBlock [model: ");
        sb6.append(this.model);
        sb6.append(", captureDeviceTechnologyIdCode: ");
        sb6.append(this.captureDeviceTechnologyIdCode);
        sb6.append(", certifications: ");
        return a.q("]", this.certifications, sb6);
    }
}
