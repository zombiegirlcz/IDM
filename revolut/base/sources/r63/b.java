package r63;

import b93.e;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_management.api.CardManagementKompotFeatureConfig;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureConfig;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureFlow;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.d;
import e93.n;
import h93.f0;
import h93.h0;
import ip0.y10;
import ip0.z10;
import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import uce.c;
import w01.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements j63.a {
    @Override // j63.a
    public final boolean a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return true;
    }

    @Override // j63.a
    public final ParcelableDestination b(f0 card, d cardDesign, n63.b flowName, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        n nVar = cardDesign.i;
        if (nVar != null) {
            return new CardOrderFlowDestination.CardPersonalisation(nVar, false, h0.g(card, cardDesign), null, null, null, null, null, accountId, null, null, null, 15572);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // j63.a
    public final NaviCommand c(f0 card, String str, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new FeatureCommand(new CardDeliveryTroubleshootingFeatureConfig(card.f150110a, CardDeliveryTroubleshootingFeatureFlow.CARD_TROUBLESHOOTING, str, accountId, (c) null, 32));
    }

    @Override // j63.a
    public final j d(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter("WARNING_PIN_ACTIVATION", "id");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cards_home_item_full_activation_pin_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cards_home_item_full_activation_pin_subtitle, null, null, 14);
        z10 z10Var = sa.Companion;
        ResourceImage resourceImage = h.f293612a;
        Intrinsics.checkNotNullParameter(z10Var, "<this>");
        return new sa("WARNING_PIN_ACTIVATION", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, (List) null, false, (Image) h.f293613b, (y10) null, (Object) null, 4040);
    }

    @Override // j63.a
    public final Clause e(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new TextLocalisedClause(R$string.card_action_design_rejected_description, null, null, 14);
    }

    @Override // j63.a
    public final boolean f(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return true;
    }

    @Override // j63.a
    public final KompotDestination g(f0 card, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new CardManagementKompotFeatureConfig.SettingsDestination(card.f150110a, accountId, null, null, 12);
    }

    @Override // j63.a
    public final NaviCommand h(e cardType, AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new CardDesignFeatureConfig(cardType, accountId, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870906)));
    }
}
