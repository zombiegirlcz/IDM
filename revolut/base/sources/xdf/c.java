package xdf;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f304425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f304426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f304427c;
    public final e d;

    public c(xi0.b currency, a balance) {
        int iC = currency.c();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balance, "balance");
        e assetDetails = e.f304431a;
        Intrinsics.checkNotNullParameter(assetDetails, "assetDetails");
        this.f304425a = currency;
        this.f304426b = balance;
        this.f304427c = iC;
        this.d = assetDetails;
        new Asset(f8l.c.FIAT, currency.f306286a, currency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f304425a, cVar.f304425a) && Intrinsics.f(this.f304426b, cVar.f304426b) && this.f304427c == cVar.f304427c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f304427c, (this.f304426b.f304422a.hashCode() + (this.f304425a.hashCode() * 31)) * 31, 31);
    }
}
