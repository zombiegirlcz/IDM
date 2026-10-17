package zkh;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import x8h.v0;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v60.g f323011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f323012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f323013c;
    public final ybl.i d;

    public l0(v60.g recentlyViewedAssetsInteractor, tzg.m wealthAccountsInteractor, xoj.a featuresInteractor, ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(recentlyViewedAssetsInteractor, "recentlyViewedAssetsInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        this.f323011a = recentlyViewedAssetsInteractor;
        this.f323012b = wealthAccountsInteractor;
        this.f323013c = featuresInteractor;
        this.d = productGroupAvailabilityInteractor;
    }

    public final Flow a() {
        return boh.f.e(u0.i(new zfd.e(vkm.q.q(rd0.e.b(((cpj.b) this.f323013c).l(yoj.c.WEALTH_TRADING))), 6), ((v0) this.f323012b).f(), ((ael.h0) this.d).d()), new zhf.f(this, 17));
    }
}
