package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bef.a f285829b;

    public v0(String entityId, bef.a aVar) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f285828a = entityId;
        this.f285829b = aVar;
    }

    @Override // v30.q0
    public final String a() {
        return this.f285828a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f285828a, v0Var.f285828a) && Intrinsics.f(this.f285829b, v0Var.f285829b);
    }

    public final int hashCode() {
        int iHashCode = this.f285828a.hashCode() * 31;
        bef.a aVar = this.f285829b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
