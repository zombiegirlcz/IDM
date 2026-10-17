package ska;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.f0;
import nka.q;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageDigest f263800a;

    public final String a(q params) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        Intrinsics.checkNotNullParameter(params, "params");
        String strB = params.b();
        MessageDigest messageDigest = this.f263800a;
        if (messageDigest == null) {
            messageDigest = MessageDigest.getInstance("SHA-256");
            this.f263800a = messageDigest;
        }
        Intrinsics.h(messageDigest);
        synchronized (messageDigest) {
            byte[] bytes = strB.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArrDigest = messageDigest.digest(bytes);
        }
        return a0.d.s("V2_", Base64.encodeToString(bArrDigest, 2), "_", f0.V0(3, params.f216797a));
    }
}
