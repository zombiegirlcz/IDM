package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f272833a;

    public i9(p0 direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f272833a = direction;
    }

    public final p0 a() {
        return this.f272833a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i9) && this.f272833a == ((i9) obj2).f272833a;
    }

    public final int hashCode() {
        return this.f272833a.hashCode();
    }
}
