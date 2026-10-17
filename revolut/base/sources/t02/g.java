package t02;

import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentSource f266859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmPaymentMethod f266860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f266861c;
    public final r02.a d;

    public g(ApmPaymentSource source, ApmPaymentMethod paymentMethod, dj0.d transferAmount, r02.a aVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(transferAmount, "transferAmount");
        this.f266859a = source;
        this.f266860b = paymentMethod;
        this.f266861c = transferAmount;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f266859a, gVar.f266859a) && Intrinsics.f(this.f266860b, gVar.f266860b) && Intrinsics.f(this.f266861c, gVar.f266861c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = v7.c((this.f266860b.hashCode() + (this.f266859a.hashCode() * 31)) * 31, 31, this.f266861c);
        r02.a aVar = this.d;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
