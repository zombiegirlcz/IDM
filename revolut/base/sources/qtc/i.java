package qtc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249084a;

    public i(dj0.d remaining) {
        Intrinsics.checkNotNullParameter(remaining, "remaining");
        this.f249084a = remaining;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f249084a, ((i) obj2).f249084a);
    }

    public final int hashCode() {
        return this.f249084a.hashCode();
    }
}
