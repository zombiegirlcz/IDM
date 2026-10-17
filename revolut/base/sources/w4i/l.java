package w4i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f294577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f294578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294579c;
    public final qv0.i d;

    public l(OrderQuote quote, wi0.b bVar, List instruments, qv0.i iVar) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f294577a = quote;
        this.f294578b = bVar;
        this.f294579c = instruments;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f294577a, lVar.f294577a) && Intrinsics.f(this.f294578b, lVar.f294578b) && Intrinsics.f(this.f294579c, lVar.f294579c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f294577a.hashCode() * 31;
        wi0.b bVar = this.f294578b;
        int iD = p.a.d((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.f294579c);
        qv0.i iVar = this.d;
        return iD + (iVar != null ? iVar.hashCode() : 0);
    }
}
