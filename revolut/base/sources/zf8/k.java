package zf8;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import te8.r;
import te8.v;
import vkm.q;
import zc0.b0;
import zc0.z;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f321899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f321900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f321901c;
    public final ao.h d;
    public final r e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jla.h f321902g;

    public k(wsg.n walletInteractor, hj8.a juniorProfileInteractor, n juniorAccountStatesProvider, ao.h juniorCoparentInteractor, b basePocketProvider, r juniorCoreSavingsProductInteractor, v juniorPocketsProductInteractor, jla.h productCatalogueInteractor, ag8.f juniorActionsProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(basePocketProvider, "basePocketProvider");
        Intrinsics.checkNotNullParameter(juniorCoreSavingsProductInteractor, "juniorCoreSavingsProductInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(juniorActionsProvider, "juniorActionsProvider");
        this.f321899a = walletInteractor;
        this.f321900b = juniorProfileInteractor;
        this.f321901c = juniorAccountStatesProvider;
        this.d = juniorCoparentInteractor;
        this.e = juniorCoreSavingsProductInteractor;
        this.f = juniorPocketsProductInteractor;
        this.f321902g = productCatalogueInteractor;
    }

    public static efm.r a(k kVar, w4l.k loadingStrategy) {
        kVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ax9.o oVarC = kVar.c(null, loadingStrategy);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarSwitchMapSingle = w.n(cj9.c.A(rd0.e.c(oVarC, gVar), cj9.c.z(null, "observeWalletProfiles")), cj9.c.A(nim.a.w(kVar.f321899a.h0(loadingStrategy), new z(18)), cj9.c.z(null, "observeWalletsWithPockets")), cj9.c.A(rd0.e.c(((nj8.n) kVar.f321900b).k(null, loadingStrategy), gVar), cj9.c.z(null, "observeJuniorBankingProfiles")), cj9.c.A(kVar.f321901c.d(null, loadingStrategy), cj9.c.z(null, "observeAccountUiStates"))).switchMapSingle(new b0(new a(kVar, 1), 25));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        efm.r rVarDistinctUntilChanged = nim.a.w(rVarSwitchMapSingle, new a(kVar, 2)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return cj9.c.A(rVarDistinctUntilChanged, null);
    }

    public final efm.r b(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        efm.r rVarStartWith = nim.a.w(a(this, w4l.h.f294642c), new yui.v(juniorId, 13)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public final ax9.o c(String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new ax9.o(yh5.b.d(rd0.e.b(this.f321899a.d0(str, loadingStrategy)), rd0.e.b(this.d.o())), 25);
    }

    public final wkm.l e() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(new sa6.o(bla.b.b(this.f321902g, ne8.a.f214420c.a()), 16), new z6e.g((Continuation) null, this, 10));
    }
}
