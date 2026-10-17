package bw4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementDeferralQuote f19222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f19223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt4.d f19224c;
    public final List d;

    public e(CreditCardStatementDeferralQuote quote, dj0.d downPayment, vt4.d paymentSource, List documents) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(downPayment, "downPayment");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f19222a = quote;
        this.f19223b = downPayment;
        this.f19224c = paymentSource;
        this.d = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f19222a, eVar.f19222a) && Intrinsics.f(this.f19223b, eVar.f19223b) && Intrinsics.f(this.f19224c, eVar.f19224c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f19224c.hashCode() + v7.c(this.f19222a.hashCode() * 31, 31, this.f19223b)) * 31);
    }
}
