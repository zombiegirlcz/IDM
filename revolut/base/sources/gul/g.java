package gul;

import kotlin.jvm.internal.Intrinsics;
import vrl.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f146986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f146987b;

    public g(u0 tradingOrdersInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f146986a = tradingOrdersInteractor;
        this.f146987b = featureToggleInteractor;
    }
}
