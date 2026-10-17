package com.fourthline.orca.internal;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
final class t40 {
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33191a = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33192b = "AndroidKeyStore";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33193c = "com.fourthline.sdk.workflow_session_store";
    private final Lazy d = yhm.j.b(new gj1(this, 2));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecretKey a(t40 t40Var) {
        return t40Var.a();
    }

    private final SecretKey b() {
        return (SecretKey) this.d.getValue();
    }

    public final String a(String encoded) {
        Intrinsics.checkNotNullParameter(encoded, "encoded");
        try {
            byte[] bArrDecode = Base64.decode(encoded, 2);
            if (bArrDecode.length <= 12) {
                return null;
            }
            byte[] bArrM = zhm.p.m(bArrDecode, 0, 12);
            byte[] bArrM2 = zhm.p.m(bArrDecode, 12, bArrDecode.length);
            Cipher cipher = Cipher.getInstance(this.f33191a);
            cipher.init(2, b(), new GCMParameterSpec(128, bArrM));
            byte[] bArrDoFinal = cipher.doFinal(bArrM2);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new String(bArrDoFinal, Charsets.UTF_8);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b(String plaintext) {
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        try {
            Cipher cipher = Cipher.getInstance(this.f33191a);
            cipher.init(1, b());
            byte[] iv2 = cipher.getIV();
            byte[] bytes = plaintext.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            byte[] bArr = new byte[iv2.length + bArrDoFinal.length];
            System.arraycopy(iv2, 0, bArr, 0, iv2.length);
            System.arraycopy(bArrDoFinal, 0, bArr, iv2.length, bArrDoFinal.length);
            return Base64.encodeToString(bArr, 2);
        } catch (Exception unused) {
            return null;
        }
    }

    private final SecretKey a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance(this.f33192b);
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(this.f33193c, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            SecretKey secretKey = secretKeyEntry.getSecretKey();
            Intrinsics.checkNotNullExpressionValue(secretKey, "getSecretKey(...)");
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", this.f33192b);
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(this.f33193c, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generateKey(...)");
        return secretKeyGenerateKey;
    }
}
