package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageCaptureDeviceBlock extends Block {
    private static final long serialVersionUID = 2537450971926807146L;
    private List<RegistryIdBlock> certifications;
    private RegistryIdBlock model;

    public FaceImageCaptureDeviceBlock(RegistryIdBlock registryIdBlock, List<RegistryIdBlock> list) {
        this.model = registryIdBlock;
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
        FaceImageCaptureDeviceBlock faceImageCaptureDeviceBlock = (FaceImageCaptureDeviceBlock) obj2;
        return Objects.equals(this.certifications, faceImageCaptureDeviceBlock.certifications) && Objects.equals(this.model, faceImageCaptureDeviceBlock.model);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.model != null) {
            map.put(0, this.model.getASN1Object());
        }
        if (this.certifications != null) {
            map.put(1, ISO39794Util.encodeBlocks(this.certifications));
        }
        return ASN1Util.encodeTaggedObjects(map);
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
        return Objects.hash(this.certifications, this.model);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceImageCaptureDeviceBlock [model: ");
        sb6.append(this.model);
        sb6.append(", certifications: ");
        return a.q("]", this.certifications, sb6);
    }

    public FaceImageCaptureDeviceBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            if (mapDecodeTaggedObjects.containsKey(0)) {
                this.model = new RegistryIdBlock(mapDecodeTaggedObjects.get(0));
            }
            if (mapDecodeTaggedObjects.containsKey(1)) {
                this.certifications = RegistryIdBlock.decodeRegistryIdBlocks(mapDecodeTaggedObjects.get(1));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot decode null!");
    }
}
