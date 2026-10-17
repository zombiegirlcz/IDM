package rm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f255150a;

    public e(Object obj2) {
        this.f255150a = obj2;
    }

    public final Object a() {
        return this.f255150a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f255150a, ((e) obj2).f255150a);
    }

    public final int hashCode() {
        Object obj2 = this.f255150a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
