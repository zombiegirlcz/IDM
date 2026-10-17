package snh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f264625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthAccount f264627c;

    public h(kel.b cashHolding, String portfolioId, WealthAccount account) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f264625a = cashHolding;
        this.f264626b = portfolioId;
        this.f264627c = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f264625a, hVar.f264625a) && Intrinsics.f(this.f264626b, hVar.f264626b) && Intrinsics.f(this.f264627c, hVar.f264627c);
    }

    public final int hashCode() {
        return this.f264627c.hashCode() + p.a.c(this.f264625a.hashCode() * 31, 31, this.f264626b);
    }
}
