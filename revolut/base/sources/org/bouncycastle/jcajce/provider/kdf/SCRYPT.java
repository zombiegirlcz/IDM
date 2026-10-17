package org.bouncycastle.jcajce.provider.kdf;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.util.SpiUtil;

/* JADX INFO: loaded from: classes14.dex */
public class SCRYPT {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.kdf.scrypt.";

    public static class Mappings extends KDFAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            if (SpiUtil.hasKDF()) {
                addKDFAlgorithm(configurableProvider, "SCRYPT", "org.bouncycastle.jcajce.provider.kdf.scrypt.ScryptSpi$ScryptWithUTF8");
            }
        }
    }
}
