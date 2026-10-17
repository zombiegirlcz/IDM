package xzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f309990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f309991c;
    public final long d;

    public g(String collectionKey, xi0.b baseCurrency, j performance, long j2) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f309989a = collectionKey;
        this.f309990b = baseCurrency;
        this.f309991c = performance;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f309989a, gVar.f309989a) && Intrinsics.f(this.f309990b, gVar.f309990b) && Intrinsics.f(this.f309991c, gVar.f309991c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + t61.a.d(this.f309991c.f310002a, h30.l.j(this.f309990b, this.f309989a.hashCode() * 31, 31), 31);
    }
}
