package au3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9468b;

    public b(String str, a aVar) {
        this.f9467a = str;
        this.f9468b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f9467a, bVar.f9467a) && Intrinsics.f(this.f9468b, bVar.f9468b);
    }

    public final int hashCode() {
        String str = this.f9467a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f9468b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
