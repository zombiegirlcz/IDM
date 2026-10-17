package rpd;

import anf.r;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import rlh.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends oki.h implements c {
    public final IncomeSorterDeleteContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wzi.a f256372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f256373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f256374r;

    public k(m stateMapper, IncomeSorterDeleteContract$InputData inputData, wzi.a incomeSorterInteractor, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.o = inputData;
        this.f256372p = incomeSorterInteractor;
        this.f256373q = transactionsContentProvider;
        this.f256374r = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, nim.a.v(rd0.e.b(((r) this.f256373q).b(AccountId.Personal.f51414a)), new d0(this, 22)), null, new rk9.d(this, null, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f256374r;
    }
}
