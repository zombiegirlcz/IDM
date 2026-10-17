package rz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f258438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f258439b;

    public a(u uVar, u uVar2) {
        this.f258438a = uVar;
        this.f258439b = uVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f258438a, aVar.f258438a) && Intrinsics.f(this.f258439b, aVar.f258439b);
    }

    public final int hashCode() {
        u uVar = this.f258438a;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        u uVar2 = this.f258439b;
        return iHashCode + (uVar2 != null ? uVar2.hashCode() : 0);
    }
}
