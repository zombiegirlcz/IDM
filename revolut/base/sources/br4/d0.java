package br4;

import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditLimitIncreaseStatus f17886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f17887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od0.i f17888c;

    public d0(CreditLimitIncreaseStatus creditCardLimitIncreaseStatus, od0.i creditCardCreditLimitDecreasePreOffer, od0.i creditCardLimitIncreasePreQualificationOffer) {
        Intrinsics.checkNotNullParameter(creditCardLimitIncreaseStatus, "creditCardLimitIncreaseStatus");
        Intrinsics.checkNotNullParameter(creditCardCreditLimitDecreasePreOffer, "creditCardCreditLimitDecreasePreOffer");
        Intrinsics.checkNotNullParameter(creditCardLimitIncreasePreQualificationOffer, "creditCardLimitIncreasePreQualificationOffer");
        this.f17886a = creditCardLimitIncreaseStatus;
        this.f17887b = creditCardCreditLimitDecreasePreOffer;
        this.f17888c = creditCardLimitIncreasePreQualificationOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f17886a, d0Var.f17886a) && Intrinsics.f(this.f17887b, d0Var.f17887b) && Intrinsics.f(this.f17888c, d0Var.f17888c);
    }

    public final int hashCode() {
        return this.f17888c.hashCode() + r6.b.f(this.f17887b, this.f17886a.hashCode() * 31, 31);
    }
}
