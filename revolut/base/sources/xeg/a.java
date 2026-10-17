package xeg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vei.a f304652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f304653c;

    public a(List cashbackList, vei.a pricingPlanCode, List availablePlansToUpgrade) {
        Intrinsics.checkNotNullParameter(cashbackList, "cashbackList");
        Intrinsics.checkNotNullParameter(pricingPlanCode, "pricingPlanCode");
        Intrinsics.checkNotNullParameter(availablePlansToUpgrade, "availablePlansToUpgrade");
        this.f304651a = cashbackList;
        this.f304652b = pricingPlanCode;
        this.f304653c = availablePlansToUpgrade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f304651a, aVar.f304651a) && this.f304652b == aVar.f304652b && Intrinsics.f(this.f304653c, aVar.f304653c);
    }

    public final int hashCode() {
        return this.f304653c.hashCode() + ((this.f304652b.hashCode() + (this.f304651a.hashCode() * 31)) * 31);
    }
}
