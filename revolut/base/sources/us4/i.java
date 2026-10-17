package us4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardFutureInstalmentQuote f282426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f282427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f282428c;

    public i(CreditCardFutureInstalmentQuote quote, LocalDate nextMaturingDate, LocalDate previousLastMaturingDate) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(nextMaturingDate, "nextMaturingDate");
        Intrinsics.checkNotNullParameter(previousLastMaturingDate, "previousLastMaturingDate");
        this.f282426a = quote;
        this.f282427b = nextMaturingDate;
        this.f282428c = previousLastMaturingDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f282426a, iVar.f282426a) && Intrinsics.f(this.f282427b, iVar.f282427b) && Intrinsics.f(this.f282428c, iVar.f282428c);
    }

    public final int hashCode() {
        return this.f282428c.hashCode() + y.a(this.f282426a.hashCode() * 31, 31, this.f282427b);
    }
}
