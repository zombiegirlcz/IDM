package gq4;

import aii.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function2 {
    public r u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f145558w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f145558w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.f145558w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVar2 = this.f145558w;
            wie.a aVar2 = rVar2.f145562s;
            CreditAccountType.CreditCard creditCard = new CreditAccountType.CreditCard(rVar2.o.f69161a);
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(R$string.credit_card_cancellation_success_withdrawn, null, null, 14), null));
            this.u = rVar2;
            this.v = 1;
            Object objC = aVar2.c(creditCard, action, this);
            if (objC == aVar) {
                return aVar;
            }
            rVar = rVar2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = this.u;
            yhm.o.b(obj2);
        }
        return rVar.C1((u) obj2);
    }
}
