package lr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f199416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f199417b;

    public t(dj0.d dVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f199416a = currency;
        this.f199417b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f199416a, tVar.f199416a) && Intrinsics.f(this.f199417b, tVar.f199417b);
    }

    public final int hashCode() {
        int iHashCode = this.f199416a.hashCode() * 31;
        dj0.d dVar = this.f199417b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
