package o29;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private t() {
    }

    public static String a(String prefix, String enabledFeatures) {
        byte[] bArrDigest;
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        MessageDigest messageDigest = u.k;
        synchronized (messageDigest) {
            byte[] bytes = enabledFeatures.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArrDigest = messageDigest.digest(bytes);
        }
        Intrinsics.h(bArrDigest);
        return a0.d.r(prefix, kotlin.collections.d.a0(bArrDigest, "", null, null, new o17.x(28), 30));
    }
}
