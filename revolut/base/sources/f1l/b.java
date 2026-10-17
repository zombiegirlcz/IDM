package f1l;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f131293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131294y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.f131293x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131292w = obj2;
        this.f131294y |= Integer.MIN_VALUE;
        return this.f131293x.b(null, null, false, this);
    }
}
