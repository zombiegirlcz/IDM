package bzh;

import aw0.j8;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature_crypto_order_flow.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public final j8 a(kyh.e params) {
        int i;
        Clause clause;
        Clause compositeClause;
        Intrinsics.checkNotNullParameter(params, "params");
        kyh.h hVar = params.f190903a;
        kyh.d dVar = params.f190904b;
        boolean z = dVar != null ? dVar.d : false;
        wd6.e eVar = hVar.f190906a;
        xi0.b bVar = hVar.f190907b;
        int i2 = i.f20036a[eVar.ordinal()];
        if (i2 == 1) {
            i = R$string.cryptobuysell_editor_buy;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.cryptobuysell_editor_sell;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
        if (dVar != null) {
            wd6.e eVar2 = hVar.f190906a;
            StakingPocket stakingPocket = params.f190905c;
            boolean z3 = params.d;
            Float fValueOf = Float.valueOf(14.0f);
            if (eVar2 == wd6.e.BUY) {
                compositeClause = null;
            } else {
                int i3 = dVar.f190900a == kyh.f.EXCEEDED_BALANCE ? R$attr.uikit_colorRed : R$attr.uikit_colorGreyTone50;
                MoneyClause moneyClause = new MoneyClause(new dj0.d(dVar.f190902c, dVar.f190901b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                if (stakingPocket != null || z || z3) {
                    List listK = v.k(new TextLocalisedClause(R$string.cryptobuysell_editor_navbar_description, u.c(moneyClause), null, 12), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(i3), fValueOf, fValueOf, 16));
                    Custom custom = new Custom(Integer.valueOf(i3), false, null, false, null, 254);
                    m70.a.t(t0.f186434a);
                    compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
                } else {
                    compositeClause = new TextLocalisedClause(R$string.cryptobuysell_editor_navbar_description, u.c(moneyClause), new Custom(Integer.valueOf(i3), false, null, false, null, 254), 8);
                }
            }
            clause = compositeClause;
        } else {
            clause = null;
        }
        return new j8(textLocalisedClause, clause, new CurrencyImage(bVar.f306286a, params.e, (TextLocalisedClause) null, 10), null, 24);
    }
}
