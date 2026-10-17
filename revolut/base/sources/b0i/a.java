package b0i;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f11672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f11673b;

    public a(OrderQuote previousQuote, Data newQuote) {
        Intrinsics.checkNotNullParameter(previousQuote, "previousQuote");
        Intrinsics.checkNotNullParameter(newQuote, "newQuote");
        this.f11672a = previousQuote;
        this.f11673b = newQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f11672a, aVar.f11672a) && Intrinsics.f(this.f11673b, aVar.f11673b);
    }

    public final int hashCode() {
        return this.f11673b.hashCode() + (this.f11672a.hashCode() * 31);
    }
}
