package s6i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5i.a f260362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5i.a f260363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f260364c;
    public final hd.e d;
    public final OrderQuote e;

    public e(x5i.a top, x5i.a bottom, g gVar, hd.e eVar, OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.f260362a = top;
        this.f260363b = bottom;
        this.f260364c = gVar;
        this.d = eVar;
        this.e = orderQuote;
    }

    public static e a(e eVar, x5i.a aVar, x5i.a aVar2, int i) {
        if ((i & 1) != 0) {
            aVar = eVar.f260362a;
        }
        x5i.a top = aVar;
        if ((i & 2) != 0) {
            aVar2 = eVar.f260363b;
        }
        x5i.a bottom = aVar2;
        g gVar = eVar.f260364c;
        hd.e eVar2 = eVar.d;
        OrderQuote orderQuote = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        return new e(top, bottom, gVar, eVar2, orderQuote);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f260362a, eVar.f260362a) && Intrinsics.f(this.f260363b, eVar.f260363b) && Intrinsics.f(this.f260364c, eVar.f260364c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f260363b.hashCode() + (this.f260362a.hashCode() * 31)) * 31;
        g gVar = this.f260364c;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        hd.e eVar = this.d;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        OrderQuote orderQuote = this.e;
        return iHashCode3 + (orderQuote != null ? orderQuote.hashCode() : 0);
    }
}
