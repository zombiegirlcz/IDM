package z03;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureConfig;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318180a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f318181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountId f318182c;

    public /* synthetic */ d(f0 f0Var, AccountId accountId) {
        this.f318181b = f0Var;
        this.f318182c = accountId;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f318180a) {
            case 0:
                f0 f0Var = this.f318181b;
                return new FeatureCommand(new CardDeliveryTroubleshootingFeatureConfig(f0Var.f150110a, CardDeliveryTroubleshootingFeatureFlow.JUNIOR_CARD_TROUBLESHOOTING, f0Var.u, this.f318182c, (uce.c) null, 40));
            default:
                String str = this.f318181b.f150110a;
                CardDeliveryTroubleshootingFeatureFlow cardDeliveryTroubleshootingFeatureFlow = CardDeliveryTroubleshootingFeatureFlow.CARD_TROUBLESHOOTING;
                AccountId accountId = this.f318182c;
                AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
                return new FeatureCommand(new CardDeliveryTroubleshootingFeatureConfig(str, cardDeliveryTroubleshootingFeatureFlow, joint != null ? joint.f51413b : null, accountId, (uce.c) null, 40));
        }
    }

    public /* synthetic */ d(f0 f0Var, f fVar, AccountId accountId) {
        this.f318181b = f0Var;
        this.f318182c = accountId;
    }
}
