package w56;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiTransferQuoteRequest f294701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f294702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f294703c;

    public g(DeFiTransferQuoteRequest quoteRequest, Data quote, Data wallet) {
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        this.f294701a = quoteRequest;
        this.f294702b = quote;
        this.f294703c = wallet;
    }

    public static g a(g gVar, Data quote, Data wallet, int i) {
        DeFiTransferQuoteRequest quoteRequest = gVar.f294701a;
        if ((i & 2) != 0) {
            quote = gVar.f294702b;
        }
        if ((i & 4) != 0) {
            wallet = gVar.f294703c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        return new g(quoteRequest, quote, wallet);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f294701a, gVar.f294701a) && Intrinsics.f(this.f294702b, gVar.f294702b) && Intrinsics.f(this.f294703c, gVar.f294703c);
    }

    public final int hashCode() {
        return this.f294703c.hashCode() + kii.e.c(this.f294702b, this.f294701a.hashCode() * 31, 31);
    }
}
