package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class SequenceOfOctetString extends ASN1Object {
    private final List<ASN1OctetString> octetStrings;

    public SequenceOfOctetString(List<ASN1OctetString> list) {
        this.octetStrings = Collections.unmodifiableList(list);
    }

    public static SequenceOfOctetString getInstance(Object obj2) {
        if (obj2 instanceof SequenceOfOctetString) {
            return (SequenceOfOctetString) obj2;
        }
        if (obj2 != null) {
            return new SequenceOfOctetString(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public List<ASN1OctetString> getOctetStrings() {
        return this.octetStrings;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i = 0; i != this.octetStrings.size(); i++) {
            aSN1EncodableVector.add(this.octetStrings.get(i));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private SequenceOfOctetString(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it8 = aSN1Sequence.iterator();
        while (it8.hasNext()) {
            arrayList.add(ASN1OctetString.getInstance(it8.next()));
        }
        this.octetStrings = Collections.unmodifiableList(arrayList);
    }
}
