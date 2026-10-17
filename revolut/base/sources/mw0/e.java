package mw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f209287a;

    public e(Object obj2) {
        this.f209287a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f209287a, ((e) obj2).f209287a);
    }

    public final int hashCode() {
        Object obj2 = this.f209287a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
