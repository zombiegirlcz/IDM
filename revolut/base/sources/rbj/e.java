package rbj;

import com.revolut.data.model.Data;
import efm.d0;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import r4k.x;
import te0.w;
import tof.a3;
import tof.v6;
import wk5.n;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements fbj.a {

    @NotNull
    public static final d Companion = new d();
    public static final long d = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ibj.a f253126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f253127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd5.c f253128c;

    public e(ibj.a cryptoDepositsRepository, sf0.h serverErrorParser, sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(cryptoDepositsRepository, "cryptoDepositsRepository");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.f253126a = cryptoDepositsRepository;
        this.f253127b = serverErrorParser;
        this.f253128c = cryptoConfigInteractor;
    }

    @Override // fbj.a
    public final r b(wk5.a aVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        r map = this.f253128c.a(false).map(new rbf.c(new x(aVar, currency, 21), 8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // fbj.a
    public final r c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ubj.h hVar = (ubj.h) this.f253126a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return hVar.f278925h.e(Unit.f186387a, loadingStrategy);
    }

    @Override // fbj.a
    public final r d(String pocketId, wk5.a blockchain, boolean z) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        ubj.h hVar = (ubj.h) this.f253126a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        r rVarFlatMap = hVar.f278924g.f(new ubj.d(pocketId, blockchain), z).flatMap(new rbf.c(new c(this, 1), 9));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        r rVarRetryWhen = rVarFlatMap.flatMap(new rbf.c(new r7i.r(26), 10)).retryWhen(new rbf.c(new c(this, 2), 4));
        Intrinsics.checkNotNullExpressionValue(rVarRetryWhen, "retryWhen(...)");
        return rVarRetryWhen;
    }

    @Override // fbj.a
    public final Object e(iyi.j jVar) {
        w4l.f fVar = ((ubj.h) this.f253126a).f278925h;
        int i = jli.h.f175850a;
        Unit unit = Unit.f186387a;
        Object objA = nim.a.a(fVar.g(unit, false), jVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = unit;
        }
        return objA == aVar ? objA : unit;
    }

    @Override // fbj.a
    public final Flow f(a3 transaction, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return (k71.k.z0(transaction) || transaction.f == v6.COMPLETED) ? new go.g(new Data(null, null, false, 7, null), 2) : nim.a.v(rd0.e.b(c(loadingStrategy)), new aqd.g(transaction, 11));
    }

    @Override // fbj.a
    public final efm.b g(String transactionToReturnGroupId, String cryptoAddressId) {
        Intrinsics.checkNotNullParameter(transactionToReturnGroupId, "transactionToReturnGroupId");
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        ubj.h hVar = (ubj.h) this.f253126a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(transactionToReturnGroupId, "transactionToReturnGroupId");
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        pfm.a aVarE = hVar.f278921a.returnDeposit(transactionToReturnGroupId, new tbj.k(cryptoAddressId)).e(hVar.f278925h.g(Unit.f186387a, false));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }

    @Override // fbj.a
    public final d0 validateRestriction() {
        r rVarE = m70.a.e(zi0.c.J(((ubj.h) this.f253126a).i.e(Unit.f186387a, w4l.h.f294642c)), new rbh.j(7), new rbh.j(8));
        n nVar = n.NOT_RESTRICTED;
        d0 d0VarFirst = rVarE.first(nVar);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return ue0.e.F(d0VarFirst, nVar);
    }
}
