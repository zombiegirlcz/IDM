package tnb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcd.s f272372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cfl.b f272373b;

    public c0(pcd.s vault, cfl.b bVar) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f272372a = vault;
        this.f272373b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f272372a, c0Var.f272372a) && this.f272373b == c0Var.f272373b;
    }

    public final int hashCode() {
        int iHashCode = this.f272372a.hashCode() * 31;
        cfl.b bVar = this.f272373b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
