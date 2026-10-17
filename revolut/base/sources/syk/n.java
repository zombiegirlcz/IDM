package syk;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public TradingAccountType u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f266693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TradingOnboardingFeatureConfig f266694x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig, Continuation continuation) {
        super(2, continuation);
        this.f266693w = oVar;
        this.f266694x = tradingOnboardingFeatureConfig;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.f266693w, this.f266694x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        if (r9 == r1) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: syk.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
