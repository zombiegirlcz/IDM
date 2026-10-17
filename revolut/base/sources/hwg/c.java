package hwg;

import ht1.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import ku1.f0;
import kwg.m;
import rd0.e;
import ybl.k;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f156176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f156177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f156178c;
    public final gte.a d;
    public final tzg.m e;

    public c(xoj.a featuresInteractor, m wealthAnalyticsAllowedProductTypesInteractor, k tradingAccountsInteractor, gte.a featureToggleInteractor, tzg.m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(wealthAnalyticsAllowedProductTypesInteractor, "wealthAnalyticsAllowedProductTypesInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f156176a = featuresInteractor;
        this.f156177b = wealthAnalyticsAllowedProductTypesInteractor;
        this.f156178c = tradingAccountsInteractor;
        this.d = featureToggleInteractor;
        this.e = wealthAccountsInteractor;
    }

    public final jhi.b a(KClass kClass) {
        return mo3.a.e(e.n(nim.a.v(k.k(this.f156178c, null, null, null, 7), new b(kClass, 0)), h0.f322473a), new f0(22), new l(25));
    }
}
