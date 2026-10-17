package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4602a;

    public i(Double d) {
        this.f4602a = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f4602a, ((i) obj2).f4602a);
    }

    public final int hashCode() {
        Double d = this.f4602a;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }
}
