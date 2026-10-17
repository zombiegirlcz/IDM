package wt9;

import al4.n;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import go.g;
import io3.i;
import io3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import v0f.p;
import w4l.h;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f299846a;

    public e(n creditCardInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        this.f299846a = creditCardInteractor;
    }

    public final Flow a(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        if (fundingSource instanceof PocketSource) {
            io3.d dVar = ((PocketSource) fundingSource).d;
            if (dVar.f163149h == i.INTERNAL && dVar.e == l.CREDIT) {
                return new p(new v0b.b(mo3.a.g(((x2) this.f299846a).l(h.f294642c), null, new wsg.e(20), 1), dVar, 27), 16);
            }
            return new g(Long.valueOf(dVar.i), 2);
        }
        if (fundingSource instanceof SavingsAccount) {
            return new g(Long.valueOf(((SavingsAccount) fundingSource).f92243g.f115082a), 2);
        }
        if (fundingSource instanceof WealthPortfolio) {
            Long l2 = ((WealthPortfolio) fundingSource).f;
            return new g(Long.valueOf(l2 != null ? l2.longValue() : 0L), 2);
        }
        if (fundingSource instanceof DeFiBalanceSource) {
            return new g(Long.valueOf(((DeFiBalanceSource) fundingSource).getF92243g().f115082a), 2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
