package b6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5i.a f12835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12836b;

    public x(z5i.a newFooter, boolean z) {
        Intrinsics.checkNotNullParameter(newFooter, "newFooter");
        this.f12835a = newFooter;
        this.f12836b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f12835a, xVar.f12835a) && this.f12836b == xVar.f12836b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12836b) + (this.f12835a.hashCode() * 31);
    }
}
