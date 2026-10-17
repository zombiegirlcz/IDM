package ry2;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.youTransactor.uCube.rpc.Constants;
import h93.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rrd.l;
import rxb.f;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends my2.a {
    public final f73.c d;
    public final li0.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f73.c cardsFactory, li0.b tapAndPayClient, ln.a navigationDispatcher, s70.a intentProvider) {
        super(navigationDispatcher, intentProvider);
        Intrinsics.checkNotNullParameter(cardsFactory, "cardsFactory");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.d = cardsFactory;
        this.e = tapAndPayClient;
    }

    @Override // my2.a, jy2.j
    public final efm.b B0(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        pfm.a aVar = new pfm.a(new ufm.c(new pu9.a(this, card, 19), 2), new f(17, new l(this, 23)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // jy2.j
    public final efm.b V(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), this.d.c(new CardScreenAction.Select(card.f150110a, 2, false, true), AccountId.Personal.f51414a));
        boolean zJ = card.J();
        ln.a aVar = this.f210298b;
        return (zJ && cp5.c.j(this.e) && card.f150125x) ? aVar.a(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new AddToGooglePayFeatureConfig(card, compositeCommandC, compositeCommandC, new NavigationIconConfig(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), compositeCommandC), null, false, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION)))) : aVar.a(compositeCommandC);
    }
}
