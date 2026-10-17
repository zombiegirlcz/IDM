package cfl;

import cfl.f0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f23730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f23731c;
    public final a0 d;

    public b0(UUID id10, c0 limits, x defaults, a0 fees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f23729a = id10;
        this.f23730b = limits;
        this.f23731c = defaults;
        this.d = fees;
    }

    @Override // cfl.f0.a
    public final a0 a() {
        return this.d;
    }

    @Override // cfl.f0.a
    public final c0 b() {
        return this.f23730b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f23729a, b0Var.f23729a) && Intrinsics.f(this.f23730b, b0Var.f23730b) && Intrinsics.f(this.f23731c, b0Var.f23731c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        return this.d.f23728a.hashCode() + ((this.f23731c.hashCode() + ((this.f23730b.hashCode() + (this.f23729a.hashCode() * 31)) * 31)) * 31);
    }
}
