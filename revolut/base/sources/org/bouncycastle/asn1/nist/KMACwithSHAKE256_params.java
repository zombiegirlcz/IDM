package org.bouncycastle.asn1.nist;

import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class KMACwithSHAKE256_params extends ASN1Object {
    private static final int DEF_LENGTH = 512;
    private static final byte[] EMPTY_STRING = new byte[0];
    private final byte[] customizationString;
    private final int outputLength;

    public KMACwithSHAKE256_params(int i) {
        this.outputLength = i;
        this.customizationString = EMPTY_STRING;
    }

    public static KMACwithSHAKE256_params getInstance(Object obj2) {
        if (obj2 instanceof KMACwithSHAKE256_params) {
            return (KMACwithSHAKE256_params) obj2;
        }
        if (obj2 != null) {
            return new KMACwithSHAKE256_params(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getCustomizationString() {
        return Arrays.clone(this.customizationString);
    }

    public int getOutputLength() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        int i = this.outputLength;
        if (i != 512) {
            aSN1EncodableVector.add(ASN1Integer.valueOf(i));
        }
        if (this.customizationString.length != 0) {
            aSN1EncodableVector.add(new DEROctetString(getCustomizationString()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public KMACwithSHAKE256_params(int i, byte[] bArr) {
        this.outputLength = i;
        this.customizationString = Arrays.clone(bArr);
    }

    private KMACwithSHAKE256_params(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException("sequence size greater than 2");
        }
        if (aSN1Sequence.size() == 2) {
            this.outputLength = m.e(aSN1Sequence, 0);
            this.customizationString = m.C(aSN1Sequence, 1);
        } else if (aSN1Sequence.size() != 1) {
            this.outputLength = 512;
            this.customizationString = EMPTY_STRING;
        } else if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.outputLength = m.e(aSN1Sequence, 0);
            this.customizationString = EMPTY_STRING;
        } else {
            this.outputLength = 512;
            this.customizationString = m.C(aSN1Sequence, 0);
        }
    }
}
