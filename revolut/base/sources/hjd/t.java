package hjd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo3.a f152716a;

    public t(bo3.a boundaries) {
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        this.f152716a = boundaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f152716a, ((t) obj2).f152716a);
    }

    public final int hashCode() {
        return this.f152716a.hashCode();
    }
}
