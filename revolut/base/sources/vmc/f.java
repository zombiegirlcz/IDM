package vmc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends n implements glc.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f290560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f290561m;

    public f(j60.a bottomExpandableDialogControllerExtension, b roboTransactionDetailsDialogMapper) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(roboTransactionDetailsDialogMapper, "roboTransactionDetailsDialogMapper");
        this.f290560l = bottomExpandableDialogControllerExtension;
        this.f290561m = roboTransactionDetailsDialogMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        glc.h parcel = (glc.h) obj2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel == null) {
            hx7.e.n(new IllegalArgumentException("Unknown parcel: " + parcel));
        } else if (parcel instanceof glc.e) {
            A2(new BridgeDestination(new FeatureCommand(new AddMoneyFeatureConfig.ManageRecurringFunding(((glc.e) parcel).f144603a, com.revolut.feature.wealth.api.declaration.a.ROBO))));
        } else {
            boolean z = parcel instanceof glc.g;
            j60.a aVar = this.f290560l;
            if (z) {
                this.f290561m.getClass();
                t tVar = new t(new TextLocalisedClause(R$string.wealth_robo_transactions_dividend_withholding_tax, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_transactions_dividend_withholding_tax_info, null, null, 14), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("transaction-withholding-tax-info-cta-button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.wealth_robo_common_got_it, null, null, 14), false, null, null, glc.f.f144604a, null, 744);
                int i = R$attr.uikit_dp24;
                yp0.b.l(model, i, i, 0, 0, null, false, 60);
                aVar.x(new y(u.c(model), tVar, l.WINDOW, null, null, null, 1016));
            } else {
                if (!(parcel instanceof glc.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                j60.a.v(aVar, false, null, 3);
            }
        }
        return Unit.f186387a;
    }
}
