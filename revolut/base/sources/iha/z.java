package iha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f161360a;

    public z(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f161360a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f161360a, ((z) obj2).f161360a);
    }

    public final int hashCode() {
        return this.f161360a.hashCode();
    }
}
