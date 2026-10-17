package us4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuotes;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f282422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardFutureInstalmentQuotes f282424c;
    public final vt4.d d;
    public final dj0.d e;

    public g(int i, String str, CreditCardFutureInstalmentQuotes quotes, vt4.d paymentSource, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        this.f282422a = i;
        this.f282423b = str;
        this.f282424c = quotes;
        this.d = paymentSource;
        this.e = dVar;
    }

    public static g a(g gVar, int i, vt4.d dVar, dj0.d dVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = gVar.f282422a;
        }
        int i3 = i;
        String str = gVar.f282423b;
        CreditCardFutureInstalmentQuotes quotes = gVar.f282424c;
        if ((i2 & 8) != 0) {
            dVar = gVar.d;
        }
        vt4.d paymentSource = dVar;
        if ((i2 & 16) != 0) {
            dVar2 = gVar.e;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        return new g(i3, str, quotes, paymentSource, dVar2);
    }

    public final CreditCardFutureInstalmentQuote b() {
        for (CreditCardFutureInstalmentQuote creditCardFutureInstalmentQuote : this.f282424c.f68773a) {
            if (creditCardFutureInstalmentQuote.f68769b == this.f282422a) {
                return creditCardFutureInstalmentQuote;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f282422a == gVar.f282422a && Intrinsics.f(this.f282423b, gVar.f282423b) && Intrinsics.f(this.f282424c, gVar.f282424c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f282422a) * 31;
        String str = this.f282423b;
        int iHashCode2 = (this.d.hashCode() + ((this.f282424c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        dj0.d dVar = this.e;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
