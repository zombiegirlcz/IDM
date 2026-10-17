package w5l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295352c;
    public final e93.b d;
    public final c e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f295353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f295354h;
    public final String i;

    public a(String id10, String str, String designCode, e93.b brandDesign, c state, b bVar, boolean z, String str2, String cardName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(designCode, "designCode");
        Intrinsics.checkNotNullParameter(brandDesign, "brandDesign");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        this.f295350a = id10;
        this.f295351b = str;
        this.f295352c = designCode;
        this.d = brandDesign;
        this.e = state;
        this.f = bVar;
        this.f295353g = z;
        this.f295354h = str2;
        this.i = cardName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f295350a, aVar.f295350a) && Intrinsics.f(this.f295351b, aVar.f295351b) && Intrinsics.f(this.f295352c, aVar.f295352c) && this.d == aVar.d && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && this.f295353g == aVar.f295353g && Intrinsics.f(this.f295354h, aVar.f295354h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f295350a.hashCode() * 31;
        String str = this.f295351b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f295352c)) * 31)) * 31;
        b bVar = this.f;
        int iC = j6.a.c((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f295353g);
        String str2 = this.f295354h;
        return this.i.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
