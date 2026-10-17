package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements dae.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionsFlowDestination.InputData f159752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f159753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f159754c = this;
    public final e4m.e d;

    public w(o oVar, SubscriptionsFlowDestination.InputData inputData) {
        this.f159753b = oVar;
        this.f159752a = inputData;
        this.d = e4m.b.b(new v(oVar, this));
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
