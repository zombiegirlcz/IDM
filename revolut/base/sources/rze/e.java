package rze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f258596a;

    public e(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f258596a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f258596a, ((e) obj2).f258596a);
    }

    public final int hashCode() {
        return this.f258596a.hashCode();
    }
}
