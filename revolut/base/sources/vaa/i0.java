package vaa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f287198a;

    public i0(y output) {
        Intrinsics.checkNotNullParameter(output, "output");
        this.f287198a = output;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f287198a, ((i0) obj2).f287198a);
    }

    public final int hashCode() {
        return this.f287198a.hashCode();
    }
}
