package cfl;

import cfl.f0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f23757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f23758c;
    public final a0 d;

    public y(UUID id10, c0 limits, x defaults, a0 fees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f23756a = id10;
        this.f23757b = limits;
        this.f23758c = defaults;
        this.d = fees;
    }

    @Override // cfl.f0.a
    public final a0 a() {
        return this.d;
    }

    @Override // cfl.f0.a
    public final c0 b() {
        return this.f23757b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f23756a, yVar.f23756a) && Intrinsics.f(this.f23757b, yVar.f23757b) && Intrinsics.f(this.f23758c, yVar.f23758c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        return this.d.f23728a.hashCode() + ((this.f23758c.hashCode() + ((this.f23757b.hashCode() + (this.f23756a.hashCode() * 31)) * 31)) * 31);
    }
}
