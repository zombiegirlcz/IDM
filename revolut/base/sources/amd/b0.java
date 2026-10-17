package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f6308a;

    public b0(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f6308a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f6308a, ((b0) obj2).f6308a);
    }

    public final int hashCode() {
        return this.f6308a.hashCode();
    }
}
