package o7h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg.q f222840a;

    public s() {
        zzg.l collectionKey = zzg.l.f326743a;
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f222840a = collectionKey;
    }

    @Override // o7h.x
    public final zzg.q M0() {
        return this.f222840a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f222840a, ((s) obj2).f222840a);
    }

    @Override // o7h.x
    public final String getCacheKey() {
        return this.f222840a.toString();
    }

    public final int hashCode() {
        return this.f222840a.hashCode();
    }
}
