package w4i;

import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInterest f294590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f294591b;

    public u(CreditCardInterest creditCardInterest, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(creditCardInterest, "creditCardInterest");
        this.f294590a = creditCardInterest;
        this.f294591b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f294590a, uVar.f294590a) && Intrinsics.f(this.f294591b, uVar.f294591b);
    }

    public final int hashCode() {
        int iHashCode = this.f294590a.hashCode() * 31;
        wi0.b bVar = this.f294591b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
