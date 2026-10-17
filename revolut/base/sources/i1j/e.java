package i1j;

import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m2j.j;
import m2j.q;
import w4l.k;
import zhm.h0;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes10.dex */
public interface e {
    static r a(j jVar, d groupType, k loadingStrategy) {
        r rVarF;
        k1j.d walletScope = k1j.d.RETAIL;
        q qVar = jVar.f202045a;
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        h0 h0Var = h0.f322473a;
        BalancesInteractor$InputData balancesInteractor$InputData = new BalancesInteractor$InputData(walletScope, null, h0Var, h0Var, h0Var, h0Var, null, null, 192);
        if (groupType instanceof c) {
            k1j.a aVar = k1j.a.VAULTS;
            k1j.a aVar2 = k1j.a.POCKETS;
            rVarF = qVar.h(BalancesInteractor$InputData.a(balancesInteractor$InputData, z0.i(aVar, null)), loadingStrategy, null);
        } else {
            if (!groupType.equals(b.f157643a)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarF = qVar.f(BalancesInteractor$InputData.a(balancesInteractor$InputData, y0.b(k1j.a.SAVINGS)), loadingStrategy);
        }
        return nim.a.w(j.d(rVarF), new m2j.e(jVar, 0));
    }

    static r b(e eVar, BalancesInteractor$InputData inputData, xi0.b bVar, a aVar, int i) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        j jVar = (j) eVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return pd.b.s(jVar.e(inputData, aVar), new lul.d(jVar, bVar, 13));
    }
}
