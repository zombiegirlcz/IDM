package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318518a;

    public j1(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f318518a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j1) && Intrinsics.f(this.f318518a, ((j1) obj2).f318518a);
    }

    public final int hashCode() {
        return this.f318518a.hashCode();
    }
}
