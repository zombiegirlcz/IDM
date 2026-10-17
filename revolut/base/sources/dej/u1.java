package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.time.b f113667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.time.b f113668b;

    public u1(kotlin.time.b bVar, kotlin.time.b bVar2) {
        this.f113667a = bVar;
        this.f113668b = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.f113667a, u1Var.f113667a) && Intrinsics.f(this.f113668b, u1Var.f113668b);
    }

    public final int hashCode() {
        kotlin.time.b bVar = this.f113667a;
        int iHashCode = (bVar == null ? 0 : Long.hashCode(bVar.f187924a)) * 31;
        kotlin.time.b bVar2 = this.f113668b;
        return iHashCode + (bVar2 != null ? Long.hashCode(bVar2.f187924a) : 0);
    }
}
