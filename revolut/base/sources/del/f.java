package del;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f113714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f113715b;

    public f(d option, e order) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(order, "order");
        this.f113714a = option;
        this.f113715b = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f113714a == fVar.f113714a && this.f113715b == fVar.f113715b;
    }

    public final int hashCode() {
        return this.f113715b.hashCode() + (this.f113714a.hashCode() * 31);
    }
}
