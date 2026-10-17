package ay2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {
    public final TextLocalisedClause a(n10.b cardType) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        int i = i.f11040a[cardType.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.card_design_catalogue_more_cards_physical, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.card_design_catalogue_more_cards_virtual, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.card_design_catalogue_more_cards_disposable, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
