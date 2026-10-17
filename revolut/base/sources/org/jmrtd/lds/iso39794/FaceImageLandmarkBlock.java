package org.jmrtd.lds.iso39794;

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
public class FaceImageLandmarkBlock extends Block {
    private static final long serialVersionUID = -8008877005187206392L;
    private FaceImageLandmarkCoordinates landmarkCoordinates;
    private FaceImageLandmarkKind landmarkKind;

    public FaceImageLandmarkBlock(FaceImageLandmarkKind faceImageLandmarkKind, FaceImageLandmarkCoordinates faceImageLandmarkCoordinates) {
        this.landmarkKind = faceImageLandmarkKind;
        this.landmarkCoordinates = faceImageLandmarkCoordinates;
    }

    public static List<FaceImageLandmarkBlock> decodeLandmarkBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new FaceImageLandmarkBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new FaceImageLandmarkBlock(it8.next()));
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
        FaceImageLandmarkBlock faceImageLandmarkBlock = (FaceImageLandmarkBlock) obj2;
        return Objects.equals(this.landmarkCoordinates, faceImageLandmarkBlock.landmarkCoordinates) && Objects.equals(this.landmarkKind, faceImageLandmarkBlock.landmarkKind);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, FaceImageLandmarkKind.encodeLandmarkKind(this.landmarkKind));
        if (this.landmarkCoordinates != null) {
            map.put(1, FaceImageLandmarkCoordinates.encodeLandmarkCoordinates(this.landmarkCoordinates));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public FaceImageLandmarkCoordinates getLandmarkCoordinates() {
        return this.landmarkCoordinates;
    }

    public FaceImageLandmarkKind getLandmarkKind() {
        return this.landmarkKind;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.landmarkCoordinates, this.landmarkKind);
    }

    public String toString() {
        return "FaceImageLandmarkBlock [landmarkKind: " + this.landmarkKind + ", landmarkCoordinates: " + this.landmarkCoordinates + "]";
    }

    public FaceImageLandmarkBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.landmarkKind = FaceImageLandmarkKind.decodeLandmarkKind(mapDecodeTaggedObjects.get(0));
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.landmarkCoordinates = FaceImageLandmarkCoordinates.decodeLandmarkCoordinates(mapDecodeTaggedObjects.get(1));
        }
    }
}
