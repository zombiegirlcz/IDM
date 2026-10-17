package rm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f255156a;

    public f(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f255156a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f255156a, ((f) obj2).f255156a);
    }

    public final int hashCode() {
        return this.f255156a.hashCode();
    }
}
