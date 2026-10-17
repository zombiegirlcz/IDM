package cc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f22927a;

    public g(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f22927a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f22927a, ((g) obj2).f22927a);
    }

    public final int hashCode() {
        return this.f22927a.hashCode();
    }
}
