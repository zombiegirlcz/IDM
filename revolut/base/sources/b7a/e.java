package b7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f12977a;

    public e(Long l2) {
        this.f12977a = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f12977a, ((e) obj2).f12977a);
    }

    public final int hashCode() {
        Long l2 = this.f12977a;
        if (l2 == null) {
            return 0;
        }
        return l2.hashCode();
    }
}
