package org.ejbca.cvc;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class OIDField extends AbstractDataField {
    private static final long serialVersionUID = 5212215839749666908L;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f228963id;

    public OIDField() {
        super(CVCTagEnum.OID);
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof OIDField) {
            return this.f228963id.equals(((OIDField) obj2).getValue());
        }
        return false;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public byte[] getEncoded() {
        try {
            byte[] encoded = new ASN1ObjectIdentifier(this.f228963id).getEncoded();
            int length = encoded.length - 2;
            byte[] bArr = new byte[length];
            System.arraycopy(encoded, 2, bArr, 0, length);
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public String getValue() {
        return this.f228963id;
    }

    public String toString() {
        return getValue();
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public String valueAsText() {
        return this.f228963id;
    }

    public OIDField(String str) {
        this();
        this.f228963id = str;
    }

    public OIDField(byte[] bArr) {
        this();
        this.f228963id = ASN1ObjectIdentifier.getInstance(new DERTaggedObject(true, 0, (ASN1Encodable) new DEROctetString(bArr)), false).getId();
    }
}
