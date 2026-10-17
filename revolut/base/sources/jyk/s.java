package jyk;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingExtendedHoursOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TradingAccount tradingAccount;
        Object next;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(ybl.k.h(uVar.f179505b, TradingAccountType.Gia.f105270a, null, 6), null, null, 3);
            this.u = 1;
            obj2 = vkm.q.z(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        od0.i iVar = (od0.i) obj2;
        if (iVar == null || (tradingAccount = (TradingAccount) iVar.f224257a) == null) {
            return Boolean.FALSE;
        }
        Iterator it8 = tradingAccount.J().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((TradingAccount.Portfolio) next).f105211b == com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE) {
                break;
            }
        }
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) next;
        if (portfolio == null) {
            return Boolean.FALSE;
        }
        sri.m mVar = uVar.f179504a;
        String string = portfolio.f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        mVar.c(new FeatureCommand(new TradingExtendedHoursOnboardingFeatureConfig(null, string)));
        return Boolean.TRUE;
    }
}
