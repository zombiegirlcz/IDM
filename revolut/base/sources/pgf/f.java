package pgf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionListFlowContract$InputData f235911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f235912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f235913c = this;
    public final e4m.e d;
    public final e4m.e e;

    public f(e eVar, TransactionListFlowContract$InputData transactionListFlowContract$InputData) {
        this.f235912b = eVar;
        this.f235911a = transactionListFlowContract$InputData;
        int i = 14;
        this.d = e4m.b.b(new pa6.f(eVar, this, 0, i));
        this.e = e4m.b.b(new pa6.f(eVar, this, 1, i));
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
