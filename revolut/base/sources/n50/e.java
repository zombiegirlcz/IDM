package n50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f212479a;

    public e(Object obj2) {
        this.f212479a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f212479a, ((e) obj2).f212479a);
    }

    public final int hashCode() {
        Object obj2 = this.f212479a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
