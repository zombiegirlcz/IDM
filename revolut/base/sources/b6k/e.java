package b6k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12848b;

    public e(a aVar, a aVar2) {
        this.f12847a = aVar;
        this.f12848b = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f12847a, eVar.f12847a) && Intrinsics.f(this.f12848b, eVar.f12848b);
    }

    public final int hashCode() {
        a aVar = this.f12847a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.f12848b;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
