package rz0;

import c8.g;
import i8.l;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f258467b;

    public d(String url2, l headers) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f258466a = url2;
        this.f258467b = headers;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        d dVar = obj2 instanceof d ? (d) obj2 : null;
        return Intrinsics.f(this.f258466a, dVar != null ? dVar.f258466a : null);
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f258466a.hashCode();
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        Charset CHARSET = g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = this.f258466a.getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }
}
