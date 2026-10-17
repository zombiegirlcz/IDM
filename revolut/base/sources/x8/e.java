package x8;

import c8.g;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import y8.f;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f303254a;

    public e(Object obj2) {
        f.c(obj2, "Argument must not be null");
        this.f303254a = obj2;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return this.f303254a.equals(((e) obj2).f303254a);
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f303254a.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f303254a + CoreConstants.CURLY_RIGHT;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f303254a.toString().getBytes(g.f));
    }
}
