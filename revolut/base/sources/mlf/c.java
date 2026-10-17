package mlf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.ReceiptsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReceiptsScreenContract$InputData f206721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206723c;

    public c(d dVar, ReceiptsScreenContract$InputData receiptsScreenContract$InputData) {
        this.f206721a = receiptsScreenContract$InputData;
        int i = 15;
        this.f206722b = e4m.b.b(new mjl.b(dVar, this, 1, i));
        this.f206723c = e4m.b.b(new mjl.b(dVar, this, 0, i));
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
