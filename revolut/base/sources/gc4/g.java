package gc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f142327a;

    public g(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f142327a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f142327a, ((g) obj2).f142327a);
    }

    public final int hashCode() {
        return this.f142327a.hashCode();
    }
}
