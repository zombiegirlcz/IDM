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
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public class FingerImageSegmentationBlock extends Block {
    private static final long serialVersionUID = -971841765544346186L;
    private RegistryIdBlock algorithmIdBlock;
    private List<FingerImageSegmentBlock> segmentBlocks;

    public FingerImageSegmentationBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.algorithmIdBlock = new RegistryIdBlock(mapDecodeTaggedObjects.get(0));
        this.segmentBlocks = FingerImageSegmentBlock.decodeFingerImageSegmentBlocks(mapDecodeTaggedObjects.get(1));
    }

    public static List<FingerImageSegmentationBlock> decodeFingerImageSegmentationBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new FingerImageSegmentationBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new FingerImageSegmentationBlock(it8.next()));
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
        FingerImageSegmentationBlock fingerImageSegmentationBlock = (FingerImageSegmentationBlock) obj2;
        return Objects.equals(this.algorithmIdBlock, fingerImageSegmentationBlock.algorithmIdBlock) && Objects.equals(this.segmentBlocks, fingerImageSegmentationBlock.segmentBlocks);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, this.algorithmIdBlock.getASN1Object());
        map.put(1, ISO39794Util.encodeBlocks(this.segmentBlocks));
        return ASN1Util.encodeTaggedObjects(map);
    }

    public RegistryIdBlock getAlgorithmIdBlock() {
        return this.algorithmIdBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public List<FingerImageSegmentBlock> getSegmentBlocks() {
        return this.segmentBlocks;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.algorithmIdBlock, this.segmentBlocks);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FingerImageSegmentationBlock [algorithmIdBlock: ");
        sb6.append(this.algorithmIdBlock);
        sb6.append(", segmentBlocks: ");
        return a.q("]", this.segmentBlocks, sb6);
    }
}
