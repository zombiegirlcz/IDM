package lsl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f199705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f199706b;

    public i(dj0.d dVar, dj0.d counterAmount) {
        Intrinsics.checkNotNullParameter(counterAmount, "counterAmount");
        this.f199705a = dVar;
        this.f199706b = counterAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f199705a, iVar.f199705a) && Intrinsics.f(this.f199706b, iVar.f199706b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f199705a;
        return this.f199706b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
