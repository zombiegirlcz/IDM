package sz0;

import c8.g;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266719a;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f266719a = url2;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f266719a, ((b) obj2).f266719a);
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f266719a.hashCode();
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        Charset CHARSET = g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = this.f266719a.getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }
}
