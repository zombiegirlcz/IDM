package qqf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f248538a;

    public g(krf.c cVar) {
        this.f248538a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f248538a, ((g) obj2).f248538a);
    }

    public final int hashCode() {
        krf.c cVar = this.f248538a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
