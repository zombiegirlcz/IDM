package ii4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f161539a;

    public m0(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f161539a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f161539a, ((m0) obj2).f161539a);
    }

    public final int hashCode() {
        return this.f161539a.hashCode();
    }
}
