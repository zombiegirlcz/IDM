package org.bouncycastle.asn1.cms;

import okl.m;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes14.dex */
public class KEMRecipientInfo extends ASN1Object {
    private final ASN1Integer cmsVersion;
    private final ASN1OctetString encryptedKey;

    /* JADX INFO: renamed from: kdf, reason: collision with root package name */
    private final AlgorithmIdentifier f228162kdf;
    private final ASN1Integer kekLength;

    /* JADX INFO: renamed from: kem, reason: collision with root package name */
    private final AlgorithmIdentifier f228163kem;
    private final ASN1OctetString kemct;

    /* JADX INFO: renamed from: rid, reason: collision with root package name */
    private final RecipientIdentifier f228164rid;

    /* JADX INFO: renamed from: ukm, reason: collision with root package name */
    private final ASN1OctetString f228165ukm;
    private final AlgorithmIdentifier wrap;

    private KEMRecipientInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 8 || aSN1Sequence.size() > 9) {
            throw new IllegalArgumentException(m.n(aSN1Sequence, new StringBuilder("bad sequence size: ")));
        }
        this.cmsVersion = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.f228164rid = RecipientIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f228163kem = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        this.kemct = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3));
        this.f228162kdf = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(4));
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(5));
        this.kekLength = aSN1Integer;
        if (aSN1Integer.intValueExact() > 65535) {
            throw new IllegalArgumentException("kekLength must be <= 65535");
        }
        int i = 6;
        if (aSN1Sequence.getObjectAt(6) instanceof ASN1TaggedObject) {
            this.f228165ukm = ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(6)), true);
            i = 7;
        } else {
            this.f228165ukm = null;
        }
        this.wrap = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
        this.encryptedKey = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 1));
    }

    public static KEMRecipientInfo getInstance(Object obj2) {
        if (obj2 instanceof KEMRecipientInfo) {
            return (KEMRecipientInfo) obj2;
        }
        if (obj2 != null) {
            return new KEMRecipientInfo(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1OctetString getEncryptedKey() {
        return this.encryptedKey;
    }

    public AlgorithmIdentifier getKdf() {
        return this.f228162kdf;
    }

    public AlgorithmIdentifier getKem() {
        return this.f228163kem;
    }

    public ASN1OctetString getKemct() {
        return this.kemct;
    }

    public RecipientIdentifier getRecipientIdentifier() {
        return this.f228164rid;
    }

    public byte[] getUkm() {
        ASN1OctetString aSN1OctetString = this.f228165ukm;
        if (aSN1OctetString == null) {
            return null;
        }
        return aSN1OctetString.getOctets();
    }

    public AlgorithmIdentifier getWrap() {
        return this.wrap;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.cmsVersion);
        aSN1EncodableVector.add(this.f228164rid);
        aSN1EncodableVector.add(this.f228163kem);
        aSN1EncodableVector.add(this.kemct);
        aSN1EncodableVector.add(this.f228162kdf);
        aSN1EncodableVector.add(this.kekLength);
        ASN1OctetString aSN1OctetString = this.f228165ukm;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) aSN1OctetString));
        }
        aSN1EncodableVector.add(this.wrap);
        aSN1EncodableVector.add(this.encryptedKey);
        return new DERSequence(aSN1EncodableVector);
    }

    public KEMRecipientInfo(RecipientIdentifier recipientIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString, AlgorithmIdentifier algorithmIdentifier2, ASN1Integer aSN1Integer, ASN1OctetString aSN1OctetString2, AlgorithmIdentifier algorithmIdentifier3, ASN1OctetString aSN1OctetString3) {
        if (algorithmIdentifier == null) {
            throw new NullPointerException("kem cannot be null");
        }
        if (algorithmIdentifier3 == null) {
            throw new NullPointerException("wrap cannot be null");
        }
        if (aSN1Integer.intValueExact() > 65535) {
            throw new IllegalArgumentException("kekLength must be <= 65535");
        }
        this.cmsVersion = ASN1Integer.ZERO;
        this.f228164rid = recipientIdentifier;
        this.f228163kem = algorithmIdentifier;
        this.kemct = aSN1OctetString;
        this.f228162kdf = algorithmIdentifier2;
        this.kekLength = aSN1Integer;
        this.f228165ukm = aSN1OctetString2;
        this.wrap = algorithmIdentifier3;
        this.encryptedKey = aSN1OctetString3;
    }
}
