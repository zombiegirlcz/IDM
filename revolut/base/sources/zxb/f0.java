package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements xki.c, o0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionDetailsPagerFlowContract$InputData f326144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.l f326145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f326146c;
    public final f0 d = this;
    public final e4m.e e;

    public f0(e eVar, TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData, eub.l lVar) {
        this.f326146c = eVar;
        this.f326144a = transactionDetailsPagerFlowContract$InputData;
        this.f326145b = lVar;
        this.e = e4m.b.b(new zu8.r(eVar, this, 21));
    }

    @Override // o0c.b
    public final o0c.a b() {
        return new g0(this.f326146c, this.d, 1);
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
