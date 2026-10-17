package x15;

import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit.card.models.creditcard.CreditCardCancellation;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f302282c;
    public final xw4.a d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreditCardAutopayPayments f302283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CreditCard f302284h;
    public final yw4.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f302285j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ll4.o f302286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdditionalCardholdersState f302287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yw4.l f302288n;
    public final CreditCardCancellation o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wi0.b f302289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f302290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final od0.i f302291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xr7.f f302292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f302293t;

    public m(String facilityId, String pocketId, dj0.d dVar, xw4.a paymentState, dj0.d availableMoney, dj0.d currentMoney, CreditCardAutopayPayments creditCardAutopayPayments, CreditCard creditCard, yw4.o oVar, boolean z, boolean z3, ll4.o oVar2, AdditionalCardholdersState additionalCardholdersState, yw4.l accessLevel, CreditCardCancellation creditCardCancellation, wi0.b countryCode, List features, od0.i homeHeaderContent, xr7.f insuranceState, boolean z4) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(availableMoney, "availableMoney");
        Intrinsics.checkNotNullParameter(currentMoney, "currentMoney");
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        Intrinsics.checkNotNullParameter(additionalCardholdersState, "additionalCardholdersState");
        Intrinsics.checkNotNullParameter(accessLevel, "accessLevel");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(homeHeaderContent, "homeHeaderContent");
        Intrinsics.checkNotNullParameter(insuranceState, "insuranceState");
        this.f302280a = facilityId;
        this.f302281b = pocketId;
        this.f302282c = dVar;
        this.d = paymentState;
        this.e = availableMoney;
        this.f = currentMoney;
        this.f302283g = creditCardAutopayPayments;
        this.f302284h = creditCard;
        this.i = oVar;
        this.f302285j = z;
        this.k = z3;
        this.f302286l = oVar2;
        this.f302287m = additionalCardholdersState;
        this.f302288n = accessLevel;
        this.o = creditCardCancellation;
        this.f302289p = countryCode;
        this.f302290q = features;
        this.f302291r = homeHeaderContent;
        this.f302292s = insuranceState;
        this.f302293t = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f302280a, mVar.f302280a) && Intrinsics.f(this.f302281b, mVar.f302281b) && Intrinsics.f(this.f302282c, mVar.f302282c) && this.d == mVar.d && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f302283g, mVar.f302283g) && Intrinsics.f(this.f302284h, mVar.f302284h) && this.i == mVar.i && this.f302285j == mVar.f302285j && this.k == mVar.k && Intrinsics.f(this.f302286l, mVar.f302286l) && Intrinsics.f(this.f302287m, mVar.f302287m) && this.f302288n == mVar.f302288n && Intrinsics.f(this.o, mVar.o) && Intrinsics.f(this.f302289p, mVar.f302289p) && Intrinsics.f(this.f302290q, mVar.f302290q) && Intrinsics.f(this.f302291r, mVar.f302291r) && Intrinsics.f(this.f302292s, mVar.f302292s) && this.f302293t == mVar.f302293t;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f302280a.hashCode() * 31, 31, this.f302281b);
        dj0.d dVar = this.f302282c;
        int iC2 = v7.c(v7.c((this.d.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        CreditCardAutopayPayments creditCardAutopayPayments = this.f302283g;
        int iHashCode = (this.f302284h.hashCode() + ((iC2 + (creditCardAutopayPayments == null ? 0 : creditCardAutopayPayments.hashCode())) * 31)) * 31;
        yw4.o oVar = this.i;
        int iC3 = j6.a.c(j6.a.c((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.f302285j), 31, this.k);
        ll4.o oVar2 = this.f302286l;
        int iHashCode2 = (this.f302288n.hashCode() + ((this.f302287m.hashCode() + ((iC3 + (oVar2 == null ? 0 : oVar2.hashCode())) * 31)) * 31)) * 31;
        CreditCardCancellation creditCardCancellation = this.o;
        return Boolean.hashCode(this.f302293t) + ((this.f302292s.hashCode() + r6.b.f(this.f302291r, p.a.d(p.a.c((iHashCode2 + (creditCardCancellation != null ? creditCardCancellation.hashCode() : 0)) * 31, 31, this.f302289p.f297794a), 31, this.f302290q), 31)) * 31);
    }
}
