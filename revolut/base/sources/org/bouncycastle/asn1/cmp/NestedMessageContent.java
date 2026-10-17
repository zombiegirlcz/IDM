package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes14.dex */
public class NestedMessageContent extends PKIMessages {
    public NestedMessageContent(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static NestedMessageContent getInstance(Object obj2) {
        if (obj2 instanceof NestedMessageContent) {
            return (NestedMessageContent) obj2;
        }
        if (obj2 != null) {
            return new NestedMessageContent(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public NestedMessageContent(PKIMessage pKIMessage) {
        super(pKIMessage);
    }

    public NestedMessageContent(PKIMessage[] pKIMessageArr) {
        super(pKIMessageArr);
    }
}
