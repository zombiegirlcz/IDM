package y4b;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import go.g;
import k7i.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.j;
import m1h.k;
import xv4.o;
import y25.d;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f310857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f310858b;

    public c(ybl.k tradingAccountsInteractor, i compositeAddMoneySourcePocketCurrencyProvider) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(compositeAddMoneySourcePocketCurrencyProvider, "compositeAddMoneySourcePocketCurrencyProvider");
        this.f310857a = tradingAccountsInteractor;
        this.f310858b = compositeAddMoneySourcePocketCurrencyProvider;
    }

    @Override // m1h.k
    public final Flow a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new g(f0.f322471a, 2);
    }

    @Override // m1h.k
    public final Flow b(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new g(zi0.c.P(Boolean.FALSE, false, null, 3), 2);
    }

    @Override // m1h.k
    public final g c(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new g(zi0.c.P(Boolean.FALSE, false, null, 3), 2);
    }

    @Override // m1h.k
    public final Flow d(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        od0.i.Companion.getClass();
        return zi0.c.i(od0.i.f224256b);
    }

    @Override // m1h.k
    public final Flow e(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(g(transferSubjectId), new d(28));
    }

    @Override // m1h.k
    public final g f(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new g(zi0.c.P(new j(null), false, null, 3), 2);
    }

    @Override // m1h.k
    public final Flow g(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return xam.a.h(new o(this, (Continuation) null, 20), nim.a.v(nim.a.v(ybl.k.k(this.f310857a, null, null, null, 7), new d(29)), new b(0)));
    }
}
