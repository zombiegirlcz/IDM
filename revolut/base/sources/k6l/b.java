package k6l;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f181748a;

    public b(bm0.a cryptoWrapper, tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f181748a = base64Wrapper;
    }

    public final byte[] a(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] secret = p.m(bytes, 0, 32);
        byte[] encrypted = this.f181748a.a(str);
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        byte[] bArrM = p.m(encrypted, 0, 12);
        byte[] bArrM2 = p.m(encrypted, 12, encrypted.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secret, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArrM));
        byte[] bArrDoFinal = cipher.doFinal(bArrM2);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }
}
