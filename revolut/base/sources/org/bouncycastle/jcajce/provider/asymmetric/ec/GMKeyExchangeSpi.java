package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.agreement.SM2KeyExchange;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.SM2KeyExchangePrivateParameters;
import org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.SM2KeyExchangeSpec;
import org.bouncycastle.util.Arrays;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class GMKeyExchangeSpi extends BaseAgreementSpi {
    private final SM2KeyExchange engine;
    private final String kaAlgorithm;
    private byte[] result;
    private SM2KeyExchangeSpec spec;

    public static class SM2 extends GMKeyExchangeSpi {
        public SM2() {
            super("SM2");
        }
    }

    public GMKeyExchangeSpi(String str) {
        super(str, null);
        this.kaAlgorithm = str;
        this.engine = new SM2KeyExchange();
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return Arrays.clone(this.result);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof SM2KeyExchangeSpec)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        if (!(key instanceof PrivateKey)) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.kaAlgorithm);
            sb6.append(" key agreement requires ");
            throw new InvalidKeyException(a.i(sb6, getSimpleName(BCECPrivateKey.class), " for initialisation"));
        }
        this.spec = (SM2KeyExchangeSpec) algorithmParameterSpec;
        this.engine.init(new ParametersWithID(new SM2KeyExchangePrivateParameters(this.spec.isInitiator(), (ECPrivateKeyParameters) ECUtils.generatePrivateKeyParameter((PrivateKey) key), (ECPrivateKeyParameters) ECUtils.generatePrivateKeyParameter(this.spec.getEphemeralPrivateKey())), this.spec.getId()));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws IllegalStateException, InvalidKeyException {
        if (this.spec == null) {
            throw new IllegalStateException(a.i(new StringBuilder(), this.kaAlgorithm, " not initialised."));
        }
        if (!z) {
            throw new IllegalStateException(a.i(new StringBuilder(), this.kaAlgorithm, " can only be between two parties."));
        }
        if (key instanceof BCECPublicKey) {
            this.result = this.engine.calculateKey(128, new ParametersWithID(new SM2KeyExchangePublicParameters((ECPublicKeyParameters) ECUtils.generatePublicKeyParameter((PublicKey) key), (ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(this.spec.getOtherPartyEphemeralKey())), this.spec.getOtherPartyId()));
            return null;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.kaAlgorithm);
        sb6.append(" key agreement requires ");
        throw new InvalidKeyException(a.i(sb6, getSimpleName(BCECPublicKey.class), " for doPhase"));
    }
}
