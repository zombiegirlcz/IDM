package lbf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f193684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f193685b;

    public p(m plan, j jVar) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f193684a = plan;
        this.f193685b = jVar;
    }

    public final boolean a() {
        return this.f193685b != null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f193684a, pVar.f193684a) && Intrinsics.f(this.f193685b, pVar.f193685b);
    }

    public final int hashCode() {
        int iHashCode = this.f193684a.hashCode() * 31;
        j jVar = this.f193685b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
