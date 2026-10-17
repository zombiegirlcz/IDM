package b75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanInterestRate;
import kotlin.jvm.internal.Intrinsics;
import q35.l;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f12915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanInterestRate f12916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12917c;

    public g(wi0.b country, LoanInterestRate interestRate, l lVar) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        this.f12915a = country;
        this.f12916b = interestRate;
        this.f12917c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f12915a, gVar.f12915a) && Intrinsics.f(this.f12916b, gVar.f12916b) && Intrinsics.f(this.f12917c, gVar.f12917c);
    }

    public final int hashCode() {
        int iHashCode = (this.f12916b.hashCode() + (this.f12915a.f297794a.hashCode() * 31)) * 31;
        l lVar = this.f12917c;
        return iHashCode + (lVar == null ? 0 : Integer.hashCode(lVar.f241830a));
    }
}
