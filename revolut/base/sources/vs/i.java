package vs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f291701a;

    public i(f target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f291701a = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f291701a == ((i) obj2).f291701a;
    }

    public final int hashCode() {
        return this.f291701a.hashCode();
    }
}
