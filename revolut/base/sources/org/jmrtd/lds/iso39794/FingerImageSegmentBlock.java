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
public class FingerImageSegmentBlock extends Block {
    private static final long serialVersionUID = -374626239054691564L;
    private int confidence;
    private List<CoordinateCartesian2DUnsignedShortBlock> enclosingCoordinatesBlock;
    private Integer orientation;
    private FingerImagePositionCode positionCode;
    private List<QualityBlock> qualityBlocks;

    public FingerImageSegmentBlock(FingerImagePositionCode fingerImagePositionCode, List<CoordinateCartesian2DUnsignedShortBlock> list, Integer num, List<QualityBlock> list2, int i) {
        this.positionCode = fingerImagePositionCode;
        this.enclosingCoordinatesBlock = list;
        this.orientation = num;
        this.qualityBlocks = list2;
        this.confidence = i;
    }

    public static List<FingerImageSegmentBlock> decodeFingerImageSegmentBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new FingerImageSegmentBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new FingerImageSegmentBlock(it8.next()));
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
        FingerImageSegmentBlock fingerImageSegmentBlock = (FingerImageSegmentBlock) obj2;
        return this.confidence == fingerImageSegmentBlock.confidence && Objects.equals(this.enclosingCoordinatesBlock, fingerImageSegmentBlock.enclosingCoordinatesBlock) && Objects.equals(this.orientation, fingerImageSegmentBlock.orientation) && this.positionCode == fingerImageSegmentBlock.positionCode && Objects.equals(this.qualityBlocks, fingerImageSegmentBlock.qualityBlocks);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.positionCode.getCode()));
        map.put(1, ISO39794Util.encodeBlocks(this.enclosingCoordinatesBlock));
        if (this.orientation != null) {
            map.put(2, ASN1Util.encodeInt(this.orientation.intValue()));
        }
        if (this.qualityBlocks != null) {
            map.put(3, ISO39794Util.encodeBlocks(this.qualityBlocks));
        }
        if (this.confidence >= 0) {
            map.put(4, ISO39794Util.encodeScoreOrError(this.confidence));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public int getConfidence() {
        return this.confidence;
    }

    public List<CoordinateCartesian2DUnsignedShortBlock> getEnclosingCoordinatesBlock() {
        return this.enclosingCoordinatesBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public Integer getOrientation() {
        return this.orientation;
    }

    public FingerImagePositionCode getPositionCode() {
        return this.positionCode;
    }

    public List<QualityBlock> getQualityBlocks() {
        return this.qualityBlocks;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.confidence), this.enclosingCoordinatesBlock, this.orientation, this.positionCode, this.qualityBlocks);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FingerImageSegmentBlock [positionCode: ");
        sb6.append(this.positionCode);
        sb6.append(", enclosingCoordinatesBlock: ");
        sb6.append(this.enclosingCoordinatesBlock);
        sb6.append(", orientation: ");
        sb6.append(this.orientation);
        sb6.append(", qualityBlocks: ");
        sb6.append(this.qualityBlocks);
        sb6.append(", confidence: ");
        return a.v(sb6, "]", this.confidence);
    }

    public FingerImageSegmentBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.positionCode = FingerImagePositionCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(0)).intValue());
        this.enclosingCoordinatesBlock = CoordinateCartesian2DUnsignedShortBlock.decodeCoordinateCartesian2DUnsignedShortBlocks(mapDecodeTaggedObjects.get(1));
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.orientation = Integer.valueOf(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(2)));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.qualityBlocks = QualityBlock.decodeQualityBlocks(mapDecodeTaggedObjects.get(3));
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.confidence = ISO39794Util.decodeScoreOrError(mapDecodeTaggedObjects.get(4));
        }
    }
}
