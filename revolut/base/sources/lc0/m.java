package lc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f193761a;

    public m(Object obj2) {
        this.f193761a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f193761a, ((m) obj2).f193761a);
    }

    public final int hashCode() {
        Object obj2 = this.f193761a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
