package fdf;

import aii.e;
import bfl.g;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Disclaimer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f133932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f133934c;

    public a(g tradeSide, String defaultSelectedPocketId, List sectionsParams) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(defaultSelectedPocketId, "defaultSelectedPocketId");
        Intrinsics.checkNotNullParameter(sectionsParams, "sectionsParams");
        InvestAccountSelectorContract$Disclaimer.Commodities disclaimer = InvestAccountSelectorContract$Disclaimer.Commodities.f91708a;
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f133932a = tradeSide;
        this.f133933b = defaultSelectedPocketId;
        this.f133934c = sectionsParams;
    }

    public final String b() {
        return this.f133933b;
    }

    public final List c() {
        return this.f133934c;
    }

    public final g d() {
        return this.f133932a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        if (this.f133932a != aVar.f133932a || !Intrinsics.f(this.f133933b, aVar.f133933b) || !Intrinsics.f(this.f133934c, aVar.f133934c)) {
            return false;
        }
        Object obj3 = InvestAccountSelectorContract$Disclaimer.Commodities.f91708a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return InvestAccountSelectorContract$Disclaimer.Commodities.f91708a.hashCode() + p.a.d(p.a.c(this.f133932a.hashCode() * 31, 31, this.f133933b), 31, this.f133934c);
    }
}
