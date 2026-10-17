package ekf;

import klf.j1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f127138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do3.n f127139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t3 f127140c;
    public final j1 d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f127141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f127142h;

    public x(a3 transaction, do3.n user, t3 t3Var, j1 walletOwner, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(walletOwner, "walletOwner");
        this.f127138a = transaction;
        this.f127139b = user;
        this.f127140c = t3Var;
        this.d = walletOwner;
        this.e = z;
        this.f = z3;
        this.f127141g = z4;
        this.f127142h = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f127138a, xVar.f127138a) && Intrinsics.f(this.f127139b, xVar.f127139b) && Intrinsics.f(this.f127140c, xVar.f127140c) && this.d == xVar.d && this.e == xVar.e && this.f == xVar.f && this.f127141g == xVar.f127141g && this.f127142h == xVar.f127142h;
    }

    public final int hashCode() {
        int iHashCode = (this.f127139b.hashCode() + (this.f127138a.hashCode() * 31)) * 31;
        t3 t3Var = this.f127140c;
        return Boolean.hashCode(this.f127142h) + j6.a.c(j6.a.c(j6.a.c((this.d.hashCode() + ((iHashCode + (t3Var == null ? 0 : t3Var.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.f127141g);
    }
}
