package org.bouncycastle.pqc.jcajce.provider;

import okl.m;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyFactorySpi;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlus {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntruplus.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.NTRUPLUS", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.NTRUPLUS", "NTRUPLUS");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.ntruplus768;
            addKeyFactoryAlgorithm(configurableProvider, "NTRU+KEM-768", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyFactorySpi$NTRUPlus768", aSN1ObjectIdentifier, new NTRUPlusKeyFactorySpi.NTRUPlus768());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.ntruplus864;
            addKeyFactoryAlgorithm(configurableProvider, "NTRU+KEM-864", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyFactorySpi$NTRUPlus864", aSN1ObjectIdentifier2, new NTRUPlusKeyFactorySpi.NTRUPlus864());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.ntruplus1152;
            addKeyFactoryAlgorithm(configurableProvider, "NTRU+KEM-1152", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyFactorySpi$NTRUPlus1152", aSN1ObjectIdentifier3, new NTRUPlusKeyFactorySpi.NTRUPlus1152());
            configurableProvider.addAlgorithm("KeyPairGenerator.NTRUPLUS", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.NTRUPLUS", "NTRUPLUS");
            addKeyPairGeneratorAlgorithm(configurableProvider, "NTRU+KEM-768", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyPairGeneratorSpi$NTRUPlus768", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "NTRU+KEM-864", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyPairGeneratorSpi$NTRUPlus864", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "NTRU+KEM-1152", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyPairGeneratorSpi$NTRUPlus1152", aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm("KeyGenerator.NTRUPLUS", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusKeyGeneratorSpi");
            addKeyGeneratorAlgorithm(configurableProvider, "NTRU+KEM-768", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPLUSKeyGeneratorSpi$NTRUPLUS768", aSN1ObjectIdentifier);
            addKeyGeneratorAlgorithm(configurableProvider, "NTRU+KEM-864", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPLUSKeyGeneratorSpi$NTRUPLUS864", aSN1ObjectIdentifier2);
            addKeyGeneratorAlgorithm(configurableProvider, "NTRU+KEM-1152", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPLUSKeyGeneratorSpi$NTRUPLUS1152", aSN1ObjectIdentifier3);
            NTRUPlusKeyFactorySpi nTRUPlusKeyFactorySpi = new NTRUPlusKeyFactorySpi();
            configurableProvider.addAlgorithm("Cipher.NTRUPLUS", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPlusCipherSpi$Base");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.NTRUPLUS", "NTRUPLUS");
            StringBuilder sb6 = new StringBuilder("Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.pqc_kem_ntruplus;
            m.A(sb6, aSN1ObjectIdentifier4, configurableProvider, "NTRUPLUS");
            addCipherAlgorithm(configurableProvider, "NTRU+KEM-768", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPLUSCipherSpi$NTRUPLUS768", aSN1ObjectIdentifier);
            addCipherAlgorithm(configurableProvider, "NTRU+KEM-864", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPLUSCipherSpi$NTRUPLUS864", aSN1ObjectIdentifier2);
            addCipherAlgorithm(configurableProvider, "NTRU+KEM-1152", "org.bouncycastle.pqc.jcajce.provider.ntruplus.NTRUPLUSCipherSpi$NTRUPLUS1152", aSN1ObjectIdentifier3);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, "NTRUPLUS", nTRUPlusKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, nTRUPlusKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, nTRUPlusKeyFactorySpi);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier3, nTRUPlusKeyFactorySpi);
        }
    }
}
