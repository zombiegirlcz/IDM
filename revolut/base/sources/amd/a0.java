package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f6307a;

    public a0(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f6307a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f6307a, ((a0) obj2).f6307a);
    }

    public final int hashCode() {
        return this.f6307a.hashCode();
    }
}
