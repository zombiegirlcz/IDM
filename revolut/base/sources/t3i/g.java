package t3i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f267795a;

    public g(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f267795a = e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f267795a, ((g) obj2).f267795a);
    }

    public final int hashCode() {
        return this.f267795a.hashCode();
    }
}
