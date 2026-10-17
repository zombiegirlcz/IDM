package i9e;

import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f159750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f159751b;

    public v(o oVar, w wVar) {
        this.f159750a = oVar;
        this.f159751b = wVar;
    }

    @Override // phm.a
    public final Object get() {
        SubscriptionsFlowDestination.InputData inputData = this.f159751b.f159752a;
        gte.a aVarB = this.f159750a.f159702a.b();
        vc.s.j(aVarB);
        return new com.revolut.feature.subscriptions.impl.flow.a(inputData, aVarB);
    }
}
