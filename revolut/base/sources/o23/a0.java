package o23;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f221438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f221440c;

    public a0(aim.e items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f221438a = items;
        this.f221439b = z;
        this.f221440c = z3;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        a0 a0Var = oldState instanceof a0 ? (a0) oldState : null;
        if (a0Var == null) {
            return null;
        }
        return new z(this.f221439b != a0Var.f221439b, this.f221440c != a0Var.f221440c);
    }

    @Override // cli.p
    public final List c() {
        return this.f221438a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f221438a, a0Var.f221438a) && this.f221439b == a0Var.f221439b && this.f221440c == a0Var.f221440c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221440c) + j6.a.c(this.f221438a.hashCode() * 31, 31, this.f221439b);
    }
}
