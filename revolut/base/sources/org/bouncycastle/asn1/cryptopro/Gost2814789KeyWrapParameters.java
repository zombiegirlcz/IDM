package org.bouncycastle.asn1.cryptopro;

import ehe.n;
import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class Gost2814789KeyWrapParameters extends ASN1Object {
    private final ASN1ObjectIdentifier encryptionParamSet;

    /* JADX INFO: renamed from: ukm, reason: collision with root package name */
    private final byte[] f228187ukm;

    public Gost2814789KeyWrapParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, null);
    }

    public static Gost2814789KeyWrapParameters getInstance(Object obj2) {
        if (obj2 instanceof Gost2814789KeyWrapParameters) {
            return (Gost2814789KeyWrapParameters) obj2;
        }
        if (obj2 != null) {
            return new Gost2814789KeyWrapParameters(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.encryptionParamSet;
    }

    public byte[] getUkm() {
        return Arrays.clone(this.f228187ukm);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.encryptionParamSet);
        if (this.f228187ukm != null) {
            aSN1EncodableVector.add(new DEROctetString(this.f228187ukm));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Gost2814789KeyWrapParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.encryptionParamSet = aSN1ObjectIdentifier;
        this.f228187ukm = Arrays.clone(bArr);
    }

    private Gost2814789KeyWrapParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.f228187ukm = n.D(aSN1Sequence, 1);
        } else {
            if (aSN1Sequence.size() != 1) {
                throw new IllegalArgumentException(m.n(aSN1Sequence, new StringBuilder("unknown sequence length: ")));
            }
            this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.f228187ukm = null;
        }
    }
}
