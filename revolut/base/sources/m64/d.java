package m64;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f202999a;

    public d(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f202999a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f202999a, ((d) obj2).f202999a);
    }

    public final int hashCode() {
        return this.f202999a.hashCode();
    }
}
