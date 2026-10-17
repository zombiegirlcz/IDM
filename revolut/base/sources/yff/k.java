package yff;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv0.i f313346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv0.i f313347b;

    public k() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f313346a, kVar.f313346a) && Intrinsics.f(this.f313347b, kVar.f313347b);
    }

    public final int hashCode() {
        qv0.i iVar = this.f313346a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        qv0.i iVar2 = this.f313347b;
        return iHashCode + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public k(qv0.i iVar, qv0.i iVar2) {
        this.f313346a = iVar;
        this.f313347b = iVar2;
    }
}
