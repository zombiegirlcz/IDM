package uug;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreen;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ NegativeBalancePromptScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NegativeBalancePromptScreen negativeBalancePromptScreen, Continuation continuation) {
        super(2, continuation);
        this.v = negativeBalancePromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h hVar = (h) this.v.P.getValue();
            this.u = 1;
            j jVar = (j) hVar;
            kel.b bVar = ((f) ((j2) jVar.f283237r.f22677a).getValue()).f283232a;
            if (bVar != null) {
                m4f.b bVar2 = jVar.f283236q;
                String str = jVar.f283235p.f94957a;
                kel.a aVar2 = bVar.f183148a;
                jVar.C1(u0.b(b3f.b.b(bVar2, new TransferSubjectId.CashHolding(str, aVar2.f183145a, aVar2.e, bVar.f183150c), WealthAccountType.SECURITIES, null, new Long(Math.abs(bVar.f183149b.f115082a)), 4)));
            }
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
