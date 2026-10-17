package h73;

import b93.e;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
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
import h93.j0;
import h93.l0;
import ip0.y10;
import ip0.z10;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import w01.h;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j63.a {
    @Override // j63.a
    public final boolean a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return false;
    }

    @Override // j63.a
    public final ParcelableDestination b(f0 card, d cardDesign, n63.b flowName, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        n nVar = cardDesign.i;
        if (nVar != null) {
            return new CardOrderFlowDestination.CardPersonalisation(nVar, false, h0.g(card, cardDesign), null, null, null, null, null, accountId, null, null, null, 15568);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // j63.a
    public final NaviCommand c(f0 card, String str, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new FeatureCommand(new CardDeliveryTroubleshootingFeatureConfig(card.f150110a, CardDeliveryTroubleshootingFeatureFlow.JUNIOR_CARD_TROUBLESHOOTING, card.u, accountId, (uce.c) null, 32));
    }

    @Override // j63.a
    public final j d(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter("WARNING_PIN_ACTIVATION", "id");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cards_home_item_full_activation_pin_title_junior, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cards_home_item_full_activation_pin_subtitle_junior, null, null, 14);
        z10 z10Var = sa.Companion;
        ResourceImage resourceImage = h.f293612a;
        Intrinsics.checkNotNullParameter(z10Var, "<this>");
        return new sa("WARNING_PIN_ACTIVATION", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, (List) null, false, (Image) h.f293613b, (y10) null, (Object) null, 4040);
    }

    @Override // j63.a
    public final Clause e(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new TextLocalisedClause(R$string.card_action_design_rejected_description_junior, null, null, 14);
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
        return new CardManagementKompotFeatureConfig.SettingsDestination(card.f150110a, null, wy2.a.JUNIOR, null, 10);
    }

    @Override // j63.a
    public final NaviCommand h(e cardType, AccountId accountId, String str) {
        c93.e eVar;
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (str == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("walletId is empty for junior card flow");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return new FinishCommand(null, null, null, 7);
        }
        switch (b.f149840a[cardType.ordinal()]) {
            case 1:
                eVar = c93.e.PHYSICAL;
                break;
            case 2:
                eVar = c93.e.VIRTUAL;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Junior card shouldn't be of type = " + cardType);
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                eVar = c93.e.PHYSICAL;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new CardDesignCatalogueDestination(null, eVar, j0.YOUTH, l0.DEBIT, null, null, str, null, false, false, null, null, null, null, null, null, null, null, false, null, null, 16777136)));
    }
}
