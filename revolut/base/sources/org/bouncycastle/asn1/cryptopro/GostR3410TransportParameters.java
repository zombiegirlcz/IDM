package org.bouncycastle.asn1.cryptopro;

import ehe.n;
import okl.m;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class GostR3410TransportParameters extends ASN1Object {
    private final ASN1ObjectIdentifier encryptionParamSet;
    private final SubjectPublicKeyInfo ephemeralPublicKey;

    /* JADX INFO: renamed from: ukm, reason: collision with root package name */
    private final byte[] f228188ukm;

    public GostR3410TransportParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SubjectPublicKeyInfo subjectPublicKeyInfo, byte[] bArr) {
        this.encryptionParamSet = aSN1ObjectIdentifier;
        this.ephemeralPublicKey = subjectPublicKeyInfo;
        this.f228188ukm = Arrays.clone(bArr);
    }

    public static GostR3410TransportParameters getInstance(Object obj2) {
        if (obj2 instanceof GostR3410TransportParameters) {
            return (GostR3410TransportParameters) obj2;
        }
        if (obj2 != null) {
            return new GostR3410TransportParameters(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.encryptionParamSet;
    }

    public SubjectPublicKeyInfo getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public byte[] getUkm() {
        return Arrays.clone(this.f228188ukm);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.encryptionParamSet);
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.ephemeralPublicKey;
        if (subjectPublicKeyInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) subjectPublicKeyInfo));
        }
        aSN1EncodableVector.add(new DEROctetString(this.f228188ukm));
        return new DERSequence(aSN1EncodableVector);
    }

    private GostR3410TransportParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.f228188ukm = n.D(aSN1Sequence, 1);
            this.ephemeralPublicKey = null;
        } else {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException(m.n(aSN1Sequence, new StringBuilder("unknown sequence length: ")));
            }
            this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.ephemeralPublicKey = SubjectPublicKeyInfo.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false);
            this.f228188ukm = n.D(aSN1Sequence, 2);
        }
    }

    public static GostR3410TransportParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new GostR3410TransportParameters(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
