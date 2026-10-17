package dsb;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarginQuote f117282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qrb.k f117283b;

    public g(MarginQuote marginQuote, qrb.k tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        this.f117282a = marginQuote;
        this.f117283b = tradeInstrumentData;
    }

    @Override // dsb.m
    public final qrb.k a() {
        return this.f117283b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f117282a, gVar.f117282a) && Intrinsics.f(this.f117283b, gVar.f117283b);
    }

    public final int hashCode() {
        return this.f117283b.hashCode() + (this.f117282a.hashCode() * 31);
    }
}
