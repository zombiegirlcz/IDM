package fs5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto_feed.dependencies.fiatbalances.RevolutXFiatBalancesContract$RevolutXFiatBalanceData;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$Destination;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import efm.r;
import fnc.s;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mp.p;
import rd0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends pr5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f137594l;

    public b(s listItemsProvider) {
        Intrinsics.checkNotNullParameter(listItemsProvider, "listItemsProvider");
        this.f137594l = listItemsProvider;
    }

    @Override // pr5.a
    public final void Z2(RowDelegate.Model model) {
        Object obj2 = model != null ? model.u : null;
        if (obj2 instanceof RevolutXFiatBalancesContract$RevolutXFiatBalanceData) {
            RevolutXFiatBalancesContract$RevolutXFiatBalanceData revolutXFiatBalancesContract$RevolutXFiatBalanceData = (RevolutXFiatBalancesContract$RevolutXFiatBalanceData) obj2;
            A2(new RevolutXFiatBalancesDetailsController$Destination(new RevolutXFiatBalancesDetailsController$InputData(revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71355a, new RevolutXFiatBalancesDetailsController$InputData.Stats(revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71356b, revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71357c, revolutXFiatBalancesContract$RevolutXFiatBalanceData.d, revolutXFiatBalancesContract$RevolutXFiatBalanceData.e))));
        }
    }

    @Override // pr5.a
    public final vkm.d b3() {
        p pVar = (p) this.f137594l.f136657b;
        xv5.c cVar = (xv5.c) pVar.f207710c;
        int i = 0;
        r rVarSwitchMap = xv5.c.b(cVar).switchMap(new d(i, new c(pVar, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarSwitchMap2 = xv5.c.b(cVar).switchMap(new fjj.b(new c(pVar, i), 29));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        return e.b(nim.a.w(u1.d(rVarSwitchMap, rVarSwitchMap2), new fo9.a(20)));
    }
}
