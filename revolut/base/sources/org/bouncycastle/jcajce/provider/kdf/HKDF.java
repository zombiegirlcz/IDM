package org.bouncycastle.jcajce.provider.kdf;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.util.SpiUtil;

/* JADX INFO: loaded from: classes14.dex */
public class HKDF {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.kdf.hkdf.";

    public static class Mappings extends KDFAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            if (SpiUtil.hasKDF()) {
                addKDFAlgorithm(configurableProvider, "HKDF-SHA256", "org.bouncycastle.jcajce.provider.kdf.hkdf.HKDFSpi$HKDFwithSHA256", PKCSObjectIdentifiers.id_alg_hkdf_with_sha256);
                addKDFAlgorithm(configurableProvider, "HKDF-SHA384", "org.bouncycastle.jcajce.provider.kdf.hkdf.HKDFSpi$HKDFwithSHA384", PKCSObjectIdentifiers.id_alg_hkdf_with_sha384);
                addKDFAlgorithm(configurableProvider, "HKDF-SHA512", "org.bouncycastle.jcajce.provider.kdf.hkdf.HKDFSpi$HKDFwithSHA512", PKCSObjectIdentifiers.id_alg_hkdf_with_sha512);
            }
        }
    }
}
