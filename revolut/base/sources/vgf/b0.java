package vgf;

import com.revolut.feature.transactions.api.navigation.UpcomingPaymentsPocketInfo;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f289070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpcomingPaymentsPocketInfo f289071b;

    public b0(Set productAccountIds, UpcomingPaymentsPocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(productAccountIds, "productAccountIds");
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        this.f289070a = productAccountIds;
        this.f289071b = pocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f289070a, b0Var.f289070a) && Intrinsics.f(this.f289071b, b0Var.f289071b);
    }

    public final int hashCode() {
        return this.f289071b.hashCode() + (this.f289070a.hashCode() * 31);
    }
}
