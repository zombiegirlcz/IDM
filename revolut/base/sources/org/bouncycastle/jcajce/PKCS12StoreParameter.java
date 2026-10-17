package org.bouncycastle.jcajce;

import java.io.OutputStream;
import java.security.KeyStore;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PBMAC1Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class PKCS12StoreParameter implements KeyStore.LoadStoreParameter {
    private final boolean forDEREncoding;
    private final AlgorithmIdentifier macAlgorithm;
    private final OutputStream out;
    private final boolean overwriteFriendlyName;
    private final KeyStore.ProtectionParameter protectionParameter;
    private final boolean useISO8859d1ForDecryption;

    public static class Builder {
        private boolean forDEREncoding;
        private AlgorithmIdentifier macAlgorithm;
        private final OutputStream out;
        private boolean overwriteFriendlyName;
        private final KeyStore.ProtectionParameter protectionParameter;
        private boolean useISO8859d1ForDecryption;

        private Builder(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
            this.forDEREncoding = true;
            this.overwriteFriendlyName = true;
            this.useISO8859d1ForDecryption = false;
            this.macAlgorithm = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
            this.out = outputStream;
            this.protectionParameter = protectionParameter;
        }

        public PKCS12StoreParameter build() {
            return new PKCS12StoreParameter(this.out, this.protectionParameter, this.forDEREncoding, this.overwriteFriendlyName, this.macAlgorithm, this.useISO8859d1ForDecryption);
        }

        public Builder setDEREncoding(boolean z) {
            this.forDEREncoding = z;
            return this;
        }

        public Builder setMacAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
            this.macAlgorithm = algorithmIdentifier;
            return this;
        }

        public Builder setOverwriteFriendlyName(boolean z) {
            this.overwriteFriendlyName = z;
            return this;
        }

        public Builder setUseISO8859d1ForDecryption(boolean z) {
            this.useISO8859d1ForDecryption = z;
            return this;
        }
    }

    public static class PBMAC1WithPBKDF2Builder {
        private int iterationCount = 16384;
        private byte[] salt = null;
        private int keySizeinBits = 256;

        /* JADX INFO: renamed from: prf, reason: collision with root package name */
        private ASN1ObjectIdentifier f228590prf = PKCSObjectIdentifiers.id_hmacWithSHA256;
        private ASN1ObjectIdentifier mac = PKCSObjectIdentifiers.id_hmacWithSHA512;

        public AlgorithmIdentifier build() {
            if (this.salt == null) {
                throw new IllegalStateException("salt must be non-null");
            }
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBMAC1, new PBMAC1Params(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(this.salt, this.iterationCount, this.keySizeinBits, new AlgorithmIdentifier(this.f228590prf))), new AlgorithmIdentifier(this.mac)));
        }

        public PBMAC1WithPBKDF2Builder setIterationCount(int i) {
            this.iterationCount = i;
            return this;
        }

        public PBMAC1WithPBKDF2Builder setKeySize(int i) {
            this.keySizeinBits = i;
            return this;
        }

        public PBMAC1WithPBKDF2Builder setMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            this.mac = aSN1ObjectIdentifier;
            return this;
        }

        public PBMAC1WithPBKDF2Builder setPrf(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            this.f228590prf = aSN1ObjectIdentifier;
            return this;
        }

        public PBMAC1WithPBKDF2Builder setSalt(byte[] bArr) {
            this.salt = Arrays.clone(bArr);
            return this;
        }
    }

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(outputStream, protectionParameter, false, true);
    }

    public static Builder builder(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        return new Builder(outputStream, protectionParameter);
    }

    public static PBMAC1WithPBKDF2Builder pbmac1WithPBKDF2Builder() {
        return new PBMAC1WithPBKDF2Builder();
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.macAlgorithm;
    }

    public OutputStream getOutputStream() {
        return this.out;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.protectionParameter;
    }

    public boolean isForDEREncoding() {
        return this.forDEREncoding;
    }

    public boolean isOverwriteFriendlyName() {
        return this.overwriteFriendlyName;
    }

    public boolean useISO8859d1ForDecryption() {
        return this.useISO8859d1ForDecryption;
    }

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z) {
        this(outputStream, protectionParameter, z, true);
    }

    public static Builder builder(OutputStream outputStream, char[] cArr) {
        return builder(outputStream, new KeyStore.PasswordProtection(cArr));
    }

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z, boolean z3) {
        this(outputStream, protectionParameter, z, z3, new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE), false);
    }

    private PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z, boolean z3, AlgorithmIdentifier algorithmIdentifier, boolean z4) {
        this.out = outputStream;
        this.protectionParameter = protectionParameter;
        this.forDEREncoding = z;
        this.overwriteFriendlyName = z3;
        this.macAlgorithm = algorithmIdentifier;
        this.useISO8859d1ForDecryption = z4;
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr) {
        this(outputStream, cArr, false);
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr, boolean z) {
        this(outputStream, (KeyStore.ProtectionParameter) new KeyStore.PasswordProtection(cArr), z, true);
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr, boolean z, boolean z3) {
        this(outputStream, new KeyStore.PasswordProtection(cArr), z, z3);
    }
}
