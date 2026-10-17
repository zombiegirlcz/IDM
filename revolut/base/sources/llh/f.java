package llh;

import efm.d0;
import kbb.r;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import tzg.m;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements oih.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f196812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final clc.b f196813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xkc.a f196814c;

    public f(m wealthAccountsInteractor, r wealthMainTabProvider, clc.b roboOnboardingEntryCommandFactory, xkc.a roboProductCommsCommandProvider) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthMainTabProvider, "wealthMainTabProvider");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        Intrinsics.checkNotNullParameter(roboProductCommsCommandProvider, "roboProductCommsCommandProvider");
        this.f196812a = wealthAccountsInteractor;
        this.f196813b = roboOnboardingEntryCommandFactory;
        this.f196814c = roboProductCommsCommandProvider;
    }

    public final ufm.i a(oih.f onboardingDestination) {
        Intrinsics.checkNotNullParameter(onboardingDestination, "onboardingDestination");
        d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(nim.a.v(m.c(this.f196812a, null, null, 3), new llb.e(2)), null, null, 3), kotlin.coroutines.g.f186406a).firstOrError();
        v vVar = new v(28, new d(this, 0));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, vVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
