package eed;

import a09.z;
import aed.o;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pcd.u;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements odd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qdd.a f125201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4j.g f125202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qq8.a f125203c;
    public final dqg.g d;
    public final ypg.g e;
    public final r38.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m78.i f125204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ypg.i f125205h;
    public final ryc.a i;

    public n(qdd.a vaultsRepository, b4j.g vaultsUserIdProvider, qq8.a vaultBalanceInteractor, dqg.g vaultsAvailabilityProvider, ypg.g vaultCacheHandler, r38.a vaultCreationHandler, m78.i vaultDeletionHandler, ypg.i vaultTransactionHandler, ryc.a vaultWithdrawalPocketProvider) {
        Intrinsics.checkNotNullParameter(vaultsRepository, "vaultsRepository");
        Intrinsics.checkNotNullParameter(vaultsUserIdProvider, "vaultsUserIdProvider");
        Intrinsics.checkNotNullParameter(vaultBalanceInteractor, "vaultBalanceInteractor");
        Intrinsics.checkNotNullParameter(vaultsAvailabilityProvider, "vaultsAvailabilityProvider");
        Intrinsics.checkNotNullParameter(vaultCacheHandler, "vaultCacheHandler");
        Intrinsics.checkNotNullParameter(vaultCreationHandler, "vaultCreationHandler");
        Intrinsics.checkNotNullParameter(vaultDeletionHandler, "vaultDeletionHandler");
        Intrinsics.checkNotNullParameter(vaultTransactionHandler, "vaultTransactionHandler");
        Intrinsics.checkNotNullParameter(vaultWithdrawalPocketProvider, "vaultWithdrawalPocketProvider");
        this.f125201a = vaultsRepository;
        this.f125202b = vaultsUserIdProvider;
        this.f125203c = vaultBalanceInteractor;
        this.d = vaultsAvailabilityProvider;
        this.e = vaultCacheHandler;
        this.f = vaultCreationHandler;
        this.f125204g = vaultDeletionHandler;
        this.f125205h = vaultTransactionHandler;
        this.i = vaultWithdrawalPocketProvider;
    }

    public final pfm.a b(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "id");
        o oVar = (o) this.f125201a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        pfm.a aVarE = w.g0(oVar.f3546a.deleteVault(vaultId)).e(efm.b.p(i(vaultId, true), this.f125204g.f203347a.l0(true)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final ufm.i c(u vaultCreate) {
        Intrinsics.checkNotNullParameter(vaultCreate, "vaultCreate");
        ufm.i iVar = new ufm.i(new ufm.i(this.f125202b.b(), new ed7.e(new e1.b(this, vaultCreate, 29), 11), 0), new ed7.e(new k(this, 0), 12), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final pfm.a d(String id10, String name, long j2, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        pfm.a aVar = new pfm.a(this.f125202b.b(), new ed7.e(new l(this, id10, name, j2, l2), 5), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final ufm.i e(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        ufm.i iVar = new ufm.i(((o) this.f125201a).d(vaultId), new ed7.e(new dkm.a(1, this.e, ypg.g.class, "handleCachedVault", "handleCachedVault(Lcom/revolut/feature/shared/savings/models/vault/Vault;)Lio/reactivex/Single;", 0, 24), 4), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final r f(w4l.k loadingStrategy, pcd.i filter) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return nim.a.w(h(loadingStrategy, filter), new ebi.i(22));
    }

    public final r g(String id10, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        sfm.b bVar = new sfm.b(this.f125202b.b(), new ed7.e(new i(this, 1, id10, loadingStrategy), 13), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return pd.b.r(bVar, new k(this, 1));
    }

    public final r h(w4l.k loadingStrategy, pcd.i filter) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(filter, "filter");
        sfm.b bVar = new sfm.b(this.f125202b.b(), new ed7.e(new i(this, 0, filter, loadingStrategy), 9), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return pd.b.r(bVar, new j(this, filter, 0));
    }

    public final pfm.a i(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        pfm.a aVar = new pfm.a(this.f125202b.b(), new ed7.e(new z(this, id10, z, 22), 10), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a j(pcd.b accountType, boolean z) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        pfm.a aVar = new pfm.a(this.f125202b.b(), new ed7.e(new z(this, accountType, z, 21), 8), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
