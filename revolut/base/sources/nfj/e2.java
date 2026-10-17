package nfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.time.b f214939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.time.b f214940b;

    public e2(kotlin.time.b bVar, kotlin.time.b bVar2) {
        this.f214939a = bVar;
        this.f214940b = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.f214939a, e2Var.f214939a) && Intrinsics.f(this.f214940b, e2Var.f214940b);
    }

    public final int hashCode() {
        kotlin.time.b bVar = this.f214939a;
        int iHashCode = (bVar == null ? 0 : Long.hashCode(bVar.f187924a)) * 31;
        kotlin.time.b bVar2 = this.f214940b;
        return iHashCode + (bVar2 != null ? Long.hashCode(bVar2.f187924a) : 0);
    }
}
