package iv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168708b;

    public b(String sessionId, String sessionIdSignature) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sessionIdSignature, "sessionIdSignature");
        this.f168707a = sessionId;
        this.f168708b = sessionIdSignature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f168707a, bVar.f168707a) && Intrinsics.f(this.f168708b, bVar.f168708b);
    }

    public final int hashCode() {
        return this.f168708b.hashCode() + (this.f168707a.hashCode() * 31);
    }
}
