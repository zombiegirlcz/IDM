package org.bouncycastle.pqc.crypto.ntruplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusKEMGenerator implements EncapsulatedSecretGenerator {

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private final SecureRandom f228852sr;

    public NTRUPlusKEMGenerator(SecureRandom secureRandom) {
        this.f228852sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        NTRUPlusPublicKeyParameters nTRUPlusPublicKeyParameters = (NTRUPlusPublicKeyParameters) asymmetricKeyParameter;
        NTRUPlusParameters parameters = nTRUPlusPublicKeyParameters.getParameters();
        byte[] bArr = new byte[parameters.getCiphertextBytes()];
        byte[] bArr2 = new byte[32];
        NTRUPlusEngine nTRUPlusEngine = new NTRUPlusEngine(parameters);
        byte[] bArr3 = new byte[parameters.getN() >> 3];
        this.f228852sr.nextBytes(bArr3);
        nTRUPlusEngine.crypto_kem_enc_derand(bArr, 0, bArr2, 0, nTRUPlusPublicKeyParameters.getEncoded(), 0, bArr3, 0);
        return new SecretWithEncapsulationImpl(bArr2, bArr);
    }
}
