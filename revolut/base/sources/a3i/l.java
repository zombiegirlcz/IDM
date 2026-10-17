package a3i;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrder f1147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3i.b f1148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f1149c;
    public final boolean d;

    public l(ExchangeOrder order, c3i.b bVar, wi0.b bVar2, boolean z) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f1147a = order;
        this.f1148b = bVar;
        this.f1149c = bVar2;
        this.d = z;
    }

    public static l a(l lVar, c3i.b bVar, wi0.b bVar2, boolean z, int i) {
        ExchangeOrder order = lVar.f1147a;
        if ((i & 2) != 0) {
            bVar = lVar.f1148b;
        }
        if ((i & 4) != 0) {
            bVar2 = lVar.f1149c;
        }
        if ((i & 8) != 0) {
            z = lVar.d;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(order, "order");
        return new l(order, bVar, bVar2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f1147a, lVar.f1147a) && Intrinsics.f(this.f1148b, lVar.f1148b) && Intrinsics.f(this.f1149c, lVar.f1149c) && this.d == lVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f1147a.hashCode() * 31;
        c3i.b bVar = this.f1148b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wi0.b bVar2 = this.f1149c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0)) * 31);
    }
}
