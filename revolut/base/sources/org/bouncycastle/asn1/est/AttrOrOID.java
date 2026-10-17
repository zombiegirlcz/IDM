package org.bouncycastle.asn1.est;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.Attribute;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class AttrOrOID extends ASN1Object implements ASN1Choice {
    private final Attribute attribute;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private final ASN1ObjectIdentifier f228192oid;

    public AttrOrOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f228192oid = aSN1ObjectIdentifier;
        this.attribute = null;
    }

    public static AttrOrOID getInstance(Object obj2) {
        if (obj2 instanceof AttrOrOID) {
            return (AttrOrOID) obj2;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj2).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                return new AttrOrOID(ASN1ObjectIdentifier.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof ASN1Sequence) {
                return new AttrOrOID(Attribute.getInstance(aSN1Primitive));
            }
        }
        if (!(obj2 instanceof byte[])) {
            throw new IllegalArgumentException(a.g(obj2, "unknown object in getInstance(): "));
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj2));
        } catch (IOException unused) {
            throw new IllegalArgumentException("unknown encoding in getInstance()");
        }
    }

    public Attribute getAttribute() {
        return this.attribute;
    }

    public ASN1ObjectIdentifier getOid() {
        return this.f228192oid;
    }

    public boolean isOid() {
        return this.f228192oid != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f228192oid;
        return aSN1ObjectIdentifier != null ? aSN1ObjectIdentifier : this.attribute.toASN1Primitive();
    }

    public AttrOrOID(Attribute attribute) {
        this.f228192oid = null;
        this.attribute = attribute;
    }
}
