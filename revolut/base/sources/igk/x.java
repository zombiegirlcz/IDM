package igk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xfa.b f161275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f161276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f161277c;
    public final l0 d;
    public final xfa.a e;

    public x(xfa.b source, k0 filter, g0 selection, l0 l0Var, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f161275a = source;
        this.f161276b = filter;
        this.f161277c = selection;
        this.d = l0Var;
        this.e = aVar;
    }

    public final xfa.a a() {
        return this.e;
    }

    public final k0 b() {
        return this.f161276b;
    }

    public final g0 c() {
        return this.f161277c;
    }

    public final xfa.b d() {
        return this.f161275a;
    }

    public final l0 e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f161275a == xVar.f161275a && Intrinsics.f(this.f161276b, xVar.f161276b) && Intrinsics.f(this.f161277c, xVar.f161277c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f161277c.hashCode() + ((this.f161276b.hashCode() + (this.f161275a.hashCode() * 31)) * 31)) * 31;
        l0 l0Var = this.d;
        int iHashCode2 = (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        xfa.a aVar = this.e;
        return iHashCode2 + (aVar != null ? aVar.f305202a.hashCode() : 0);
    }

    public /* synthetic */ x(xfa.b bVar, k0 k0Var, l0 l0Var, xfa.a aVar, int i) {
        this(bVar, (i & 2) != 0 ? i0.f161250a : k0Var, e0.f161243a, (i & 8) != 0 ? null : l0Var, (i & 16) != 0 ? null : aVar);
    }
}
