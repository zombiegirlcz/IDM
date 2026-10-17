package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import okl.m;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.x9.KeySpecificInfo;
import org.bouncycastle.asn1.x9.OtherInfo;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.io.DigestOutputStream;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private byte[] extraInfo;
    private int keySize;
    private byte[] z;

    public DHKEKGenerator(Digest digest) {
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
        byte[] bArr2 = new byte[4];
        OtherInfo otherInfo = new OtherInfo(new KeySpecificInfo(this.algorithm, DEROctetString.withContents(bArr2)), DEROctetString.withContentsOptional(this.extraInfo), DEROctetString.withContents(Pack.intToBigEndian(this.keySize)));
        DigestOutputStream digestOutputStream = new DigestOutputStream(this.digest);
        int i3 = 0;
        for (int i5 = i2; i5 > 0; i5 -= digestSize) {
            Digest digest = this.digest;
            byte[] bArr3 = this.z;
            digest.update(bArr3, 0, bArr3.length);
            i3++;
            try {
                Pack.intToBigEndian(i3, bArr2);
                otherInfo.encodeTo(digestOutputStream, "DER");
                if (i5 < digestSize) {
                    byte[] bArr4 = new byte[digestSize];
                    this.digest.doFinal(bArr4, 0);
                    System.arraycopy(bArr4, 0, bArr, i, i5);
                    return i2;
                }
                this.digest.doFinal(bArr, i);
                i += digestSize;
            } catch (IOException e) {
                throw new IllegalArgumentException(m.f(e, new StringBuilder("unable to encode parameter info: ")));
            }
        }
        return i2;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.z = dHKDFParameters.getZ();
        this.extraInfo = dHKDFParameters.getExtraInfo();
    }
}
