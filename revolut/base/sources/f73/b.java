package f73;

import b93.e;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.l0;
import e93.v;
import efm.d0;
import h93.j0;
import kotlin.jvm.internal.Intrinsics;
import n63.i;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements i {
    public static FeatureCommand b(b bVar, e eVar, AccountId accountId, xfa.b bVar2, l0 l0Var, boolean z, NaviCommand naviCommand, v vVar, boolean z3, String str, h hVar, j0 j0Var, h93.l0 l0Var2, int i) {
        l0 l0Var3 = (i & 8) != 0 ? l0.DEFAULT : l0Var;
        boolean z4 = (i & 16) != 0 ? false : z;
        boolean z6 = (i & 32) != 0;
        v vVar2 = (i & 128) != 0 ? null : vVar;
        boolean z11 = (i & 256) != 0 ? false : z3;
        String str2 = (i & 512) != 0 ? null : str;
        h hVar2 = (i & 1024) != 0 ? null : hVar;
        j0 j0Var2 = (i & 2048) != 0 ? null : j0Var;
        h93.l0 l0Var4 = (i & 4096) != 0 ? null : l0Var2;
        bVar.getClass();
        return new FeatureCommand(new CardDesignFeatureConfig(eVar, accountId, null, null, null, z11, str2, z4, z6, null, bVar2, hVar2, naviCommand, vVar2, null, null, l0Var3, j0Var2, l0Var4, null, null, false, false, null, 523053370));
    }

    public final ufm.b c(xfa.b bVar, NaviCommand naviCommand, boolean z) {
        ufm.b bVarM = d0.m(b(this, z ? e.FREELANCER : e.FREELANCER_VIRTUAL, AccountId.Personal.f51414a, bVar, null, false, naviCommand, null, false, null, null, null, null, 8120));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b d(xfa.b bVar, NaviCommand naviCommand) {
        ufm.b bVarM = d0.m(b(this, e.PHYSICAL, AccountId.Personal.f51414a, bVar, null, false, naviCommand, null, false, null, null, null, h93.l0.CRYPTO, 4024));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b e(xfa.b bVar, NaviCommand naviCommand) {
        ufm.b bVarM = d0.m(b(this, e.VIRTUAL, AccountId.Personal.f51414a, bVar, l0.CRYPTO, true, naviCommand, null, false, null, null, null, h93.l0.CRYPTO, 3744));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b f(xfa.b bVar, AccountId accountId, NaviCommand naviCommand, h93.l0 l0Var) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.b bVarM = d0.m(b(this, e.DISPOSABLE, accountId, bVar, null, false, naviCommand, null, false, null, null, null, l0Var, 3992));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b g(xfa.b bVar, NaviCommand naviCommand) {
        ufm.b bVarM = d0.m(new FeatureCommand(new CardDesignFeatureConfig(e.VIRTUAL, null, null, null, null, false, null, false, false, null, bVar, null, naviCommand, null, null, null, null, null, null, null, null, false, false, null, 536833790)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ufm.b h(xfa.b bVar, AccountId accountId, String str, NaviCommand naviCommand, v vVar, h hVar, h93.l0 l0Var) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.b bVarM = d0.m(b(this, e.PHYSICAL, accountId, bVar, null, false, naviCommand, vVar, false, str, hVar, null, l0Var, 2360));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
