package org.jmrtd.lds.iso39794;

import j6.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class IrisImageLocalisationBlock extends Block {
    private static final long serialVersionUID = 3352687403941493410L;
    private int irisCenterXLargest;
    private int irisCenterXSmallest;
    private int irisCenterYLargest;
    private int irisCenterYSmallest;
    private int irisDiameterLargest;
    private int irisDiameterSmallest;

    public IrisImageLocalisationBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.irisCenterXSmallest = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.irisCenterXLargest = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.irisCenterYSmallest = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(2));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.irisCenterYLargest = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(3));
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.irisDiameterSmallest = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(4));
        }
        if (mapDecodeTaggedObjects.containsKey(5)) {
            this.irisDiameterLargest = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(5));
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
        IrisImageLocalisationBlock irisImageLocalisationBlock = (IrisImageLocalisationBlock) obj2;
        return this.irisCenterXLargest == irisImageLocalisationBlock.irisCenterXLargest && this.irisCenterXSmallest == irisImageLocalisationBlock.irisCenterXSmallest && this.irisCenterYLargest == irisImageLocalisationBlock.irisCenterYLargest && this.irisCenterYSmallest == irisImageLocalisationBlock.irisCenterYSmallest && this.irisDiameterLargest == irisImageLocalisationBlock.irisDiameterLargest && this.irisDiameterSmallest == irisImageLocalisationBlock.irisDiameterSmallest;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.irisCenterXSmallest >= 0) {
            map.put(0, ASN1Util.encodeInt(this.irisCenterXSmallest));
        }
        if (this.irisCenterXLargest >= 0) {
            map.put(1, ASN1Util.encodeInt(this.irisCenterXLargest));
        }
        if (this.irisCenterYSmallest >= 0) {
            map.put(2, ASN1Util.encodeInt(this.irisCenterYSmallest));
        }
        if (this.irisCenterYLargest >= 0) {
            map.put(3, ASN1Util.encodeInt(this.irisCenterYLargest));
        }
        if (this.irisDiameterSmallest >= 0) {
            map.put(4, ASN1Util.encodeInt(this.irisDiameterSmallest));
        }
        if (this.irisDiameterLargest >= 0) {
            map.put(5, ASN1Util.encodeInt(this.irisDiameterLargest));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getIrisCenterXLargest() {
        return this.irisCenterXLargest;
    }

    public int getIrisCenterXSmallest() {
        return this.irisCenterXSmallest;
    }

    public int getIrisCenterYLargest() {
        return this.irisCenterYLargest;
    }

    public int getIrisCenterYSmallest() {
        return this.irisCenterYSmallest;
    }

    public int getIrisDiameterLargest() {
        return this.irisDiameterLargest;
    }

    public int getIrisDiameterSmallest() {
        return this.irisDiameterSmallest;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.irisCenterXLargest), Integer.valueOf(this.irisCenterXSmallest), Integer.valueOf(this.irisCenterYLargest), Integer.valueOf(this.irisCenterYSmallest), Integer.valueOf(this.irisDiameterLargest), Integer.valueOf(this.irisDiameterSmallest));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("IrisImageLocalisationBlock [irisCenterXSmallest: ");
        sb6.append(this.irisCenterXSmallest);
        sb6.append(", irisCenterXLargest: ");
        sb6.append(this.irisCenterXLargest);
        sb6.append(", irisCenterYSmallest: ");
        sb6.append(this.irisCenterYSmallest);
        sb6.append(", irisCenterYLargest: ");
        sb6.append(this.irisCenterYLargest);
        sb6.append(", irisDiameterSmallest: ");
        sb6.append(this.irisDiameterSmallest);
        sb6.append(", irisDiameterLargest: ");
        return a.v(sb6, "]", this.irisDiameterLargest);
    }
}
