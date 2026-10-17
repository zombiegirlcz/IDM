package com.revolut.feature.credit_card.autopay.api.models_v3;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import kotlin.jvm.internal.Intrinsics;
import nb5.e;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f70746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardAutopayPayment.PaymentDay f70747c;
    public final CreditCardAutopayPayment.PaymentAmount d;
    public final nb5.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f70748g;

    public c(String id10, e type, CreditCardAutopayPayment.PaymentDay paymentDay, CreditCardAutopayPayment.PaymentAmount paymentAmount, nb5.d dVar, String str, Integer num) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f70745a = id10;
        this.f70746b = type;
        this.f70747c = paymentDay;
        this.d = paymentAmount;
        this.e = dVar;
        this.f = str;
        this.f70748g = num;
    }

    public static c a(c cVar, CreditCardAutopayPayment.PaymentDay paymentDay, CreditCardAutopayPayment.PaymentAmount paymentAmount, nb5.d dVar, String str, int i) {
        String id10 = cVar.f70745a;
        e type = cVar.f70746b;
        if ((i & 4) != 0) {
            paymentDay = cVar.f70747c;
        }
        CreditCardAutopayPayment.PaymentDay paymentDay2 = paymentDay;
        if ((i & 8) != 0) {
            paymentAmount = cVar.d;
        }
        CreditCardAutopayPayment.PaymentAmount paymentAmount2 = paymentAmount;
        if ((i & 16) != 0) {
            dVar = cVar.e;
        }
        nb5.d dVar2 = dVar;
        if ((i & 32) != 0) {
            str = cVar.f;
        }
        Integer num = cVar.f70748g;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new c(id10, type, paymentDay2, paymentAmount2, dVar2, str, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f70745a, cVar.f70745a) && this.f70746b == cVar.f70746b && Intrinsics.f(this.f70747c, cVar.f70747c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f70748g, cVar.f70748g);
    }

    public final int hashCode() {
        int iHashCode = (this.f70746b.hashCode() + (this.f70745a.hashCode() * 31)) * 31;
        CreditCardAutopayPayment.PaymentDay paymentDay = this.f70747c;
        int iHashCode2 = (iHashCode + (paymentDay == null ? 0 : paymentDay.hashCode())) * 31;
        CreditCardAutopayPayment.PaymentAmount paymentAmount = this.d;
        int iHashCode3 = (iHashCode2 + (paymentAmount == null ? 0 : paymentAmount.hashCode())) * 31;
        nb5.d dVar = this.e;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f70748g;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }
}
