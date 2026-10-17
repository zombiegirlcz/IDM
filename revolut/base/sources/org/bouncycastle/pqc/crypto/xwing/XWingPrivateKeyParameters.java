package org.bouncycastle.pqc.crypto.xwing;

import org.bouncycastle.crypto.params.MLKEMParameters;
import org.bouncycastle.crypto.params.MLKEMPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLKEMPublicKeyParameters;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class XWingPrivateKeyParameters extends XWingKeyParameters {
    private final transient MLKEMPrivateKeyParameters kyberPrivateKey;
    private final transient MLKEMPublicKeyParameters kyberPublicKey;
    private final transient byte[] seed;
    private final transient X25519PrivateKeyParameters xdhPrivateKey;
    private final transient X25519PublicKeyParameters xdhPublicKey;

    public XWingPrivateKeyParameters(byte[] bArr) {
        super(true);
        XWingPrivateKeyParameters xWingPrivateKeyParameters = (XWingPrivateKeyParameters) XWingKeyPairGenerator.genKeyPair(bArr).getPrivate();
        this.seed = xWingPrivateKeyParameters.seed;
        this.kyberPrivateKey = xWingPrivateKeyParameters.kyberPrivateKey;
        this.xdhPrivateKey = xWingPrivateKeyParameters.xdhPrivateKey;
        this.kyberPublicKey = xWingPrivateKeyParameters.kyberPublicKey;
        this.xdhPublicKey = xWingPrivateKeyParameters.xdhPublicKey;
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.seed);
    }

    public MLKEMPrivateKeyParameters getKyberPrivateKey() {
        return this.kyberPrivateKey;
    }

    public MLKEMPublicKeyParameters getKyberPublicKey() {
        return this.kyberPublicKey;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public X25519PrivateKeyParameters getXDHPrivateKey() {
        return this.xdhPrivateKey;
    }

    public X25519PublicKeyParameters getXDHPublicKey() {
        return this.xdhPublicKey;
    }

    public XWingPrivateKeyParameters(byte[] bArr, MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, X25519PrivateKeyParameters x25519PrivateKeyParameters, MLKEMPublicKeyParameters mLKEMPublicKeyParameters, X25519PublicKeyParameters x25519PublicKeyParameters) {
        super(true);
        this.seed = Arrays.clone(bArr);
        this.kyberPrivateKey = mLKEMPrivateKeyParameters;
        this.xdhPrivateKey = x25519PrivateKeyParameters;
        this.kyberPublicKey = mLKEMPublicKeyParameters;
        this.xdhPublicKey = x25519PublicKeyParameters;
    }

    @Deprecated
    public XWingPrivateKeyParameters(byte[] bArr, org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, X25519PrivateKeyParameters x25519PrivateKeyParameters, org.bouncycastle.pqc.crypto.mlkem.MLKEMPublicKeyParameters mLKEMPublicKeyParameters, X25519PublicKeyParameters x25519PublicKeyParameters) {
        super(true);
        MLKEMParameters mLKEMParameters = mLKEMPublicKeyParameters.getParameters().getName().equals("ML-KEM-512") ? MLKEMParameters.ml_kem_512 : mLKEMPublicKeyParameters.getParameters().getName().equals("ML-KEM-768") ? MLKEMParameters.ml_kem_768 : MLKEMParameters.ml_kem_1024;
        MLKEMPublicKeyParameters mLKEMPublicKeyParameters2 = new MLKEMPublicKeyParameters(mLKEMParameters, mLKEMPublicKeyParameters.getEncoded());
        this.seed = Arrays.clone(bArr);
        this.kyberPrivateKey = new MLKEMPrivateKeyParameters(mLKEMParameters, mLKEMPrivateKeyParameters.getEncoded(), mLKEMPublicKeyParameters2);
        this.xdhPrivateKey = x25519PrivateKeyParameters;
        this.kyberPublicKey = mLKEMPublicKeyParameters2;
        this.xdhPublicKey = x25519PublicKeyParameters;
    }
}
