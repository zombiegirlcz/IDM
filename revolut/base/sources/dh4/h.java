package dh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f114747a;

    public h(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f114747a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f114747a, ((h) obj2).f114747a);
    }

    public final int hashCode() {
        return this.f114747a.hashCode();
    }
}
