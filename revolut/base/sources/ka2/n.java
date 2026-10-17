package ka2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f182400a;

    public n(Object obj2) {
        this.f182400a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f182400a, ((n) obj2).f182400a);
    }

    public final int hashCode() {
        Object obj2 = this.f182400a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
