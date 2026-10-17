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
public class QualityBlock extends Block {
    private static final long serialVersionUID = 8529221328304209845L;
    private RegistryIdBlock algorithmIdBlock;
    private int score;

    public QualityBlock(RegistryIdBlock registryIdBlock, int i) {
        this.algorithmIdBlock = registryIdBlock;
        this.score = i;
    }

    public static List<QualityBlock> decodeQualityBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new QualityBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new QualityBlock(it8.next()));
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
        QualityBlock qualityBlock = (QualityBlock) obj2;
        return Objects.equals(this.algorithmIdBlock, qualityBlock.algorithmIdBlock) && this.score == qualityBlock.score;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, this.algorithmIdBlock.getASN1Object());
        if (this.score >= 0) {
            map.put(1, ISO39794Util.encodeScoreOrError(this.score));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public RegistryIdBlock getAlgorithmIdBlock() {
        return this.algorithmIdBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getScore() {
        return this.score;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.algorithmIdBlock, Integer.valueOf(this.score));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("QualityBlock [algorithmIdBlock: ");
        sb6.append(this.algorithmIdBlock);
        sb6.append(", score: ");
        return a.v(sb6, "]", this.score);
    }

    public QualityBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.algorithmIdBlock = new RegistryIdBlock(mapDecodeTaggedObjects.get(0));
        this.score = ISO39794Util.decodeScoreOrError(mapDecodeTaggedObjects.get(1));
    }
}
