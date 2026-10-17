package m8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7d.a f203521a;

    public r(n7d.a meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.f203521a = meta;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f203521a, ((r) obj2).f203521a);
    }

    public final int hashCode() {
        return this.f203521a.hashCode();
    }
}
