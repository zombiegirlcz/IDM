package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f191581a;

    public g(Boolean bool) {
        this.f191581a = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f191581a, ((g) obj2).f191581a);
    }

    public final int hashCode() {
        Boolean bool = this.f191581a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
