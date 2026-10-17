package org.bouncycastle.crypto.signers;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.ECCSIPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECCSIPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class ECCSISigner implements Signer {
    private final ECPoint G;
    private final int N;
    private ECPoint Y;
    private final Digest digest;
    private boolean forSigning;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final byte[] f228558id;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BigInteger f228559j;
    private final ECPoint kpak;
    private CipherParameters param;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final BigInteger f228560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private BigInteger f228561r;
    private ByteArrayOutputStream stream;

    public ECCSISigner(ECPoint eCPoint, X9ECParameters x9ECParameters, Digest digest, byte[] bArr) {
        this.kpak = eCPoint;
        this.f228558id = bArr;
        this.f228560q = x9ECParameters.getCurve().getOrder();
        this.G = x9ECParameters.getG();
        this.digest = digest;
        digest.reset();
        this.N = (x9ECParameters.getCurve().getOrder().bitLength() + 7) >> 3;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        ECCSIPrivateKeyParameters eCCSIPrivateKeyParameters = (ECCSIPrivateKeyParameters) ((ParametersWithRandom) this.param).getParameters();
        BigInteger bigIntegerMod = new BigInteger(1, bArr).add(this.f228561r.multiply(eCCSIPrivateKeyParameters.getSSK())).mod(this.f228560q);
        if (bigIntegerMod.equals(BigInteger.ZERO)) {
            throw new IllegalArgumentException("Invalid j, retry");
        }
        return Arrays.concatenate(BigIntegers.asUnsignedByteArray(this.N, this.f228561r), BigIntegers.asUnsignedByteArray(this.N, bigIntegerMod.modInverse(this.f228560q).multiply(this.f228559j).mod(this.f228560q)), eCCSIPrivateKeyParameters.getPublicKeyParameters().getPVT().getEncoded(false));
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forSigning = z;
        this.param = cipherParameters;
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        SecureRandom random;
        ECPoint pvt;
        ECPoint eCPointMultiply;
        this.digest.reset();
        CipherParameters parameters = this.param;
        if (parameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) parameters;
            random = parametersWithRandom.getRandom();
            parameters = parametersWithRandom.getParameters();
        } else {
            random = null;
        }
        if (this.forSigning) {
            ECCSIPrivateKeyParameters eCCSIPrivateKeyParameters = (ECCSIPrivateKeyParameters) parameters;
            pvt = eCCSIPrivateKeyParameters.getPublicKeyParameters().getPVT();
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(this.f228560q.bitLength(), random);
            this.f228559j = bigIntegerCreateRandomBigInteger;
            this.f228561r = this.G.multiply(bigIntegerCreateRandomBigInteger).normalize().getAffineXCoord().toBigInteger().mod(this.f228560q);
            eCPointMultiply = this.G.multiply(eCCSIPrivateKeyParameters.getSSK());
        } else {
            ECPoint pvt2 = ((ECCSIPublicKeyParameters) parameters).getPVT();
            this.stream = new ByteArrayOutputStream();
            pvt = pvt2;
            eCPointMultiply = null;
        }
        byte[] encoded = this.G.getEncoded(false);
        this.digest.update(encoded, 0, encoded.length);
        byte[] encoded2 = this.kpak.getEncoded(false);
        this.digest.update(encoded2, 0, encoded2.length);
        Digest digest = this.digest;
        byte[] bArr = this.f228558id;
        digest.update(bArr, 0, bArr.length);
        byte[] encoded3 = pvt.getEncoded(false);
        this.digest.update(encoded3, 0, encoded3.length);
        int digestSize = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.digest.doFinal(bArr2, 0);
        BigInteger bigIntegerMod = new BigInteger(1, bArr2).mod(this.f228560q);
        this.digest.update(bArr2, 0, digestSize);
        if (!this.forSigning) {
            this.Y = pvt.multiply(bigIntegerMod).add(this.kpak).normalize();
        } else {
            if (!eCPointMultiply.subtract(pvt.multiply(bigIntegerMod)).normalize().equals(this.kpak)) {
                throw new IllegalArgumentException("Invalid KPAK");
            }
            byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.N, this.f228561r);
            this.digest.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b4) {
        if (this.forSigning) {
            this.digest.update(b4);
        } else {
            this.stream.write(b4);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, this.N);
        int i = this.N;
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, i, i << 1));
        this.f228561r = new BigInteger(1, bArrCopyOf).mod(this.f228560q);
        this.digest.update(bArrCopyOf, 0, this.N);
        byte[] byteArray = this.stream.toByteArray();
        this.digest.update(byteArray, 0, byteArray.length);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return this.G.multiply(new BigInteger(1, bArr2).mod(this.f228560q)).normalize().add(this.Y.multiply(this.f228561r).normalize()).normalize().multiply(bigInteger).normalize().getAffineXCoord().toBigInteger().mod(this.f228560q).equals(this.f228561r.mod(this.f228560q));
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        if (this.forSigning) {
            this.digest.update(bArr, i, i2);
        } else {
            this.stream.write(bArr, i, i2);
        }
    }
}
