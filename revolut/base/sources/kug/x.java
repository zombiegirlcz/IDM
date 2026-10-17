package kug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function1 {
    public ltg.c u;
    public AccountClosurePreconditionsStatus v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f189813w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b f189814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f189815y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b bVar, String str, q qVar, Continuation continuation) {
        super(1, continuation);
        this.f189814x = bVar;
        this.f189815y = str;
        this.z = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.f189814x, this.f189815y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ltg.c cVar;
        AccountClosurePreconditionsStatus accountClosurePreconditionsStatus;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f189813w;
        com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b bVar = this.f189814x;
        if (i == 0) {
            yhm.o.b(obj2);
            aug.d dVar = (aug.d) bVar.f94939q;
            dVar.getClass();
            String portfolioId = this.f189815y;
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            xtg.e eVar = dVar.f9824a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            vkm.d dVarB = rd0.e.b(zi0.c.q(ue0.e.p(eVar.f308818g.f(portfolioId, true), h0.f322473a), new ltg.c(AccountClosurePreconditionsStatus.Unknown.f94884a, ltg.a.SKIPPED)));
            this.f189813w = 1;
            obj2 = vkm.q.x(dVarB, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accountClosurePreconditionsStatus = this.v;
            cVar = this.u;
            yhm.o.b(obj2);
            return new t(accountClosurePreconditionsStatus, (hel.b) obj2, cVar.f199878b);
        }
        yhm.o.b(obj2);
        cVar = (ltg.c) obj2;
        AccountClosurePreconditionsStatus accountClosurePreconditionsStatus2 = cVar.f199877a;
        TradingAccount tradingAccount = this.z.f189804a;
        this.u = cVar;
        this.v = accountClosurePreconditionsStatus2;
        this.f189813w = 2;
        Enum enumI2 = com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b.I2(bVar, accountClosurePreconditionsStatus2, tradingAccount, this);
        if (enumI2 != aVar) {
            accountClosurePreconditionsStatus = accountClosurePreconditionsStatus2;
            obj2 = enumI2;
            return new t(accountClosurePreconditionsStatus, (hel.b) obj2, cVar.f199878b);
        }
        return aVar;
    }
}
