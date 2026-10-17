package tpc;

import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import jlc.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m4f.b f273338l;

    public h(m4f.b wealthAddMoneyCommandProvider) {
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        this.f273338l = wealthAddMoneyCommandProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g parcel = (g) obj2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel == null) {
            hx7.e.n(new IllegalArgumentException("Unknown parcel: " + parcel));
        } else if (parcel instanceof e) {
            A2(new BridgeDestination(new FeatureCommand(new AddMoneyFeatureConfig.ManageRecurringFunding(((e) parcel).f273336a.f162221b.f95703c, com.revolut.feature.wealth.api.declaration.a.ROBO))));
        } else {
            if (!(parcel instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) d0.d0(((f) parcel).f273337a);
            if (roboPortfolioInfo != null) {
                A2(u0.b(b3f.b.b(this.f273338l, new TransferSubjectId.Portfolio(roboPortfolioInfo.f95703c), WealthAccountType.ROBO, b3f.a.RECURRING, null, 8)));
            }
        }
        return Unit.f186387a;
    }
}
