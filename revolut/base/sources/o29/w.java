package o29;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements v {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MessageDigest f221589a;

    public static final class a {
        private a() {
        }
    }

    static {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        f221589a = messageDigest;
    }

    public final String a(y params) {
        byte[] bArrDigest;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f221590a + "_" + params.f221591b + "_" + params.f221592c;
        MessageDigest messageDigest = f221589a;
        synchronized (messageDigest) {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArrDigest = messageDigest.digest(bytes);
        }
        Intrinsics.h(bArrDigest);
        return j6.a.q("WRAPPED_CARDS_CACHE_KEY", kotlin.collections.d.a0(bArrDigest, "", null, null, new o17.x(29), 30));
    }
}
