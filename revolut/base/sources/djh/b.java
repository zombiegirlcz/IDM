package djh;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ybl.g;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f115388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f115389c;
    public final a d;

    public b(List accounts, TradingLegalEntityInformation tradingLegalEntityInformation, g productGroupsAvailability, a upsellingState) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(productGroupsAvailability, "productGroupsAvailability");
        Intrinsics.checkNotNullParameter(upsellingState, "upsellingState");
        this.f115387a = accounts;
        this.f115388b = tradingLegalEntityInformation;
        this.f115389c = productGroupsAvailability;
        this.d = upsellingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f115387a, bVar.f115387a) && Intrinsics.f(this.f115388b, bVar.f115388b) && Intrinsics.f(this.f115389c, bVar.f115389c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d.f115386a) + p.a.e((this.f115388b.hashCode() + (this.f115387a.hashCode() * 31)) * 31, 31, this.f115389c.f312386a);
    }
}
