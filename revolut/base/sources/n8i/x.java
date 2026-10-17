package n8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f213483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f213484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f213485c;
    public final boolean d;
    public final boolean e;
    public final s6i.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OrderQuote f213486g;

    public x(AccountWrapper targetAccount, AccountWrapper sourceAccount, dj0.d inputAmount, boolean z, boolean z3, s6i.g gVar, OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        this.f213483a = targetAccount;
        this.f213484b = sourceAccount;
        this.f213485c = inputAmount;
        this.d = z;
        this.e = z3;
        this.f = gVar;
        this.f213486g = orderQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f213483a, xVar.f213483a) && Intrinsics.f(this.f213484b, xVar.f213484b) && Intrinsics.f(this.f213485c, xVar.f213485c) && this.d == xVar.d && this.e == xVar.e && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f213486g, xVar.f213486g);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(v7.c((this.f213484b.hashCode() + (this.f213483a.hashCode() * 31)) * 31, 31, this.f213485c), 31, this.d), 31, this.e);
        s6i.g gVar = this.f;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        OrderQuote orderQuote = this.f213486g;
        return iHashCode + (orderQuote != null ? orderQuote.hashCode() : 0);
    }
}
