package ho1;

import com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f154200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f154201c;
    public final LocalDate d;
    public final BPayBill.ServiceProvider e;

    public a(String paymentMethod, d totalAmount, d amount, LocalDate localDate, BPayBill.ServiceProvider serviceProvider) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        this.f154199a = paymentMethod;
        this.f154200b = totalAmount;
        this.f154201c = amount;
        this.d = localDate;
        this.e = serviceProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f154199a, aVar.f154199a) && Intrinsics.f(this.f154200b, aVar.f154200b) && Intrinsics.f(this.f154201c, aVar.f154201c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f154199a.hashCode() * 31, 31, this.f154200b), 31, this.f154201c);
        LocalDate localDate = this.d;
        return this.e.hashCode() + ((iC + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
