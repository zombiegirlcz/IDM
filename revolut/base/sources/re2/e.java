package re2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f253492a;

    public e(dj0.d newLimit) {
        Intrinsics.checkNotNullParameter(newLimit, "newLimit");
        this.f253492a = newLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f253492a, ((e) obj2).f253492a);
    }

    public final int hashCode() {
        return this.f253492a.hashCode();
    }
}
