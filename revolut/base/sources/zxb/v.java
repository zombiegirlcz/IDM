package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransactionsListScreenContract$InputData f326299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326301c;
    public final e4m.e d;

    public v(e eVar, m mVar, RevPointsTransactionsListScreenContract$InputData revPointsTransactionsListScreenContract$InputData) {
        this.f326300b = eVar;
        this.f326299a = revPointsTransactionsListScreenContract$InputData;
        this.f326301c = e4m.b.b(new z52.q(eVar, mVar, this, 1, 6));
        this.d = e4m.b.b(new z52.q(eVar, mVar, this, 0, 6));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
