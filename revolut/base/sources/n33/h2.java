package n33;

import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h2 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f211731b;

    public /* synthetic */ h2(r2 r2Var, int i) {
        this.f211730a = i;
        this.f211731b = r2Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f211730a) {
            case 0:
                this.f211731b.f211802p.onNext(r2.c(new ft3.a1(grl.r2.CARD_ORDERING, null, ft3.z0.BALANCE_TRANSFER, null, null, 26)));
                break;
            case 1:
                r2 r2Var = this.f211731b;
                s2 s2Var = (s2) r2Var.e;
                Object finishCommand = (NaviCommand) ((od0.i) s2Var.f.getValue(s2Var, s2.f211807p[4]).get()).f224257a;
                if (finishCommand == null) {
                    finishCommand = new FinishCommand(null, null, null, 7);
                }
                r2Var.f211802p.onNext(finishCommand);
                break;
            case 2:
                this.f211731b.f211802p.onNext(new FeatureCommand(DisclosuresFeatureConfig.CryptoDisclosuresFeatureConfig.f95195a));
                break;
            case 3:
                this.f211731b.f211802p.onNext(r2.c(new ft3.a1(grl.r2.CARD_ORDERING, null, null, null, null, 30)));
                break;
            default:
                this.f211731b.f211802p.onNext(gc0.c.f(new KompotOverlayFeatureConfig(new JuniorOnboardingDestination.Creation((mh8.h) null, 3), yhi.b.SOLID, (Integer) null, 12)));
                break;
        }
    }
}
