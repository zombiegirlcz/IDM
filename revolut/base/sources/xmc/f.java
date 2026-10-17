package xmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmc.l f307130a;

    public f(zmc.l action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f307130a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f307130a, ((f) obj2).f307130a);
    }

    public final int hashCode() {
        return this.f307130a.hashCode();
    }
}
