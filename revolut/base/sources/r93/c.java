package r93;

import com.google.firebase.messaging.t;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import r38.m;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements k93.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l93.f f252497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u89.a f252498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q89.e f252499c;
    public final li0.b d;
    public final uq8.a e;
    public final tm.g f;

    public c(t actionDelegateFactory, l93.f revolutCardsInteractor, li0.b tapAndPayClient, q89.e onboardingInteractor, sh3.a checkoutInteractor, u89.a promptsRouter, uq8.a juniorTransferCommandFactory) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(promptsRouter, "promptsRouter");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f252497a = revolutCardsInteractor;
        this.f252498b = promptsRouter;
        this.f252499c = onboardingInteractor;
        this.d = tapAndPayClient;
        this.e = juniorTransferCommandFactory;
        this.f = actionDelegateFactory.g(new m(this, 23));
    }

    public static CompositeCommand a(AccountId accountId, String str) {
        FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277277c, null, null, 6)));
        CardScreenAction.Select select = new CardScreenAction.Select(str, 6, false, false);
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        return com.revolut.retail.core.navigation.a.c(featureCommand, new FeatureCommand(new CardsScreenFeatureConfig(null, joint != null ? joint.f51413b : null, null, accountId, select, 5)));
    }

    public static FeatureCommand b() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        n93.g action = (n93.g) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f.a(action);
    }
}
