package o7h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzg.o f222846b;

    public v(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f222845a = ref2;
        this.f222846b = new zzg.o(ref2);
    }

    @Override // o7h.x
    public final zzg.q M0() {
        return this.f222846b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f222845a, ((v) obj2).f222845a);
    }

    @Override // o7h.x
    public final String getCacheKey() {
        return this.f222846b.toString();
    }

    public final int hashCode() {
        return this.f222845a.hashCode();
    }
}
