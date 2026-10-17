package di8;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public FeatureCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.onboarding.b f114952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114953x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar, gim.c cVar) {
        super(cVar);
        this.f114952w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114953x |= Integer.MIN_VALUE;
        return this.f114952w.L2(this);
    }
}
