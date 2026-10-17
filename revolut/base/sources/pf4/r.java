package pf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f235458a;

    public r() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f235458a, ((r) obj2).f235458a);
    }

    public final int hashCode() {
        q qVar = this.f235458a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public r(q qVar) {
        this.f235458a = qVar;
    }
}
