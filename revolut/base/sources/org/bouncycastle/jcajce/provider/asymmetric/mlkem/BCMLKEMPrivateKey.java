package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.MLKEMPrivateKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.jcajce.interfaces.BCKey;
import org.bouncycastle.jcajce.interfaces.MLKEMPrivateKey;
import org.bouncycastle.jcajce.interfaces.MLKEMPublicKey;
import org.bouncycastle.jcajce.spec.MLKEMParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes14.dex */
public class BCMLKEMPrivateKey implements MLKEMPrivateKey, BCKey {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient ASN1Set attributes;
    private transient MLKEMPrivateKeyParameters params;
    private transient byte[] priorEncoding;

    public BCMLKEMPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        init(privateKeyInfo);
    }

    private void init(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.attributes = privateKeyInfo.getAttributes();
        this.priorEncoding = privateKeyInfo.getEncoded();
        MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters = (MLKEMPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
        this.params = mLKEMPrivateKeyParameters;
        this.algorithm = Strings.toUpperCase(MLKEMParameterSpec.fromName(mLKEMPrivateKeyParameters.getParameters().getName()).getName());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof BCMLKEMPrivateKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCMLKEMPrivateKey) obj2).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            byte[] bArr = this.priorEncoding;
            return bArr != null ? bArr : PrivateKeyInfoFactory.createPrivateKeyInfo(this.params, this.attributes).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public MLKEMPrivateKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLKEMKey
    public MLKEMParameterSpec getParameterSpec() {
        return MLKEMParameterSpec.fromName(this.params.getParameters().getName());
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLKEMPrivateKey
    public byte[] getPrivateData() {
        return this.params.getEncoded();
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLKEMPrivateKey
    public MLKEMPrivateKey getPrivateKey(boolean z) {
        return (!z || this.params.getSeed() == null) ? new BCMLKEMPrivateKey(this.params.withPreferredFormat(2)) : new BCMLKEMPrivateKey(this.params.withPreferredFormat(1));
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLKEMPrivateKey
    public MLKEMPublicKey getPublicKey() {
        return new BCMLKEMPublicKey(this.params.getPublicKeyParameters());
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLKEMPrivateKey
    public byte[] getSeed() {
        return this.params.getSeed();
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        byte[] publicKey = this.params.getPublicKey();
        sb6.append(getAlgorithm());
        sb6.append(" Private Key [");
        sb6.append(new Fingerprint(publicKey).toString());
        sb6.append("]");
        sb6.append(strLineSeparator);
        sb6.append("    public data: ");
        sb6.append(Hex.toHexString(publicKey));
        sb6.append(strLineSeparator);
        return sb6.toString();
    }

    public BCMLKEMPrivateKey(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters) {
        this.params = mLKEMPrivateKeyParameters;
        this.algorithm = Strings.toUpperCase(mLKEMPrivateKeyParameters.getParameters().getName());
    }
}
