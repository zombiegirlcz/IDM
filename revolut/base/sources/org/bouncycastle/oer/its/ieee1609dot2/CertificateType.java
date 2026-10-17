package org.bouncycastle.oer.its.ieee1609dot2;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class CertificateType extends ASN1Enumerated {
    public static final CertificateType explicit = new CertificateType(BigInteger.ZERO);
    public static final CertificateType implicit = new CertificateType(BigInteger.ONE);

    public CertificateType(BigInteger bigInteger) {
        super(bigInteger);
        assertValues();
    }

    public static CertificateType getInstance(Object obj2) {
        if (obj2 instanceof CertificateType) {
            return (CertificateType) obj2;
        }
        if (obj2 != null) {
            return new CertificateType(ASN1Enumerated.getInstance(obj2));
        }
        return null;
    }

    public void assertValues() {
        if (getValue().compareTo(BigInteger.ZERO) < 0 || getValue().compareTo(BigIntegers.ONE) > 0) {
            throw new IllegalArgumentException("invalid enumeration value " + getValue());
        }
    }

    private CertificateType(ASN1Enumerated aSN1Enumerated) {
        this(aSN1Enumerated.getValue());
    }
}
