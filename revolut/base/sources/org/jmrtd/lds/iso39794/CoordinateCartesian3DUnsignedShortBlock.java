package org.jmrtd.lds.iso39794;

import j6.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class CoordinateCartesian3DUnsignedShortBlock extends Block implements FaceImageLandmarkCoordinates {
    private static final long serialVersionUID = -6100355379192071041L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f228980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f228981y;
    private int z;

    public CoordinateCartesian3DUnsignedShortBlock(int i, int i2, int i3) {
        this.f228980x = i;
        this.f228981y = i2;
        this.z = i3;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        CoordinateCartesian3DUnsignedShortBlock coordinateCartesian3DUnsignedShortBlock = (CoordinateCartesian3DUnsignedShortBlock) obj2;
        return this.f228980x == coordinateCartesian3DUnsignedShortBlock.f228980x && this.f228981y == coordinateCartesian3DUnsignedShortBlock.f228981y && this.z == coordinateCartesian3DUnsignedShortBlock.z;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeInt(this.f228980x));
        map.put(1, ASN1Util.encodeInt(this.f228981y));
        map.put(2, ASN1Util.encodeInt(this.z));
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getX() {
        return this.f228980x;
    }

    public int getY() {
        return this.f228981y;
    }

    public int getZ() {
        return this.z;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f228980x), Integer.valueOf(this.f228981y), Integer.valueOf(this.z));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("CoordinateCartesian3DUnsignedShortBlock [x: ");
        sb6.append(this.f228980x);
        sb6.append(", y: ");
        sb6.append(this.f228981y);
        sb6.append(", z: ");
        return a.v(sb6, "]", this.z);
    }

    public CoordinateCartesian3DUnsignedShortBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.f228980x = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
        this.f228981y = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
        this.z = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(2));
    }
}
