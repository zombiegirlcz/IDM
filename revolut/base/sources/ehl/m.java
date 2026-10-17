package ehl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iel.n f126267c;

    public m(String symbol, String ref2, iel.n status) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f126265a = symbol;
        this.f126266b = ref2;
        this.f126267c = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f126265a, mVar.f126265a) && Intrinsics.f(this.f126266b, mVar.f126266b) && this.f126267c == mVar.f126267c;
    }

    public final int hashCode() {
        return this.f126267c.hashCode() + p.a.c(this.f126265a.hashCode() * 31, 31, this.f126266b);
    }
}
