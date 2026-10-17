package xzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f310030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f310031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9l.a f310032c;
    public final vel.a d;

    public t(a0 entry, xi0.b currency, n9l.a aVar, vel.a aVar2) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f310030a = entry;
        this.f310031b = currency;
        this.f310032c = aVar;
        this.d = aVar2;
    }

    @Override // xzg.v
    public final a0 a() {
        return this.f310030a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f310030a, tVar.f310030a) && Intrinsics.f(this.f310031b, tVar.f310031b) && Intrinsics.f(this.f310032c, tVar.f310032c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f310031b, this.f310030a.hashCode() * 31, 31);
        n9l.a aVar = this.f310032c;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        vel.a aVar2 = this.d;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
