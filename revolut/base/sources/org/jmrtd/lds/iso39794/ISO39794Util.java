package org.jmrtd.lds.iso39794;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
class ISO39794Util {
    private ISO39794Util() {
    }

    public static Integer decodeCodeFromChoiceExtensionBlockFallback(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            return Integer.valueOf(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0)));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            return Integer.valueOf(ASN1Util.decodeInt(ASN1Util.decodeTaggedObjects(mapDecodeTaggedObjects.get(1)).get(0)));
        }
        return null;
    }

    public static int decodeScoreOrError(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            return ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
        }
        return -1;
    }

    public static ASN1Encodable encodeBlocks(List<? extends Block> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Block block : list) {
            if (block != null) {
                arrayList.add(block.getASN1Object());
            }
        }
        return new DERSequence((ASN1Encodable[]) arrayList.toArray(new ASN1Encodable[0]));
    }

    public static ASN1Encodable encodeCodeAsChoiceExtensionBlockFallback(int i) {
        return new DERSequence(new DERTaggedObject(false, 0, ASN1Util.encodeInt(i)));
    }

    public static ASN1Encodable encodeScoreOrError(int i) {
        HashMap map = new HashMap();
        if (i >= 0) {
            map.put(0, ASN1Util.encodeInt(i));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }
}
