package wm0;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {
    public static Signature a(PrivateKey key) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter("SHA256withECDSA", "algorithm");
        Intrinsics.checkNotNullParameter(key, "key");
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(key);
        Intrinsics.checkNotNullExpressionValue(signature, "apply(...)");
        return signature;
    }
}
