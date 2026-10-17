package fkf;

import do3.n;
import klf.j1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f135815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3 f135816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f135817c;
    public final boolean d;
    public final boolean e;
    public final j1 f;

    public f(a3 transaction, t3 t3Var, n user, boolean z, boolean z3, j1 youthWalletOwner) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        this.f135815a = transaction;
        this.f135816b = t3Var;
        this.f135817c = user;
        this.d = z;
        this.e = z3;
        this.f = youthWalletOwner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f135815a, fVar.f135815a) && Intrinsics.f(this.f135816b, fVar.f135816b) && Intrinsics.f(this.f135817c, fVar.f135817c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f135815a.hashCode() * 31;
        t3 t3Var = this.f135816b;
        return this.f.hashCode() + j6.a.c(j6.a.c((this.f135817c.hashCode() + ((iHashCode + (t3Var == null ? 0 : t3Var.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
    }
}
