package sz2;

import android.content.Context;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_management.api.CardManagementApi$Toggles;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.card_management.api.CardManagementKompotFeatureConfig;
import com.revolut.feature.card_management.api.replace.CardReplaceDestination;
import com.revolut.feature.card_management.impl.ui.expectations.ExpectationManagementContract$Configuration;
import com.revolut.feature.card_management.impl.ui.replace_reasons.CardSelectReplaceReasonContract;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f266746a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f266746a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CardManagementFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        CardManagementFeatureConfig config = (CardManagementFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CardManagementFeatureConfig.Settings) {
            CardManagementFeatureConfig.Settings settings = (CardManagementFeatureConfig.Settings) config;
            navigator.c(new FeatureCommand(new CardManagementKompotFeatureConfig.Settings(settings.f64781a, settings.f64782b, wy2.a.DEFAULT, settings.f64783c)));
            return;
        }
        if (config instanceof CardManagementFeatureConfig.JuniorSettings) {
            navigator.c(new FeatureCommand(new CardManagementKompotFeatureConfig.Settings(((CardManagementFeatureConfig.JuniorSettings) config).f64780a, AccountId.Personal.f51414a, wy2.a.JUNIOR, wy2.b.DEFAULT)));
            return;
        }
        boolean z = config instanceof CardManagementFeatureConfig.CardSelectReplaceReason;
        gte.a aVar = this.f266746a;
        if (z) {
            if (((d) aVar).c(CardManagementApi$Toggles.CardReplaceFlowKompotMigration.f64773c)) {
                CardManagementFeatureConfig.CardSelectReplaceReason cardSelectReplaceReason = (CardManagementFeatureConfig.CardSelectReplaceReason) config;
                navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardReplaceDestination(new CardReplaceDestination.StartType.SelectReason(cardSelectReplaceReason.f64778a, cardSelectReplaceReason.f64779b)), false, (Integer) null, 0, 61)));
                return;
            } else {
                CardSelectReplaceReasonContract.Companion.getClass();
                CardManagementFeatureConfig.CardSelectReplaceReason cardSelectReplaceReason2 = (CardManagementFeatureConfig.CardSelectReplaceReason) config;
                navigator.c(new ActivityNavigateCommand(CardSelectReplaceReasonContract.f64924a, new CardSelectReplaceReasonContract.Configuration(cardSelectReplaceReason2.f64778a, cardSelectReplaceReason2.f64779b), null, null, 0, null, null, null, null, false, 1020));
                return;
            }
        }
        if (!(config instanceof CardManagementFeatureConfig.CardReplaceExpectations)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((d) aVar).c(CardManagementApi$Toggles.CardReplaceFlowKompotMigration.f64773c)) {
            CardManagementFeatureConfig.CardReplaceExpectations cardReplaceExpectations = (CardManagementFeatureConfig.CardReplaceExpectations) config;
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardReplaceDestination(new CardReplaceDestination.StartType.Expectations(cardReplaceExpectations.f64775a, cardReplaceExpectations.f64776b, cardReplaceExpectations.f64777c)), false, (Integer) null, 0, 61)));
            return;
        }
        c03.d.Companion.getClass();
        CardManagementFeatureConfig.CardReplaceExpectations cardReplaceExpectations2 = (CardManagementFeatureConfig.CardReplaceExpectations) config;
        navigator.c(new ActivityNavigateCommand(c03.a.f20121b, new ExpectationManagementContract$Configuration(cardReplaceExpectations2.f64775a, cardReplaceExpectations2.f64776b, cardReplaceExpectations2.f64777c), null, null, 0, null, null, null, null, false, 1020));
    }
}
