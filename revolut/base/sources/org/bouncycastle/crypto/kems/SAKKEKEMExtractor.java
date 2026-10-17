package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.params.SAKKEPrivateKeyParameters;
import org.bouncycastle.crypto.params.SAKKEPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.jmrtd.cbeff.StandardBiometricHeader;

/* JADX INFO: loaded from: classes14.dex */
public class SAKKEKEMExtractor implements EncapsulatedSecretExtractor {
    private final ECPoint K_bs;
    private final ECPoint P;
    private final ECPoint Z_S;
    private final ECCurve curve;
    private final Digest digest;
    private final BigInteger identifier;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f228428n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BigInteger f228429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final BigInteger f228430q;

    public SAKKEKEMExtractor(SAKKEPrivateKeyParameters sAKKEPrivateKeyParameters) {
        SAKKEPublicKeyParameters publicParams = sAKKEPrivateKeyParameters.getPublicParams();
        this.curve = publicParams.getCurve();
        BigInteger q5 = publicParams.getQ();
        this.f228430q = q5;
        ECPoint point = publicParams.getPoint();
        this.P = point;
        this.f228429p = publicParams.getPrime();
        this.Z_S = publicParams.getZ();
        BigInteger identifier = publicParams.getIdentifier();
        this.identifier = identifier;
        this.K_bs = point.multiply(identifier.add(sAKKEPrivateKeyParameters.getMasterSecret()).modInverse(q5)).normalize();
        this.f228428n = publicParams.getN();
        this.digest = publicParams.getDigest();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00ed A[PHI: r2
      0x00ed: PHI (r2v10 java.math.BigInteger[]) = (r2v9 java.math.BigInteger[]), (r2v13 java.math.BigInteger[]) binds: [B:5:0x00a2, B:7:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigInteger computePairing(org.bouncycastle.math.ec.ECPoint r16, org.bouncycastle.math.ec.ECPoint r17, java.math.BigInteger r18, java.math.BigInteger r19) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.kems.SAKKEKEMExtractor.computePairing(org.bouncycastle.math.ec.ECPoint, org.bouncycastle.math.ec.ECPoint, java.math.BigInteger, java.math.BigInteger):java.math.BigInteger");
    }

    public static BigInteger[] fp2Multiply(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        return new BigInteger[]{bigInteger.multiply(bigInteger3).subtract(bigInteger2.multiply(bigInteger4)).mod(bigInteger5), bigInteger.multiply(bigInteger4).add(bigInteger2.multiply(bigInteger3)).mod(bigInteger5)};
    }

    public static BigInteger[] fp2PointSquare(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return new BigInteger[]{bigInteger.add(bigInteger2).multiply(bigInteger.subtract(bigInteger2)).mod(bigInteger3), bigInteger.multiply(bigInteger2).shiftLeft(1).mod(bigInteger3)};
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        ECPoint eCPointSumOfTwoMultiplies;
        ECPoint eCPointDecodePoint = this.curve.decodePoint(Arrays.copyOfRange(bArr, 0, StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE));
        BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE, 16);
        BigInteger bigIntegerComputePairing = computePairing(eCPointDecodePoint, this.K_bs, this.f228429p, this.f228430q);
        BigInteger bigIntegerMod = bigIntegerFromUnsignedByteArray.xor(SAKKEKEMSGenerator.hashToIntegerRange(bigIntegerComputePairing.toByteArray(), BigInteger.ONE.shiftLeft(this.f228428n), this.digest)).mod(this.f228429p);
        BigInteger bigInteger = this.identifier;
        BigInteger bigIntegerHashToIntegerRange = SAKKEKEMSGenerator.hashToIntegerRange(Arrays.concatenate(bigIntegerMod.toByteArray(), bigInteger.toByteArray()), this.f228430q, this.digest);
        BigInteger order = this.curve.getOrder();
        if (order == null) {
            eCPointSumOfTwoMultiplies = this.P.multiply(bigInteger).add(this.Z_S).multiply(bigIntegerHashToIntegerRange);
        } else {
            eCPointSumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(this.P, bigInteger.multiply(bigIntegerHashToIntegerRange).mod(order), this.Z_S, bigIntegerHashToIntegerRange);
        }
        if (eCPointSumOfTwoMultiplies.subtract(eCPointDecodePoint).isInfinity()) {
            return BigIntegers.asUnsignedByteArray(this.f228428n / 8, bigIntegerMod);
        }
        throw new IllegalStateException("Validation of R_bS failed");
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return 273;
    }
}
