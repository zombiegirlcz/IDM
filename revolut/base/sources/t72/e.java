package t72;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f268410a;

    public e(f fVar) {
        this.f268410a = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f268410a, ((e) obj2).f268410a);
    }

    public final int hashCode() {
        f fVar = this.f268410a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }
}
