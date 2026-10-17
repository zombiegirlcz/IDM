package com.revolut.feature.apm.core.impl.crypto;

import chc.c0;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class ApmKeyGenerator {

    @NotNull
    public static final a Companion = new a();
    public static final String d = new String("RSA".getBytes(), Charsets.UTF_8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f61851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f61852c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/impl/crypto/ApmKeyGenerator$ApmKeyGenerationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApmKeyGenerationError extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f61854b;

        public ApmKeyGenerationError(String str, Exception exc2) {
            super(a10.b.t(str, "message", "Apm Key: ", str), exc2);
            this.f61853a = str;
            this.f61854b = exc2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ApmKeyGenerationError)) {
                return false;
            }
            ApmKeyGenerationError apmKeyGenerationError = (ApmKeyGenerationError) obj2;
            return Intrinsics.f(this.f61853a, apmKeyGenerationError.f61853a) && Intrinsics.f(this.f61854b, apmKeyGenerationError.f61854b);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f61854b;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f61853a;
        }

        public final int hashCode() {
            int iHashCode = this.f61853a.hashCode() * 31;
            Throwable th10 = this.f61854b;
            return iHashCode + (th10 == null ? 0 : th10.hashCode());
        }
    }

    public static final class a {
        private a() {
        }
    }

    public ApmKeyGenerator() {
        this(0, 15);
    }

    public static final KeyPair a(ApmKeyGenerator apmKeyGenerator, String str) {
        PublicKey publicKey;
        PrivateKey privateKey;
        KeyStore keyStore;
        KeyStore keyStore2;
        c0 c0Var = apmKeyGenerator.f61851b;
        try {
            keyStore2 = (KeyStore) c0Var.invoke();
            keyStore2.load(null);
        } catch (Exception e) {
            b("Error retrieving public key: " + e.getMessage(), e);
            publicKey = null;
        }
        if (!keyStore2.containsAlias(str)) {
            throw new ApmKeyGenerationError("Public Key with alias " + str + " not found in Keystore.", null);
        }
        Certificate certificate = keyStore2.getCertificate(str);
        if (certificate == null) {
            throw new ApmKeyGenerationError("Certificate for " + str + " not found.", null);
        }
        publicKey = certificate.getPublicKey();
        if (publicKey == null) {
            return null;
        }
        try {
            keyStore = (KeyStore) c0Var.invoke();
            keyStore.load(null);
        } catch (Exception e2) {
            b("Error retrieving private key: " + e2.getMessage(), e2);
            privateKey = null;
        }
        if (!keyStore.containsAlias(str)) {
            throw new ApmKeyGenerationError("Private Key with alias " + str + " not found in Keystore.", null);
        }
        KeyStore.Entry entry = keyStore.getEntry(str, null);
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            privateKey = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
            if (privateKey == null) {
                return null;
            }
            return new KeyPair(publicKey, privateKey);
        }
        throw new ApmKeyGenerationError("Entry for " + str + " is not a PrivateKeyEntry.", null);
    }

    public static void b(String str, Exception exc2) {
        ApmKeyGenerationError apmKeyGenerationError = new ApmKeyGenerationError(str, exc2);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, apmKeyGenerationError, h0Var);
    }

    public ApmKeyGenerator(int i, int i2) {
        i = (i2 & 1) != 0 ? 4096 : i;
        c0 keystoreProvider = new c0(29);
        e keyPairGeneratorProvider = e.f;
        f keyFactoryProvider = f.f;
        Intrinsics.checkNotNullParameter(keystoreProvider, "keystoreProvider");
        Intrinsics.checkNotNullParameter(keyPairGeneratorProvider, "keyPairGeneratorProvider");
        Intrinsics.checkNotNullParameter(keyFactoryProvider, "keyFactoryProvider");
        this.f61850a = i;
        this.f61851b = keystoreProvider;
        this.f61852c = keyPairGeneratorProvider;
    }
}
