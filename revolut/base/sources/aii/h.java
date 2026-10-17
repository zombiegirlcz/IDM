package aii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f5286b;

    public h(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f5286b = descriptor;
    }

    public final e b() {
        return this.f5286b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f5286b, ((h) obj2).f5286b);
    }

    public final int hashCode() {
        return this.f5286b.hashCode();
    }
}
