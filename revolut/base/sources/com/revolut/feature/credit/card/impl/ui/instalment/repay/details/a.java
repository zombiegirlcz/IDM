package com.revolut.feature.credit.card.impl.ui.instalment.repay.details;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails f69486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f69487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f69488c;

    public a(CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails repayDetails, dj0.d dVar, dj0.d remainingTotalAmount) {
        Intrinsics.checkNotNullParameter(repayDetails, "repayDetails");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        this.f69486a = repayDetails;
        this.f69487b = dVar;
        this.f69488c = remainingTotalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f69486a, aVar.f69486a) && Intrinsics.f(this.f69487b, aVar.f69487b) && Intrinsics.f(this.f69488c, aVar.f69488c);
    }

    public final int hashCode() {
        int iHashCode = this.f69486a.hashCode() * 31;
        dj0.d dVar = this.f69487b;
        return this.f69488c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
