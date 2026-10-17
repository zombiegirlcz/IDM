package eg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f125535a;

    public n(qua.p pVar) {
        this.f125535a = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f125535a, ((n) obj2).f125535a);
    }

    public final int hashCode() {
        qua.p pVar = this.f125535a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }
}
