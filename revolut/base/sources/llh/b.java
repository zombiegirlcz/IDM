package llh;

import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kbb.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import skm.p0;
import te0.w;
import tzg.m;
import x8h.v0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements oih.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f196803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj3.a f196804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nlh.b f196805c;

    public b(m wealthAccountsInteractor, sj3.a commoditiesOnboardingStartCommandProvider, r wealthMainTabProvider, nlh.b wealthTradeCommandProvider) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(commoditiesOnboardingStartCommandProvider, "commoditiesOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(wealthMainTabProvider, "wealthMainTabProvider");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        this.f196803a = wealthAccountsInteractor;
        this.f196804b = commoditiesOnboardingStartCommandProvider;
        this.f196805c = wealthTradeCommandProvider;
    }

    public final d0 a(oih.f fVar) {
        if (fVar.equals(oih.a.f225686a)) {
            ufm.b bVarM = d0.m(c());
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        Continuation continuation = null;
        if (fVar instanceof oih.b) {
            ufm.b bVarM2 = d0.m(com.revolut.retail.core.navigation.a.c(c(), null));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (fVar instanceof oih.e) {
            return w.o0(p0.f264003c, new kze.h(this, continuation, 26));
        }
        if (!fVar.equals(oih.c.f225687a)) {
            throw new NoWhenBranchMatchedException();
        }
        ufm.b bVarM3 = d0.m(DummyCommand.f98635a);
        Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
        return bVarM3;
    }

    public final ufm.i b(oih.f onboardingDestination) {
        Intrinsics.checkNotNullParameter(onboardingDestination, "onboardingDestination");
        d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(((v0) this.f196803a).f(), null, null, 3), kotlin.coroutines.g.f186406a).firstOrError();
        int i = 26;
        v vVar = new v(i, new l9k.v(this, onboardingDestination, i));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, vVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final FeatureCommand c() {
        return jbb.a.a(ibb.c.f160141b, null, null, null, 14);
    }
}
