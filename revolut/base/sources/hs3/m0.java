package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f154909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f154910b;

    public m0(l0 entry, c cVar) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f154909a = entry;
        this.f154910b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f154909a == m0Var.f154909a && Intrinsics.f(this.f154910b, m0Var.f154910b);
    }

    public final int hashCode() {
        int iHashCode = this.f154909a.hashCode() * 31;
        c cVar = this.f154910b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
