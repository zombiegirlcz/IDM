package org.bouncycastle.asn1.isismtt.x509;

import okl.m;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class DeclarationOfMajority extends ASN1Object implements ASN1Choice {
    public static final int dateOfBirth = 2;
    public static final int fullAgeAtCountry = 1;
    public static final int notYoungerThan = 0;
    private ASN1TaggedObject declaration;

    public DeclarationOfMajority(int i) {
        this.declaration = new DERTaggedObject(false, 0, (ASN1Encodable) ASN1Integer.valueOf(i));
    }

    public static DeclarationOfMajority getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof DeclarationOfMajority)) {
            return (DeclarationOfMajority) obj2;
        }
        if (obj2 instanceof ASN1TaggedObject) {
            return new DeclarationOfMajority(ASN1TaggedObject.getContextInstance(obj2));
        }
        throw new IllegalArgumentException(a.g(obj2, "illegal object in getInstance: "));
    }

    public ASN1Sequence fullAgeAtCountry() {
        if (this.declaration.getTagNo() != 1) {
            return null;
        }
        return ASN1Sequence.getInstance(this.declaration, false);
    }

    public ASN1GeneralizedTime getDateOfBirth() {
        if (this.declaration.getTagNo() != 2) {
            return null;
        }
        return ASN1GeneralizedTime.getInstance(this.declaration, false);
    }

    public int getType() {
        return this.declaration.getTagNo();
    }

    public int notYoungerThan() {
        if (this.declaration.getTagNo() != 0) {
            return -1;
        }
        return ASN1Integer.getInstance(this.declaration, false).intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.declaration;
    }

    public DeclarationOfMajority(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.declaration = new DERTaggedObject(false, 2, (ASN1Encodable) aSN1GeneralizedTime);
    }

    private DeclarationOfMajority(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() > 2) {
            throw new IllegalArgumentException(m.o(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
        }
        this.declaration = aSN1TaggedObject;
    }

    public DeclarationOfMajority(boolean z, String str) {
        if (str.length() > 2) {
            throw new IllegalArgumentException("country can only be 2 characters");
        }
        this.declaration = z ? new DERTaggedObject(false, 1, (ASN1Encodable) new DERSequence(new DERPrintableString(str, true))) : new DERTaggedObject(false, 1, (ASN1Encodable) new DERSequence(ASN1Boolean.FALSE, new DERPrintableString(str, true)));
    }
}
