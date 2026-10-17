package kkf;

import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o2 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ujf.a f184863n;

    public o2(klf.h0 commonDataSource, klf.m1 juniorDataSource, ujf.a limitExceededBannerProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(limitExceededBannerProvider, "limitExceededBannerProvider");
        this.f184861l = commonDataSource;
        this.f184862m = juniorDataSource;
        this.f184863n = limitExceededBannerProvider;
    }

    public final cmf.p Z2() {
        return new cmf.p(new t38.e(this.f184861l.h(new kjk.x(12)), 24, new iyg.b0(this.f184862m.a(), 27), new ael.l0(3, this, o2.class, "buildBlock", "buildBlock(ZZ)Ljava/util/List;", 4, 15)), new i0(14), zhm.u.c(this), "LimitExceeded");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_LIMIT_EXCEEDED_BANNER_ACTION")) {
            A2(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.TransactionsLimits.f85391a, false, (String) null, true, 22));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
