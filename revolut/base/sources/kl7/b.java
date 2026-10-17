package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f185293b;

    public b(boolean z, a aVar) {
        this.f185292a = z;
        this.f185293b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f185292a == bVar.f185292a && Intrinsics.f(this.f185293b, bVar.f185293b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f185292a) * 31;
        a aVar = this.f185293b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
