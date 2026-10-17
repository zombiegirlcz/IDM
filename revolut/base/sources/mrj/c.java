package mrj;

import ang.f;
import com.revolut.core.model.account.AccountId;
import efm.d0;
import efm.r;
import ge3.e;
import ja3.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;
import mlk.b0;
import org.joda.time.DateTime;
import te0.w;
import tof.i3;
import ufm.i;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f208152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f208153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge3.a f208154c;
    public final q d;

    public c(e transactionCategorisationInteractor, f userInteractor, ge3.a analyticsPocketsInteractor, q analyticsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        this.f208152a = transactionCategorisationInteractor;
        this.f208153b = userInteractor;
        this.f208154c = analyticsPocketsInteractor;
        this.d = analyticsTransactionsInteractor;
    }

    public final i a(DateTime periodStart, DateTime periodEnd, AccountId accountId) {
        Intrinsics.checkNotNullParameter(periodStart, "periodStart");
        Intrinsics.checkNotNullParameter(periodEnd, "periodEnd");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d0 d0VarB = b(periodStart, periodEnd, accountId, null);
        b0 b0Var = new b0(new mqg.b(12), 19);
        d0VarB.getClass();
        i iVar = new i(d0VarB, b0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final d0 b(DateTime dateTime, DateTime dateTime2, AccountId accountId, i3 i3Var) {
        r rVarG = m70.a.g(rd0.e.c(((le3.f) this.f208154c).e(y0.b(com.revolut.retail.feature.api.a.b(accountId))), g.f186406a), null, new mqg.a(7), 1);
        r rVarN = this.f208153b.d.c().n();
        Intrinsics.checkNotNullExpressionValue(rVarN, "toObservable(...)");
        r rVarFlatMapSingle = w.l(rVarG, rVarN).map(new b0(new d(dateTime, dateTime2, i3Var, accountId, 25), 22)).flatMapSingle(new b0(new moe.c(this, 2, accountId, i3Var), 23));
        sfm.b bVarD = ((le3.b0) this.f208152a).d(accountId, true);
        Intrinsics.h(rVarFlatMapSingle);
        d0 d0VarFirstOrError = w.l(bVarD, rVarFlatMapSingle).map(new b0(new mqg.b(11), 24)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
