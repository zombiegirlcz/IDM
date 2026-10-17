package bg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f15114a;

    public t(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f15114a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f15114a, ((t) obj2).f15114a);
    }

    public final int hashCode() {
        return this.f15114a.hashCode();
    }
}
