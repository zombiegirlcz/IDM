package org.bouncycastle.crypto.generators;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f228392iv;
    private byte[] shared;

    public BaseKDFBytesGenerator(int i, Digest digest) {
        this.counterStart = i;
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i2 < i) {
            throw new OutputLengthException("output buffer too small");
        }
        this.digest.reset();
        int digestSize = this.digest.getDigestSize();
        if (i2 > ((long) digestSize) * BodyPartID.bodyIdMax) {
            throw new IllegalArgumentException("Output length too large");
        }
        int i3 = this.counterStart;
        byte[] bArr2 = new byte[4];
        int i5 = i2;
        while (i5 > 0) {
            Pack.intToBigEndian(i3, bArr2);
            Digest digest = this.digest;
            byte[] bArr3 = this.shared;
            digest.update(bArr3, 0, bArr3.length);
            this.digest.update(bArr2, 0, 4);
            byte[] bArr4 = this.f228392iv;
            if (bArr4 != null) {
                this.digest.update(bArr4, 0, bArr4.length);
            }
            if (i5 < digestSize) {
                byte[] bArr5 = new byte[digestSize];
                this.digest.doFinal(bArr5, 0);
                System.arraycopy(bArr5, 0, bArr, i, i5);
                return i2;
            }
            this.digest.doFinal(bArr, i);
            i += digestSize;
            i5 -= digestSize;
            i3++;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f228392iv = kDFParameters.getIV();
        } else {
            if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                throw new IllegalArgumentException("KDF parameters required for generator");
            }
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.f228392iv = null;
        }
    }
}
