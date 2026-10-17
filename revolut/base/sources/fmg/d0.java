package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9l.a f136418b;

    public d0(String entityId, v9l.a aVar) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f136417a = entityId;
        this.f136418b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f136417a, d0Var.f136417a) && Intrinsics.f(this.f136418b, d0Var.f136418b);
    }

    public final int hashCode() {
        int iHashCode = this.f136417a.hashCode() * 31;
        v9l.a aVar = this.f136418b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
