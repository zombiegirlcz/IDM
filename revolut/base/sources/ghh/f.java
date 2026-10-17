package ghh;

import ael.q0;
import akg.n;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import gd8.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.k;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f143936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7i.i f143937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f143938c;

    public f(ybl.k tradingAccountsInteractor, k7i.i compositeAddMoneySourcePocketCurrencyProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(compositeAddMoneySourcePocketCurrencyProvider, "compositeAddMoneySourcePocketCurrencyProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f143936a = tradingAccountsInteractor;
        this.f143937b = compositeAddMoneySourcePocketCurrencyProvider;
        this.f143938c = featureToggleInteractor;
    }

    @Override // m1h.k
    public final Flow a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new go.g(f0.f322471a, 2);
    }

    @Override // m1h.k
    public final Flow b(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new go.g(zi0.c.P(Boolean.FALSE, false, null, 3), 2);
    }

    @Override // m1h.k
    public final go.g c(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new go.g(zi0.c.P(Boolean.FALSE, false, null, 3), 2);
    }

    @Override // m1h.k
    public final Flow d(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(h(transferSubjectId), new e(this, 1));
    }

    @Override // m1h.k
    public final Flow e(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(u0.m(g(transferSubjectId), h(transferSubjectId)), new j(27));
    }

    @Override // m1h.k
    public final go.g f(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new go.g(zi0.c.P(new m1h.j(null), false, null, 3), 2);
    }

    @Override // m1h.k
    public final Flow g(TransferSubjectId transferSubjectId) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        if (transferSubjectId instanceof TransferSubjectId.CashHolding) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((TransferSubjectId.CashHolding) transferSubjectId).f95656c;
            aVar.getClass();
            flowV = zi0.c.i(xi0.a.a(str));
        } else {
            if (!(transferSubjectId instanceof TransferSubjectId.Portfolio)) {
                throw new NoWhenBranchMatchedException();
            }
            flowV = nim.a.v(h(transferSubjectId), new j(28));
        }
        return boh.f.e(flowV, new e(this, 0));
    }

    public final n h(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        String f95657a = transferSubjectId.getF95657a();
        return nim.a.v(((q0) this.f143936a).o(f95657a, w4l.h.f294642c), new g58.h(f95657a, 11));
    }
}
