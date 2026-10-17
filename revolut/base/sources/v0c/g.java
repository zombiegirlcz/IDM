package v0c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f284783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f284784b;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f284783a, gVar.f284783a) && Intrinsics.f(this.f284784b, gVar.f284784b);
    }

    public final int hashCode() {
        return this.f284784b.hashCode() + (this.f284783a.hashCode() * 31);
    }

    public g(Data savingsDetails, Data pricingPlan) {
        Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f284783a = savingsDetails;
        this.f284784b = pricingPlan;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
