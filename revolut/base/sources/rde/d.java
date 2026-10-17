package rde;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreenContract$InputData;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InboundTransactionListScreenContract$InputData f253420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f253421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f253422c;

    public d(h hVar, InboundTransactionListScreenContract$InputData inboundTransactionListScreenContract$InputData) {
        this.f253420a = inboundTransactionListScreenContract$InputData;
        int i = 4;
        this.f253421b = e4m.b.b(new o(hVar, this, 1, i));
        this.f253422c = e4m.b.b(new o(hVar, this, 0, i));
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
