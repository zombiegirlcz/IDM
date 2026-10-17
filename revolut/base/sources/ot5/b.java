package ot5;

import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj3.a f229544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jt5.a f229545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PocketBalancesWithSum f229546c;
    public final CryptoCommodityPositions d;
    public final ArrayList e;

    public b(uj3.a commodityFeatureState, jt5.a portfolioBalance, PocketBalancesWithSum pocketBalancesWithSum, CryptoCommodityPositions positions, ArrayList midRates) {
        Intrinsics.checkNotNullParameter(commodityFeatureState, "commodityFeatureState");
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        Intrinsics.checkNotNullParameter(pocketBalancesWithSum, "pocketBalancesWithSum");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(midRates, "midRates");
        this.f229544a = commodityFeatureState;
        this.f229545b = portfolioBalance;
        this.f229546c = pocketBalancesWithSum;
        this.d = positions;
        this.e = midRates;
    }

    public static b a(b bVar, PocketBalancesWithSum pocketBalancesWithSum) {
        uj3.a commodityFeatureState = bVar.f229544a;
        jt5.a portfolioBalance = bVar.f229545b;
        CryptoCommodityPositions positions = bVar.d;
        ArrayList midRates = bVar.e;
        Intrinsics.checkNotNullParameter(commodityFeatureState, "commodityFeatureState");
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        Intrinsics.checkNotNullParameter(pocketBalancesWithSum, "pocketBalancesWithSum");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(midRates, "midRates");
        return new b(commodityFeatureState, portfolioBalance, pocketBalancesWithSum, positions, midRates);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f229544a == bVar.f229544a && Intrinsics.f(this.f229545b, bVar.f229545b) && Intrinsics.f(this.f229546c, bVar.f229546c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f229546c.hashCode() + ((this.f229545b.hashCode() + (this.f229544a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
