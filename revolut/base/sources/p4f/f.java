package p4f;

import ael.y;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import k7i.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.j;
import m1h.k;
import os9.t;
import oxd.m;
import p4a.g;
import p4c.u;
import r10.r;
import vkm.q;
import w4l.h;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f232925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f232926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f232927c;

    public f(ybl.d portfolioInteractor, i compositeAddMoneySourcePocketCurrencyProvider, r wealthMarginInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(compositeAddMoneySourcePocketCurrencyProvider, "compositeAddMoneySourcePocketCurrencyProvider");
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
        this.f232925a = portfolioInteractor;
        this.f232926b = compositeAddMoneySourcePocketCurrencyProvider;
        this.f232927c = wealthMarginInteractor;
    }

    @Override // m1h.k
    public final Flow a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return mo3.a.f(q.R(rd0.e.n(boh.f.e(h(transferSubjectId), new t(this, transferSubjectId, 26)), h0.f322473a), new hr4.b(3, 13, null)), new g(3), new p2b.a(3), new g(4));
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
        od0.i.Companion.getClass();
        return zi0.c.i(od0.i.f224256b);
    }

    @Override // m1h.k
    public final Flow e(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(g(transferSubjectId), new u(2));
    }

    @Override // m1h.k
    public final go.g f(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new go.g(zi0.c.P(new j(null), false, null, 3), 2);
    }

    @Override // m1h.k
    public final Flow g(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return boh.f.e(h(transferSubjectId), new m(this, 17));
    }

    public final Flow h(TransferSubjectId transferSubjectId) throws Throwable {
        if (transferSubjectId instanceof TransferSubjectId.CashHolding) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((TransferSubjectId.CashHolding) transferSubjectId).f95656c;
            aVar.getClass();
            return zi0.c.i(xi0.a.a(str));
        }
        if (!(transferSubjectId instanceof TransferSubjectId.Portfolio)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ((TransferSubjectId.Portfolio) transferSubjectId).f95657a;
        hx7.e.n(new IllegalStateException(j6.a.q("No cash holding specified for GIA add Money. Portfolio ", str2)));
        return nim.a.v(((y) this.f232925a).e(str2, h.f294642c), new u(3));
    }
}
