package w5i;

import a09.z;
import c69.v;
import c8i.o;
import c8i.s;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import efm.r;
import io3.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public interface c {
    static r a(c cVar, Set allowedGroups, x5i.d dVar, AccountWrapper accountWrapper, xi0.b bVar, int i) {
        x5i.d dVar2 = (i & 2) != 0 ? null : dVar;
        AccountWrapper accountWrapper2 = (i & 4) != 0 ? null : accountWrapper;
        boolean z = (i & 8) != 0;
        h0 supportedCurrencies = h0.f322473a;
        xi0.b bVar2 = (i & 64) != 0 ? null : bVar;
        s sVar = (s) cVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        r rVarSwitchMap = pd.b.r(sVar.f22219a.e(new BalancesInteractor$InputData(k1j.d.RETAIL, l.CURRENT, allowedGroups, supportedCurrencies, null, null, null, null, 240), null), new o(sVar, dVar2, accountWrapper2, 0)).switchMap(new c64.a(new z(z, sVar, bVar2, 15), 9));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return nim.a.w(rVarSwitchMap, new v(sVar, 13));
    }
}
