package aii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f5290b;

    public l(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f5290b = cause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f5290b, ((l) obj2).f5290b);
    }

    public final int hashCode() {
        return this.f5290b.hashCode();
    }
}
