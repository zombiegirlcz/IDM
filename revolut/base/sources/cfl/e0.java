package cfl;

import cfl.f0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f23739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f23740c;
    public final a0 d;

    public e0(UUID id10, c0 limits, x defaults, a0 fees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f23738a = id10;
        this.f23739b = limits;
        this.f23740c = defaults;
        this.d = fees;
    }

    @Override // cfl.f0.a
    public final a0 a() {
        return this.d;
    }

    @Override // cfl.f0.a
    public final c0 b() {
        return this.f23739b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f23738a, e0Var.f23738a) && Intrinsics.f(this.f23739b, e0Var.f23739b) && Intrinsics.f(this.f23740c, e0Var.f23740c) && Intrinsics.f(this.d, e0Var.d);
    }

    public final int hashCode() {
        return this.d.f23728a.hashCode() + ((this.f23740c.hashCode() + ((this.f23739b.hashCode() + (this.f23738a.hashCode() * 31)) * 31)) * 31);
    }
}
