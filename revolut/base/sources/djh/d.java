package djh;

import jlh.f;
import kotlin.jvm.internal.Intrinsics;
import r10.t;
import tzg.m;
import ybl.i;
import ybl.l;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements eih.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f115393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f115394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f115395c;
    public final f d;
    public final t e;
    public final gte.a f;

    public d(m wealthAccountsInteractor, l tradingConfigInteractor, i productGroupAvailabilityInteractor, f accountWidgetsPersonalisationInteractor, t juniorIsaEnableProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(accountWidgetsPersonalisationInteractor, "accountWidgetsPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(juniorIsaEnableProvider, "juniorIsaEnableProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f115393a = wealthAccountsInteractor;
        this.f115394b = tradingConfigInteractor;
        this.f115395c = productGroupAvailabilityInteractor;
        this.d = accountWidgetsPersonalisationInteractor;
        this.e = juniorIsaEnableProvider;
        this.f = featureToggleInteractor;
    }
}
