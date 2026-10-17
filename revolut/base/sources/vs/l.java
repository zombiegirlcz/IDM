package vs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f291703a;

    public l(f target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f291703a = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f291703a == ((l) obj2).f291703a;
    }

    public final int hashCode() {
        return this.f291703a.hashCode();
    }
}
