package qz0;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f250323b;

    public f(String url2, g headers) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f250322a = url2;
        this.f250323b = headers;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = this.f250322a.getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }
}
