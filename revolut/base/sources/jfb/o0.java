package jfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f173828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f173829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173830c;
    public final String d;

    public o0(n0 webAppState, g0 g0Var, boolean z, String str) {
        Intrinsics.checkNotNullParameter(webAppState, "webAppState");
        this.f173828a = webAppState;
        this.f173829b = g0Var;
        this.f173830c = z;
        this.d = str;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        String str = this.d;
        if (str != null) {
            o0 o0Var = oldState instanceof o0 ? (o0) oldState : null;
            if (!str.equals(o0Var != null ? o0Var.d : null)) {
                return new i0(str);
            }
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f173828a, o0Var.f173828a) && this.f173829b == o0Var.f173829b && this.f173830c == o0Var.f173830c && Intrinsics.f(this.d, o0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f173828a.hashCode() * 31;
        g0 g0Var = this.f173829b;
        int iC = j6.a.c((iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31, this.f173830c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
