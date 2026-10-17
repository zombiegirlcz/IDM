package wkf;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import elf.s0;
import ip0.pb0;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends n implements s0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f298275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f298276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xh9.a f298277n;
    public final yh9.b o;

    public d(h0 commonDataSource, m1 juniorDataSource, xh9.a payLaterInteractor, yh9.b payLaterInstalmentItemMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterInstalmentItemMapper, "payLaterInstalmentItemMapper");
        this.f298275l = commonDataSource;
        this.f298276m = juniorDataSource;
        this.f298277n = payLaterInteractor;
        this.o = payLaterInstalmentItemMapper;
    }

    public static aim.e Z2() {
        aim.e eVarB = u.b();
        eVarB.add(b3(null, false));
        eVarB.add(new pb0("id_partial_repayment"));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public static ListSubheaderDelegate.Model b3(Object obj2, boolean z) {
        return new ListSubheaderDelegate.Model("ID_PAY_LATER_REPAYMENTS", (Image) null, (Clause) new TextLocalisedClause(R$string.transactionUI_transaction_pay_later_repayments_covered, null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R.string.common_action_see_all, null, null, 14) : null), z, obj2, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_PAY_LATER_REPAYMENTS")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            A2(new BridgeDestination(new FeatureCommand(new PayLaterKompotFeatureConfig.PartialRepayments((String) obj2))));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
