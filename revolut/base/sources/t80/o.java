package t80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f268773a;

    public o(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f268773a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f268773a, ((o) obj2).f268773a);
    }

    public final int hashCode() {
        return this.f268773a.hashCode();
    }
}
