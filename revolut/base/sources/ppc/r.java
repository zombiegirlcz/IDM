package ppc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1h.f f238335a;

    public r(k1h.f disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f238335a = disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f238335a, ((r) obj2).f238335a);
    }

    public final int hashCode() {
        return this.f238335a.hashCode();
    }
}
