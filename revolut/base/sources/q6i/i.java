package q6i;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static v a(AccountSource source, dj0.d withdrawable, dj0.d balance, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(withdrawable, "withdrawable");
        Intrinsics.checkNotNullParameter(balance, "balance");
        return (z && withdrawable.i(balance)) ? new s(source) : t.f242636a;
    }

    public static Clause b(dj0.d withdrawable, dj0.d balance, boolean z) {
        Float fValueOf = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(withdrawable, "withdrawable");
        Intrinsics.checkNotNullParameter(balance, "balance");
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.move_money_spot_margin_collateral_amount_subtitle, zhm.u.c(new MoneyClause(withdrawable, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.move_money_amount_screen_balance, zhm.u.c(new MoneyClause(balance, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        if (!z || !withdrawable.i(balance)) {
            return textLocalisedClause;
        }
        List listK = zhm.v.k(textLocalisedClause, new ImageClause(R$drawable.uikit_icn_16_info_outline, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
