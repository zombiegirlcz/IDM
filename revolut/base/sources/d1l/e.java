package d1l;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public TradingOnboardingFeatureConfig.TradingAccountOrType u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f110667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f110668x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f110667w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f110668x |= Integer.MIN_VALUE;
        return this.f110667w.b(this, null, null);
    }
}
