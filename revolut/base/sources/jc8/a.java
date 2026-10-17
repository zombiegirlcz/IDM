package jc8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e93.b f172749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b93.b f172750c;
    public final b d;
    public final boolean e;
    public final String f;

    public a(String id10, e93.b brand, b93.b designCode, b bVar, boolean z, String cardProfileId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(designCode, "designCode");
        Intrinsics.checkNotNullParameter(cardProfileId, "cardProfileId");
        this.f172748a = id10;
        this.f172749b = brand;
        this.f172750c = designCode;
        this.d = bVar;
        this.e = z;
        this.f = cardProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f172748a, aVar.f172748a) && this.f172749b == aVar.f172749b && Intrinsics.f(this.f172750c, aVar.f172750c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f172750c.hashCode() + ((this.f172749b.hashCode() + (this.f172748a.hashCode() * 31)) * 31)) * 31;
        b bVar = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e);
    }
}
