package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditSubscriptionFrequencyControllerContract$InputData f159699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f159700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159701c;

    public n(o oVar, EditSubscriptionFrequencyControllerContract$InputData editSubscriptionFrequencyControllerContract$InputData) {
        this.f159699a = editSubscriptionFrequencyControllerContract$InputData;
        int i = 1;
        this.f159700b = e4m.b.b(new l(oVar, this, 1, i));
        this.f159701c = e4m.b.b(new l(oVar, this, 0, i));
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
