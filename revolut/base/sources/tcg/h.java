package tcg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffi.c f269790a;

    public h(ffi.c recentLocation) {
        Intrinsics.checkNotNullParameter(recentLocation, "recentLocation");
        this.f269790a = recentLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f269790a, ((h) obj2).f269790a);
    }

    public final int hashCode() {
        return this.f269790a.hashCode();
    }
}
