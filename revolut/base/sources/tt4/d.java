package tt4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f274209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f274210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardSecurityDeposit f274211c;

    public d(e limitInfo, wi0.b countryCode, CreditCardSecurityDeposit creditCardSecurityDeposit) {
        Intrinsics.checkNotNullParameter(limitInfo, "limitInfo");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f274209a = limitInfo;
        this.f274210b = countryCode;
        this.f274211c = creditCardSecurityDeposit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f274209a, dVar.f274209a) && Intrinsics.f(this.f274210b, dVar.f274210b) && Intrinsics.f(this.f274211c, dVar.f274211c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f274209a.hashCode() * 31, 31, this.f274210b.f297794a);
        CreditCardSecurityDeposit creditCardSecurityDeposit = this.f274211c;
        return iC + (creditCardSecurityDeposit == null ? 0 : creditCardSecurityDeposit.hashCode());
    }
}
