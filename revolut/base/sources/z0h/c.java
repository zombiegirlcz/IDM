package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f318484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318485b;

    public c(b footerVariant, hel.b bVar) {
        Intrinsics.checkNotNullParameter(footerVariant, "footerVariant");
        this.f318484a = footerVariant;
        this.f318485b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f318484a == cVar.f318484a && this.f318485b == cVar.f318485b;
    }

    public final int hashCode() {
        int iHashCode = this.f318484a.hashCode() * 31;
        hel.b bVar = this.f318485b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
