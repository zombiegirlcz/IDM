package bia;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f15463a;

    public e(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f15463a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f15463a, ((e) obj2).f15463a);
    }

    public final int hashCode() {
        return this.f15463a.hashCode();
    }
}
