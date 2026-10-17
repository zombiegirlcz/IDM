package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jt3.a f154899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f154900c;
    public final h d;

    public j(String planId, jt3.a source, i postUpgradeAction, h hVar) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(postUpgradeAction, "postUpgradeAction");
        this.f154898a = planId;
        this.f154899b = source;
        this.f154900c = postUpgradeAction;
        this.d = hVar;
    }

    @Override // hs3.k
    public final h O() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f154898a, jVar.f154898a) && this.f154899b == jVar.f154899b && Intrinsics.f(this.f154900c, jVar.f154900c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f154900c.hashCode() + ((this.f154899b.hashCode() + (this.f154898a.hashCode() * 31)) * 31)) * 31;
        h hVar = this.d;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
