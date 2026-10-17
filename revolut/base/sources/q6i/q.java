package q6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yqi.b f242632a;

    public q(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f242632a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f242632a, ((q) obj2).f242632a);
    }

    public final int hashCode() {
        return this.f242632a.hashCode();
    }
}
