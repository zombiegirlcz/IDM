package org.bouncycastle.jcajce.provider.kdf;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.util.SpiUtil;

/* JADX INFO: loaded from: classes14.dex */
public class PBKDF2 {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.kdf.pbkdf2.";

    public static class Mappings extends AlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            if (SpiUtil.hasKDF()) {
                configurableProvider.addAlgorithm("KDF.PBKDF2", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withUTF8");
                configurableProvider.addAlgorithm("Alg.Alias.KDF.PBKDF2WITHHMACSHA1", "PBKDF2");
                configurableProvider.addAlgorithm("Alg.Alias.KDF.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2");
                configurableProvider.addAlgorithm("KDF", PKCSObjectIdentifiers.id_PBKDF2, "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withUTF8");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHASCII", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2with8BIT");
                configurableProvider.addAlgorithm("Alg.Alias.KDF.PBKDF2WITH8BIT", "PBKDF2WITHASCII");
                configurableProvider.addAlgorithm("Alg.Alias.KDF.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA224", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA224");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA256", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA256");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA384", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA384");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA512", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA512");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA512-224", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA512_224");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA512-256", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA512_256");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA3-224", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA3_224");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA3-256", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA3_256");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA3-384", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA3_384");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSHA3-512", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSHA3_512");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACGOST3411", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withGOST3411");
                configurableProvider.addAlgorithm("KDF.PBKDF2WITHHMACSM3", "org.bouncycastle.jcajce.provider.kdf.pbkdf2.PBKDF2Spi$PBKDF2withSM3");
            }
        }
    }
}
