package tsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f274060a;

    public b(dj0.d minimum) {
        Intrinsics.checkNotNullParameter(minimum, "minimum");
        this.f274060a = minimum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f274060a, ((b) obj2).f274060a);
    }

    public final int hashCode() {
        return this.f274060a.hashCode();
    }
}
