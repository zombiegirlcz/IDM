package org.bouncycastle.asn1.isismtt.ocsp;

import java.io.IOException;
import okl.m;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.util.Arrays;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class RequestedCertificate extends ASN1Object implements ASN1Choice {
    public static final int attributeCertificate = 1;
    public static final int certificate = -1;
    public static final int publicKeyCertificate = 0;
    private byte[] attributeCert;
    private Certificate cert;
    private byte[] publicKeyCert;

    public RequestedCertificate(int i, byte[] bArr) {
        this(new DERTaggedObject(i, new DEROctetString(bArr)));
    }

    public static RequestedCertificate getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof RequestedCertificate)) {
            return (RequestedCertificate) obj2;
        }
        if (obj2 instanceof ASN1Sequence) {
            return new RequestedCertificate(Certificate.getInstance(obj2));
        }
        if (obj2 instanceof ASN1TaggedObject) {
            return new RequestedCertificate((ASN1TaggedObject) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "illegal object in getInstance: "));
    }

    public byte[] getCertificateBytes() {
        Certificate certificate2 = this.cert;
        if (certificate2 == null) {
            byte[] bArr = this.publicKeyCert;
            return bArr != null ? Arrays.clone(bArr) : Arrays.clone(this.attributeCert);
        }
        try {
            return certificate2.getEncoded();
        } catch (IOException e) {
            throw new IllegalStateException(ch.qos.logback.core.util.a.r("can't decode certificate: ", e));
        }
    }

    public int getType() {
        if (this.cert != null) {
            return -1;
        }
        return this.publicKeyCert != null ? 0 : 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.publicKeyCert != null ? new DERTaggedObject(0, new DEROctetString(this.publicKeyCert)) : this.attributeCert != null ? new DERTaggedObject(1, new DEROctetString(this.attributeCert)) : this.cert.toASN1Primitive();
    }

    private RequestedCertificate(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.publicKeyCert = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        } else {
            if (aSN1TaggedObject.getTagNo() != 1) {
                throw new IllegalArgumentException(m.o(aSN1TaggedObject, new StringBuilder("unknown tag number: ")));
            }
            this.attributeCert = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        }
    }

    public static RequestedCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getExplicitBaseObject());
        }
        throw new IllegalArgumentException("choice item must be explicitly tagged");
    }

    public RequestedCertificate(Certificate certificate2) {
        this.cert = certificate2;
    }
}
