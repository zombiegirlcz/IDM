package org.jmrtd.lds.iso39794;

import j6.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class CoordinateCartesian2DUnsignedShortBlock extends Block implements FaceImageLandmarkCoordinates {
    private static final long serialVersionUID = -3221155578581711766L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f228978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f228979y;

    public CoordinateCartesian2DUnsignedShortBlock(int i, int i2) {
        this.f228978x = i;
        this.f228979y = i2;
    }

    public static List<CoordinateCartesian2DUnsignedShortBlock> decodeCoordinateCartesian2DUnsignedShortBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new CoordinateCartesian2DUnsignedShortBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new CoordinateCartesian2DUnsignedShortBlock(it8.next()));
        }
        return arrayList;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        CoordinateCartesian2DUnsignedShortBlock coordinateCartesian2DUnsignedShortBlock = (CoordinateCartesian2DUnsignedShortBlock) obj2;
        return this.f228978x == coordinateCartesian2DUnsignedShortBlock.f228978x && this.f228979y == coordinateCartesian2DUnsignedShortBlock.f228979y;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeInt(this.f228978x));
        map.put(1, ASN1Util.encodeInt(this.f228979y));
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getX() {
        return this.f228978x;
    }

    public int getY() {
        return this.f228979y;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f228978x), Integer.valueOf(this.f228979y));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("CoordinateCartesian2DUnsignedShortBlock [x: ");
        sb6.append(this.f228978x);
        sb6.append(", y: ");
        return a.v(sb6, "]", this.f228979y);
    }

    public CoordinateCartesian2DUnsignedShortBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.f228978x = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
        this.f228979y = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
    }
}
