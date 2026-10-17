package upc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yvh.b f281950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yvh.b f281951c;

    public a(String portfolioId, yvh.b bVar, yvh.b bVar2) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f281949a = portfolioId;
        this.f281950b = bVar;
        this.f281951c = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281949a, aVar.f281949a) && Intrinsics.f(this.f281950b, aVar.f281950b) && Intrinsics.f(this.f281951c, aVar.f281951c);
    }

    public final int hashCode() {
        int iHashCode = this.f281949a.hashCode() * 31;
        yvh.b bVar = this.f281950b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        yvh.b bVar2 = this.f281951c;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
