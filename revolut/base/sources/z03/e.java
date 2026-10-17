package z03;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.card_management.impl.ui.replace_reasons.provider.CardReplaceExpectationsData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import h93.j0;
import h93.l0;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements c {
    @Override // z03.c
    public final CardReplaceExpectationsData a(f0 card, AccountId accountId, wy2.d reason, e93.f fVar) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new CardReplaceExpectationsData(reason, card.f150110a, com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277276b, null, null, 6))), u0.f(new CardDesignCatalogueDestination(null, c93.e.PHYSICAL, j0.YOUTH, l0.DEBIT, null, null, card.u, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777136))));
    }

    @Override // z03.c
    public final ufm.c b(f0 card, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.c cVar = new ufm.c(new d(card, accountId), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
