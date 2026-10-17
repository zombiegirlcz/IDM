package s6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements l {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f260222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f260223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f260224c;
    public final dj0.d d;
    public final Quote e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f260225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PayLaterOffer f260226h;

    public i(dj0.d total, dj0.d totalInRequestedCurrency, dj0.d totalWithoutRedemption, dj0.d subtotal, Quote quote, p pVar, dj0.d dVar, PayLaterOffer payLaterOffer) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(totalInRequestedCurrency, "totalInRequestedCurrency");
        Intrinsics.checkNotNullParameter(totalWithoutRedemption, "totalWithoutRedemption");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        this.f260222a = total;
        this.f260223b = totalInRequestedCurrency;
        this.f260224c = totalWithoutRedemption;
        this.d = subtotal;
        this.e = quote;
        this.f = pVar;
        this.f260225g = dVar;
        this.f260226h = payLaterOffer;
    }

    @Override // s6c.l
    public final dj0.d a() {
        return this.f260222a;
    }

    @Override // s6c.l
    public final dj0.d b() {
        return this.f260225g;
    }

    @Override // s6c.l
    public final dj0.d c() {
        return this.d;
    }

    @Override // s6c.l
    public final dj0.d d() {
        return this.f260224c;
    }

    @Override // s6c.l
    public final p e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f260222a, iVar.f260222a) && Intrinsics.f(this.f260223b, iVar.f260223b) && Intrinsics.f(this.f260224c, iVar.f260224c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f260225g, iVar.f260225g) && Intrinsics.f(this.f260226h, iVar.f260226h);
    }

    @Override // s6c.l
    public final dj0.d f() {
        return this.f260223b;
    }

    @Override // s6c.l
    public final PayLaterOffer g() {
        return this.f260226h;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(this.f260222a.hashCode() * 31, 31, this.f260223b), 31, this.f260224c), 31, this.d);
        Quote quote = this.e;
        int iHashCode = (iC + (quote == null ? 0 : quote.hashCode())) * 31;
        p pVar = this.f;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        dj0.d dVar = this.f260225g;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        PayLaterOffer payLaterOffer = this.f260226h;
        return iHashCode3 + (payLaterOffer != null ? payLaterOffer.hashCode() : 0);
    }
}
