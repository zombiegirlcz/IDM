package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f173451a;

    public g2(dj0.d dVar) {
        this.f173451a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g2) && Intrinsics.f(this.f173451a, ((g2) obj2).f173451a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f173451a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
