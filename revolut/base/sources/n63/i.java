package n63;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import h93.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public interface i {
    static ufm.b a(f73.b bVar, xfa.b bVar2, AccountId accountId, String str, NaviCommand naviCommand, pi3.h hVar, l0 l0Var, int i) {
        String str2 = (i & 4) != 0 ? null : str;
        e93.l0 virtualCardLabelType = e93.l0.DEFAULT;
        l0 l0Var2 = (i & 128) != 0 ? null : l0Var;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
        ufm.b bVarM = d0.m(f73.b.b(bVar, b93.e.VIRTUAL, accountId, bVar2, virtualCardLabelType, false, naviCommand, null, false, str2, hVar, null, l0Var2, 2464));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
