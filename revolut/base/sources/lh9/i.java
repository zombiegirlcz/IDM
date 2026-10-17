package lh9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f195180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentData f195181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f195182c;
    public final List d;
    public final String e;

    public i(dj0.d amount, PaymentData paymentData, j jVar, List fields, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f195180a = amount;
        this.f195181b = paymentData;
        this.f195182c = jVar;
        this.d = fields;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f195180a, iVar.f195180a) && Intrinsics.f(this.f195181b, iVar.f195181b) && Intrinsics.f(this.f195182c, iVar.f195182c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f195181b.hashCode() + (this.f195180a.hashCode() * 31)) * 31;
        j jVar = this.f195182c;
        int iD = p.a.d((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
