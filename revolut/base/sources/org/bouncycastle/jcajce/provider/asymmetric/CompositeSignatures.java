package org.bouncycastle.jcajce.provider.asymmetric;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class CompositeSignatures {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.";
    private static final Map<String, String> compositesAttributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("Signature.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$COMPOSITE");
            for (ASN1ObjectIdentifier aSN1ObjectIdentifier : CompositeIndex.getSupportedIdentifiers()) {
                String algorithmName = CompositeIndex.getAlgorithmName(aSN1ObjectIdentifier);
                String strReplace = algorithmName.replace(CoreConstants.DASH_CHAR, '_');
                configurableProvider.addAlgorithm("Alg.Alias.KeyFactory", aSN1ObjectIdentifier, "COMPOSITE");
                configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.".concat(algorithmName), "COMPOSITE");
                configurableProvider.addAlgorithm("KeyPairGenerator.".concat(algorithmName), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyPairGeneratorSpi$" + strReplace);
                configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator", aSN1ObjectIdentifier, algorithmName);
                configurableProvider.addAlgorithm("Signature.".concat(algorithmName), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$" + strReplace);
                configurableProvider.addAlgorithm("Alg.Alias.Signature", aSN1ObjectIdentifier, algorithmName);
                configurableProvider.addAlgorithm(a.i(new StringBuilder("Signature."), algorithmName, "-PREHASH"), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$" + strReplace + "_PREHASH");
                configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new KeyFactorySpi());
            }
        }
    }

    static {
        HashMap map = new HashMap();
        compositesAttributes = map;
        map.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
