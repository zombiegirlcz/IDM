package pgf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleTransactionsScreenContract$InputData f235891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f235892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f235893c;

    public d(e eVar, SimpleTransactionsScreenContract$InputData simpleTransactionsScreenContract$InputData) {
        this.f235891a = simpleTransactionsScreenContract$InputData;
        int i = 13;
        this.f235892b = e4m.b.b(new pa6.f(eVar, this, 1, i));
        this.f235893c = e4m.b.b(new pa6.f(eVar, this, 0, i));
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
