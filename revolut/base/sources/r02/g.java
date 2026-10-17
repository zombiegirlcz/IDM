package r02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t02.a f250686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250687b;

    public g() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f250686a, gVar.f250686a) && Intrinsics.f(this.f250687b, gVar.f250687b);
    }

    public final int hashCode() {
        t02.a aVar = this.f250686a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f250687b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public g(t02.a aVar, String str) {
        this.f250686a = aVar;
        this.f250687b = str;
    }
}
