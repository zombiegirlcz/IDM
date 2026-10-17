package cfl;

import cfl.f0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f23736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f23737c;
    public final a0 d;

    public d0(UUID id10, c0 limits, x defaults, a0 fees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f23735a = id10;
        this.f23736b = limits;
        this.f23737c = defaults;
        this.d = fees;
    }

    @Override // cfl.f0.a
    public final a0 a() {
        return this.d;
    }

    @Override // cfl.f0.a
    public final c0 b() {
        return this.f23736b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f23735a, d0Var.f23735a) && Intrinsics.f(this.f23736b, d0Var.f23736b) && Intrinsics.f(this.f23737c, d0Var.f23737c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        return this.d.f23728a.hashCode() + ((this.f23737c.hashCode() + ((this.f23736b.hashCode() + (this.f23735a.hashCode() * 31)) * 31)) * 31);
    }
}
