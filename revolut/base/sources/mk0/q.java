package mk0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f206169a;

    public q(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f206169a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f206169a, ((q) obj2).f206169a);
    }

    public final int hashCode() {
        return this.f206169a.hashCode();
    }
}
