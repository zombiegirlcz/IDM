package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes14.dex */
public class PKCS12LoadStoreParameter extends BCLoadStoreParameter {
    private final boolean useISO8859d1ForDecryption;

    public static class Builder {

        /* JADX INFO: renamed from: in, reason: collision with root package name */
        private final InputStream f228589in;
        private final OutputStream out;
        private final KeyStore.ProtectionParameter protectionParameter;
        private boolean useISO8859d1ForDecryption;

        public Builder() {
            this((OutputStream) null, (KeyStore.ProtectionParameter) null);
        }

        public PKCS12LoadStoreParameter build() {
            return new PKCS12LoadStoreParameter(this);
        }

        public Builder setUseISO8859d1ForDecryption(boolean z) {
            this.useISO8859d1ForDecryption = z;
            return this;
        }

        public Builder(InputStream inputStream, KeyStore.ProtectionParameter protectionParameter) {
            this.useISO8859d1ForDecryption = false;
            this.f228589in = inputStream;
            this.out = null;
            this.protectionParameter = protectionParameter;
        }

        public Builder(InputStream inputStream, char[] cArr) {
            this(inputStream, new KeyStore.PasswordProtection(cArr));
        }

        public Builder(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
            this.useISO8859d1ForDecryption = false;
            this.f228589in = null;
            this.out = outputStream;
            this.protectionParameter = protectionParameter;
        }

        public Builder(OutputStream outputStream, char[] cArr) {
            this(outputStream, new KeyStore.PasswordProtection(cArr));
        }
    }

    private PKCS12LoadStoreParameter(Builder builder) {
        super(builder.f228589in, builder.out, builder.protectionParameter);
        this.useISO8859d1ForDecryption = builder.useISO8859d1ForDecryption;
    }

    public boolean useISO8859d1ForDecryption() {
        return this.useISO8859d1ForDecryption;
    }
}
