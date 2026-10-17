package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class GeneralNames extends ASN1Object {
    private final GeneralName[] names;

    private GeneralNames(ASN1Sequence aSN1Sequence) {
        this.names = new GeneralName[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            this.names[i] = GeneralName.getInstance(aSN1Sequence.getObjectAt(i));
        }
    }

    private static GeneralName[] copy(GeneralName[] generalNameArr) {
        GeneralName[] generalNameArr2 = new GeneralName[generalNameArr.length];
        System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        return generalNameArr2;
    }

    public static GeneralNames fromExtensions(Extensions extensions, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, aSN1ObjectIdentifier));
    }

    public static GeneralNames getInstance(Object obj2) {
        if (obj2 instanceof GeneralNames) {
            return (GeneralNames) obj2;
        }
        if (obj2 != null) {
            return new GeneralNames(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public GeneralName[] getNames() {
        return copy(this.names);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.names);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("GeneralNames:");
        String strLineSeparator = Strings.lineSeparator();
        sb6.append(strLineSeparator);
        for (int i = 0; i != this.names.length; i++) {
            sb6.append("    ");
            sb6.append(this.names[i]);
            sb6.append(strLineSeparator);
        }
        return sb6.toString();
    }

    public GeneralNames(GeneralName generalName) {
        this.names = new GeneralName[]{generalName};
    }

    public static GeneralNames getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new GeneralNames(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public GeneralNames(GeneralName[] generalNameArr) {
        this.names = copy(generalNameArr);
    }
}
