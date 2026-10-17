package pgf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreenContract$InputData;
import java.util.Set;
import p12.s0;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsFilterScreenContract$InputData f235914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f235915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f235916c;

    public g(e eVar, f fVar, TransactionsFilterScreenContract$InputData transactionsFilterScreenContract$InputData) {
        this.f235914a = transactionsFilterScreenContract$InputData;
        int i = 29;
        this.f235915b = e4m.b.b(new s0(this, 1, i));
        this.f235916c = e4m.b.b(new s0(this, 0, i));
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
