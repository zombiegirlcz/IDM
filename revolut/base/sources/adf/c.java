package adf;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f3330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3331b;

    public c(Amount totalConvertedFee, List orderQuotes) {
        Intrinsics.checkNotNullParameter(totalConvertedFee, "totalConvertedFee");
        Intrinsics.checkNotNullParameter(orderQuotes, "orderQuotes");
        this.f3330a = totalConvertedFee;
        this.f3331b = orderQuotes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f3330a, cVar.f3330a) && Intrinsics.f(this.f3331b, cVar.f3331b);
    }

    public final int hashCode() {
        return this.f3331b.hashCode() + (this.f3330a.hashCode() * 31);
    }
}
