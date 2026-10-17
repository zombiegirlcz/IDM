package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU4145Signer implements DSAExt {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private ECKeyParameters key;
    private SecureRandom random;

    private static BigInteger fieldElement2Integer(BigInteger bigInteger, ECFieldElement eCFieldElement) {
        return truncate(eCFieldElement.toBigInteger(), bigInteger.bitLength() - 1);
    }

    private static ECFieldElement hash2FieldElement(ECCurve eCCurve, byte[] bArr) {
        return eCCurve.fromBigInteger(truncate(new BigInteger(1, Arrays.reverse(bArr)), eCCurve.getFieldSize()));
    }

    private static BigInteger truncate(BigInteger bigInteger, int i) {
        return bigInteger.bitLength() > i ? bigInteger.mod(ONE.shiftLeft(i)) : bigInteger;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        ECCurve curve = parameters.getCurve();
        ECFieldElement eCFieldElementHash2FieldElement = hash2FieldElement(curve, bArr);
        if (eCFieldElementHash2FieldElement.isZero()) {
            eCFieldElementHash2FieldElement = curve.fromBigInteger(ONE);
        }
        BigInteger n3 = parameters.getN();
        BigInteger d = ((ECPrivateKeyParameters) this.key).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigInteger = BigInteger.ONE;
            BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger, n3.subtract(bigInteger), this.random);
            ECFieldElement affineXCoord = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerCreateRandomInRange).normalize().getAffineXCoord();
            if (!affineXCoord.isZero()) {
                BigInteger bigIntegerFieldElement2Integer = fieldElement2Integer(n3, eCFieldElementHash2FieldElement.multiply(affineXCoord));
                if (bigIntegerFieldElement2Integer.signum() != 0) {
                    BigInteger bigIntegerMod = bigIntegerFieldElement2Integer.multiply(d).add(bigIntegerCreateRandomInRange).mod(n3);
                    if (bigIntegerMod.signum() != 0) {
                        return new BigInteger[]{bigIntegerFieldElement2Integer, bigIntegerMod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getN();
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom random = null;
        if (z) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                random = parametersWithRandom.getRandom();
                cipherParameters = parametersWithRandom.getParameters();
            }
            this.key = (ECPrivateKeyParameters) cipherParameters;
            this.random = CryptoServicesRegistrar.getSecureRandom(random);
        } else {
            this.key = (ECPublicKeyParameters) cipherParameters;
            this.random = null;
        }
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DSTU4145", this.key, z));
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() > 0 && bigInteger2.signum() > 0) {
            ECDomainParameters parameters = this.key.getParameters();
            BigInteger n3 = parameters.getN();
            if (bigInteger.compareTo(n3) < 0 && bigInteger2.compareTo(n3) < 0) {
                ECCurve curve = parameters.getCurve();
                ECFieldElement eCFieldElementHash2FieldElement = hash2FieldElement(curve, bArr);
                if (eCFieldElementHash2FieldElement.isZero()) {
                    eCFieldElementHash2FieldElement = curve.fromBigInteger(ONE);
                }
                ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigInteger2, ((ECPublicKeyParameters) this.key).getQ(), bigInteger).normalize();
                if (!eCPointNormalize.isInfinity() && fieldElement2Integer(n3, eCFieldElementHash2FieldElement.multiply(eCPointNormalize.getAffineXCoord())).compareTo(bigInteger) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
