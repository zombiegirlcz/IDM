package uc5;

import cli.y;
import com.revolut.data.model.Data;
import k79.p;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements c {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final utd.a f278995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f278996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f278997r;

    public g(b inputData, utd.a unstakingLockedTransactionsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, f mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(unstakingLockedTransactionsInteractor, "unstakingLockedTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f278995p = unstakingLockedTransactionsInteractor;
        this.f278996q = transactionsInteractor;
        this.f278997r = mra.d.b(this, new a(new Data(null, null, false, 7, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new p(this, this.o.f278989a.f88081a, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f278997r;
    }
}
