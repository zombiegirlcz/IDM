package w38;

import com.revolut.core.model.account.AccountId;
import et6.u1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u38.m f294232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g48.r0 f294233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r38.b f294234c;
    public final ang.f d;
    public final wsg.n e;
    public final x79.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wda.r f294235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wa7.m f294236h;
    public final r10.f i;

    public w0(u38.m mapper, g48.r0 jointAccountsInteractor, r38.b jointProductInteractor, ang.f userInteractor, wsg.n walletInteractor, x79.a onHoldAccountInteractor, s jointDiscoverDataSource, wda.r pocketDetailsPreviewSource, wa7.m hiddenAccountsInteractor, r10.f alternativeFeaturesProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(jointDiscoverDataSource, "jointDiscoverDataSource");
        Intrinsics.checkNotNullParameter(pocketDetailsPreviewSource, "pocketDetailsPreviewSource");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(alternativeFeaturesProvider, "alternativeFeaturesProvider");
        this.f294232a = mapper;
        this.f294233b = jointAccountsInteractor;
        this.f294234c = jointProductInteractor;
        this.d = userInteractor;
        this.e = walletInteractor;
        this.f = onHoldAccountInteractor;
        this.f294235g = pocketDetailsPreviewSource;
        this.f294236h = hiddenAccountsInteractor;
        this.i = alternativeFeaturesProvider;
    }

    public static final vkm.d f(w0 w0Var, n38.a aVar, sfe.a aVar2) {
        r38.b bVar = w0Var.f294234c;
        AccountId.Joint accountId = l38.a.c(aVar);
        w4l.k loadingStrategy = c8g.c.C(aVar2);
        r38.l lVar = (r38.l) bVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarA = lVar.k.a(new r38.e(accountId, loadingStrategy));
        AccountId.Joint accountId2 = l38.a.c(aVar);
        w4l.k loadingStrategy2 = c8g.c.C(aVar2);
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        efm.r rVarA2 = lVar.f251222m.a(new r38.e(accountId2, loadingStrategy2));
        cxe.u uVarE = ((d89.g) w0Var.f).e(z79.b.JOINT);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC = rd0.e.c(uVarE, gVar);
        efm.r rVarK = w0Var.d.k(false);
        AccountId.Joint accountId3 = l38.a.c(aVar);
        w4l.k loadingStrategy3 = c8g.c.C(aVar2);
        Intrinsics.checkNotNullParameter(accountId3, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
        efm.r rVarD = lVar.d(new r38.e(accountId3, loadingStrategy3));
        efm.r rVarC2 = rd0.e.c(new ahe.l(w0Var.f294236h.k(), 28), gVar);
        r10.f fVar = w0Var.i;
        efm.r map = rd0.e.c(new u1(nim.a.v(((kge.d) fVar.b).q(new qz9.u(9)), new r0e.i(10)), fVar, 21), gVar).map(new w(1, s0.f294212a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(pd.b.r(mif.a.i(rVarA, rVarA2, rVarC, rVarK, rVarD, rVarC2, map), new v(w0Var, aVar, 1)));
    }

    @Override // pfe.g
    public final Flow a() {
        return new v1(new vq5.w(this, (Continuation) null, 16));
    }

    @Override // pfe.g
    public final boolean b() {
        return true;
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return xam.a.h(new u29.c(this, dataLoadingMode, (Continuation) null, 24), ((r38.l) this.f294234c).f(c8g.c.C(dataLoadingMode)));
    }
}
