package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f400a;

    public e0(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f400a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && this.f400a.equals(((e0) obj2).f400a) && Float.compare(3.12f, 3.12f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(3.12f) + (this.f400a.hashCode() * 31);
    }
}
