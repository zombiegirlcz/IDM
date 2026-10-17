package e8;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements c8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8.g f123447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8.g f123448b;

    public e(c8.g gVar, c8.g gVar2) {
        this.f123447a = gVar;
        this.f123448b = gVar2;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            e eVar = (e) obj2;
            if (this.f123447a.equals(eVar.f123447a) && this.f123448b.equals(eVar.f123448b)) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f123448b.hashCode() + (this.f123447a.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f123447a + ", signature=" + this.f123448b + CoreConstants.CURLY_RIGHT;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f123447a.updateDiskCacheKey(messageDigest);
        this.f123448b.updateDiskCacheKey(messageDigest);
    }
}
