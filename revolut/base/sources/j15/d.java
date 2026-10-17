package j15;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.help.api.dialog_factory.GetHelpDialogFactory$Result;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.d1;
import ft3.j1;
import go.g;
import iz1.p;
import k15.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import ux4.k;
import ux4.l;
import ux4.m;
import xq3.q;
import yji.n;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends n implements f15.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g15.a f170119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f170120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ang.f f170121n;

    public d(g15.a getHelpDialogFactory, f forbearanceAvailabilityInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(getHelpDialogFactory, "getHelpDialogFactory");
        Intrinsics.checkNotNullParameter(forbearanceAvailabilityInteractor, "forbearanceAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f170119l = getHelpDialogFactory;
        this.f170120m = forbearanceAvailabilityInteractor;
        this.f170121n = userInteractor;
    }

    @Override // f15.a
    public final void O(m helpRequest) {
        Intrinsics.checkNotNullParameter(helpRequest, "helpRequest");
        V2(new p(this, helpRequest, null, 3), new yi5.b(29));
    }

    @Override // f15.a
    public final boolean O1(qv0.p parcelItem) {
        Flow flowF;
        Intrinsics.checkNotNullParameter(parcelItem, "parcelItem");
        Object f55076n = parcelItem.getF55076n();
        if (f55076n instanceof GetHelpDialogFactory$Result.Faq) {
            y(((GetHelpDialogFactory$Result.Faq) f55076n).f70002a);
            return true;
        }
        if (!(f55076n instanceof GetHelpDialogFactory$Result.FinancialDifficulties)) {
            return false;
        }
        k creditFacility = ((GetHelpDialogFactory$Result.FinancialDifficulties) f55076n).f70003a;
        up3.b bVar = this.f170120m.f180104a;
        Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
        int i = k15.e.f180103a[creditFacility.f283872b.ordinal()];
        int i2 = 3;
        Continuation continuation = null;
        if (i == 1) {
            flowF = ((q) bVar).f(mif.a.m(d1.Companion, j1.FTC_FORBEARANCE, null));
        } else if (i == 2) {
            flowF = ((q) bVar).f(mif.a.m(d1.Companion, j1.CC_FORBEARANCE, null));
        } else if (i == 3) {
            flowF = ((q) bVar).f(new d1(j1.MORTGAGE_RENEGOTIATION, gt3.e.FORBEARANCE, null));
        } else {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            flowF = new g(new Data(Boolean.FALSE, null, false, 6, null), 2);
        }
        n.l2(this, rd0.e.e(mo3.a.g(flowF, null, new j0g.b(2), 1), h0.f322473a, new i23.c(i2, 3, continuation)), null, new c(creditFacility, this, null), 3);
        return true;
    }

    @Override // f15.a
    public final l a1(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return com.bumptech.glide.d.n(countryCode) ? l.FAQ : l.FAQ_AND_FINANCIAL_DIFFICULTIES;
    }

    @Override // f15.a
    public final void y(String str) {
        if (str == null) {
            str = "category.credit";
        }
        A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter(str, 2))));
    }
}
