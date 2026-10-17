package be0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f14646a;

    public c(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f14646a = cause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f14646a, ((c) obj2).f14646a);
    }

    public final int hashCode() {
        return this.f14646a.hashCode();
    }
}
