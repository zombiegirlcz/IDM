package one;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f226937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f226938b;

    public a(dj0.d individual, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(individual, "individual");
        this.f226937a = individual;
        this.f226938b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f226937a, aVar.f226937a) && Intrinsics.f(this.f226938b, aVar.f226938b);
    }

    public final int hashCode() {
        int iHashCode = this.f226937a.hashCode() * 31;
        dj0.d dVar = this.f226938b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
