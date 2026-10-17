package org.bouncycastle.asn1.tsp;

import a0.d;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.Attributes;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes14.dex */
public class ArchiveTimeStamp extends ASN1Object {
    private final Attributes attributes;
    private final AlgorithmIdentifier digestAlgorithm;
    private final ASN1Sequence reducedHashTree;
    private final ContentInfo timeStamp;

    private ArchiveTimeStamp(ASN1Sequence aSN1Sequence) {
        AlgorithmIdentifier tagged;
        int i;
        Attributes tagged2;
        ASN1TaggedObject contextOptional;
        ASN1TaggedObject contextOptional2;
        ASN1TaggedObject contextOptional3;
        int size = aSN1Sequence.size();
        if (size < 1 || size > 4) {
            throw new IllegalArgumentException(d.n("Bad sequence size: ", size));
        }
        ASN1Sequence aSN1Sequence2 = null;
        if (size <= 0 || (contextOptional3 = ASN1TaggedObject.getContextOptional(aSN1Sequence.getObjectAt(0), 0)) == null) {
            tagged = null;
            i = 0;
        } else {
            tagged = AlgorithmIdentifier.getTagged(contextOptional3, false);
            i = 1;
        }
        this.digestAlgorithm = tagged;
        if (i >= size || (contextOptional2 = ASN1TaggedObject.getContextOptional(aSN1Sequence.getObjectAt(i), 1)) == null) {
            tagged2 = null;
        } else {
            i++;
            tagged2 = Attributes.getTagged(contextOptional2, false);
        }
        this.attributes = tagged2;
        if (i < size && (contextOptional = ASN1TaggedObject.getContextOptional(aSN1Sequence.getObjectAt(i), 2)) != null) {
            i++;
            aSN1Sequence2 = ASN1Sequence.getInstance(contextOptional, false);
        }
        this.reducedHashTree = aSN1Sequence2;
        int i2 = i + 1;
        this.timeStamp = ContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
        if (i2 != size) {
            throw new IllegalArgumentException("Unexpected elements in sequence");
        }
    }

    public static ArchiveTimeStamp getInstance(Object obj2) {
        if (obj2 instanceof ArchiveTimeStamp) {
            return (ArchiveTimeStamp) obj2;
        }
        if (obj2 != null) {
            return new ArchiveTimeStamp(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public static ArchiveTimeStamp getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new ArchiveTimeStamp(ASN1Sequence.getTagged(aSN1TaggedObject, z));
    }

    private TSTInfo getTimeStampInfo() {
        if (!CMSObjectIdentifiers.signedData.equals((ASN1Primitive) this.timeStamp.getContentType())) {
            throw new IllegalStateException("cannot identify algorithm identifier for digest");
        }
        ContentInfo encapContentInfo = SignedData.getInstance(this.timeStamp.getContent()).getEncapContentInfo();
        if (PKCSObjectIdentifiers.id_ct_TSTInfo.equals((ASN1Primitive) encapContentInfo.getContentType())) {
            return TSTInfo.getInstance(ASN1OctetString.getInstance(encapContentInfo.getContent()).getOctets());
        }
        throw new IllegalStateException("cannot parse time stamp");
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        AlgorithmIdentifier algorithmIdentifier = this.digestAlgorithm;
        return algorithmIdentifier != null ? algorithmIdentifier : getTimeStampInfo().getMessageImprint().getHashAlgorithm();
    }

    public PartialHashtree getHashTreeLeaf() {
        ASN1Sequence aSN1Sequence = this.reducedHashTree;
        if (aSN1Sequence == null) {
            return null;
        }
        return PartialHashtree.getInstance(aSN1Sequence.getObjectAt(0));
    }

    public PartialHashtree[] getReducedHashTree() {
        ASN1Sequence aSN1Sequence = this.reducedHashTree;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        PartialHashtree[] partialHashtreeArr = new PartialHashtree[size];
        for (int i = 0; i != size; i++) {
            partialHashtreeArr[i] = PartialHashtree.getInstance(this.reducedHashTree.getObjectAt(i));
        }
        return partialHashtreeArr;
    }

    public ContentInfo getTimeStamp() {
        return this.timeStamp;
    }

    public byte[] getTimeStampDigestValue() {
        return getTimeStampInfo().getMessageImprint().getHashedMessage();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        AlgorithmIdentifier algorithmIdentifier = this.digestAlgorithm;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) algorithmIdentifier));
        }
        Attributes attributes = this.attributes;
        if (attributes != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) attributes));
        }
        ASN1Sequence aSN1Sequence = this.reducedHashTree;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) aSN1Sequence));
        }
        aSN1EncodableVector.add(this.timeStamp);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ArchiveTimeStamp getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new ArchiveTimeStamp(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public ArchiveTimeStamp(ContentInfo contentInfo) {
        this(null, null, null, contentInfo);
    }

    public ArchiveTimeStamp(AlgorithmIdentifier algorithmIdentifier, Attributes attributes, PartialHashtree[] partialHashtreeArr, ContentInfo contentInfo) {
        if (contentInfo == null) {
            throw new NullPointerException("'timeStamp' cannot be null");
        }
        this.digestAlgorithm = algorithmIdentifier;
        this.attributes = attributes;
        this.reducedHashTree = DERSequence.fromElementsOptional(partialHashtreeArr);
        this.timeStamp = contentInfo;
    }

    public ArchiveTimeStamp(AlgorithmIdentifier algorithmIdentifier, PartialHashtree[] partialHashtreeArr, ContentInfo contentInfo) {
        this(algorithmIdentifier, null, partialHashtreeArr, contentInfo);
    }
}
