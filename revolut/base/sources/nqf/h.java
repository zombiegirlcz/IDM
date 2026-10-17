package nqf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f218439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218441c;
    public final wi0.b d;
    public final wi0.b e;

    public h(krf.c transferReason, String productName, String shippingAirport, wi0.b bVar, wi0.b bVar2) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(shippingAirport, "shippingAirport");
        this.f218439a = transferReason;
        this.f218440b = productName;
        this.f218441c = shippingAirport;
        this.d = bVar;
        this.e = bVar2;
    }

    public static h a(h hVar, krf.d dVar, String str, String str2, wi0.b bVar, wi0.b bVar2, int i) {
        krf.c cVar = dVar;
        if ((i & 1) != 0) {
            cVar = hVar.f218439a;
        }
        krf.c transferReason = cVar;
        if ((i & 2) != 0) {
            str = hVar.f218440b;
        }
        String productName = str;
        if ((i & 4) != 0) {
            str2 = hVar.f218441c;
        }
        String shippingAirport = str2;
        if ((i & 8) != 0) {
            bVar = hVar.d;
        }
        wi0.b bVar3 = bVar;
        if ((i & 16) != 0) {
            bVar2 = hVar.e;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(shippingAirport, "shippingAirport");
        return new h(transferReason, productName, shippingAirport, bVar3, bVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f218439a, hVar.f218439a) && Intrinsics.f(this.f218440b, hVar.f218440b) && Intrinsics.f(this.f218441c, hVar.f218441c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f218439a.hashCode() * 31, 31, this.f218440b), 31, this.f218441c);
        wi0.b bVar = this.d;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        wi0.b bVar2 = this.e;
        return iHashCode + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
    }
}
