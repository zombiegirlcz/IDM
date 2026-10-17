package pv9;

import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.MessagingEncryptionService;
import com.revolut.feature.payments.messaging.data.impl.encryption.DecryptionException;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyPair;
import javax.crypto.AEADBadTagException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f240020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rv9.a f240021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qv9.c f240022c;
    public final a31.a d;
    public final MessagingEncryptionService e;

    public f(ue0.c storage, rv9.a hkdfGenerator, qv9.c encryptionService, a31.a encryptionKeysEncoder, MessagingEncryptionService encryptionWebService, qv9.b cipherTextWithNonceParser) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(hkdfGenerator, "hkdfGenerator");
        Intrinsics.checkNotNullParameter(encryptionService, "encryptionService");
        Intrinsics.checkNotNullParameter(encryptionKeysEncoder, "encryptionKeysEncoder");
        Intrinsics.checkNotNullParameter(encryptionWebService, "encryptionWebService");
        Intrinsics.checkNotNullParameter(cipherTextWithNonceParser, "cipherTextWithNonceParser");
        this.f240020a = storage;
        this.f240021b = hkdfGenerator;
        this.f240022c = encryptionService;
        this.d = encryptionKeysEncoder;
        this.e = encryptionWebService;
    }

    public final byte[] a(byte[] cipherWithNonce, Key key) throws DecryptionException {
        Intrinsics.checkNotNullParameter(cipherWithNonce, "cipherWithNonce");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Intrinsics.checkNotNullParameter(cipherWithNonce, "cipherWithNonce");
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(cipherWithNonce);
            byte[] bArr = new byte[cipherWithNonce.length - 12];
            byte[] bArr2 = new byte[12];
            byteBufferWrap.get(bArr2);
            byteBufferWrap.get(bArr);
            return this.f240022c.d(new kgm.i(bArr, bArr2), key);
        } catch (AEADBadTagException unused) {
            throw DecryptionException.f79585a;
        }
    }

    public final byte[] b(byte[] plainText, Key key) {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(key, "key");
        kgm.i cipherTextWithNonce = this.f240022c.a(plainText, key);
        Intrinsics.checkNotNullParameter(cipherTextWithNonce, "cipherTextWithNonce");
        if (12 != cipherTextWithNonce.i().length) {
            throw new IllegalArgumentException(a0.d.n("nonce length must be 12, but was ", cipherTextWithNonce.i().length).toString());
        }
        byte[] bArrArray = ByteBuffer.allocate(cipherTextWithNonce.g().length + 12).put(cipherTextWithNonce.i()).put(cipherTextWithNonce.g()).array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    public final KeyPair c() {
        j jVar = (j) this.f240020a.T2("KEY_STORAGE_ENCRYPTION_KEY_PAIR", j.class);
        if (jVar == null) {
            return null;
        }
        String publicKey = jVar.getPublicKey();
        String privateKey = jVar.getPrivateKey();
        a31.a aVar = this.d;
        return new KeyPair(aVar.l(publicKey), aVar.k(privateKey));
    }
}
