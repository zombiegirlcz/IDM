package eg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f125533a;

    public j(qua.p pVar) {
        this.f125533a = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f125533a, ((j) obj2).f125533a);
    }

    public final int hashCode() {
        qua.p pVar = this.f125533a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }
}
