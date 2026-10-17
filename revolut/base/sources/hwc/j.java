package hwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.wallets.api.module.WalletLimit;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    public final RowDelegate.Model a(String str, int i, int i2, WalletLimit.CounterLimit counterLimit) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i3 = R$string.security_hub_wealth_protection_limit_spent_ratio;
        dj0.d dVar = counterLimit.f94846c;
        MoneyClause moneyClauseA = rwc.b.a(dVar);
        dj0.d dVar2 = counterLimit.e;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new GlyphImage(i2, null, null, 6), null, rwc.c.a(dVar.f115082a, dVar2.f115082a), false, null, false, 58), textLocalisedClause, null, 0, new TextLocalisedClause(i3, v.k(moneyClauseA, rwc.b.a(dVar2)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, counterLimit, null, 0, 0, 0, 0, 532676568);
    }
}
