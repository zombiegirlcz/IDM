package kja;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f184359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f184360b;

    public o() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f184359a == oVar.f184359a && Intrinsics.f(this.f184360b, oVar.f184360b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f184359a) * 31;
        n nVar = this.f184360b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }

    public /* synthetic */ o(int i) {
        this(false, (i & 2) != 0 ? null : m.f184358a);
    }

    public o(boolean z, n nVar) {
        this.f184359a = z;
        this.f184360b = nVar;
    }
}
