package mm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl0.d f207109a;

    public i(rl0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f207109a = value;
    }

    public final rl0.d a() {
        return this.f207109a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f207109a == ((i) obj2).f207109a;
    }

    public final int hashCode() {
        return this.f207109a.hashCode();
    }
}
