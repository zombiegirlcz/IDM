package ak3;

import a0.d;
import aii.q;
import aii.r;
import aii.u;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.commodities.onboarding.api.navigation.CommoditiesOnboardingDestination$Risks;
import com.revolut.feature.onboarding.api.revolut_card_ready.RevolutCardReadyPromptDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.pockets.api.navigation.PocketsListDestination;
import com.revolut.feature.retail.savings.api.challenge.navigation.SavingsChallengePrizeCelebrationDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import d67.s;
import dii.f;
import dii.g;
import hda.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f5661b;

    public /* synthetic */ a(u uVar, int i) {
        this.f5660a = i;
        this.f5661b = uVar;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlow) {
        int i = this.f5660a;
        u uVar = this.f5661b;
        switch (i) {
            case 0:
                int i2 = b.f5662a;
                Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                knm.b.j(wrapperFlow.l1(), u0.b(((CommoditiesOnboardingDestination$Risks) uVar).f65948b));
                wrapperFlow.J2();
                return;
            case 1:
                g output = (g) rVar;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "flow");
                if (!(output instanceof f)) {
                    wrapperFlow.J2();
                    return;
                }
                KompotPricingPlanFeatureConfig.OutOfAppNavigation outOfAppNavigation = (KompotPricingPlanFeatureConfig.OutOfAppNavigation) uVar;
                if (!outOfAppNavigation.f102871c) {
                    wrapperFlow.J2();
                    return;
                } else {
                    knm.b.j(wrapperFlow.l1(), u0.b(new FinishCommand(-1, d.x("URL", outOfAppNavigation.f102870b), null, 4)));
                    return;
                }
            case 2:
                c result = (c) rVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "flowController");
                if (!(result instanceof hda.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                hda.b bVar = (hda.b) result;
                wrapperFlow.C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(bVar.f151397a, ((PocketsListDestination) uVar).f80783a.getAccountId(), true, false, bVar.f151398b, bVar.f151399c, true, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 3968)));
                return;
            case 3:
                int i3 = wc9.a.f296360a;
                Intrinsics.checkNotNullParameter((tc9.c) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "model");
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(((RevolutCardReadyPromptDestination) uVar).f78212b));
                return;
            default:
                d67.u output2 = (d67.u) rVar;
                Intrinsics.checkNotNullParameter(output2, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                if (output2 instanceof s) {
                    knm.b.j(wrapperFlow.l1(), new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((SavingsChallengePrizeCelebrationDestination) uVar).f83116c), null, null, null, 126))));
                }
                wrapperFlow.J2();
                return;
        }
    }
}
