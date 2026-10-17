package qwk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import jel.z2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static TextLocalisedClause a(z2 recommendationConsensus) {
        Intrinsics.checkNotNullParameter(recommendationConsensus, "recommendationConsensus");
        int i = a.f249961a[recommendationConsensus.d.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_consensus_buy, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_consensus_hold, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_consensus_sell, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
