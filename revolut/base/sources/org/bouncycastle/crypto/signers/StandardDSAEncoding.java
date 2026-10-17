package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class StandardDSAEncoding implements DSAEncoding {
    public static final StandardDSAEncoding INSTANCE = new StandardDSAEncoding();

    public BigInteger checkValue(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public BigInteger[] decode(BigInteger bigInteger, byte[] bArr) throws IOException {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        if (aSN1Sequence.size() == 2) {
            BigInteger bigIntegerDecodeValue = decodeValue(bigInteger, aSN1Sequence, 0);
            BigInteger bigIntegerDecodeValue2 = decodeValue(bigInteger, aSN1Sequence, 1);
            if (Arrays.areEqual(encode(bigInteger, bigIntegerDecodeValue, bigIntegerDecodeValue2), bArr)) {
                return new BigInteger[]{bigIntegerDecodeValue, bigIntegerDecodeValue2};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }

    public BigInteger decodeValue(BigInteger bigInteger, ASN1Sequence aSN1Sequence, int i) {
        return checkValue(bigInteger, ((ASN1Integer) aSN1Sequence.getObjectAt(i)).getValue());
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) throws IOException {
        return new DERSequence(encodeValue(bigInteger, bigInteger2), encodeValue(bigInteger, bigInteger3)).getEncoded("DER");
    }

    public ASN1Integer encodeValue(BigInteger bigInteger, BigInteger bigInteger2) {
        return new ASN1Integer(checkValue(bigInteger, bigInteger2));
    }
}
