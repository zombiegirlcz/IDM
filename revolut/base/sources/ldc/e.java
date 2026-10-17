package ldc;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Quote f194059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f194060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w6c.j f194061c;
    public final Data d;

    public e(Quote quote, dj0.d totalInRequestedCurrency, w6c.j variant, Data disclaimerContent) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(totalInRequestedCurrency, "totalInRequestedCurrency");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
        this.f194059a = quote;
        this.f194060b = totalInRequestedCurrency;
        this.f194061c = variant;
        this.d = disclaimerContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f194059a, eVar.f194059a) && Intrinsics.f(this.f194060b, eVar.f194060b) && this.f194061c == eVar.f194061c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f194061c.hashCode() + v7.c(this.f194059a.hashCode() * 31, 31, this.f194060b)) * 31);
    }
}
