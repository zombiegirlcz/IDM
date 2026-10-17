package l5i;

import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInterest f192287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f192288b;

    public l(CreditCardInterest creditCardInterest, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(creditCardInterest, "creditCardInterest");
        this.f192287a = creditCardInterest;
        this.f192288b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f192287a, lVar.f192287a) && Intrinsics.f(this.f192288b, lVar.f192288b);
    }

    public final int hashCode() {
        int iHashCode = this.f192287a.hashCode() * 31;
        wi0.b bVar = this.f192288b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
