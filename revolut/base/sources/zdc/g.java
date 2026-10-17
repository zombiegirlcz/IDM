package zdc;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f321445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f321446b;

    public g(Data orderDetails, Data paymentSummary) {
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(paymentSummary, "paymentSummary");
        this.f321445a = orderDetails;
        this.f321446b = paymentSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f321445a, gVar.f321445a) && Intrinsics.f(this.f321446b, gVar.f321446b);
    }

    public final int hashCode() {
        return this.f321446b.hashCode() + (this.f321445a.hashCode() * 31);
    }
}
