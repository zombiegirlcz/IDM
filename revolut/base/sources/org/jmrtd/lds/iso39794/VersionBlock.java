package org.jmrtd.lds.iso39794;

import j6.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class VersionBlock extends Block implements Serializable {
    private static final long serialVersionUID = 8681451530654803679L;
    private int generation;
    private int year;

    public VersionBlock(int i, int i2) {
        this.year = i2;
        this.generation = i;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        VersionBlock versionBlock = (VersionBlock) obj2;
        return this.generation == versionBlock.generation && this.year == versionBlock.year;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeInt(this.generation));
        map.put(1, ASN1Util.encodeInt(this.year));
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getGeneration() {
        return this.generation;
    }

    public int getYear() {
        return this.year;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.generation), Integer.valueOf(this.year));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("VersionBlock [generation: ");
        sb6.append(this.generation);
        sb6.append(", year: ");
        return a.v(sb6, "]", this.year);
    }

    public VersionBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable instanceof ASN1Sequence) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            this.generation = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
            this.year = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
            return;
        }
        throw new IllegalArgumentException("Cannot decode!");
    }
}
