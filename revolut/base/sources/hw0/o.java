package hw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f156015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f156016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f156017c;
    public final TextLocalisedClause d;

    public o(xi0.b currency, xi0.b referencedCurrency, TextLocalisedClause takeProfit, TextLocalisedClause stopLoss) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        Intrinsics.checkNotNullParameter(takeProfit, "takeProfit");
        Intrinsics.checkNotNullParameter(stopLoss, "stopLoss");
        this.f156015a = currency;
        this.f156016b = referencedCurrency;
        this.f156017c = takeProfit;
        this.d = stopLoss;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f156015a, oVar.f156015a) && Intrinsics.f(this.f156016b, oVar.f156016b) && this.f156017c.equals(oVar.f156017c) && this.d.equals(oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(h30.l.j(this.f156016b, this.f156015a.hashCode() * 31, 31), 31, this.f156017c);
    }
}
