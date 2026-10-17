package k24;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private d() {
    }

    public static Map a(cl4.d cashback) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        ju3.a aVar = ju3.a.IDENTITY_VERIFICATION;
        j24.b.Companion.getClass();
        Pair pair = new Pair(aVar, j24.b.f170675b);
        ju3.a aVar2 = ju3.a.CARD_ORDERING_INTRO;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_ordering_intro_title, null, null, 14);
        if (cashback instanceof cl4.b) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_ordering_intro_subtitle_no_cashback, null, null, 14);
        } else {
            if (!(cashback instanceof cl4.c)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_ordering_intro_subtitle, u.c(new TextClause(((cl4.c) cashback).f24932a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        return r0.k(pair, new Pair(aVar2, new CardOrderingIntroScreenConfig(textLocalisedClause2, textLocalisedClause)), new Pair(ju3.a.CARD_ORDERING_SPINNER, new CardOrderingLoadingScreenConfig(new TextLocalisedClause(R$string.credit_card_ordering_loading_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_ordering_loading_desription, null, null, 14))), new Pair(ju3.a.MANUAL_UNDERWRITING, j24.b.D));
    }
}
