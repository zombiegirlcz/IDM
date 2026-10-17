package rmb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm2.s;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f255226a;

    public l(dcd.b savingsInterestRateFormatter, hqb.a savingsUpgradeBannerFactory) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(savingsUpgradeBannerFactory, "savingsUpgradeBannerFactory");
        this.f255226a = savingsInterestRateFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f255215a, new s(this, 4), new rhj.m(22), new rbe.c(domainState, this, 8));
    }
}
