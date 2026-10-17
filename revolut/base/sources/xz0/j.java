package xz0;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f309769b;

    public j(String url2, i type) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f309768a = url2;
        this.f309769b = type;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        j jVar = obj2 instanceof j ? (j) obj2 : null;
        return Intrinsics.f(this.f309768a, jVar != null ? jVar.f309768a : null);
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f309768a.hashCode();
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        Charset CHARSET = c8.g.f;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = this.f309768a.getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }
}
