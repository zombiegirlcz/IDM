package fsl;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.asset.trade.actions.ui.api.SwipeAssetTradeActionsApi$Toggles$SwipeActions;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final htl.f f137737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f137738b;

    public u(htl.f investOrdersCommonMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(investOrdersCommonMapper, "investOrdersCommonMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f137737a = investOrdersCommonMapper;
        this.f137738b = featureToggleInteractor;
    }

    public final List b(n state, j displayOptions) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        Data dataA = state.a();
        Data dataJ0 = state.J0();
        boolean zC = ((jte.d) this.f137738b).c(SwipeAssetTradeActionsApi$Toggles$SwipeActions.f86033c);
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        Data dataT = (dataA == null || dataJ0 == null) ? null : t1.t(dataA, dataJ0);
        List list = dataT != null ? (List) iii.c.f(dataT, new fo9.a(27), new fq7.j(6), new a4b.i(displayOptions, this, zC, 8)) : null;
        return list == null ? f0.f322471a : list;
    }
}
