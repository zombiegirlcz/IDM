package u4i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeeBreakdownScreenContract$InputData f277366a;

    public v(FeeBreakdownScreenContract$InputData inputData, e itemsBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemsBuilder, "itemsBuilder");
        this.f277366a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f277353a, new u4e.i(this, 4), new u(0), new tch.c(this, 21));
        Breakdown.Fee breakdown = this.f277366a.f97171a;
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Clause f97038b = breakdown.getF97038b();
        if (f97038b == null) {
            f97038b = new TextLocalisedClause(R$string.market_data_fees_breakdown_title, null, null, 14);
        }
        return new cii.b(null, list, new lw0.a(f97038b, null, null, null, false, 30));
    }
}
