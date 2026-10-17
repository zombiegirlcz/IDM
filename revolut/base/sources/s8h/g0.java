package s8h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f261002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xzg.l0 f261003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xzg.n0 f261004c;

    public g0(boolean z, xzg.l0 timeSpan, xzg.n0 filter) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f261002a = z;
        this.f261003b = timeSpan;
        this.f261004c = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f261002a == g0Var.f261002a && this.f261003b == g0Var.f261003b && this.f261004c == g0Var.f261004c;
    }

    public final int hashCode() {
        return this.f261004c.hashCode() + ((this.f261003b.hashCode() + (Boolean.hashCode(this.f261002a) * 31)) * 31);
    }
}
