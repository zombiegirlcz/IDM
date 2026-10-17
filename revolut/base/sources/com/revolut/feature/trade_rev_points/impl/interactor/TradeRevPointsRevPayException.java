package com.revolut.feature.trade_rev_points.impl.interactor;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/interactor/TradeRevPointsRevPayException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsRevPayException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f91111a;

    public TradeRevPointsRevPayException(TextLocalisedClause textLocalisedClause) {
        this.f91111a = textLocalisedClause;
    }
}
