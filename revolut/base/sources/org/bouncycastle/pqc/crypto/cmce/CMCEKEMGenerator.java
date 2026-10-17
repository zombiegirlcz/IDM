package org.bouncycastle.pqc.crypto.cmce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* JADX INFO: loaded from: classes14.dex */
public class CMCEKEMGenerator implements EncapsulatedSecretGenerator {

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private final SecureRandom f228782sr;

    public CMCEKEMGenerator(SecureRandom secureRandom) {
        this.f228782sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        return generateEncapsulated(asymmetricKeyParameter, ((CMCEPublicKeyParameters) asymmetricKeyParameter).getParameters().getEngine().getDefaultSessionKeySize());
    }

    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter, int i) {
        CMCEPublicKeyParameters cMCEPublicKeyParameters = (CMCEPublicKeyParameters) asymmetricKeyParameter;
        CMCEEngine engine = cMCEPublicKeyParameters.getParameters().getEngine();
        byte[] bArr = new byte[engine.getCipherTextSize()];
        byte[] bArr2 = new byte[i / 8];
        engine.kem_enc(bArr, bArr2, cMCEPublicKeyParameters.getPublicKey(), this.f228782sr);
        return new SecretWithEncapsulationImpl(bArr2, bArr);
    }
}
