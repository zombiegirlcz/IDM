package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151219b;

    public x2(String ref2, long j2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f151218a = ref2;
        this.f151219b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.f151218a, x2Var.f151218a) && this.f151219b == x2Var.f151219b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f151219b) + (this.f151218a.hashCode() * 31);
    }
}
