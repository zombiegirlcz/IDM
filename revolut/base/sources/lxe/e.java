package lxe;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f200561a;

    public e(dj0.d customAmount) {
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        this.f200561a = customAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f200561a, ((e) obj2).f200561a);
    }

    public final dj0.d f() {
        return this.f200561a;
    }

    public final int hashCode() {
        return this.f200561a.hashCode();
    }
}
