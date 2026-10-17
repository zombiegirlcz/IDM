package f1l;

import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public final /* synthetic */ g A;
    public int B;
    public TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig u;
    public OnboardingPart v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f131289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig f131290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f131291y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, gim.c cVar) {
        super(cVar);
        this.A = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, null, false, this);
    }
}
