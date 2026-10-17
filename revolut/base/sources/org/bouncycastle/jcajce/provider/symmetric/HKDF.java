package org.bouncycastle.jcajce.provider.symmetric;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import okl.m;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.HKDFParameterSpec;

/* JADX INFO: loaded from: classes14.dex */
public class HKDF {

    public static class HKDFBase extends BaseSecretKeyFactory {
        protected String algName;
        protected HKDFBytesGenerator hkdf;

        public HKDFBase(String str, Digest digest, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            super(str, aSN1ObjectIdentifier);
            this.algName = str;
            this.hkdf = new HKDFBytesGenerator(digest);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof HKDFParameterSpec)) {
                throw new InvalidKeySpecException("invalid KeySpec: expected HKDFParameterSpec, but got ".concat(keySpec.getClass().getName()));
            }
            HKDFParameterSpec hKDFParameterSpec = (HKDFParameterSpec) keySpec;
            int outputLength = hKDFParameterSpec.getOutputLength();
            this.hkdf.init(new HKDFParameters(hKDFParameterSpec.getIKM(), hKDFParameterSpec.getSalt(), hKDFParameterSpec.getInfo()));
            byte[] bArr = new byte[outputLength];
            this.hkdf.generateBytes(bArr, 0, outputLength);
            return new BCPBEKey(this.algName, new KeyParameter(bArr));
        }
    }

    public static class HKDFwithSHA256 extends HKDFBase {
        public HKDFwithSHA256() throws InvalidAlgorithmParameterException {
            super("HKDF-SHA256", new SHA256Digest(), PKCSObjectIdentifiers.id_alg_hkdf_with_sha256);
        }
    }

    public static class HKDFwithSHA384 extends HKDFBase {
        public HKDFwithSHA384() throws InvalidAlgorithmParameterException {
            super("HKDF-SHA384", new SHA384Digest(), PKCSObjectIdentifiers.id_alg_hkdf_with_sha384);
        }
    }

    public static class HKDFwithSHA512 extends HKDFBase {
        public HKDFwithSHA512() throws InvalidAlgorithmParameterException {
            super("HKDF-SHA512", new SHA512Digest(), PKCSObjectIdentifiers.id_alg_hkdf_with_sha512);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = HKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb6 = new StringBuilder();
            String str = PREFIX;
            m.y(str, "$HKDFwithSHA512", "SecretKeyFactory.HKDF-SHA512", m.r(str, "$HKDFwithSHA384", "SecretKeyFactory.HKDF-SHA384", m.r(str, "$HKDFwithSHA256", "SecretKeyFactory.HKDF-SHA256", sb6, configurableProvider), configurableProvider), configurableProvider);
        }
    }

    private HKDF() {
    }
}
