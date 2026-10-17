package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class HQCKEMGenerator implements EncapsulatedSecretGenerator {
    private final SecureRandom random;

    public HQCKEMGenerator(SecureRandom secureRandom) {
        this.random = CryptoServicesRegistrar.getSecureRandom(secureRandom);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        HQCPublicKeyParameters hQCPublicKeyParameters = (HQCPublicKeyParameters) asymmetricKeyParameter;
        HQCEngine engine = hQCPublicKeyParameters.getParameters().getEngine();
        byte[] bArr = new byte[hQCPublicKeyParameters.getParameters().getSHA512_BYTES()];
        byte[] bArr2 = new byte[hQCPublicKeyParameters.getParameters().getN_BYTES()];
        byte[] bArr3 = new byte[hQCPublicKeyParameters.getParameters().getN1N2_BYTES()];
        byte[] bArr4 = new byte[hQCPublicKeyParameters.getParameters().getSALT_SIZE_BYTES()];
        engine.encaps(bArr2, bArr3, bArr, hQCPublicKeyParameters.getPublicKey(), bArr4, this.random);
        return new SecretWithEncapsulationImpl(Arrays.copyOfRange(bArr, 0, 32), Arrays.concatenate(bArr2, bArr3, bArr4));
    }
}
