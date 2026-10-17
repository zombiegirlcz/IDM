package nfl;

import ael.b1;
import ael.q0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mfl.h;
import mfl.i;
import r10.w;
import ybl.k;
import ybl.l;
import ybl.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f215089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f215090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f215091c;
    public final k d;

    public b(o tradingStatementsInteractor, l tradingConfigInteractor, i inputData, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingStatementsInteractor, "tradingStatementsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f215089a = tradingStatementsInteractor;
        this.f215090b = tradingConfigInteractor;
        this.f215091c = inputData;
        this.d = tradingAccountsInteractor;
    }

    @Override // mfl.h
    public final Flow a() {
        String accountId = this.f215091c.f205027a;
        b1 b1Var = (b1) this.f215089a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w wVar = b1Var.f3600c;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        r rVarR = pd.b.r(rd0.e.c(l.d((l) wVar.f250865a), kotlin.coroutines.g.f186406a), new d3i.k(wVar, accountId, 6));
        h0 h0Var = h0.f322473a;
        return new bo8.w(yh5.b.e(rd0.e.b(ue0.e.p(rVarR, h0Var)), mo3.a.g(rd0.e.n(l.d(this.f215090b), h0Var), null, new n87.r(25), 1), ((q0) this.d).o(accountId, w4l.h.f294642c)), 5);
    }
}
