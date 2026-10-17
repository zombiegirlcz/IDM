package org.bouncycastle.pqc.asn1;

import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes14.dex */
public class XMSSKeyParams extends ASN1Object {
    private final int height;
    private final AlgorithmIdentifier treeDigest;
    private final ASN1Integer version;

    public XMSSKeyParams(int i, AlgorithmIdentifier algorithmIdentifier) {
        this.version = ASN1Integer.ZERO;
        this.height = i;
        this.treeDigest = algorithmIdentifier;
    }

    public static XMSSKeyParams getInstance(Object obj2) {
        if (obj2 instanceof XMSSKeyParams) {
            return (XMSSKeyParams) obj2;
        }
        if (obj2 != null) {
            return new XMSSKeyParams(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public int getHeight() {
        return this.height;
    }

    public AlgorithmIdentifier getTreeDigest() {
        return this.treeDigest;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(ASN1Integer.valueOf(this.height));
        aSN1EncodableVector.add(this.treeDigest);
        return new DERSequence(aSN1EncodableVector);
    }

    private XMSSKeyParams(ASN1Sequence aSN1Sequence) {
        this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.height = m.e(aSN1Sequence, 1);
        this.treeDigest = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
