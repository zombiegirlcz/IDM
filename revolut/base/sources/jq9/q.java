package jq9;

import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentCounterpartyInfo f177516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177517c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PaymentCounterpartyInfo counterparty, b paymentItem, int i) {
        super(0);
        Intrinsics.checkNotNullParameter(counterparty, "counterparty");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177516b = counterparty;
        this.f177517c = paymentItem;
        this.d = i;
    }

    @Override // jq9.k
    public final String a() {
        return this.f177516b.getDisplayName();
    }

    @Override // jq9.k
    public final b c() {
        return this.f177517c;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f177516b.equals(qVar.f177516b) && this.f177517c.equals(qVar.f177517c) && this.d == qVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(this.d, (this.f177517c.hashCode() + (this.f177516b.hashCode() * 31)) * 31, 31);
    }
}
