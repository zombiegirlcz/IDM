package igh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import jel.h0;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.j4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vfh.a f161224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3h.f f161225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f161226c;
    public final gte.a d;

    public z(vfh.a commonMapper, e3h.f historicalChartMapper, l80.e dateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(historicalChartMapper, "historicalChartMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f161224a = commonMapper;
        this.f161225b = historicalChartMapper;
        this.f161226c = dateProvider;
        this.d = featureToggleInteractor;
    }

    public static SmallActionButtonDelegate.Model a(jel.b0 b0Var) {
        h4 h4Var = h4.SEMIACCENT;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_private_equity_fund_details_performance_explore, null, null, 14);
        String str = b0Var.f173412b;
        h0 h0Var = b0Var.d;
        FundDetailsScreenContract$Action.NavigateToFundPerformance navigateToFundPerformance = new FundDetailsScreenContract$Action.NavigateToFundPerformance(str, h0Var != null ? h0Var.d : null);
        int i = R$attr.uikit_dp16;
        return new SmallActionButtonDelegate.Model("FUND_DETAILS_PERFORMANCE_EXPLORE_INSIGHTS", h4Var, null, null, textLocalisedClause, null, j4.f208300a, navigateToFundPerformance, null, i, i, i, i, 1368);
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("FUND_DETAILS_PERFORMANCE_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_private_equity_fund_details_performance_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(nel.n r19, jel.b0 r20) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: igh.z.c(nel.n, jel.b0):java.util.List");
    }
}
