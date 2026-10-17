package tr2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockedPaymentsListFlowContract$Input f273671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f273672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f273673c;

    public n(m mVar, BlockedPaymentsListFlowContract$Input blockedPaymentsListFlowContract$Input) {
        this.f273672b = mVar;
        this.f273671a = blockedPaymentsListFlowContract$Input;
        this.f273673c = e4m.b.b(new ta9.f(mVar, this, 14));
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
