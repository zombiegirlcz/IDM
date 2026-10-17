package il2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f162056c;
    public final d d;
    public final a e;

    public g(String title, String str, e eVar, d dVar, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f162054a = title;
        this.f162055b = str;
        this.f162056c = eVar;
        this.d = dVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f162054a, gVar.f162054a) && Intrinsics.f(this.f162055b, gVar.f162055b) && Intrinsics.f(this.f162056c, gVar.f162056c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f162054a.hashCode() * 31;
        String str = this.f162055b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f162056c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.e;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }
}
