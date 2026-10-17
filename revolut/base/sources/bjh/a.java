package bjh;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ybl.g;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f15672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f15673c;

    public a(ArrayList accounts, TradingLegalEntityInformation tradingLegalEntityInformation, g productGroupsAvailability) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(productGroupsAvailability, "productGroupsAvailability");
        this.f15671a = accounts;
        this.f15672b = tradingLegalEntityInformation;
        this.f15673c = productGroupsAvailability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f15671a.equals(aVar.f15671a) && Intrinsics.f(this.f15672b, aVar.f15672b) && Intrinsics.f(this.f15673c, aVar.f15673c);
    }

    public final int hashCode() {
        return this.f15673c.f312386a.hashCode() + ((this.f15672b.hashCode() + (this.f15671a.hashCode() * 31)) * 31);
    }
}
