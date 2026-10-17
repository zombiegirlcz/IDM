package a8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6c.k f2164b;

    public h(String str, u6c.k kVar) {
        this.f2163a = str;
        this.f2164b = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f2163a, hVar.f2163a) && this.f2164b == hVar.f2164b;
    }

    public final int hashCode() {
        String str = this.f2163a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        u6c.k kVar = this.f2164b;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }
}
