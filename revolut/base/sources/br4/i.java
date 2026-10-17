package br4;

import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f17895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardAutopayPayments f17897c;
    public final CreditCard d;
    public final wi0.b e;

    public i(od0.i infoSectionsContent, int i, CreditCardAutopayPayments payments, CreditCard creditCard, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(infoSectionsContent, "infoSectionsContent");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f17895a = infoSectionsContent;
        this.f17896b = i;
        this.f17897c = payments;
        this.d = creditCard;
        this.e = countryCode;
    }

    @Override // br4.l
    public final CreditCard a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f17895a, iVar.f17895a) && this.f17896b == iVar.f17896b && Intrinsics.f(this.f17897c, iVar.f17897c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    @Override // br4.l
    public final wi0.b getCountryCode() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.f297794a.hashCode() + ((this.d.hashCode() + ((this.f17897c.hashCode() + j6.a.b(this.f17896b, this.f17895a.hashCode() * 31, 31)) * 31)) * 31);
    }
}
