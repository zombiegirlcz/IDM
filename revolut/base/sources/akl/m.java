package akl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gkl.n f6050b;

    public m(String clientId, gkl.n claimName) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(claimName, "claimName");
        this.f6049a = clientId;
        this.f6050b = claimName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f6049a, mVar.f6049a) && this.f6050b == mVar.f6050b;
    }

    public final int hashCode() {
        return this.f6050b.hashCode() + (this.f6049a.hashCode() * 31);
    }
}
