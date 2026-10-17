package pz4;

import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import efm.r;
import ft3.d1;
import ft3.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import skm.p0;
import sri.m;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f240891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz3.c f240892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final up3.b f240893c;
    public final l35.b d;

    public c(m navigator, rz3.c creditApplicationRouter, up3.b creditFeatureAvailabilityInteractor, l35.b loanInteractor, r35.a loanCommandsFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanCommandsFactory, "loanCommandsFactory");
        this.f240891a = navigator;
        this.f240892b = creditApplicationRouter;
        this.f240893c = creditFeatureAvailabilityInteractor;
        this.d = loanInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        h.Companion.getClass();
        return d.a(deeplink) != null;
    }

    public final i b(String str) {
        r rVarDefer = r.defer(new nc0.a(this, 16));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        d0 d0VarFirstOrError = m70.a.g(rVarDefer, null, new pyb.g(5), 1).firstOrError();
        a aVar = new a(0, new pth.m(this, str, 14));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final i c(efm.b bVar) {
        i iVar = new i(w.o0(p0.f264003c, new pnf.f(this, new d1(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null), null, 26)), new pyc.r(29, new mli.h(bVar, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final pfm.h d(NaviCommand naviCommand) {
        pfm.h hVar = new pfm.h(new phc.d(this, naviCommand, 7), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        if (r13 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pz4.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        h.Companion.getClass();
        h hVarA = d.a(deeplink);
        if (hVarA instanceof e) {
            return c(d(com.revolut.retail.core.navigation.a.c(this.f240892b.f258504c.c(), new FeatureCommand(new ForbearanceFeatureConfig.FinancialDifficultiesFlow(new BackendFlowContract$Configuration(30, null, "FINANCIAL_DIFFICULTY_FLOW"))))));
        }
        if (hVarA instanceof f) {
            pfm.a aVar = new pfm.a(b(((f) hVarA).f240894b.e(4)), new pyc.r(27, new pvc.e(1, this, c.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 5)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            return c(aVar);
        }
        if (!(hVarA instanceof g)) {
            if (hVarA != null) {
                throw new NoWhenBranchMatchedException();
            }
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        pfm.a aVar2 = new pfm.a(b(null), new pyc.r(28, new pvc.e(1, this, c.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 6)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return c(aVar2);
    }
}
