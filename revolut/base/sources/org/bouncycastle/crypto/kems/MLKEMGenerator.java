package org.bouncycastle.crypto.kems;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.kems.mlkem.MLKEMEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.MLKEMPublicKeyParameters;

/* JADX INFO: loaded from: classes14.dex */
public class MLKEMGenerator implements EncapsulatedSecretGenerator {
    private final SecureRandom random;

    public MLKEMGenerator(SecureRandom secureRandom) {
        this.random = CryptoServicesRegistrar.getSecureRandom(secureRandom);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        byte[] bArr = new byte[32];
        this.random.nextBytes(bArr);
        return internalGenerateEncapsulated((MLKEMPublicKeyParameters) asymmetricKeyParameter, bArr);
    }

    public SecretWithEncapsulation internalGenerateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) {
        return internalGenerateEncapsulated((MLKEMPublicKeyParameters) asymmetricKeyParameter, bArr);
    }

    public static SecretWithEncapsulation internalGenerateEncapsulated(MLKEMPublicKeyParameters mLKEMPublicKeyParameters, byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("'randBytes' has invalid length");
        }
        byte[][] bArrKemEncrypt = MLKEMEngine.getInstance(mLKEMPublicKeyParameters.getParameters()).kemEncrypt(mLKEMPublicKeyParameters, bArr);
        return new org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl(bArrKemEncrypt[0], bArrKemEncrypt[1]);
    }
}
