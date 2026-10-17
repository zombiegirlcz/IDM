package rze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f258599a;

    public h(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f258599a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f258599a, ((h) obj2).f258599a);
    }

    public final int hashCode() {
        return this.f258599a.hashCode();
    }
}
