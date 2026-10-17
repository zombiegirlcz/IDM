package org.bouncycastle.pqc.jcajce.provider.ntruplus;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import okl.m;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.util.SpecUtil;
import org.bouncycastle.pqc.crypto.ntruplus.NTRUPlusKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntruplus.NTRUPlusKeyPairGenerator;
import org.bouncycastle.pqc.crypto.ntruplus.NTRUPlusParameters;
import org.bouncycastle.pqc.crypto.ntruplus.NTRUPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruplus.NTRUPlusPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.NTRUPlusParameterSpec;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    NTRUPlusKeyPairGenerator engine;
    boolean initialised;
    private final NTRUPlusParameters ntruplusParameters;
    NTRUPlusKeyGenerationParameters param;
    SecureRandom random;

    public static class NTRUPlus1152 extends NTRUPlusKeyPairGeneratorSpi {
        public NTRUPlus1152() {
            super(NTRUPlusParameters.ntruplus_kem_864);
        }
    }

    public static class NTRUPlus768 extends NTRUPlusKeyPairGeneratorSpi {
        public NTRUPlus768() {
            super(NTRUPlusParameters.ntruplus_kem_768);
        }
    }

    public static class NTRUPlus864 extends NTRUPlusKeyPairGeneratorSpi {
        public NTRUPlus864() {
            super(NTRUPlusParameters.ntruplus_kem_864);
        }
    }

    static {
        HashMap map = new HashMap();
        parameters = map;
        map.put(NTRUPlusParameterSpec.ntruplus_768.getName(), NTRUPlusParameters.ntruplus_kem_768);
        parameters.put(NTRUPlusParameterSpec.ntruplus_864.getName(), NTRUPlusParameters.ntruplus_kem_864);
        parameters.put(NTRUPlusParameterSpec.ntruplus_1152.getName(), NTRUPlusParameters.ntruplus_kem_1152);
    }

    public NTRUPlusKeyPairGeneratorSpi() {
        super("NTRUPLUS");
        this.engine = new NTRUPlusKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.ntruplusParameters = null;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof NTRUPlusParameterSpec ? ((NTRUPlusParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            NTRUPlusParameters nTRUPlusParameters = this.ntruplusParameters;
            if (nTRUPlusParameters != null) {
                this.param = new NTRUPlusKeyGenerationParameters(this.random, nTRUPlusParameters);
            } else {
                this.param = new NTRUPlusKeyGenerationParameters(this.random, NTRUPlusParameters.ntruplus_kem_768);
            }
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCNTRUPlusPublicKey((NTRUPlusPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCNTRUPlusPrivateKey((NTRUPlusPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    public NTRUPlusKeyPairGeneratorSpi(NTRUPlusParameters nTRUPlusParameters) {
        super(nTRUPlusParameters.getName());
        this.engine = new NTRUPlusKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.ntruplusParameters = nTRUPlusParameters;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null || !parameters.containsKey(nameFromParams)) {
            throw new InvalidAlgorithmParameterException(m.i("invalid ParameterSpec: ", algorithmParameterSpec));
        }
        NTRUPlusParameters nTRUPlusParameters = (NTRUPlusParameters) parameters.get(nameFromParams);
        this.param = new NTRUPlusKeyGenerationParameters(secureRandom, nTRUPlusParameters);
        if (this.ntruplusParameters == null || nTRUPlusParameters.getName().equals(this.ntruplusParameters.getName())) {
            this.engine.init(this.param);
            this.initialised = true;
        } else {
            throw new InvalidAlgorithmParameterException("key pair generator locked to " + Strings.toUpperCase(this.ntruplusParameters.getName()));
        }
    }
}
