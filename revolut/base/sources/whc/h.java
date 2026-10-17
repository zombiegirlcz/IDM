package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationInstructionsContract$InputData f297533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f297534b;

    public h(s sVar, n nVar, CancellationInstructionsContract$InputData cancellationInstructionsContract$InputData) {
        this.f297533a = cancellationInstructionsContract$InputData;
        this.f297534b = e4m.b.b(new d(sVar, this, 1));
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
