package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class ProofOfPossession extends ASN1Object implements ASN1Choice {
    public static final int TYPE_KEY_AGREEMENT = 3;
    public static final int TYPE_KEY_ENCIPHERMENT = 2;
    public static final int TYPE_RA_VERIFIED = 0;
    public static final int TYPE_SIGNING_KEY = 1;

    /* JADX INFO: renamed from: obj, reason: collision with root package name */
    private ASN1Encodable f228174obj;
    private int tagNo;

    public ProofOfPossession() {
        this.tagNo = 0;
        this.f228174obj = DERNull.INSTANCE;
    }

    public static ProofOfPossession getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof ProofOfPossession)) {
            return (ProofOfPossession) obj2;
        }
        if (obj2 instanceof ASN1TaggedObject) {
            return new ProofOfPossession((ASN1TaggedObject) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Invalid object: "));
    }

    public ASN1Encodable getObject() {
        return this.f228174obj;
    }

    public int getType() {
        return this.tagNo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.tagNo, this.f228174obj);
    }

    public ProofOfPossession(int i, POPOPrivKey pOPOPrivKey) {
        this.tagNo = i;
        this.f228174obj = pOPOPrivKey;
    }

    private ProofOfPossession(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Encodable pOPOSigningKey;
        int tagNo = aSN1TaggedObject.getTagNo();
        this.tagNo = tagNo;
        if (tagNo == 0) {
            pOPOSigningKey = DERNull.INSTANCE;
        } else if (tagNo == 1) {
            pOPOSigningKey = POPOSigningKey.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 2 && tagNo != 3) {
                throw new IllegalArgumentException("unknown tag: " + this.tagNo);
            }
            pOPOSigningKey = POPOPrivKey.getInstance(aSN1TaggedObject, true);
        }
        this.f228174obj = pOPOSigningKey;
    }

    public ProofOfPossession(POPOSigningKey pOPOSigningKey) {
        this.tagNo = 1;
        this.f228174obj = pOPOSigningKey;
    }
}
