package o1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f221389a;

    public e(Long l2) {
        this.f221389a = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f221389a, ((e) obj2).f221389a);
    }

    public final int hashCode() {
        Long l2 = this.f221389a;
        if (l2 == null) {
            return 0;
        }
        return l2.hashCode();
    }
}
