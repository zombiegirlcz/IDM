package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes14.dex */
public class DHPublicKeyParameters extends DHKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f228489y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f228489y = validate(bigInteger, dHParameters);
    }

    private static int legendre(BigInteger bigInteger, BigInteger bigInteger2) {
        int iBitLength = bigInteger2.bitLength();
        int[] iArrFromBigInteger = Nat.fromBigInteger(iBitLength, bigInteger);
        int[] iArrFromBigInteger2 = Nat.fromBigInteger(iBitLength, bigInteger2);
        int length = iArrFromBigInteger2.length;
        int i = 0;
        while (true) {
            int i2 = iArrFromBigInteger[0];
            if (i2 == 0) {
                Nat.shiftDownWord(length, iArrFromBigInteger, 0);
            } else {
                int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i2);
                if (iNumberOfTrailingZeros > 0) {
                    Nat.shiftDownBits(length, iArrFromBigInteger, iNumberOfTrailingZeros, 0);
                    int i3 = iArrFromBigInteger2[0];
                    i ^= (iNumberOfTrailingZeros << 1) & (i3 ^ (i3 >>> 1));
                }
                int iCompare = Nat.compare(length, iArrFromBigInteger, iArrFromBigInteger2);
                if (iCompare == 0) {
                    break;
                }
                if (iCompare < 0) {
                    i ^= iArrFromBigInteger[0] & iArrFromBigInteger2[0];
                    int[] iArr = iArrFromBigInteger2;
                    iArrFromBigInteger2 = iArrFromBigInteger;
                    iArrFromBigInteger = iArr;
                }
                while (true) {
                    int i5 = length - 1;
                    if (iArrFromBigInteger[i5] != 0) {
                        break;
                    }
                    length = i5;
                }
                Nat.sub(length, iArrFromBigInteger, iArrFromBigInteger2, iArrFromBigInteger);
            }
        }
        if (Nat.isOne(length, iArrFromBigInteger2)) {
            return 1 - (i & 2);
        }
        return 0;
    }

    private BigInteger validate(BigInteger bigInteger, DHParameters dHParameters) {
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        BigInteger p2 = dHParameters.getP();
        BigInteger bigInteger2 = TWO;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(p2.subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        BigInteger q5 = dHParameters.getQ();
        if (q5 != null && (!(p2.testBit(0) && p2.bitLength() - 1 == q5.bitLength() && p2.shiftRight(1).equals(q5)) ? ONE.equals(bigInteger.modPow(q5, p2)) : 1 == legendre(bigInteger, p2))) {
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
        return bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj2) {
        return (obj2 instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj2).getY().equals(this.f228489y) && super.equals(obj2);
    }

    public BigInteger getY() {
        return this.f228489y;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f228489y.hashCode() ^ super.hashCode();
    }
}
