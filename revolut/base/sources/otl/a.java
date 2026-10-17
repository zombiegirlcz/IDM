package otl;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import d1h.h;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrdersListFeatureContract$InputData f229747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f229748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f229749c;
    public final gte.a d;

    public a(InvestOrdersListFeatureContract$InputData inputData, q1 wealthDisclaimersMapper, h wealthRemoteDisclaimersMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f229747a = inputData;
        this.f229748b = wealthDisclaimersMapper;
        this.f229749c = wealthRemoteDisclaimersMapper;
        this.d = featureToggleInteractor;
    }
}
