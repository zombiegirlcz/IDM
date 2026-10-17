package pv9;

import com.revolut.feature.payments.messaging.data.impl.encryption.DecryptionException;
import dv9.o;
import dv9.p;
import dv9.q;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.Charsets;
import kotlin.text.d0;
import no.f2;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements cv9.a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f240018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv9.a f240019b;

    public d(f encryptionRepository, qv9.a base64Wrapper, a31.a encryptionKeysEncoder) {
        Intrinsics.checkNotNullParameter(encryptionRepository, "encryptionRepository");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(encryptionKeysEncoder, "encryptionKeysEncoder");
        this.f240018a = encryptionRepository;
        this.f240019b = base64Wrapper;
    }

    public final q a(String keys, String senderCode, String recipientCode) {
        SecretKey secretKeyE;
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(senderCode, "senderCode");
        Intrinsics.checkNotNullParameter(recipientCode, "recipientCode");
        List listN0 = d0.n0(keys, new String[]{":"}, 0, 6);
        KeyPair keyPairG = g();
        int size = listN0.size();
        f fVar = this.f240018a;
        if (size == 2) {
            List<String> list = listN0;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (String base64String : list) {
                fVar.getClass();
                Intrinsics.checkNotNullParameter(base64String, "base64String");
                arrayList.add(fVar.d.l(base64String));
            }
            PublicKey publicKey = keyPairG.getPublic();
            return Intrinsics.f(publicKey, zhm.d0.b0(arrayList)) ? new o((PublicKey) zhm.d0.b0(arrayList), (PublicKey) zhm.d0.m0(arrayList)) : Intrinsics.f(publicKey, zhm.d0.m0(arrayList)) ? new o((PublicKey) zhm.d0.m0(arrayList), (PublicKey) zhm.d0.b0(arrayList)) : new o(null, (PublicKey) zhm.d0.b0(arrayList));
        }
        if (size != 4) {
            throw new IllegalStateException("Unsupported amount of data in message content: " + listN0);
        }
        String base64String2 = (String) listN0.get(1);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(base64String2, "base64String");
        PublicKey publicKeyL = fVar.d.l(base64String2);
        String str = (String) listN0.get(3);
        if (Intrinsics.f(publicKeyL, keyPairG.getPublic())) {
            secretKeyE = h();
        } else {
            PrivateKey privateKey = keyPairG.getPrivate();
            Intrinsics.checkNotNullExpressionValue(privateKey, "getPrivate(...)");
            secretKeyE = e(str, privateKey, publicKeyL, recipientCode, senderCode);
        }
        return new p(secretKeyE);
    }

    public final KeyPair b() {
        f fVar = this.f240018a;
        KeyPair keyPair = fVar.f240022c.generateKeyPair();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(keyPair, "keyPair");
        a31.a aVar = fVar.d;
        PublicKey publicKey = keyPair.getPublic();
        Intrinsics.checkNotNullExpressionValue(publicKey, "getPublic(...)");
        String strE = aVar.e(publicKey);
        PrivateKey privateKey = keyPair.getPrivate();
        Intrinsics.checkNotNullExpressionValue(privateKey, "getPrivate(...)");
        fVar.f240020a.G(new j(strE, aVar.e(privateKey)), "KEY_STORAGE_ENCRYPTION_KEY_PAIR", z.d(o0.b(j.class)));
        return keyPair;
    }

    public final SecretKey c() {
        f fVar = this.f240018a;
        SecretKey key = fVar.f240022c.e();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        fVar.f240020a.G(new m(fVar.d.e(key)), "KEY_STORAGE_ENCRYPTION_SYMMETRIC_KEY", z.d(o0.b(m.class)));
        return key;
    }

    public final byte[] d(byte[] cipherTextWithNonce, PublicKey recipientPublicKey, PrivateKey userPrivateKey, String salt) {
        Intrinsics.checkNotNullParameter(cipherTextWithNonce, "cipherTextWithNonce");
        Intrinsics.checkNotNullParameter(recipientPublicKey, "recipientPublicKey");
        Intrinsics.checkNotNullParameter(userPrivateKey, "userPrivateKey");
        Intrinsics.checkNotNullParameter(salt, "salt");
        return this.f240018a.a(cipherTextWithNonce, i(salt, userPrivateKey, recipientPublicKey));
    }

    public final SecretKeySpec e(String encryptedSymmetric, PrivateKey userPrivateKey, PublicKey recipientPublicKey, String recipientCode, String senderCode) {
        Intrinsics.checkNotNullParameter(encryptedSymmetric, "encryptedSymmetric");
        Intrinsics.checkNotNullParameter(userPrivateKey, "userPrivateKey");
        Intrinsics.checkNotNullParameter(recipientPublicKey, "recipientPublicKey");
        Intrinsics.checkNotNullParameter(recipientCode, "recipientCode");
        Intrinsics.checkNotNullParameter(senderCode, "senderCode");
        try {
            byte[] key = d(this.f240019b.a(encryptedSymmetric), recipientPublicKey, userPrivateKey, pyd.c.r(recipientCode, senderCode));
            Intrinsics.checkNotNullParameter(key, "key");
            return new SecretKeySpec(key, "AES");
        } catch (DecryptionException unused) {
            return null;
        }
    }

    public final ufm.c f(byte[] plainText, PublicKey recipientPublicKey, PrivateKey userPrivateKey, String salt) {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(recipientPublicKey, "recipientPublicKey");
        Intrinsics.checkNotNullParameter(userPrivateKey, "userPrivateKey");
        Intrinsics.checkNotNullParameter(salt, "salt");
        ufm.c cVar = new ufm.c(new a(this, recipientPublicKey, userPrivateKey, salt, plainText), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final KeyPair g() {
        KeyPair keyPairC;
        KeyPair keyPairC2 = this.f240018a.c();
        if (keyPairC2 != null) {
            return keyPairC2;
        }
        synchronized (this) {
            keyPairC = this.f240018a.c();
            if (keyPairC == null) {
                keyPairC = b();
            }
        }
        return keyPairC;
    }

    public final SecretKey h() {
        SecretKeySpec secretKeySpec;
        f fVar = this.f240018a;
        m mVar = (m) fVar.f240020a.T2("KEY_STORAGE_ENCRYPTION_SYMMETRIC_KEY", m.class);
        SecretKey secretKeyC = null;
        if (mVar != null) {
            a31.a aVar = fVar.d;
            String encodedSymmetricKey = mVar.getKey();
            Intrinsics.checkNotNullParameter(encodedSymmetricKey, "encodedSymmetricKey");
            secretKeySpec = new SecretKeySpec(((qv9.a) aVar.f955b).a(encodedSymmetricKey), "AES");
        } else {
            secretKeySpec = null;
        }
        if (secretKeySpec != null) {
            return secretKeySpec;
        }
        synchronized (this) {
            f fVar2 = this.f240018a;
            m mVar2 = (m) fVar2.f240020a.T2("KEY_STORAGE_ENCRYPTION_SYMMETRIC_KEY", m.class);
            if (mVar2 != null) {
                a31.a aVar2 = fVar2.d;
                String encodedSymmetricKey2 = mVar2.getKey();
                Intrinsics.checkNotNullParameter(encodedSymmetricKey2, "encodedSymmetricKey");
                secretKeyC = new SecretKeySpec(((qv9.a) aVar2.f955b).a(encodedSymmetricKey2), "AES");
            }
            if (secretKeyC == null) {
                secretKeyC = c();
            }
        }
        return secretKeyC;
    }

    public final Key i(String salt, PrivateKey userPrivateKey, PublicKey contactPublicKey) {
        Intrinsics.checkNotNullParameter(contactPublicKey, "contactPublicKey");
        Intrinsics.checkNotNullParameter(userPrivateKey, "userPrivateKey");
        Intrinsics.checkNotNullParameter(salt, "salt");
        byte[] salt2 = salt.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(salt2, "getBytes(...)");
        f fVar = this.f240018a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(contactPublicKey, "contactPublicKey");
        Intrinsics.checkNotNullParameter(userPrivateKey, "userPrivateKey");
        Intrinsics.checkNotNullParameter(salt2, "salt");
        qv9.c cVar = fVar.f240022c;
        byte[] inputKeyMaterial = cVar.c(contactPublicKey, userPrivateKey);
        rv9.a aVar = fVar.f240021b;
        byte[] info = new byte[0];
        aVar.getClass();
        Intrinsics.checkNotNullParameter(inputKeyMaterial, "inputKeyMaterial");
        Intrinsics.checkNotNullParameter(salt2, "salt");
        Intrinsics.checkNotNullParameter(info, "info");
        HKDFBytesGenerator hKDFBytesGenerator = new HKDFBytesGenerator(new SHA256Digest());
        hKDFBytesGenerator.init(new HKDFParameters(inputKeyMaterial, salt2, info));
        byte[] bArr = new byte[32];
        hKDFBytesGenerator.generateBytes(bArr, 0, 32);
        return cVar.b(bArr);
    }

    public final ufm.c j() {
        ufm.c cVar = new ufm.c(new af.d(this, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final pfm.a k() {
        pfm.a aVar = new pfm.a(j(), new b(new f2(this, 4), 0), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
