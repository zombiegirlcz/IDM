package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationNoticeContract$InputData f297512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f297513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f297514c;

    public e(s sVar, n nVar, ActivationNoticeContract$InputData activationNoticeContract$InputData) {
        this.f297513b = sVar;
        this.f297512a = activationNoticeContract$InputData;
        this.f297514c = e4m.b.b(new d(sVar, this, 0));
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
