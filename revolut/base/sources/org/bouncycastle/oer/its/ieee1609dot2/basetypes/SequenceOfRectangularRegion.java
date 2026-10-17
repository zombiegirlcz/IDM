package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

/* JADX INFO: loaded from: classes14.dex */
public class SequenceOfRectangularRegion extends ASN1Object {
    private final List<RectangularRegion> rectangularRegions;

    public SequenceOfRectangularRegion(List<RectangularRegion> list) {
        this.rectangularRegions = Collections.unmodifiableList(list);
    }

    public static SequenceOfRectangularRegion getInstance(Object obj2) {
        if (obj2 instanceof SequenceOfRectangularRegion) {
            return (SequenceOfRectangularRegion) obj2;
        }
        if (obj2 != null) {
            return new SequenceOfRectangularRegion(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public List<RectangularRegion> getRectangularRegions() {
        return this.rectangularRegions;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.rectangularRegions);
    }

    private SequenceOfRectangularRegion(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it8 = aSN1Sequence.iterator();
        while (it8.hasNext()) {
            arrayList.add(RectangularRegion.getInstance(it8.next()));
        }
        this.rectangularRegions = Collections.unmodifiableList(arrayList);
    }
}
