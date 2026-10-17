package ylh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f314722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f314723b;

    public q(w wVar, a aVar) {
        this.f314722a = wVar;
        this.f314723b = aVar;
    }

    public static q a(q qVar, a aVar) {
        w wVar = qVar.f314722a;
        qVar.getClass();
        return new q(wVar, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f314722a == qVar.f314722a && Intrinsics.f(this.f314723b, qVar.f314723b);
    }

    public final int hashCode() {
        w wVar = this.f314722a;
        int iHashCode = (wVar == null ? 0 : wVar.hashCode()) * 31;
        a aVar = this.f314723b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
