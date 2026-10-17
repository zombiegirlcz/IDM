package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class HashAlgorithm extends ASN1Enumerated {
    public static final HashAlgorithm sha256 = new HashAlgorithm(BigInteger.ZERO);
    public static final HashAlgorithm sha384 = new HashAlgorithm(BigIntegers.ONE);

    public HashAlgorithm(BigInteger bigInteger) {
        super(bigInteger);
        assertValues();
    }

    public static HashAlgorithm getInstance(Object obj2) {
        if (obj2 instanceof HashAlgorithm) {
            return (HashAlgorithm) obj2;
        }
        if (obj2 != null) {
            return new HashAlgorithm(ASN1Enumerated.getInstance(obj2));
        }
        return null;
    }

    public void assertValues() {
        int iIntValueExact = BigIntegers.intValueExact(getValue());
        if (iIntValueExact == 0 || iIntValueExact == 1) {
            return;
        }
        throw new IllegalArgumentException("invalid enumeration value " + getValue());
    }

    private HashAlgorithm(ASN1Enumerated aSN1Enumerated) {
        this(aSN1Enumerated.getValue());
    }
}
