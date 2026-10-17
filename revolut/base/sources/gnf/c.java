package gnf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallControllerContract$InputData;
import g2j.k;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingTransactionRecallControllerContract$InputData f144980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f144981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f144982c;

    public c(a aVar, PendingTransactionRecallControllerContract$InputData pendingTransactionRecallControllerContract$InputData) {
        this.f144981b = aVar;
        this.f144980a = pendingTransactionRecallControllerContract$InputData;
        this.f144982c = e4m.b.b(new k(aVar, this, 19));
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
