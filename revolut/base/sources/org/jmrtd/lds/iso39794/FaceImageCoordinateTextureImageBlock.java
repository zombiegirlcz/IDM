package org.jmrtd.lds.iso39794;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageCoordinateTextureImageBlock extends Block implements FaceImageLandmarkCoordinates {
    private static final long serialVersionUID = -563037651358748573L;
    private BigInteger uInPixel;
    private BigInteger vInPixel;

    public FaceImageCoordinateTextureImageBlock(BigInteger bigInteger, BigInteger bigInteger2) {
        this.uInPixel = bigInteger;
        this.vInPixel = bigInteger2;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageCoordinateTextureImageBlock faceImageCoordinateTextureImageBlock = (FaceImageCoordinateTextureImageBlock) obj2;
        return Objects.equals(this.uInPixel, faceImageCoordinateTextureImageBlock.uInPixel) && Objects.equals(this.vInPixel, faceImageCoordinateTextureImageBlock.vInPixel);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeBigInteger(this.uInPixel));
        map.put(1, ASN1Util.encodeBigInteger(this.vInPixel));
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public BigInteger getUInPixel() {
        return this.uInPixel;
    }

    public BigInteger getVInPixel() {
        return this.vInPixel;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.uInPixel, this.vInPixel);
    }

    public String toString() {
        return "CoordinateTextureImageBlock [uInPixel: " + this.uInPixel + ", vInPixel: " + this.vInPixel + "]";
    }

    public FaceImageCoordinateTextureImageBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.uInPixel = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(0));
        this.vInPixel = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(1));
    }
}
