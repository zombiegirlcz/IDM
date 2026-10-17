package oli;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f226434a;

    public i(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f226434a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f226434a, ((i) obj2).f226434a);
    }

    public final int hashCode() {
        return this.f226434a.hashCode();
    }
}
