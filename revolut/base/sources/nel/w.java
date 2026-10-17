package nel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f214632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f214633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f214634c;
    public final f0 d;
    public final f0 e;
    public final Boolean f;

    public w(dj0.d dVar, Long l2, f0 f0Var, f0 f0Var2, f0 f0Var3, Boolean bool) {
        this.f214632a = dVar;
        this.f214633b = l2;
        this.f214634c = f0Var;
        this.d = f0Var2;
        this.e = f0Var3;
        this.f = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f214632a, wVar.f214632a) && Intrinsics.f(this.f214633b, wVar.f214633b) && Intrinsics.f(this.f214634c, wVar.f214634c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f);
    }

    public final int hashCode() {
        dj0.d dVar = this.f214632a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Long l2 = this.f214633b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        f0 f0Var = this.f214634c;
        int iHashCode3 = (iHashCode2 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        f0 f0Var2 = this.d;
        int iHashCode4 = (iHashCode3 + (f0Var2 == null ? 0 : f0Var2.hashCode())) * 31;
        f0 f0Var3 = this.e;
        int iHashCode5 = (iHashCode4 + (f0Var3 == null ? 0 : f0Var3.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }
}
