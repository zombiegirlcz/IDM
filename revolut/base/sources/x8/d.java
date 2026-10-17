package x8;

import c8.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303252a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f303253b;

    public d(long j2) {
        this.f303253b = j2;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || d.class != obj2.getClass()) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f303253b == dVar.f303253b && this.f303252a.equals(dVar.f303252a);
    }

    @Override // c8.g
    public final int hashCode() {
        int iHashCode = this.f303252a.hashCode() * 31;
        long j2 = this.f303253b;
        return (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f303253b).putInt(0).array());
        messageDigest.update(this.f303252a.getBytes(g.f));
    }
}
