package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageCaptureDeviceSpectral2DBlock extends Block {
    private static final long serialVersionUID = 1003955292326716335L;
    private Boolean isNearInfrared;
    private Boolean isThermal;
    private Boolean isWhiteLight;

    public FaceImageCaptureDeviceSpectral2DBlock(Boolean bool, Boolean bool2, Boolean bool3) {
        this.isWhiteLight = bool;
        this.isNearInfrared = bool2;
        this.isThermal = bool3;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageCaptureDeviceSpectral2DBlock faceImageCaptureDeviceSpectral2DBlock = (FaceImageCaptureDeviceSpectral2DBlock) obj2;
        return this.isNearInfrared == faceImageCaptureDeviceSpectral2DBlock.isNearInfrared && this.isThermal == faceImageCaptureDeviceSpectral2DBlock.isThermal && this.isWhiteLight == faceImageCaptureDeviceSpectral2DBlock.isWhiteLight;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.isWhiteLight != null) {
            a.w(this.isWhiteLight, map, 0);
        }
        if (this.isNearInfrared != null) {
            a.w(this.isNearInfrared, map, 1);
        }
        if (this.isThermal != null) {
            a.w(this.isThermal, map, 2);
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.isNearInfrared, this.isThermal, this.isWhiteLight);
    }

    public Boolean isNearInfrared() {
        return this.isNearInfrared;
    }

    public Boolean isThermal() {
        return this.isThermal;
    }

    public Boolean isWhiteLight() {
        return this.isWhiteLight;
    }

    public String toString() {
        return "FaceImageCaptureDeviceSpectral2DBlock [isWhiteLight: " + this.isWhiteLight + ", isNearInfrared: " + this.isNearInfrared + ", isThermal: " + this.isThermal + "]";
    }

    public FaceImageCaptureDeviceSpectral2DBlock(ASN1Encodable aSN1Encodable) {
        if (!(aSN1Encodable instanceof ASN1Sequence) && !(aSN1Encodable instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException("Cannot decode!");
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.isWhiteLight = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(0)));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.isNearInfrared = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(1)));
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.isThermal = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(2)));
        }
    }
}
