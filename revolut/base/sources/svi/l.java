package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f265937c;
    public final x d;
    public final e e;
    public final p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f265938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f265939h;

    public l(String id10, int i, int i2, x state, e eVar, p0 p0Var, boolean z, r0 walletStyle) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(walletStyle, "walletStyle");
        this.f265935a = id10;
        this.f265936b = i;
        this.f265937c = i2;
        this.d = state;
        this.e = eVar;
        this.f = p0Var;
        this.f265938g = z;
        this.f265939h = walletStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f265935a, lVar.f265935a) && this.f265936b == lVar.f265936b && this.f265937c == lVar.f265937c && this.d == lVar.d && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f265938g == lVar.f265938g && this.f265939h == lVar.f265939h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.b(this.f265937c, j6.a.b(this.f265936b, this.f265935a.hashCode() * 31, 31), 31)) * 31;
        e eVar = this.e;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        p0 p0Var = this.f;
        return this.f265939h.hashCode() + j6.a.c((iHashCode2 + (p0Var != null ? p0Var.hashCode() : 0)) * 31, 31, this.f265938g);
    }
}
