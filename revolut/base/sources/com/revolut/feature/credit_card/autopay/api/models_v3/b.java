package com.revolut.feature.credit_card.autopay.api.models_v3;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import kotlin.jvm.internal.Intrinsics;
import nb5.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f70742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayPayment.PaymentDay f70743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardAutopayPayment.PaymentAmount f70744c;
    public final String d;
    public final Integer e;

    public b(e type, CreditCardAutopayPayment.PaymentDay paymentDay, CreditCardAutopayPayment.PaymentAmount amount, String str, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentDay, "paymentDay");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f70742a = type;
        this.f70743b = paymentDay;
        this.f70744c = amount;
        this.d = str;
        this.e = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f70742a == bVar.f70742a && Intrinsics.f(this.f70743b, bVar.f70743b) && Intrinsics.f(this.f70744c, bVar.f70744c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f70744c.hashCode() + ((this.f70743b.hashCode() + (this.f70742a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
