package org.bouncycastle.crypto.generators;

import a0.d;
import com.google.android.gms.wallet.WalletConstants;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.youTransactor.uCube.rpc.Constants;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.util.BigIntegers;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, LDSFile.EF_DG13_TAG, 113, CertificateBody.profileType, ISO781611.CREATION_DATE_AND_TIME_TAG, 137, 139, 149, ISO7816.TAG_SM_EXPECTED_LENGTH, 157, Constants.TAG_ACE_LAYER_VERSION, 167, 173, 179, 181, 191, Constants.TAG_ATMEL_SERIAL, Constants.TAG_BATTERY_STATE, 199, 211, PassportService.DEFAULT_MAX_BLOCKSIZE, Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS, Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION, Constants.TAG_USB_CAPABILITY, 239, Constants.TAG_TRANSACTION_DATA, Constants.TAG_FB_CHARGING_STATUS, StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, 419, 421, 431, OnfidoActivity.ONFIDO_RECREATE, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i, i2, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i) {
        int iNextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((((long) i) * ((long) (secureRandom.nextInt() & Integer.MAX_VALUE))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = iNextInt % i;
        } while ((i - 1) + (iNextInt - i2) < 0);
        return i2;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j2;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigIntegerMod;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        int i;
        PrintStream printStream;
        StringBuilder sb6;
        int i2;
        BigInteger bigIntegerCreateRandomPrime;
        SecureRandom secureRandom;
        int i3;
        SecureRandom secureRandom2;
        int i5;
        BigInteger bigInteger8;
        BigInteger bigInteger9;
        int i6;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply2 = ONE;
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2;
        for (int i21 = 0; i21 < vectorPermuteList.size() / 2; i21++) {
            bigIntegerMultiply3 = bigIntegerMultiply3.multiply((BigInteger) vectorPermuteList.elementAt(i21));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply4 = bigIntegerMultiply3.multiply(bigIntegerMultiply2);
        int iBitLength = (((strength - bigIntegerMultiply4.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply3).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply2).shiftLeft(1);
        long j3 = 0;
        while (true) {
            j2 = j3 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply5 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply5.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (BigIntegers.modOddIsCoprime(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2), bigIntegerMultiply4)) {
                    BigInteger bigInteger10 = bigIntegerShiftLeft;
                    bigIntegerMultiply = bigIntegerAdd.multiply(bigIntegerAdd2);
                    bigInteger3 = bigInteger10;
                    if (bigIntegerMultiply.bitLength() >= strength) {
                        break;
                    }
                    int i22 = strength;
                    secureRandom2 = random;
                    i5 = certainty;
                    bigInteger8 = bigIntegerGeneratePrime3;
                    bigInteger9 = bigIntegerGeneratePrime4;
                    if (z) {
                        PrintStream printStream2 = System.out;
                        i6 = i22;
                        StringBuilder sbW = d.w(i6, "key size too small. Should be ", " but is actually ");
                        sbW.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sbW.toString());
                    } else {
                        i6 = i22;
                    }
                } else {
                    i6 = strength;
                    secureRandom2 = random;
                    i5 = certainty;
                    bigInteger3 = bigIntegerShiftLeft;
                    bigInteger9 = bigIntegerGeneratePrime4;
                    bigInteger8 = bigIntegerGeneratePrime3;
                }
            } else {
                secureRandom2 = random;
                i5 = certainty;
                z = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
                bigInteger3 = bigIntegerShiftLeft;
                bigInteger9 = bigIntegerGeneratePrime4;
                bigInteger8 = bigIntegerGeneratePrime3;
                i6 = strength;
            }
            bigIntegerGeneratePrime3 = bigInteger8;
            strength = i6;
            bigIntegerGeneratePrime4 = bigInteger9;
            j3 = j2;
            zIsDebug = z;
            bigIntegerShiftLeft2 = bigInteger2;
            bigIntegerShiftLeft = bigInteger3;
            random = secureRandom2;
            certainty = i5;
        }
        BigInteger bigInteger11 = bigIntegerGeneratePrime4;
        if (z) {
            bigInteger4 = bigIntegerGeneratePrime3;
            System.out.println("needed " + j2 + " tries to generate p and q.");
        } else {
            bigInteger4 = bigIntegerGeneratePrime3;
        }
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z) {
            System.out.println("generating g");
        }
        long j5 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger5 = bigIntegerAdd2;
            int i32 = 0;
            while (i32 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i32));
                while (true) {
                    j5++;
                    i2 = i32;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    i3 = certainty;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply).equals(ONE)) {
                        i32 = i2;
                        random = secureRandom;
                        certainty = i3;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i32 = i2 + 1;
                random = secureRandom;
                certainty = i3;
            }
            SecureRandom secureRandom3 = random;
            int i33 = certainty;
            bigIntegerMod = ONE;
            for (int i43 = 0; i43 < vectorPermuteList.size(); i43++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i43)).modPow(bigIntegerMultiply4.divide((BigInteger) vectorPermuteList.elementAt(i43)), bigIntegerMultiply)).mod(bigIntegerMultiply);
            }
            int i59 = 0;
            while (true) {
                if (i59 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply);
                    BigInteger bigInteger12 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger12)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply).equals(bigInteger12)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply).equals(bigInteger12)) {
                                bigInteger6 = bigInteger4;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply).equals(bigInteger12)) {
                                    bigInteger7 = bigInteger11;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger7), bigIntegerMultiply).equals(bigInteger12)) {
                                        break;
                                    }
                                    if (z) {
                                        i = strength;
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else {
                                    if (z) {
                                        System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                    }
                                    bigInteger7 = bigInteger11;
                                }
                            } else if (z) {
                                printStream = System.out;
                                sb6 = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb6.append(bigIntegerMod);
                                printStream.println(sb6.toString());
                            }
                        } else if (z) {
                            printStream = System.out;
                            sb6 = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb6.append(bigIntegerMod);
                            printStream.println(sb6.toString());
                        }
                    } else if (z) {
                        printStream = System.out;
                        sb6 = new StringBuilder("g has order phi(n)/4\n g:");
                        sb6.append(bigIntegerMod);
                        printStream.println(sb6.toString());
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i59)), bigIntegerMultiply).equals(ONE)) {
                    i59++;
                } else if (z) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i59) + "\n g: " + bigIntegerMod);
                }
            }
            bigInteger7 = bigInteger11;
            bigInteger6 = bigInteger4;
            i = strength;
            bigInteger4 = bigInteger6;
            strength = i;
            random = secureRandom3;
            certainty = i33;
            bigInteger11 = bigInteger7;
            bigIntegerAdd2 = bigInteger5;
        }
        if (z) {
            System.out.println("needed " + j5 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply4 + " (" + bigIntegerMultiply4.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb9 = new StringBuilder("a:.......... ");
            sb9.append(bigInteger6);
            printStream3.println(sb9.toString());
            System.out.println("b:.......... " + bigInteger7);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigIntegerAdd);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + bigIntegerMultiply);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
