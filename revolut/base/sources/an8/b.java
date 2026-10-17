package an8;

import f01.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te8.r;
import w4l.k;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jab.a f6575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ijb.a f6576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dcd.b f6577c;
    public final r d;
    public final c e;

    public b(jab.a juniorPricingPlansInteractor, ijb.a savingsProductInteractor, dcd.b savingsInterestRateFormatter, r juniorCoreSavingsProductInteractor, c uiKitResources) {
        Intrinsics.checkNotNullParameter(juniorPricingPlansInteractor, "juniorPricingPlansInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(juniorCoreSavingsProductInteractor, "juniorCoreSavingsProductInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f6575a = juniorPricingPlansInteractor;
        this.f6576b = savingsProductInteractor;
        this.f6577c = savingsInterestRateFormatter;
        this.d = juniorCoreSavingsProductInteractor;
        this.e = uiKitResources;
    }

    public final Flow a(String juniorId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new a(this, juniorId, loadingStrategy, (Continuation) null, 0), this.d.b(juniorId, null, loadingStrategy));
    }
}
