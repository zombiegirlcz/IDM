package g1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f139719a;

    public g(d reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f139719a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f139719a, ((g) obj2).f139719a);
    }

    public final int hashCode() {
        return this.f139719a.hashCode();
    }
}
