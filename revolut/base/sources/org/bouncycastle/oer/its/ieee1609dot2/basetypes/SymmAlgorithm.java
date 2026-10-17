package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class SymmAlgorithm extends ASN1Enumerated {
    public static final SymmAlgorithm aes128Ccm = new SymmAlgorithm(BigInteger.ZERO);

    public SymmAlgorithm(BigInteger bigInteger) {
        super(bigInteger);
        assertValues();
    }

    public static SymmAlgorithm getInstance(Object obj2) {
        if (obj2 instanceof SymmAlgorithm) {
            return (SymmAlgorithm) obj2;
        }
        if (obj2 != null) {
            return new SymmAlgorithm(ASN1Enumerated.getInstance(obj2));
        }
        return null;
    }

    public void assertValues() {
        if (BigIntegers.intValueExact(getValue()) == 0) {
            return;
        }
        throw new IllegalArgumentException("invalid enumeration value " + getValue());
    }

    private SymmAlgorithm(ASN1Enumerated aSN1Enumerated) {
        super(aSN1Enumerated.getValue());
        assertValues();
    }
}
