package qa6;

import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationQuoteResponse f243968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DonationQuoteRequest f243969b;

    public f(DonationQuoteRequest quoteRequest, DonationQuoteResponse quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        this.f243968a = quote;
        this.f243969b = quoteRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f243968a, fVar.f243968a) && Intrinsics.f(this.f243969b, fVar.f243969b);
    }

    public final int hashCode() {
        return this.f243969b.hashCode() + (this.f243968a.hashCode() * 31);
    }
}
