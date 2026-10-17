package com.fourthline.orca.internal;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public final class u21 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33927b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f33928c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeyStore f33929a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b extends Exception {

        public static final class a extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable cause) {
                super("Failed to generate ECDSA key pair", cause, null);
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.u21$b$b, reason: collision with other inner class name */
        public static final class C0290b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0290b f33930a = new C0290b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33931b = 8;

            /* JADX WARN: Multi-variable type inference failed */
            private C0290b() {
                super("Signing key not found in KeyStore", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0290b);
            }

            public int hashCode() {
                return -1582775164;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "KeyNotFound";
            }
        }

        public static final class c extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable cause) {
                super("Failed to sign data", cause, null);
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }

        public /* synthetic */ b(String str, Throwable th10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th10);
        }

        private b(String str, Throwable th10) {
            super(str, th10);
        }

        public /* synthetic */ b(String str, Throwable th10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th10, null);
        }
    }

    public u21() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Intrinsics.checkNotNullExpressionValue(keyStore, "apply(...)");
        this.f33929a = keyStore;
    }

    public final byte[] a(byte[] data, String timestamp, String nonce) throws NoSuchAlgorithmException, UnrecoverableKeyException, b.C0290b, KeyStoreException, b.c {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Key key = this.f33929a.getKey("fourthline_media_signing_key", null);
        PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
        if (privateKey == null) {
            throw b.C0290b.f33930a;
        }
        Charset charset = Charsets.UTF_8;
        byte[] bytes = timestamp.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrV = zhm.p.v(data, bytes);
        byte[] bytes2 = nonce.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(zhm.p.v(bArrV, bytes2));
        try {
            Signature signature = Signature.getInstance("NONEwithECDSA");
            signature.initSign(privateKey);
            signature.update(bArrDigest);
            byte[] bArrSign = signature.sign();
            Intrinsics.h(bArrSign);
            return bArrSign;
        } catch (Exception e) {
            throw new b.c(e);
        }
    }

    public final void b() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        a();
        try {
            a(true);
        } catch (Exception unused) {
            a(false);
        }
    }

    public final String c() throws b.C0290b, KeyStoreException {
        PublicKey publicKey;
        Certificate certificate = this.f33929a.getCertificate("fourthline_media_signing_key");
        if (certificate == null || (publicKey = certificate.getPublicKey()) == null) {
            throw b.C0290b.f33930a;
        }
        String strEncodeToString = Base64.encodeToString(publicKey.getEncoded(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final void a() throws KeyStoreException {
        if (this.f33929a.containsAlias("fourthline_media_signing_key")) {
            this.f33929a.deleteEntry("fourthline_media_signing_key");
        }
    }

    private final void a(boolean z) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("fourthline_media_signing_key", 12);
        builder.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"));
        builder.setDigests("SHA-256", "NONE");
        if (z) {
            builder.setIsStrongBoxBacked(true);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        keyPairGenerator.initialize(keyGenParameterSpecBuild);
        keyPairGenerator.generateKeyPair();
    }
}
